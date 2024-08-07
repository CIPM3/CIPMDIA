package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;


public class SplashActivity extends AppCompatActivity {


    Handler handler;
    BillingClient billingClient;
    Prefs prefs;
    FirebaseUser user;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        prefs = new Prefs(this);
        mAuth= FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        String gohstId = "w95Fw4Gr6QWinJZBWcC5iRLRga42";


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                checkSubscription();
                manageVisitCount();
                if(user!=null){
                    if(user.isAnonymous()){
                        Intent intent = new Intent(SplashActivity.this, lessonPlan_RecyclerView.class);
                        intent.putExtra("fromVocab",true);
                        startActivity(intent);
                    }else if(user.getUid().equalsIgnoreCase(gohstId)){
                        deleteAllUserDocuments(user.getUid() );
                        Intent intento = new Intent(SplashActivity.this, Registro2023.class);
                        startActivity(intento);
                    }else {
                        Intent intent = new Intent(SplashActivity.this, lessonPlan_RecyclerView.class);
                        intent.putExtra("fromVocab",true);
                        startActivity(intent);
                    }
                }else {

                    mAuth.signInAnonymously().addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {

                                Intent intent = new Intent(SplashActivity.this, lessonPlan_RecyclerView.class);
                                intent.putExtra("fromVocab",true);
                                startActivity(intent);
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(SplashActivity.this, "something went wrong ", Toast.LENGTH_SHORT).show();
                        }
                    });

                    /*startActivity(new Intent(SplashActivity.this, Login2023.class));
                    finish();*/
                }



            }

        }, 100);




    }

    void checkSubscription() {

        billingClient = BillingClient.newBuilder(this)
                .enablePendingPurchases().setListener((billingResult, list) -> {
                }).build();

        final BillingClient finalBillingClient = billingClient;
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingServiceDisconnected() {

            }
            @Override
            public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                    finalBillingClient.queryPurchasesAsync(BillingClient
                            .SkuType.SUBS, (billingResult1, list) -> {
                        //this "list" will contain all the sub purchases.
                        if (billingResult1.getResponseCode() == BillingClient.BillingResponseCode.OK && list.size() > 0) {
                            //list is more than 0 meaning there is an active subscription available
                            prefs.setPremium(1);




                        } else if (list.size() == 0) {
                            //When the list returns zero, it means there are no active subscription
                            prefs.setPremium(0);



                        }
                    });

                }
            }
        });
    }

    public void deleteAllUserDocuments(String userId) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection(userId)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        QuerySnapshot querySnapshot = task.getResult();
                        if (querySnapshot != null) {
                            for (DocumentSnapshot document : querySnapshot.getDocuments()) {
                                db.collection(userId).document(document.getId()).delete();
                            }
                            deleteUserAccount();  // Proceed to delete user account
                        }
                    } else {
                    }
                });
    }

    public void deleteUserAccount() {
        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            auth.getCurrentUser().delete()
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                        } else {
                        }
                    });
        }
    }
    void manageVisitCount() {
        prefs.incrementVisitCount();
        int visitCount = prefs.getVisitCount();
        if (visitCount == 1) {
        prefs.setHasSeenAd(true);
        Toast.makeText(this, "Aqui si vas a usar tu inglés", Toast.LENGTH_SHORT).show();

    } else if(visitCount == 2){
            prefs.setHasSeenAd(false);
            Toast.makeText(this, "En 5 minutos puedes aprender a usar una estructura", Toast.LENGTH_SHORT).show();
        }
        else if(visitCount == 3){
            prefs.setHasSeenAd(false);
            Toast.makeText(this, "Aprende a usar el vocabulario mas importante primero", Toast.LENGTH_SHORT).show();
        }  else if(visitCount == 4){
            prefs.setHasSeenAd(false);
            Toast.makeText(this, "Practica tu speaking diariamente", Toast.LENGTH_SHORT).show();
        } else if (visitCount >= 5) {
            if(prefs.getPremium()==0){
                prefs.setHasSeenAd(false);
                Toast.makeText(this, "Versión sin anuncios solo 59.99MX al mes", Toast.LENGTH_SHORT).show();
            }

    }
    }


}