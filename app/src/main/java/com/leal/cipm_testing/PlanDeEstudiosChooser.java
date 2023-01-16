package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlanDeEstudiosChooser extends AppCompatActivity {
    Button basicPlanRecommendedBtn;
    boolean isOnPersonalizedPlan=true;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userid;
    DocumentReference docref,docrefStructure;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    StudentVocabRestultsModel svrm = new StudentVocabRestultsModel();
    Student studentObject = new Student();
    boolean isCustom,basics,nonbasics;
    boolean  isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isInintCons;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended, isCustomPlan100,isListeningPlan,isAdvancedPlan
            ,BasicListeningPlan
            ;
    boolean psFromDb;

    boolean candb;
    private String[] ArrayWithElementRemoved;
    private int PositionOfElementsLeft;

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
        docrefStructure = db.collection(userid).document("structures");
        getInfoFromDbStructure();

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
                isInintCons= vmp.isInintCon ;
                isPlanIntermedioStandard=vmp.isPlanIntermedioStandard;
                isPlanBasicRecommended=vmp.isPlanBasicRecommended;
                isCustomPlan100 =vmp.isCustomPlan;
                isListeningPlan=vmp.isListeningPlan;
                isAdvancedPlan=vmp.isAdvancedPlan;
                BasicListeningPlan=vmp.isListeningPlan;



            }
        });
    }
    String[] DbResultStructure = new String[99];
    String[] structureArray= new String[99];
    int numbertoSubtract;
    boolean[] temporal= new boolean[99];
    List<String> stringList;

    public void getInfoFromDbStructure(){
        docrefStructure.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                studentObject=  documentSnapshot.toObject(Student.class);
                assert studentObject != null;
                PullsTrueStructuresFromDb();
            }
        });
    }
    private void PullsTrueStructuresFromDb() {
        //asks if the boolean stored at Db that was
        // put there by the test is true or false
        // puts it into an array
        temporal[0]=studentObject.presentesimple;
        temporal[1]=studentObject.presenteContinuo;
        temporal[2]=studentObject.presentePerfecto;
        temporal[3]=studentObject.presentePerfectoContinuo;
        // pasts
        temporal[4]= studentObject.pastsimple;
        temporal[5]=studentObject.pastContinuo;
        temporal[6]=studentObject.pastPerfecto;
        temporal[7]=studentObject.pastPerfectoContinuo;
        //futures
        temporal[8]= studentObject.futuresimple;
        temporal[9]=studentObject.futureContinuo;
        temporal[10]=studentObject.futurePerfecto;
        temporal[11]=studentObject.futurePerfectoContinuo;

        if(temporal[0]){
            structureArray[0]="Present Simple";
        }else {
            structureArray[0]="";

        }
        if(temporal[1]){
            structureArray[1]="Present Continuos";
        }else {
            structureArray[1]="";

        }
        if(temporal[2]){
            structureArray[2]="Present Perfect";
        }else {
            structureArray[2]="";

        }
        if(temporal[3]){
            structureArray[3]="Present Perfect Continuos";
        }else {
            structureArray[3]="";

        }
        //pasados
        if(temporal[4]){
            structureArray[4]="Past Simple";
        }else {
            structureArray[4]="";

        }
        if(temporal[5]){
            structureArray[5]="Past Continuos";
        }else {
            structureArray[5]="";

        }
        if(temporal[6]){
            structureArray[6]="Past Perfect";
        }else {
            structureArray[6]="";

        }
        if(temporal[7]){
            structureArray[7]="Past Perfect Continuos";
        }else {
            structureArray[7]="";

        }

        System.arraycopy(structureArray, 0, DbResultStructure, 0, structureArray.length);
        List<String> list = new ArrayList<String>();

        for(String s : DbResultStructure) {
            if(s != null && s.length() > 0) {
                list.add(s);
            }
        }
        DbResultStructure = list.toArray(new String[list.size()]);

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
                        isPlanBasicRecommended= true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("BasicRecomendedPlan",isPlanBasicRecommended);
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
                        BasicListeningPlan=true;
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,cultura_nuevo.class);
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

                        Intent intent = new Intent(PlanDeEstudiosChooser.this,estructura_nuevo.class);
                        intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                        intent.putExtra("Custom100Plan", isCustomPlan100);
                        intent.putExtra("CustomArrayStructuresFromDb",DbResultStructure);
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
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,estructura_nuevo.class);
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
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,conscisousinterference_nuevo.class);
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
            intent.putExtra("isFromListeningDb",isListeningPlan) ;
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);

            startActivity(intent);
        }else if(isInSpanishInt){
            intent = new Intent(PlanDeEstudiosChooser.this,spa_int_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("isFromListeningDb",isListeningPlan) ;
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);


            startActivity(intent);
        }
        else if(isInTransition){
            intent = new Intent(PlanDeEstudiosChooser.this,Transicion_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("FromListeningDb",isListeningPlan);
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);
            startActivity(intent);

        }else if(isInPrager){
            intent = new Intent(PlanDeEstudiosChooser.this,availability_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("FromListeningDb",isListeningPlan);

            startActivity(intent);
        }else if(isInCulture){
            intent = new Intent(PlanDeEstudiosChooser.this,cultura_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("FromBasicRecomended",isPlanBasicRecommended);
            intent.putExtra("FromListening",isListeningPlan);
            startActivity(intent);
        }else if(isInintCons ){
            //esta no esta en la base de datos
            intent = new Intent(PlanDeEstudiosChooser.this,conscisousinterference_nuevo.class);
            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
            intent.putExtra("isCustom",isCustom);
            intent.putExtra("isFromIntermedioStandarPlan",isPlanIntermedioStandard);
            intent.putExtra("isFromAdvancedPlanFromDb",isAdvancedPlan);
            startActivity(intent);
        }



    }



}