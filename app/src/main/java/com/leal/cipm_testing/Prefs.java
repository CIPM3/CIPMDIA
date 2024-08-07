package com.leal.cipm_testing;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private final Context context;
    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    private static final String VISIT_COUNT_KEY = "visit_count";
    private static final String LAST_SEEN_USER_ID_KEY = "last_seen_user_id";

    public Prefs(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setInt(String key, int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    public void setString(String key, String value) {
        editor.putString(key, value);
        editor.apply();
    }

    public void setPremium(int value) {
        editor.putInt("Premium", value);
        editor.apply();
    }

    public void setTypeOfRecycler(int value){
        editor.putInt("typeOfRecycler", value);
        editor.apply();
    }

    public int getTypeOfRecycler(){
        return sharedPreferences.getInt("typeOfRecycler", 0);
    }

    public void setBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean def) {
        return sharedPreferences.getBoolean(key, def);
    }

    public int getInt(String key, int def) {
        return sharedPreferences.getInt(key, def);
    }

    public String getString(String key, String def) {
        return sharedPreferences.getString(key, def);
    }

    public int getPremium() {
        return sharedPreferences.getInt("Premium", 0);
    }

    public void setHasSeenAd(boolean value) {
        editor.putBoolean("hasSeenAd", value);
        editor.apply();
    }

    public boolean getHasSeenAd() {
        return sharedPreferences.getBoolean("hasSeenAd", false); // Default to false if not set
    }

    // Methods to handle visit count
    public void incrementVisitCount() {
        int currentCount = sharedPreferences.getInt(VISIT_COUNT_KEY, 0);
        editor.putInt(VISIT_COUNT_KEY, currentCount + 1);
        editor.apply();
    }

    public int getVisitCount() {
        return sharedPreferences.getInt(VISIT_COUNT_KEY, 0);
    }

    public void resetVisitCount() {
        editor.putInt(VISIT_COUNT_KEY, 0);
        editor.apply();
    }

    // Methods to handle last seen user ID
    public void setLastSeenUserId(String userId) {
        editor.putString(LAST_SEEN_USER_ID_KEY, userId);
        editor.apply();
    }

    public String getLastSeenUserId() {
        return sharedPreferences.getString(LAST_SEEN_USER_ID_KEY, "");
    }
    public void clearUserData() {
        editor.remove(LAST_SEEN_USER_ID_KEY); // Remove the stored user ID
        // Add any other user-specific keys you need to clear
        editor.apply();
    }

}
