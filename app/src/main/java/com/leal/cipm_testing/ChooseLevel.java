package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import im.crisp.client.ChatActivity;


public class ChooseLevel extends AppCompatActivity {
    TextView eligenivel;
    LinearLayout hablarconmaestro,tomarexamenenapp,nodeterminarnivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        hablarconmaestro =findViewById(R.id.habarConMaestro);
        tomarexamenenapp = findViewById(R.id.determinarEnApp);
        nodeterminarnivel=findViewById(R.id.noDeterminar);






    }

    public void hablarconmaestro(View vista){
        AlertDialog alertDialog = new AlertDialog.Builder(ChooseLevel.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("hablar con maestro para determinar tu nivel")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent = new Intent(ChooseLevel.this, ChatActivity.class);
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
    public void noDeterminar(View vista){
        Intent intent = new Intent(ChooseLevel.this,chooseActivity2.class);
        startActivity(intent);
    }
    boolean isfromtest;
    public void deterimnarenapp(View vista){
        Intent intent = new Intent(ChooseLevel.this,Vocabulary2023.class);
        isfromtest=true;
        intent.putExtra("test", isfromtest);

        startActivity(intent);
    }
}