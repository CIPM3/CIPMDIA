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

import java.util.ArrayList;
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
    public static final int REC_CODE_SPEECH_INPUT = 100;


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

        }
    }
    public void CheckAnswer(View view){

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
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet

                    }
                }
            });
        }

    }



}