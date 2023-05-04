package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leal.cipm_testing.components.VideoPlayer;

import java.util.Arrays;
import java.util.Locale;

public class ConInt2023 extends AppCompatActivity {

    String selection;
    TextView textspin1;
    Spinner spin;
    boolean explanation;

    TextToSpeech tts;
    int control;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    private ImageButton botonhablar;
    boolean personalizedPlan,isCustom;
    boolean isInVocab,isInStructure,
            isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,
            isPlanIntermedioFromDb,
            isBasicStructures,isPlanIntermedio;
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    FirebaseAuth mAuth=FirebaseAuth.getInstance();
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp =objetoArrays.consciousInterferenciaGratis;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    int PositionOfSelection;
    int CounterToSubtractSelection=0;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan,AdvancedPlan,AdvancedPlanFromDb;
    Prefs prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_int2023);

        spin = findViewById(R.id.spinuno);
        textspin1 = findViewById(R.id.textspin1);

        explanation = false;

        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        docref= db.collection(userid).document("WhereisStudent");


        prefs= new Prefs(this);
        PremiumAndArrayControler();
    }

    //DB FUNC
    public void PremiumAndArrayControler(){

        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        isPlanIntermedio=reciver.getBooleanExtra("planintermedio",false);
        isPlanIntermedioFromDb=reciver.getBooleanExtra("isFromIntermedioStandarPlan",false);
        AdvancedPlan = reciver.getBooleanExtra("AdvancedPlan",false);
        AdvancedPlanFromDb= reciver.getBooleanExtra("isFromAdvancedPlanFromDb",false);

        if(personalizedPlan){
            if(isCustom){
                if(prefs.getPremium()==1){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rachel, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            /*limpiar_inputs();
                            set_ans();*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if(i==tts.SUCCESS){
                                int lang = tts.setLanguage(Locale.ENGLISH);
                            }
                        }
                    });

                }
                else if(prefs.getPremium()==0){
                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=documentSnapshot.toObject(VocabModeloPersistencia.class);
                            assert vmp != null;
                            temp= vmp.resultArray.toArray(new String[0]);
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(ConInt2023.this, android.R.layout.simple_spinner_item,temp);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    textspin1.setText(selection);

                                   /* limpiar_inputs();
                                    set_ans();*/
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    if(i==tts.SUCCESS){
                                        int lang = tts.setLanguage(Locale.ENGLISH);
                                    }
                                }
                            });
                        }
                    });
                }
            }else{
                if(prefs.getPremium()==1){
                    ArrayAdapter<String> adapter =new  ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            /*limpiar_inputs();
                            set_ans();*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if(i==tts.SUCCESS){
                                int lang = tts.setLanguage(Locale.ENGLISH);
                            }
                        }
                    });

                }
                else if(prefs.getPremium()==0){
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            /*limpiar_inputs();
                            set_ans();*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if(i==tts.SUCCESS){
                                int lang = tts.setLanguage(Locale.ENGLISH);
                            }
                        }
                    });
                }
            }
        }else {
            checkPremiun();
        }

    }
    public void inWhatActivityisTheStudent(){

        isinIntcon = true;
        if(isPlanIntermedio||isPlanIntermedioFromDb){
            isPlanIntermedioStandard=true;
        }

    }
    public  String[] RemoveApprovedElementFromArray(String elementToBeRemoved){
        ArrayWithElementRemoved = new String[temp.length-1];
        for (String s : temp) {
            if (!elementToBeRemoved.equalsIgnoreCase(s)) {
                ArrayWithElementRemoved[PositionOfElementsLeft] = s;
                PositionOfElementsLeft++;
            }
        }
        PositionOfElementsLeft=0;
        return ArrayWithElementRemoved;
    }
    public void sendInfotoDb(){
        inWhatActivityisTheStudent();
        CollectionReference uid = db.collection(userid);
        VocabModeloPersistencia user  = new
                VocabModeloPersistencia(Arrays.asList(temp),isInVocab,
                isInStructure,isInSpanishInt,
                isInCulture,isInPrager,isInTransition,isinIntcon,
                isPlanIntermedioStandard,isPlanBasicRecommended,
                isCustomPlan,isListeningPlan,isAdvancedPlan
        );
        uid.document("WhereisStudent").set(user);

    }
    public void SubtractSelectionAndSendinfoToDb(){
        if(temp.length==1){
            // si queda nada de arrays cambia de vocab a estructura
            isBasicStructures=true;
            if(AdvancedPlan||AdvancedPlanFromDb){
                DialogueBox("Pasar Con Maestro Para Determinar tu Nivel?");

            }else {
                Intent intent = new Intent(ConInt2023.this,MainActivity.class);
                startActivity(intent);
            }

        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
            if(temp.length==1){
                // si queda nada de arrays cambia de vocab a estructura
                isBasicStructures=true;
                if(AdvancedPlan||AdvancedPlanFromDb){
                    DialogueBox("Pasar Con Maestro Para Determinar tu Nivel?");

                }else {
                    Intent intent = new Intent(ConInt2023.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        }
    }
    public void resetCounter(){
        CounterToSubtractSelection=0;
        Toast.makeText(this, "Counter re-set"+String.valueOf(CounterToSubtractSelection), Toast.LENGTH_SHORT).show();

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
                    if(message.equalsIgnoreCase("Pasar Con Maestro Para Determinar tu Nivel?"))
                    { Intent intent = new Intent(ConInt2023.this,chat_maestro.class);
                        startActivity(intent);
                    }else {
                        SubtractSelectionAndSendinfoToDb();
                        resetCounter();
                        PremiumAndArrayControler();
                    }


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

    //EMPIEZA ACTIVIDAD

    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        //USUARIO PREMIUM
        if(prefs.getPremium()==1){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rachel, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(adapter);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spin.getSelectedItem().toString();
                    textspin1.setText(selection);

                    explanation = false;
                    spinnerSelected();
                    /*limpiar_inputs();
                    set_ans();*/
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if(i==tts.SUCCESS){
                        int lang = tts.setLanguage(Locale.ENGLISH);
                    }
                }
            });
            //USUARIO BASICO
        } else if(prefs.getPremium()==0){
            ArrayAdapter<CharSequence > adapter = ArrayAdapter.createFromResource(this, R.array.rachel ,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(adapter);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spin.getSelectedItem().toString();
                    textspin1.setText(selection);


                    explanation = false;
                    spinnerSelected();
                    /*limpiar_inputs();
                    set_ans();*/
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if(i==tts.SUCCESS){
                        int lang = tts.setLanguage(Locale.ENGLISH);
                    }
                }
            });
        }
    }

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected(){
        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);

        VideoPlayer video_player = new VideoPlayer();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        args.putBoolean("explicacion", explanation);
        //args.putString("video", (String) KeyWordsObject[posSele][posKeyword][3]);
        video_player.setArguments(args);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();

        if(selection.equals("Tutorial")){
            Toast.makeText(this, "ESTAS EN TUTORIAL", Toast.LENGTH_SHORT).show();
            /*text_exp.setText("Seleccione una estructura para continuar con la practica");
            lay_btn_empezar.setVisibility(View.GONE);
            txt_exp_est.setVisibility(View.VISIBLE);*/
        }else {
            Toast.makeText(this, "EMPIEZA CONS", Toast.LENGTH_SHORT).show();
            /*lay_btn_empezar.setVisibility(View.VISIBLE);
            videoPlayer();*/
        }
    }
    public void activaSpinner(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }
}