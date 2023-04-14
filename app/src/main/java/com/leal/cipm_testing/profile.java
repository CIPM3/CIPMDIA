package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.leal.cipm_testing.components.BottomNav;
import com.leal.cipm_testing.components.header;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        AgregarFragments();
    }
    //FRAGMENT
    public void AgregarFragments(){
        findViewById(R.id.btn_opc);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //DECLARACION DE COMPONENTES
        BottomNav BottomNav = new BottomNav();

        fragmentTransaction.replace(R.id.btn_opc, BottomNav);
        fragmentTransaction.commit();
    }
}