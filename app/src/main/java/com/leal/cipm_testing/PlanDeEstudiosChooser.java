package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlanDeEstudiosChooser extends AppCompatActivity {
    Button basicPlanRecommendedBtn,gotomyplan;
    boolean isOnPersonalizedPlan=true;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userid;
    DocumentReference docref,docrefStructure,docrefVocab, docrefSpanishInt,docrefAvailability,docrefConsiousInt
            ,docrefCulture
            ;
     VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    boolean isCustom,nonbasics;
     boolean  isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isInintCons;
     boolean isPlanIntermedioStandard,isPlanBasicRecommended, isCustomPlan100,isListeningPlan,isAdvancedPlan
            ,BasicListeningPlan
            ;

        String[] structureArray= {"", "", "", "",
          "", "", "", "","",""};
    String[] vocabArray= {"", "", "", "",
            "", "", "", "","",""};
    String[] spanishIntArray= {"", "", "", "",
            ""};
    String[] concsiousIntArray= {"", "", "", "",
            "", "", "", "","",""};
    String[] cultureArray=  {"", "", "", "",
            "", "", "", "","",""};
    String[] availavilityArray= {"", "", "", "",
            "", "", "", "","",""};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_de_estudios_chooser);
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();
        userid= mAuth.getCurrentUser().getUid();
        gotomyplan = findViewById(R.id.go2myplanbtn);
        isOnPersonalizedPlan = true;
        basicPlanRecommendedBtn= findViewById(R.id.basicplanbtn);
        docref= db.collection(userid).document("WhereisStudent");
        docrefStructure = db.collection(userid).document("structures");
        docrefVocab= db.collection(userid).document("vocabulary"    );
        docrefSpanishInt=db.collection(userid).document("Interferencias");
        docrefConsiousInt=db.collection(userid).document("Interferencias"  );
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                vmp = documentSnapshot.toObject(VocabModeloPersistencia.class);
                if (vmp == null){
                    gotomyplan.setVisibility(View.GONE);
                }
            }
        });


    }
    public boolean isOnPersonalizedPlanMethod() {
        return isOnPersonalizedPlan;
    }
    public void setOnPersonalizedPlan(boolean onPersonalizedPlan) {
        isOnPersonalizedPlan = onPersonalizedPlan;
    }
    public void getDBState() {
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                vmp = documentSnapshot.toObject(VocabModeloPersistencia.class);
                if (vmp != null) {
                    // Update your UI or state based on vmp being non-null
                    isInVocab = vmp.isInVocab;
                    isInStructure = vmp.isInStructure;
                    isInSpanishInt = vmp.isInSpanishInt;
                    isInTransition = vmp.isInTransition;
                    isInPrager = vmp.isInPrager;
                    isInCulture = vmp.isInCulture;
                    isInintCons = vmp.isInintCon;
                    isPlanIntermedioStandard = vmp.isPlanIntermedioStandard;
                    isPlanBasicRecommended = vmp.isPlanBasicRecommended;
                    isCustomPlan100 = vmp.isCustomPlan;
                    isListeningPlan = vmp.isListeningPlan;
                    isAdvancedPlan = vmp.isAdvancedPlan;
                    BasicListeningPlan = vmp.isListeningPlan;
                } else {


                }
            }
        });
    }


    //--------------------



    //------------------------------

    public void BasicRecomendedPlan(View vista ){


        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Ir a plan basico recomendado ")
//set positive button
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //no hemos decidido a donde mandarlo todavia despues del examen
                        isPlanBasicRecommended =true;

                        Intent intent = new Intent(PlanDeEstudiosChooser.this,Vocabulary2023.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        startActivity(intent);

                    }
                })
//set negative button
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

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
                        BasicListeningPlan=true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this, Cultura2023.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("BasicListeningPlan",BasicListeningPlan);
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


      /*  AlertDialog dialog = builder.create();
        dialog.show();

        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Todavía no esta funcional")
//set positive button
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //no hemos decidido a donde mandarlo todavia despues del examen
                        isCustomPlan100 =true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,Vocabulary2023.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("Custom100Plan", isCustomPlan100);
                        startActivity(intent);

                    }
                })
//set negative button
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();*/
    }
    public void IntermedioStandardPlan(View vista){
        AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("Plan Intermedio Recomendado, Continuar?")
//set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        nonbasics=true;
                        isPlanIntermedioStandard=true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this, Estructura2023.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("isNonBasics",nonbasics);
                        intent.putExtra("isPlanIntermedioStandard",isPlanIntermedioStandard);
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
                        isAdvancedPlan=true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this, ConInt2023.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("AdvancedPlan",isAdvancedPlan);

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
    public void DialogueBox(String message)   {   AlertDialog alertDialog = new AlertDialog.Builder(this)
//set icon
            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
            .setTitle("Definición: ")
//set message
            .setMessage(message)
//set positive button
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {


                }
            })
//set negative button
            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //set what should happen when negative button is clicked

                }
            })
            .show();}
    public void continueMyPlan(View view){
        getDBState();
       gotomyplan.setText("Presioname otravez por favor");
        isCustom=true;
        Intent intent;
        if(isInVocab){
            intent = new Intent(PlanDeEstudiosChooser.this,Vocabulary2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            startActivity(intent);
        }
        if(isInStructure) {
            intent = new Intent(PlanDeEstudiosChooser.this,Estructura2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("isFromListeningDb",isListeningPlan) ;
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);

            startActivity(intent);
        }
        if(isInSpanishInt){
            intent = new Intent(PlanDeEstudiosChooser.this, SpaInt2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("isFromListeningDb",isListeningPlan) ;
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);


            startActivity(intent);
        }

         if(isInTransition){
            intent = new Intent(PlanDeEstudiosChooser.this, Transicion2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("FromListeningDb",isListeningPlan);
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);
            startActivity(intent);

        }
        if(isInPrager){

            intent = new Intent(PlanDeEstudiosChooser.this, Availability2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("FromListeningDb",isListeningPlan);

            startActivity(intent);
        }
        if(isInCulture){
            intent = new Intent(PlanDeEstudiosChooser.this,Cultura2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("FromBasicRecomended",isPlanBasicRecommended);
            intent.putExtra("FromListening",isListeningPlan);
            startActivity(intent);
        }
        if(isInintCons ){
            //esta no esta en la base de datos
            intent = new Intent(PlanDeEstudiosChooser.this,ConInt2023.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);
            intent.putExtra("isFromAdvancedPlanFromDb",isAdvancedPlan);
            startActivity(intent);
        }



    }

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

}