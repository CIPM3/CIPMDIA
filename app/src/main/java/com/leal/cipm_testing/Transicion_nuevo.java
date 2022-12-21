package com.leal.cipm_testing;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Transicion_nuevo extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    VideoView vv;
    LinearLayout vf;
    LinearLayout opclay;
    LinearLayout resppass;
    LinearLayout respescu;
    LinearLayout respinc;
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
    EditText answerinp;
    TextView textspin1;
    TextToSpeech ttr;
    TextToSpeech tts;
    FirebaseAuth mAuth;
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp =objetoArrays.arrayVocab;
    Generator gen1 = new Generator();
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    boolean v;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,isBasicStructures;
    boolean personalizedPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicion_nuevo);
        textspin1 = findViewById(R.id.textspin1);
        spin = findViewById(R.id.spinuno);
        vf = findViewById(R.id.vf);
        vv = findViewById(R.id.vv);

        sptx = findViewById(R.id.spanishsentence);
        engtx = findViewById(R.id.txteng);
        answerinp = findViewById(R.id.answerinput1);
        opclay = findViewById(R.id.opclay);

        resppass = findViewById(R.id.resppass);
        respescu = findViewById(R.id.respescu);
        respinc = findViewById(R.id.respinc);
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

        PremiumAndArrayControler();
    }
    //DB
    private void PremiumAndArrayControler() {

        // info que recive del plan de estudios chooser
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        boolean isCustom = reciver.getBooleanExtra("isCustom",false);
        Prefs prefs = new Prefs(Transicion_nuevo.this);

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

                        vf.setVisibility(View.VISIBLE);
                        vv.setVisibility(View.GONE);

                        txt_exp.setVisibility(View.VISIBLE);
                        btn_emp_lay.setVisibility(View.VISIBLE);

                        spanish_lay.setVisibility(View.GONE);
                        input_lay.setVisibility(View.GONE);

                        btn_check_lay.setVisibility(View.GONE);
                        btn_cont_lay.setVisibility(View.GONE);

                        resppass.setVisibility(View.GONE);
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
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Transicion_nuevo.this, android.R.layout.simple_list_item_1,temp  );
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

                                    resppass.setVisibility(View.GONE);
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

                            resppass.setVisibility(View.GONE);
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
        // si no es personalizado acesa a todas las funciones que le cooresponden
        // ya sea pagado o gratis
        else if (prefs.getPremium()==1){
            //Give the user all the premium features
            //hide ads if you are showing ads
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                    (this, R.array.Transition, android.R.layout.simple_spinner_item);
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

                    resppass.setVisibility(View.GONE);
                    respescu.setVisibility(View.GONE);
                    respinc.setVisibility(View.GONE);

                    answerinp.setBackgroundColor(Color.WHITE);
                    opclay.setBackgroundColor(Color.WHITE);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (prefs.getPremium()==0){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                    (this, R.array.TransitionGratis, android.R.layout.simple_spinner_item);
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

                    resppass.setVisibility(View.GONE);
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
    public void inWhatActivityisTheStudent(){

        isInTransition = true;


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
            Intent intent = new Intent(Transicion_nuevo.this,availability_nuevo.class);
            intent.putExtra("isThePlanPersonalized",personalizedPlan);
            startActivity(intent);
        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
        }
    }

    //Metodos
    public void practice(View v){
        txt_exp.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);

        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);

        btn_check_lay.setVisibility(View.VISIBLE);
        btn_cont_lay.setVisibility(View.VISIBLE);
        answer_lay.setVisibility(View.GONE);

        resppass.setVisibility(View.GONE);
        respescu.setVisibility(View.GONE);
        respinc.setVisibility(View.GONE);

        answerinp.setBackgroundColor(Color.WHITE);
        answerinp.setText("");
        opclay.setBackgroundColor(Color.WHITE);

        switch (selection){
            case "Conectores Standar Presente Simple":
                gen1.GenConectoresStandarPresenteSimpleXPresenteSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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

            case "Conectores Standar Presente Continuo":
                gen1.GenConectoresStandarPresenteSimpleXPresenteContinuo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Perfecto":
                gen1.GenConectoresStandarPresenteSimpleXPresentePerfecto();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Perfecto Continuo":
                gen1.GenConectoresStandarPresenteSimpleXPresentePerfectoContinuo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Futuro Simple":
                gen1.GenConectoresStandarPresenteSimpleXFuturoSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Reported Speech":
                gen1.GenConectoresStandarPresenteSimpleXReportedSpeech();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Must Simple":
                gen1.GenConectoresStandarPresenteSimpleXMustSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Can Simple":
                gen1.GenConectoresStandarPresenteSimpleXCanSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Want To":
                gen1.GenConectoresStandarPresenteSimpleXWantTo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Supposed To":
                gen1.GenConectoresStandarPresenteSimpleXSupposedTo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Be Used To":
                gen1.GenConectoresStandarPresenteSimpleXBeUsedTo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Can Simple X Can Simple":
                gen1.GenConectoresStandarCanSimpleXCanSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Should Simple X Presente Simple":
                gen1.GenConectoresStandarShouldSimpleXCanSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Can Simple X Presente Simple":
                gen1.GenConectoresStandarCanSimpleXPresenteSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Can Simple X Presente Continuo":
                gen1.GenConectoresStandarCanSimpleXPresenteContinuo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Can Simple X Presente Perfecto":
                gen1.GenConectoresStandarCanSimpleXPresentePerfecto();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Could Simple X Presente Simple":
                gen1.GenConectoresStandarCouldSimpleXPresenteSimple();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Por Sujeto":
                gen1.GenConectoresStandarPresenteSimpleXPorSujeto();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Por Objeto":
                gen1.GenConectoresStandarPresenteSimpleXPorObjeto();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Por Preposicion":
                gen1.GenConectoresStandarPresenteSimpleXPorPreposicion();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Should Simple X Prensente Continuo":
                gen1.GenConectoresStandarShouldSimpleXPresenteContinuo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Could Simple X Presente Continuo":
                gen1.GenConectoresStandarCouldSimpleXPresenteContinuo();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
            case "Conectores Standar Presente Simple X Interferencia Reflexiva":
                gen1.GenConectoresStandarPresenteSimpleXIntReflexiva();
                sptx.setText(gen1.gens);
                engtx.setText(gen1.gene);
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
        }
    }
    public void hablar(View view){
        iniciarentradavoz();
    }
    public void showV(View vista) {

        if(selection != null){

        }else{
            vf.setVisibility(View.GONE);
            vv.setVisibility(View.VISIBLE);
        }

        switch (selection) {
            default:
                Toast.makeText(this, "Por ahora no tenemos videos disponibles.", Toast.LENGTH_SHORT).show();
                break;
        }

    }
    public void checkanswer(View v){
        //v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            answerinp.setBackgroundColor(Color.parseColor("#E6FBEB"));
            opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));

            resppass.setVisibility(View.VISIBLE);
            respescu.setVisibility(View.VISIBLE);
            respinc.setVisibility(View.GONE);

            answer_lay.setVisibility(View.GONE);

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
                        // aqui debemos modificar el array, quitarle lo que se le tenga que quitar
                        // volvemos a llamar premium controler y re/setea el array
                        // no hemos hecho la condicion para realmente saber que el alumno haya pasado la estructura

                        if(personalizedPlan ){
                            SubtractSelectionAndSendinfoToDb();
                        }
                    }
                }
            });
        }
        else {
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));

            resppass.setVisibility(View.GONE);
            respescu.setVisibility(View.VISIBLE);
            respinc.setVisibility(View.VISIBLE);

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

    //Plugins
    private void iniciarentradavoz() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        try {
            startActivityForResult(intent, REC_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException e) {
        }
    }
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

    //rutas
    public void main(View v){
        startActivity(new Intent(Transicion_nuevo.this,MainActivity.class));
    }
}