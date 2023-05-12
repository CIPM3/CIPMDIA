package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
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
import com.leal.cipm_testing.screens.Estructura2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import io.grpc.internal.SharedResourceHolder;

public class vocabulary_nuevo extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    VideoView vv;
    LinearLayout vf;
    LinearLayout opclay;
    LinearLayout resplay;
    LinearLayout respescu;
    LinearLayout respinc;
    LinearLayout answer_lay;
    LinearLayout spanish_lay;
    LinearLayout input_lay;
    LinearLayout btn_check_lay;

    TextView btncheck;
    LinearLayout btn_emp_lay;
    LinearLayout btn_cont_lay;
    LinearLayout txt_exp;
    Spinner spin;
    String selection;
    TextView sptx;
    TextView engtx;
    EditText answerinp;
    TextView textspin1;
    TextToSpeech ttr;
    TextToSpeech tts;
    FirebaseAuth       mAuth;
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp =objetoArrays.arrayVocab;
    vocabgen gen = new vocabgen();
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    boolean v;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,isBasicStructures;
    boolean personalizedPlan,isCustom,is100Custom;
    Prefs prefs;
    DocumentReference docrefVocab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_nuevo);
        textspin1 = findViewById(R.id.textspin1);
        spin = findViewById(R.id.spinuno);
        vf = findViewById(R.id.vf);
        vv = findViewById(R.id.vv);

        sptx = findViewById(R.id.spanishsentence);
        engtx = findViewById(R.id.txteng);
        answerinp = findViewById(R.id.answerinput1);
        opclay = findViewById(R.id.opclay);

        btncheck = findViewById(R.id.btncheck);

        resplay = findViewById(R.id.resplay);
        answer_lay = findViewById(R.id.answer_lay);
        spanish_lay = findViewById(R.id.spanish_lay);
        input_lay = findViewById(R.id.input_lay);
        btn_check_lay = findViewById(R.id.btn_check_lay);
        btn_emp_lay = findViewById(R.id.btn_emp_lay);
        btn_cont_lay = findViewById(R.id.btn_cont_lay);
        txt_exp = findViewById(R.id.txt_exp);
        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        docref = db.collection(userid).document("WhereisStudent");
        docrefVocab = db.collection(userid).document("CustomArrayLists");
        prefs = new Prefs(vocabulary_nuevo.this);

        PremiumControler();
    }
    CustomArrayAfterTestingHolder caath ;

    //DB FUNC
    private void PremiumControler() {

        // info que recive del plan de estudios chooser
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        is100Custom=reciver.getBooleanExtra("Custom100Plan",false);
        

        //si es personalizado jala el array para empezar y luego el de la
        // base de datos correspondiente
        // este tiene que jalar un array al principio de lo que sea que sea su plan
        if(personalizedPlan){

            if(is100Custom){
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

                            vf.setVisibility(View.VISIBLE);
                            vv.setVisibility(View.GONE);

                            txt_exp.setVisibility(View.VISIBLE);
                            btn_emp_lay.setVisibility(View.VISIBLE);

                            spanish_lay.setVisibility(View.GONE);
                            input_lay.setVisibility(View.GONE);

                            btn_check_lay.setVisibility(View.GONE);
                            btn_cont_lay.setVisibility(View.GONE);

                            respescu.setVisibility(View.GONE);
                            respinc.setVisibility(View.GONE);

                            answerinp.setBackgroundColor(Color.WHITE);
                            opclay.setBackgroundColor(Color.WHITE);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
                else if (prefs.getPremium()==0){
                    // este if controla si esta volviendo de una sesión anterior, recive de la base de datos
                    // una lista<> ya empezada que convierte en array y que luego pasa al adaptador que lo pone en el spiner
                    // en cada actividad habra un is custom, con el array que le corresponda
                    // la actividad sera controlada en plandeestudioschooser segun lo que la base de datos diga que es true
                    if(isCustom)
                    {
                        Toast.makeText(this, "custom after he did some elements from his 100custom array", Toast.LENGTH_SHORT).show();
                    }
                    // si no es custom agarra el temp que ha sido inicializado arriba
                    // tal vez tengamos que hacer esos arrays en otra clase y solo llamarlos
                    // aqui empieza el plan personalizado
                    else {
                        docrefVocab.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                caath= documentSnapshot.toObject(CustomArrayAfterTestingHolder.class);
                                assert caath != null;

                                temp= caath.VocabArrayAfterTEsting.toArray(new String[0]);


                                ArrayAdapter<String> adapter =
                                        new ArrayAdapter<String>
                                                        (vocabulary_nuevo.this,
                                                        android.R.layout.simple_list_item_1, temp);
                                spin.setAdapter(adapter);
                                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        selection = spin.getSelectedItem().toString();
                                        textspin1.setText(selection);
                                        vf.setVisibility(View.VISIBLE);
                                        vv.setVisibility(View.GONE);
                                        txt_exp.setVisibility(View.VISIBLE);
                                        btn_emp_lay.setVisibility(View.VISIBLE);
                                        spanish_lay.setVisibility(View.GONE);
                                        input_lay.setVisibility(View.GONE);

                                        btn_check_lay.setVisibility(View.GONE);
                                        btn_cont_lay.setVisibility(View.GONE);

                                        respescu.setVisibility(View.GONE);
                                        respinc.setVisibility(View.GONE);

                                        answerinp.setBackgroundColor(Color.WHITE);
                                        opclay.setBackgroundColor(Color.WHITE);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        });



                    }
                }
            }else {
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

                            vf.setVisibility(View.VISIBLE);
                            vv.setVisibility(View.GONE);

                            txt_exp.setVisibility(View.VISIBLE);
                            btn_emp_lay.setVisibility(View.VISIBLE);

                            spanish_lay.setVisibility(View.GONE);
                            input_lay.setVisibility(View.GONE);

                            btn_check_lay.setVisibility(View.GONE);
                            btn_cont_lay.setVisibility(View.GONE);

                            respescu.setVisibility(View.GONE);
                            respinc.setVisibility(View.GONE);

                            answerinp.setBackgroundColor(Color.WHITE);
                            opclay.setBackgroundColor(Color.WHITE);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
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
                                ArrayAdapter<String> adapter = new ArrayAdapter<String>(vocabulary_nuevo.this, android.R.layout.simple_list_item_1,temp  );
                                spin.setAdapter(adapter);
                                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        selection = spin.getSelectedItem().toString();
                                        textspin1.setText(selection);
                                        vf.setVisibility(View.VISIBLE);
                                        vv.setVisibility(View.GONE);
                                        txt_exp.setVisibility(View.VISIBLE);
                                        btn_emp_lay.setVisibility(View.VISIBLE);
                                        spanish_lay.setVisibility(View.GONE);
                                        input_lay.setVisibility(View.GONE);

                                        btn_check_lay.setVisibility(View.GONE);
                                        btn_cont_lay.setVisibility(View.GONE);

                                        respescu.setVisibility(View.GONE);
                                        respinc.setVisibility(View.GONE);

                                        answerinp.setBackgroundColor(Color.WHITE);
                                        opclay.setBackgroundColor(Color.WHITE);
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
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);
                        spin.setAdapter(adapter);
                        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                selection = spin.getSelectedItem().toString();
                                textspin1.setText(selection);
                                vf.setVisibility(View.VISIBLE);
                                vv.setVisibility(View.GONE);
                                txt_exp.setVisibility(View.VISIBLE);
                                btn_emp_lay.setVisibility(View.VISIBLE);
                                spanish_lay.setVisibility(View.GONE);
                                input_lay.setVisibility(View.GONE);

                                btn_check_lay.setVisibility(View.GONE);
                                btn_cont_lay.setVisibility(View.GONE);

                                respescu.setVisibility(View.GONE);
                                respinc.setVisibility(View.GONE);

                                answerinp.setBackgroundColor(Color.WHITE);
                                opclay.setBackgroundColor(Color.WHITE);
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                    }
                }
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
            Intent intent = new Intent(vocabulary_nuevo.this, Estructura2023.class);
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

    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        //USUARIO PREMIUM
        if(prefs.getPremium()==1){
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


            //USUARIO BASICO
        } else if (prefs.getPremium()==0){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.vocab, android.R.layout.simple_spinner_item);
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

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected1(){
        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);

        VideoPlayer video_player = new VideoPlayer();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView4, video_player)
                .commit();
    }

    //TOMA TODO EL ESPACIO PARA EL SPINNER 1
    public void activaSpinner1(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }

    public void showV(View vista) {

        vf.setVisibility(View.GONE);
        vv.setVisibility(View.VISIBLE);

        switch (selection) {
            case "Tutorial":
                Uri urit = Uri.parse("https://adrianlealcaldera.com/vocabtut.mp4");
                vv.setVideoURI(urit);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
            case "0 to 50":
                Uri uri = Uri.parse("http://adrianlealcaldera.com/vocablowq.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "50 to 100":
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/51a100.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "100 to 150":
                Uri uri2 = Uri.parse("http://adrianlealcaldera.com/100a150.mp4");
                vv.setVideoURI(uri2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "150 to 200":
                Uri uri3 = Uri.parse("http://adrianlealcaldera.com/151-200.mp4");
                vv.setVideoURI(uri3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "200 to 250":
                Uri uri4 = Uri.parse("http://adrianlealcaldera.com/200a250.mp4");
                vv.setVideoURI(uri4);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "250 to 300":
                Uri uri5 = Uri.parse("http://adrianlealcaldera.com/250a300.mp4");
                vv.setVideoURI(uri5);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "300 to 350":
                Uri uri6 = Uri.parse("http://adrianlealcaldera.com/300-350.mp4");
                vv.setVideoURI(uri6);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "350 to 400":
                Uri uri7 = Uri.parse("http://adrianlealcaldera.com/350a400bq.mp4");
                vv.setVideoURI(uri7);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "400 to 500":
                Uri uri8 = Uri.parse("http://adrianlealcaldera.com/400a500lq.mp4");
                vv.setVideoURI(uri8);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;


        }

    }

    public void practice(View v) {
        txt_exp.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);

        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);

        btn_check_lay.setVisibility(View.VISIBLE);
        btn_cont_lay.setVisibility(View.VISIBLE);
        answer_lay.setVisibility(View.GONE);

        resplay.setVisibility(View.GONE);

        answerinp.setBackgroundColor(Color.WHITE);
        opclay.setBackgroundColor(Color.WHITE);

        switch (selection) {


            case "Tutorial":

                Toast.makeText(this, "estas en tutorial, elige un rango", Toast.LENGTH_SHORT).show();
                break;
            case "0 to 50":
                gen.gencerotofifty();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case "50 to 100":
                gen.fiftohun();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case "100 to 150":
                gen.cientociencin();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "150 to 200":
                gen.C150a200();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "200 to 250":
                gen.C200a250();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "250 to 300":
                gen.C250a300();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "300 to 350":
                gen.C300a350();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case "350 to 400":
                gen.C350a400();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "400 to 500":
                gen.C400a500();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

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


                                   // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

        }
    }
    public void checkanswer(View vista) {
        v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
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

            btncheck.setText("Chequea tu respuesta");
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


                    }
                }
            });
            //RESPUESTA INCORRECTA
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
            //if you say stop it returns part of the flow control system
            if (answerinp.getText().toString().trim().equals("stop")) return;
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


                    }
                }
            });
        }

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

    //VALIDACIONES DE TEXTO Y AUDIO
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    answerinp.setText(result.get(0));

                }
                break;
        }

    }
}