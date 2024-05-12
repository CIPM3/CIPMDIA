package com.leal.cipm_testing;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import androidx.multidex.MultiDex;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Google Mobile Ads SDK
        MobileAds.initialize(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this); // Enable MultiDex if necessary
    }
}
