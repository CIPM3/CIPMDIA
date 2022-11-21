package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyPlan extends AppCompatActivity {
    TextView myPlanTemporaryString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plan);
        Intent reciver = getIntent();
        String recieve= reciver.getStringExtra("key");
        myPlanTemporaryString= findViewById(R.id.myPlanTemp);
        myPlanTemporaryString.setText(recieve);
        
    }
}