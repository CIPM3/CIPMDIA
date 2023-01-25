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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PlanDeEstudiosChooser extends AppCompatActivity {
    Button basicPlanRecommendedBtn;
    boolean isOnPersonalizedPlan=true;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userid;
    DocumentReference docref,docrefStructure,docrefVocab;
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
        docrefVocab= db.collection(userid).document("vocabulary"    );
        CallsDbToCreateCustomArraysAfterTesting();
        CreatesCustomStructureArrayAfterTesting();
        CreatesCustomVocabArrayAfterTesting();
        SendCustomStructuresToDb();


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
    String[] DbResultVocab = new String[99];

    String[] structureArray= new String[99];
    String[] vocabArray= new String[99];

    boolean[] TempBoolForStructure = new boolean[99];
    boolean[] TempBoolForVocab = new boolean[99];


    public void CallsDbToCreateCustomArraysAfterTesting(){
        docrefStructure.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                studentObject=  documentSnapshot.toObject(Student.class);
                assert studentObject != null;
                CreatesCustomStructureArrayAfterTesting();
            }
        });
        docrefVocab.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                svrm=documentSnapshot.toObject(StudentVocabRestultsModel.class);
                assert svrm!=null;
                CreatesCustomVocabArrayAfterTesting();
            }
        });


    }
    private void CreatesCustomVocabArrayAfterTesting() {
        TempBoolForVocab[0]=svrm.passed0to50;
        TempBoolForVocab[1]=svrm.passed50to100;
        TempBoolForVocab[2]=svrm.passed100to150;
        TempBoolForVocab[3]=svrm.passed150to200;
        TempBoolForVocab[5]=svrm.passed200to250;
        TempBoolForVocab[6]=svrm.passed250to300;
        TempBoolForVocab[7]=svrm.passed300to350;
        TempBoolForVocab[8]=svrm.passed350to400;
        TempBoolForVocab[9]=svrm.passed400to450;
        TempBoolForVocab[10]=svrm.passed450to500;

        System.arraycopy(vocabArray, 0, DbResultVocab, 0, vocabArray.length);
        List<String> list = new ArrayList<String>();
        for(String s : DbResultVocab) {
            if(s != null && s.length() > 0) {
                list.add(s);
            }
        }
        DbResultVocab = list.toArray(new String[list.size()]);

    }
    private void CreatesCustomStructureArrayAfterTesting() {
        //asks if the boolean stored at Db that was
        // put there by the test is true or false
        // puts it into an array
        TempBoolForStructure[0]=studentObject.presentesimple;
        TempBoolForStructure[1]=studentObject.presenteContinuo;
        TempBoolForStructure[2]=studentObject.presentePerfecto;
        TempBoolForStructure[3]=studentObject.presentePerfectoContinuo;
        // pasts
        TempBoolForStructure[4]= studentObject.pastsimple;
        TempBoolForStructure[5]=studentObject.pastContinuo;
        TempBoolForStructure[6]=studentObject.pastPerfecto;
        TempBoolForStructure[7]=studentObject.pastPerfectoContinuo;
        //futures
        TempBoolForStructure[8]= studentObject.futuresimple;
        TempBoolForStructure[9]=studentObject.futureContinuo;
        TempBoolForStructure[10]=studentObject.futurePerfecto;
        TempBoolForStructure[11]=studentObject.futurePerfectoContinuo;

        TempBoolForStructure[12]= studentObject.wouldsimple;
        TempBoolForStructure[13]=studentObject.wouldContinuo;
        TempBoolForStructure[14]=studentObject.wouldPerfecto;
        TempBoolForStructure[15]=studentObject.wouldPerfectoContinuo;

        TempBoolForStructure[16]= studentObject.couldsimple;
        TempBoolForStructure[17]=studentObject.couldContinuo;
        TempBoolForStructure[18]=studentObject.couldPerfecto;
        TempBoolForStructure[19]=studentObject.couldPerfectoContinuo;

        TempBoolForStructure[20]= studentObject.mightsimple;
        TempBoolForStructure[21]=studentObject.mightContinuo;
        TempBoolForStructure[22]=studentObject.mightPerfecto;
        TempBoolForStructure[23]=studentObject.mightPerfectoContinuo;

        TempBoolForStructure[24]= studentObject.cansimple;
        TempBoolForStructure[25]=studentObject.canContinuo;
        TempBoolForStructure[26]=studentObject.mustsimple;
        TempBoolForStructure[27]=studentObject.mustContinuo;

        TempBoolForStructure[28]= studentObject.shouldsimple;
        TempBoolForStructure[29]=studentObject.shouldContinuo;
        TempBoolForStructure[30]=studentObject.shouldPerfecto;
        TempBoolForStructure[31]=studentObject.shouldPerfectoContinuo;

        TempBoolForStructure[32]= studentObject.wantTo;
        TempBoolForStructure[33]=studentObject.forTo;
        TempBoolForStructure[34]=studentObject.supposedToPresent;
        TempBoolForStructure[35]=studentObject.wishPastPerfect;

        TempBoolForStructure[36]=studentObject.usedTo;
        TempBoolForStructure[37]=studentObject.beUsedTo;

        if(TempBoolForStructure[0]){
            structureArray[0]="Present Simple";
        }else {
            structureArray[0]="";

        }
        if(TempBoolForStructure[1]){
            structureArray[1]="Present Continuos";
        }else {
            structureArray[1]="";

        }
        if(TempBoolForStructure[2]){
            structureArray[2]="Present Perfect";
        }else {
            structureArray[2]="";

        }
        if(TempBoolForStructure[3]){
            structureArray[3]="Present Perfect Continuos";
        }else {
            structureArray[3]="";

        }
        //pasados
        if(TempBoolForStructure[4]){
            structureArray[4]="Past Simple";
        }else {
            structureArray[4]="";

        }
        if(TempBoolForStructure[5]){
            structureArray[5]="Past Continuos";
        }else {
            structureArray[5]="";

        }
        if(TempBoolForStructure[6]){
            structureArray[6]="Past Perfect";
        }else {
            structureArray[6]="";

        }
        if(TempBoolForStructure[7]){
            structureArray[7]="Past Perfect Continuos";
        }else {
            structureArray[7]="";

        }
        //futuros
        if(TempBoolForStructure[8]){
            structureArray[8]="Future Simple";
        }else {
            structureArray[8]="";

        }
        if(TempBoolForStructure[9]){
            structureArray[9]="Future Continuos";
        }else {
            structureArray[9]="";

        }
        if(TempBoolForStructure[10]){
            structureArray[10]="Future Perfect";
        }else {
            structureArray[10]="";

        }
        if(TempBoolForStructure[11]){
            structureArray[11]="Future Perfect Continuos";
        }else {
            structureArray[11]="";

        }
        //modales
        if(TempBoolForStructure[12]){
            structureArray[12]="Would Simple";
        }else {
            structureArray[12]="";

        }
        if(TempBoolForStructure[13]){
            structureArray[13]="Would Continuos";
        }else {
            structureArray[13]="";

        }
        if(TempBoolForStructure[14]){
            structureArray[14]="Would Perfect";
        }else {
            structureArray[14]="";

        }
        if(TempBoolForStructure[15]){
            structureArray[15]="Would Perfect Continuos";
        }else {
            structureArray[15]="";

        }
        //coulds
        if(TempBoolForStructure[16]){
            structureArray[16]="Could Simple";
        }else {
            structureArray[16]="";

        }
        if(TempBoolForStructure[17]){
            structureArray[17]="Could Continuos";
        }else {
            structureArray[17]="";

        }
        if(TempBoolForStructure[18]){
            structureArray[18]="Could Perfect";
        }else {
            structureArray[18]="";

        }
        if(TempBoolForStructure[19]){
            structureArray[19]="Could Perfect Continuos";
        }else {
            structureArray[19]="";

        }
        //mights
        if(TempBoolForStructure[20]){
            structureArray[20]="Might Simple";
        }else {
            structureArray[20]="";

        }
        if(TempBoolForStructure[21]){
            structureArray[21]="Might Continuos";
        }else {
            structureArray[21]="";

        }
        if(TempBoolForStructure[22]){
            structureArray[22]="Might Perfect";
        }else {
            structureArray[22]="";

        }
        if(TempBoolForStructure[23]){
            structureArray[23]="Might Perfect Continuos";
        }else {
            structureArray[23]="";

        }
        //can y must
        if(TempBoolForStructure[24]){
            structureArray[24]="Can Simple";
        }else {
            structureArray[24]="";

        }
        if(TempBoolForStructure[25]){
            structureArray[25]="Can Continuos";
        }else {
            structureArray[25]="";

        }
        if(TempBoolForStructure[26]){
            structureArray[26]="Must Simple";
        }else {
            structureArray[26]="";

        }
        if(TempBoolForStructure[27]){
            structureArray[27]="Must Continuos";
        }else {
            structureArray[27]="";

        }
        //shoulds
        if(TempBoolForStructure[28]){
            structureArray[28]="Should Simple";
        }else {
            structureArray[28]="";

        }
        if(TempBoolForStructure[29]){
            structureArray[29]="Should Continuos";
        }else {
            structureArray[29]="";

        }
        if(TempBoolForStructure[30]){
            structureArray[30]="Should Perfect";
        }else {
            structureArray[30]="";

        }
        if(TempBoolForStructure[31]){
            structureArray[31]="Should Perfect Continuos";
        }else {
            structureArray[31]="";

        }
        //non basics
        if(TempBoolForStructure[32]){
            structureArray[32]="Want To";
        }else {
            structureArray[32]="";

        }
        if(TempBoolForStructure[33]){
            structureArray[33]="For To";
        }else {
            structureArray[33]="";

        }
        if(TempBoolForStructure[34]){
            structureArray[34]="Supposed To Present";
        }else {
            structureArray[34]="";

        }
        if(TempBoolForStructure[35]){
            structureArray[35]="Wish Past Perfect";
        }else {
            structureArray[35]="";
        }
        if(TempBoolForStructure[36]){
            structureArray[30]="Should Perfect";
        }else {
            structureArray[30]="";

        }
        if(TempBoolForStructure[37]){
            structureArray[31]="Should Perfect Continuos";
        }else {
            structureArray[31]="";

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

    private void SendCustomStructuresToDb() {
        CollectionReference uid= db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        user.put("custom100Structure",DbResultStructure);
        user.put("custom100Vocab",DbResultVocab);
        uid.document("CustomArrayLists").set(user);
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