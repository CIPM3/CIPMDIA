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
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leal.cipm_testing.screens.Availability2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlanDeEstudiosChooser extends AppCompatActivity {
    Button basicPlanRecommendedBtn;
    boolean isOnPersonalizedPlan=true;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userid;
    DocumentReference docref,docrefStructure,docrefVocab, docrefSpanishInt,docrefAvailability,docrefConsiousInt
            ,docrefCulture
            ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    StudentVocabRestultsModel svrm = new StudentVocabRestultsModel();
    Student studentObject = new Student();
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
    SpanishintStudentModel spintstObject= new SpanishintStudentModel();



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
        docrefVocab= db.collection(userid).document("vocabulary"    );
        docrefSpanishInt=db.collection(userid).document("Interferencias");
        docrefConsiousInt=db.collection(userid).document("Interferencias"  );
        CreatesCustomStructureArrayAfterTesting();
        CreatesCustomVocabArrayAfterTesting();
        CreatesCustomerSpanishIntArrayAfterTesting();


    /*SendCustomStructuresToDb(structureArray,vocabArray,
            spanishIntArray,concsiousIntArray,cultureArray,availavilityArray);*/

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

//--------------------
    private void CreatesCustomVocabArrayAfterTesting() {
        docrefVocab.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                svrm=documentSnapshot.toObject(StudentVocabRestultsModel.class);
                assert svrm!=null;
                if(svrm.passed0to50){
                    vocabArray[0]="";
                    Toast.makeText(PlanDeEstudiosChooser.this, "true 0to50", Toast.LENGTH_SHORT).show();
                }else {
                    vocabArray[0]="0 to 50";
                    Toast.makeText(PlanDeEstudiosChooser.this, "false 0to50", Toast.LENGTH_SHORT).show();

                }
                if(svrm.passed50to100){
                    vocabArray[1]="";
                }else {
                    vocabArray[1]="50 to 100";
                }
                if(svrm.passed100to150){
                    vocabArray[2]="";
                }else {
                    vocabArray[2]="100 to 150";
                }
                if(svrm.passed150to200){
                    vocabArray[3]="";
                }else {
                    vocabArray[3]="150 to 200";
                }
                if(svrm.passed200to250){
                    vocabArray[4]="";
                }else {
                    vocabArray[4]="200 to 250";
                }
                if(svrm.passed250to300){
                    vocabArray[5]="";
                }else {
                    vocabArray[5]="250 to 300";
                }
                if(svrm.passed300to350){
                    vocabArray[6]="";
                }else {
                    vocabArray[6]="300 to 350";
                }
                if(svrm.passed350to400){
                    vocabArray[7]="";
                }else {
                    vocabArray[7]="350 to 400";
                }
                if(svrm.passed400to450){
                    vocabArray[8]="";
                }else {
                    vocabArray[8]="400 to 450";
                }
                if(svrm.passed450to500){
                    vocabArray[2]="";
                }else {
                    vocabArray[2]="450 to 500";
                }
                List<String> list = new ArrayList<String>();
                for(String s : vocabArray) {
                    if(s != null && s.length() > 0) {
                        list.add(s);
                    }
                }
                vocabArray = list.toArray(new String[list.size()]);
                SendCustomStructuresToDb(structureArray,vocabArray,
                        spanishIntArray,concsiousIntArray,cultureArray,availavilityArray);

            }
        });


    }
    private void CreatesCustomStructureArrayAfterTesting() {
        docrefStructure.get().
                addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                studentObject=  documentSnapshot.toObject(Student.class);
                assert studentObject != null;
                if(studentObject.presentesimple){
                    structureArray[0]="";
                }else {
                    structureArray[0]="Present Simple";

                }
                if(studentObject.presenteContinuo){
                    structureArray[1]="";
                }else {
                    structureArray[1]="Present Continuos";

                }
                if(studentObject.presentePerfecto){
                    structureArray[2]="";
                }else {
                    structureArray[2]="Present Perfect";

                }
                if(studentObject.presentePerfectoContinuo){
                    structureArray[3]="";
                }else {
                    structureArray[3]="Present Perfect Continuos";
                }
                if(studentObject.pastsimple){
                    structureArray[4]="";
                }else {
                    structureArray[4]="Past Simple";

                }

                List<String> list = new ArrayList<String>();
                for(String s : structureArray) {
                    if(s != null && s.length() > 0) {
                        list.add(s);
                    }
                }

                structureArray = list.toArray(new String[list.size()]);
                SendCustomStructuresToDb(structureArray,vocabArray,
                        spanishIntArray,concsiousIntArray,cultureArray,availavilityArray);
            }
        });

    }
    private void CreatesCustomerSpanishIntArrayAfterTesting(){
        docrefSpanishInt.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                spintstObject=documentSnapshot.toObject(SpanishintStudentModel.class);
                assert spintstObject != null;
                if(spintstObject.porsujeto){
                    spanishIntArray[0]="";
                }else {
                    spanishIntArray[0]="Por Sujeto";
                }
                if(spintstObject.porobjeto){
                    spanishIntArray[1]="";
                }else {
                    spanishIntArray[1]="Por Objeto";
                }
                if(spintstObject.porprep){
                    spanishIntArray[2]="";
                }else {
                    spanishIntArray[2]="Por Preposición";
                }
                if(spintstObject.porrefl){
                    spanishIntArray[3]="";
                }else {
                    spanishIntArray[3]="Interferencia Reflexiva";
                }
                if(spintstObject.porpasiva){
                    spanishIntArray[4]="";
                }else {
                    spanishIntArray[4]="Interferencia Pasiva";
                }

                List<String> list = new ArrayList<String>();
                for(String s : spanishIntArray) {
                    if(s != null && s.length() > 0) {
                        list.add(s);
                    }
                }


                spanishIntArray = list.toArray(new String[list.size()]);
                SendCustomStructuresToDb(structureArray,vocabArray,
                        spanishIntArray,concsiousIntArray,cultureArray,availavilityArray);
            }
        }) ;
    }
    private void CreatesCustomerAvailabilityArrayAfterTesting(){
       docrefConsiousInt.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
           @Override
           public void onSuccess(DocumentSnapshot documentSnapshot) {
                spintstObject=documentSnapshot.toObject(SpanishintStudentModel.class);

           }
       });
    }



    private void SendCustomStructuresToDb(String[] st,String[] vc, String[] spint, String[] conint,
                                          String[] cult, String[ ] disp) {
        CollectionReference uid= db.collection(userid);
        CustomArrayAfterTestingHolder user = new CustomArrayAfterTestingHolder(
                Arrays.asList(structureArray),Arrays.asList(vocabArray),
                Arrays.asList(spanishIntArray),Arrays.asList(concsiousIntArray),
                Arrays.asList(cultureArray),Arrays.asList(availavilityArray)
        );
        uid.document("CustomArrayLists").set(user);
    }
    //------------------------------

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
                        Intent intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
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
            intent = new Intent(PlanDeEstudiosChooser.this, Availability2023.class);
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

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

}