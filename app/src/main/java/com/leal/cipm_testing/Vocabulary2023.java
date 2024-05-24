package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
public class Vocabulary2023 extends AppCompatActivity implements OnFragmentInteractionListener, PlayerProvider {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    LinearLayout vf;
    LinearLayout opclay;
    LinearLayout resplay;
    MediaItem mediaItem;

    LinearLayout answer_lay, micro;
    LinearLayout spanish_lay;
    LinearLayout input_lay;
    LinearLayout btn_check_lay;
    private ActivityResultLauncher<Intent> speechRecognitionLauncher;

    TextView btncheck,totalTxt;
    LinearLayout btn_emp_lay, btn_emp_lay_nose ;
    LinearLayout btn_cont_lay;
    LinearLayout txt_exp;
    TextView spa_sent;
    Spinner spin;
    String selection;
    TextView sptx;
    TextView engtx;
    EditText answerinp;
    TextView textspin1;
    TextToSpeech ttr;
    TextToSpeech tts;
    FirebaseAuth mAuth;
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp = objetoArrays.arrayVocab;
    vocabgen gen = new vocabgen();
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    boolean v;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,isBasicStructures;
    boolean personalizedPlan,isCustom,is100Custom,isBasicRecomended,isfromtest;
    Prefs prefs;
    DocumentReference docrefVocab;
    VideoPlayer video_player = new VideoPlayer();
    TextView nosetv;
    TextView palabraclavees,palabraclave;
    int condicionparapasar;
    FirebaseUser user;
    Timer timer;
    TimerTask timerTask;
    Double timen = 0.0;
    TextView tdr,tdrnumero;
    int roundedMilliseconds;

    CollectionReference uid;
    int counterDB;
    double total;
    double one;
    double two;
    double three;
    double four ;
    double five,six,seven,eight,nine,ten;
    int score=0;
    NewMethods newMeth = new NewMethods();

    private StyledPlayerView playerView;
    private SimpleExoPlayer player;
    private boolean playWhenReady = true;
    private int currentWindow = 0;
    private long playbackPosition = 0;
    private boolean isFullScreen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary2023);

        // Instanciación correcta de SimpleExoPlayer
        player = new SimpleExoPlayer.Builder(this).build();

        loadRewardedAd();
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

        sptx = findViewById(R.id.spanishsentence);
        engtx = findViewById(R.id.txteng);
        answerinp = findViewById(R.id.answerinput1);
        answerinp.setVisibility(View.GONE);
        opclay = findViewById(R.id.opclay);

        btncheck = findViewById(R.id.btncheck);
        nosetv= findViewById(R.id.nose);

        spa_sent = findViewById(R.id.spa_sent);
        spa_sent.setVisibility(View.GONE);

        resplay = findViewById(R.id.resplay);
        answer_lay = findViewById(R.id.answer_lay);
        spanish_lay = findViewById(R.id.spanish_lay);
        input_lay = findViewById(R.id.input_lay);
        btn_check_lay = findViewById(R.id.btn_check_lay);
        btn_emp_lay = findViewById(R.id.btn_emp_lay);
        btn_cont_lay = findViewById(R.id.btn_cont_lay);

        btn_emp_lay_nose = findViewById(R.id.btn_emp_lay_nose);

        totalTxt= findViewById(R.id.totalTxtV);
        totalTxt.setVisibility(View.GONE);

        txt_exp = findViewById(R.id.txt_exp);
        mAuth= FirebaseAuth.getInstance();

        userid = mAuth.getCurrentUser().getUid();
        docref = db.collection(userid).document("WhereisStudent");
        docrefVocab = db.collection(userid).document("CustomArrayLists");
        user = mAuth.getCurrentUser();


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

        LinearLayout btnFullScreen = findViewById(R.id.btn_full_screen);
        btnFullScreen.setOnClickListener(view -> toggleFullScreen());


        prefs = new Prefs(Vocabulary2023.this);
        condicionparapasar=0;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.video_player_view, video_player)
                .commit();

        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);
        timer = new Timer();
         uid = db.collection(userid);
        escribirEnelInputTextResultadodeUtterance();
        PremiumControler();

    }

        boolean lessonPlan;
    //DB FUNC
    // Método para cambiar el modo de pantalla completa
    private void toggleFullScreen() {
        if (!isFullScreen) {
            if (player != null) {
                // Guardar la posición actual del video
                playbackPosition = player.getCurrentPosition();
                playWhenReady = player.getPlayWhenReady();

                // Guardar la posición de reproducción en Prefs
                Prefs prefs = new Prefs(this);  // Asegúrate de que el contexto sea el correcto
                prefs.setLong("playbackPosition", playbackPosition);
                Log.d("FullScreenToggle", "Saved playback position: " + playbackPosition);
            }

            openFullScreenDialog();
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            isFullScreen = true;
        } else {
            // Salir del modo pantalla completa
            closeFullScreenDialog();
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            isFullScreen = false;

            if (player != null) {
                // Restaurar el estado de reproducción del video
                player.seekTo(playbackPosition);
                player.setPlayWhenReady(playWhenReady);
            }
        }
    }
    private void openFullScreenDialog() {
        if (player != null) {
            playbackPosition = player.getCurrentPosition();
            playWhenReady = player.getPlayWhenReady();

            // Pausar el video antes de abrir la pantalla completa
            video_player.player.stop();
        }
        video_player.player.stop();

        FullScreenVideoFragment fullScreenFragment = new FullScreenVideoFragment();
        // Pasar la posición y estado de reproducción al fragmento si es necesario
        Bundle args = new Bundle();
        args.putLong("position", playbackPosition);
        args.putBoolean("playWhenReady", playWhenReady);
        fullScreenFragment.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, fullScreenFragment)
                .addToBackStack(null)
                .commit();
    }
    private void closeFullScreenDialog() {
        getSupportFragmentManager().popBackStack();
        // Restaura el estado del reproductor si es necesario
        if (player != null) {
            playbackPosition = player.getCurrentPosition();
            playWhenReady = player.getPlayWhenReady();

            // Pausar el video antes de abrir la pantalla completa
            video_player.player.play();
        }

    }

    @Override
    public void onFragmentDismissed(long playbackPosition, boolean playWhenReady) {
        player.play();
    }

    @Override
    public Player getSharedPlayer() {
        return player;
    }


    private void PremiumControler() {

        // info que recive del plan de estudios chooser
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        is100Custom=reciver.getBooleanExtra("Custom100Plan",false);

       // isBasicRecomended = reciver.getBooleanExtra("BasicRecomendedPlan",false);




        //si es personalizado jala el array para empezar y luego el de la
        // base de datos correspondiente
        // este tiene que jalar un array al principio de lo que sea que sea su plan
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
                    Toast.makeText(this, "plan personalizado pero no premium", Toast.LENGTH_SHORT).show();
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


    //EMPIEZA ESTRUCTURA
    boolean istesttrue;
    boolean isFromLesson;
    String[] classFromLesson;
    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        Intent reciver = getIntent();
        istesttrue=reciver.getBooleanExtra("test",false);
        isFromLesson=reciver.getBooleanExtra("type0FromLessonPlan",false);
        classFromLesson=reciver.getStringArrayExtra("class");
        //USUARIO PREMIUM
        if(istesttrue){

            temp = objetoArrays.tester;
            //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(Vocabulary2023.this, android.R.layout.simple_list_item_1,temp);

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

        else if(prefs.getPremium()==1){
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

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected1() {
        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);
        prefs.setSelection(selection); // Guarda la selección en Prefs

        if (video_player != null) {
            video_player.updateFragmentStateStructure(selection);
        }

        if (selection.equals("Tutorial")) {
            spa_sent.setText("Seleccione una estructura y rango para continuar con la practica");
            btn_emp_lay.setVisibility(View.GONE);
            txt_exp.setVisibility(View.VISIBLE);
            ocultartodo();
        } else {
            btn_emp_lay.setVisibility(View.VISIBLE);
            videoPlayer();
        }
    }
    public void spinnerSelected1(String selectionp){
        selection = selectionp;
        textspin1.setText(selection);
        prefs.setSelection(selection);
        if(video_player != null) {
            video_player.updateFragmentStateStructure(selection);

        }
        if(selection.equals("Tutorial")){
            spa_sent.setText("Seleccione una estructura y rango para continuar con la practica");
            btn_emp_lay.setVisibility(View.GONE);
            txt_exp.setVisibility(View.VISIBLE);
            ocultartodo();
        }else {
            btn_emp_lay.setVisibility(View.VISIBLE);
            videoPlayer();
        }
    }
    //ACTIVA LA INTERFAZ PARA EL VIDEO
    public void videoPlayer(){
       // spa_sent.setText("Lee la frase y escribela en ingles");
        btn_emp_lay.setVisibility(View.VISIBLE);
        ocultarlay();
    }

    //TOMA TODO EL ESPACIO PARA EL SPINNER 1
    public void activaSpinner1(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
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
    double prom;
    NewNounClass nounClassObject = new NewNounClass();


    public void practice(View v) {
     //   limpans();



        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE );

        btn_emp_lay.setVisibility(View.GONE);
        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.VISIBLE);
        if(isFromLesson){
            btn_emp_lay_nose.setVisibility(View.VISIBLE);
        }

        micro.setVisibility(View.VISIBLE);
        if(istesttrue){
            btn_emp_lay_nose.setVisibility(View.VISIBLE);
            btn_cont_lay.setVisibility(View.VISIBLE);


        }

        btn_cont_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        resplay.setVisibility(View.GONE);
        answerinp.setBackgroundColor(Color.WHITE);
        opclay.setBackgroundColor(Color.WHITE);

        if(!prefs.getHasSeenAd() && !isFromLesson && prefs.getPremium()==0){
            dialogueShowRewardedAd2("Ver Anuncio para Continuar ","Cipm Premium ", "Ver anuncio");
        }else if(!selection.equals("Tutorial")){
            mostrarlay();
            switch (selection) {
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



    String te2;
    int wrongcounter;
    boolean isinbasics;
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
    public void checkanswer() {
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
        if(counterDB == 10){
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
    private void showDialogueWithAd() {
        if(prefs.getPremium()==0){
            dialogueShowRewardedAd("Ver anuncio para desbloquear clase","Ver Anuncio","Cipm Premium");

        }
    }

    private void ifFromLesson() {
        counterDB++;
        if(counterDB == 3){
            if(isFromLesson){

                if(prefs.getPremium()==1){
                    switch (selection){
                        case "Function Words":
                            placeHolder= new String[]{"Present Simple"};
                            break;
                    }
                    Intent intent = new Intent(this, Estructura2023.class);
                    intent.putExtra("typeFromLessonPlan",true );
                    intent.putExtra("class",placeHolder);
                    startActivity(intent);
                }else if(prefs.getPremium()==0){
                    Toast.makeText(this,"enttra",Toast.LENGTH_SHORT).show();
                    dialogueShowRewardedAd("Ver anuncio para desbloquear siguiente clase","Ver","Cipm Premium");

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
    double secondsWithDecimal;
    String answerinputfinal;
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
        answerinp.setVisibility(View.VISIBLE);

    }
    public void ocultartodo(){
        spanish_lay.setVisibility(View.GONE);
        input_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.GONE);
        btn_cont_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
    }
    public void ocultarlay(){
        spanish_lay.setVisibility(View.GONE);
        input_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.GONE);
        btn_cont_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
    }
    public void mostrarlay(){
        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.VISIBLE);
    }
    int counter=0;
    String genstest,genetest,gene2test;
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
    public void nose(View vista){


        if(isFromLesson){
            Toast.makeText(this, "Necesitas ayuda?- da click en servicio al cliente", Toast.LENGTH_SHORT).show();
            checkanswer();
        }else if (isfromtest){
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
        }




    }
    //VALIDACIONES DE TEXTO Y AUDIO




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

                Toast.makeText(Vocabulary2023.this, "Keyword clicked", Toast.LENGTH_SHORT).show();
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



    DocumentReference scoresVocabDocRef;
    double division;
    double result;
    VocabModelo mso = new VocabModelo();
    Map<String, Object> userdb = new HashMap<>();

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
                showRewardedAd();


            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.GRAY); // Set the background color
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
        drawable2.setColor(Color.GRAY); // Set the background color
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

    @Override
    protected void onStart() {
        super.onStart();
        if (player != null) {
            player.setPlayWhenReady(playWhenReady);
            player.seekTo(currentWindow, playbackPosition);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (player != null) {
            playWhenReady = player.getPlayWhenReady();
            playbackPosition = player.getCurrentPosition();
            currentWindow = player.getCurrentWindowIndex();
            player.release();
            player = null;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (player != null) {
            outState.putBoolean("playWhenReady", player.getPlayWhenReady());
            outState.putInt("currentWindow", player.getCurrentWindowIndex());
            outState.putLong("playbackPosition", player.getCurrentPosition());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            playWhenReady = savedInstanceState.getBoolean("playWhenReady");
            currentWindow = savedInstanceState.getInt("currentWindow");
            playbackPosition = savedInstanceState.getLong("playbackPosition");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            playWhenReady = player.getPlayWhenReady();
            playbackPosition = player.getCurrentPosition();
            currentWindow = player.getCurrentWindowIndex();
            player.release();
            player = null;
        }
    }

    String[] placeHolder = new String[]{"Default value"};

    private RewardedAd mRewardedAd;
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-9126282069959189/3406127387", adRequest,
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

    // Call this method when the button is clicked.
    public void showRewardedAd() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                // Handle the reward.
                switch (selection){
                    case "Function Words":
                        placeHolder= new String[]{"Present Simple"};
                        break;
                }
                Intent intent = new Intent(this, Estructura2023.class);
                intent.putExtra("typeFromLessonPlan",true );
                intent.putExtra("class",placeHolder);
                startActivity(intent);
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
                prefs.setHasSeenAd(true);
                Intent intent = new Intent(this, Vocabulary2023.class);
                startActivity(intent);
            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.release(); // Asegúrate de liberar el player cuando la actividad es destruida
            player = null;
        }
    }


}