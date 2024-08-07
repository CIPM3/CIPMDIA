package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leal.cipm_testing.databinding.ActivityNewVocabRecyclerViewBinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
public class Vocabulary2023 extends AppCompatActivity {

    // Firebase
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    DocumentReference scoresVocabDocRef;
    DocumentReference docref;
    DocumentReference docrefVocab;
    CollectionReference uid;
    FirebaseAuth mAuth;
    FirebaseUser user;

    // User data
    String userid;
    Map<String, Object> userdb = new HashMap<>();
    VocabModelo mso = new VocabModelo();
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp = objetoArrays.arrayVocab;
    String[] ArrayWithElementRemoved;
    NewMethods newMeth = new NewMethods();
    NewNounClass nounClassObject = new NewNounClass();
    vocabgen gen = new vocabgen();
    vocabgen vocabGenObject = new vocabgen();
    Prefs prefs;

    // UI elements
    LinearLayout opclay, resplay, opcionMultipleBtn, speakingBtn;
    LinearLayout answer_lay, micro, spanish_lay, input_lay, btn_check_lay;
    LinearLayout btn_emp_lay, btn_emp_lay_nose, btn_cont_lay, txt_exp;
    LinearLayout optionsLayout, keyWordsLayout;
    TextView btncheck, totalTxt, spa_sent, sptx, engtx, textspin1;
    TextView nosetv, palabraclavees, palabraclave;
    TextView tdr, tdrnumero;
    EditText answerinp;
    Spinner spin;
    Button option1Btn, option2Btn, option3Btn, option4Btn, continueOptionBtn;

    // Text-to-Speech
    TextToSpeech ttr;
    TextToSpeech tts;

    // Speech Recognition
    private ActivityResultLauncher<Intent> speechRecognitionLauncher;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    Intent reciver;

    // Timers
    Timer timer;
    TimerTask timerTask;
    int roundedMilliseconds;

    // Scores and results
    double division, result;
    double total, one, two, three, four, five, six, seven, eight, nine, ten;
    double timen = 0.0;
    double prom;
    double secondsWithDecimal;
    double avrScore;
    int counterDB;
    int score = 0;
    int noSeCounter;
    int wrongcounter;
    int counter = 0;
    int dialogueCounter = 0, correctDc = 0;
    int PositionOfElementsLeft = 0;
    boolean v;
    boolean isInVocab, isInStructure, isInSpanishInt, isInCulture, isInPrager, isInTransition, isinIntcon, isBasicStructures;
    boolean personalizedPlan, isCustom, is100Custom, isBasicRecomended, isfromtest;
    boolean istesttrue;
    boolean isFromLesson;
    boolean quieroPracticarSpeaking;
    boolean dificultyChanged;
    boolean isStillOptions;
    String selection;
    String rightAnswer, spRightAnswer;
    String te2;
    String wrongAnswer1, wrongAnswer2, wrongAnswer3, methName;
    String answerinputfinal;
    String genstest, genetest, gene2test;
    String[] classFromLesson;
    String correctAnswer = "";
    String[] placeHolder = new String[]{"Default value"};
    int condicionparapasar;

    // AdMob
    private RewardedAd mRewardedAd;
    VideoPlayer video_player = new VideoPlayer();
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary2023);



        textspin1 = findViewById(R.id.textspin1);
        spin = findViewById(R.id.spinuno);
        micro= findViewById(R.id.respdecir);
        palabraclavees = findViewById(R.id.textextra2);
        palabraclave = findViewById(R.id.textextra);
        palabraclavees.setVisibility(View.GONE);
        palabraclave.setVisibility(View.GONE);

        tdr = findViewById(R.id.TRP);
        tdr.setVisibility(View.GONE);
        tdrnumero = findViewById(R.id.TRPNumber);
        tdrnumero.setVisibility(View.GONE);
        optionsLayout=findViewById(R.id.button_layout);
        sptx = findViewById(R.id.spanishsentence);
        engtx = findViewById(R.id.txteng);
        answerinp = findViewById(R.id.answerinput1);
        answerinp.setVisibility(View.GONE);
        opclay = findViewById(R.id.opclay);

        btncheck = findViewById(R.id.btncheck);
        nosetv= findViewById(R.id.nose);

        spa_sent = findViewById(R.id.spa_sent);
        spa_sent.setVisibility(View.GONE);

        option1Btn= findViewById(R.id.answer_button_1);
        option2Btn= findViewById(R.id.answer_button_2);
        option3Btn= findViewById(R.id.answer_button_3);
        option4Btn= findViewById(R.id.answer_button_4);
        resplay = findViewById(R.id.resplay);
        answer_lay = findViewById(R.id.answer_lay);
        spanish_lay = findViewById(R.id.spanish_lay);
        input_lay = findViewById(R.id.input_lay);
        btn_check_lay = findViewById(R.id.btn_check_lay);
        btn_emp_lay = findViewById(R.id.btn_emp_lay);
        btn_cont_lay = findViewById(R.id.btn_cont_lay);

        btn_emp_lay_nose = findViewById(R.id.btn_emp_lay_nose);
        keyWordsLayout=findViewById(R.id.palabraClabeTxtsLay);
        totalTxt= findViewById(R.id.totalTxtV);
        totalTxt.setVisibility(View.GONE);

        txt_exp = findViewById(R.id.txt_exp);
        mAuth= FirebaseAuth.getInstance();

        userid = mAuth.getCurrentUser().getUid();
        docref = db.collection(userid).document("WhereisStudent");
        docrefVocab = db.collection(userid).document("CustomArrayLists");
        user = mAuth.getCurrentUser();

        opcionMultipleBtn= findViewById(R.id.opcionMultipleBtn);
        opcionMultipleBtn.setVisibility(View.GONE);

        reciver=getIntent();
        istesttrue=reciver.getBooleanExtra("test",false);
        isFromLesson=reciver.getBooleanExtra("type0FromLessonPlan",false);
        classFromLesson=reciver.getStringArrayExtra("class");
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        is100Custom=reciver.getBooleanExtra("Custom100Plan",false);
        isStillOptions=reciver.getBooleanExtra("isStillOptions",false);

        counterDB=0;
        total=9;
        one= 0;
        two =0;
        three=0;
        four=0;
        five=0;
        six=0;
        seven=0;
        eight=0;
        nine=0;
        ten=0;
        noSeCounter=0;




        prefs = new Prefs(Vocabulary2023.this);
        if(prefs.getPremium()==0){
            loadRewardedAd();
        }
        prefs.setHasSeenAd(true);

        condicionparapasar=0;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();

        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);
        timer = new Timer();
        uid = db.collection(userid);

        escribirEnelInputTextResultadodeUtterance();
        PremiumControler();





    }
    private void PremiumControler() {


        if(personalizedPlan){

            if(isCustom){
                if(prefs.getPremium()==1){

                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=documentSnapshot.toObject(VocabModeloPersistencia.class);

                            assert vmp != null;
                            temp=vmp.getResultArray().toArray(new String[0]);
                            ArrayAdapter<CharSequence> adapter;
                            adapter = new ArrayAdapter<>(Vocabulary2023.this, android.R.layout.simple_list_item_1,temp);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    textspin1.setText(selection);
                                    spinnerSelected1();


                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                        }
                    });
                }
            }
            if (prefs.getPremium()==1){

                ArrayAdapter<CharSequence> adapter;

                adapter = new ArrayAdapter<>(Vocabulary2023.this, android.R.layout.simple_list_item_1,temp);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();
                        textspin1.setText(selection);
                        spinnerSelected1();


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

            }
            else{
            }







        }else{
            checkPremiun();
        }

    }
    public void inWhatActivityisTheStudent(){

        isInVocab = true;


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
                VocabModeloPersistencia(Arrays.asList(temp),isInVocab,isInStructure,isInSpanishInt,
                isInCulture,isInPrager,isInTransition,isinIntcon
        );
        uid.document("WhereisStudent").set(user);

    }
    public void SubtractSelectionAndSendinfoToDb(){
        if(temp.length==1){
            // si queda nada de arrays cambia de vocab a estructura
            isBasicStructures=true;
            Intent intent = new Intent(Vocabulary2023.this, Estructura2023.class);
            intent.putExtra("isThePlanPersonalized",personalizedPlan);
            intent.putExtra("basicSctructures",isBasicStructures );
            intent.putExtra("isCustom",false);
            startActivity(intent);
        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumControler();
            sendInfotoDb();
        }
    }
    public void checkPremiun(){

        if(prefs.getPremium()==1){
            if(isFromLesson){
                ArrayAdapter<String> adapter = new ArrayAdapter<>(Vocabulary2023.this, android.R.layout.simple_list_item_1,classFromLesson);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        spinnerSelected1();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }else {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.vocabPremium, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        spinnerSelected1();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }

            //USUARIO BASICO
        } else if (prefs.getPremium()==0){


            if(isFromLesson){
                 ArrayAdapter<String> adapter = new ArrayAdapter<>(Vocabulary2023.this, android.R.layout.simple_list_item_1,classFromLesson);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        spinnerSelected1();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });


            }else {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.vocab  , android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        spinnerSelected1();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }
        }
    }
    public void spinnerSelected1(){
        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);
        if(video_player != null) {
            video_player.updateFragmentStateStructure(selection);

        }


        videoPlayer();

    }
    public void spinnerSelected1(String selectionp){
        selection = selectionp;
        textspin1.setText(selection);
        if(video_player != null) {
            video_player.updateFragmentStateStructure(selection);

        }

        videoPlayer();
    }
    public void videoPlayer(){
        // spa_sent.setText("Lee la frase y escribela en ingles");

        ocultarlay();
    }

    //TOMA TODO EL ESPACIO PARA EL SPINNER 1
    public void activaSpinner1(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }
    //..................................................................................
    public void practice(View v) {
        if(isStillOptions){

            if(quieroPracticarSpeaking){
                dialogueCounter=0;
                correctDc=0;
                tdr.setVisibility(View.GONE);
                tdrnumero.setVisibility(View.GONE );
                btn_emp_lay.setVisibility(View.GONE);
                spanish_lay.setVisibility(View.VISIBLE);
                input_lay.setVisibility(View.VISIBLE);
                btn_check_lay.setVisibility(View.GONE);
                btn_cont_lay.setVisibility(View.VISIBLE);
                if(isFromLesson){
                    btn_emp_lay_nose.setVisibility(View.VISIBLE);
                }

                micro.setVisibility(View.VISIBLE);


                answer_lay.setVisibility(View.GONE);
                resplay.setVisibility(View.GONE);
                answerinp.setBackgroundColor(Color.WHITE);
                opclay.setBackgroundColor(Color.WHITE);

                if(!prefs.getHasSeenAd()  && prefs.getPremium()==0){
                    dialogueShowRewardedAd2("Versión sn anuncios solo 59.99 al mes","Ver anuncio ", "Cipm Premium");

                }else if(!selection.equals("Tutorial")){
                    mostrarlay();
                    switch (selection) {


                        case "Sustantivos":
                            VerbLists nounList = new VerbLists();
                            nounList.randomNounPair();
                            answerinp.setText("");
                            sptx.setText(nounList.gens);
                            engtx.setText(nounList.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;
                        case "Verbos":
                            VerbLists verbLists = new VerbLists();
                            verbLists.randomVerbPair();
                            answerinp.setText("");
                            sptx.setText(verbLists.gens);
                            engtx.setText(verbLists.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;
                        case "Adverbios":
                            VerbLists adverbList = new VerbLists();
                            adverbList.randomAdverbPair();
                            answerinp.setText("");
                            sptx.setText(adverbList.gens);
                            engtx.setText(adverbList.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;
                        case "Adjetivos":
                            VerbLists adjetivoList = new VerbLists();
                            adjetivoList.randomAdjectivePair();
                            answerinp.setText("");
                            sptx.setText(adjetivoList.gens);
                            engtx.setText(adjetivoList.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;
                        case "Preposiciones":
                            VerbLists prepList = new VerbLists();
                            prepList.randomPrepositionPair();
                            answerinp.setText("");
                            sptx.setText(prepList.gens);
                            engtx.setText(prepList.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;


                        case "Function Words":
                            nounClassObject.genPreps();
                            answerinp.setText("");
                            sptx.setText(nounClassObject.gens);
                            engtx.setText(nounClassObject.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;
                        case "Palabras comunes":
                            VerbLists wordList = new VerbLists();
                            wordList.firstOneHundred();
                            answerinp.setText("");
                            sptx.setText(wordList.gens);
                            engtx.setText(wordList.gene);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });

                            break;

                        case "Test":
                            Teststudent();
                            answerinp.setText("");
                            sptx.setText(genstest);
                            engtx.setText(genetest);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {


                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });
                            break;
                        case "0 to 50":
                            newMeth.genCeroToFifty();
                            answerinp.setText("");
                            sptx.setText(newMeth.sp);
                            engtx.setText(newMeth.globalAnswer);
                            hintPalabraclaveNewMeth(newMeth);
                            tts = new TextToSpeech(getApplicationContext(),
                                    new TextToSpeech.OnInitListener() {
                                        @Override
                                        public void onInit(int i) {
                                            Locale spanish = new Locale("es", "MX");
                                            if (i == TextToSpeech.SUCCESS) {
                                                int lang = tts.setLanguage(spanish);
                                                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                    @Override
                                                    public void onStart(String s) {
                                                    }

                                                    @Override
                                                    public void onDone(String utteranceId) {

                                                        if(timerTask == null){
                                                            startTimer();
                                                        }
                                                    }

                                                    @Override
                                                    public void onError(String s) {
                                                    }
                                                });
                                                tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                            }

                                        }
                                    });
                            break;

                        case "50 to 100":
                            gen.fiftohun();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;

                        case "100 to 150":
                            gen.cientociencin();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;
                        case "150 to 200":
                            gen.C150a200();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;
                        case "200 to 250":
                            gen.C200a250();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;
                        case "250 to 300":
                            gen.C250a300();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {

                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;
                        case "300 to 350":
                            gen.C300a350();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;

                        case "350 to 400":
                            gen.C350a400();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;
                        case "400 to 500":
                            gen.C400a500();
                            answerinp.setText("");
                            sptx.setText(gen.gens);
                            engtx.setText(gen.gene);
                            hintPalabraclave(gen);
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        int lang = tts.setLanguage(spanish);
                                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                            @Override
                                            public void onStart(String s) {
                                            }

                                            @Override
                                            public void onDone(String utteranceId) {


                                                if(timerTask == null){
                                                    startTimer();
                                                }
                                            }

                                            @Override
                                            public void onError(String s) {
                                            }
                                        });
                                        tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                    }

                                }
                            });
                            break;

                    }
                }

            }else{
                dialogueCounter=5;
                correctDc=reciver.getIntExtra("correctCounter",0);
                input_lay.setVisibility(View.GONE);
                opclay.setVisibility(View.GONE);
                answer_lay.setVisibility(View.GONE);
                btn_emp_lay.setVisibility(View.GONE);
                btn_check_lay.setVisibility(View.GONE);
                btn_emp_lay_nose.setVisibility(View.GONE);
                btn_cont_lay.setVisibility(View.GONE);
                txt_exp.setVisibility(View.GONE);
                spanish_lay.setVisibility(View.VISIBLE);
                optionsLayout.setVisibility(View.VISIBLE);
                btn_emp_lay_nose.setVisibility(View.GONE);
                practice();

            }



        }else {


            tdr.setVisibility(View.GONE);
            tdrnumero.setVisibility(View.GONE );
            btn_emp_lay.setVisibility(View.GONE);
            spanish_lay.setVisibility(View.VISIBLE);
            input_lay.setVisibility(View.VISIBLE);
            btn_check_lay.setVisibility(View.GONE);
            btn_cont_lay.setVisibility(View.VISIBLE);
            if(isFromLesson){
                btn_emp_lay_nose.setVisibility(View.VISIBLE);
            }
            micro.setVisibility(View.VISIBLE);
            answer_lay.setVisibility(View.GONE);
            resplay.setVisibility(View.GONE);
            answerinp.setBackgroundColor(Color.WHITE);
            opclay.setBackgroundColor(Color.WHITE);

            if(!prefs.getHasSeenAd() && prefs.getPremium()==0){
                    dialogueShowRewardedAd2("Versión premium solo 2 pesitos mexicanos al dia 59.99mx al mes ","Ver anuncio ", "Cipm Premium");

            }else if(!selection.equals("Tutorial")){
                mostrarlay();
                switch (selection) {

                    case "Sustantivos":
                        VerbLists nounList = new VerbLists();
                        nounList.randomNounPair();
                        answerinp.setText("");
                        sptx.setText(nounList.gens);
                        engtx.setText(nounList.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;
                    case "Verbos":
                        VerbLists verbLists = new VerbLists();
                        verbLists.randomVerbPair();
                        answerinp.setText("");
                        sptx.setText(verbLists.gens);
                        engtx.setText(verbLists.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;
                    case "Adverbios":
                        VerbLists adverbList = new VerbLists();
                        adverbList.randomAdverbPair();
                        answerinp.setText("");
                        sptx.setText(adverbList.gens);
                        engtx.setText(adverbList.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;
                    case "Adjetivos":
                        VerbLists adjetivoList = new VerbLists();
                        adjetivoList.randomAdjectivePair();
                        answerinp.setText("");
                        sptx.setText(adjetivoList.gens);
                        engtx.setText(adjetivoList.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;
                    case "Preposiciones":
                        VerbLists prepList = new VerbLists();
                        prepList.randomPrepositionPair();
                        answerinp.setText("");
                        sptx.setText(prepList.gens);
                        engtx.setText(prepList.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;


                    case "Function Words":
                        nounClassObject.genPreps();
                        answerinp.setText("");
                        sptx.setText(nounClassObject.gens);
                        engtx.setText(nounClassObject.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;
                    case "Palabras comunes":
                        VerbLists wordList = new VerbLists();
                        wordList.firstOneHundred();
                        answerinp.setText("");
                        sptx.setText(wordList.gens);
                        engtx.setText(wordList.gene);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });

                        break;

                    case "Test":
                        Teststudent();
                        answerinp.setText("");
                        sptx.setText(genstest);
                        engtx.setText(genetest);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {


                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías    " + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });
                        break;
                    case "0 to 50":
                        newMeth.genCeroToFifty();
                        answerinp.setText("");
                        sptx.setText(newMeth.sp);
                        engtx.setText(newMeth.globalAnswer);
                        hintPalabraclaveNewMeth(newMeth);
                        tts = new TextToSpeech(getApplicationContext(),
                                new TextToSpeech.OnInitListener() {
                                    @Override
                                    public void onInit(int i) {
                                        Locale spanish = new Locale("es", "MX");
                                        if (i == TextToSpeech.SUCCESS) {
                                            int lang = tts.setLanguage(spanish);
                                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                                @Override
                                                public void onStart(String s) {
                                                }

                                                @Override
                                                public void onDone(String utteranceId) {

                                                    if(timerTask == null){
                                                        startTimer();
                                                    }
                                                }

                                                @Override
                                                public void onError(String s) {
                                                }
                                            });
                                            tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                        }

                                    }
                                });
                        break;

                    case "50 to 100":
                        gen.fiftohun();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;

                    case "100 to 150":
                        gen.cientociencin();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;
                    case "150 to 200":
                        gen.C150a200();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;
                    case "200 to 250":
                        gen.C200a250();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;
                    case "250 to 300":
                        gen.C250a300();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;
                    case "300 to 350":
                        gen.C300a350();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;

                    case "350 to 400":
                        gen.C350a400();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;
                    case "400 to 500":
                        gen.C400a500();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);
                        hintPalabraclave(gen);
                        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tts.setLanguage(spanish);
                                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {


                                            if(timerTask == null){
                                                startTimer();
                                            }
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    tts.speak("como dirías" + sptx.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                        break;

                }
            }

        }




    }
    public void practice() {
        keyWordsLayout.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.GONE);
        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE );
        btn_emp_lay.setVisibility(View.GONE);
        if(isFromLesson){
            btn_emp_lay_nose.setVisibility(View.GONE);
        }
        if(!prefs.getHasSeenAd() && prefs.getPremium()==0){
            if(!dificultyChanged){
                dialogueShowRewardedAd2("Intenta Cipm premium por un mes no te arrepentirás","Ver anuncio ", "Cipm Premium");

            }else {
                dialogueShowRewardedAd3("59.99 al mes Versión sin anuncios ","Ver anuncio ", "Cipm Premium");

            }


        }else if(!selection.equals("Tutorial")){
            vocabgen cero = new vocabgen();
            VerbLists verbs= new VerbLists();
            switch (selection) {
                case "Sustantivos":
                    verbs.randomNounPair();
                    wrongAnswer1= verbs.gene;
                    verbs.randomNounPair();
                    wrongAnswer2= verbs.gene;
                    verbs.randomNounPair();
                    wrongAnswer3= verbs.gene;
                    verbs.randomNounPair();
                    rightAnswer= verbs.gene;
                    spRightAnswer=verbs.gens;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);

                    break;
                case "Verbos":
                    verbs.randomVerbPair();
                    wrongAnswer1= verbs.gene;
                    verbs.randomVerbPair();
                    wrongAnswer2= verbs.gene;
                    verbs.randomVerbPair();
                    wrongAnswer3= verbs.gene;
                    verbs.randomVerbPair();
                    rightAnswer= verbs.gene;
                    spRightAnswer=verbs.gens;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);

                    break;

                case "Adverbios":
                    verbs.randomAdverbPair();
                    wrongAnswer1= verbs.gene;
                    verbs.randomAdverbPair();
                    wrongAnswer2= verbs.gene;
                    verbs.randomAdverbPair();
                    wrongAnswer3= verbs.gene;
                    verbs.randomAdverbPair();
                    rightAnswer= verbs.gene;
                    spRightAnswer=verbs.gens;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);

                    break;

                case "Adjetivos":
                    verbs.randomAdjectivePair();
                    wrongAnswer1= verbs.gene;
                    verbs.randomAdjectivePair();
                    wrongAnswer2= verbs.gene;
                    verbs.randomAdjectivePair();
                    wrongAnswer3= verbs.gene;
                    verbs.randomAdjectivePair();
                    rightAnswer= verbs.gene;
                    spRightAnswer=verbs.gens;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;

                case "Preposiciones":
                    verbs.randomPrepositionPair();
                    wrongAnswer1= verbs.gene;
                    verbs.randomPrepositionPair();
                    wrongAnswer2= verbs.gene;
                    verbs.randomPrepositionPair();
                    wrongAnswer3= verbs.gene;
                    verbs.randomPrepositionPair();
                    rightAnswer= verbs.gene;
                    spRightAnswer=verbs.gens;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;

                case "Function Words":
                    nounClassObject.genPreps();
                    wrongAnswer1= nounClassObject.gene;
                    nounClassObject.genPreps();
                    wrongAnswer2= nounClassObject.gene;
                    nounClassObject.genPreps();
                    wrongAnswer3=nounClassObject.gene;
                    methName = "genPreps";
                    setTextToButtonsHandleOnClick(nounClassObject,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "Palabras comunes":
                    verbs.firstOneHundred();
                    wrongAnswer1= verbs.gene;
                    verbs.firstOneHundred();
                    wrongAnswer2= verbs.gene;
                    verbs.firstOneHundred();
                    wrongAnswer3= verbs.gene;
                    verbs.firstOneHundred();
                    rightAnswer= verbs.gene;
                    spRightAnswer=verbs.gens;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);

                    break;
                case "0 to 50":
                    int rv = (int)(Math.random()*2);
                    switch (rv){
                        case 0:
                            newMeth.genCeroToFifty();
                            wrongAnswer1= newMeth.globalAnswer;
                            newMeth.genCeroToFifty();
                            wrongAnswer2= newMeth.globalAnswer;
                            newMeth.genCeroToFifty();
                            wrongAnswer3= newMeth.globalAnswer;
                            methName = "genCeroToFifty";
                            setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                            break;

                        case 1:
                            cero.gencerotofifty();
                            wrongAnswer1= cero.gene;
                            cero.gencerotofifty();
                            wrongAnswer2= cero.gene;
                            cero.gencerotofifty();
                            wrongAnswer3= cero.gene;
                            cero.gencerotofifty();
                            rightAnswer= cero.gene;
                            spRightAnswer=cero.gens;
                            setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                            break;
                    }

                    break;
                case "50 to 100":
                    vocabGenObject.fiftohun();
                    wrongAnswer2= vocabGenObject.gene;
                    vocabGenObject.fiftohun();
                    wrongAnswer3= vocabGenObject.gene;
                    vocabGenObject.fiftohun();
                    wrongAnswer1= vocabGenObject.gene;
                    vocabGenObject.fiftohun();
                    rightAnswer= vocabGenObject.gene;
                    spRightAnswer= vocabGenObject.gens;;
                    setTextToButtonsHandleOnClick(spRightAnswer,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3);

                    break;
                case "100 to 150":
                    newMeth.gen100to150();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen100to150();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen100to150();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen100to150";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "150 to 200":
                    newMeth.gen150to200();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen150to200();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen150to200();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen150to200";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "200 to 250":
                    newMeth.gen200to250();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen200to250();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen200to250();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen200to250";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "250 to 300":
                    newMeth.gen250to300();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen250to300();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen250to300();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen250to300";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "300 to 350":
                    newMeth.gen300to350();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen300to350();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen300to350();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen300to350";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "350 to 400":
                    newMeth.gen350to400();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen350to400();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen350to400();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen350to400";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;
                case "400 to 500":
                    newMeth.gen400to500();
                    wrongAnswer1= newMeth.globalAnswer;
                    newMeth.gen400to500();
                    wrongAnswer2= newMeth.globalAnswer;
                    newMeth.gen400to500();
                    wrongAnswer3= newMeth.globalAnswer;
                    methName = "gen400to500";
                    setTextToButtonsHandleOnClick(newMeth,methName,wrongAnswer1,wrongAnswer2,wrongAnswer3);
                    break;

            }
        }
    }

    public void nose(View vista){


        if (isfromtest){
            if(nosetv.getText().toString().trim().equalsIgnoreCase("ir a elegir plan")){
                Toast.makeText(this, "ve a elegir plan función solo para usuario premium", Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(this, "usuario  no sabe respuesta "+String.valueOf(wrongcounter), Toast.LENGTH_SHORT).show();

            }
            if(wrongcounter>1){
                selection="Nivel Basico";
                nosetv.setText("ir a elegir plan");
                spinnerSelected1(selection);

                btn_emp_lay.setVisibility(View.GONE);
                btn_cont_lay.setVisibility(View.GONE);
            }
            if (wrongcounter>1){
                if(prefs.getPremium()==0){
                    Toast.makeText(this, " solo disponible para  premium- solo $50 pesos al mes cancela cuando quieras", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(Vocabulary2023.this, PlanDeEstudiosChooser.class);
                    startActivity(intent);

                }

            }
            wrongcounter++;
        }else {
            noSeCounter++;
            checkanswer(noSeCounter);

        }




    }
    //VALIDACIONES DE TEXTO Y AUDIO
    public void  dialogueShowRewardedAd(String text, String buttonyes, String buttonno){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);

        textView.setText(Html.fromHtml(text));
        textView.setTextSize(18); // Set the text size to 18sp
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(text);

        AlertDialog dialog = builder.create();

// Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonyes);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable.setColor(Color.BLUE); // Set the background color
        button.setBackground(drawable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prefs.setHasSeenAd(true);
                showRewardedAd2();


            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.YELLOW); // Set the background color
        button2.setText(buttonno);
        button2.setTextColor(Color.BLACK);
        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setHasSeenAd(true);
                Intent intento = new Intent(Vocabulary2023.this,Premium2023.class);
                startActivity(intento);

            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                // Code to execute when the dialog is cancelled (e.g., user clicks outside the dialog)
                prefs.setHasSeenAd(false);

            }
        });

        dialog.show();

    }
    public void  dialogueShowRewardedAd2(String text, String buttonyes, String buttonno){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);

        textView.setText(Html.fromHtml(text));
        textView.setTextSize(18); // Set the text size to 18sp
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(text);

        AlertDialog dialog = builder.create();

// Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonyes);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable.setColor(Color.BLUE); // Set the background color
        button.setBackground(drawable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setHasSeenAd(true);
                showRewardedAd2();



            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.YELLOW); // Set the background color
        button2.setText(buttonno);
        button2.setTextColor(Color.BLACK);
        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                prefs.setHasSeenAd(true);

                Intent intento = new Intent(Vocabulary2023.this,Premium2023.class);
                startActivity(intento);
            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                // Code to execute when the dialog is cancelled (e.g., user clicks outside the dialog)
                prefs.setHasSeenAd(false);

            }
        });

        dialog.show();

    }
    public void  dialogueShowRewardedAd3(String text, String buttonyes, String buttonno){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);

        textView.setText(Html.fromHtml(text));
        textView.setTextSize(18); // Set the text size to 18sp
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(text);

        AlertDialog dialog = builder.create();

// Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonyes);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable.setColor(Color.BLUE); // Set the background color
        button.setBackground(drawable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setHasSeenAd(true);
                showRewardedAd3();



            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.YELLOW); // Set the background color
        button2.setText(buttonno);
        button2.setTextColor(Color.BLACK);
        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                prefs.setHasSeenAd(true);
                Intent intento = new Intent(Vocabulary2023.this,Premium2023.class);
                startActivity(intento);
            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                // Code to execute when the dialog is cancelled (e.g., user clicks outside the dialog)
                prefs.setHasSeenAd(false);

            }
        });

        dialog.show();

    }
    public void dialogueMasFacil(String text, String buttonYes, String buttonNo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);
        textView.setText(Html.fromHtml(text));
        textView.setTextSize(18); // Set the text size to 18sp
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(text);
        builder.setCancelable(false);
        AlertDialog dialog = builder.create();

        // Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonYes);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable.setColor(Color.BLUE); // Set the background color
        button.setBackground(drawable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ensure this runs on the UI thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        dificultyChanged=true;
                        quieroPracticarSpeaking=false;

                        dialog.dismiss();
                        hideViewsBelowSpanishLay();
                    }
                });
            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);
        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.YELLOW); // Set the background color
        button2.setText(buttonNo);
        button2.setTextColor(Color.BLACK);
        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ensure this runs on the UI thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        dialog.dismiss();
                    }
                });
            }
        });

        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                // Code to execute when the dialog is cancelled (e.g., user clicks outside the dialog)
                prefs.setHasSeenAd(false);

            }
        });

        dialog.show();
    }
    private void showDialog(Button btn, String message, String buttonText, String correctAnswer, boolean isCorrect,int counterT) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.continuedialoguebox, null);

        builder.setView(dialogView);
        TextView counter = dialogView.findViewById(R.id.counterTv);
        TextView dialogMessage = dialogView.findViewById(R.id.dialog_message);
        dialogMessage.setText(message);
        counter.setText(counterT+"/10");

        Button dialogButton = dialogView.findViewById(R.id.button);
        dialogButton.setText(buttonText);

        AlertDialog alertDialog = builder.create();

        // Make the dialog non-cancelable by clicking outside or pressing the back button
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);


        dialogButton.setOnClickListener(v -> {
            alertDialog.dismiss();
            practice();
            btn.setBackgroundResource(R.drawable.borde_azul);
        });

        // Set a listener to handle the case when the dialog is dismissed
        alertDialog.setOnDismissListener(dialog -> {
            practice();
            btn.setBackgroundResource(R.drawable.borde_azul);
        });

        alertDialog.show();
    }
    private void showDialogChangeDif(Button btn, String message, String buttonText1, String buttonText2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.nextdificultydialoguebox, null);

        builder.setView(dialogView);
        TextView dialogMessage = dialogView.findViewById(R.id.dialog_message);
        dialogMessage.setText(message);

        Button dialogButton1 = dialogView.findViewById(R.id.button1);

        Button dialogButton2 = dialogView.findViewById(R.id.button2);

        dialogButton1.setText(buttonText1);
        dialogButton2.setText(buttonText2);

        AlertDialog alertDialog = builder.create();

        // Make the dialog non-cancelable by clicking outside or pressing the back button
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);

        dialogButton1.setOnClickListener(v -> {

            alertDialog.dismiss();
            practice();
            btn.setBackgroundResource(R.drawable.borde_azul);

        });

        dialogButton2.setOnClickListener(v -> {


            quieroPracticarSpeaking=true;
            dificultyChanged=false;
            reverseMultipleChoiceViewSetUp();
            alertDialog.dismiss();
            // practice();

        });

        // Set a listener to handle the case when the dialog is dismissed
        alertDialog.setOnDismissListener(dialog -> {
            btn.setBackgroundResource(R.drawable.borde_azul);
        });

        alertDialog.show();
    }
    private void showDialogueWithAd() {
        if(prefs.getPremium()==0){
            dialogueShowRewardedAd("Ver anuncio para desbloquear clase? 30 segundos o puedes adquirir la versión premium solo 59.99mx al mes","Ver Anuncio","Cipm Premium");

        }
    }
    //.................................................
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();


        //ca-app-pub-3940256099942544/5224354917 test ad
        //  ca-app-pub-9126282069959189/3406127387 real ad
        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917", adRequest,
                new RewardedAdLoadCallback() {
                    @Override
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d("TAG", "Ad was loaded.");

                        // Set FullScreenContentCallback
                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d("TAG", "Ad was shown.");
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.d("TAG", "Ad failed to show.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                Log.d("TAG", "Ad was dismissed.");

                                // Reload the ad
                                mRewardedAd = null;
                                loadRewardedAd();
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        // Handle the error.

                        Log.d("TAG", loadAdError.getMessage());
                        mRewardedAd = null;
                    }
                });
    }
    public void showRewardedAd() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {

                // Handle the reward.
                switch (selection){
                    case "Sustantivos":
                        placeHolder= new String[]{"Verbos"};
                        Intent intent = new Intent(this, Vocabulary2023.class);
                        intent.putExtra("type0FromLessonPlan",true);
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);
                        break;
                    case "Verbos":
                        placeHolder= new String[]{"Adverbios"};
                        Intent intentv = new Intent(this, Vocabulary2023.class);
                        intentv.putExtra("type0FromLessonPlan",true );
                        intentv.putExtra("class",placeHolder);
                        startActivity(intentv);
                        break;

                    case "Adverbios":
                        placeHolder= new String[]{"Adjetivos"};
                        Intent intenta = new Intent(this, Vocabulary2023.class);
                        intenta.putExtra("type0FromLessonPlan",true );
                        intenta.putExtra("class",placeHolder);
                        startActivity(intenta);
                        break;

                    case "Preposiciones":
                        placeHolder= new String[]{"Palabras comunes"};
                        Intent intentp = new Intent(this, Vocabulary2023.class);
                        intentp.putExtra("type0FromLessonPlan",true );
                        intentp.putExtra("class",placeHolder);
                        startActivity(intentp);
                        break;

                    case "Palabras comunes":
                        placeHolder= new String[]{"Function Words"};
                        Intent intent2 = new Intent(this, Vocabulary2023.class);
                        intent2.putExtra("type0FromLessonPlan",true );
                        intent2.putExtra("class",placeHolder);
                        startActivity(intent2);
                        break;
                    case "Function Words":
                        placeHolder= new String[]{"Present Simple"};
                        Intent intento = new Intent(this, Estructura2023.class);
                        intento.putExtra("typeFromLessonPlan",true );
                        intento.putExtra("class",placeHolder);
                        startActivity(intento);
                        break;

                }

            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
            prefs.setHasSeenAd(true);
            Toast.makeText(this, "Quieres la versión sin interrupciones?", Toast.LENGTH_SHORT).show();
            Intent intento = new Intent(Vocabulary2023.this,Premium2023.class);
            startActivity(intento);
        }
    }
    public void showRewardedAd2() {


        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                // Handle the reward.
                placeHolder[0]= selection;
                Intent intent2 = new Intent(this, Vocabulary2023.class);
                intent2.putExtra("type0FromLessonPlan",true );
                intent2.putExtra("class",placeHolder);
                startActivity(intent2);
            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }
    }
    public void showRewardedAd3() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {

                switch (selection){

                    case "Sustantivos":
                        placeHolder= new String[]{"Sustantivos"};

                        break;
                    case "Verbos":
                        placeHolder= new String[]{"Verbos"};

                        break;

                    case "Adverbios":
                        placeHolder= new String[]{"Adverbios"};

                        break;

                    case "Preposiciones":
                        placeHolder= new String[]{"Preposiciones"};

                        break;

                    case "Palabras comunes":
                        placeHolder= new String[]{"Palabras comunes"};

                        break;
                    case "Function Words":
                        placeHolder= new String[]{"Function Words"};

                        break;

                }
                // Handle the reward.
                prefs.setHasSeenAd(true);
                Intent intent = new Intent(this, Vocabulary2023.class);
                intent.putExtra("isStillOptions",true);
                intent.putExtra("type0FromLessonPlan",true );
                intent.putExtra("class",placeHolder);
                intent.putExtra("counter",3);
                intent.putExtra("correctCounter",correctDc);
                startActivity(intent);


            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }
    }
    //.............................................
    public void hideViewsBelowSpanishLay(View v) {

        if(isStillOptions){
            if(quieroPracticarSpeaking){
                dialogueCounter=0;
                correctDc=0;
            }else{
                dialogueCounter=3;
                correctDc=reciver.getIntExtra("correctCounter",0);
            }

        }
        input_lay.setVisibility(View.GONE);
        opclay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.GONE);
        btn_emp_lay_nose.setVisibility(View.GONE);
        btn_cont_lay.setVisibility(View.GONE);
        txt_exp.setVisibility(View.GONE);
        spanish_lay.setVisibility(View.VISIBLE);
        optionsLayout.setVisibility(View.VISIBLE);
        btn_emp_lay_nose.setVisibility(View.GONE);
        practice();

    }
    public void hideViewsBelowSpanishLay() {


        input_lay.setVisibility(View.GONE);
        opclay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.GONE);
        btn_emp_lay_nose.setVisibility(View.GONE);
        btn_cont_lay.setVisibility(View.GONE);
        txt_exp.setVisibility(View.GONE);

        practice();
        spanish_lay.setVisibility(View.VISIBLE);
        optionsLayout.setVisibility(View.VISIBLE);
        btn_emp_lay_nose.setVisibility(View.GONE);


    }

    //..........................................................
    private void setTextToButtonsHandleOnClick(String sp, String rightAnswer, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3) {


        String[] options = new String[4];
        Random random = new Random();
        int correctAnswerPosition = random.nextInt(4);
        correctAnswer = rightAnswer;
        options[correctAnswerPosition] = correctAnswer;

        int optionIndex = 0;
        for (int i = 0; i < options.length; i++) {
            if (i != correctAnswerPosition) {
                options[i] = new String[]{wrongAnswer1, wrongAnswer2, wrongAnswer3}[optionIndex++];
            }
        }


        sptx.setText(sp);
        engtx.setText(rightAnswer);

        option1Btn.setText(options[0]);
        option2Btn.setText(options[1]);
        option3Btn.setText(options[2]);
        option4Btn.setText(options[3]);

        option1Btn.setOnClickListener(v -> checkAnswer(option1Btn, option1Btn.getText().toString(), correctAnswer));
        option2Btn.setOnClickListener(v -> checkAnswer(option2Btn, option2Btn.getText().toString(), correctAnswer));
        option3Btn.setOnClickListener(v -> checkAnswer(option3Btn, option3Btn.getText().toString(), correctAnswer));
        option4Btn.setOnClickListener(v -> checkAnswer(option4Btn, option4Btn.getText().toString(), correctAnswer));
        tts = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    if (timerTask == null) {
                                        startTimer();
                                    }
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías    " + sp, 0, null, "zero");
                        }

                    }
                });
    }
    private void setTextToButtonsHandleOnClick(NewNounClass gen1,String methodName,String wrongAnswer1,String wrongAnswer2,String wrongAnswer3) {
        try {

            Method method = gen1.getClass().getMethod(methodName);
            method.invoke(gen1);


        } catch (NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }

        String[] options = new String[4];
        Random random = new Random();
        int correctAnswerPosition = random.nextInt(4);
        correctAnswer = gen1.gene;
        options[correctAnswerPosition] = correctAnswer;

        int optionIndex = 0;
        for (int i = 0; i < options.length; i++) {
            if (i != correctAnswerPosition) {
                options[i] = new String[]{wrongAnswer1, wrongAnswer2, wrongAnswer3}[optionIndex++];
            }
        }


        sptx.setText(gen1.gens);
        engtx.setText(gen1.gene);

        option1Btn.setText(options[0]);
        option2Btn.setText(options[1]);
        option3Btn.setText(options[2]);
        option4Btn.setText(options[3]);

        option1Btn.setOnClickListener(v -> checkAnswer(option1Btn,option1Btn.getText().toString(), correctAnswer));
        option2Btn.setOnClickListener(v -> checkAnswer(option2Btn,option2Btn.getText().toString(), correctAnswer));
        option3Btn.setOnClickListener(v -> checkAnswer(option3Btn,option3Btn.getText().toString(), correctAnswer));
        option4Btn.setOnClickListener(v -> checkAnswer(option4Btn,option4Btn.getText().toString(), correctAnswer));
        tts = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    if(timerTask == null){
                                        startTimer();
                                    }
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías    " + gen1.gens, 0, null, "zero");
                        }

                    }
                });
    }
    private void setTextToButtonsHandleOnClick(NewMethods gen1,String methodName,String wrongAnswer1,String wrongAnswer2,String wrongAnswer3) {
        try {

            Method method = gen1.getClass().getMethod(methodName);
            method.invoke(gen1);


        } catch (NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }

        String[] options = new String[4];
        Random random = new Random();
        int correctAnswerPosition = random.nextInt(4);
        correctAnswer = gen1.globalAnswer;
        options[correctAnswerPosition] = correctAnswer;

        int optionIndex = 0;
        for (int i = 0; i < options.length; i++) {
            if (i != correctAnswerPosition) {
                options[i] = new String[]{wrongAnswer1, wrongAnswer2, wrongAnswer3}[optionIndex++];
            }
        }


        sptx.setText(gen1.sp);
        engtx.setText(gen1.globalAnswer);

        option1Btn.setText(options[0]);
        option2Btn.setText(options[1]);
        option3Btn.setText(options[2]);
        option4Btn.setText(options[3]);

        option1Btn.setOnClickListener(v -> checkAnswer(option1Btn,option1Btn.getText().toString(), correctAnswer));
        option2Btn.setOnClickListener(v -> checkAnswer(option2Btn,option2Btn.getText().toString(), correctAnswer));
        option3Btn.setOnClickListener(v -> checkAnswer(option3Btn,option3Btn.getText().toString(), correctAnswer));
        option4Btn.setOnClickListener(v -> checkAnswer(option4Btn,option4Btn.getText().toString(), correctAnswer));
        tts = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    if(timerTask == null){
                                        startTimer();
                                    }
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías    " + gen1.sp, 0, null, "zero");
                        }

                    }
                });
    }

//.................................................
    private void checkAnswer(Button button, String selectedAnswer, String correctAnswer) {
        dialogueCounter++;
        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0) {
            dialogueShowRewardedAd3("59.99mx al mes? o ver anuncios de 30 segundos","Ver Anuncio", "Cipm Premium");

        }else {
            if (selectedAnswer.equals(correctAnswer)) {
                showDialog(button, "Correct!", "Continue", correctAnswer, true, dialogueCounter);
                button.setBackgroundColor(Color.GREEN);
                sayThis(correctAnswer, Locale.ENGLISH);
                correctDc++;
            } else {
                showDialog(button, "Incorrect. The correct answer is: " + correctAnswer, "Continue", correctAnswer, false, dialogueCounter);
                button.setBackgroundColor(Color.RED);
            }
            if(dialogueCounter==5&& prefs.getPremium()==0){
                // showDialogChangeDif(button, "¿Quieres practicar tu speaking?", "Quedarme aquí", "Practicar Speaking");
                dialogueShowRewardedAd3("59.99mx al mes o 30 segundos de tu tiempo","Ver Anuncio", "Cipm Premium");

            } else if(dialogueCounter>5){
                if (dialogueCounter == 10) {
                    avrScore = (double) correctDc / dialogueCounter;

                    if (avrScore >= 0.6) {

                        showDialogChangeDif(button, "¿Quieres practicar tu speaking?", "Quedarme aquí", "Practicar Speaking");
                        dialogueCounter = 0;
                        correctDc = 0;
                    } else {
                        // User didn't get at least 6 correct answers (60%)
                        showDialog(button, "You didn't pass. Try again.", "Retry", correctAnswer, false, dialogueCounter);
                        dialogueCounter = 0;
                        correctDc = 0;
                    }

                    // Reset counters for the next round

                }
            }
        }



    }
    public void checkanswer(View vista) {
        v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if(isfromtest){
            te2 = gene2test.trim();
        }else {
            te2="placeholder";
        }
        if(t2.equalsIgnoreCase("")){
            Toast.makeText(this, "Da click en el microfono y di tu respuesta", Toast.LENGTH_SHORT).show();
            return;
        }
        if(t2.equalsIgnoreCase(answerinputfinal)){
            Toast.makeText(this, "cambia de respuesta ", Toast.LENGTH_SHORT).show();

            return;
        }
        if (t.equalsIgnoreCase(t2) ||te2.equalsIgnoreCase(t2) ) {
            //ICONOS
            Drawable correctIcon = getResources().getDrawable(R.drawable.ic_controlar);

            //SE COLOCA RESPUESTA EN VERDE POR QUE SE CORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#E6FBEB"));
            opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));

            //LAYOUT QUE MUESTRA ICONOS
            resplay.setVisibility(View.VISIBLE);
            resplay.setBackground(correctIcon);

            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.GONE);

            //PASAR DE PREGUNTA
            btn_cont_lay.setVisibility(View.VISIBLE);

            //ESCONDER CHEQUEAR RESPUESTA
            btn_check_lay.setVisibility(View.GONE);
            // miliseconds
            setTimeonScreen();

            btncheck.setText("checa tu respuesta");

            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        btn_emp_lay_nose.setVisibility(View.GONE);
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {
                            }

                            @Override
                            public void onDone(String utteranceId) {

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });
                        ttr.speak("answer is correct", TextToSpeech.QUEUE_ADD, null, "one");






                    }
                }
            });




            ifFromLesson();
            if(!isFromLesson){
                updatesInDbStudentsAdvanceRegularUse();
                ifPersonalizedPlanSubractSelection();
                ifFromTestUpCounter();
            }


        }
        else {
            //ICONOS
            Drawable incorrectIcon = getResources().getDrawable(R.drawable.ic_cruzar);

            //SE COLOCA LA RESPUESTA EN ROJO POR QUE ES INCORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));

            //LAYOUT QUE MUESTRA ICONOS
            resplay.setVisibility(View.VISIBLE);
            resplay.setBackground(incorrectIcon);
            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.VISIBLE);
            btncheck.setText("Checa Tu Respuesta ");

            btn_cont_lay.setVisibility(View.VISIBLE);
            //if you say stop it returns part of the flow control system
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {
                            }

                            @Override
                            public void onDone(String utteranceId) {

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });
                        ttr.speak("answer is incorrect the answer is: "+engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        engtx.setTextColor(Color.BLUE);
                        engtx.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String textFromTxteng = engtx.getText().toString();
                                //  resplay.setVisibility(View.GONE);

                                answerinp.setText(textFromTxteng);
                            }
                        });
                        if(personalizedPlan){
                            //reset counter?
                            condicionparapasar=0;
                        }




                    }
                }
            });
//PASAR DE PREGUNTA


            if(!istesttrue){
                btn_emp_lay_nose.setVisibility(View.GONE);
            }
            if(istesttrue){

                switch (counter){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        wrongcounter++;
                        if(wrongcounter>1){
                            selection="Nivel Basico";
                            nosetv.setText("ir a elegir plan");
                            spinnerSelected1(selection);

                            btn_emp_lay.setVisibility(View.GONE);
                            btn_cont_lay.setVisibility(View.GONE);
                        }
                        break;

                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:

                        wrongcounter++;
                        if(wrongcounter>1){
                            selection="Nivel No-Basicas";
                            nosetv.setText("ir a elegir plan");
                            spinnerSelected1(selection);

                            btn_emp_lay.setVisibility(View.GONE);
                            btn_cont_lay.setVisibility(View.GONE);
                        }
                        break;
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        wrongcounter++;
                        if(wrongcounter>1){
                            selection="Nivel Interferencias";
                            nosetv.setText("ir a elegir plan");
                            spinnerSelected1(selection);

                            btn_emp_lay.setVisibility(View.GONE);
                            btn_cont_lay.setVisibility(View.GONE);
                        }
                        break;

                }

                counter++;

            }


        }
        answerinputfinal= t2;

    }
    public void checkanswer(int nose) {

        if(nose>4){
            dialogueMasFacil("Te Gustaría algo mas fácil? o ver un tutorial para usar esta actividad","Algo más fácil","Quedarme aqui");


        }else {
            //ICONOS
            Drawable incorrectIcon = getResources().getDrawable(R.drawable.ic_cruzar);
            //SE COLOCA LA RESPUESTA EN ROJO POR QUE ES INCORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));
            answerinp.setVisibility(View.VISIBLE);


            //LAYOUT QUE MUESTRA ICONOS
            resplay.setVisibility(View.VISIBLE);
            resplay.setBackground(incorrectIcon);
            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.VISIBLE);
            btncheck.setText("Checa Tu Respuesta ");

            btn_cont_lay.setVisibility(View.VISIBLE);
            //if you say stop it returns part of the flow control system
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {
                            }

                            @Override
                            public void onDone(String utteranceId) {

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });
                        ttr.speak("answer is incorrect the answer is: "+engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        engtx.setTextColor(Color.BLUE);
                        engtx.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String textFromTxteng = engtx.getText().toString();
                                resplay.setVisibility(View.GONE);
                                answerinp.setBackgroundColor(Color.WHITE);
                                opclay.setBackgroundColor(Color.WHITE);
                                answer_lay.setVisibility(View.GONE);
                                answerinp.setText(textFromTxteng);
                            }
                        });
                        if(personalizedPlan){
                            //reset counter?
                            condicionparapasar=0;
                        }




                    }
                }
            });
//PASAR DE PREGUNTA

        }


    }
    private void ifFromLesson() {
        counterDB++;
        if(counterDB == 10){
            if(isFromLesson){
                if(prefs.getPremium()==1){
                    switch (selection){
                        case "Sustantivos":
                            placeHolder= new String[]{"Verbos"};
                            Intent intent = new Intent(this, Vocabulary2023.class);
                            intent.putExtra("type0FromLessonPlan",true);
                            intent.putExtra("class",placeHolder);
                            startActivity(intent);
                            break;
                        case "Verbos":
                            placeHolder= new String[]{"Adverbios"};
                            Intent intentv = new Intent(this, Vocabulary2023.class);
                            intentv.putExtra("type0FromLessonPlan",true );
                            intentv.putExtra("class",placeHolder);
                            startActivity(intentv);
                            break;

                        case "Adverbios":
                            placeHolder= new String[]{"Adjetivos"};
                            Intent intenta = new Intent(this, Vocabulary2023.class);
                            intenta.putExtra("type0FromLessonPlan",true );
                            intenta.putExtra("class",placeHolder);
                            startActivity(intenta);
                            break;

                        case "Preposiciones":
                            placeHolder= new String[]{"Palabras comunes"};
                            Intent intentp = new Intent(this, Vocabulary2023.class);
                            intentp.putExtra("type0FromLessonPlan",true );
                            intentp.putExtra("class",placeHolder);
                            startActivity(intentp);
                            break;

                        case "Palabras comunes":
                            placeHolder= new String[]{"Function Words"};
                            Intent intent2 = new Intent(this, Vocabulary2023.class);
                            intent2.putExtra("type0FromLessonPlan",true );
                            intent2.putExtra("class",placeHolder);
                            startActivity(intent2);
                            break;
                        case "Function Words":
                            placeHolder= new String[]{"Present Simple"};
                            Intent intento = new Intent(this, Estructura2023.class);
                            intento.putExtra("typeFromLessonPlan",true );
                            intento.putExtra("class",placeHolder);
                            startActivity(intento);
                            break;
                    }
                    Intent intent = new Intent(this, Vocabulary2023.class);
                    intent.putExtra("type0FromLessonPlan",true );
                    intent.putExtra("class",placeHolder);
                    startActivity(intent);
                }else if(prefs.getPremium()==0){
                    dialogueShowRewardedAd("Ver anuncio para continuar","Ver Anuncio","Cipm Premium");

                }


            }
        }

    }
    private void reverseMultipleChoiceViewSetUp() {
        optionsLayout.setVisibility(View.GONE);

        btn_emp_lay_nose.setVisibility(View.VISIBLE);
        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        //answer_lay.setVisibility(View.VISIBLE);
        opclay.setVisibility(View.VISIBLE);
        btn_emp_lay.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.VISIBLE);
        btn_cont_lay.setVisibility(View.VISIBLE);
        txt_exp.setVisibility(View.VISIBLE);

        //


    }

    //................................................
    @Override
    protected void onStop() {
        super.onStop();



    }
    private void sayThis( String thingToSay, Locale language) {
        ttr = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    // Set the language based on the method parameter
                    int result = ttr.setLanguage(language);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TextToSpeech", "Language not supported or data missing");
                    } else {
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {
                                // Called when the speech starts
                            }

                            @Override
                            public void onDone(String utteranceId) {
                                // Called when the speech is done
                            }

                            @Override
                            public void onError(String s) {
                                // Called on an error during the speech
                            }
                        });
                        ttr.speak(thingToSay, TextToSpeech.QUEUE_ADD, null, "string");
                    }
                }
            }
        });
    }

    public void limpans(){
        //RESETEA EL INPUT
        answerinp.setText("");
        answerinp.setBackgroundColor(Color.WHITE);
        opclay.setBackgroundColor(Color.WHITE);

        //OCULTA EL LAYOYUT INCORRECTO O CORRECTO
        resplay.setVisibility(View.GONE);

        //LAYOUT DE RESPUESTA SE OCULTA
        answer_lay.setVisibility(View.GONE);
    }
    private void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    public void ocultarlay(){
        spanish_lay.setVisibility(View.GONE);
        input_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.GONE);
        btn_cont_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        optionsLayout.setVisibility(View.GONE);

    }
    public void mostrarlay(){
        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.GONE);
        btn_emp_lay_nose.setVisibility(View.VISIBLE);
    }

    public void Teststudent(){
        Generator gen = new Generator();
        switch (counter){
            case 0:
            case 1:

            case 2:

                gen.GenPresSimp2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";

                break;
            case 3:

                wrongcounter=0;

            case 4:

            case 5:
                gen.GenPresSimp2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test ="placeholder";

                break;
            case 6:
                wrongcounter=0;
            case 7:

            case 8:
                gen.GenPresPerf2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = gen.gene2;
                break;

            case 9:wrongcounter=0;

            case 10:

            case 11:
                gen.GenWouldSimp2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";

                break;

            case 12:
                wrongcounter=0;
            case 13:

            case 14:
                gen.GenWouldCont2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = gen.gene2;
                Toast.makeText(this, gene2test, Toast.LENGTH_SHORT).show();

                break;

            case 15:
                wrongcounter=0;
            case 16:

            case 17  :
                gen.GenWouldPerf2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;
            case 18:
                wrongcounter=0;
            case 19:

            case 20  :
                gen.GenForTo2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;
            case 21:
                wrongcounter=0;
            case 22:

            case 23  :
                gen.GenSupposedToPresente2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;

            case 24:
                wrongcounter=0;
            case 25:

            case 26  :
                gen.GenWishPastSimple2();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;
            case 27:
                wrongcounter=0;
            case 28:

            case 29:
                gen.generatepsporSujeto();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;

            case 30:
                wrongcounter=0;
            case 31:

            case 32:
                gen.generatepsporprep();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;

            case 33:
                wrongcounter=0;
            case 34:

            case 35:
                gen.generatepsporObjeto();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;
            case 36:
                wrongcounter=0;
            case 37:

            case 38:
                gen.generatepsporReflexivos();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;
            case 39:
                wrongcounter=0;
            case 40:

            case 41:
                gen.GenIntPorPasiva();
                genstest = gen.gens;
                genetest = gen.gene;
                gene2test = "placeholder";
                break;

        }

    }

    private void startTimer() {
        timerTask = new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        timen++;
                        tdrnumero.setText(getTimerTextWithMilliseconds());

                    }
                });
            }

        };
        timer.scheduleAtFixedRate(timerTask, 0 ,1000);
    }
    private String formatTime(int seconds, int minutes, int hours) {
        return String.format("%02d",hours) + " : " + String.format("%02d",minutes) + " : " + String.format("%02d",seconds);
    }
    private String getTimerTextWithMilliseconds() {
        double milliseconds = timen * 1000; // Convert seconds to milliseconds

        roundedMilliseconds = (int) Math.round(milliseconds);
        int seconds = ((roundedMilliseconds % 86400000) % 3600000) % 60000 / 1000; // Extract seconds
        int minutes = ((roundedMilliseconds % 86400000) % 3600000) / 60000; // Extract minutes
        int hours = (roundedMilliseconds % 86400000) / 3600000; // Extract hours
        int millisecondsValue = roundedMilliseconds % 1000; // Extract milliseconds

        return formatTimeWithMilliseconds(seconds, minutes, hours, millisecondsValue);
    }
    private String formatTimeWithMilliseconds(int seconds, int minutes, int hours, int milliseconds) {
        return String.format("%02d : %02d : %02d : %03d", hours, minutes, seconds, milliseconds);
    }
    private String extraerVerbo(String oraciónCompleta) {
        oraciónCompleta = oraciónCompleta.trim();
        String[] palabras = oraciónCompleta.split(" ");
        // Check if there are any words in the sentence
        if (palabras.length > 0) {
            // Return the last word
            return palabras[palabras.length - 1];
        } else {
            // If the sentence is empty, return an empty string or handle the case as needed
            return "";
        }

    }

    private String[] extraerUltimasDosPalabras(String oraciónCompleta) {
        oraciónCompleta = oraciónCompleta.trim();
        String[] palabras = oraciónCompleta.split(" ");
        int length = palabras.length;

        if (length >= 2) {
            // If there are at least two words, return the last two words as an array
            return new String[]{palabras[length - 2], palabras[length - 1]};
        } else if (length == 1) {
            // If there's only one word, return it along with an empty string
            return new String[]{palabras[0], ""};
        } else {
            // If the sentence is empty or contains no words, return two empty strings
            return new String[]{"", ""};
        }
    }
    private void hintPalabraclave2(Generator gen1) {
        String[] verbo = extraerUltimasDosPalabras(gen1.gene);
        palabraclave.setVisibility(View.VISIBLE);
        palabraclavees.setVisibility(View.VISIBLE);

        // Create a SpannableString with the underlined text
        SpannableString content = new SpannableString(verbo[0] + " " + verbo[1]);
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);

        // Set the SpannableString to the TextView
        palabraclave.setText(content);
        palabraclave.setTextColor(Color.BLUE);

        // Set an OnClickListener on the TextView
        palabraclave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i == TextToSpeech.SUCCESS) {
                            ttr.setLanguage(Locale.ENGLISH);
                            ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });

                            // Speak the text when clicked
                            ttr.speak(palabraclave.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        }
                    }
                });

            }
        });
    }

    private void iniciarentradavoz() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US");
        speechRecognitionLauncher.launch(intent);
        try {
        } catch (ActivityNotFoundException e) {
        }

    }
    private void hintPalabraclaveg(Generator gen1) {
        String verbo = extraerVerbo(gen1.gene);
        palabraclave.setVisibility(View.VISIBLE);
        palabraclavees.setVisibility(View.VISIBLE);
        palabraclave.setText(verbo);
        palabraclave.setTextColor(Color.BLUE);
        SpannableString content = new SpannableString(verbo);
        content.setSpan(new UnderlineSpan(), 0, verbo.length(), 0);
        palabraclave.setText(content);
        palabraclave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i == TextToSpeech.SUCCESS) {

                            ttr.setLanguage(Locale.ENGLISH);
                            ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {

                                }

                                @Override
                                public void onDone(String utteranceId) {
                                    if(timerTask == null){
                                        startTimer();
                                    }

                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            ttr.speak(palabraclave.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");



                        }
                    }
                });

            }
        });
    }
    private void hintPalabraclave(vocabgen gen1) {
        String verbo = extraerVerbo(gen1.gene);
        palabraclave.setVisibility(View.VISIBLE);
        palabraclavees.setVisibility(View.VISIBLE);
        palabraclave.setText(verbo);
        palabraclave.setTextColor(Color.BLUE);
        SpannableString content = new SpannableString(verbo);
        content.setSpan(new UnderlineSpan(), 0, verbo.length(), 0);
        palabraclave.setText(content);
        palabraclave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i == TextToSpeech.SUCCESS) {

                            ttr.setLanguage(Locale.ENGLISH);
                            ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {

                                }

                                @Override
                                public void onDone(String utteranceId) {
                                    if(timerTask == null){
                                        startTimer();
                                    }

                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            ttr.speak(palabraclave.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");



                        }
                    }
                });

            }
        });
    }
    private void hintPalabraclaveNewMeth(NewMethods meth) {
        String verbo = extraerVerbo(meth.globalAnswer);
        palabraclave.setVisibility(View.VISIBLE);
        palabraclavees.setVisibility(View.VISIBLE);
        palabraclave.setText(verbo);
        palabraclave.setTextColor(Color.BLUE);
        SpannableString content = new SpannableString(verbo);
        content.setSpan(new UnderlineSpan(), 0, verbo.length(), 0);
        palabraclave.setText(content);
        palabraclave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i == TextToSpeech.SUCCESS) {

                            ttr.setLanguage(Locale.ENGLISH);
                            ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {

                                }

                                @Override
                                public void onDone(String utteranceId) {
                                    if(timerTask == null){
                                        startTimer();
                                    }

                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            ttr.speak(palabraclave.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");



                        }
                    }
                });

            }
        });
    }

    private void escribirEnelInputTextResultadodeUtterance() {
        speechRecognitionLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK) {
                        // Handle the result here
                        Intent data = result.getData();
                        if (data != null) {
                            ArrayList<String> resultArray = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                            if (resultArray != null && !resultArray.isEmpty()) {
                                // Get the recognized text (the first item in the list)
                                String recognizedText = resultArray.get(0);


                                // Set the recognized text to the EditText
                                answerinp.setText(recognizedText);
                            }
                        }
                    }
                }
        );
    }
    public void turnTrue(String CurrentStructure,double sum){
        scoresVocabDocRef = db.collection(userid).document("Scores Vocab");
        scoresVocabDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    mso = documentSnapshot.toObject(VocabModelo.class);
                    assert mso != null;

                    switch (CurrentStructure){
                        case "0 to 50":
                            if(!mso.v0to50){
                                updateinfo("v0to50");
                            }
                            break;
                        case "50 to 100":
                            if(!mso.v50to100){
                                updateinfo("v50to100");
                            }
                            break;
                        case "100 to 150":
                            if(!mso.v100to150){
                                updateinfo("v100to150");
                            }
                            break;
                        case "150 to 200":
                            if(!mso.v150to200){
                                updateinfo("v150to200");
                            }
                            break;

                        case "200 to 250":
                            if(!mso.v200to250){
                                updateinfo("v200to250");
                            }
                            break;
                        case "250 to 300":
                            if(!mso.v250to300){
                                updateinfo("v250to300");
                            }
                            break;
                        case "300 to 350":
                            if(!mso.v300to350){
                                updateinfo("v300to350");
                            }
                            break;
                        case "350 to 400":
                            if(!mso.v350to400){
                                updateinfo("v350to400");
                            }
                            break;
                        case "400 to 500":
                            if(!mso.v400to500){
                                updateinfo("v400to500");
                            }
                            break;


                    }

                }





            }
            public void updateinfo(String estructura){
                double prom = sum / 5;
                division = mso.VocabCounter / total;
                result = division * 100;
                mso.VocabCounter++; // sube el counter 1
                userdb.put(estructura,true);// cambia valor a veradero
                userdb.put("VocabCounter",mso.VocabCounter);
                userdb.put("AvanceVocab",result);
                userdb.put("tdrVocab",prom);
                uid.document("Scores Vocab").update(userdb);
            }
        });

    }
    private void updatesInDbStudentsAdvanceRegularUse() {
        double sum;
        switch (counterDB){
            case 0:
                one=secondsWithDecimal;
                Toast.makeText(this, "one", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                two=secondsWithDecimal;
                Toast.makeText(this, "two", Toast.LENGTH_SHORT).show();

                break;

            case 2:
                three=secondsWithDecimal;
                Toast.makeText(this, "three", Toast.LENGTH_SHORT).show();

                break;

            case 3:
                four=secondsWithDecimal;
                Toast.makeText(this, "four", Toast.LENGTH_SHORT).show();

                break;
            case 4:
                five=secondsWithDecimal;
                Toast.makeText(this, "five", Toast.LENGTH_SHORT).show();

                break;
            case 5:
                one=secondsWithDecimal;
                Toast.makeText(this, "six", Toast.LENGTH_SHORT).show();
                break;

            case 6:
                two=secondsWithDecimal;
                Toast.makeText(this, "seven", Toast.LENGTH_SHORT).show();

                break;

            case 7:
                three=secondsWithDecimal;
                Toast.makeText(this, "eight", Toast.LENGTH_SHORT).show();

                break;

            case 8:
                four=secondsWithDecimal;
                Toast.makeText(this, "nine", Toast.LENGTH_SHORT).show();

                break;
            case 9:
                five=secondsWithDecimal;
                Toast.makeText(this, "ten", Toast.LENGTH_SHORT).show();

                break;

        }
        counterDB++;
        sum = one+two+three+four+five+six+seven+eight+nine+ten;
        if(counterDB == 3){
            turnTrue(selection,sum);
            counterDB=0;
            if(!user.isAnonymous()){

                if(prefs.getPremium()==1) {


                }else if(prefs.getPremium()==0){
                    showDialogueWithAd();

                }


            }
        }
    }
    private void ifPersonalizedPlanSubractSelection() {

        if(personalizedPlan){
            condicionparapasar++;
            if(condicionparapasar>5){
                SubtractSelectionAndSendinfoToDb();
                condicionparapasar=0;

            }else {
                Toast.makeText(Vocabulary2023.this, "otras " +String.valueOf(6-condicionparapasar)+" correctas para pasar a siguiente estructura", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void ifFromTestUpCounter() {

        if(istesttrue){
            counter++;
        }

    }
    private void setTimeonScreen() {
        prom = roundedMilliseconds ;
        tdr.setVisibility(View.VISIBLE);
        tdrnumero.setVisibility(View.VISIBLE);
        secondsWithDecimal = prom / 1000; // Divide by 100 to get seconds with two decimal places
        tdrnumero.setText(String.format(String.valueOf(secondsWithDecimal))+" Segundos");
        timen = 0.0;
        if (timerTask != null) {
            timerTask.cancel();
        }
        timerTask = null;
    }

    public void speakans(View vista){
        ttr.setLanguage(Locale.ENGLISH);
        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
            @Override
            public void onStart(String s) {

            }

            @Override
            public void onDone(String utteranceId) {


            }

            @Override
            public void onError(String s) {
            }
        });

        ttr.speak(engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
    }
    public void hablar(View view){
        iniciarentradavoz();
        btn_emp_lay_nose.setVisibility(View.GONE);
        answerinp.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.VISIBLE);

    }
}