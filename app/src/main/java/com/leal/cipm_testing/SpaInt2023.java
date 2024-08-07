package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
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

import org.jetbrains.annotations.Nullable;

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
public class SpaInt2023 extends AppCompatActivity {
    String t0, t1, t2, t3, t4, t5, t6;
    private ActivityResultLauncher<Intent> speechRecognitionLauncher;

    LinearLayout vf;
    VideoView vv;
    Map<String, Object> userhas = new HashMap<>();

    LinearLayout spanish_lay;
    LinearLayout input_lay;
    LinearLayout opclay;
    LinearLayout respdecir;
    LinearLayout resppass;
    LinearLayout respinc;
    LinearLayout respescu;
    LinearLayout answer_lay;
    LinearLayout respescu2;
    LinearLayout btn_emp_lay;
    LinearLayout btns_lay;
    LinearLayout btn_check_lay;
    LinearLayout btn_intent_lay;
    LinearLayout answer_pos;

    Button emp;
    Button btn_check;

    Spinner spin;
    Spinner spin2;
    Spinner spin3;

    LinearLayout txt_exp_est;
    TextView text_exp;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView engtx;
    TextView sptx;
    TextView txteng1;
    TextView txteng2;
    TextView txteng3;
    TextView txteng4;
    TextView txteng5;
    TextView txteng6;
    TextView txteng7;

    EditText answerinput;
    Prefs prefs;
    String selection;
    String selection2="Present Simple";
    String selection3="0 a 100";

    TextToSpeech ttr;
    TextToSpeech tt1;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon;
    String[] ArrayWithElementRemoved;
    FirebaseAuth mAuth;
    int PositionOfElementsLeft=0;
    String[] temp= {"Por Sujeto", "Por Preposición", "Por Objeto","Interferencia Reflexiva",
            "Interferencia Pasiva"};
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String userid;
    boolean isCustom;
    boolean personalizedPlan;
    ArrayAdapter<String> adapter;
    ArraysdeLosPlanesPersonalizados arrayGetter ;
    DocumentReference docref ;
    boolean isplanintermedio,isFromListeningPlan;
    boolean isFromListeningPlanDb;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan,isplanintermedioFromDb;
    VocabModeloPersistencia vmp= new VocabModeloPersistencia();
    int condicionparapasar;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    VideoPlayer video_player = new VideoPlayer();
    DocumentReference scoresSpintDocRef;
    Timer timer;
    TimerTask timerTask;
    Double timen = 0.0;
    TextView tdr,tdrnumero;
    double prom;
    int roundedMilliseconds;
    CollectionReference uid;

    double division,result;
    double one;
    double two;
    double three;
    double four ;
    double five;
    double secondsWithDecimal;
    int counterDB;
    Intent reciver;

    LinearLayout rangoLayout,option_btns_layout;
    Button option1Btn,option2Btn,option3Btn,option4Btn,option5Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spa_int2023);

        rangoLayout=findViewById(R.id.rangoSpinnerLayout);
        rangoLayout.setVisibility(View.GONE);
        option_btns_layout= findViewById(R.id.button_layout);
        spanish_lay =  findViewById(R.id.spanish_lay);
        input_lay =  findViewById(R.id.input_lay);
        opclay =  findViewById(R.id.opclay);
        respdecir =  findViewById(R.id.respdecir);
       // resppass =  findViewById(R.id.resppass);
//        respinc =  findViewById(R.id.respinc);
        respescu =  findViewById(R.id.respescu);
        answer_lay =  findViewById(R.id.answer_lay);
        respescu2 =  findViewById(R.id.respescu2);
        btn_emp_lay =  findViewById(R.id.btn_emp_lay);
        btns_lay =  findViewById(R.id.btns_lay);
        btn_check_lay =  findViewById(R.id.btn_check_lay);
        btn_emp_lay.setVisibility(View.GONE);
        btn_intent_lay =  findViewById(R.id.btn_intent_lay);
        answer_pos =  findViewById(R.id.answer_pos);
        condicionparapasar=0;

        option1Btn= findViewById(R.id.answer_button_1);
        option2Btn= findViewById(R.id.answer_button_2);
        option3Btn= findViewById(R.id.answer_button_3);
        option4Btn= findViewById(R.id.answer_button_4);
        option5Btn= findViewById(R.id.answer_button_5);

        tdr = findViewById(R.id.TRPsp);
        tdr.setVisibility(View.GONE);
        tdrnumero = findViewById(R.id.TRPNumbersp);
        tdrnumero.setVisibility(View.GONE);
        timer = new Timer();

        sptx=findViewById(R.id.spanishsentence);
        engtx=findViewById(R.id.txteng);

         emp = findViewById(R.id.emp);
        btn_check = findViewById(R.id.btn_check);

        answerinput = findViewById(R.id.answerinput);
        answerinput.setVisibility(View.GONE);

        spin = findViewById(R.id.spinuno);
        txt1 =  findViewById(R.id.textspin1);

        spin2 = findViewById(R.id.spinrango);
        txt2 = findViewById(R.id.textspin2);

        spin3 =  findViewById(R.id.spinest);
        txt3 =  findViewById(R.id.textspin3);
        arrayGetter= new ArraysdeLosPlanesPersonalizados();
        txteng1 =  findViewById(R.id.txteng1);
        txteng2 =  findViewById(R.id.txteng2);
        txteng3 =  findViewById(R.id.txteng3);
        txteng4 =  findViewById(R.id.txteng4);
        txteng5 =  findViewById(R.id.txteng5);
        txteng6 =  findViewById(R.id.txteng6);
        txteng7 = findViewById(R.id.txteng7);

        mAuth= FirebaseAuth.getInstance();

        userid = mAuth.getCurrentUser().getUid();

        docref= db.collection(userid).document("WhereisStudent");
        temp= arrayGetter.SpIntArray;
        prefs = new Prefs(this);
        one= 0;
        two =0;
        three=0;
        four=0;
        five=0;
        counterDB=0;

        if(prefs.getPremium()==0){
            loadRewardedAd();
        }

        loadRewardedAd();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView6, video_player)
                .commit();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);
        uid = db.collection(userid);
        escribirEnelInputTextResultadodeUtterance();
        PremiumAndArrayControler();



    }

    //DB FUNC
    private void PremiumAndArrayControler() {
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        isplanintermedio=reciver.getBooleanExtra("PlanIntermedioStandard",false);
        isFromListeningPlan= reciver.getBooleanExtra("BasicListeningPlan",false);
        isFromListeningPlanDb= reciver.getBooleanExtra("isFromListeningDb",false);
        isplanintermedioFromDb=reciver.getBooleanExtra("isFromIntermedioStandarPlan",false);


        if(personalizedPlan){
            if(isCustom){
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            txt1.setText(selection);
                            ocultarlay();

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rangoPremium, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adapter2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection3 = "0 a 100";
                            txt3.setText(selection3);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin3.setAdapter(adapter3);
                    spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection2 = "Present Simple";
                            txt2.setText(selection2);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
                else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user

                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=  documentSnapshot.toObject(VocabModeloPersistencia.class);
                            assert vmp != null;
                            temp= vmp.resultArray.toArray(new String[0]);
                            adapter = new ArrayAdapter<String>(SpaInt2023.this, android.R.layout.simple_list_item_1, temp);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    txt1.setText(selection);

                                   /* vv.setVisibility(View.GONE);
                                    vf.setVisibility(View.VISIBLE);*/
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });

                        }
                    });

                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adapter2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection3 = "0 a 100";
                            txt3.setText(selection3);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin3.setAdapter(adapter3);
                    spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection2 = "Present Simple";
                            txt2.setText(selection2);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
            }
            else{

                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            txt1.setText(selection);
                            ocultarlay();

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rangoPremium, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adapter2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection3 = "0 a 100";
                            txt3.setText(selection3);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin3.setAdapter(adapter3);
                    spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection2 = "Present Simple";
                            txt2.setText(selection2);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
                else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user


                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            txt1.setText(selection);

                            ocultarlay();


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adapter2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection3 = "0 a 100";
                            txt3.setText(selection3);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin3.setAdapter(adapter3);
                    spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection2 = "Present Simple";
                            txt2.setText(selection2);
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

        isInSpanishInt = true;
        if(isFromListeningPlan ||isFromListeningPlanDb){
            isListeningPlan=true;
        }
        if(isplanintermedio||isplanintermedioFromDb){
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
            Intent intent = new Intent(SpaInt2023.this, Transicion2023.class);
            intent.putExtra("isThePlanPersonalized",personalizedPlan);
            intent.putExtra("isCustom",false);
            intent.putExtra("planintermedio",isplanintermedio||isplanintermedioFromDb);
            intent.putExtra("BasicListeningPlan",isFromListeningPlan||isFromListeningPlanDb);

            startActivity(intent);
        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
        }
    }

    //EMPIEZA ESTRUCTURA
    boolean isFromLessonPlan;
    String[] classFromLesson;

    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        prefs.setHasSeenAd(true);
        reciver= getIntent();
         isFromLessonPlan = reciver.getBooleanExtra("typeFromLessonPlan", false);
        classFromLesson=reciver.getStringArrayExtra("class");


        if(prefs.getPremium()==1){

            if(isFromLessonPlan){

                 adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classFromLesson);

            }else {
                temp= arrayGetter.SpIntArray;
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

            }

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

            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin2.setAdapter(adapter2);
            spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = "0 a 100";
                    txt3.setText(selection3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

            ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin3.setAdapter(adapter3);
            spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection2 = "Present Simple";
                    txt2.setText(selection2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

            //USUARIO BASICO
        } else if (prefs.getPremium()==0){

            if(isFromLessonPlan){
                prefs.setHasSeenAd(true);
                reciver= getIntent();

              adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classFromLesson);

            }else {
                 adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

            }
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


            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin2.setAdapter(adapter2);
            spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = "0 a 100";
                    txt3.setText(selection3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


            ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin3.setAdapter(adapter3);
            spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection2 = "Present Simple";
                    txt2.setText(selection2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }
    }

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected1(){
        dificultyChanged=false;
        selection = spin.getSelectedItem().toString();
        txt1.setText(selection);
        btns_lay.setVisibility(View.GONE);
        btn_intent_lay.setVisibility(View.GONE);
        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE);

        answer_pos.setVisibility(View.GONE);


        if(video_player != null) {
            video_player.updateFragmentStateStructure(selection);

        }

        if(selection.equals("Tutorial")){
            text_exp.setText("Seleccione una estructura y rango para continuar con la practica");
            btn_emp_lay.setVisibility(View.GONE);
            txt_exp_est.setVisibility(View.VISIBLE);
            ocultartodo();
        }else {
            //btn_emp_lay.setVisibility(View.VISIBLE);
            videoPlayer();
        }
    }

    //ACTIVA LA INTERFAZ PARA EL VIDEO
    public void videoPlayer(){

        ocultarlay();
    }

    //TOMA TODO EL ESPACIO PARA EL SPINNER 1, 2, 3
    public void activaSpinner1(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }
    public void activaSpinner2(View v){
        Spinner mySpinner = findViewById(R.id.spinrango);
        mySpinner.performClick();
    }
    public void activaSpinner3(View v){
        Spinner mySpinner = findViewById(R.id.spinest);
        mySpinner.performClick();
    }

    public void practice(View vista) {
        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE   );

        answer_lay.setVisibility(View.GONE);
        answer_pos.setVisibility(View.GONE);
        EditText text = (EditText)findViewById(R.id.answerinput);

        btn_intent_lay.setVisibility(View.GONE);
        text.setText("");
        btns_lay.setVisibility(View.GONE);
      //  resppass.setVisibility(View.GONE);
      //  respinc.setVisibility(View.GONE);
        answerinput.setBackgroundColor(Color.parseColor("#FFFFFF"));
        opclay.setBackgroundColor(Color.parseColor("#FFFFFF"));

        if(!selection.equals("Tutorial")){
            mostrarlay();
            switch (selection) {
                case "Por Preposición":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    NewNounClass v = new NewNounClass();
                                    v.GenIntPorPrep();
                                    sptx.setText(v.gens);
                                    engtx.setText(v.gene);// he
                                    t0= v.gene2;
                                    txteng1.setText(t0);
                                    t1=v.gene2;
                                    txteng2.setText(t1);
                                    t2= "n.gene3";
                                    txteng3.setText(t2);
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        tt1.speak("como se podría decir    "+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);


                                                    }

                                                }
                                            });

                                    break;


                            }

                            break;
                    }

                    break;
                case "Por Sujeto":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        NewVerbClass v= new NewVerbClass();

                                                        v.GenIntPorSujeto();

                                                        sptx.setText(v.gens);
                                                        engtx.setText(v.gene);

                                                        t0= v.gene;
                                                        txteng1.setText(t0);
                                                        t1=v.gene2;
                                                        txteng2.setText(t1);
                                                        t2= "n.gene3";
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;


                            }

                            break;
                    }
                    break;

                case "Por Objeto":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        NewVerbClass v = new NewVerbClass();
                                                        v.GenIntPorObj();
                                                        sptx.setText(v.gens);
                                                        engtx.setText(v.gene);// he
                                                        t0= v.gene;
                                                        txteng1.setText(t0);
                                                        t1= v.gene2;
                                                        txteng2.setText(t1);
                                                        t2= v.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;


                            }

                            break;
                    }
                    break;

                case "Interferencia Reflexiva":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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

                                                        int rx = (int)(Math.random()*3);
                                                        switch (rx){
                                                            case 0:
                                                                VerbLists v = new VerbLists();
                                                                v.GenReflInt3();
                                                                sptx.setText(v.gens);
                                                                engtx.setText(v.gene);// he
                                                                t0= v.gene;
                                                                txteng1.setText(t0);
                                                                t1= v.gene2;
                                                                txteng2.setText(t1);
                                                                t2= "n.gene3";
                                                                txteng3.setText(t2);
                                                                t3= "null";
                                                                t4= "null";
                                                                t5= "null";
                                                                t6= "null";
                                                                break;

                                                            case 1:
                                                                NewVerbClass v2 =  new NewVerbClass();
                                                                v2.GenIntReflx1();
                                                                sptx.setText(v2.gens);
                                                                engtx.setText(v2.gene);// he
                                                                t0= v2.gene;
                                                                txteng1.setText(t0);
                                                                t1= v2.gene2;
                                                                txteng2.setText(t1);
                                                                t2= "n.gene3";
                                                                txteng3.setText(t2);
                                                                t3= "null";
                                                                t4= "null";
                                                                t5= "null";
                                                                t6= "null";
                                                                break;

                                                            case 2:
                                                                NewVerbClass v3 =  new NewVerbClass();
                                                                v3.GenIntReflx2();
                                                                sptx.setText(v3.gens);
                                                                engtx.setText(v3.gene);// he
                                                                t0= v3.gene;
                                                                txteng1.setText(t0);
                                                                t1= v3.gene2;
                                                                txteng2.setText(t1);
                                                                t2= "n.gene3";
                                                                txteng3.setText(t2);
                                                                t3= "null";
                                                                t4= "null";
                                                                t5= "null";
                                                                t6= "null";
                                                                break;
                                                        }



                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;


                            }

                            break;
                    }
                    break;

                case "Interferencia Pasiva":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        VerbLists n = new VerbLists();
                                                        n.GenIntPasiva();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene7);// he
                                                        t0= n.gene7;
                                                        txteng1.setText(t0);
                                                        t1= n.gene6;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= n.gene4;
                                                        txteng4.setText(t3);
                                                        t4= n.gene5;
                                                        txteng5.setText(t4);
                                                        t5= n.gene2;
                                                        txteng6.setText(t5);
                                                        t6=n.gene;
                                                        txteng7.setText(t6);


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });
                                    break;


                            }

                            break;
                    }
                    break;

            }
        }else{
            Toast.makeText(this, "estas en tutorial, elige una interferencia", Toast.LENGTH_SHORT).show();
        }

        //engtx.setVisibility(View.INVISIBLE);

    }
    public void practiceOG() {
        tdr.setVisibility(View.GONE);
        tdrnumero.setVisibility(View.GONE   );

        answer_lay.setVisibility(View.GONE);
        answer_pos.setVisibility(View.GONE);
        EditText text = (EditText)findViewById(R.id.answerinput);

        btn_intent_lay.setVisibility(View.GONE);
        text.setText("");
        btns_lay.setVisibility(View.GONE);
       // resppass.setVisibility(View.GONE);
      //  respinc.setVisibility(View.GONE);
        answerinput.setBackgroundColor(Color.parseColor("#FFFFFF"));
        opclay.setBackgroundColor(Color.parseColor("#FFFFFF"));

        if(!selection.equals("Tutorial")){
            mostrarlay();
            switch (selection) {
                case "Por Preposición":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    Generator n = new Generator();
                                    n.generatepsporprep();
                                    sptx.setText(n.gens);
                                    engtx.setText(n.gene);// he
                                    t0= n.gene;
                                    txteng1.setText(t0);
                                    t1=n.gene2;
                                    txteng2.setText(t1);
                                    t2= n.gene3;
                                    txteng3.setText(t2);
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        tt1.speak("como se podría decir    "+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);


                                                    }

                                                }
                                            });

                                    break;
                                case "100 a 200":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator2 n = new Generator2();
                                                        n.generatepsporprep();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0=n.gene;
                                                        txteng1.setText(t0);
                                                        t1=  n.gene2;
                                                        txteng1.setText(t1);
                                                        t2= n.gene3;
                                                        txteng1.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;

                            }

                            break;
                    }

                    break;
                case "Por Sujeto":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator n = new Generator();
                                                        n.generatepsporSujeto();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;
                                case "100 a 200":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator2 n = new Generator2();
                                                        n.generatepsporSujeto();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;

                            }

                            break;
                    }
                    break;

                case "Por Objeto":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator n = new Generator();
                                                        n.generatepsporObjeto();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;
                                case "100 a 200":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator2 n = new Generator2();
                                                        n.generatepsporObjeto();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;

                            }

                            break;
                    }
                    break;

                case "Interferencia Reflexiva":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator n = new Generator();
                                                        n.generatepsporReflexivos();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;
                                case "100 a 200":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator2 n = new Generator2();
                                                        n.generatepsporReflexivos();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= "null";
                                                        t4= "null";
                                                        t5= "null";
                                                        t6= "null";


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;

                            }

                            break;
                    }
                    break;

                case "Interferencia Pasiva":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator n = new Generator();
                                                        n.GenIntPorPasiva();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= n.gene4;
                                                        txteng4.setText(t3);
                                                        t4= n.gene5;
                                                        txteng5.setText(t4);
                                                        t5= n.gene6;
                                                        txteng6.setText(t5);
                                                        t6=n.gene7;
                                                        txteng7.setText(t6);


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });
                                    break;
                                case "100 a 200":
                                    tt1= new TextToSpeech(getApplicationContext(),
                                            new TextToSpeech.OnInitListener() {
                                                @Override
                                                public void onInit(int i) {
                                                    Locale spanish = new Locale("es", "MX");
                                                    if (i == TextToSpeech.SUCCESS) {
                                                        int lang = tt1.setLanguage(spanish);
                                                        tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                                                        Generator2 n = new Generator2();
                                                        n.GenIntPorPasiva();
                                                        sptx.setText(n.gens);
                                                        engtx.setText(n.gene);// he
                                                        t0= n.gene;
                                                        txteng1.setText(t0);
                                                        t1= n.gene2;
                                                        txteng2.setText(t1);
                                                        t2= n.gene3;
                                                        txteng3.setText(t2);
                                                        t3= n.gene4;
                                                        txteng4.setText(t3);
                                                        t4= n.gene5;
                                                        txteng5.setText(t4);
                                                        t5= n.gene6;
                                                        txteng6.setText(t5);
                                                        t6=n.gene7;


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como se podría decir"+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });
                                    break;

                            }

                            break;
                    }
                    break;

            }
        }else{
            Toast.makeText(this, "estas en tutorial, elige una interferencia", Toast.LENGTH_SHORT).show();
        }

        //engtx.setVisibility(View.INVISIBLE);

    }

    public void ocultartodo(){
        spanish_lay.setVisibility(View.GONE);
        input_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        btns_lay.setVisibility(View.GONE);
        answer_pos.setVisibility(View.GONE);
    }
    public void ocultarlay(){
        spanish_lay.setVisibility(View.GONE);
        input_lay.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
        option_btns_layout.setVisibility(View.GONE);

    }
    public void mostrarlay(){
        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        // btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.VISIBLE);
    }

    public void speakdecir(View vista){
        iniciarentradavoz();

        answerinput.setVisibility(View.VISIBLE);
        btn_check_lay.setVisibility(View.VISIBLE);
        btn_check.setVisibility(View.VISIBLE);
        btn_emp_lay.setVisibility(View.GONE);
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

    int wrongCounter;
    public void checkans(View v){
        wrongCounter++;

        EditText text = (EditText)findViewById(R.id.answerinput);
        String userInput = text.getText().toString();

        if (isAnswerCorrect(userInput, t1, t2, t3, t4, t5, t6, engtx.getText().toString())) {
            {
                //correcto
                setTimeonScreen();
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
                            ttr.speak("answer is correct",TextToSpeech.QUEUE_ADD,null, "one");

                            condicionparapasar++;
                            if(personalizedPlan ){
                                if(condicionparapasar>5){
                                    SubtractSelectionAndSendinfoToDb();
                                    condicionparapasar=0;

                                }else {
                                    Toast.makeText(SpaInt2023.this, "otras " +String.valueOf(6-condicionparapasar)+" correctas para pasar a siguiente estructura", Toast.LENGTH_SHORT).show();
                                }

                            }



                        }
                    }
                });
                answerinput.setBackgroundColor(Color.parseColor("#E6FBEB"));
                opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));
                btn_intent_lay.setVisibility(View.VISIBLE);
                answer_lay.setVisibility(View.GONE);
                btns_lay.setVisibility(View.GONE);
                answer_lay.setVisibility(View.GONE);
                btn_check_lay.setVisibility(View.GONE);
                answer_pos.setVisibility(View.GONE);

              //  resppass.setVisibility(View.VISIBLE);
                respescu.setVisibility(View.GONE);

             //   respinc.setVisibility(View.GONE);
                answer_lay.setVisibility(View.GONE);

                double sum;
                switch (counterDB){
                    case 0:
                        one=secondsWithDecimal;

                        break;

                    case 1:
                        two=secondsWithDecimal;

                        break;

                    case 2:
                        three=secondsWithDecimal;

                        break;

                    case 3:
                        four=secondsWithDecimal;

                        break;
                    case 4:
                        five=secondsWithDecimal;

                        break;

                }
                counterDB++;
                sum = one+two+three+four+five;
                if(counterDB == 3){
                    turnTrue(selection,sum);
                    counterDB=0;

                    if(isFromLessonPlan&&prefs.getPremium()==1){
                        classSelector(selection);
                        if(placeHolder[0].equals("Random")){
                            Intent intent = new Intent(this, Transicion2023.class);
                            intent.putExtra("typeFromLessonPlan",true);
                            intent.putExtra("class",placeHolder);
                            startActivity(intent);
                        }else {
                            Intent intent = new Intent(this, SpaInt2023.class);
                            intent.putExtra("typeFromLessonPlan",true);
                            intent.putExtra("class",placeHolder);
                            startActivity(intent);

                        }
                    }else if(prefs.getPremium()==0){
                        dialogueShowRewardedAd2("Para Seguir usando hay que ver un anuncio","Cipm Premium","Ver anuncio");

                    }


                }

            }
        } else{
            //incorrecto
            ttr = new TextToSpeech(getApplicationContext(),
                    new TextToSpeech.OnInitListener() {
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

                                ttr.speak("answer is incorrect  the answer is    "+engtx.getText().toString().trim(),TextToSpeech.QUEUE_ADD,null,"string");
                                //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                                //with this yet

                                engtx.setTextColor(Color.BLUE);
                                engtx.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String textFromTxteng = engtx.getText().toString();
                                        answerinput.setText(textFromTxteng);
                                    }
                                });
                                if(wrongCounter>2){
                                        dialogueMasFacil("Algo mas facil?","Si","No");
                                        wrongCounter=0;
                                }
                                if(personalizedPlan){
                                    //reset counter?
                                    condicionparapasar=0;
                                }

                            }
                        }
                    });
            answerinput.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));
            answer_lay.setVisibility(View.VISIBLE);
            btns_lay.setVisibility(View.VISIBLE);
            answer_lay.setVisibility(View.VISIBLE);
            btn_intent_lay.setVisibility(View.GONE);
            btn_check_lay.setVisibility(View.VISIBLE);
            answerinput.setVisibility(View.VISIBLE);

       //     resppass.setVisibility(View.GONE);
            respescu.setVisibility(View.GONE);
            respescu2.setVisibility(View.VISIBLE);
          //  respinc.setVisibility(View.VISIBLE);

        }



    }
    private boolean isAnswerCorrect(String answer, String... possibleAnswers) {
        for (String possibleAnswer : possibleAnswers) {
            if (possibleAnswer != null && possibleAnswer.trim().equalsIgnoreCase(answer.trim())) {
                return true;
            }
        }
        return false;
    }

    public void possibleanswers(View view){
        answer_lay.setVisibility(View.GONE);
        answer_pos.setVisibility(View.VISIBLE);
        /*if(engtx.getText().toString().equals("null")){
            engtx.setText("no more possible answers");
        }else if(engtx.getText().equals(t0)){
            engtx.setText(t1);
        } else if(engtx.getText().equals(t1)){
            engtx.setText(t2);
        }else if(engtx.getText().equals(t2)){
            engtx.setText(t3);
        }else if(engtx.getText().equals(t3)){
            engtx.setText(t4);
        }else if(engtx.getText().equals(t4)){
            engtx.setText(t5);
        }else if(engtx.getText().equals(t5)){
            engtx.setText(t6);
        }else if(engtx.getText().equals(t6)){
            engtx.setText(t1);
        }*/

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
                                answerinput.setText(recognizedText);
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
    ModeloSpInt mso;
    public void turnTrue(String CurrentStructure,double sum){
        scoresSpintDocRef = db.collection(userid).document("Scores Spint");
        scoresSpintDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    mso = documentSnapshot.toObject(ModeloSpInt.class);
                    assert mso != null;

                    switch (CurrentStructure){

                        case "Por Sujeto":
                        if(!mso.PorSujeto){
                            updateinfo("PorSujeto");
                        }
                            break;

                        case "Por Preposición":
                            if(!mso.PorPreposición){
                                updateinfo("PorPreposición");
                            }

                            break;

                        case "Por Objeto":
                            if(!mso.PorObjeto){
                                updateinfo("PorObjeto");
                            }
                            break;

                        case "Interferencia Reflexiva":
                            if(!mso.InterferenciaReflexiva){
                                updateinfo("InterferenciaReflexiva");
                            }

                            break;

                        case "Interferencia Pasiva":
                            if(!mso.InterferenciaPasiva){
                                updateinfo("InterferenciaPasiva");
                            }

                            break;


                    }
                }





            }
            public void updateinfo(String estructura){
                double prom = sum / 5;
                division = mso.SpintCounter / 5.0;
                result = division * 100;
                mso.SpintCounter++; // sube el counter 1
                userdb.put(estructura,true);// cambia valor a veradero
                userdb.put("SpintCounter",mso.SpintCounter);
                userdb.put("AvanceSpint",result);
                userdb.put("tdrSpint",prom);
                uid.document("Scores Spint").update(userdb);
            }
        });

    }
    Map<String, Object> userdb = new HashMap<>();
    String[] placeHolder = new String[]{"Default value"};

    public void showRewardedAd2() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                if(isFromLessonPlan){
                   classSelector(selection);
                    if(placeHolder[0].equals("Random")){
                        Intent intent = new Intent(this, Transicion2023.class);
                        intent.putExtra("typeFromLessonPlan",true);
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);
                    }else {
                        Intent intent = new Intent(this, SpaInt2023.class);
                        intent.putExtra("typeFromLessonPlan",true);
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);

                    }
                }else {
                    prefs.setHasSeenAd(true);
                    Intent intent = new Intent(this, SpaInt2023.class);
                    startActivity(intent);
                }


            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
            prefs.setHasSeenAd(true);
            Toast.makeText(this, "Quieres la versión sin interrupciones?", Toast.LENGTH_SHORT).show();

            Intent intento = new Intent(SpaInt2023.this,Premium2023.class);
            startActivity(intento);
        }
    }
    public void showRewardedAd3() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                prefs.setHasSeenAd(true);
                Intent intent = new Intent(this, SpaInt2023.class);
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

            Intent intento = new Intent(SpaInt2023.this,Premium2023.class);
            startActivity(intento);
        }
    }

    private void classSelector(String selection) {

        switch (selection){

            case"Por Sujeto":
                placeHolder = new String[]{"Por Preposición"};

                break;


            case "Por Preposición":
                placeHolder = new String[]{"Por Objeto"};


                break;


            case "Por Objeto":
                placeHolder = new String[]{"Interferencia Reflexiva"};


                break;

            case "Interferencia Reflexiva":
                placeHolder = new String[]{"Interferencia Pasiva"};

                break;


            case "Interferencia Pasiva":
                placeHolder = new String[]{"Random"};

                break;


        }
    }

    // ca-app-pub-3940256099942544/5224354917 test ad
    // ca-app-pub-9126282069959189/3014125580 real ad
    private RewardedAd mRewardedAd;
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-9126282069959189/3014125580", adRequest,
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
    public void   dialogueShowRewardedAd2(String text, String buttonyes, String buttonno){
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

                Intent intento = new Intent(SpaInt2023.this,Premium2023.class);
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
        dialog.setCancelable(false);
        dialog.show();

    }
    public void   dialogueShowRewardedAd3(String text, String buttonyes, String buttonno){
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

                Intent intento = new Intent(SpaInt2023.this,Premium2023.class);
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
        dialog.setCancelable(false);
        dialog.show();

    }

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
        }else {
            option_btns_layout.setVisibility(View.VISIBLE);
            input_lay.setVisibility(View.GONE);
            respdecir.setVisibility(View.GONE);
            answerinput.setVisibility(View.GONE);
            btn_emp_lay.setVisibility(View.GONE);
            btn_check.setVisibility(View.GONE);
            spanish_lay.setVisibility(View.VISIBLE);
            practice();
        }





    }
    public void showOptions(){
        if(dificultyChanged){
            practiceOG();
        }else {

            option_btns_layout.setVisibility(View.VISIBLE);
            input_lay.setVisibility(View.GONE);
            respdecir.setVisibility(View.GONE);
            answerinput.setVisibility(View.GONE);
            btn_emp_lay.setVisibility(View.GONE);
            btn_check.setVisibility(View.GONE);
            spanish_lay.setVisibility(View.VISIBLE);
            btn_intent_lay.setVisibility(View.GONE);
            btns_lay.setVisibility(View.GONE);
            answer_lay.setVisibility(View.GONE);
            answer_pos.setVisibility(View.GONE);
            practice();
        }



    }
    public void practice() {
        String wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4,sp,rightAnswer;
        if(!selection.equals("Tutorial")){
            switch (selection) {
                case "Por Preposición":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    NewNounClass v = new NewNounClass();
                                    v.GenIntPorPrep();
                                    String u= v.gene;
                                    v.GenIntPorPrep();
                                     wrongAnswer2= v.gene;
                                    v.GenIntPorPrep();
                                     wrongAnswer3= v.gene;
                                    v.GenIntPorPrep();
                                     wrongAnswer4= v.gene;
                                    v.GenIntPorPrep();
                                     rightAnswer= v.gene;
                                     sp= v.gens;
                                    setTextToButtonsHandleOnClickAllStrings(sp,rightAnswer,u,wrongAnswer2,wrongAnswer3,wrongAnswer4);
                                    break;

                            }

                            break;
                    }

                    break;
                case "Por Sujeto":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    Generator gen = new Generator();
                                    gen.generatepsporSujeto();
                                     wrongAnswer1= gen.gene;
                                    gen.generatepsporSujeto();
                                     wrongAnswer2= gen.gene;
                                    gen.generatepsporSujeto();
                                     wrongAnswer3= gen.gene;
                                    gen.generatepsporSujeto();
                                     wrongAnswer4= gen.gene;
                                    setTextToButtonsHandleOnClick(gen,"generatepsporSujeto",wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4);


                                    break;



                            }

                            break;
                    }
                    break;

                case "Por Objeto":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    NewVerbClass vo = new NewVerbClass();
                                    vo.GenIntPorObj();
                                     wrongAnswer1=vo.gene;
                                    vo.GenIntPorObj();
                                     wrongAnswer2=vo.gene;
                                    vo.GenIntPorObj();
                                     wrongAnswer3=vo.gene;
                                    vo.GenIntPorObj();
                                     wrongAnswer4=vo.gene;
                                    vo.GenIntPorObj();
                                     rightAnswer=vo.gene;
                                     sp = vo.gens;
                                    setTextToButtonsHandleOnClickAllStrings(sp,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4);
                                    break;



                            }

                            break;
                    }
                    break;

                case "Interferencia Reflexiva":
                    switch (selection2){

                        case "Present Simple":
                            switch (selection3){

                                case "0 a 100":
                                    int rx = (int)(Math.random()*3);
                                    switch (rx){

                                        case 0:
                                            VerbLists v = new VerbLists();
                                            v.GenReflInt3();
                                             wrongAnswer1= v.gene;
                                            v.GenReflInt3();
                                             wrongAnswer2= v.gene;
                                            v.GenReflInt3();
                                             wrongAnswer3= v.gene;
                                            v.GenReflInt3();
                                             wrongAnswer4= v.gene;
                                            v.GenReflInt3();
                                             rightAnswer= v.gene;
                                             sp= v.gens;
                                            setTextToButtonsHandleOnClickAllStrings(sp,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4);


                                            break;

                                        case 1:
                                            NewVerbClass v2 =  new NewVerbClass();
                                            v2.GenIntReflx1();
                                             wrongAnswer1=v2.gene;
                                            v2.GenIntReflx1();
                                             wrongAnswer2=v2.gene;
                                            v2.GenIntReflx1();
                                             wrongAnswer3=v2.gene;
                                            v2.GenIntReflx1();
                                             wrongAnswer4=v2.gene;
                                            v2.GenIntReflx1();
                                             rightAnswer=v2.gene;
                                             sp=v2.gens;
                                            setTextToButtonsHandleOnClickAllStrings(sp,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4);



                                            break;

                                        case 2:
                                            NewVerbClass v3 =  new NewVerbClass();
                                            v3.GenIntReflx2();
                                            wrongAnswer1=v3.gene;
                                            v3.GenIntReflx2();
                                            wrongAnswer2=v3.gene;
                                            v3.GenIntReflx2();
                                            wrongAnswer3=v3.gene;
                                            v3.GenIntReflx2();
                                            wrongAnswer4=v3.gene;
                                            v3.GenIntReflx2();
                                            rightAnswer=v3.gene;
                                            sp=v3.gens;
                                            setTextToButtonsHandleOnClickAllStrings(sp,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4);



                                            break;
                                    }
                                    break;



                            }

                            break;
                    }
                    break;

                case "Interferencia Pasiva":
                    switch (selection2){
                        case "Present Simple":
                            switch (selection3){
                                case "0 a 100":
                                    VerbLists n = new VerbLists();
                                    wrongAnswer1=getPassiveEnglishSentence(n);
                                    wrongAnswer2=getPassiveEnglishSentence(n);
                                    wrongAnswer3=getPassiveEnglishSentence(n);
                                    wrongAnswer4=getPassiveEnglishSentence(n);
                                    rightAnswer=getPassiveEnglishSentence(n);
                                    n.GenIntPasiva();
                                    int pas=(int)(Math.random()*7);
                                    switch (pas){
                                        case 0:
                                            rightAnswer=n.gene;
                                            break;
                                        case 1:
                                            rightAnswer=n.gene2;
                                            break;
                                        case 2:
                                            rightAnswer=n.gene3;
                                            break;
                                        case 3:
                                            rightAnswer=n.gene4;
                                            break;
                                        case 4:
                                            rightAnswer=n.gene5;
                                            break;
                                        case 5:
                                            rightAnswer=n.gene6;
                                            break;
                                        case 6:
                                            rightAnswer=n.gene7;
                                            break;

                                    }
                                    sp=n.gens;
                                    setTextToButtonsHandleOnClickAllStrings(sp,rightAnswer,wrongAnswer1,wrongAnswer2,wrongAnswer3,wrongAnswer4);


                                    break;



                            }

                            break;
                    }
                    break;

            }
        }
    }

    String correctAnswer= "";
    int dialogueCounter = 0, correctDc = 0;
    double avrScore;
    boolean dificultyChanged;
    public String getPassiveEnglishSentence(VerbLists object){
        object.GenIntPasiva();
        int r  = (int) (Math.random()*7);
        String engSentence="";
        switch (r){
            case 0:
                engSentence= object.gene;

                break;
            case 1:
                engSentence= object.gene2;
                break;
            case 2:
                engSentence= object.gene3;
                break;
            case 3:
                engSentence=  object.gene4;

                break;
            case 4:
                engSentence= object.gene5;
                break;
            case 5:
                engSentence= object.gene6;
                break;
            case 6:
                engSentence= object.gene7;
                break;




        }

        return engSentence;
    }
    private void setTextToButtonsHandleOnClick(Generator gen1,String methodName,String wrongAnswer1,String wrongAnswer2,String wrongAnswer3,String wrongAnswer4) {
        try {

            Method method = gen1.getClass().getMethod(methodName);
            method.invoke(gen1);


        } catch (NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }

        String[] options = new String[5];
        Random random = new Random();
        int correctAnswerPosition = random.nextInt(4);
        correctAnswer = gen1.gene;
        options[correctAnswerPosition] = correctAnswer;

        int optionIndex = 0;
        for (int i = 0; i < options.length; i++) {
            if (i != correctAnswerPosition) {
                options[i] = new String[]{wrongAnswer1, wrongAnswer2, wrongAnswer3,wrongAnswer4}[optionIndex++];
            }
        }


        sptx.setText(gen1.gens);
        engtx.setText(gen1.gene);

        option1Btn.setText(options[0]);
        option2Btn.setText(options[1]);
        option3Btn.setText(options[2]);
        option4Btn.setText(options[3]);
        option5Btn.setText(options[4]);

        option1Btn.setOnClickListener(v -> checkAnswer(option1Btn,option1Btn.getText().toString(), correctAnswer));
        option2Btn.setOnClickListener(v -> checkAnswer(option2Btn,option2Btn.getText().toString(), correctAnswer));
        option3Btn.setOnClickListener(v -> checkAnswer(option3Btn,option3Btn.getText().toString(), correctAnswer));
        option4Btn.setOnClickListener(v -> checkAnswer(option4Btn,option4Btn.getText().toString(), correctAnswer));
        option5Btn.setOnClickListener(v -> checkAnswer(option5Btn,option5Btn.getText().toString(), correctAnswer));
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
                            ttr.speak("como se podría decir    " + gen1.gens, 0, null, "zero");
                        }

                    }
                });
    }
    private void setTextToButtonsHandleOnClickAllStrings(String sp,String rightAnswer,String wrongAnswer1,String wrongAnswer2,String wrongAnswer3,String wrongAnswer4) {


        String[] options = new String[5];
        Random random = new Random();
        int correctAnswerPosition = random.nextInt(4);
        correctAnswer= rightAnswer;
        options[correctAnswerPosition] = correctAnswer;

        int optionIndex = 0;
        for (int i = 0; i < options.length; i++) {
            if (i != correctAnswerPosition) {
                options[i] = new String[]{wrongAnswer1, wrongAnswer2, wrongAnswer3,wrongAnswer4}[optionIndex++];
            }
        }


        sptx.setText(sp);
        engtx.setText(rightAnswer);

        option1Btn.setText(options[0]);
        option2Btn.setText(options[1]);
        option3Btn.setText(options[2]);
        option4Btn.setText(options[3]);
        option5Btn.setText(options[4]);

        option1Btn.setOnClickListener(v -> checkAnswer(option1Btn,option1Btn.getText().toString(), correctAnswer));
        option2Btn.setOnClickListener(v -> checkAnswer(option2Btn,option2Btn.getText().toString(), correctAnswer));
        option3Btn.setOnClickListener(v -> checkAnswer(option3Btn,option3Btn.getText().toString(), correctAnswer));
        option4Btn.setOnClickListener(v -> checkAnswer(option4Btn,option4Btn.getText().toString(), correctAnswer));
        option5Btn.setOnClickListener(v -> checkAnswer(option5Btn,option5Btn.getText().toString(), correctAnswer));
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
                            ttr.speak("como se podría decir    " + sp, 0, null, "zero");
                        }

                    }
                });
    }
    private void checkAnswer(Button button, String selectedAnswer, String correctAnswer) {
        dialogueCounter++;

        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0)  {
            dialogueShowRewardedAd3("Para Seguir usando hay que ver un anuncio","Cipm Premium","Ver anuncio");

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
            if(dialogueCounter==7&&prefs.getPremium()==0){
                dialogueShowRewardedAd3("Para Seguir usando hay que ver un anuncio","Cipm Premium","Ver anuncio");

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
    boolean quierePracticarSpeaking;
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

            alertDialog.dismiss();
            quierePracticarSpeaking=true;
            dificultyChanged=true;
            reverseMultipleChoiceViewSetUp();

        });

        // Set a listener to handle the case when the dialog is dismissed
        alertDialog.setOnDismissListener(dialog -> {
            btn.setBackgroundResource(R.drawable.borde_azul);
        });

        alertDialog.show();
    }

    private void reverseMultipleChoiceViewSetUp() {
        option_btns_layout.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.VISIBLE);
        emp.setVisibility(View.VISIBLE);
        respdecir.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        practice();



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
                        dificultyChanged=false;
                        showOptions();
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