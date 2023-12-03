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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


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

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(user!=null){
                    if(user.isAnonymous()){
                        startActivity(new Intent(SplashActivity.this, Login2023.class));
                        finish();
                    }else{
                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                        finish();
                    }
                }else {
                    startActivity(new Intent(SplashActivity.this, Login2023.class));
                    finish();
                }



            }
        }, 100);

        checkSubscription();

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

}