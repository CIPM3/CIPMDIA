package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

import java.util.ArrayList;
import java.util.List;

public class Premium2023 extends AppCompatActivity {
    BillingClient billingClient;
    Prefs prefs;
    Button btn_sub_monthly_price;

    LinearLayout b;
    TextView cancelPolicy ;
    String cancelationPolicy;
    Button cancelSuscriptionBtn;
    VideoPlayer video_player = new VideoPlayer();
    String selection = "Premium";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium2023);



        btn_sub_monthly_price = findViewById(R.id.itemSubPrice);
        cancelPolicy = findViewById(R.id.cancelPolicyTv);
        cancelPolicy.setMovementMethod(new android.text.method.ScrollingMovementMethod());

        //Initialize a BillingClient with PurchasesUpdatedListener onCreate method
        cancelSuscriptionBtn=findViewById(R.id.CancelBtn);
        billingClient = BillingClient.newBuilder(this)
                .enablePendingPurchases()
                .setListener(
                        new PurchasesUpdatedListener() {
                            @Override
                            public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
                                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && list != null) {
                                    for (Purchase purchase : list) {
                                        verifySubPurchase(purchase);
                                    }
                                }
                            }
                        }
                ).build();

        //start the connection after initializing the billing client
        establishConnection();
       texts text= new texts();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            cancelPolicy.setText(Html.fromHtml(text.pitchOnPremiumPageWithCancellation, Html.FROM_HTML_MODE_LEGACY));
        } else {
            cancelPolicy.setText(Html.fromHtml(text.pitchOnPremiumPageWithCancellation));
        }

        cancelSuscriptionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoURl("https://support.google.com/googleplay/workflow/9827184?hl=en");

            }
        });
/*
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();

        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);*/


    }
    void establishConnection() {

        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                    // The BillingClient is ready. You can query purchases here.
                    showProducts();
                }
            }

            @Override
            public void onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
                establishConnection();
            }
        });
    }
    void showProducts() {
        List<String> skuList = new ArrayList<>();
        skuList.add("monthly_suscription");
        SkuDetailsParams.Builder params = SkuDetailsParams.newBuilder();
        params.setSkusList(skuList).setType(BillingClient.SkuType.SUBS);
        billingClient.querySkuDetailsAsync(params.build(),
                new SkuDetailsResponseListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onSkuDetailsResponse(@NonNull BillingResult billingResult,
                                                     List<SkuDetails> skuDetailsList) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && skuDetailsList != null) {
                            // Process the result.
                            for (SkuDetails skuDetails : skuDetailsList) {
                                if (skuDetails.getSku().equals("monthly_suscription")) {
                                    //Now update the UI
                                    btn_sub_monthly_price.setText(skuDetails.getPrice() + " Per Month");
                                    btn_sub_monthly_price.setOnClickListener(view -> {
                                        launchPurchaseFlow(skuDetails);
                                    });
                                }
                            }
                        }
                    }
                });
    }
    void launchPurchaseFlow(SkuDetails skuDetails) {

        BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
                .setSkuDetails(skuDetails)
                .build();

        billingClient.launchBillingFlow(Premium2023.this, billingFlowParams);
    }
    void verifySubPurchase(Purchase purchases) {

        AcknowledgePurchaseParams acknowledgePurchaseParams = AcknowledgePurchaseParams
                .newBuilder()
                .setPurchaseToken(purchases.getPurchaseToken())
                .build();

        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() {
            @Override
            public void onAcknowledgePurchaseResponse(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                    //Toast.makeText(SubscriptionActivity.this, "Item Consumed", Toast.LENGTH_SHORT).show();
                    // Handle the success of the consume operation.
                    //user prefs to set premium
                    Toast.makeText(Premium2023.this, "You are a premium user now", Toast.LENGTH_SHORT).show();
                    //updateUser();

                    //Setting premium to 1
                    // 1 - premium
                    //0 - no premium
                    prefs.setPremium(1);
                }
            }
        });

        Log.d("TAG", "Purchase Token: " + purchases.getPurchaseToken());
        Log.d("TAG", "Purchase Time: " + purchases.getPurchaseTime());
        Log.d("TAG", "Purchase OrderID: " + purchases.getOrderId());
    }
    public void goToCancelSuscription(View vista){
    }

    private void gotoURl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
    protected void onResume() {
        super.onResume();
       // video_player.updateFragmentStateStructure(selection);
        billingClient.queryPurchasesAsync(
                BillingClient.SkuType.SUBS,
                new PurchasesResponseListener() {
                    @Override
                    public void onQueryPurchasesResponse(@NonNull BillingResult billingResult, @NonNull List<Purchase> list) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                            for (Purchase purchase : list) {
                                if (purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED && !purchase.isAcknowledged()) {
                                    verifySubPurchase(purchase);
                                    Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
                                    startActivity(intent);

                                }
                            }
                        }
                    }
                }
        );

    }
}