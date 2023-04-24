package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leal.cipm_testing.components.BottomNav;
import com.leal.cipm_testing.components.VideoPlayer;
import com.leal.cipm_testing.components.header;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class spa_int_nuevo extends AppCompatActivity {
    String t0, t1, t2, t3, t4, t5, t6;

    LinearLayout vf;
    VideoView vv;

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
    String selection2;
    String selection3;
    TextToSpeech tts;
    TextToSpeech ttr;
    TextToSpeech tt1;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon;
    String[] ArrayWithElementRemoved;
    FirebaseAuth       mAuth;
    int PositionOfElementsLeft=0;
    String[] temp= {"Por Sujeto", "Por Preposición", "Por Objeto","Interferencia Reflexiva",
            "Interferencia Pasiva"};
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String userid;
    boolean isCustom;
    boolean personalizedPlan;
    ArrayAdapter<String> adapter;
    ArraysdeLosPlanesPersonalizados arrayGetter = new ArraysdeLosPlanesPersonalizados();
    DocumentReference docref ;
    boolean isplanintermedio,isFromListeningPlan;
    boolean isFromListeningPlanDb;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan,isplanintermedioFromDb;
    boolean explanation;

    VocabModeloPersistencia vmp= new VocabModeloPersistencia();
    public static final int REC_CODE_SPEECH_INPUT = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spa_int_nuevo);
        spanish_lay = (LinearLayout) findViewById(R.id.spanish_lay);
        input_lay = (LinearLayout) findViewById(R.id.input_lay);
        opclay = (LinearLayout) findViewById(R.id.opclay);
        respdecir = (LinearLayout) findViewById(R.id.respdecir);
        resppass = (LinearLayout) findViewById(R.id.resppass);
        respinc = (LinearLayout) findViewById(R.id.respinc);
        respescu = (LinearLayout) findViewById(R.id.respescu);
        answer_lay = (LinearLayout) findViewById(R.id.answer_lay);
        respescu2 = (LinearLayout) findViewById(R.id.respescu2);
        btn_emp_lay = (LinearLayout) findViewById(R.id.btn_emp_lay);
        btns_lay = (LinearLayout) findViewById(R.id.btns_lay);
        btn_check_lay = (LinearLayout) findViewById(R.id.btn_check_lay);
        btn_intent_lay = (LinearLayout) findViewById(R.id.btn_intent_lay);
        answer_pos = (LinearLayout) findViewById(R.id.answer_pos);

        txt_exp_est = findViewById(R.id.txt_exp_estt);
        text_exp = findViewById(R.id.text_expp);

        sptx=findViewById(R.id.spanishsentence);
        engtx=findViewById(R.id.txteng);

        emp = (Button) findViewById(R.id.emp);
        btn_check = (Button) findViewById(R.id.btn_check);

        answerinput = (EditText) findViewById(R.id.answerinput);

        spin = (Spinner) findViewById(R.id.spinuno);
        txt1 = (TextView) findViewById(R.id.textspin1);

        spin2 = (Spinner) findViewById(R.id.spinrango);
        txt2 = (TextView) findViewById(R.id.textspin2);

        spin3 = (Spinner) findViewById(R.id.spinest);
        txt3 = (TextView) findViewById(R.id.textspin3);

        txteng1 = (TextView) findViewById(R.id.txteng1);
        txteng2 = (TextView) findViewById(R.id.txteng2);
        txteng3 = (TextView) findViewById(R.id.txteng3);
        txteng4 = (TextView) findViewById(R.id.txteng4);
        txteng5 = (TextView) findViewById(R.id.txteng5);
        txteng6 = (TextView) findViewById(R.id.txteng6);
        txteng7 = findViewById(R.id.txteng7);
        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        docref= db.collection(userid).document("WhereisStudent");
        vv = (VideoView) findViewById(R.id.videoView1);
        vf = (LinearLayout) findViewById(R.id.vf);
        prefs = new Prefs(this);
        PremiumAndArrayControler();
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==tts.SUCCESS){
                    int lang = tts.setLanguage(Locale.ENGLISH);
                }
            }
        });
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
                            selection3 = spin2.getSelectedItem().toString();
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
                            selection2 = spin3.getSelectedItem().toString();
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
                            adapter = new ArrayAdapter<String>(spa_int_nuevo.this, android.R.layout.simple_list_item_1, temp);
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
                            selection3 = spin2.getSelectedItem().toString();
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
                            selection2 = spin3.getSelectedItem().toString();
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
                            selection3 = spin2.getSelectedItem().toString();
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
                            selection2 = spin3.getSelectedItem().toString();
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

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);
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
                            selection3 = spin2.getSelectedItem().toString();
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
                            selection2 = spin3.getSelectedItem().toString();
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
            Intent intent = new Intent(spa_int_nuevo.this,Transicion_nuevo.class);
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

    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        //USUARIO PREMIUM
        if(prefs.getPremium()==0){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
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


            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.InterfrangoPremium, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin2.setAdapter(adapter2);
            spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = spin2.getSelectedItem().toString();
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
                    selection2 = spin3.getSelectedItem().toString();
                    txt2.setText(selection2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

            //USUARIO BASICO
        } else if (prefs.getPremium()==0){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
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
                    selection3 = spin2.getSelectedItem().toString();
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
                    selection2 = spin3.getSelectedItem().toString();
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
        selection = spin.getSelectedItem().toString();
        txt1.setText(selection);

        VideoPlayer video_player = new VideoPlayer();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView6, video_player)
                .commit();


        if(selection.equals("Tutorial")){
            text_exp.setText("Seleccione una estructura y rango para continuar con la practica");
            btn_emp_lay.setVisibility(View.GONE);
            txt_exp_est.setVisibility(View.VISIBLE);
            ocultartodo();
        }else {
            btn_emp_lay.setVisibility(View.VISIBLE);
            videoPlayer();
        }
    }

    //ACTIVA LA INTERFAZ PARA EL VIDEO
    public void videoPlayer(){
            text_exp.setText("Lee la frase y escribela en ingles");
            btn_emp_lay.setVisibility(View.VISIBLE);
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
        answer_lay.setVisibility(View.GONE);
        answer_pos.setVisibility(View.GONE);
        EditText text = (EditText)findViewById(R.id.answerinput);
        btn_intent_lay.setVisibility(View.GONE);
        text.setText("");
        resppass.setVisibility(View.GONE);
        respinc.setVisibility(View.GONE);
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
                                                                //iniciarentradavoz();
                                                            }
                                                            @Override
                                                            public void onError(String s) {
                                                            }
                                                        });
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


                                                        // en caso de int de sujeto tercer persona
                                                        //engtx.setTextColor(Color.WHITE);

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                                    }

                                                }
                                            });

                                    break;
                                case "100 a 100":
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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                                                //iniciarentradavoz();
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

                                                        tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
    }
    public void mostrarlay(){
        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        btn_emp_lay.setVisibility(View.GONE);
        btn_check_lay.setVisibility(View.VISIBLE);
    }
    private void iniciarentradavoz() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        try {

            startActivityForResult(intent, REC_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException e) {
        }
    }
    public void speakdecir(View vista){
        iniciarentradavoz();
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
    public void checkans(View v){
        EditText text = (EditText)findViewById(R.id.answerinput);
        if (
                t1.trim().equalsIgnoreCase(text.getText().toString().trim())||
                        t2.trim().equalsIgnoreCase(text.getText().toString().trim())||
                        t3.trim().equalsIgnoreCase(text.getText().toString().trim())||
                        t4.trim().equalsIgnoreCase(text.getText().toString().trim())||
                        t5.trim().equalsIgnoreCase(text.getText().toString().trim())||
                        t6.trim().equalsIgnoreCase(text.getText().toString().trim())||
                        engtx.getText().toString().trim().equalsIgnoreCase(text.getText().toString().trim()))
        {
            //correcto
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

                        if(personalizedPlan ){
                            SubtractSelectionAndSendinfoToDb();
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
            btn_check_lay.setVisibility(View.VISIBLE);
            answer_pos.setVisibility(View.GONE);

            resppass.setVisibility(View.VISIBLE);
            respescu.setVisibility(View.GONE);

            respinc.setVisibility(View.GONE);
            answer_lay.setVisibility(View.GONE);

        }else{
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

                                ttr.speak("answer is incorrect....the answer is..."+engtx.getText().toString().trim(),TextToSpeech.QUEUE_ADD,null,"string");
                                //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                                //with this yet




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

            resppass.setVisibility(View.GONE);
            respescu.setVisibility(View.GONE);
            respescu2.setVisibility(View.VISIBLE);
            respinc.setVisibility(View.VISIBLE);
        }

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
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    answerinput.setText(result.get(0));
                }
                break;
        }

    }

}