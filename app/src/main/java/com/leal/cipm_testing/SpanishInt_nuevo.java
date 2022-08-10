package com.leal.cipm_testing;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Locale;

public class SpanishInt_nuevo extends AppCompatActivity {
    String t0, t1, t2, t3, t4, t5, t6;


    Spinner spin, spin2, spin3;
    Button shov, checkans;
    Button practice, sayans,pos;
    VideoView vv;
    TextView sptx;
    TextView engtx, resultpr, engtx2;
    ImageButton botonhablar1;
    TextToSpeech tt1, ttr;
    Button playbtn;
    String selection, selection2,selection3;
    EditText answerinp;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_int);
        checkans= findViewById(R.id.checkspint);
        pos= findViewById(R.id.posiblebtn);
        pos.setVisibility(View.INVISIBLE);
        checkans.setVisibility(View.INVISIBLE);
        spin= findViewById(R.id.spinersint1);
        playbtn= findViewById(R.id.playmebtnint );
        resultpr= findViewById(R.id.resultspint);
        answerinp=findViewById(R.id.answerinptsp);
        practice=findViewById(R.id.intsppractbtn);
        vv=findViewById(R.id.vidviwspint);
        sptx=findViewById(R.id.tvspintsp);
        engtx=findViewById(R.id.eng1txt);

        // lo hice invisible el texto en inglés
        engtx.setVisibility(View.INVISIBLE);

        // bot[on de decir , invisible, si esta erronea la respuesta se aparece
        sayans = findViewById(R.id.sayanswerspint);
        sayans.setVisibility(View.INVISIBLE);


        vv = findViewById(R.id.vvspint);
        botonhablar1=findViewById(R.id.spintmic);
        spin2= findViewById(R.id.spint2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
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
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection2 = spin2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Prefs prefs = new Prefs(this);
        if (prefs.getPremium()==1){


            ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.rangoPremium, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin3= findViewById(R.id.spint3 );
            spin3.setAdapter(adapter3);
            spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = spin3.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (prefs.getPremium()==0){
            //remove user all the premium features
            //show ads to the user

            ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.rangoint, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin3= findViewById(R.id.spint3 );
            spin3.setAdapter(adapter3);
            spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = spin3.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


        }


        botonhablar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarentradavoz();
            }
        });
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
    public void showv(View vista){

        switch (selection){

            case "Tutorial":

                Uri urit = Uri.parse("http://adrianlealcaldera.com/intdeesptut.mp4");
                vv.setVideoURI(urit);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                break;
            case "Por Preposición":
                Uri uri = Uri.parse("http://adrianlealcaldera.com/intporprep.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
            case "Por Sujeto":
                Uri uri1 = Uri.parse("https://adrianlealcaldera.com/porsujetoreducidotamano.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
            case "Por Objeto":
                Uri uri2 = Uri.parse("https://adrianlealcaldera.com/porobjreducida.mp4");
                vv.setVideoURI(uri2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
            case "Interferencia Reflexiva":
                Uri uri3 = Uri.parse("https://adrianlealcaldera.com/reflx.mp4");
                vv.setVideoURI(uri3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
            case "Interferencia Pasiva":
                Uri uri4 = Uri.parse("https://adrianlealcaldera.com/pasiva.mp4");
                vv.setVideoURI(uri4);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

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
    //falta terminar practice, ponerle en un string las variantes necesarias que puedan ser checadas con el
    //check answer que se le adapte
    public void practice(View vista) {
        if(!selection.equals("Tutorial")){
            checkans.setVisibility(View.VISIBLE);

        }
        engtx.setVisibility(View.INVISIBLE);
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
                                                    t1=n.gene2;
                                                    t2= n.gene3;
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t1=  n.gene2;
                                                    t2= n.gene3;
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;
                                                    t2= n.gene3;
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;
                                                    t2= n.gene3;
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;// she
                                                    t2= n.gene3;// it
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;// she
                                                    t2= n.gene3;// it
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;// she
                                                    t2= n.gene3;// it
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t0=n.gene;
                                                    t1= n.gene2;// she
                                                    t2= n.gene3;// it
                                                    t3= "null";
                                                    t4= "null";
                                                    t5= "null";
                                                    t6= "null";


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;
                                                    t2= n.gene3;
                                                    t3= n.gene4;
                                                    t4= n.gene5;
                                                    t5= n.gene6;
                                                    t6=n.gene7;


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
                                                    t1= n.gene2;
                                                    t2= n.gene3;
                                                    t3= n.gene4;
                                                    t4= n.gene5;
                                                    t5= n.gene6;
                                                    t6=n.gene7;


                                                    // en caso de int de sujeto tercer persona
                                                    //engtx.setTextColor(Color.WHITE);
                                                    answerinp.setText("");
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
    }
    // hay que editar el check answer para que agarre solo las opciones que necesita seg[un el metodo de practice
    // por que algunas pueden matchear con 6 otras con 2 y otras solo con uno  , no hay que decirles que esta bien
    // si confunde he con she en una que no lo necesita
    public void checkanswer(View vista)  {

        String Answerinput = answerinp.getText().toString().trim();
        if (
                t1.trim().equalsIgnoreCase(Answerinput.trim())||
                        t2.trim().equalsIgnoreCase(Answerinput.trim())||
                        t3.trim().equalsIgnoreCase(Answerinput.trim())||
                        t4.trim().equalsIgnoreCase(Answerinput.trim())||
                        t5.trim().equalsIgnoreCase(Answerinput.trim())||
                        t6.trim().equalsIgnoreCase(Answerinput.trim())||
                        engtx.getText().toString().trim().equalsIgnoreCase(Answerinput.trim()))
        {
            resultpr.setText("The Answer is Correct!!");
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


                    }
                }
            });
        }
        else {
            pos.setVisibility(View.VISIBLE);
            engtx.setVisibility(View.VISIBLE);
            sayans.setVisibility(View.VISIBLE);
            resultpr.setText("Answer is Incorrect ");
            ttr = new TextToSpeech(getApplicationContext(),
                    new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if (i == TextToSpeech.SUCCESS) {
                                engtx.setTextColor(Color.GREEN);
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
        }

    }
    public void possibleanswers(View view){

        if(engtx.getText().toString().equals("null")){
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
        }

    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    answerinp.setText(result.get(0));
                    // checkanswer();

                    //dificulty2();


                }
                break;
        }

    }
}