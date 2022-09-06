package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.database.FirebaseDatabase;

public class TestResults extends AppCompatActivity {
        BottomNavigationView bottomNavigationViewm;
        structureTestResult str = new structureTestResult();
        VocabTestResult vtr  = new VocabTestResult();
        SpintTestResult sitr = new SpintTestResult();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_results);
        bottomNavigationViewm= findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,str).commit();
        bottomNavigationViewm.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.structureitem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,str).commit();

                        return true;
                    case R.id.vocabitem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,vtr).commit();
                        return true;
                    case R.id.interfspitem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,sitr).commit();
                        return true;
                }
                return false;
            }
        });

    }


}