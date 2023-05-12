package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.leal.cipm_testing.screens.Estructura2023;

public class chose_vocab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_vocab);
    }

    public void vocab_old(View vista) {
        Intent intento = new Intent(this, vocabulary.class);
        startActivity(intento);
    }

    public void vocab_new(View vista) {
        Intent intento = new Intent(this, vocabulary_nuevo.class);
        startActivity(intento);
    }

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

    public void chat_maestro(View vista) {
        Intent intento = new Intent(this, Estructura2023.class);
        startActivity(intento);
    }

    public void profile(View vista) {
        Intent intento = new Intent(this, Estructura2023.class);
        startActivity(intento);
    }
}