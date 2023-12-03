package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import im.crisp.client.ChatActivity;

public class chooseActivity2 extends AppCompatActivity {
    LinearLayout structures,vocab,listening,spint,conint,cult,trans,dispo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose2);
        structures =findViewById(R.id.gotostructures);
        vocab = findViewById(R.id.gotovocab);
        listening=findViewById(R.id.noDeterminar);
        spint = findViewById(R.id.piensoenesp);
        dispo = findViewById(R.id.gotoavailability);






    }

    public void gotostructures(View vista){
        Intent intent = new Intent(chooseActivity2.this, Estructura2023.class);
        startActivity(intent);

    }
    public void gotoculture(View vista){
        Intent intent = new Intent(chooseActivity2.this,Cultura2023.class);
        startActivity(intent);
    }

    public void gotovocab(View vista){
        Intent intent = new Intent(chooseActivity2.this,Vocabulary2023.class);
        startActivity(intent);
    }
    public void gotospint(View vista){
        Intent intent = new Intent(chooseActivity2.this,SpaInt2023.class);
        startActivity(intent);
    }
    public void gotoconInt(View vista){
        Intent intent = new Intent(chooseActivity2.this,ConInt2023.class);
        startActivity(intent);
    }
    public void disponibilidadgoto(View vista){
        Intent intent = new Intent(chooseActivity2.this,Availability2023.class);
        startActivity(intent);
    }
    public void transgoto(View vista){
        Intent intent = new Intent(chooseActivity2.this,Transicion2023.class);
        startActivity(intent);
    }
}