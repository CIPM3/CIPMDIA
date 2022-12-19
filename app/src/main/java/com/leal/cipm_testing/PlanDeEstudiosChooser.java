package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class PlanDeEstudiosChooser extends AppCompatActivity {
    Button basicPlanRecommendedBtn;
    boolean isOnPersonalizedPlan=true;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userid;
    DocumentReference docref;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    boolean isCustom,basics,nonbasics;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isInintCons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_de_estudios_chooser);
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();
        userid= mAuth.getCurrentUser().getUid();
        isOnPersonalizedPlan = true;
        basicPlanRecommendedBtn= findViewById(R.id.basicplanbtn);
        docref=db.collection(userid).document("WhereisStudent");
    }
    public boolean isOnPersonalizedPlanMethod() {
        return isOnPersonalizedPlan;
    }
    public void setOnPersonalizedPlan(boolean onPersonalizedPlan) {
        isOnPersonalizedPlan = onPersonalizedPlan;
    }

    public void getDBState(){
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                vmp=  documentSnapshot.toObject(VocabModeloPersistencia.class);
                assert vmp != null;
                isInVocab=  vmp.isInVocab;
                isInStructure = vmp.isInStructure  ;
                isInSpanishInt=vmp.isInSpanishInt;
                isInTransition=vmp.isInTransition;
                isInPrager=vmp.isInPrager;
                isInCulture=vmp.isInCulture;
            }
        });
    }

    public void BasicRecomendedPlan(View vista ){
        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Plan Basico Recomendado, Continuar?")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
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
    public void BasicListeningPlan(View vista){
        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Plan Listening Basico, Continuar?")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,cultura_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
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
    public void Custom100Plan(View view){
        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Plan 100% Personalizado, Continuar?")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //no hemos decidido a donde mandarlo todavia despues del examen
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
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
    public void IntermedioStandardPlan(View vista){
        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Plan Basico Recomendado, Continuar?")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        nonbasics=true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,estructura_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("isNonBasics",nonbasics);
                        intent.putExtra("isBasics",basics);
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
    public void AdvancedPlan(View vista ){
        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Plan Avanzado, Continuar?")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,conscisousinterference_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
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

    public void continueMyPlan(View view){
        isCustom=true;
        Intent intent;
        getDBState();
        if(isInVocab){
            intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }else if(isInStructure){
            intent = new Intent(PlanDeEstudiosChooser.this,estructura_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }else if(isInSpanishInt){
            intent = new Intent(PlanDeEstudiosChooser.this,spa_int_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }else if(isInTransition){
            intent = new Intent(PlanDeEstudiosChooser.this,Transicion.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);

        }else if(isInPrager){
            intent = new Intent(PlanDeEstudiosChooser.this,availability_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }else if(isInCulture){
            intent = new Intent(PlanDeEstudiosChooser.this,cultura_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }else if(isInintCons ){

            //esta no esta en la base de datos
            intent = new Intent(PlanDeEstudiosChooser.this,conscisousinterference_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }



    }

}