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
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Locale;

public class spa_int_nuevo extends AppCompatActivity {

    LinearLayout vf;
    VideoView vv;

    Spinner spinuno;
    Spinner spinrango;
    Spinner spinest;

    TextView textspin1;
    TextView textspin2;
    TextView textspin3;

    String selection;
    String selection2;
    String selection3;

    TextToSpeech tts;
    TextToSpeech ttr;
    TextToSpeech tti;
    TextToSpeech tt1;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spa_int_nuevo);
        spinuno = (Spinner) findViewById(R.id.spinuno);
        textspin1 = (TextView) findViewById(R.id.textspin1);

        spinrango = (Spinner) findViewById(R.id.spinrango);
        textspin2 = (TextView) findViewById(R.id.textspin2);

        spinest = (Spinner) findViewById(R.id.spinest);
        textspin3 = (TextView) findViewById(R.id.textspin3);

        vv = (VideoView) findViewById(R.id.videoView1);
        vf = (LinearLayout) findViewById(R.id.vf);

        Prefs prefs = new Prefs(this);
        if (prefs.getPremium()==1){
            //Give the user all the premium features
            //hide ads if you are showing ads
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinuno.setAdapter(adapter);
            spinuno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spinuno.getSelectedItem().toString();
                    textspin1.setText(selection);

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinrango.setAdapter(adapter2);
            spinrango.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = spinrango.getSelectedItem().toString();
                    textspin3.setText(selection3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


            ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinest.setAdapter(adapter3);
            spinest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection2 = spinest.getSelectedItem().toString();
                    textspin2.setText(selection2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (prefs.getPremium()==0){
            //remove user all the premium features
            //show ads to the user


            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinuno.setAdapter(adapter);
            spinuno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spinuno.getSelectedItem().toString();
                    textspin1.setText(selection);

                    vv.setVisibility(View.GONE);
                    vf.setVisibility(View.VISIBLE);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinrango.setAdapter(adapter2);
            spinrango.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection3 = spinrango.getSelectedItem().toString();
                    textspin3.setText(selection3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


            ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.estructurasinterferencia, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinest.setAdapter(adapter3);
            spinest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection2 = spinest.getSelectedItem().toString();
                    textspin2.setText(selection2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }



        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==tts.SUCCESS){
                    int lang = tts.setLanguage(Locale.ENGLISH);
                }
            }
        });
    }

    public void showV(View vista){
        vv.setVisibility(View.VISIBLE);
        vf.setVisibility(View.GONE);

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

    /*public void practice(View vista) {
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
    }*/

    private void iniciarentradavoz() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        try {
            startActivityForResult(intent, REC_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException e) {
        }
    }
    
    /*public void speakans(View vista){
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
    }*/

    /*public void checkanswer(View vista)  {

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

    }*/

    /*public void possibleanswers(View view){

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

    }*/

    public void main(View vist){
        Intent crispIntent = new Intent(this, MainActivity.class);
        startActivity(crispIntent);
    }

    public void profile(View vist) {
        Intent crispIntent = new Intent(this, profile.class);
        startActivity(crispIntent);
    }

    public void chat_maestro(View vist) {
        Intent crispIntent = new Intent(this, chat_maestro.class);
        startActivity(crispIntent);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    //answerinp.setText(result.get(0));
                    // checkanswer();

                    //dificulty2();


                }
                break;
        }

    }
}