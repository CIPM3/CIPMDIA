package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

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

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;


public class Transicion2023 extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    int dialogueCounter = 0, correctDc = 0;
    double avrScore;
    boolean dificultyChanged;
    LinearLayout opclay;
    LinearLayout resplay;
    LinearLayout mic;
    LinearLayout answer_lay;
    LinearLayout spanish_lay;
    LinearLayout input_lay;
    LinearLayout btn_check_lay;
    LinearLayout btn_emp_lay;
    LinearLayout btn_cont_lay;
    LinearLayout txt_exp;
    Spinner spin;
    String selection;
    TextView sptx;
    TextView engtx;
    TextView spa_sent;
    EditText answerinp;
    TextView textspin1;
    TextToSpeech ttr;

    FirebaseAuth mAuth;
    String userid;
    String[] temp ={"Random"
    };
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    public static final int REC_CODE_SPEECH_INPUT = 100;

    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,isBasicStructures;
    boolean personalizedPlan;
    boolean isCustom,isPlanIntermedio;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan;
    boolean isFromListeningPlanDb,isPlanIntermedioFromDb,isFromListeningPlan;
    Prefs prefs;
    TextView empezarTxt;
    VideoPlayer video_player = new VideoPlayer();
    int condicionparapasar;
    private ActivityResultLauncher<Intent> speechRecognitionLauncher;
    DocumentReference scoresTransDocRef;
    ModeloTrans mso ;
    Map<String, Object> userdb = new HashMap<>();
    Timer timer;
    TimerTask timerTask;
    Double timen = 0.0;
    TextView tdr,tdrnumero;
    double prom;
    int roundedMilliseconds;
    CollectionReference uid;
    String engtx2;
    int counterDB;
    double total;
    double one;
    double two;
    double three;
    double four ;
    double five;
    LinearLayout option_buttons_lay,noSeBtnLay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicion2023);

        textspin1 = findViewById(R.id.textspin1);
        spin = findViewById(R.id.spinuno);
        option_buttons_lay=findViewById(R.id.button_layout);

        option1Btn= findViewById(R.id.answer_button_1);
        option2Btn= findViewById(R.id.answer_button_2);
        option3Btn= findViewById(R.id.answer_button_3);
        option4Btn= findViewById(R.id.answer_button_4);
        mic=findViewById(R.id.respdecir);
//        empezarTxt=findViewById(R.id.empezarTxt);
//        noSeBtnLay= findViewById(R.id.btn_NoSe_lay);
        noSeBtnLay.setVisibility(View.GONE);

        sptx = findViewById(R.id.spanishsentence);
        engtx = findViewById(R.id.txteng);
        answerinp = findViewById(R.id.answerinput1);
        opclay = findViewById(R.id.opclay);
        //spa_sent = findViewById(R.id.spa_sent);
       // resplay = findViewById(R.id.resplay);
        answer_lay = findViewById(R.id.answer_lay);
        spanish_lay = findViewById(R.id.spanish_lay);
        input_lay = findViewById(R.id.input_lay);
        btn_check_lay = findViewById(R.id.btn_check_lay);
        btn_emp_lay = findViewById(R.id.btn_emp_lay);
        btn_cont_lay = findViewById(R.id.btn_cont_lay);
      //  txt_exp = findViewById(R.id.txt_exp);
        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        docref = db.collection(userid).document("WhereisStudent");
        prefs = new Prefs(Transicion2023.this);
        condicionparapasar=0;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);
        engtx2=".";

        tdr = findViewById(R.id.TRPsp);
        tdr.setVisibility(View.GONE);
        tdrnumero = findViewById(R.id.TRPNumbersp);
        tdrnumero.setVisibility(View.GONE);
        timer = new Timer();
        counterDB=0;
        total=22;
        one= 0;
        two =0;
        three=0;
        four=0;
        five=0;
        uid = db.collection(userid);

        if(prefs.getPremium()==0){
            loadRewardedAd();
        }


        escribirEnelInputTextResultadodeUtterance();

        PremiumAndArrayControler();
    }


    //DB FUNC
    private void PremiumAndArrayControler() {

        // info que recive del plan de estudios chooser
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        isPlanIntermedio=reciver.getBooleanExtra("planintermedio",false);
        isFromListeningPlan = reciver.getBooleanExtra("BasicListeningPlan", false);
        isFromListeningPlanDb= reciver.getBooleanExtra("isFromListeningDb",false);
        isPlanIntermedioFromDb=reciver.getBooleanExtra("isFromIntermedioStandarPlan",false);

        //si es personalizado jala el array para empezar y luego el de la
        // base de datos correspondiente
        // este tiene que jalar un array al principio de lo que sea que sea su plan
        if(personalizedPlan){

            //al premium no se le ha movido
            if (prefs.getPremium()==1){
                //Give the user all the premium features
                //hide ads if you are showing ads
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                        (this, R.array.vocabPremium, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();
                        textspin1.setText(selection);

                      /*  vf.setVisibility(View.VISIBLE);
                        vv.setVisibility(View.GONE);

                        txt_exp.setVisibility(View.VISIBLE);
                        btn_emp_lay.setVisibility(View.VISIBLE);

                        spanish_lay.setVisibility(View.GONE);
                        input_lay.setVisibility(View.GONE);

                        btn_check_lay.setVisibility(View.GONE);
                        btn_cont_lay.setVisibility(View.GONE);

                        resplay.setVisibility(View.GONE);



                        answerinp.setBackgroundColor(Color.WHITE);
                        opclay.setBackgroundColor(Color.WHITE);*/
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

            }
            // no es premium
            else if (prefs.getPremium()==0){
                // este if controla si esta volviendo de una sesión anterior, recive de la base de datos
                // una lista<> ya empezada que convierte en array y que luego pasa al adaptador que lo pone en el spiner
                // en cada actividad habra un is custom, con el array que le corresponda
                // la actividad sera controlada en plandeestudioschooser segun lo que la base de datos diga que es true
                if(isCustom)
                {
                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=  documentSnapshot.toObject(VocabModeloPersistencia.class);
                            assert vmp != null;
                            temp= vmp.resultArray.toArray(new String[0]);
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Transicion2023.this, android.R.layout.simple_list_item_1,temp  );
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    textspin1.setText(selection);
                                  /*  vf.setVisibility(View.VISIBLE);
                                    vv.setVisibility(View.GONE);
                                    txt_exp.setVisibility(View.VISIBLE);
                                    btn_emp_lay.setVisibility(View.VISIBLE);
                                    spanish_lay.setVisibility(View.GONE);
                                    input_lay.setVisibility(View.GONE);

                                    btn_check_lay.setVisibility(View.GONE);
                                    btn_cont_lay.setVisibility(View.GONE);

                                    resplay.setVisibility(View.GONE);



                                    answerinp.setBackgroundColor(Color.WHITE);
                                    opclay.setBackgroundColor(Color.WHITE);*/
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                        }
                    });}
                // si no es custom agarra el temp que ha sido inicializado arriba
                // tal vez tengamos que hacer esos arrays en otra clase y solo llamarlos
                // aqui empieza el plan personalizado
                else {
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, temp);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }


        }else{
            checkPremiun();
        }
    }
    public void inWhatActivityisTheStudent(){

        isInTransition = true;
        if(isFromListeningPlan ||isFromListeningPlanDb){
            isListeningPlan=true;
        }

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

            if(isPlanIntermedio||isPlanIntermedioFromDb){
                Intent intent = new Intent(Transicion2023.this, ConInt2023.class);
                intent.putExtra("isThePlanPersonalized",personalizedPlan);
                intent.putExtra("planintermedio",isPlanIntermedio);

                startActivity(intent);
            }else {
                Intent intent = new Intent(Transicion2023.this, Availability2023.class);
                intent.putExtra("isThePlanPersonalized",personalizedPlan);
                intent.putExtra("BasicListeningPlan",isFromListeningPlan||isFromListeningPlanDb);
                startActivity(intent);
            }



        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
        }
    }
    String[] classFromLesson = new String[]{"Default Value"};
    //START ACTIVITY
    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        Intent reciver = getIntent();
        isFromLessonPlan= reciver.getBooleanExtra("typeFromLessonPlan",false);
        classFromLesson=reciver.getStringArrayExtra("class");
        if(isFromLessonPlan){
            if(prefs.getPremium()==1){
                ArrayAdapter<String> adapter = new ArrayAdapter<>(Transicion2023.this, android.R.layout.simple_list_item_1,classFromLesson);
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

                //USUARIO BASICO
            } else if (prefs.getPremium()==0){

                ArrayAdapter<String> adapter = new ArrayAdapter<>(Transicion2023.this, android.R.layout.simple_list_item_1,classFromLesson);
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
        }else {
            if(prefs.getPremium()==1){
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Transition, android.R.layout.simple_spinner_item);
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

                //USUARIO BASICO
            } else if (prefs.getPremium()==0){

                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.TransitionGratis, android.R.layout.simple_spinner_item);
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


        //USUARIO PREMIUM

    }

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected1(){
        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);

        if(video_player != null) {
            video_player.updateFragmentStateStructure(selection);

        }

        if(selection.equals("Tutorial")){
            spa_sent.setText("Seleccione una estructura para continuar con la practica");
            btn_emp_lay.setVisibility(View.GONE);
          //  txt_exp.setVisibility(View.VISIBLE);
            ocultartodo();
        }else if(selection.equals("Transiciones")){
            spa_sent.setText("Seleccione una estructura para continuar con la practica");
            btn_emp_lay.setVisibility(View.GONE);
         //   txt_exp.setVisibility(View.VISIBLE);
            ocultartodo();
        } else{
            btn_emp_lay.setVisibility(View.VISIBLE);
            videoPlayer();

        }
    }

    //ACTIVA LA INTERFAZ PARA EL VIDEO
    public void videoPlayer(){
//        spa_sent.setText("Lee la frase y escribela en ingles");
        btn_emp_lay.setVisibility(View.VISIBLE);
        ocultarlay();
    }

    //TOMA TODO EL ESPACIO PARA EL SPINNER 1
    public void activaSpinner1(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }

    //EMPIEZA LA PRACTICA TRANSICION
    public void practice(View v){

        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE);
        noSeBtnLay.setVisibility(View.VISIBLE);
        empezarTxt.setText("Otra oración");
        switch (selection) {
            case "Random":
                activarInputs();
                ConjMainMethod();

                break;

        }
    }
    public void practiceOG(){
        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE   );
        noSeBtnLay.setVisibility(View.VISIBLE);
        empezarTxt.setText("Otra oración");
        switch (selection) {
            case "Random":
                activarInputs();
                ConjMainMethod();

                break;

        }
    }

    public void activarInputs() {
        // Set all elements to GONE initially
        btn_emp_lay.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.GONE);
        btn_cont_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        input_lay.setVisibility(View.VISIBLE);
        answerinp.setVisibility(View.GONE);
        mic.setVisibility(View.VISIBLE);
       // resplay.setVisibility(View.VISIBLE);

        // Make the Spanish layout and the microphone visible
        spanish_lay.setVisibility(View.VISIBLE);
        opclay.setVisibility(View.VISIBLE);


        // Reset input fields if necessary
        answerinp.setBackgroundColor(Color.WHITE);
        answerinp.setText("");
        opclay.setBackgroundColor(Color.WHITE);
    }

    NewMethods newMeth= new NewMethods();
    public void ConjMainMethod(){

        newMeth.conectorMethod();
        sptx.setText(newMeth.gens);
        engtx.setText(newMeth.gene);
        if(newMeth.gene2!=null){
            engtx2= newMeth.gene2;
        }else {
            engtx2=".";
        }




        ttr = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = ttr.setLanguage(spanish);
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
                            ttr.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });

    }
    //RANDOM GEN
    public void speakdecir(View view){

        answerinp.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.VISIBLE);
        btn_emp_lay.setVisibility(View.GONE);
        noSeBtnLay.setVisibility(View.GONE);
        iniciarentradavoz();
    }
    public void checkanswer(View v){
        //v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        mic.setVisibility(View.GONE);
        noSeBtnLay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);


        if (t.equalsIgnoreCase(t2)||t.equalsIgnoreCase(engtx2)) {
            //ICONOS
            Drawable correctIcon = getResources().getDrawable(R.drawable.ic_controlar);
            setTimeonScreen();
            //SE COLOCA RESPUESTA EN VERDE POR QUE SE CORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#E6FBEB"));
            opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));

            //LAYOUT QUE MUESTRA ICONOS
         //   resplay.setVisibility(View.VISIBLE);
          //  resplay.setBackground(correctIcon);

            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.GONE);
            btn_cont_lay.setVisibility(View.VISIBLE);

            //ESCONDER CHEQUEAR RESPUESTA
            btn_check_lay.setVisibility(View.GONE);

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

            }
            counterDB++;
            sum = one+two+three+four+five;
            if(counterDB == 4){

                turnTrue(selection,sum);
                counterDB=0;
                if(isFromLessonPlan&&prefs.getPremium()==1){
                    Intent intent = new Intent(this, Availability2023.class);
                    intent.putExtra("class",placeHolder);
                    intent.putExtra("typeFromLessonPlan",true);
                    startActivity(intent);
                }else if(prefs.getPremium()==0){
                    dialogueShowRewardedAd2("Ver anuncio para desbloquear","Cipm Premium","Ver anuncio");

                }
            }

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
                        ttr.speak("answer is correct", TextToSpeech.QUEUE_ADD, null, "one");


                        condicionparapasar++;
                        if(personalizedPlan){
                            if(condicionparapasar>25){
                                Toast.makeText(Transicion2023.this, "Necesitas otras " +String.valueOf(25-condicionparapasar)+" correctas para pasar a siguiente Nivel", Toast.LENGTH_SHORT).show();
                                SubtractSelectionAndSendinfoToDb();
                                condicionparapasar=0;

                            }else {
                                Toast.makeText(Transicion2023.this, "otras " +String.valueOf(6-condicionparapasar)+" correctas para pasar a siguiente estructura", Toast.LENGTH_SHORT).show();
                            }

                        }
                    }
                }
            });
        }
        else {
            //ICONOS
            Drawable incorrectIcon = getResources().getDrawable(R.drawable.ic_cruzar);

            //SE COLOCA LA RESPUESTA EN ROJO POR QUE ES INCORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));

            //LAYOUT QUE MUESTRA ICONOS
          /*  resplay.setVisibility(View.VISIBLE);
            resplay.setBackground(incorrectIcon);*/

            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.VISIBLE);
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        engtx.setTextColor(Color.BLACK);
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

                        ttr.speak("answer is incorrect....the answer is..." + engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet
                        engtx.setTextColor(Color.BLUE);
                        engtx.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String textFromTxteng = engtx.getText().toString();
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
            btn_cont_lay.setVisibility(View.VISIBLE);
        }

    }
    public void checkanswer() {
        //v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        mic.setVisibility(View.GONE);
        noSeBtnLay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);

        if (t.equalsIgnoreCase(t2)||t.equalsIgnoreCase(engtx2)) {
            //ICONOS
            Drawable correctIcon = getResources().getDrawable(R.drawable.ic_controlar);
            setTimeonScreen();
            //SE COLOCA RESPUESTA EN VERDE POR QUE SE CORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#E6FBEB"));
            opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));

            //LAYOUT QUE MUESTRA ICONOS
         //   resplay.setVisibility(View.VISIBLE);
          //  resplay.setBackground(correctIcon);

            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.GONE);
            btn_cont_lay.setVisibility(View.VISIBLE);

            //ESCONDER CHEQUEAR RESPUESTA
            btn_check_lay.setVisibility(View.GONE);

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

            }
            counterDB++;
            sum = one+two+three+four+five;
            if(counterDB == 4){

                turnTrue(selection,sum);
                counterDB=0;
                if(isFromLessonPlan&&prefs.getPremium()==1){
                    Intent intent = new Intent(this, Availability2023.class);
                    intent.putExtra("class",placeHolder);
                    intent.putExtra("typeFromLessonPlan",true);
                    startActivity(intent);
                }else if(prefs.getPremium()==0){
                    dialogueShowRewardedAd2("Ver anuncio para desbloquear","Cipm Premium","Ver anuncio");

                }
            }

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
                        ttr.speak("answer is correct", TextToSpeech.QUEUE_ADD, null, "one");


                        condicionparapasar++;
                        if(personalizedPlan){
                            if(condicionparapasar>25){
                                Toast.makeText(Transicion2023.this, "Necesitas otras " +String.valueOf(25-condicionparapasar)+" correctas para pasar a siguiente Nivel", Toast.LENGTH_SHORT).show();
                                SubtractSelectionAndSendinfoToDb();
                                condicionparapasar=0;

                            }else {
                                Toast.makeText(Transicion2023.this, "otras " +String.valueOf(6-condicionparapasar)+" correctas para pasar a siguiente estructura", Toast.LENGTH_SHORT).show();
                            }

                        }
                    }
                }
            });
        }
        else {
            //ICONOS
            Drawable incorrectIcon = getResources().getDrawable(R.drawable.ic_cruzar);

            //SE COLOCA LA RESPUESTA EN ROJO POR QUE ES INCORRECTA
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));

            //LAYOUT QUE MUESTRA ICONOS
          /*  resplay.setVisibility(View.VISIBLE);
            resplay.setBackground(incorrectIcon);*/

            //LAYOUT DE RESPUESTA
            answer_lay.setVisibility(View.VISIBLE);
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        engtx.setTextColor(Color.BLACK);
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

                        ttr.speak("answer is incorrect....the answer is..." + engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet
                        engtx.setTextColor(Color.BLUE);
                        engtx.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String textFromTxteng = engtx.getText().toString();
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
            btn_cont_lay.setVisibility(View.VISIBLE);
        }

    }
    public void speakans(View vista){
        ttr.setLanguage(Locale.ENGLISH);
        input_lay.setVisibility(View.VISIBLE);
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

    //Plugins
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
    double secondsWithDecimal;
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
    boolean isFromLessonPlan;

    public void turnTrue(String CurrentStructure,double sum){
        scoresTransDocRef= db.collection(userid).document("Scores Trans"    );
        scoresTransDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    mso = documentSnapshot.toObject(ModeloTrans.class);
                    assert  mso!=null;

                    switch (CurrentStructure){
                        case "Conectores Standar Presente Simple":
                            if(!mso.ConectoresStandarPresenteSimple){
                                updateInfo("ConectoresStandarPresenteSimple");
                            }
                            break;
                        case "Conectores Standar Presente Continuo":
                            if(!mso.ConectoresStandarPresenteContinuo){
                                updateInfo("ConectoresStandarPresenteContinuo");
                            }
                            break;
                        case "Conectores Standar Presente Perfecto":
                            if(!mso.ConectoresStandarPresentePerfecto){
                                updateInfo("ConectoresStandarPresentePerfecto");
                            }
                            break;
                        case "Conectores Standar Presente Perfecto Continuo":
                            if(!mso.ConectoresStandarPresentePerfectoContinuo){
                                updateInfo("ConectoresStandarPresentePerfectoContinuo");
                            }

                            break;
                        case "Conectores Standar Futuro Simple":
                            if(!mso.ConectoresStandarFuturoSimple){
                                updateInfo("ConectoresStandarFuturoSimple");
                            }
                            break;
                        case "Conectores Standar Reported Speech":
                            if(!mso.ConectoresStandarReportedSpeech){
                                updateInfo("ConectoresStandarReportedSpeech");
                            }
                            break;
                        case "Conectores Standar Must Simple":
                            if(!mso.ConectoresStandarMustSimple){
                                updateInfo("ConectoresStandarMustSimple");
                            }
                            break;
                        case "Conectores Standar Can Simple":
                            if(!mso.ConectoresStandarCanSimple){
                                updateInfo("ConectoresStandarCanSimple");
                            }
                            break;
                        case "Conectores Standar Presente Simple X Want To":
                            if(!mso.ConectoresStandarPresenteSimpleXWantTo){
                                updateInfo("ConectoresStandarPresenteSimpleXWantTo");
                            }
                            break;
                        case "Conectores Standar Presente Simple X Supposed To":
                            if(!mso.ConectoresStandarPresenteSimpleXSupposedTo){
                                updateInfo("ConectoresStandarPresenteSimpleXSupposedTo");
                            }
                            break;
                        case "Conectores Standar Presente Simple X Be Used To":
                            if(!mso.ConectoresStandarPresenteSimpleXBeUsedTo){
                                updateInfo("ConectoresStandarPresenteSimpleXBeUsedTo");
                            }
                            break;
                        case "Conectores Standar Can Simple X Can Simple":
                            if(!mso.ConectoresStandarCanSimpleXCanSimple){
                                updateInfo("ConectoresStandarCanSimpleXCanSimple");
                            }
                            break;
                        case "Conectores Standar Should Simple X Prensente Simple":
                            if(!mso.ConectoresStandarShouldSimpleXPrensenteSimple){
                                updateInfo("ConectoresStandarShouldSimpleXPrensenteSimple");
                            }
                            break;
                        case "Conectores Standar Should Simple X Prensente Continuo":
                            if(!mso.ConectoresStandarShouldSimpleXPrensenteContinuo){
                                updateInfo("ConectoresStandarShouldSimpleXPrensenteContinuo");
                            }
                            break;
                        case "Conectores Standar Can Simple X Presente Simple":
                            if(!mso.ConectoresStandarCanSimpleXPresenteSimple){
                                updateInfo("ConectoresStandarCanSimpleXPresenteSimple");
                            }
                            break;
                        case "Conectores Standar Can Simple X Presente Continuo":
                            if(!mso.ConectoresStandarCanSimpleXPresenteContinuo){
                                updateInfo("ConectoresStandarCanSimpleXPresenteContinuo");
                            }
                            break;
                        case "Conectores Standar Can Simple X Presente Perfecto":
                            if(!mso.ConectoresStandarCanSimpleXPresentePerfecto){
                                updateInfo("ConectoresStandarCanSimpleXPresentePerfecto");
                            }
                            break;
                        case "Conectores Standar Could Simple X Presente Simple":
                            if(!mso.ConectoresStandarCouldSimpleXPresenteSimple){
                                updateInfo("ConectoresStandarCouldSimpleXPresenteSimple");
                            }
                            break;
                        case "Conectores Standar Could Simple X Presente Continuo":
                            if(!mso.ConectoresStandarCouldSimpleXPresenteContinuo){
                                updateInfo("ConectoresStandarCouldSimpleXPresenteContinuo");
                            }
                            break;
                        case "Conectores Standar Presente Simple X Por Sujeto":
                            if(!mso.ConectoresStandarPresenteSimpleXPorSujeto){
                                updateInfo("ConectoresStandarPresenteSimpleXPorSujeto");
                            }
                            break;

                        case "Conectores Standar Presente Simple X Por Objeto":
                            if(!mso.ConectoresStandarPresenteSimpleXPorObjeto){
                                updateInfo("ConectoresStandarPresenteSimpleXPorObjeto");
                            }
                            break;
                        case "Conectores Standar Presente Simple X Por Preposicion":
                            if(!mso.ConectoresStandarPresenteSimpleXPorPreposicion){
                                updateInfo("ConectoresStandarPresenteSimpleXPorPreposicion");
                            }
                            break;
                        case "Conectores Standar Presente Simple X Interferencia Reflexiva":
                            if(!mso.ConectoresStandarPresenteSimpleXInterferenciaReflexiva){
                                updateInfo("ConectoresStandarPresenteSimpleXInterferenciaReflexiva");
                            }
                            break;



                    }
                }
            }

            private void updateInfo(String estructura) {
                double prom = sum / 5;
                division = mso.TransCounter / total;
                result = division * 100;
                mso.TransCounter++; // sube el counter 1
                userdb.put(estructura,true);// cambia valor a veradero
                userdb.put("TransCounter",mso.TransCounter);
                userdb.put("AvanceTrans",result);
                userdb.put("tdrTrans",prom);
                uid.document("Scores Trans").update(userdb);
            }
        });

    }
    double division,result;
    String [] placeHolder = new String[]{"Black Fathers"};
    public void showRewardedAd2() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                // Handle the reward.
                prefs.setHasSeenAd(true);
                if(isFromLessonPlan){
                    Intent intent = new Intent(this, Availability2023.class);
                    intent.putExtra("class",placeHolder);
                    intent.putExtra("typeFromLessonPlan",true);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(this, Transicion2023.class);
                    startActivity(intent);
                }
            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
            prefs.setHasSeenAd(true);
            Toast.makeText(this, "Quieres la versión sin interrupciones?", Toast.LENGTH_SHORT).show();

            Intent intento = new Intent(Transicion2023.this,Premium2023.class);
            startActivity(intento);
        }
    }
    public void showRewardedAd3() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {

                prefs.setHasSeenAd(true);
                Intent intent = new Intent(this, Transicion2023.class);
                intent.putExtra("isStillOptions",true);
                intent.putExtra("class",selection);
                intent.putExtra("counter",7);
                intent.putExtra("correctCounter",correctDc);
                startActivity(intent);
            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
            prefs.setHasSeenAd(true);
            Toast.makeText(this, "Quieres la versión sin interrupciones?", Toast.LENGTH_SHORT).show();

            Intent intento = new Intent(Transicion2023.this,Premium2023.class);
            startActivity(intento);
        }
    }
    private RewardedAd mRewardedAd;
    // ca-app-pub-3940256099942544/5224354917 test ad
    // ca-app-pub-9126282069959189/7364100992 test ad

    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-9126282069959189/7364100992", adRequest,
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

                Intent intento = new Intent(Transicion2023.this,Premium2023.class);
                startActivity(intento);



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
                showRewardedAd2();
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
                Intent intento = new Intent(Transicion2023.this,Premium2023.class);
                startActivity(intento);



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
                showRewardedAd3();
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
    Intent reciver;
    boolean quierePracticarSpeaking;
    public void showOptions(View view){

        reciver= getIntent();
        if(reciver.getBooleanExtra("isStillOptions",false)){
            if(quierePracticarSpeaking){
                dialogueCounter=0;
                correctDc=0;
            }else{
                dialogueCounter=7;
                correctDc=reciver.getIntExtra("correctCounter",0);

            }
        }
        if(dificultyChanged){
            practiceOG();
        }else{
            practice();
            btn_emp_lay.setVisibility(View.GONE);
            spanish_lay.setVisibility(View.VISIBLE);
            option_buttons_lay.setVisibility(View.VISIBLE);
        }

    }
    public void practice(){
        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE   );
        switch (selection) {
            case "Random":
                NewMethods meth = new NewMethods();
                meth.conectorMethod();
                String Answer1= meth.gene;
                meth.conectorMethod();
                String Answer2= meth.gene;
                meth.conectorMethod();
                String Answer3= meth.gene;
                setTextToButtonsHandleOnClick(meth,"conectorMethod",Answer1,Answer2,Answer3);


                break;

        }
    }
    String correctAnswer;
    Button option1Btn,option2Btn,option3Btn,option4Btn;
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
        ttr = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = ttr.setLanguage(spanish);
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
                            ttr.speak("como dirías    " + gen1.gens, 0, null, "zero");
                        }

                    }
                });
    }

    private void checkAnswer(Button button, String selectedAnswer, String correctAnswer) {
        if (selectedAnswer.equals(correctAnswer)) {
            showDialog(button, "Correct!", "Continue", correctAnswer, true, dialogueCounter);

            button.setBackgroundColor(Color.GREEN);
            sayThis(correctAnswer, Locale.ENGLISH);
            correctDc++;
        } else {
            showDialog(button, "Incorrect. The correct answer is: " + correctAnswer, "Continue", correctAnswer, false, dialogueCounter);
            button.setBackgroundColor(Color.RED);
        }
        dialogueCounter++;

        if(dialogueCounter==7 &&prefs.getPremium()==0){
            dialogueShowRewardedAd3("Ver anuncio para desbloquear","Cipm Premium","Ver anuncio");

        }else if(dialogueCounter>7){
            if (dialogueCounter == 10) {
                avrScore = (double) correctDc / dialogueCounter;

                if (avrScore >= 0.6) {
                    // User got at least 6 out of 10 correct answers (60%)
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
            dificultyChanged=true;
            alertDialog.dismiss();
            option_buttons_lay.setVisibility(View.GONE);

            practiceOG();
        });

        // Set a listener to handle the case when the dialog is dismissed
        alertDialog.setOnDismissListener(dialog -> {
            btn.setBackgroundResource(R.drawable.borde_azul);
        });

        alertDialog.show();
    }

    int noseCounter;
    public void nose(View view){
        noseCounter++;
        if(noseCounter>2){
            dialogueMasFacil("Te Gustaría algo mas fácil? o ver un tutorial para usar esta actividad","Algo más fácil","Seguir aqui");

        }else {

            noSeBtnLay.setVisibility(View.GONE);
            checkanswer();
        }

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
                        dialog.dismiss();
                        noseCounter=0;
                        dificultyChanged= false;
                        mic.setVisibility(View.GONE);
                        noSeBtnLay.setVisibility(View.GONE);
                        btn_emp_lay.setVisibility(View.GONE);
                        spanish_lay.setVisibility(View.VISIBLE);
                        option_buttons_lay.setVisibility(View.VISIBLE);
                        practice();
                    }
                });
            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);
        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.GRAY); // Set the background color
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



}