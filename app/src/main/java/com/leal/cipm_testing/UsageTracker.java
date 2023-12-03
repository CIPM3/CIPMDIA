package com.leal.cipm_testing;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import android.util.Log;

public class UsageTracker {

    private static final String USERS_COLLECTION = "users";

    public static void updateUsageStats(UserStatsUpdateListener listener) {

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser == null) {
            Log.d("UsageTracker", "No authenticated user found.");
            // Handle the case where there is no authenticated user
            return;
        }

        final String userId = currentUser.getUid();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String todayString = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

        db.collection(userId).document(USERS_COLLECTION).get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                UserStats userStats = task.getResult().toObject(UserStats.class);
                if (userStats == null) {
                    userStats = new UserStats(todayString, 1);
                    Log.d("UsageTracker", "Creating new user stats.");
                } else if (!todayString.equals(userStats.getLastUsedDate())) {
                    userStats.setLastUsedDate(todayString);
                    userStats.setUsageCount(userStats.getUsageCount() + 1);
                    Log.d("UsageTracker", "Updating existing user stats.");
                } else {
                    Log.d("UsageTracker", "User stats already up-to-date.");
                    listener.onUpdated(userStats);
                    return;
                }

                UserStats finalUserStats = userStats;
                db.collection(userId).document(USERS_COLLECTION)
                        .set(userStats)
                        .addOnSuccessListener(aVoid -> {
                            Log.d("UsageTracker", "User stats successfully written to Firestore.");
                            listener.onUpdated(finalUserStats);
                        })
                        .addOnFailureListener(e -> {
                            Log.w("UsageTracker", "Error writing user stats to Firestore", e);
                            // Optional: notify the listener of the failure
                        });
            } else {
                Log.w("UsageTracker", "Error fetching user stats from Firestore", task.getException());
                // Optional: handle the failure of getting the document
            }
        });
    }

    public interface UserStatsUpdateListener {
        void onUpdated(UserStats userStats);
    }
}

