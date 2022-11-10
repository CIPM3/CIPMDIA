package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ChooseLevel extends AppCompatActivity {
    TextView hablarConMaestro,hacerExamen,estoyEnCero,piensoEnEsp,avanzado,porAhoraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        hablarConMaestro=findViewById(R.id.hablarxmaestrotxt);
        hacerExamen=findViewById(R.id.hacerfullexamentxt);
        estoyEnCero=findViewById(R.id.en0txt);
        piensoEnEsp=findViewById(R.id.piensoenesptxt);
        avanzado=findViewById(R.id.advtxt);
        porAhoraNo=findViewById(R.id.porahoranotxt);

        estoyEnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(ChooseLevel.this)
//set icon
                        .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                        .setTitle("Definición: ")
//set message
                        .setMessage("Este te va a mandar a elegir plan ")
//set positive button
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Intent intent = new Intent(ChooseLevel.this,PlanDeEstudiosChooser.class);
                                startActivity(intent);

                            }
                        })
//set negative button
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //set what should happen when negative button is clicked
                                Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                            }
                        })
                        .show();
            }
        });

    }

}