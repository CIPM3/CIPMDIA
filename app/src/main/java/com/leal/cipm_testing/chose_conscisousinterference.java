package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chose_conscisousinterference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_conscisousinterference);
    }

    public void conscisousinterference_old(View vista) {
        Intent intento = new Intent(this, rachel.class);
        startActivity(intento);
    }

    public void conscisousinterference_new(View vista) {
        Intent intento = new Intent(this, conscisousinterference_nuevo.class);
        startActivity(intento);
    }

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

    public void chat_maestro(View vista) {
        Intent intento = new Intent(this, estructura_nuevo.class);
        startActivity(intento);
    }

    public void profile(View vista) {
        Intent intento = new Intent(this, estructura_nuevo.class);
        startActivity(intento);
    }
}