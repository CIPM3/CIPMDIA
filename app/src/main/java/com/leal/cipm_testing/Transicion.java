package com.leal.cipm_testing;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Transicion extends AppCompatActivity {

    Button checkAnswer;
    ImageButton botonhablar;
    TextView spSentence,engSentence;
    EditText AnswerInput;
    Spinner spin;
    TextToSpeech tts;
    String selection;
    Generator gen= new Generator();
    Prefs prefs ;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    FirebaseAuth mAuth;
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    boolean personalizedPlan,isCustom;
    String[] temp = {"Conectores Standar Presente Simple","Conectores Standar Presente Continuo","Conectores Standar Presente Perfecto"
    ,"Conectores Standar Presente Perfecto Continuo", "Conectores Standar Futuro Simple"
    };
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon;
    int PositionOfElementsLeft=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicion);
        spSentence=findViewById(R.id.sptrnstxt);
        engSentence=findViewById(R.id.engtrnstxt);
        engSentence.setVisibility(View.INVISIBLE);
        checkAnswer=findViewById(R.id.checkanswertrnsbtn);
        botonhablar=findViewById(R.id.micbtntrns);
        AnswerInput=findViewById(R.id.answerinputtrns);
        spin=findViewById(R.id.spintrns);
        prefs = new Prefs(this);
        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        docref = db.collection(userid).document("WhereisStudent");



       PremiumAndArrayControler();

    }
    private void PremiumAndArrayControler() {
        // info que recive del plan de estudios chooser
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        Prefs prefs = new Prefs(Transicion.this);
        //si es personalizado jala el array para empezar y luego el de la
        // base de datos correspondiente
        // este tiene que jalar un array al principio de lo que sea que sea su plan
        if(personalizedPlan){
            //al premium no se le ha movido
            if (prefs.getPremium()==1){
                //Give the user all the premium features
                //hide ads if you are showing ads
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                        (this, R.array.Transition, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected
                            (AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();

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
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Transicion.this, android.R.layout.simple_list_item_1,temp  );
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();

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
                    Toast.makeText(this,"inside personalized not custom",Toast.LENGTH_SHORT).show();
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();

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

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (prefs.getPremium()==0){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                    (this, R.array.Transition , android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(adapter);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spin.getSelectedItem().toString();

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
            Intent intent = new Intent(Transicion.this,availability_nuevo.class);
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
    public void practice(View vista){
        switch (selection){
            case "Conectores Standar Presente Simple":
                gen.GenConectoresStandarPresenteSimpleXPresenteSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;

            case "Conectores Standar Presente Continuo":
                gen.GenConectoresStandarPresenteSimpleXPresenteContinuo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Perfecto":
                gen.GenConectoresStandarPresenteSimpleXPresentePerfecto();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Perfecto Continuo":
                gen.GenConectoresStandarPresenteSimpleXPresentePerfectoContinuo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Futuro Simple":
                gen.GenConectoresStandarPresenteSimpleXFuturoSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Reported Speech":
                gen.GenConectoresStandarPresenteSimpleXReportedSpeech();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Must Simple":
                gen.GenConectoresStandarPresenteSimpleXMustSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Can Simple":
                gen.GenConectoresStandarPresenteSimpleXCanSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Want To":
                gen.GenConectoresStandarPresenteSimpleXWantTo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Supposed To":
                gen.GenConectoresStandarPresenteSimpleXSupposedTo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Be Used To":
                gen.GenConectoresStandarPresenteSimpleXBeUsedTo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Can Simple X Can Simple":
                gen.GenConectoresStandarCanSimpleXCanSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Should Simple X Presente Simple":
                gen.GenConectoresStandarShouldSimpleXCanSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Can Simple X Presente Simple":
                gen.GenConectoresStandarCanSimpleXPresenteSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Can Simple X Presente Continuo":
                gen.GenConectoresStandarCanSimpleXPresenteContinuo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Can Simple X Presente Perfecto":
                gen.GenConectoresStandarCanSimpleXPresentePerfecto();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Could Simple X Presente Simple":
                gen.GenConectoresStandarCouldSimpleXPresenteSimple();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Por Sujeto":
                gen.GenConectoresStandarPresenteSimpleXPorSujeto();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Por Objeto":
                gen.GenConectoresStandarPresenteSimpleXPorObjeto();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Por Preposicion":
                gen.GenConectoresStandarPresenteSimpleXPorPreposicion();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Should Simple X Prensente Continuo":
                gen.GenConectoresStandarShouldSimpleXPresenteContinuo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Could Simple X Presente Continuo":
                gen.GenConectoresStandarCouldSimpleXPresenteContinuo();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
            case "Conectores Standar Presente Simple X Interferencia Reflexiva":
                gen.GenConectoresStandarPresenteSimpleXIntReflexiva();
                spSentence.setText(gen.gens);
                engSentence.setText(gen.gene);
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
                                    tts.speak("como dirías..." + spSentence.getText().toString().trim(), 0, null, "zero");
                                }

                            }
                        });
                break;
        }
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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    AnswerInput.setText(result.get(0));

                }
                break;
        }

    }
    public void hablar(View view){
        iniciarentradavoz();
    }
    public void checkanswer(View vista) {
        engSentence.setVisibility(View.VISIBLE);
        engSentence.setBackgroundColor(Color.GREEN);
        String t = engSentence.getText().toString().trim();
        String t2 = AnswerInput.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        tts.setLanguage(Locale.ENGLISH);
                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                        tts.speak("answer is correct", TextToSpeech.QUEUE_ADD, null, "one");
                        // aqui debemos modificar el array, quitarle lo que se le tenga que quitar
                        // volvemos a llamar premium controler y re/setea el array
                        // no hemos hecho la condicion para realmente saber que el alumno haya pasado la estructura

                        if(personalizedPlan){
                            Toast.makeText(Transicion.this, "before subtract", Toast.LENGTH_SHORT).show();
                            SubtractSelectionAndSendinfoToDb();
                        }
                    }
                }
            });
        }
        else {

            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        engSentence.setTextColor(Color.BLACK);
                        tts.setLanguage(Locale.ENGLISH);
                        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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

                        tts.speak("answer is incorrect....the answer is..." + engSentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when tts is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet

                    }
                }
            });
        }

    }



}