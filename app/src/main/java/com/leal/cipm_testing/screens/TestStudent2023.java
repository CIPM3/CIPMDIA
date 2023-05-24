package com.leal.cipm_testing.screens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leal.cipm_testing.C150a200;
import com.leal.cipm_testing.C200a250;
import com.leal.cipm_testing.C250a300;
import com.leal.cipm_testing.C300a350;
import com.leal.cipm_testing.C350a400;
import com.leal.cipm_testing.C400a500;
import com.leal.cipm_testing.Generator;
import com.leal.cipm_testing.MainActivity;
import com.leal.cipm_testing.Prefs;
import com.leal.cipm_testing.R;
import com.leal.cipm_testing.Student;
import com.leal.cipm_testing.StudentVocabRestultsModel;
import com.leal.cipm_testing.TestResults;
import com.leal.cipm_testing.cerotofifty;
import com.leal.cipm_testing.cientociencincuenta;
import com.leal.cipm_testing.fiftytohundred;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class TestStudent2023 extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String             txteng,userid;
    FirebaseAuth mAuth;

    LinearLayout lay_chosel_level,lay_chosel_structure,btn_lay_test_result,lay_test_text_input
            ,btn_lay_siguiente_preg,btn_lay_enviar_resp;
    Spinner spinlevel,spinstructure;

    EditText answerinput;

    TextToSpeech tt1;

    Timer timer;
    TimerTask timerTask;

    int countPos=0;

    int seconds;
    int minutes;
    int hours;
    int rounded;

    Double timen = 0.0;

    int cp,cn;

    int prom;
    int ContadorDeVocabulario=0;

    int pos0, pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9;

    int score0, score1, score2,score3, score4, score5,score6,
            score7,score8,score9,score10,score11,score12,score13,
            score14,score15,score16,score17,score18,score19;
    int ScoreFinal;

    int rsa;


    String selectionLevel,selectionStructure;

    TextView txtlevel,txtstructure,timerText,spanishsentence;

    DocumentReference docrefStructure,docrefVocab;
    Student studentObject= new Student();
    StudentVocabRestultsModel vocabDbChecker= new StudentVocabRestultsModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_student2023);

        timer = new Timer();
        timerText= (TextView) findViewById(R.id.timertextv);
        timerText.setVisibility(View.INVISIBLE);
        timerText.setText(formatTime(0,0,0));

        lay_chosel_level = findViewById(R.id.laychosellevel);
        lay_chosel_structure = findViewById(R.id.lay_chosel_structure);
        lay_test_text_input = findViewById(R.id.lay_test_text_input);
        btn_lay_test_result = findViewById(R.id.btn_lay_test_result);
        btn_lay_siguiente_preg = findViewById(R.id.btn_lay_siguiente_preg);
        btn_lay_enviar_resp = findViewById(R.id.btn_lay_enviar_resp);

        spanishsentence = findViewById(R.id.spanishsentence);
        answerinput = findViewById(R.id.answerinput1);

        spinlevel = findViewById(R.id.spinlevel);
        spinstructure = findViewById(R.id.spinstructure);


        txtlevel = findViewById(R.id.txtlevel);
        txtstructure = findViewById(R.id.txtstructure);


        mAuth= FirebaseAuth.getInstance();
        // este es el id que identifica al usuario-aparentemente jala con los 3 diferentes tipos de auth
        userid = mAuth.getCurrentUser().getUid();
        // este culero de arriba es el user id del usuario jala con los 3 aparentemente
        docrefStructure=db.collection(userid).document("structures");
        docrefVocab=db.collection(userid).document("vocabulary");

        Prefs prefs = new Prefs(this);
        PremiumAndArrayControler(prefs);
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
                        timerText.setText(getTimerText());

                    }
                });
            }

        };
        timer.scheduleAtFixedRate(timerTask, 0 ,1000);
    }
    private String getTimerText() {
        rounded = (int) Math.round(timen);

        seconds = ((rounded % 86400) % 3600) % 60;
        minutes = ((rounded % 86400) % 3600) / 60;
        hours= ((rounded % 86400) / 3600);

        return formatTime(seconds, minutes, hours);
    }
    private String formatTime(int seconds, int minutes, int hours) {
        return String.format("%02d",hours) + " : " + String.format("%02d",minutes) + " : " + String.format("%02d",seconds);
    }


    private void PremiumAndArrayControler(Prefs prefs) {
        if (prefs.getPremium()==1){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.LevelofAbstraction, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinlevel.setAdapter(adapter);
            spinlevel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selectionLevel = spinlevel.getSelectedItem().toString();
                    txtlevel.setText(selectionLevel);

                    selectionStructure = "Tutorial";
                    switch (selectionLevel){

                        case "Vocabulary":
                            lay_chosel_structure.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.vocabPremium, android.R.layout.simple_spinner_item);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinstructure.setAdapter(adapter);
                            spinstructure.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selectionStructure = spinstructure.getSelectedItem().toString();
                                    txtstructure.setText(selectionStructure);

                                    if(!selectionStructure.equalsIgnoreCase("Tutorial")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            break;


                        case "Syntax":
                            lay_chosel_structure.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapters = ArrayAdapter.createFromResource(getApplicationContext(), R.array.structures, android.R.layout.simple_spinner_item);
                            adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinstructure.setAdapter(adapters);
                            spinstructure.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selectionStructure = spinstructure.getSelectedItem().toString();
                                    txtstructure.setText(selectionStructure);

                                    if(!selectionStructure.equalsIgnoreCase("Pick a Structure")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            break;
                        case "Spanish Interference":
                            lay_chosel_structure.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapterst = ArrayAdapter.createFromResource(getApplicationContext(), R.array.Interference, android.R.layout.simple_spinner_item);
                            adapterst.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinstructure.setAdapter(adapterst);
                            spinstructure.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView,
                                                           View view, int i, long l) {
                                    selectionStructure = spinstructure.getSelectedItem().toString();
                                    txtstructure.setText(selectionStructure);

                                    if(!selectionStructure.equalsIgnoreCase("Tutorial")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            shownext();

                            break;

                        case "Conscious Interference":
                            shownext();
                            break;


                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }
        else if (prefs.getPremium()==0){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.LevelofAbstraction, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinlevel.setAdapter(adapter);
            spinlevel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selectionLevel = spinlevel.getSelectedItem().toString();
                    txtlevel.setText(selectionLevel);
                    selectionStructure = "Tutorial";

                    switch (selectionLevel){

                        case "Vocabulary":
                            lay_chosel_structure.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.vocab, android.R.layout.simple_spinner_item);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinstructure.setAdapter(adapter);
                            spinstructure.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selectionStructure = spinstructure.getSelectedItem().toString();
                                    txtstructure.setText(selectionStructure);

                                    if(!selectionStructure.equalsIgnoreCase("Tutorial")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            break;


                        case "Syntax":
                            lay_chosel_structure.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapters = ArrayAdapter.createFromResource(getApplicationContext(), R.array.structures, android.R.layout.simple_spinner_item);
                            adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinstructure.setAdapter(adapters);
                            spinstructure.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selectionStructure = spinstructure.getSelectedItem().toString();
                                    txtstructure.setText(selectionStructure);

                                    if(!selectionStructure.equalsIgnoreCase("Pick a Structure")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            break;
                        case "Spanish Interference":
                            lay_chosel_structure.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapterst = ArrayAdapter.createFromResource(getApplicationContext(), R.array.Interference, android.R.layout.simple_spinner_item);
                            adapterst.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinstructure.setAdapter(adapterst);
                            spinstructure.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView,
                                                           View view, int i, long l) {
                                    selectionStructure = spinstructure.getSelectedItem().toString();
                                    txtstructure.setText(selectionStructure);

                                    if(!selectionStructure.equalsIgnoreCase("Tutorial")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            shownext();

                            break;

                        case "Conscious Interference":
                            shownext();
                            break;


                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }
    }

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }
    public void chat_maestro(View vist) {
        Intent crispIntent = new Intent(this, ChatMaestro2023.class);
        startActivity(crispIntent);
    }

    public void startTest (View vista){

        lay_chosel_level.setVisibility(View.VISIBLE);
        btn_lay_test_result.setVisibility(View.VISIBLE);
    }

    public void shownext () {
        lay_test_text_input.setVisibility(View.VISIBLE);
        btn_lay_siguiente_preg.setVisibility(View.VISIBLE);
    }

    public void StarterChooser(View view)  {
        switch (selectionLevel){
            case "Syntax":
                startTest();
                break;

            case "Vocabulary":
                startTest();

                break;
            case "Spanish Interference":
                Toast.makeText(this, "En Mantenimiento.", Toast.LENGTH_SHORT).show();
                /*startTest();*/
                break;

            case "Conscious Interference":
                Toast.makeText(this, "En Mantenimiento.", Toast.LENGTH_SHORT).show();

                /*soundtest();*/
                break;


        }
    }

    public  void   startTest(){

        btn_lay_enviar_resp.setVisibility(View.VISIBLE);
        switch (selectionStructure) {
            case "Pick a Structure":
                Toast.makeText(this, "elige una estructura", Toast.LENGTH_SHORT).show();
                break;
            case "Present Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenPresSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Present Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPresCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Present Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPresPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Present Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPresPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Past Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenPastSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Past Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPastCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPastPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Past Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPastPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Future Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenFutSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Future Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFutCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Future Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFutPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Future Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFutPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Would Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Would Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWouldCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Would Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWouldPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Would Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWouldPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Could Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Could Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCouldCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Could Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCouldPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Could Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCouldPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Might Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Might Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMightCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Might Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMightPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Might Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMightPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Can Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Can Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCanCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Must Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Must Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMustCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Should Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimp2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Should Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenShouldCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Should Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenShouldPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Should Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenShouldPerfCont2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Want To":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWantYouTo2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "For To":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenForTo2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Supposed To Present":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenSupposedTopasado2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Wish Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWishPastPerf2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Used To":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenUsedTo2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Be Used To":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenBeUsedTo2();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //What
            case "What Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhatSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "What Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhatCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "What Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhatPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "What Modals Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhatModalsSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "What Modals Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhatModalsCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "What Modals Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhatModalsPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //When
            case "When Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhenSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "When Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhenCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "When Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhenPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "When Modals Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhenModalsSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "When Modals Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhenModalsCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "When Modals Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhenModalsPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //Where
            case "Where Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhereSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Where Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhereCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Where Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWherePerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Where Modals Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhereModalsSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Where Modals Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhereModalsCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Where Modals Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhereModalsPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Feel Like Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFeelLikeSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Reported Speech":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenReportedSpeech1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Incremento Paralelo":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenIncrementoParalelo();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Verbal Adjectives":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenVerbalAdjectives();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Relative Clause":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenRelativeClauses1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //Why
            case "Why Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhySimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Why Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhyCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Why Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhyPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Why Modals Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhyModalsSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Why Modals Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhyModalsCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Why Modals Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhyModalsPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //Who
            case "Who Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhoSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Who Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhoCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Who Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhoPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "Who Modals Simple":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhoModalsSimp1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Who Modals Continuous":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhoModalsCont1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "Who Modals Perfect":
                tt1 = new TextToSpeech(getApplicationContext(),
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
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWhoModalsPerf1();
                                    spanishsentence.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            case "0 to 50":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    cerotofifty gen1 = new cerotofifty();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab0a50();

                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "50 to 100":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    fiftytohundred gen1 = new fiftytohundred();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab50a100();

                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "100 to 150":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    cientociencincuenta gen1 = new cientociencincuenta();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab100a150();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "150 to 200":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C150a200 gen1 = new C150a200();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab150a200();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "200 to 250":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C200a250 gen1 = new C200a250();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab200a250();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "250 to 300":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C250a300 gen1 = new C250a300();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab250a300();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "300 to 350":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C300a350 gen1 = new C300a350();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab300a350();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "350 to 400":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C350a400 gen1 = new C350a400();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab350a400();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "400 to 450":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C400a500 gen1 = new C400a500();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab400a450();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
            case "450 to 500":
                tt1 = new TextToSpeech(getApplicationContext(),
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    C400a500 gen1 = new C400a500();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.vocab450a500();
                                    spanishsentence.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    answerinput.setText("");
                                    tt1.speak("como dirías..." + spanishsentence.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //aqui debería ir los metodos de sp int
            case "Tutorial":
                Toast.makeText(this, "Estas en tutorial, elige algo", Toast.LENGTH_SHORT).show();
                break ;
            /*case "Por Sujeto":
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
                                    spanishsentence.setText(n.gens);
                                    engtx=n.gene;
                                    t0= n.gene;
                                    t1= n.gene2;
                                    t2= n.gene3;
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    // en caso de int de sujeto tercer persona
                                    answerinput.setText("");
                                    tt1.speak("como dirías..."+spanishsentence.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                }

                            }
                        });
                break;
            case "Por Objeto":
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
                                    spanishsentence.setText(n.gens);
                                    engtx=n.gene;// he
                                    t0= n.gene;
                                    t1= n.gene2;// she
                                    t2= n.gene3;// it
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    // en caso de int de sujeto tercer persona
                                    //engtx.setTextColor(Color.WHITE);
                                    answerinput.setText("");
                                    tt1.speak("como dirías..."+spanishsentence.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                }

                            }
                        });
                break;
            case "Por Preposición":
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
                                    spanishsentence.setText(n.gens);
                                    engtx=n.gene;// he
                                    t0= n.gene;
                                    t1=n.gene2;
                                    t2= n.gene3;
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    // en caso de int de sujeto tercer persona
                                    //engtx.setTextColor(Color.WHITE);
                                    answerinput.setText("");
                                    tt1.speak("como dirías..."+spanishsentence.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                }

                            }
                        });
                break;
            case "Interferencia Reflexiva":
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
                                    spanishsentence.setText(n.gens);
                                    engtx=n.gene;// he
                                    t1= n.gene2;// she
                                    t2= n.gene3;// it
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    // en caso de int de sujeto tercer persona
                                    //engtx.setTextColor(Color.WHITE);
                                    answerinput.setText("");
                                    tt1.speak("como dirías..."+spanishsentence.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                }

                            }
                        });
                break;

            case "Interferencia Pasiva":
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
                                    spanishsentence.setText(n.gens);
                                    engtx=n.gene;// he
                                    t0= n.gene;
                                    t1= n.gene2;
                                    t2= n.gene3;
                                    t3= n.gene4;
                                    t4= n.gene5;
                                    t5= n.gene6;
                                    t6=n.gene7;
                                    // en caso de int de sujeto tercer persona
                                    //engtx.setTextColor(Color.WHITE);
                                    answerinput.setText("");
                                    tt1.speak("como dirías..."+spanishsentence.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                }

                            }
                        });
                break;*/
        }
    }

    public void AnswerCheckerChooser(View view){
        switch (selectionLevel){
            case "Syntax":
                SendStructureInfoToDb();
                break;
            case "Vocabulary":
                CheckRightorWrongVocab();
                break;
            case "Spanish Interference":
                Toast.makeText(this, "En mantenimiento. Por favor escoga otro nivel", Toast.LENGTH_SHORT).show();
                /*spintdbtesting();*/
                break;
            case "Conscious Interference":
                Conintdbtesting();
                break;
        }
    }

    private void   turnTrue(@NonNull String CurrentStructure) {

        switch (CurrentStructure){
            case "Present Simple":
                ps=true;

                break;
            case "Present Continuous":
                pc=true;
                break;
            case "Present Perfect":
                pp=true;
                break;
            case "Present Perfect Continuous":
                ppc=true;
                break;
            case "Past Simple":
                pss=true;
                break;
            case "Past Continuous":
                psc=true;
                break;
            case "Past Perfect":
                psp=true;
                break;
            case "Past Perfect Continuous":
                pspc=true;
                break;
            case "Future Simple":
                fs=true;
                break;
            case "Future Continuous":
                fc=true;
                break;
            case "Future Perfect":
                fp=true;
                break;
            case "Future Perfect Continuous":
                fpc=true;
                break;
            case "Would Simple":
                ws=true;
                break;
            case "Would Continuous":
                wc=true;
                break;
            case "Would Perfect":
                wp=true;
                break;
            case "Would Perfect Continuous":
                wpc=true;
                break;
            case "Could Simple":
                cos=true;
                break;
            case "Could Continuous":
                coc=true;
                break;
            case "Could Perfect":
                cop=true;
                break;
            case "Could Perfect Continuous":
                copc=true;
                break;
            case "Might Simple":
                ms=true;
                break;
            case "Might Continuous":
                mc=true;
                break;
            case "Might Perfect":
                mp=true;
                break;
            case "Might Perfect Continuous":
                mpc=true;
                break;
            case "Can Simple":
                cs=true;
                break;
            case "Can Continuous":
                cc=true;
                break;
            case "Must Simple":
                mus=true;
                break;
            case "Must Continuous":
                muc=true;
                break;
            case "Should Simple":
                ss=true;
                break;
            case "Should Continuous":
                sc=true;
                break;
            case "Should Perfect":
                sp=true;
                break;
            case "Should Perfect Continuous":
                spc=true;
                break;
            case "Want To":
                wt=true;
                break;
            case "For To":
                ft=true;
                break;
            case "Supposed To Present":
                stp=true;
                break;
            case "Wish Past Perfect":
                wpp=true;
                break;
            case "Used To":
                ut=true;
                break;
            case "Be Used To":
                but=true;
                break;
            // interferencias
//            case "Por Sujeto":
//                intxsub=true;
//                break ;
//            case "Por Objeto":
//                intxob=true;
//                break ;
//            case "Por Preposición":
//                intxprep=true;
//                break ;
//            case "Interferencia Reflexiva":
//                intxref=true;
//                break ;
//            case "Interferencia Pasiva":
//                intpasiva=true;
//                break ;

            case "the":
                the= true;
                Toast.makeText(this, "inside the", Toast.LENGTH_SHORT).show();
                break;
            case "to be":
                tobe= true;
                break;
            case "and":
                and= true;
                break;
            case "of":
                of= true;
                break;
            case "a":
                a= true;
                break;
            case "in":
                in= true;
                break;
            case "to":
                to= true;
                break;
            case "to have":
                tohave= true;
                break;
            case "it":
                it= true;
                break;
            case "I":
                I= true;
                break;
            case "that 1":
                that1= true;
                break;
            case "that 2":
                that2= true;
                break;
            case "for 1":
                for1= true;
                break;
            case "for 2":
                for2= true;
                break;
            case "you":
                you= true;
                break;
            case "he":
                he= true;
                break;
            case "with":
                with= true;
                break;
            case "on":
                on= true;
                break;
            case "to do":
                todo= true;
                break;
            case "to say":
                tosay= true;
                break;
            case "they":
                they= true;
                break;
            case "at":
                at= true;
                break;
            case "but 1":
                but1= true;
                break;
            case "we":
                we= true;
                break;
            case "his":
                his= true;
                break;
            case "from 1":
                from1= true;
                break;
            case "from 2":
                from2= true;
                break;
            case "since":
                since= true;
                break;
            case "by":
                by= true;
                break;
            case "she":
                she= true;
                break;
            case "or":
                or= true;
                break;
            case "as 1":
                as1= true;
                break;
            case "as 2":
                as2= true;
                break;
            case "what 1":
                what1= true;
                break;
            case "what 2":
                what2= true;
                break;
            case "to go":
                togo= true;
                break;
            case "their":
                their= true;
                break;
            case "can":
                can= true;
                break;
            case "who":
                who= true;
                break;
            case "to get":
                toget= true;
                break;
            case "if 1":
                if1= true;
                break;
            case "would":
                would= true;
                break;
            case "her":
                her= true;
                break;
            case "all":
                all= true;
                break;
            case "my":
                my= true;
                break;
            case "to make":
                tomake= true;
                break;
            case "about 1":
                about1= true;
                break;
            case "about 2":
                about2= true;
                break;
            case "will":
                will= true;
                break;
            case "up":
                up= true;
                break;
            //0 a 50

            case "one":
                one= true;
                break;
            case "time":
                time= true;
                break;
            case "there":
                there= true;
                break;
            case "year":
                year= true;
                break;
            case "so":
                so= true;
                break;
            case "think":
                think= true;
                break;
            case "when":
                when= true;
                break;
            case "which":
                which= true;
                break;
            case "them":
                them= true;
                break;
            case "some":
                some= true;
                break;
            case "me":
                me= true;
                break;
            case "people":
                people= true;
                break;
            case "take":
                take= true;
                break;
            case "out":
                out= true;
                break;
            case "into":
                into= true;
                break;
            case "just":
                just= true;
                break;
            case "see1":
                see1= true;
                break;
            case "him":
                him= true;
                break;
            case "your":
                your= true;
                break;
            case "come":
                come= true;
                break;
            case "could":
                could= true;
                break;
            case "now":
                now= true;
                break;
            case "than":
                than= true;
                break;
            case "like":
                like= true;
                break;
            case "other":
                other= true;
                break;
            case "how":
                how= true;
                break;
            case "then":
                then= true;
                break;
            case "its":
                its= true;
                break;
            case "our":
                our= true;
                break;
            case "two":
                two= true;
                break;
            case "more":
                more= true;
                break;
            case "these":
                these= true;
                break;
            case "want":
                want= true;
                break;
            case "way":
                way= true;
                break;
            case "look":
                look= true;
                break;
            case "first":
                first= true;
                break;
            case "also":
                also= true;
                break;
            case "new1":
                new1= true;
                break;
            case "because":
                because= true;
                break;
            case "day":
                day= true;
                break;
            case "more1":
                more1= true;
                break;
            case "use":
                use= true;
                break;
            case "no":
                no= true;
                break;
            case "man":
                man= true;
                break;
            case "find":
                find= true;
                break;
            case "here":
                here= true;
                break;
            case "thing":
                thing= true;
                break;
            case "give":
                give= true;
                break;
            case "many":
                many= true;
                break;
            case "well":
                well= true;
                break;
            //50 a 100

            case "only":
                only= true;
                break;
            case "those":
                those= true;
                break;
            case "tell":
                tell= true;
                break;
            case "one2":
                one2= true;
                break;
            case "very":
                very= true;
                break;
            case "her1":
                her1= true;
                break;
            case "even":
                even= true;
                break;
            case "back":
                back= true;
                break;
            case "any":
                any= true;
                break;
            case "good":
                good= true;
                break;
            case "woman":
                woman= true;
                break;
            case "through":
                through= true;
                break;
            case "us":
                us= true;
                break;
            case "life":
                life= true;
                break;
            case "child":
                child= true;
                break;
            case "there1":
                there1= true;
                break;
            case "work":
                work= true;
                break;
            case "down":
                down= true;
                break;
            case "may":
                may= true;
                break;
            case "after":
                after= true;
                break;
            case "should":
                should= true;
                break;
            case "call":
                call= true;
                break;
            case "world":
                world= true;
                break;
            case "over":
                over= true;
                break;
            case "school":
                school= true;
                break;
            case "still":
                still= true;
                break;
            case "try1":
                try1= true;
                break;
            case "in1":
                in1= true;
                break;
            case "as":
                as= true;
                break;
            case "last":
                last= true;
                break;
            case "ask":
                ask= true;
                break;
            case "need":
                need= true;
                break;
            case "too":
                too= true;
                break;
            case "feel":
                feel= true;
                break;
            case "three":
                three= true;
                break;
            case "when1":
                when1= true;
                break;
            case "state":
                state= true;
                break;
            case "never":
                never= true;
                break;
            case "become":
                become= true;
                break;
            case "between":
                between= true;
                break;
            case "high":
                high= true;
                break;
            case "really":
                really= true;
                break;
            case "something":
                something= true;
                break;
            case "most":
                most= true;
                break;
            case "another":
                another= true;
                break;
            case "much":
                much= true;
                break;
            case "another1":
                another1= true;
                break;
            case "much1":
                much1= true;
                break;
            case "family":
                family= true;
                break;
            case "own":
                own= true;
                break;
            case "out1":
                out1= true;
                break;
            case "leave":
                leave= true;
                break;
            case "put":
                put= true;
                break;
            //100 a 150

            case "old":
                old= true;
                break;
            case "while1":
                while1= true;
                break;
            case "mean":
                mean= true;
                break;
            case "on2":
                on2= true;
                break;
            case "keep":
                keep= true;
                break;
            case "student":
                student= true;
                break;
            case "why":
                why= true;
                break;
            case "let":
                let= true;
                break;
            case "great":
                great= true;
                break;
            case "same":
                same= true;
                break;
            case "big":
                big= true;
                break;
            case "group":
                group= true;
                break;
            case "begin":
                begin= true;
                break;
            case "seem":
                seem= true;
                break;
            case "country":
                country= true;
                break;
            case "help":
                help= true;
                break;
            case "talk":
                talk= true;
                break;
            case "where":
                where= true;
                break;
            case "turn":
                turn= true;
                break;
            case "problem":
                problem= true;
                break;
            case "every":
                every= true;
                break;
            case "start":
                start= true;
                break;
            case "hand":
                hand= true;
                break;
            case "might":
                might= true;
                break;
            case "american":
                american= true;
                break;
            case "show":
                show= true;
                break;
            case "part":
                part= true;
                break;
            case "about":
                about= true;
                break;
            case "against":
                against= true;
                break;
            case "place":
                place= true;
                break;
            case "over2":
                over2= true;
                break;
            case "such":
                such= true;
                break;
            case "again":
                again= true;
                break;
            case "few":
                few= true;
                break;
            case "case1":
                case1= true;
                break;
            case "most2":
                most2= true;
                break;
            case "week":
                week= true;
                break;
            case "company":
                company= true;
                break;
            case "where2":
                where2= true;
                break;
            case "system":
                system= true;
                break;
            case "each":
                each= true;
                break;
            case "right":
                right= true;
                break;
            case "program":
                program= true;
                break;
            case "hear":
                hear= true;
                break;
            case "so2":
                so2= true;
                break;
            case "question":
                question= true;
                break;
            case "during":
                during= true;
                break;
            case "work2":
                work2= true;
                break;
            case "play":
                play= true;
                break;
            //150 a 200

            case "goverment":
                goverment= true;
                break;
            case "run":
                run= true;
                break;
            case "small":
                small= true;
                break;
            case "number":
                number= true;
                break;
            case "off":
                off= true;
                break;
            case "always":
                always= true;
                break;
            case "move":
                move= true;
                break;
            case "like2":
                like2= true;
                break;
            case "night":
                night= true;
                break;
            case "live":
                live= true;
                break;
            case "mr":
                mr= true;
                break;
            case "point":
                point= true;
                break;
            case "believe":
                believe= true;
                break;
            case "hold":
                hold= true;
                break;
            case "today":
                today= true;
                break;
            case "bring":
                bring= true;
                break;
            case "happen":
                happen= true;
                break;
            case "next":
                next= true;
                break;
            case "without":
                without= true;
                break;
            case "before":
                before= true;
                break;
            case "large":
                large= true;
                break;
            case "all2":
                all2= true;
                break;
            case "million":
                million= true;
                break;
            case "must":
                must= true;
                break;
            case "home":
                home= true;
                break;
            case "under":
                under= true;
                break;
            case "water":
                water= true;
                break;
            case "room":
                room= true;
                break;
            case "write":
                write= true;
                break;
            case "mother":
                mother= true;
                break;
            case "area":
                area= true;
                break;
            case "national":
                national= true;
                break;
            case "money":
                money= true;
                break;
            case "story":
                story= true;
                break;
            case "young":
                young= true;
                break;
            case "fact":
                fact= true;
                break;
            case "month":
                month= true;
                break;
            case "different":
                different= true;
                break;
            case "lot":
                lot= true;
                break;
            case "right2":
                right2= true;
                break;
            case "study":
                study= true;
                break;
            case "book":
                book= true;
                break;
            case "eye":
                eye= true;
                break;
            case "job":
                job= true;
                break;
            case "word":
                word= true;
                break;
            case "though":
                though= true;
                break;
            case "business":
                business= true;
                break;
            case "issue":
                issue= true;
                break;
            case "side":
                side= true;
                break;
            case "kind":
                kind= true;
                break;
            //200 a 250

            case "four":
                four= true;
                break;
            case "head":
                head= true;
                break;
            case "far":
                far= true;
                break;
            case "black":
                black= true;
                break;
            case "long1":
                long1= true;
                break;
            case "both2":
                both2= true;
                break;
            case "little":
                little= true;
                break;
            case "house":
                house= true;
                break;
            case "yes":
                yes= true;
                break;
            case "after2":
                after2= true;
                break;
            case "since2":
                since2= true;
                break;
            case "long2":
                long2= true;
                break;
            case "provide":
                provide= true;
                break;
            case "service":
                service= true;
                break;
            case "around":
                around= true;
                break;
            case "friend":
                friend= true;
                break;
            case "important":
                important= true;
                break;
            case "father":
                father= true;
                break;
            case "sit":
                sit= true;
                break;
            case "away":
                away= true;
                break;
            case "until":
                until= true;
                break;
            case "power":
                power= true;
                break;
            case "hour":
                hour= true;
                break;
            case "game":
                game= true;
                break;
            case "often":
                often= true;
                break;
            case "yet":
                yet= true;
                break;
            case "line":
                line= true;
                break;
            case "political":
                political= true;
                break;
            case "end":
                end= true;
                break;
            case "among":
                among= true;
                break;
            case "ever":
                ever= true;
                break;
            case "stand":
                stand= true;
                break;
            case "bad":
                bad= true;
                break;
            case "lose":
                lose= true;
                break;
            case "however":
                however= true;
                break;
            case "member":
                member= true;
                break;
            case "pay":
                pay= true;
                break;
            case "law":
                law= true;
                break;
            case "meet":
                meet= true;
                break;
            case "car":
                car= true;
                break;
            case "city":
                city= true;
                break;
            case "almost":
                almost= true;
                break;
            case "include":
                include= true;
                break;
            case "continue1":
                continue1= true;
                break;
            case "set":
                set= true;
                break;
            case "later":
                later= true;
                break;
            case "community":
                community= true;
            case "much2":
                much2= true;
            case "name":
                name= true;
                //250 a 300

            case "five":
                five= true;
                break;
            case "once":
                once= true;
                break;
            case "white":
                white= true;
                break;
            case "least":
                least= true;
                break;
            case "president":
                president= true;
                break;
            case "learn":
                learn= true;
                break;
            case "real":
                real= true;
                break;
            case "change2":
                change2= true;
                break;
            case "team":
                team= true;
                break;
            case "minute":
                minute= true;
                break;
            case "best":
                best= true;
                break;
            case "several":
                several= true;
                break;
            case "idea":
                idea= true;
                break;
            case "kid":
                kid= true;
                break;
            case "body":
                body= true;
                break;
            case "information":
                information= true;
                break;
            case "nothing":
                nothing= true;
                break;
            case "ago":
                ago= true;
                break;
            case "right3":
                right3= true;
                break;
            case "lead":
                lead= true;
                break;
            case "social":
                social= true;
                break;
            case "understand":
                understand= true;
                break;
            case "whether":
                whether= true;
                break;
            case "back2":
                back2= true;
                break;
            case "watch":
                watch= true;
                break;
            case "together":
                together= true;
                break;
            case "follow":
                follow= true;
                break;
            case "around2":
                around2= true;
                break;
            case "parent":
                parent= true;
                break;
            case "only2":
                only2= true;
                break;
            case "stop":
                stop= true;
                break;
            case "face":
                face= true;
                break;
            case "anything":
                anything= true;
                break;
            case "create":
                create= true;
                break;
            case "public2":
                public2= true;
                break;
            case "already":
                already= true;
                break;
            case "speak":
                speak= true;
                break;
            case "others":
                others= true;
                break;
            case "read":
                read= true;
                break;
            case "level":
                level= true;
                break;
            case "allow":
                allow= true;
                break;
            case "add":
                add= true;
                break;
            case "office":
                office= true;
                break;
            case "spend":
                spend= true;
                break;
            case "door":
                door= true;
                break;
            case "health":
                health= true;
                break;
            case "person":
                person= true;
            case "art":
                art= true;
            case "sure":
                sure= true;
            case "such2":
                such2= true;
                //300 a 350

            case "war":
                war= true;
                break;
            case "history":
                history= true;
                break;
            case "party":
                party= true;
                break;
            case "within":
                within= true;
                break;
            case "to grow":
                togrow= true;
                break;
            case "result":
                result= true;
                break;
            case "open":
                open= true;
                break;
            case "change":
                change= true;
                break;
            case "morning":
                morning= true;
                break;
            case "to walk":
                towalk= true;
                break;
            case "reason":
                reason= true;
                break;
            case "low":
                low= true;
                break;
            case "to win":
                towin= true;
                break;
            case "to research":
                toresearch= true;
                break;
            case "girl":
                girl= true;
                break;
            case "guy":
                guy= true;
                break;
            case "early":
                early= true;
                break;
            case "food":
                food= true;
                break;
            case "before2":
                before2= true;
                break;
            case "moment":
                moment= true;
                break;
            case "himself":
                himself= true;
                break;
            case "toair":
                toair= true;
                break;
            case "teacher":
                teacher= true;
                break;
            case "to force":
                toforce= true;
                break;
            case "to offer":
                tooffer= true;
                break;
            case "enough":
                enough= true;
                break;
            case "both":
                both= true;
                break;
            case "education":
                education= true;
                break;
            case "across":
                across= true;
                break;
            case "although":
                although= true;
                break;
            case "to remember":
                toremember= true;
                break;
            case "foot":
                foot= true;
                break;
            case "second":
                second= true;
                break;
            case "boy":
                boy= true;
                break;
            case "maybe":
                maybe= true;
                break;
            case "to ward":
                toward= true;
                break;
            case "able":
                able= true;
                break;
            case "age":
                age= true;
                break;
            case "off2":
                off2= true;
                break;
            case "policy":
                policy= true;
                break;
            case "everything":
                everything= true;
                break;
            case "love":
                love= true;
                break;
            case "to process":
                toprocess= true;
                break;
            case "music":
                music= true;
                break;
            case "including":
                including= true;
                break;
            case "to consider":
                toconsider= true;
                break;
            case "to appear":
                toappear= true;
                break;
            case "actually":
                actually= true;
                break;
            case "to buy":
                tobuy= true;
                break;
            case "probably":
                probably= true;
                break;
            //aqui termina 350 a 400

            case "human":
                human= true;
                break;
            case "to wait":
                towait= true;
                break;
            case "to serve":
                toserve= true;
                break;
            case "market":
                market= true;
                break;
            case "to die":
                todie= true;
                break;
            case "to send":
                tosend= true;
                break;
            case "toexpect":
                toexpect= true;
                break;
            case "home2":
                home2= true;
                break;
            case "sense":
                sense= true;
                break;
            case "to build":
                tobuild= true;
                break;
            case "to stay":
                tostay= true;
                break;
            case "to fall":
                tofall= true;
                break;
            case "oh":
                oh= true;
                break;
            case "nation":
                nation= true;
                break;
            case "to plan":
                toplan= true;
                break;
            case "cut":
                cut= true;
                break;
            case "college":
                college= true;
                break;
            case "interest":
                interest= true;
                break;
            case "death":
                death= true;
                break;
            case "course":
                course= true;
                break;
            case "someone":
                someone= true;
                break;
            case "experience":
                experience= true;
                break;
            case "behind":
                behind= true;
                break;
            case "reach":
                reach= true;
                break;
            case "local":
                local= true;
                break;
            case "to kill":
                tokill= true;
                break;
            case "six":
                six= true;
                break;
            case "remain":
                remain= true;
                break;
            case "effect":
                effect= true;
                break;
            case "use2":
                use2= true;
                break;
            case "yeah":
                yeah= true;
                break;
            case "to suggest":
                tosuggest= true;
                break;
            case "class":
                class2= true;
                break;
            case "control":
                control= true;
                break;
            case "to raise":
                toraise= true;
                break;
            case "care":
                care= true;
                break;
            case "perhaps":
                perhaps= true;
                break;
            case "little2":
                little2= true;
                break;
            case "late":
                late= true;
                break;
            case "hard":
                hard= true;
                break;
            case "field":
                field= true;
                break;
            case "else":
                else2= true;
                break;
            case "to pass":
                topass= true;
                break;
            case "former":
                former= true;
                break;
            case "sell":
                sell= true;
                break;
            case "major":
                major= true;
                break;
            case "sometimes":
                sometimes= true;
                break;
            case "require":
                require= true;
                break;
            case "along":
                along= true;
                break;
            case "development":
                development= true;
                break;
            case "themselves":
                themselves= true;
                break;
            //aqui termina 400 a 450

            case "report":
                report= true;
                break;
            case "role":
                role= true;
                break;
            case "better":
                better= true;
                break;
            case "economic":
                economic= true;
                break;
            case "effort":
                effort= true;
                break;
            case "up2":
                up2= true;
                break;
            case "to decide":
                todecide= true;
                break;
            case "rate":
                rate= true;
                break;
            case "strong":
                strong= true;
                break;
            case "possible":
                possible= true;
                break;
            case "heart":
                heart= true;
                break;
            case "drug":
                drug= true;
                break;
            case "to show":
                toshow= true;
                break;
            case "leader":
                leader= true;
                break;
            case "light":
                light= true;
                break;
            case "voice":
                voice= true;
                break;
            case "wife":
                wife= true;
                break;
            case "whole":
                whole= true;
                break;
            case "police":
                police= true;
                break;
            case "mind":
                mind= true;
                break;
            case "finally2":
                finally2= true;
                break;
            case "to pull":
                topull= true;
                break;
            case "to return":
                toreturn= true;
                break;
            case "free":
                free= true;
                break;
            case "military":
                military= true;
                break;
            case "price":
                price= true;
                break;
            case "report2":
                report2= true;
                break;
            case "less":
                less= true;
                break;
            case "according to":
                accordingto= true;
                break;
            case "decision":
                decision= true;
                break;
            case "to explain":
                toexplain= true;
                break;
            case "son":
                son= true;
                break;
            case "hope":
                hope= true;
                break;
            case "even2":
                even2= true;
                break;
            case "to develop":
                todevelop= true;
                break;
            case "view":
                view= true;
                break;
            case "relationship":
                relationship= true;
                break;
            case "carry":
                carry= true;
                break;
            case "town":
                town= true;
                break;
            case "road":
                road= true;
                break;
            case "to drive":
                todrive= true;
                break;
            case "arm":
                arm= true;
                break;
            case "true2":
                true2= true;
                break;
            case "federal":
                federal= true;
                break;
            case "to break":
                tobreak= true;
                break;
            case "better2":
                better2= true;
                break;
            case "difference":
                difference= true;
                break;
            case "to thank":
                tothank= true;
                break;
            case "to receive":
                toreceive= true;
                break;
            case "value":
                value= true;
                break;
            //aqui termina 450 a 500

        }
    }
    private void   turnTrueTime(@NonNull String CurrentStructure, String segundos) {

        switch (CurrentStructure){
            case "Present Simple":
                ps=true;
                pssec= segundos;
                break;
            case "Present Continuous":
                pc=true;
                pcsec= segundos;
                break;
            case "Present Perfect":
                pp=true;
                ppsec=segundos;
                break;
            case "Present Perfect Continuous":
                ppc=true;
                ppcsec=segundos;
                break;
            case "Past Simple":
                pss=true;
                psssec=segundos;
                break;
            case "Past Continuous":
                psc=true;
                pscsec=segundos;
                break;
            case "Past Perfect":
                psp=true;
                pspsec=segundos;
                break;
            case "Past Perfect Continuous":
                pspc=true;
                pspcsec=segundos;
                break;
            case "Future Simple":
                fs=true;
                fssec=segundos;
                break;
            case "Future Continuous":
                fc=true;
                fcsec=segundos;
                break;
            case "Future Perfect":
                fp=true;
                fpsec=segundos;
                break;
            case "Future Perfect Continuous":
                fpc=true;
                fpcsec=segundos;
                break;
            case "Would Simple":
                ws=true;
                wssec=segundos;
                break;
            case "Would Continuous":
                wc=true;
                wcsec=segundos;
                break;
            case "Would Perfect":
                wp=true;
                wpsec=segundos;
                break;
            case "Would Perfect Continuous":
                wpc=true;
                wpcsec=segundos;
                break;
            case "Could Simple":
                cos=true;
                cossec=segundos;
                break;
            case "Could Continuous":
                coc=true;
                cocsec=segundos;
                break;
            case "Could Perfect":
                cop=true;
                copsec=segundos;
                break;
            case "Could Perfect Continuous":
                copc=true;
                copcsec=segundos;
                break;
            case "Might Simple":
                ms=true;
                mssec= segundos;
                break;
            case "Might Continuous":
                mc=true;
                mcsec= segundos;
                break;
            case "Might Perfect":
                mp=true;
                mpsec= segundos;
                break;
            case "Might Perfect Continuous":
                mpc=true;
                mpcsec= segundos;
                break;
            case "Can Simple":
                cs=true;
                cssec= segundos;
                break;
            case "Can Continuous":
                cc=true;
                ccsec= segundos;
                break;
            case "Must Simple":
                mus=true;
                mussec= segundos;
                break;
            case "Must Continuous":
                muc=true;
                mucsec= segundos;
                break;
            case "Should Simple":
                ss=true;
                sssec= segundos;
                break;
            case "Should Continuous":
                sc=true;
                scsec= segundos;
                break;
            case "Should Perfect":
                sp=true;
                spsec= segundos;
                break;
            case "Should Perfect Continuous":
                spc=true;
                spcsec= segundos;
                break;
            case "Want To":
                wt=true;
                wtsec= segundos;
                break;
            case "For To":
                ft=true;
                ftsec= segundos;
                break;
            case "Supposed To Present":
                stp=true;
                stpsec= segundos;
                break;
            case "Wish Past Perfect":
                wpp=true;
                wppsec= segundos;
                break;
            case "Used To":
                ut=true;
                utsec= segundos;
                break;
            case "Be Used To":
                but=true;
                butsec= segundos;
                break;
            case "the":
                the= true;
                Toast.makeText(this, "inside the", Toast.LENGTH_SHORT).show();
                break;
            case "to be":
                tobe= true;
                break;
            case "and":
                and= true;
                break;
            case "of":
                of= true;
                break;
            case "a":
                a= true;
                break;
            case "in":
                in= true;
                break;
            case "to":
                to= true;
                break;
            case "to have":
                tohave= true;
                break;
            case "it":
                it= true;
                break;
            case "I":
                I= true;
                break;
            case "that 1":
                that1= true;
                break;
            case "that 2":
                that2= true;
                break;
            case "for 1":
                for1= true;
                break;
            case "for 2":
                for2= true;
                break;
            case "you":
                you= true;
                break;
            case "he":
                he= true;
                break;
            case "with":
                with= true;
                break;
            case "on":
                on= true;
                break;
            case "to do":
                todo= true;
                break;
            case "to say":
                tosay= true;
                break;
            case "they":
                they= true;
                break;
            case "at":
                at= true;
                break;
            case "but 1":
                but1= true;
                break;
            case "we":
                we= true;
                break;
            case "his":
                his= true;
                break;
            case "from 1":
                from1= true;
                break;
            case "from 2":
                from2= true;
                break;
            case "since":
                since= true;
                break;
            case "by":
                by= true;
                break;
            case "she":
                she= true;
                break;
            case "or":
                or= true;
                break;
            case "as 1":
                as1= true;
                break;
            case "as 2":
                as2= true;
                break;
            case "what 1":
                what1= true;
                break;
            case "what 2":
                what2= true;
                break;
            case "to go":
                togo= true;
                break;
            case "their":
                their= true;
                break;
            case "can":
                can= true;
                break;
            case "who":
                who= true;
                break;
            case "to get":
                toget= true;
                break;
            case "if 1":
                if1= true;
                break;
            case "would":
                would= true;
                break;
            case "her":
                her= true;
                break;
            case "all":
                all= true;
                break;
            case "my":
                my= true;
                break;
            case "to make":
                tomake= true;
                break;
            case "about 1":
                about1= true;
                break;
            case "about 2":
                about2= true;
                break;
            case "will":
                will= true;
                break;
            case "up":
                up= true;
                break;
            //0 a 50

            case "one":
                one= true;
                break;
            case "time":
                time= true;
                break;
            case "there":
                there= true;
                break;
            case "year":
                year= true;
                break;
            case "so":
                so= true;
                break;
            case "think":
                think= true;
                break;
            case "when":
                when= true;
                break;
            case "which":
                which= true;
                break;
            case "them":
                them= true;
                break;
            case "some":
                some= true;
                break;
            case "me":
                me= true;
                break;
            case "people":
                people= true;
                break;
            case "take":
                take= true;
                break;
            case "out":
                out= true;
                break;
            case "into":
                into= true;
                break;
            case "just":
                just= true;
                break;
            case "see1":
                see1= true;
                break;
            case "him":
                him= true;
                break;
            case "your":
                your= true;
                break;
            case "come":
                come= true;
                break;
            case "could":
                could= true;
                break;
            case "now":
                now= true;
                break;
            case "than":
                than= true;
                break;
            case "like":
                like= true;
                break;
            case "other":
                other= true;
                break;
            case "how":
                how= true;
                break;
            case "then":
                then= true;
                break;
            case "its":
                its= true;
                break;
            case "our":
                our= true;
                break;
            case "two":
                two= true;
                break;
            case "more":
                more= true;
                break;
            case "these":
                these= true;
                break;
            case "want":
                want= true;
                break;
            case "way":
                way= true;
                break;
            case "look":
                look= true;
                break;
            case "first":
                first= true;
                break;
            case "also":
                also= true;
                break;
            case "new1":
                new1= true;
                break;
            case "because":
                because= true;
                break;
            case "day":
                day= true;
                break;
            case "more1":
                more1= true;
                break;
            case "use":
                use= true;
                break;
            case "no":
                no= true;
                break;
            case "man":
                man= true;
                break;
            case "find":
                find= true;
                break;
            case "here":
                here= true;
                break;
            case "thing":
                thing= true;
                break;
            case "give":
                give= true;
                break;
            case "many":
                many= true;
                break;
            case "well":
                well= true;
                break;
            //50 a 100

            case "only":
                only= true;
                break;
            case "those":
                those= true;
                break;
            case "tell":
                tell= true;
                break;
            case "one2":
                one2= true;
                break;
            case "very":
                very= true;
                break;
            case "her1":
                her1= true;
                break;
            case "even":
                even= true;
                break;
            case "back":
                back= true;
                break;
            case "any":
                any= true;
                break;
            case "good":
                good= true;
                break;
            case "woman":
                woman= true;
                break;
            case "through":
                through= true;
                break;
            case "us":
                us= true;
                break;
            case "life":
                life= true;
                break;
            case "child":
                child= true;
                break;
            case "there1":
                there1= true;
                break;
            case "work":
                work= true;
                break;
            case "down":
                down= true;
                break;
            case "may":
                may= true;
                break;
            case "after":
                after= true;
                break;
            case "should":
                should= true;
                break;
            case "call":
                call= true;
                break;
            case "world":
                world= true;
                break;
            case "over":
                over= true;
                break;
            case "school":
                school= true;
                break;
            case "still":
                still= true;
                break;
            case "try1":
                try1= true;
                break;
            case "in1":
                in1= true;
                break;
            case "as":
                as= true;
                break;
            case "last":
                last= true;
                break;
            case "ask":
                ask= true;
                break;
            case "need":
                need= true;
                break;
            case "too":
                too= true;
                break;
            case "feel":
                feel= true;
                break;
            case "three":
                three= true;
                break;
            case "when1":
                when1= true;
                break;
            case "state":
                state= true;
                break;
            case "never":
                never= true;
                break;
            case "become":
                become= true;
                break;
            case "between":
                between= true;
                break;
            case "high":
                high= true;
                break;
            case "really":
                really= true;
                break;
            case "something":
                something= true;
                break;
            case "most":
                most= true;
                break;
            case "another":
                another= true;
                break;
            case "much":
                much= true;
                break;
            case "another1":
                another1= true;
                break;
            case "much1":
                much1= true;
                break;
            case "family":
                family= true;
                break;
            case "own":
                own= true;
                break;
            case "out1":
                out1= true;
                break;
            case "leave":
                leave= true;
                break;
            case "put":
                put= true;
                break;
            //100 a 150

            case "old":
                old= true;
                break;
            case "while1":
                while1= true;
                break;
            case "mean":
                mean= true;
                break;
            case "on2":
                on2= true;
                break;
            case "keep":
                keep= true;
                break;
            case "student":
                student= true;
                break;
            case "why":
                why= true;
                break;
            case "let":
                let= true;
                break;
            case "great":
                great= true;
                break;
            case "same":
                same= true;
                break;
            case "big":
                big= true;
                break;
            case "group":
                group= true;
                break;
            case "begin":
                begin= true;
                break;
            case "seem":
                seem= true;
                break;
            case "country":
                country= true;
                break;
            case "help":
                help= true;
                break;
            case "talk":
                talk= true;
                break;
            case "where":
                where= true;
                break;
            case "turn":
                turn= true;
                break;
            case "problem":
                problem= true;
                break;
            case "every":
                every= true;
                break;
            case "start":
                start= true;
                break;
            case "hand":
                hand= true;
                break;
            case "might":
                might= true;
                break;
            case "american":
                american= true;
                break;
            case "show":
                show= true;
                break;
            case "part":
                part= true;
                break;
            case "about":
                about= true;
                break;
            case "against":
                against= true;
                break;
            case "place":
                place= true;
                break;
            case "over2":
                over2= true;
                break;
            case "such":
                such= true;
                break;
            case "again":
                again= true;
                break;
            case "few":
                few= true;
                break;
            case "case1":
                case1= true;
                break;
            case "most2":
                most2= true;
                break;
            case "week":
                week= true;
                break;
            case "company":
                company= true;
                break;
            case "where2":
                where2= true;
                break;
            case "system":
                system= true;
                break;
            case "each":
                each= true;
                break;
            case "right":
                right= true;
                break;
            case "program":
                program= true;
                break;
            case "hear":
                hear= true;
                break;
            case "so2":
                so2= true;
                break;
            case "question":
                question= true;
                break;
            case "during":
                during= true;
                break;
            case "work2":
                work2= true;
                break;
            case "play":
                play= true;
                break;
            //150 a 200

            // interferencias
            /*case "Por Sujeto":
                intxsub=true;
                break ;
            case "Por Objeto":
                intxob=true;
                break ;
            case "Por Preposición":
                intxprep=true;
                break ;
            case "Interferencia Reflexiva":
                intxref=true;
                break ;
            case "Interferencia Pasiva":
                intpasiva=true;
                break ;*/



        }
    }

    //currently working on---------------------------------------
    public void SendStructureInfoToDb()  {
        String t = txteng.trim();
        String t2 = answerinput.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            cp = cp + 1;
            Toast.makeText(this, "inside good" + String.valueOf(cp), Toast.LENGTH_SHORT).show();
            prom = rounded / 4;

        } else {
            cn = cn + 1;
            Toast.makeText(this, String.valueOf(cn) + " inside bad " + txteng, Toast.LENGTH_SHORT).show();
        }
        if (cp == 4) {
            Toast.makeText(this, selectionStructure + "pasaste-Pasa a otra estructura" + String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp = 0;
            cn = 0;
            timerText.setText("your Average Response time: "  +String.valueOf(prom)+" seconds");
            timerText.setVisibility(View.VISIBLE);
            turnTrueTime(selectionStructure, String.valueOf(prom));
            timen = 0.0;
            if (timerTask != null) {
                timerTask.cancel();
            }
            timerTask = null;
            CheckStructureDbIfAlreadyApproved();
        } else if (cn == 4) {
            Toast.makeText(this, selectionStructure + "not passed Pasa a otra estructura" + String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn = 0;
            cp = 0;
        }


    }

    public void CheckRightorWrongVocab()  {
        String t = txteng.trim();
        String t2 = answerinput.getText().toString().trim();
        if(t.equalsIgnoreCase(t2)){
            Toast.makeText(this, String.valueOf(cp)+" is correct", Toast.LENGTH_SHORT).show();
            turnTrue(t.trim());
            ApproveRangeOfVocab();
            CheckVocabDbIfAlreadyApproved();

        }else {
            Toast.makeText(this, String.valueOf(cn)+" is not correct "+txteng, Toast.LENGTH_SHORT).show();
            CheckVocabDbIfAlreadyApproved();
        }



    }

    private void CheckVocabDbIfAlreadyApproved() {
        docrefVocab.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                vocabDbChecker =  documentSnapshot.toObject(StudentVocabRestultsModel.class);
                assert vocabDbChecker != null;
                if(vocabDbChecker.the){
                    the=true;
                }
                if(vocabDbChecker.tobe){
                    tobe=true;
                }
                if(vocabDbChecker.and){
                    and=true;
                }
                if(vocabDbChecker.of){
                    of=true;
                }
                if(vocabDbChecker.a){
                    a=true;
                }
                if(vocabDbChecker.in){
                    in=true;
                }
                if(vocabDbChecker.to){
                    to=true;
                }
                if(vocabDbChecker.tohave){
                    tohave=true;
                }
                if(vocabDbChecker.it){
                    it=true;
                }
                if(vocabDbChecker.I){
                    I=true;
                }
                if(vocabDbChecker.that1){
                    that1=true;
                }
                if(vocabDbChecker.that2){
                    that2=true;
                }
                if(vocabDbChecker.for1){
                    for1=true;
                }
                if(vocabDbChecker.for2){
                    for2=true;
                }
                if(vocabDbChecker.you){
                    you=true;
                }
                if(vocabDbChecker.he){
                    he=true;
                }
                if(vocabDbChecker.with){
                    with=true;
                }
                if(vocabDbChecker.on){
                    on=true;
                }
                if(vocabDbChecker.todo){
                    todo=true;
                }
                if(vocabDbChecker.tosay){
                    tosay=true;
                }
                if(vocabDbChecker.this1){
                    this1=true;
                }
                if(vocabDbChecker.they){
                    they=true;
                }
                if(vocabDbChecker.at){
                    at=true;
                }
                if(vocabDbChecker.but){
                    but=true;
                }
                if(vocabDbChecker.we){
                    we=true;
                }
                if(vocabDbChecker.his){
                    his=true;
                }
                if(vocabDbChecker.from1){
                    from1=true;
                }
                if(vocabDbChecker.from2){
                    from2=true;
                }
                if(vocabDbChecker.since){
                    since=true;
                }
                if(vocabDbChecker.by){
                    by=true;
                }
                if(vocabDbChecker.she){
                    she=true;
                }
                if(vocabDbChecker.or){
                    or=true;
                }
                if(vocabDbChecker.as1){
                    as1=true;
                }
                if(vocabDbChecker.as2){
                    as2=true;
                }
                if(vocabDbChecker.what1){
                    what1=true;
                }
                if(vocabDbChecker.what2){
                    what2=true;
                }
                if(vocabDbChecker.togo){
                    togo=true;
                }
                if(vocabDbChecker.their){
                    their=true;
                }
                if(vocabDbChecker.can){
                    can=true;
                }
                if(vocabDbChecker.who){
                    who=true;
                }
                if(vocabDbChecker.toget){
                    toget=true;
                }
                if(vocabDbChecker.if1){
                    if1=true;
                }
                if(vocabDbChecker.would){
                    would=true;
                }
                if(vocabDbChecker.her){
                    her=true;
                }
                if(vocabDbChecker.all){
                    all=true;
                }
                if(vocabDbChecker.my){
                    my=true;
                }
                if(vocabDbChecker.tomake){
                    tomake=true;
                }
                if(vocabDbChecker.about1){
                    about1=true;
                }
                if(vocabDbChecker.about2){
                    about2=true;
                }
                if(vocabDbChecker.toknow){
                    toknow=true;
                }
                if(vocabDbChecker.will){
                    will=true;
                }
                if(vocabDbChecker.up){
                    up=true;
                }
                // aqui termina 0 a 50

                //aqui empieza 50 a 100
                if(vocabDbChecker.one){
                    one=true;
                }
                if(vocabDbChecker.time){
                    time=true;
                }
                if(vocabDbChecker.there){
                    there=true;
                }
                if(vocabDbChecker.year){
                    year=true;
                }
                if(vocabDbChecker.so){
                    so=true;
                }
                if(vocabDbChecker.think){
                    think=true;
                }
                if(vocabDbChecker.when){
                    when=true;
                }
                if(vocabDbChecker.which){
                    which=true;
                }
                if(vocabDbChecker.them){
                    them=true;
                }
                if(vocabDbChecker.some){
                    some=true;
                }
                if(vocabDbChecker.me){
                    me=true;
                }
                if(vocabDbChecker.people){
                    people=true;
                }
                if(vocabDbChecker.take){
                    take=true;
                }
                if(vocabDbChecker.out){
                    out=true;
                }
                if(vocabDbChecker.into){
                    into=true;
                }
                if(vocabDbChecker.just){
                    just=true;
                }
                if(vocabDbChecker.see1){
                    see1=true;
                }
                if(vocabDbChecker.him){
                    him=true;
                }
                if(vocabDbChecker.your){
                    your=true;
                }
                if(vocabDbChecker.come){
                    come=true;
                }
                if(vocabDbChecker.could){
                    could=true;
                }
                if(vocabDbChecker.now){
                    now=true;
                }
                if(vocabDbChecker.than){
                    than=true;
                }
                if(vocabDbChecker.like){
                    like=true;
                }
                if(vocabDbChecker.other){
                    other=true;
                }
                if(vocabDbChecker.how){
                    how=true;
                }
                if(vocabDbChecker.then){
                    then=true;
                }
                if(vocabDbChecker.its){
                    its=true;
                }
                if(vocabDbChecker.our){
                    our=true;
                }
                if(vocabDbChecker.two){
                    two=true;
                }
                if(vocabDbChecker.more){
                    more=true;
                }
                if(vocabDbChecker.these){
                    these=true;
                }
                if(vocabDbChecker.want){
                    want=true;
                }
                if(vocabDbChecker.way){
                    way=true;
                }
                if(vocabDbChecker.look){
                    look=true;
                }
                if(vocabDbChecker.first){
                    first=true;
                }
                if(vocabDbChecker.also){
                    also=true;
                }
                if(vocabDbChecker.new1){
                    new1=true;
                }
                if(vocabDbChecker.because){
                    because=true;
                }
                if(vocabDbChecker.day){
                    day=true;
                }
                if(vocabDbChecker.more1){
                    more1=true;
                }
                if(vocabDbChecker.use){
                    use=true;
                }
                if(vocabDbChecker.no){
                    no=true;
                }
                if(vocabDbChecker.man){
                    man=true;
                }
                if(vocabDbChecker.find){
                    find=true;
                }
                if(vocabDbChecker.here){
                    here=true;
                }
                if(vocabDbChecker.thing){
                    thing=true;
                }
                if(vocabDbChecker.give){
                    give=true;
                }
                if(vocabDbChecker.many){
                    many=true;
                }
                if(vocabDbChecker.well){
                    well=true;
                }
                //aqui termina 50 a 100


                // 100 a 150 empieza
                if(vocabDbChecker.only){
                    only=true;
                }
                if(vocabDbChecker.those){
                    those=true;
                }
                if(vocabDbChecker.tell){
                    tell=true;
                }
                if(vocabDbChecker.one1){
                    one2=true;
                }
                if(vocabDbChecker.very){
                    very=true;
                }
                if(vocabDbChecker.her1){
                    her1=true;
                }
                if(vocabDbChecker.even){
                    even=true;
                }
                if(vocabDbChecker.back){
                    back=true;
                }
                if(vocabDbChecker.any){
                    any=true;
                }
                if(vocabDbChecker.good){
                    good=true;
                }
                if(vocabDbChecker.woman){
                    woman=true;
                }
                if(vocabDbChecker.through){
                    through=true;
                }
                if(vocabDbChecker.us){
                    us=true;
                }
                if(vocabDbChecker.life){
                    life=true;
                }
                if(vocabDbChecker.child){
                    child=true;
                }
                if(vocabDbChecker.there1){
                    there1=true;
                }
                if(vocabDbChecker.work){
                    work=true;
                }
                if(vocabDbChecker.down){
                    down=true;
                }
                if(vocabDbChecker.may){
                    may=true;
                }
                if(vocabDbChecker.after){
                    after=true;
                }
                if(vocabDbChecker.should){
                    should=true;
                }
                if(vocabDbChecker.call){
                    call=true;
                }
                if(vocabDbChecker.world){
                    world=true;
                }
                if(vocabDbChecker.over){
                    over=true;
                }
                if(vocabDbChecker.school){
                    school=true;
                }
                if(vocabDbChecker.still){
                    still=true;
                }
                if(vocabDbChecker.try1){
                    try1=true;
                }
                if(vocabDbChecker.in1){
                    in1=true;
                }
                if(vocabDbChecker.as){
                    as=true;
                }
                if(vocabDbChecker.last){
                    last=true;
                }
                if(vocabDbChecker.ask){
                    ask=true;
                }
                if(vocabDbChecker.need){
                    need=true;
                }
                if(vocabDbChecker.too){
                    too=true;
                }
                if(vocabDbChecker.feel){
                    feel=true;
                }
                if(vocabDbChecker.three){
                    three=true;
                }
                if(vocabDbChecker.when1){
                    when1=true;
                }
                if(vocabDbChecker.state){
                    state=true;
                }
                if(vocabDbChecker.never){
                    never=true;
                }
                if(vocabDbChecker.become){
                    become=true;
                }
                if(vocabDbChecker.between){
                    between=true;
                }
                if(vocabDbChecker.high){
                    high=true;
                }
                if(vocabDbChecker.really){
                    really=true;
                }
                if(vocabDbChecker.something){
                    something=true;
                }
                if(vocabDbChecker.most){
                    most=true;
                }
                if(vocabDbChecker.another){
                    another=true;
                }
                if(vocabDbChecker.much){
                    much=true;
                }
                if(vocabDbChecker.another1){
                    another1=true;
                }
                if(vocabDbChecker.much1){
                    much1=true;
                }
                if(vocabDbChecker.family){
                    family=true;
                }
                if(vocabDbChecker.own){
                    own=true;
                }
                if(vocabDbChecker.out1){
                    out1=true;
                }
                if(vocabDbChecker.leave){
                    leave=true;
                }
                if(vocabDbChecker.put){
                    put=true;
                }
                // aqui termina 100 a 150

                //aqui empieza 150 a 200

                if(vocabDbChecker.old){
                    old=true;
                }
                if(vocabDbChecker.while1){
                    while1=true;
                }
                if(vocabDbChecker.mean){
                    mean=true;
                }
                if(vocabDbChecker.on2){
                    on2=true;
                }
                if(vocabDbChecker.keep){
                    keep=true;
                }
                if(vocabDbChecker.student){
                    student=true;
                }
                if(vocabDbChecker.why){
                    why=true;
                }
                if(vocabDbChecker.let){
                    let=true;
                }
                if(vocabDbChecker.great){
                    great=true;
                }
                if(vocabDbChecker.same){
                    same=true;
                }
                if(vocabDbChecker.big){
                    big=true;
                }
                if(vocabDbChecker.group){
                    group=true;
                }
                if(vocabDbChecker.begin){
                    begin=true;
                }
                if(vocabDbChecker.seem){
                    seem =true;
                }
                if(vocabDbChecker.country){
                    country=true;
                }
                if(vocabDbChecker.help){
                    help=true;
                }
                if(vocabDbChecker.talk){
                    talk=true;
                }
                if(vocabDbChecker.where){
                    where=true;
                }
                if(vocabDbChecker.turn){
                    turn=true;
                }
                if(vocabDbChecker.problem){
                    problem=true;
                }
                if(vocabDbChecker.every){
                    every=true;
                }
                if(vocabDbChecker.start){
                    start=true;
                }
                if(vocabDbChecker.hand){
                    hand=true;
                }
                if(vocabDbChecker.might){
                    might=true;
                }
                if(vocabDbChecker.american){
                    american=true;
                }
                if(vocabDbChecker.show){
                    show=true;
                }
                if(vocabDbChecker.part){
                    part=true;
                }
                if(vocabDbChecker.about){
                    about=true;
                }
                if(vocabDbChecker.against){
                    against=true;
                }
                if(vocabDbChecker.place){
                    place=true;
                }
                if(vocabDbChecker.over2){
                    over2=true;
                }
                if(vocabDbChecker.such){
                    such= true;
                }
                if(vocabDbChecker.again){
                    again=true;
                }
                if(vocabDbChecker.few){
                    few=true;
                }
                if(vocabDbChecker.case1){
                    case1=true;
                }
                if(vocabDbChecker.most2){
                    most2=true;
                }
                if(vocabDbChecker.week){
                    week=true;
                }
                if(vocabDbChecker.company){
                    company=true;
                }
                if(vocabDbChecker.where2){
                    where2=true;
                }
                if(vocabDbChecker.system){
                    system=true;
                }
                if(vocabDbChecker.each){
                    each=true;
                }
                if(vocabDbChecker.right){
                    right=true;
                }
                if(vocabDbChecker.program){
                    program=true;
                }
                if(vocabDbChecker.hear){
                    hear=true;
                }
                if(vocabDbChecker.so2){
                    so2=true;
                }
                if(vocabDbChecker.question){
                    question=true;
                }
                if(vocabDbChecker.during){
                    during=true;
                }
                if(vocabDbChecker.work2){
                    work2=true;
                }
                if(vocabDbChecker.play){
                    play=true;
                }
                //aqui termina 150 a 200

                //aqui empieza 200 a 250
                if(vocabDbChecker.goverment){
                    goverment=true;
                }
                if(vocabDbChecker.run){
                    run=true;
                }
                if(vocabDbChecker.small){
                    small=true;
                }
                if(vocabDbChecker.number){
                    number=true;
                }
                if(vocabDbChecker.off){
                    off=true;
                }
                if(vocabDbChecker.always){
                    always=true;
                }
                if(vocabDbChecker.move){
                    move=true;
                }
                if(vocabDbChecker.like2){
                    like2=true;
                }
                if(vocabDbChecker.night){
                    night=true;
                }
                if(vocabDbChecker.live){
                    live=true;
                }
                //que vergas es mr??????????
                if(vocabDbChecker.mr){
                    mr=true;
                }
                if(vocabDbChecker.point){
                    point=true;
                }
                if(vocabDbChecker.believe){
                    believe=true;
                }
                if(vocabDbChecker.hold){
                    hold=true;
                }
                if(vocabDbChecker.today){
                    today=true;
                }
                if(vocabDbChecker.bring){
                    bring=true;
                }
                if(vocabDbChecker.happen){
                    happen=true;
                }
                if(vocabDbChecker.next){
                    next=true;
                }
                if(vocabDbChecker.without){
                    without=true;
                }
                if(vocabDbChecker.before){
                    before=true;
                }
                if(vocabDbChecker.large){
                    large=true;
                }
                if(vocabDbChecker.all2){
                    all2=true;
                }
                if(vocabDbChecker.million){
                    million=true;
                }
                if(vocabDbChecker.must){
                    must=true;
                }
                if(vocabDbChecker.home){
                    home=true;
                }
                if(vocabDbChecker.under){
                    under=true;
                }
                if(vocabDbChecker.water){
                    water=true;
                }
                if(vocabDbChecker.room){
                    room=true;
                }
                if(vocabDbChecker.write){
                    write=true;
                }
                if(vocabDbChecker.mother){
                    mother=true;
                }
                if(vocabDbChecker.area){
                    area=true;
                }
                if(vocabDbChecker.national){
                    national=true;
                }
                if(vocabDbChecker.money){
                    money=true;
                }
                if(vocabDbChecker.story){
                    story=true;
                }
                if(vocabDbChecker.young){
                    young=true;
                }
                if(vocabDbChecker.fact){
                    fact=true;
                }
                if(vocabDbChecker.month){
                    month=true;
                }
                if(vocabDbChecker.different){
                    different=true;
                }
                if(vocabDbChecker.lot){
                    lot=true;
                }
                if(vocabDbChecker.right2){
                    right2=true;
                }
                if(vocabDbChecker.study){
                    study=true;
                }
                if(vocabDbChecker.book){
                    book=true;
                }
                if(vocabDbChecker.eye){
                    eye=true;
                }
                if(vocabDbChecker.job){
                    job=true;
                }
                if(vocabDbChecker.word){
                    word=true;
                }
                if(vocabDbChecker.though){
                    though=true;
                }
                if(vocabDbChecker.business){
                    business=true;
                }
                if(vocabDbChecker.issue){
                    issue=true;
                }
                if(vocabDbChecker.kind){
                    kind=true;
                }
                //aqui termina 200 a 250

                //aqui empieza 250 a 300
                if(vocabDbChecker.four){
                    head=true;
                }
                if(vocabDbChecker.head){
                    head=true;
                }
                if(vocabDbChecker.far){
                    far=true;
                }
                if(vocabDbChecker.black){
                    black=true;
                }
                if(vocabDbChecker.long1){
                    long1=true;
                }
                if(vocabDbChecker.both2){
                    both2=true;
                }
                if(vocabDbChecker.little){
                    little=true;
                }
                if(vocabDbChecker.house){
                    house=true;
                }
                if(vocabDbChecker.yes){
                    yes=true;
                }
                if(vocabDbChecker.after2){
                    after2=true;
                }
                if(vocabDbChecker.since2){
                    since2=true;
                }
                if(vocabDbChecker.long2){
                    long2=true;
                }
                if(vocabDbChecker.provide){
                    provide=true;
                }
                if(vocabDbChecker.service){
                    service=true;
                }
                if(vocabDbChecker.around){
                    around=true;
                }
                if(vocabDbChecker.friend){
                    friend=true;
                }
                if(vocabDbChecker.important){
                    important=true;
                }
                if(vocabDbChecker.father){
                    father=true;
                }
                if(vocabDbChecker.sit){
                    sit=true;
                }
                if(vocabDbChecker.away){
                    away=true;
                }
                if(vocabDbChecker.until){
                    until=true;
                }
                if(vocabDbChecker.power){
                    power=true;
                }
                if(vocabDbChecker.hour){
                    hour=true;
                }
                if(vocabDbChecker.game){
                    game=true;
                }
                if(vocabDbChecker.often){
                    often=true;
                }
                if(vocabDbChecker.yet){
                    yet=true;
                }
                if(vocabDbChecker.line){
                    line=true;
                }
                if(vocabDbChecker.political){
                    political=true;
                }
                if(vocabDbChecker.end){
                    end=true;
                }
                if(vocabDbChecker.among){
                    among=true;
                }
                if(vocabDbChecker.ever){
                    ever=true;
                }
                if(vocabDbChecker.stand){
                    stand=true;
                }
                if(vocabDbChecker.bad){
                    bad=true;
                }
                if(vocabDbChecker.lose){
                    lose=true;
                }
                if(vocabDbChecker.however){
                    however=true;
                }
                if(vocabDbChecker.member){
                    member=true;
                }
                if(vocabDbChecker.pay){
                    pay=true;
                }
                if(vocabDbChecker.law){
                    law=true;
                }
                if(vocabDbChecker.meet){
                    meet=true;
                }
                if(vocabDbChecker.car){
                    car=true;
                }
                if(vocabDbChecker.city){
                    city=true;
                }
                if(vocabDbChecker.almost){
                    almost=true;
                }
                if(vocabDbChecker.include){
                    include=true;
                }
                if(vocabDbChecker.continue1){
                    continue1=true;
                }
                if(vocabDbChecker.set){
                    set=true;
                }
                if(vocabDbChecker.later){
                    later=true;
                }
                if(vocabDbChecker.community){
                    community=true;
                }
                if(vocabDbChecker.much2){
                    much2=true;
                }
                if(vocabDbChecker.name){
                    name=true;
                }
                // aqui termina 250 a 300

                //aqui empieza 300 a 350
                if(vocabDbChecker.five){
                    five=true;
                }
                if(vocabDbChecker.once){
                    once=true;
                }
                if(vocabDbChecker.white){
                    white=true;
                }
                if(vocabDbChecker.least){
                    least=true;
                }
                if(vocabDbChecker.president){
                    president=true;
                }
                if(vocabDbChecker.learn){
                    learn=true;
                }
                if(vocabDbChecker.real){
                    real=true;
                }
                if(vocabDbChecker.change2){
                    change2=true;
                }
                if(vocabDbChecker.team){
                    team=true;
                }
                if(vocabDbChecker.minute){
                    minute=true;
                }
                if(vocabDbChecker.best){
                    best=true;
                }
                if(vocabDbChecker.several){
                    several=true;
                }
                if(vocabDbChecker.idea){
                    idea=true;
                }
                if(vocabDbChecker.kid){
                    kid=true;
                }if(vocabDbChecker.body){
                    body=true;
                }if(vocabDbChecker.information){
                    information=true;
                }if(vocabDbChecker.nothing){
                    nothing=true;
                }if(vocabDbChecker.ago){
                    ago=true;
                }if(vocabDbChecker.right3){
                    right3=true;
                }if(vocabDbChecker.lead){
                    lead=true;
                }
                if(vocabDbChecker.social){
                    social=true;
                }if(vocabDbChecker.understand){
                    understand=true;
                }if(vocabDbChecker.whether){
                    whether=true;
                }if(vocabDbChecker.back2){
                    back2=true;
                }if(vocabDbChecker.watch){
                    watch=true;
                }if(vocabDbChecker.together){
                    together=true;
                }if(vocabDbChecker.follow){
                    follow=true;
                }if(vocabDbChecker.around2){
                    around=true;
                }if(vocabDbChecker.parent){
                    parent=true;
                }if(vocabDbChecker.only2){
                    only2=true;
                }if(vocabDbChecker.stop){
                    stop=true;
                }if(vocabDbChecker.face){
                    face=true;
                }if(vocabDbChecker.anything){
                    anything=true;
                }if(vocabDbChecker.create){
                    create=true;
                }if(vocabDbChecker.public2){
                    public2=true;
                }if(vocabDbChecker.already){
                    already=true;
                }if(vocabDbChecker.speak){
                    speak=true;
                }if(vocabDbChecker.others){
                    others=true;
                }if(vocabDbChecker.read){
                    read=true;
                }if(vocabDbChecker.level){
                    level=true;
                }if(vocabDbChecker.add){
                    add=true;
                }if(vocabDbChecker.office){
                    office=true;
                }if(vocabDbChecker.spend){
                    spend=true;
                }if(vocabDbChecker.door){
                    door=true;
                }if(vocabDbChecker.health){
                    health=true;
                }
                if(vocabDbChecker.person){
                    person=true;
                }if(vocabDbChecker.art){
                    art=true;
                }if(vocabDbChecker.sure){
                    sure=true;
                }if(vocabDbChecker.such2){
                    such2=true;
                }

                //aqui termina 300 a 350

                //aqui empieza 350 a 400

                if(vocabDbChecker.war){
                    war=true;
                }
                if(vocabDbChecker.history){
                    history=true;
                }if(vocabDbChecker.party){
                    party=true;
                }if(vocabDbChecker.within){
                    within=true;
                }if(vocabDbChecker.togrow){
                    togrow=true;
                }if(vocabDbChecker.result){
                    result=true;
                }if(vocabDbChecker.open){
                    open=true;
                }if(vocabDbChecker.change){
                    change=true;
                }if(vocabDbChecker.morning){
                    morning=true;
                }if(vocabDbChecker.towalk){
                    towalk=true;
                }if(vocabDbChecker.reason){
                    reason=true;
                }if(vocabDbChecker.low){
                    low=true;
                }if(vocabDbChecker.towin){
                    towin=true;
                }if(vocabDbChecker.toresearch){
                    toresearch=true;
                }if(vocabDbChecker.girl){
                    girl=true;
                }if(vocabDbChecker.guy){
                    guy=true;
                }if(vocabDbChecker.early){
                    early=true;
                }if(vocabDbChecker.food){
                    food=true;
                }if(vocabDbChecker.before2){
                    before2=true;
                }if(vocabDbChecker.moment){
                    moment=true;
                }if(vocabDbChecker.himself){
                    himself=true;
                }if(vocabDbChecker.toair){
                    toair=true;
                }if(vocabDbChecker.teacher){
                    teacher=true;
                }if(vocabDbChecker.toforce){
                    toforce=true;
                }if(vocabDbChecker.tooffer){
                    tooffer=true;
                }if(vocabDbChecker.enough){
                    enough=true;
                }if(vocabDbChecker.both){
                    both=true;
                }if(vocabDbChecker.education){
                    education=true;
                }if(vocabDbChecker.across){
                    across=true;
                }if(vocabDbChecker.although){
                    although=true;
                }if(vocabDbChecker.toremember){
                    toremember=true;
                }if(vocabDbChecker.foot){
                    foot=true;
                }if(vocabDbChecker.second){
                    second=true;
                }if(vocabDbChecker.boy){
                    boy=true;
                }if(vocabDbChecker.maybe){
                    maybe=true;
                }if(vocabDbChecker.toward){
                    toward=true;
                }if(vocabDbChecker.able){
                    able=true;
                }if(vocabDbChecker.age){
                    age=true;
                }if(vocabDbChecker.off2){
                    off2=true;
                }if(vocabDbChecker.policy){
                    policy=true;
                }if(vocabDbChecker.everything){
                    everything=true;
                }if(vocabDbChecker.love){
                    love=true;
                }if(vocabDbChecker.toprocess){
                    toprocess=true;
                }if(vocabDbChecker.music){
                    music=true;
                }if(vocabDbChecker.including){
                    including=true;
                }if(vocabDbChecker.toconsider){
                    toconsider=true;
                }if(vocabDbChecker.toappear){
                    toappear=true;
                }if(vocabDbChecker.actually){
                    actually=true;
                }if(vocabDbChecker.tobuy){
                    tobuy=true;
                }if(vocabDbChecker.probably){
                    probably=true;
                }
                //termina350 a 400

                //empieza 400 a 450
                if(vocabDbChecker.human){
                    human=true;
                }if(vocabDbChecker.towait){
                    towait=true;
                }if(vocabDbChecker.toserve){
                    toserve=true;
                }if(vocabDbChecker.market){
                    market=true;
                }if(vocabDbChecker.todie){
                    todie=true;
                }if(vocabDbChecker.tosend){
                    tosend=true;
                }if(vocabDbChecker.toexpect){
                    toexpect=true;
                }if(vocabDbChecker.home2){
                    home2=true;
                }if(vocabDbChecker.sense){
                    sense=true;
                }if(vocabDbChecker.tobuild){
                    tobuild=true;
                }if(vocabDbChecker.tostay){
                    tostay=true;
                }if(vocabDbChecker.tofall){
                    tofall=true;
                }if(vocabDbChecker.oh){
                    oh=true;
                }if(vocabDbChecker.nation){
                    nation=true;
                }if(vocabDbChecker.toplan){
                    toplan=true;
                }if(vocabDbChecker.cut){
                    cut=true;
                }if(vocabDbChecker.college){
                    interest=true;
                }if(vocabDbChecker.death){
                    death=true;
                }if(vocabDbChecker.course){
                    course=true;
                }if(vocabDbChecker.someone){
                    someone=true;
                }if(vocabDbChecker.experience){
                    experience=true;
                }if(vocabDbChecker.behind){
                    behind=true;
                }if(vocabDbChecker.reach){
                    reach=true;
                }if(vocabDbChecker.local){
                    local=true;
                }if(vocabDbChecker.tokill){
                    tokill=true;
                }if(vocabDbChecker.remain){
                    remain=true;
                }if(vocabDbChecker.effect){
                    effect=true;
                }if(vocabDbChecker.use2){
                    use2=true;
                }if(vocabDbChecker.yeah){
                    yeah=true;
                }if(vocabDbChecker.tosuggest){
                    tosuggest=true;
                }if(vocabDbChecker.class2){
                    class2=true;
                }if(vocabDbChecker.control){
                    control=true;
                }if(vocabDbChecker.toraise){
                    toraise=true;
                }if(vocabDbChecker.care){
                    care=true;
                }if(vocabDbChecker.perhaps){
                    little2=true;
                }if(vocabDbChecker.late){
                    late=true;
                }if(vocabDbChecker.hard){
                    hard=true;
                }if(vocabDbChecker.field){
                    field=true;
                }if(vocabDbChecker.else2){
                    else2=true;
                }if(vocabDbChecker.topass){
                    topass=true;
                }if(vocabDbChecker.former){
                    former=true;
                }if(vocabDbChecker.sell){
                    sell=true;
                }if(vocabDbChecker.major){
                    major=true;
                }if(vocabDbChecker.sometimes){
                    sometimes=true;
                }if(vocabDbChecker.require){
                    require=true;
                }if(vocabDbChecker.along){
                    along=true;
                }if(vocabDbChecker.development){
                    development=true;
                }if(vocabDbChecker.themselves){
                    themselves=true;
                }
                //400 a 450 termina

                //450 a 500 empieza
                if(vocabDbChecker.report){
                    report=true;
                }
                if(vocabDbChecker.role){
                    role=true;
                }
                if(vocabDbChecker.better){
                    better=true;
                }if(vocabDbChecker.economic){
                    economic=true;
                }if(vocabDbChecker.effort){
                    effect=true;
                }if(vocabDbChecker.up2){
                    up2=true;
                }if(vocabDbChecker.todecide){
                    todecide=true;
                }if(vocabDbChecker.rate){
                    rate=true;
                }if(vocabDbChecker.strong){
                    strong=true;
                }if(vocabDbChecker.possible){
                    possible=true;
                }if(vocabDbChecker.heart){
                    heart=true;
                }if(vocabDbChecker.drug){
                    drug=true;
                }if(vocabDbChecker.toshow){
                    toshow=true;
                }if(vocabDbChecker.leader){
                    leader=true;
                }if(vocabDbChecker.light){
                    light=true;
                }if(vocabDbChecker.voice){
                    voice=true;
                }if(vocabDbChecker.wife){
                    wife=true;
                }if(vocabDbChecker.whole){
                    whole=true;
                }if(vocabDbChecker.police){
                    police=true;
                }if(vocabDbChecker.mind){
                    mind=true;
                }if(vocabDbChecker.finally2){
                    finally2=true;
                }if(vocabDbChecker.topull){
                    topull=true;
                }if(vocabDbChecker.toreturn){
                    toreturn=true;
                }if(vocabDbChecker.free){
                    free=true;
                }if(vocabDbChecker.military){
                    military=true;
                }if(vocabDbChecker.price){
                    price=true;
                }if(vocabDbChecker.report2){
                    report2=true;
                }if(vocabDbChecker.less){
                    less=true;
                }if(vocabDbChecker.accordingto){
                    accordingto=true;
                }if(vocabDbChecker.decision){
                    decision=true;
                }if(vocabDbChecker.toexplain){
                    toexplain=true;
                }if(vocabDbChecker.son){
                    son=true;
                }if(vocabDbChecker.hope){
                    hope=true;
                }if(vocabDbChecker.even2){
                    even2=true;
                }if(vocabDbChecker.todevelop){
                    todevelop=true;
                }if(vocabDbChecker.view){
                    view=true;
                }if(vocabDbChecker.relationship){
                    relationship=true;
                }if(vocabDbChecker.carry){
                    carry=true;
                }if(vocabDbChecker.town){
                    town=true;
                }if(vocabDbChecker.road){
                    road=true;
                }if(vocabDbChecker.todrive){
                    todrive=true;
                }if(vocabDbChecker.arm){
                    arm=true;
                }if(vocabDbChecker.true2){
                    true2=true;
                }if(vocabDbChecker.federal){
                    federal=true;
                }if(vocabDbChecker.tobreak){
                    tobreak=true;
                }if(vocabDbChecker.better2){
                    better2=true;
                }if(vocabDbChecker.difference){
                    difference=true;
                }if(vocabDbChecker.tothank){
                    tothank=true;
                }if(vocabDbChecker.toreceive){
                    toreceive=true;
                }if(vocabDbChecker.value){
                    value=true;
                }
                SendResultOfTestToVocabDB();


            }
        });

    }

    private void SendResultOfTestToVocabDB() {
        CollectionReference uid= db.collection(userid);
        Map<String, Object> user = new HashMap<>();

        user.put("the",the);
        user.put("tobe",tobe);
        user.put("and",and);
        user.put("of",of);
        user.put("a",a);
        user.put("in",in);
        user.put("to",to);
        user.put("tohave",tohave);
        user.put("it",it);
        user.put("I",I);
        user.put("that1",that1);
        user.put("that2",that2);
        user.put("for1",for1);
        user.put("for2",for2);
        user.put("you",you);
        user.put("he",he);
        user.put("with",with);
        user.put("on",on);
        user.put("todo",todo);
        user.put("tosay",tosay);
        user.put("this1",this1);
        user.put("they",they);
        user.put("at",at);
        user.put("but1",but1);
        user.put("we",we);
        user.put("his",his);
        user.put("from1",from1);
        user.put("from2",from2);
        user.put("since",since);
        user.put("by",by);
        user.put("she",she);
        user.put("or",or);
        user.put("as1",as1);
        user.put("as2",as2);
        user.put("what1",what1);
        user.put("what2",what2);
        user.put("togo",togo);
        user.put("their",their);
        user.put("can",can);
        user.put("who",who);
        user.put("toget",toget);
        user.put("if1",if1);
        user.put("would",would);
        user.put("her",her);
        user.put("all",all);
        user.put("my",my);
        user.put("tomake",tomake);
        user.put("about1",about1);
        user.put("about2",about2);
        user.put("toknow",toknow);
        user.put("will",will);
        user.put("up",up);
        user.put("passed0to50",passed0to50);
        //aqui termina 0 a 50

        //50 a 100
        user.put("one",one);
        user.put("time",time);
        user.put("there",there);
        user.put("year",year);
        user.put("so",so);
        user.put("think",think);
        user.put("when",when);
        user.put("which",which);
        user.put("them",them);
        user.put("some",some);
        user.put("me",me);
        user.put("people",people);
        user.put("take",take);
        user.put("out",out);
        user.put("into",into);
        user.put("just",just);
        user.put("see1",see1);
        user.put("him",him);
        user.put("your",your);
        user.put("come",come);
        user.put("could",could);
        user.put("now",now);
        user.put("than",than);
        user.put("like",like);
        user.put("other",other);
        user.put("how",how);
        user.put("then",then);
        user.put("its",its);
        user.put("our",our);
        user.put("two",two);
        user.put("more",more);
        user.put("these",these);
        user.put("want",want);
        user.put("way",way);
        user.put("look",look);
        user.put("first",first);
        user.put("also",also);
        user.put("new1",new1);
        user.put("because",because);
        user.put("day",day);
        user.put("use",use);
        user.put("man",man);
        user.put("find",find);
        user.put("here",here);
        user.put("thing",thing);
        user.put("give",give);
        user.put("many",many);
        user.put("passed50to100",passed50to100);

        //aqui termina 50 a 100

        user.put("only",only);
        user.put("those",those);
        user.put("tell",tell);
        user.put("one2",one2);
        user.put("very",very);
        user.put("her1",her1);
        user.put("even",even);
        user.put("back",back);
        user.put("any",any);
        user.put("good",good);
        user.put("woman",woman);
        user.put("through",through);
        user.put("us",us);
        user.put("life",life);
        user.put("child",child);
        user.put("there1",there1);
        user.put("work",work);
        user.put("down",down);
        user.put("may",may);
        user.put("after",after);
        user.put("should",should);
        user.put("call",call);
        user.put("world",world);
        user.put("school",school);
        user.put("still",still);
        user.put("try1",try1);
        user.put("as",as);
        user.put("last",last);
        user.put("ask",ask);
        user.put("need",need);
        user.put("too",too);
        user.put("feel",feel);
        user.put("three",three);
        user.put("state",state);
        user.put("never",never);
        user.put("become",become);
        user.put("between",between);
        user.put("high",high);
        user.put("really",really);
        user.put("something",something);
        user.put("most",most);
        user.put("another",another);
        user.put("much",much);
        user.put("family",family);
        user.put("own",own);
        user.put("leave",leave);
        user.put("put",put);
        user.put("passed100to150",passed100to150);
        //aqui termina 100 a 150

        user.put("old",old);
        user.put("while1",while1);
        user.put("mean",mean);
        user.put("on2",on2);
        user.put("keep",keep);
        user.put("student",student);
        user.put("why",why);
        user.put("let",let);
        user.put("great",great);
        user.put("same",same);
        user.put("big",big);
        user.put("group",group);
        user.put("begin",begin);
        user.put("seem",seem);
        user.put("country",country);
        user.put("help",help);
        user.put("talk",talk);
        user.put("where",where);
        user.put("turn",turn);
        user.put("problem",problem);
        user.put("every",every);
        user.put("start",start);
        user.put("hand",hand);
        user.put("might",might);
        user.put("american",american);
        user.put("show",show);
        user.put("part",part);
        user.put("about",about);
        user.put("against",against);
        user.put("place",place);
        user.put("over2",over2);
        user.put("such",such);
        user.put("again",again);
        user.put("few",few);
        user.put("case1",case1);
        user.put("week",week);
        user.put("company",company);
        user.put("system",system);
        user.put("each",each);
        user.put("right",right);
        user.put("program",program);
        user.put("hear",hear);
        user.put("question",question);
        user.put("during",during);
        user.put("work2",work2);
        user.put("play",play);
        user.put("passed150to200",passed150to200);
        //aqui termina 150 a 200

        user.put("goverment",goverment);
        user.put("run",run);
        user.put("small",small);
        user.put("number",number);
        user.put("off",off);
        user.put("always",always);
        user.put("move",move);
        user.put("like2",like2);
        user.put("night",night);
        user.put("live",live);
        user.put("mr",mr);
        user.put("point",point);
        user.put("believe",believe);
        user.put("hold",hold);
        user.put("today",today);
        user.put("bring",bring);
        user.put("happen",happen);
        user.put("next",next);
        user.put("without",without);
        user.put("before",before);
        user.put("large",large);
        user.put("all2",all2);
        user.put("million",million);
        user.put("must",must);
        user.put("home",home);
        user.put("under",under);
        user.put("water",water);
        user.put("room",room);
        user.put("write",write);
        user.put("mother",mother);
        user.put("area",area);
        user.put("national",national);
        user.put("money",money);
        user.put("story",story);
        user.put("young",young);
        user.put("fact",fact);
        user.put("month",month);
        user.put("different",different);
        user.put("lot",lot);
        user.put("right2",right2);
        user.put("study",study);
        user.put("book",book);
        user.put("eye",eye);
        user.put("job",job);
        user.put("word",word);
        user.put("though",though);
        user.put("business",business);
        user.put("issue",issue);
        user.put("side",side);
        user.put("kind",kind);
        user.put("passed200to250", passed200to250);
        //aqui termina 200 a 250

        user.put("four",four);
        user.put("head",head);
        user.put("far",far);
        user.put("black",black);
        user.put("long1",long1);
        user.put("both2",both2);
        user.put("little",little);
        user.put("house",house);
        user.put("yes",yes);
        user.put("after2",after2);
        user.put("since2",since2);
        user.put("long2",long2);
        user.put("provide",provide);
        user.put("service",service);
        user.put("around",around);
        user.put("friend",friend);
        user.put("important",important);
        user.put("father",father);
        user.put("sit",sit);
        user.put("away",away);
        user.put("until",until);
        user.put("power",power);
        user.put("hour",hour);
        user.put("game",game);
        user.put("often",often);
        user.put("yet",yet);
        user.put("line",line);
        user.put("political",political);
        user.put("end",end);
        user.put("among",among);
        user.put("ever",ever);
        user.put("stand",stand);
        user.put("bad",bad);
        user.put("lose",lose);
        user.put("however",however);
        user.put("member",member);
        user.put("pay",pay);
        user.put("law",law);
        user.put("meet",meet);
        user.put("car",car);
        user.put("city",city);
        user.put("almost",almost);
        user.put("include",include);
        user.put("continue1",continue1);
        user.put("set",set);
        user.put("later",later);
        user.put("community",community);
        user.put("much2",much2);
        user.put("name",name);
        user.put("passed250to300",passed250to300);
        //aqui termina 250 a 300

        user.put("five",five);
        user.put("once",once);
        user.put("white",white);
        user.put("least",least);
        user.put("president",president);
        user.put("learn",learn);
        user.put("real",real);
        user.put("change2",change2);
        user.put("team",team);
        user.put("minute",minute);
        user.put("best",best);
        user.put("several",several);
        user.put("idea",idea);
        user.put("kid",kid);
        user.put("body",body);
        user.put("information",information);
        user.put("nothing",nothing);
        user.put("ago",ago);
        user.put("right3",right3);
        user.put("lead",lead);
        user.put("social",social);
        user.put("understand",understand);
        user.put("whether",whether);
        user.put("back2",back2);
        user.put("watch",watch);
        user.put("together",together);
        user.put("follow",follow);
        user.put("around2",around2);
        user.put("parent",parent);
        user.put("only2",only2);
        user.put("stop",stop);
        user.put("face",face);
        user.put("anything",anything);
        user.put("create",create);
        user.put("public2",public2);
        user.put("already",already);
        user.put("speak",speak);
        user.put("others",others);
        user.put("read",read);
        user.put("level",level);
        user.put("allow",allow);
        user.put("add",add);
        user.put("office",office);
        user.put("spend",spend);
        user.put("door",door);
        user.put("health",health);
        user.put("person",person);
        user.put("art",art);
        user.put("sure",sure);
        user.put("such2",such2);
        user.put("passed300to350",passed300to350);
        //aqui termina 300 a 350

        user.put("war",war);
        user.put("history",history);
        user.put("party",party);
        user.put("within",within);
        user.put("togrow",togrow);
        user.put("result",result);
        user.put("open",open);
        user.put("change",change);
        user.put("morning",morning);
        user.put("towalk",towalk);
        user.put("reason",reason);
        user.put("low",low);
        user.put("towin",towin);
        user.put("toresearch",toresearch);
        user.put("girl",girl);
        user.put("guy",guy);
        user.put("early",early);
        user.put("food",food);
        user.put("before2",before2);
        user.put("moment",moment);
        user.put("himself",himself);
        user.put("toair",toair);
        user.put("teacher",teacher);
        user.put("toforce",toforce);
        user.put("tooffer",tooffer);
        user.put("enough",enough);
        user.put("both",both);
        user.put("education",education);
        user.put("across",across);
        user.put("although",although);
        user.put("toremember",toremember);
        user.put("foot",foot);
        user.put("second",second);
        user.put("boy",boy);
        user.put("maybe",maybe);
        user.put("toward",toward);
        user.put("able",able);
        user.put("age",age);
        user.put("off2",off2);
        user.put("policy",policy);
        user.put("everything",everything);
        user.put("love",love);
        user.put("toprocess",toprocess);
        user.put("music",music);
        user.put("including",including);
        user.put("toconsider",toconsider);
        user.put("toappear",toappear);
        user.put("actually",actually);
        user.put("tobuy",tobuy);
        user.put("probably",probably);
        user.put("passed350to400",passed350to400);
        //aqui termina 350 a 400

        user.put("human",human);
        user.put("towait",towait);
        user.put("toserve",toserve);
        user.put("market",market);
        user.put("todie",todie);
        user.put("tosend",tosend);
        user.put("toexpect",toexpect);
        user.put("home2",home2);
        user.put("sense",sense);
        user.put("tobuild",tobuild);
        user.put("tostay",tostay);
        user.put("tofall",tofall);
        user.put("oh",oh);
        user.put("nation",nation);
        user.put("toplan",toplan);
        user.put("cut",cut);
        user.put("college",college);
        user.put("interest",interest);
        user.put("death",death);
        user.put("course",course);
        user.put("someone",someone);
        user.put("experience",experience);
        user.put("behind",behind);
        user.put("reach",reach);
        user.put("local",local);
        user.put("tokill",tokill);
        user.put("six",six);
        user.put("remain",remain);
        user.put("effect",effect);
        user.put("use2",use2);
        user.put("yeah",yeah);
        user.put("tosuggest",tosuggest);
        user.put("class2",class2);
        user.put("control",control);
        user.put("toraise",toraise);
        user.put("care",care);
        user.put("perhaps",perhaps);
        user.put("little2",little2);
        user.put("late",late);
        user.put("hard",hard);
        user.put("field",field);
        user.put("else2",else2);
        user.put("topass",topass);
        user.put("former",former);
        user.put("sell",sell);
        user.put("major",major);
        user.put("sometimes",sometimes);
        user.put("require",require);
        user.put("along",along);
        user.put("development",development);
        user.put("themselves",themselves);
        user.put("passed400to450",passed400to450);
        //aqui termina 400 a 450

        user.put("report",report);
        user.put("role",role);
        user.put("better",better);
        user.put("economic",economic);
        user.put("effort",effort);
        user.put("up2",up2);
        user.put("todecide",todecide);
        user.put("rate",rate);
        user.put("strong",strong);
        user.put("possible",possible);
        user.put("heart",heart);
        user.put("drug",drug);
        user.put("toshow",toshow);
        user.put("leader",leader);
        user.put("light",light);
        user.put("voice",voice);
        user.put("wife",wife);
        user.put("whole",whole);
        user.put("police",police);
        user.put("mind",mind);
        user.put("finally2",finally2);
        user.put("topull",topull);
        user.put("toreturn",toreturn);
        user.put("free",free);
        user.put("military",military);
        user.put("price",price);
        user.put("report2",report2);
        user.put("less",less);
        user.put("accordingto",accordingto);
        user.put("decision",decision);
        user.put("toexplain",toexplain);
        user.put("son",son);
        user.put("hope",hope);
        user.put("even2",even2);
        user.put("todevelop",todevelop);
        user.put("view",view);
        user.put("relationship",relationship);
        user.put("carry",carry);
        user.put("town",town);
        user.put("road",road);
        user.put("todrive",todrive);
        user.put("arm",arm);
        user.put("true2",true2);
        user.put("federal",federal);
        user.put("tobreak",tobreak);
        user.put("better2",better2);
        user.put("difference",difference);
        user.put("tothank",tothank);
        user.put("toreceive",toreceive);
        user.put("value",value);
        user.put("passed450to500",passed450to500);
        //aqui termina 450 a 500

        uid.document("vocabulary").set(user);
    }

    private void ApproveRangeOfVocab() {
        ContadorDeVocabulario++;
        if(ContadorDeVocabulario>29){
            switch (selectionStructure){
                case "0 to 50":
                    passed0to50=true;
                    break;
                case "50 to 100":
                    passed50to100=true;
                    break;
                case "100 to 150":
                    passed100to150=true;
                    break;
                case "150 to 200":
                    passed150to200=true;
                    break;
                case "200 to 250":
                    passed200to250=true;
                    break;
                case "250 to 300":
                    passed250to300=true;
                    break;
                case "300 to 350":
                    passed300to350=true;
                    break;
                case "350 to 400":
                    passed350to400=true;
                    break;
                case "400 to 450":
                    passed400to450=true;
                    break;
                case "450 to 500":
                    passed450to500=true;
                    break;
            }}
    }
    private void CheckStructureDbIfAlreadyApproved() {
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        docrefStructure.get().
                addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        studentObject = documentSnapshot.toObject(Student.class);
                        assert studentObject != null;



                        if(studentObject.presentesimple){
                            ps=true;
                        }
                        if(studentObject.presenteContinuo){
                            pc=true;
                        }
                        if(studentObject.presentePerfecto){
                            pp=true;
                        }
                        if(studentObject.presentePerfectoContinuo){
                            ppc=true;
                        }
                        //pasados
                        if(studentObject.pastsimple){
                            pss=true;
                        }
                        if(studentObject.pastContinuo){
                            psc=true;
                        }
                        if(studentObject.pastPerfecto){
                            psp=true;
                        }
                        if(studentObject.pastPerfectoContinuo){
                            pspc=true;
                        }
                        //futuros
                        if(studentObject.futuresimple){
                            fs=true;
                        }
                        if(studentObject.futureContinuo){
                            fc=true;
                        }
                        if(studentObject.futurePerfecto){
                            fp=true;
                        }
                        if(studentObject.futurePerfectoContinuo){
                            fpc=true;
                        }
                        // woulds
                        if(studentObject.wouldsimple){
                            ws=true;
                        }
                        if(studentObject.wouldContinuo){
                            wc=true;
                        }
                        if(studentObject.wouldPerfecto){
                            wp=true;
                        }
                        if(studentObject.wouldPerfectoContinuo){
                            wpc=true;
                        }
                        // coulds
                        if(studentObject.couldsimple){
                            cos=true;
                        }
                        if(studentObject.couldContinuo){
                            coc=true;
                        }
                        if(studentObject.couldPerfecto){
                            cop=true;
                        }
                        if(studentObject.couldPerfectoContinuo){
                            copc=true;
                        }
                        // might
                        if(studentObject.mightsimple){
                            ms=true;
                        }
                        if(studentObject.mightContinuo){
                            mc=true;
                        }
                        if(studentObject.mightPerfecto){
                            mp=true;
                        }
                        if(studentObject.mightPerfectoContinuo){
                            mpc=true;
                        }
                        //can
                        if(studentObject.cansimple){
                            cs=true;
                        }
                        if(studentObject.canContinuo){
                            cc=true;
                        }
                        //must
                        if(studentObject.mustsimple){
                            mus=true;
                        }
                        if(studentObject.mustContinuo){
                            muc=true;
                        }
                        //shoulds
                        if(studentObject.shouldsimple){
                            ss=true;
                        }
                        if(studentObject.shouldContinuo){
                            sc=true;
                        }
                        if(studentObject.shouldPerfecto){
                            sp=true;
                        }
                        if(studentObject.shouldPerfectoContinuo){
                            spc=true;
                        }
                        if(studentObject.wantTo){
                            wt=true;
                        }
                        if(studentObject.forTo){
                            ft=true;
                        }
                        if(studentObject.supposedToPresent){
                            stp=true;
                        }
                        if(studentObject.wishPastPerfect){
                            wpp=true;
                        }
                        if(studentObject.usedTo){
                            ut=true;
                        }
                        if(studentObject.beUsedTo){
                            but=true;
                        }

                        //other
                        if(studentObject.reportedSpeech){
                            reporteds=true;
                        }
                        if(studentObject.feelLikeSimple){
                            feells=true;
                        }
                        if(studentObject.verbalAdjectives){
                            verbala=true;
                        }
                        if(studentObject.relativeClause){
                            relativec=true;
                        }
                        if(studentObject.incrementoParalelo){
                            incrementop=true;
                        }






                        user.put("name", answerinput.getText().toString());
                        user.put("presentesimple", ps);
                        user.put("presentesimpletime", pssec);
                        user.put("presenteContinuo", pc);
                        user.put("presentecontinuotime", pcsec);
                        user.put("presentePerfecto", pp);
                        user.put("presenteperfectotime", ppsec);
                        user.put("presentePerfectoContinuo", ppc);
                        user.put("presenteperfectocontinuo", ppcsec);

                        //Pasados
                        user.put("pastsimple", pss);
                        user.put("pastsimpletime", psssec);
                        user.put("pastContinuo", psc);
                        user.put("pastcontinuotime", pscsec);
                        user.put("pastPerfecto", psp);
                        user.put("pastperfectotime", pspsec);
                        user.put("pastPerfectoContinuo", pspc);
                        user.put("pastperfectocontinuotime", pspcsec);

                        //Futuros
                        user.put("futuresimple", fs);
                        user.put("futuresimpletime", fssec);
                        user.put("futureContinuo", fc);
                        user.put("futurecontinuotime", fcsec);
                        user.put("futurePerfecto", fp);
                        user.put("futureperfectotime", fpsec);
                        user.put("futurePerfectoContinuo", fpc);
                        user.put("futureperfectocontinuotime", fpcsec);

                        //Would
                        user.put("wouldsimple", ws);
                        user.put("wouldsimpletime", wssec);
                        user.put("wouldContinuo", wc);
                        user.put("wouldcontinuotime", wcsec);
                        user.put("wouldPerfecto", wp);
                        user.put("wouldperfectotime", wpsec);
                        user.put("wouldPerfectoContinuo", wpc);
                        user.put("wouldperfectocontinuotime", wpcsec);

                        //Could
                        user.put("couldsimple", cos);
                        user.put("couldsimpletime", cossec);
                        user.put("couldContinuo", coc);
                        user.put("couldcontinuotime", cocsec);
                        user.put("couldPerfecto", cop);
                        user.put("couldperfectotime", copsec);
                        user.put("couldPerfectoContinuo", copc);
                        user.put("couldperfectocontinuotime", copcsec);

                        //Might LR
                        user.put("mightsimple", ms);
                        user.put("mightsimpletime", mssec);
                        user.put("mightContinuo", mc);
                        user.put("mightContinuotime", mcsec);
                        user.put("mightPerfecto", mp);
                        user.put("mightPerfectotime", mpsec);
                        user.put("mightPerfectoContinuo", mpc);
                        user.put("mightPerfectoContinuotime", mpcsec);

                        //Can
                        user.put("cansimple", cs);
                        user.put("cansimpletime", cssec);
                        user.put("canContinuo", cc);
                        user.put("canContinuotime", ccsec);

                        //Must
                        user.put("mustsimple", mus);
                        user.put("mustsimpletime", mussec);
                        user.put("mustContinuo", muc);
                        user.put("mustContinuotime", mucsec);

                        //Should
                        user.put("shouldsimple", ss);
                        user.put("shouldsimpletime", sssec);
                        user.put("shouldContinuo", sc);
                        user.put("shouldContinuotime", scsec);
                        user.put("shouldPerfecto", sp);
                        user.put("shouldPerfectotime", spsec);
                        user.put("shouldPerfectoContinuo", spc);
                        user.put("shouldPerfectoContinuotime", spcsec);

                        //Others
                        user.put("wantTo", wt);
                        user.put("wantTotime", wtsec);
                        user.put("forTo", ft);
                        user.put("forTotime", ftsec);
                        user.put("supposedToPresent", stp);
                        user.put("supposedToPresenttime", stpsec);
                        user.put("wishPastPerfect", wpp);
                        user.put("wishPastPerfecttime", wppsec);
                        user.put("usedTo", ut);
                        user.put("usedTotime", utsec);
                        user.put("beUsedTo", but);
                        user.put("beUsedTotime", butsec);

                        //Others LR
                        user.put("feelLikeSimple", feells);
                        user.put("feelLikeSimpletime", feellssec);
                        user.put("reportedSpeech", reporteds);
                        user.put("reportedSpeechtime", reportedssec);
                        user.put("incrementoParalelo", incrementop);
                        user.put("incrementoParalelotime", incrementopsec);
                        user.put("verbalAdjectives", verbala);
                        user.put("verbalAdjectivestime", verbalasec);
                        user.put("relativeClause", relativec);
                        user.put("relativeClausetime", relativecsec);

                        //What LR
                        user.put("whatSimple", whats);
                        user.put("whatSimpletime", whatssec);
                        user.put("whatContinuous", whatc);
                        user.put("whatContinuoustime", whatcsec);
                        user.put("whatPerfect", whatp);
                        user.put("whatPerfecttime", whatpsec);
                        user.put("whatModalsSimple", whatms);
                        user.put("whatModalsSimpletime", whatmssec);
                        user.put("whatModalsContinuous", whatmc);
                        user.put("whatModalsContinuoustime", whatmcsec);
                        user.put("whatModalsPerfect", whatmp);
                        user.put("whatModalsPerfecttime", whatmpsec);

                        //When LR
                        user.put("whenSimple", whens);
                        user.put("whenSimpletime", whenssec);
                        user.put("whenContinuous", whenc);
                        user.put("whenContinuoustime", whencsec);
                        user.put("whenPerfect", whenp);
                        user.put("whenPerfecttime", whenpsec);
                        user.put("whenModalsSimple", whenms);
                        user.put("whenModalsSimpletime", whenmssec);
                        user.put("whenModalsContinuous", whenmc);
                        user.put("whenModalsContinuoustime", whenmcsec);
                        user.put("whenModalsPerfect", whenmp);
                        user.put("whenModalsPerfecttime", whenmpsec);

                        //Where LR
                        user.put("whereSimple", wheres);
                        user.put("whereSimpletime", wheressec);
                        user.put("whereContinuous", wherec);
                        user.put("whereContinuoustime", wherecsec);
                        user.put("wherePerfect", wherep);
                        user.put("wherePerfecttime", wherepsec);
                        user.put("whereModalsSimple", wherems);
                        user.put("whereModalsSimpletime", wheremssec);
                        user.put("whereModalsContinuous", wheremc);
                        user.put("whereModalsContinuoustime", wheremcsec);
                        user.put("whereModalsPerfect", wheremp);
                        user.put("whereModalsPerfecttime", wherempsec);

                        //Why LR
                        user.put("whySimple", whys);
                        user.put("whySimpletime", whyssec);
                        user.put("whyContinuous", whyc);
                        user.put("whyContinuoustime", whycsec);
                        user.put("whyPerfect", whyp);
                        user.put("whyPerfecttime", whypsec);
                        user.put("whyModalsSimple", whyms);
                        user.put("whyModalsSimpletime", whymssec);
                        user.put("whyModalsContinuous", whymc);
                        user.put("whyModalsContinuoustime", whymcsec);
                        user.put("whyModalsPerfect", whymp);
                        user.put("whyModalsPerfecttime", whympsec);

                        //Who LR
                        user.put("whoSimple", whos);
                        user.put("whoSimpletime", whossec);
                        user.put("whoContinuous", whoc);
                        user.put("whoContinuoustime", whocsec);
                        user.put("whoPerfect", whop);
                        user.put("whoPerfecttime", whopsec);
                        user.put("whoModalsSimple", whoms);
                        user.put("whoModalsSimpletime", whomssec);
                        user.put("whoModalsContinuous", whomc);
                        user.put("whoModalsContinuoustime", whomcsec);
                        user.put("whoModalsPerfect", whomp);
                        user.put("whoModalsPerfecttime", whompsec);

                        uid.document("structures").set(user);


                    }
                });


    }

    public void Conintdbtesting(){

        String ansin = answerinput.getText().toString().trim();
        String temp = soundArrayRobot[rsa].trim();
        if (countPos>9 ){
            switch (countPos){
                case 10:
                    temp = soundArrayRobot[pos0];
                    break;
                case 11:
                    temp = soundArrayRobot[pos1];
                    break;
                case 12:
                    temp = soundArrayRobot[pos2];
                    break;
                case 13:
                    temp = soundArrayRobot[pos3];
                    break;
                case 14:
                    temp = soundArrayRobot[pos4];
                    break;
                case 15:
                    temp = soundArrayRobot[pos5];
                    break;
                case 16:
                    temp = soundArrayRobot[pos6];
                    break;
                case 17:
                    temp = soundArrayRobot[pos7];
                    break;
                case 18:
                    temp = soundArrayRobot[pos8];
                    break;
                case 19:
                    temp = soundArrayRobot[pos9];
                    break;
            }
        }
        if(ansin.equalsIgnoreCase(temp)){
            switch (countPos){
                case 0:
                    score0=2;

                    break;

                case 1:
                    score1=2;
                    break;

                case 2:
                    score2=2;

                    break;

                case 3:
                    score3=2;

                    break;

                case 4:
                    score4=2;

                    break;

                case 5:
                    score5=2;
                    break;

                case 6:
                    score6=2;
                    break;

                case 7:
                    score7=2;
                    break;

                case 8:
                    score8=2;
                    break;

                case 9:
                    score9=2;
                    break;

                case 10:
                    score10=1;
                    break;

                case 11:
                    score11=1;
                    break;

                case 12:
                    score12=1;
                    break;

                case 13:
                    score13=1;
                    break;

                case 14:
                    score14=1;
                    break;

                case 15:
                    score15=1;
                    break;

                case 16:
                    score16=1;
                    break;

                case 17:
                    score17=1;
                    break;

                case 18:
                    score18=1;
                    break;

                case 19:
                    score19=1;
                    break;
            }
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this, "incorrect/debug", Toast.LENGTH_SHORT).show();
        }
        ScoreFinal= score0+score1+score2+score3+score4+score5+score6+score7+score8+score9+score10+score11+score12+score13+score14+score15+score16+score17+score18+score19;

        Map<String, Object> user = new HashMap<>();
        CollectionReference uid= db.collection(userid);
        user.put("score",ScoreFinal);
        uid.document("Interferencia_Consciente").set(user);
        answerinput.setText("");
    }

    public void gotofragments(View view){
        Intent intento = new Intent(this, TestResults.class);
        startActivity(intento);
    }

    /*public void spintdbtesting()  {
        String ansin = answerinput.getText().toString().trim();
        if (
                t1.trim().equalsIgnoreCase(ansin.trim())||
                        t2.trim().equalsIgnoreCase(ansin.trim())||
                        t3.trim().equalsIgnoreCase(ansin.trim())||
                        t4.trim().equalsIgnoreCase(ansin.trim())||
                        t5.trim().equalsIgnoreCase(ansin.trim())||
                        t6.trim().equalsIgnoreCase(ansin.trim())||
                        engtx.trim().equalsIgnoreCase(ansin.trim()))
        {
            cp= cp+1;
            Toast.makeText(this, "interferencia is correct", Toast.LENGTH_SHORT).show();


        }
        else {
            Toast.makeText(this, "interferencia is not correct "+engtx.trim().toString(), Toast.LENGTH_SHORT).show();
            cn=cn+1;

        }
        if(cp==4){
            Toast.makeText(this, selection+" pasaste-Pasa a otra estructura"+String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp=0;
            cn=0;
            turnTrue(selection);

        }else if(cn==4){
            Toast.makeText(this, selection+"not passed Pasa a otra estructura"+String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn=0;
            cp=0;


        }
        Map<String, Object> user = new HashMap<>();
        CollectionReference uid= db.collection(userid);
        user.put("porobjeto", intxob);
        user.put("porsujeto", intxsub);
        user.put("porprep", intxprep);
        user.put("porrefl", intxref);
        user.put("porpasiva", intpasiva);

        uid.document("Interferencias").set(user);
    }*/

    /*public void soundtest(){

        save.setVisibility(View.VISIBLE);
        audiorepeat.setVisibility(View.VISIBLE);
        spanishsentence.setText("escribe lo que escuchas");
        if(countPos>19){
            // send info to database

            //notify user
            Toast.makeText(this, "Test is done", Toast.LENGTH_SHORT).show();

            // reset counter
            countPos=0 ;
        }
        if(countPos>9){
            switch (countPos){
                case 10:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos0], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;
                case 11:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos1], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;
                case 12:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos2], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;
                case 13:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos3], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;
                case 14:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos4], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;
                case 15:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos5], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;
                case 16:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos6], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;

                case 17:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos7], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;

                case 18:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos8], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;

                case 19:
                    tt1 = new TextToSpeech(getApplicationContext(),
                            new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    // Locale spanish = new Locale("es", "MX");
                                    if (i == TextToSpeech.SUCCESS) {
                                        tt1.setLanguage(Locale.ENGLISH);
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


                                        answerinput.setText("");
                                        tt1.speak(soundArrayRobot[pos9], TextToSpeech.QUEUE_ADD, null, "one");
                                    }

                                }
                            });
                    break;



            }
            //run some code
            // we want to get the pos0 and give it to soundArrayRobot[] so we can hear the machine say it ,
            // what happens when we get to 19?
            // reset count pos, send info , notify user
        }
        else {

            rsa = (int)(Math.random()*soundArray.length);
            MediaPlayer mp = new MediaPlayer();
            try {
                mp.setDataSource(soundArray[rsa]);
                mp.prepare();
                mp.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (countPos){
                case 0:
                    pos0=rsa;
                    break;
                case 1:
                    pos1=rsa;
                    break;
                case 2:
                    pos2=rsa;
                    break;

                case 3:
                    pos3=rsa;
                    break;

                case 4:
                    pos4=rsa;
                    break;

                case 5:
                    pos5=rsa;
                    break;

                case 6:
                    pos6 = rsa;
                    break;

                case 7:
                    pos7=rsa;
                    break;

                case 8:
                    pos8=rsa;
                    break;

                case 9:
                    pos9=rsa;
                    break;
            }
        }

        countPos++;


    }*/


    public static final int REC_CODE_SPEECH_INPUT = 100;
    //p-present,pa-past,mi=might,m-must, vj=verbos juntos

    //1
    boolean ps,pc,pp,ppc,pss,psc,psp,pspc,fs,fc,fp,fpc,ws,wc,wp,wpc;
    boolean cos,coc,cop,copc,ms,mc,mp,mpc,cs,cc,mus,muc;
    boolean ss,sc,sp,spc,wt,ft,stp,wpp,ut,but;

    //LR
    boolean feells, reporteds, incrementop, verbala, relativec;
    boolean whats, whatc, whatp, whatms, whatmc, whatmp;
    boolean whens, whenc, whenp, whenms, whenmc, whenmp;
    boolean wheres, wherec, wherep, wherems, wheremc, wheremp;
    boolean whys, whyc, whyp, whyms, whymc, whymp;
    boolean whos, whoc, whop, whoms, whomc, whomp;

    //1 crear string time

    //PD
    String pssec ,pcsec ,ppsec ,ppcsec ,psssec ,pscsec ,
            pspsec ,pspcsec ,fssec ,fcsec ,fpsec ,fpcsec ,
            wssec ,wcsec ,wpsec ,wpcsec , cossec ,cocsec ,copsec ,
            copcsec;

    //LR
    String mssec ,mcsec ,mpsec ,mpcsec ,cssec ,ccsec ,mussec ,mucsec,
            sssec ,scsec ,spsec ,spcsec ,wtsec ,ftsec ,stpsec ,wppsec ,
            utsec ,butsec;
    String feellssec, reportedssec, incrementopsec, verbalasec, relativecsec;
    String whatssec, whatcsec, whatpsec, whatmssec, whatmcsec, whatmpsec;
    String whenssec, whencsec, whenpsec, whenmssec, whenmcsec, whenmpsec;
    String wheressec, wherecsec, wherepsec, wheremssec, wheremcsec, wherempsec;
    String whyssec, whycsec, whypsec, whymssec, whymcsec, whympsec;
    String whossec, whocsec, whopsec, whomssec, whomcsec, whompsec;

    // booleanos de los primeros 50 palabras
    boolean the,tobe,and,of,a,in,to,tohave,it,I,
            that1,that2,for1,for2,you,he,with,on,todo,tosay,
            this1,they,at,but1,we,his,from1,from2,since,by,she,
            or,as1,as2,what1,what2,togo,their,can,who,toget,if1,
            would,her,all,my,tomake,about1,about2,toknow,will,up;

    //50 a 100 booleanos
    boolean one,time,there,year,so,think,when,which,
            them,some,me,people,take,out,into,just,
            see1,him,your,come,could,now,than,like,other,
            how,then,its,our,two,more,these,want,way,look,
            first,also,new1,because,day,more1,use,no,man,
            find,here,thing,give,many,well;

    //100 a 150 booleanos
    boolean only ,those ,tell ,one2 ,very ,her1 ,even ,
            back ,any ,good ,woman ,through ,us ,life ,child ,
            there1 ,work ,down ,may ,after ,should ,call ,world ,
            over ,school ,still ,try1 ,in1 ,as ,last ,ask ,need ,
            too ,feel ,three ,when1 ,state ,never ,become ,between ,
            high ,really ,something ,most ,another ,much ,
            another1 ,much1 ,family ,own ,out1 ,leave ,put;

    //150 a 200 booleanos
    boolean old ,while1 ,mean ,on2 ,keep ,student ,why ,
            let ,great ,same ,big ,group ,begin ,seem ,
            country ,help ,talk ,where ,turn ,problem ,
            every ,start ,hand ,might ,american ,show ,
            part ,about ,against ,place ,over2 ,such ,
            again ,few ,case1 ,most2 ,week ,company ,
            where2 ,system ,each ,right ,program ,hear ,
            so2 ,question ,during ,work2 ,play ;

    //200 a 250 booleanos
    boolean goverment ,run ,small ,number ,off ,always ,move ,
            like2 ,night ,live ,mr ,point ,believe ,hold ,today ,bring ,
            happen ,next ,without ,before ,large ,all2 ,million ,must ,
            home ,under ,water ,room ,write ,mother ,area ,national ,
            money ,story ,young ,fact ,month ,different ,lot ,right2 ,
            study ,book ,eye ,job ,word ,though ,business ,issue ,
            side ,kind ;

    //250 a 300 booleanos
    boolean four ,head ,far ,black ,long1 ,both2 ,little ,house ,yes ,
            after2 ,since2 ,long2 ,provide ,service ,around ,friend ,
            important ,father ,sit ,away ,until ,power ,hour ,
            game ,often ,yet ,line ,political ,end ,among ,ever ,stand ,
            bad ,lose ,however ,member ,pay ,law ,meet ,car ,city ,
            almost ,include ,continue1 ,set ,later ,community,much2,
            name;

    //300 a 350 booleanos
    boolean  five ,once ,white ,least ,president ,learn ,
            real ,change2 ,team ,minute ,best ,several ,
            idea ,kid ,body ,information ,nothing ,ago ,
            right3 ,lead ,social ,understand ,whether ,
            back2 ,watch ,together ,follow ,around2 ,parent ,
            only2 ,stop ,face ,anything ,create ,public2 ,
            already ,speak ,others ,read ,level ,allow ,
            add ,office ,spend ,door ,health ,person ,
            art ,sure ,such2 ;

    //350 a 400 booleanos
    boolean war ,history ,party ,within ,togrow ,result ,open ,change ,
            morning ,towalk ,reason ,low ,towin ,toresearch ,girl ,guy ,early ,
            food ,before2 ,moment ,himself ,toair , teacher ,toforce ,tooffer ,
            enough ,both ,education ,across ,although ,toremember ,foot ,second ,
            boy ,maybe ,toward , able ,age ,off2  ,policy ,everything ,love ,
            toprocess ,music ,including ,toconsider ,toappear ,actually ,
            tobuy , probably  ;

    //400 a 450 booleanos
    boolean human ,towait ,toserve ,market ,todie ,tosend ,toexpect ,home2 ,sense ,
            tobuild ,tostay ,tofall ,oh ,nation ,toplan ,cut ,college ,interest ,
            death ,course ,someone ,experience ,behind ,reach ,local ,
            tokill ,six ,remain , effect ,use2 ,yeah ,tosuggest ,class2 ,
            control ,toraise ,care ,perhaps ,little2 ,late ,hard ,field ,
            else2 ,topass , former ,sell ,major ,sometimes ,require ,along ,
            development ,themselves ;

    //450 a 500 booleanos
    boolean report ,role ,better ,economic ,effort ,up2 ,todecide ,rate , strong ,
            possible ,heart ,drug ,toshow ,leader ,light ,voice , wife ,whole ,police ,
            mind ,finally2 ,topull ,toreturn ,free ,military ,price ,report2 ,
            less ,accordingto,decision ,toexplain , son ,hope ,even2 ,todevelop ,
            view ,relationship ,carry ,town , road ,todrive ,arm ,true2 ,federal ,
            tobreak ,better2 ,difference , tothank  ,toreceive ,value ;
    boolean passed0to50,passed50to100,passed100to150,passed150to200, passed200to250,passed250to300
            ,passed300to350,passed350to400,passed400to450,passed450to500;

    //PD
    String soundArray[]={
            "https://adrianlealcaldera.com/Come%20rain%20or%20shine.mp3",
            "https://adrianlealcaldera.com/Come%20rain%20or%20shine%202.mp3",
            "https://adrianlealcaldera.com/Come%20rain%20or%20shine%203.mp3",
            "https://adrianlealcaldera.com/Calm%20before%20the%20storm.mp3",
            "https://adrianlealcaldera.com/Calm%20before%20the%20storm%202.mp3",
            "https://adrianlealcaldera.com/Calm%20before%20the%20storm%203.mp3",
            "https://adrianlealcaldera.com/Burn%20bridges.mp3",
            "https://adrianlealcaldera.com/Burn%20bridges%202.mp3",
            "https://adrianlealcaldera.com/Burn%20bridges%203.mp3",
            "https://adrianlealcaldera.com/Bolt%20from%20the%20blue.mp3",
            "https://adrianlealcaldera.com/Bolt%20from%20the%20blue%202.mp3",
            "https://adrianlealcaldera.com/Bolt%20from%20the%20blue%203.mp3",
            "https://adrianlealcaldera.com/As%20right%20as%20rain.mp3",
            "https://adrianlealcaldera.com/As%20right%20as%20rain%202.mp3",
            "https://adrianlealcaldera.com/As%20right%20as%20rain%203.mp3",
            "https://adrianlealcaldera.com/An%20ounce%20of%20prevention%20is%20worth%20a%20pound%20of%20cure.mp3",
            "https://adrianlealcaldera.com/An%20ounce%20of%20prevention%20is%20worth%20a%20pound%20of%20cure%202.mp3",
            "https://adrianlealcaldera.com/An%20ounce%20of%20prevention%20is%20worth%20a%20pound%20of%20cure%203.mp3",
            "https://adrianlealcaldera.com/An%20apple%20a%20day%20keeps%20the%20doctor%20away.mp3",
            "https://adrianlealcaldera.com/An%20apple%20a%20day%20keeps%20the%20doctor%20away%202.mp3",
            "https://adrianlealcaldera.com/A%20storm%20in%20a%20teacup.mp3",
            "https://adrianlealcaldera.com/A%20storm%20in%20a%20teacup%202.mp3",
            "https://adrianlealcaldera.com/A%20storm%20in%20a%20teacup%203.mp3",
            "https://adrianlealcaldera.com/A%20stitch%20in%20time%20saves%20nine.mp3",
            "https://adrianlealcaldera.com/A%20stitch%20in%20time%20saves%20nine%202.mp3",
            "https://adrianlealcaldera.com/A%20stitch%20in%20time%20saves%20nine%203.mp3",
            "https://adrianlealcaldera.com/A%20snowball's%20chance%20in%20hell.mp3",
            "https://adrianlealcaldera.com/A%20snowball's%20chance%20in%20hell%202.mp3",
            "https://adrianlealcaldera.com/A%20snowball's%20chance%20in%20hell%203.mp3",
            "https://adrianlealcaldera.com/A%20snowball%20effect.mp3",
            "https://adrianlealcaldera.com/A%20snowball%20effect%202.mp3",
            "https://adrianlealcaldera.com/A%20snowball%20effect%203.mp3",
            "https://adrianlealcaldera.com/A%20little%20learning%20is%20a%20dangerous%20thing.mp3",
            "https://adrianlealcaldera.com/A%20little%20learning%20is%20a%20dangerous%20thing%202.mp3",
            "https://adrianlealcaldera.com/Curiosity%20killed%20the%20cat.mp3",
            "https://adrianlealcaldera.com/Curiosity%20killed%20the%20cat%202.mp3",
            "https://adrianlealcaldera.com/Curiosity%20killed%20the%20cat%203.mp3",
            "https://adrianlealcaldera.com/Cut%20the%20mustard.mp3",
            "https://adrianlealcaldera.com/Cut%20the%20mustard%202.mp3",
            "https://adrianlealcaldera.com/Cut%20the%20mustard%203.mp3",
            "https://adrianlealcaldera.com/Don't%20beat%20a%20dead%20horse.mp3",
            "https://adrianlealcaldera.com/Don't%20beat%20a%20dead%20horse%202.mp3",
            "https://adrianlealcaldera.com/Don't%20beat%20a%20dead%20horse%203.mp3",
            "https://adrianlealcaldera.com/Every%20dog%20has%20his%20day.mp3",
            "https://adrianlealcaldera.com/Familiarity%20breeds%20contempt.mp3",
            "https://adrianlealcaldera.com/Familiarity%20breeds%20contempt%202.mp3",
            "https://adrianlealcaldera.com/Familiarity%20breeds%20contempt%203.mp3",
            "https://adrianlealcaldera.com/Fit%20as%20a%20fiddle.mp3",
            "https://adrianlealcaldera.com/Fit%20as%20a%20fiddle%202.mp3",
            "https://adrianlealcaldera.com/Fit%20as%20a%20fiddle%203.mp3",
            "https://adrianlealcaldera.com/Get%20a%20second%20wind.mp3",
            "https://adrianlealcaldera.com/Get%20a%20second%20wind%202.mp3",
            "https://adrianlealcaldera.com/Get%20a%20second%20wind%203.mp3",
            "https://adrianlealcaldera.com/Get%20wind%20of%20something.mp3",
            "https://adrianlealcaldera.com/Get%20wind%20of%20something%202.mp3",
            "https://adrianlealcaldera.com/Go%20down%20in%20flames.mp3",
            "https://adrianlealcaldera.com/Go%20down%20in%20flames%202.mp3",
            "https://adrianlealcaldera.com/Go%20down%20in%20flames%203.mp3",
            "https://adrianlealcaldera.com/Haste%20makes%20waste.mp3",
            "https://adrianlealcaldera.com/Haste%20makes%20waste%202.mp3",
            "https://adrianlealcaldera.com/Haste%20makes%20waste%203.mp3",
            "https://adrianlealcaldera.com/Have%20your%20head%20in%20the%20clouds.mp3",
            "https://adrianlealcaldera.com/Have%20your%20head%20in%20the%20clouds%202.mp3",
            "https://adrianlealcaldera.com/Have%20your%20head%20in%20the%20clouds%203.mp3",
            "https://adrianlealcaldera.com/Hear%20something%20straight%20from%20the%20horse's%20mouth.mp3",
            "https://adrianlealcaldera.com/Hear%20something%20straight%20from%20the%20horse's%20mouth%202.mp3",
            "https://adrianlealcaldera.com/Hear%20something%20straight%20from%20the%20horse's%20mouth%203.mp3",
            "https://adrianlealcaldera.com/He's%20off%20his%20rocker.mp3",
            "https://adrianlealcaldera.com/He's%20sitting%20on%20the%20fence.mp3",
            "https://adrianlealcaldera.com/It%20is%20always%20darkest%20before%20the%20dawn.mp3",
            "https://adrianlealcaldera.com/It%20takes%20two%20to%20tango.mp3",
            "https://adrianlealcaldera.com/It%20takes%20two%20to%20tango%202.mp3",
            "https://adrianlealcaldera.com/It%20takes%20two%20to%20tango%203.mp3",
            "https://adrianlealcaldera.com/Jump%20on%20the%20bandwagon.mp3",
            "https://adrianlealcaldera.com/Jump%20on%20the%20bandwagon%202.mp3",
            "https://adrianlealcaldera.com/Jump%20on%20the%20bandwagon%203.mp3",
            "https://adrianlealcaldera.com/Know%20which%20way%20the%20wind%20is%20blowing.mp3",
            "https://adrianlealcaldera.com/Leave%20no%20stone%20unturned.mp3",
            "https://adrianlealcaldera.com/Leave%20no%20stone%20unturned%202.mp3",
            "https://adrianlealcaldera.com/Leave%20no%20stone%20unturned%203.mp3",
            "https://adrianlealcaldera.com/Let%20sleeping%20dogs%20lie.mp3",
            "https://adrianlealcaldera.com/Let%20sleeping%20dogs%20lie%202.mp3",
            "https://adrianlealcaldera.com/Let%20sleeping%20dogs%20lie%203.mp3",
            "https://adrianlealcaldera.com/Like%20riding%20a%20bicycle.mp3",
            "https://adrianlealcaldera.com/Like%20riding%20a%20bicycle%202.mp3",
            "https://adrianlealcaldera.com/Like%20riding%20a%20bicycle%203.mp3",
            "https://adrianlealcaldera.com/Like%20two%20peas%20in%20a%20pod.mp3",
            "https://adrianlealcaldera.com/Like%20two%20peas%20in%20a%20pod%202.mp3",
            "https://adrianlealcaldera.com/Like%20two%20peas%20in%20a%20pod%203.mp3",
            "https://adrianlealcaldera.com/Make%20hay%20while%20the%20sun%20shines.mp3",
            "https://adrianlealcaldera.com/Make%20hay%20while%20the%20sun%20shines%202.mp3",
            "https://adrianlealcaldera.com/Make%20hay%20while%20the%20sun%20shines%203.mp3",
            "https://adrianlealcaldera.com/On%20cloud%20nine.mp3",
            "https://adrianlealcaldera.com/On%20cloud%20nine%202.mp3",
            "https://adrianlealcaldera.com/On%20cloud%20nine%203.mp3",
            "https://adrianlealcaldera.com/Once%20bitten%20twice%20shy.mp3",
            "https://adrianlealcaldera.com/Once%20bitten%20twice%20shy%202.mp3",
            "https://adrianlealcaldera.com/Once%20bitten%20twice%20shy%203.mp3",
            "https://adrianlealcaldera.com/Out%20of%20the%20frying%20pan%20and%20into%20the%20fire.mp3",
            "https://adrianlealcaldera.com/Out%20of%20the%20frying%20pan%20and%20into%20the%20fire%202.mp3",
            "https://adrianlealcaldera.com/Out%20of%20the%20frying%20pan%20and%20into%20the%20fire%203.mp3",
            "https://adrianlealcaldera.com/Run%20like%20the%20wind.mp3",
            "https://adrianlealcaldera.com/Run%20like%20the%20wind%202.mp3",
            "https://adrianlealcaldera.com/Run%20like%20the%20wind%203.mp3",
            "https://adrianlealcaldera.com/Shape%20up%20or%20ship%20out.mp3",
            "https://adrianlealcaldera.com/Shape%20up%20or%20ship%20out%202.mp3",
            "https://adrianlealcaldera.com/Shape%20up%20or%20ship%20out%203.mp3",
            "https://adrianlealcaldera.com/Snowed%20under.mp3",
            "https://adrianlealcaldera.com/Snowed%20under%202.mp3",
            "https://adrianlealcaldera.com/Snowed%20under%203.mp3",
            "https://adrianlealcaldera.com/That%20ship%20has%20sailed.mp3",
            "https://adrianlealcaldera.com/That%20ship%20has%20sailed%202.mp3",
            "https://adrianlealcaldera.com/That%20ship%20has%20sailed%202.mp3",
            "https://adrianlealcaldera.com/The%20pot%20calling%20the%20kettle%20black.mp3",
            "https://adrianlealcaldera.com/The%20pot%20calling%20the%20kettle%20black%202.mp3",
            "https://adrianlealcaldera.com/The%20pot%20calling%20the%20kettle%20black%202.mp3",
            "https://adrianlealcaldera.com/There%20are%20clouds%20on%20the%20horizon.mp3",
            "https://adrianlealcaldera.com/There%20are%20clouds%20on%20the%20horizon%202.mp3",
            "https://adrianlealcaldera.com/There%20are%20clouds%20on%20the%20horizon%203.mp3",
            "https://adrianlealcaldera.com/Through%20thick%20and%20thin.mp3",
            "https://adrianlealcaldera.com/Through%20thick%20and%20thin%202.mp3",
            "https://adrianlealcaldera.com/Through%20thick%20and%20thin%203.mp3",
            "https://adrianlealcaldera.com/Time%20is%20money.mp3",
            "https://adrianlealcaldera.com/Time%20is%20money%202.mp3",
            "https://adrianlealcaldera.com/Time%20is%20money%203.mp3",
            "https://adrianlealcaldera.com/Waste%20not%20want%20not.mp3",
            "https://adrianlealcaldera.com/Waste%20not%20want%20not%202.mp3",
            "https://adrianlealcaldera.com/Waste%20not%20want%20not%203.mp3",
            "https://adrianlealcaldera.com/We%20see%20eye%20to%20eye.mp3",
            "https://adrianlealcaldera.com/We%20see%20eye%20to%20eye%202.mp3",
            "https://adrianlealcaldera.com/Weather%20the%20storm.mp3",
            "https://adrianlealcaldera.com/Weather%20the%20storm%202.mp3",
            "https://adrianlealcaldera.com/Weather%20the%20storm%203.mp3",
            "https://adrianlealcaldera.com/Well%20begun%20is%20half%20done.mp3",
            "https://adrianlealcaldera.com/Well%20begun%20is%20half%20done%202.mp3",
            "https://adrianlealcaldera.com/When%20it%20rains%20it%20pours.mp3",
            "https://adrianlealcaldera.com/When%20it%20rains%20it%20pours%202.mp3",
            "https://adrianlealcaldera.com/When%20it%20rains%20it%20pours%203.mp3",
            "https://adrianlealcaldera.com/You%20can%20catch%20more%20flies%20with%20honey%20than%20you%20can%20with%20vinegar.mp3",
            "https://adrianlealcaldera.com/You%20can%20catch%20more%20flies%20with%20honey%20than%20you%20can%20with%20vinegar%202.mp3",
            "https://adrianlealcaldera.com/You%20can%20lead%20a%20horse%20to%20water%20but%20you%20can't%20make%20him%20drink.mp3",
            "https://adrianlealcaldera.com/You%20can%20lead%20a%20horse%20to%20water%20but%20you%20can't%20make%20him%20drink%202.mp3",
            "https://adrianlealcaldera.com/You%20can%20lead%20a%20horse%20to%20water%20but%20you%20can't%20make%20him%20drink%203.mp3",
            "https://adrianlealcaldera.com/You%20can't%20make%20an%20omelet%20without%20breaking%20some%20eggs.mp3",

            //122...

            //LR
            "https://adrianlealcaldera.com/A%20penny%20for%20your%20thoughts.mp3",
            "https://adrianlealcaldera.com/A%20penny%20for%20your%20thoughts2.mp3",
            "https://adrianlealcaldera.com/A%20penny%20saved%20is%20a%20penny%20earned.mp3",
            "https://adrianlealcaldera.com/A%20penny%20saved%20is%20a%20penny%20earned2.mp3",
            "https://adrianlealcaldera.com/A%20perfect%20storm.mp3",
            "https://adrianlealcaldera.com/A%20perfect%20storm2.mp3",
            "https://adrianlealcaldera.com/A%20picture%20is%20worth%201000%20words.mp3",
            "https://adrianlealcaldera.com/Actions%20speak%20louder%20than%20words.mp3",
            "https://adrianlealcaldera.com/Actions%20speak%20louder%20than%20words2.mp3",
            "https://adrianlealcaldera.com/Add%20insult%20to%20injury.mp3",
            "https://adrianlealcaldera.com/Add%20insult%20to%20injury2.mp3",
            "https://adrianlealcaldera.com/Barking%20up%20the%20wrong%20tree.mp3",
            "https://adrianlealcaldera.com/Barking%20up%20the%20wrong%20tree2.mp3",
            "https://adrianlealcaldera.com/Birds%20of%20a%20feather%20flock%20together.mp3",
            "https://adrianlealcaldera.com/Birds%20of%20a%20feather%20flock%20together2.mp3",
            "https://adrianlealcaldera.com/Bite%20off%20more%20than%20you%20can%20chew.mp3",
            "https://adrianlealcaldera.com/Break%20the%20ice.mp3",
            "https://adrianlealcaldera.com/Break%20the%20ice2.mp3",
            "https://adrianlealcaldera.com/By%20the%20skin%20of%20your%20teeth.mp3",
            "https://adrianlealcaldera.com/By%20the%20skin%20of%20your%20teeth2.mp3",
            "https://adrianlealcaldera.com/Comparing%20apples%20to%20oranges.mp3",
            "https://adrianlealcaldera.com/Comparing%20apples%20to%20oranges2.mp3",
            "https://adrianlealcaldera.com/Costs%20an%20arm%20and%20a%20leg.mp3",
            "https://adrianlealcaldera.com/Do%20something%20at%20the%20drop%20of%20a%20hat.mp3",
            "https://adrianlealcaldera.com/Do%20unto%20others%20as%20you%20would%20have%20them%20do%20unto%20you.mp3",
            "https://adrianlealcaldera.com/Don't%20count%20your%20chickens%20before%20they%20hatch.mp3",
            "https://adrianlealcaldera.com/Don't%20cry%20over%20spilt%20milk.mp3",
            "https://adrianlealcaldera.com/Don't%20give%20up%20your%20day%20job.mp3",
            "https://adrianlealcaldera.com/Don't%20put%20all%20your%20eggs%20in%20one%20basket.mp3",
            "https://adrianlealcaldera.com/Every%20cloud%20has%20a%20silver%20lining.mp3",
            "https://adrianlealcaldera.com/Every%20cloud%20has%20a%20silver%20lining2.mp3",
            "https://adrianlealcaldera.com/Give%20someone%20the%20cold%20shoulder.mp3",
            "https://adrianlealcaldera.com/Give%20someone%20the%20cold%20shoulder2.mp3",
            "https://adrianlealcaldera.com/Go%20on%20a%20wild%20goose%20chase.mp3",
            "https://adrianlealcaldera.com/Good%20things%20come%20to%20those%20who%20wait.mp3",
            "https://adrianlealcaldera.com/Good%20things%20come%20to%20those%20who%20wait2.mp3",
            "https://adrianlealcaldera.com/Hit%20the%20nail%20on%20the%20head.mp3",
            "https://adrianlealcaldera.com/Hit%20the%20nail%20on%20the%20head2.mp3",
            "https://adrianlealcaldera.com/Ignorance%20is%20bliss.mp3",
            "https://adrianlealcaldera.com/Ignorance%20is%20bliss2.mp3",
            "https://adrianlealcaldera.com/It%20takes%20one%20to%20know%20one.mp3",
            "https://adrianlealcaldera.com/It's%20a%20piece%20of%20cake.mp3",
            "https://adrianlealcaldera.com/It's%20a%20piece%20of%20cake2.mp3",
            "https://adrianlealcaldera.com/It's%20raining%20cats%20and%20dogs.mp3",
            "https://adrianlealcaldera.com/It's%20raining%20cats%20and%20dogs2.mp3",
            "https://adrianlealcaldera.com/Kill%20two%20birds%20with%20one%20stone.mp3",
            "https://adrianlealcaldera.com/Let%20the%20cat%20out%20of%20the%20bag.mp3",
            "https://adrianlealcaldera.com/Live%20and%20learn.mp3",
            "https://adrianlealcaldera.com/Live%20and%20learn2.mp3",
            "https://adrianlealcaldera.com/Look%20before%20you%20leap.mp3",
            "https://adrianlealcaldera.com/Look%20before%20you%20leap2.mp3",
            "https://adrianlealcaldera.com/On%20thin%20ice.mp3",
            "https://adrianlealcaldera.com/On%20thin%20ice2.mp3",
            "https://adrianlealcaldera.com/Once%20in%20a%20blue%20moon.mp3",
            "https://adrianlealcaldera.com/Once%20in%20a%20blue%20moon2.mp3",
            "https://adrianlealcaldera.com/Play%20devil's%20advocate.mp3",
            "https://adrianlealcaldera.com/Play%20devil's%20advocate2.mp3",
            "https://adrianlealcaldera.com/Put%20something%20on%20ice.mp3",
            "https://adrianlealcaldera.com/Saving%20for%20a%20rainy%20day.mp3",
            "https://adrianlealcaldera.com/Saving%20for%20a%20rainy%20day2.mp3",
            "https://adrianlealcaldera.com/Slow%20and%20steady%20wins%20the%20race.mp3",
            "https://adrianlealcaldera.com/Slow%20and%20steady%20wins%20the%20race2.mp3",
            "https://adrianlealcaldera.com/Spill%20the%20beans.mp3",
            "https://adrianlealcaldera.com/Spill%20the%20beans2.mp3",
            "https://adrianlealcaldera.com/Take%20a%20rain%20check.mp3",
            "https://adrianlealcaldera.com/Take%20it%20with%20a%20grain%20of%20salt.mp3",
            "https://adrianlealcaldera.com/The%20ball%20is%20in%20your%20court.mp3",
            "https://adrianlealcaldera.com/The%20best%20thing%20since%20sliced%20bread.mp3",
            "https://adrianlealcaldera.com/The%20devil%20is%20in%20the%20details.mp3",
            "https://adrianlealcaldera.com/The%20early%20bird%20gets%20the%20worm.mp3",
            "https://adrianlealcaldera.com/The%20early%20bird%20gets%20the%20worm2.mp3",
            "https://adrianlealcaldera.com/The%20elephant%20in%20the%20room.mp3",
            "https://adrianlealcaldera.com/The%20elephant%20in%20the%20room2.mp3",
            "https://adrianlealcaldera.com/The%20whole%20nine%20yards.mp3",
            "https://adrianlealcaldera.com/The%20whole%20nine%20yards2.mp3",
            "https://adrianlealcaldera.com/There's%20no%20such%20thing%20as%20a%20free%20lunch.mp3",
    };
    String soundArrayRobot[] = {
            "Come rain or shine",
            "Come rain or shine 2",
            "Come rain or shine 3",
            "the calm before the storm",
            "the calm before the storm 2",
            "the calm before the storm 3",
            "burn bridges",
            "burn bridges 2",
            "burn bridges 3",
            "bolt from the blue",
            "bolt from the blue 2",
            "bolt from the blue 3",
            "as right as rain",
            "as right as rain 2",
            "as right as rain 3",
            "an ounce of prevention is worth a pound of cure",
            "an ounce of prevention is worth a pound of cure 2",
            "an ounce of prevention is worth a pound of cure 3",
            "an apple a day keeps the doctor away",
            "an apple a day keeps the doctor away 2",
            "a storm in a teacup",
            "a storm in a teacup 2",
            "a storm in a teacup 3",
            "a stitch in time saves nine",
            "a stitch in time saves nine 2",
            "a stitch in time saves nine 3",
            "a snowball's chance in hell",
            "a snowball's chance in hell 2",
            "a snowball's chance in hell 3",
            "a snowball effect",
            "a snowball effect 2",
            "a snowball effect 3",
            "a little learning is a dangerous thing",
            "a little learning is a dangerous thing 2",
            "Curiosity killed the cat",
            "Curiosity killed the cat 2",
            "Curiosity killed the cat 3",
            "Cut the mustard",
            "Cut the mustard 2",
            "Cut the mustard 3",
            "Don't beat a dead horse",
            "Don't beat a dead horse 2",
            "Don't beat a dead horse 3",//variantes
            "Every dog has his day",
            "Familiarity breeds contempt",
            "Familiarity breeds contempt 2",
            "Familiarity breeds contempt 3",
            "Fit as a fiddle",
            "Fit as a fiddle 2",
            "Fit as a fiddle 3",
            "Get a second wind",
            "Get a second wind 2",
            "Get a second wind 3",
            "Get wind of something",
            "Get wind of something 2",
            "Go down in flames",
            "Go down in flames 2",
            "Go down in flames 3",
            "Haste makes waste",
            "Haste makes waste 2",
            "Haste makes waste 3",
            "Have your head in the clouds",
            "Have your head in the clouds 2",
            "Have your head in the clouds 3",
            "Hear something straight from the horse's mouth",
            "Hear something straight from the horse's mouth 2",
            "Hear something straight from the horse's mouth 3",
            "He's off his rocker",
            "He's sitting on the fence",
            "It is always darkest before the dawn",
            "It takes two to tango",
            "It takes two to tango 2",
            "It takes two to tango 3",
            "Jump on the bandwagon",
            "Jump on the bandwagon 2",
            "Jump on the bandwagon 3",
            "Know which way the wind is blowing",
            "Leave no stone unturned",
            "Leave no stone unturned 2",
            "Leave no stone unturned 3",
            "Let sleeping dogs lie",
            "Let sleeping dogs lie 2",
            "Let sleeping dogs lie 3",
            "Like riding a bicycle",
            "Like riding a bicycle 2",
            "Like riding a bicycle 3",
            "Like two peas in a pod",
            "Like two peas in a pod 2",
            "Like two peas in a pod 3",
            "Make hay while the sun shines",
            "Make hay while the sun shines 2",
            "Make hay while the sun shines 3",
            "On cloud nine",
            "On cloud nine 2",
            "On cloud nine 3",
            "Once bitten twice shy",
            "Once bitten twice shy 2",
            "Once bitten twice shy 3",
            "Out of the frying pan and into the fire",
            "Out of the frying pan and into the fire 2",
            "Out of the frying pan and into the fire 3",
            "Run like the wind",
            "Run like the wind 2",
            "Run like the wind 3",
            "Shape up or ship out",
            "Shape up or ship out 2",
            "Shape up or ship out 3",
            "Snowed under",
            "Snowed under 2",
            "Snowed under 3",
            "That ship has sailed",
            "That ship has sailed 2",
            "That ship has sailed 3",
            "The pot calling the kettle black",
            "The pot calling the kettle black 2",
            "The pot calling the kettle black 3",
            "There are clouds on the horizon",
            "There are clouds on the horizon 2",
            "There are clouds on the horizon 3",
            "Through thick and thin",
            "Through thick and thin 2",
            "Through thick and thin 3",
            "Time is money",
            "Time is money 2",
            "Time is money 3",
            "Waste not want not",
            "Waste not want not 2",
            "Waste not want not 3",
            "We see eye to eye",
            "We see eye to eye 2",
            "Weather the storm",
            "Weather the storm 2",
            "Weather the storm 3",
            "Well begun is half done",
            "Well begun is half done 2",
            "When it rains it pours",
            "When it rains it pours 2",
            "When it rains it pours 3",
            "You can catch more flies with honey than you can with vinegar",
            "You can catch more flies with honey than you can with vinegar 2",
            "You can lead a horse to water but you can't make him drink",
            "You can lead a horse to water but you can't make him drink 2",
            "You can lead a horse to water but you can't make him drink 3",
            "You can't make an omelet without breaking some eggs",//corregidos

            //LR
            "A penny for your thoughts",
            "A penny for your thoughts 2",
            "A penny saved is a penny earned",
            "A penny saved is a penny earned 2",
            "A perfect storm",
            "A perfect storm 2",
            "A picture is worth 1000 words",
            "Actions speak louder than words",
            "Actions speak louder than words 2",
            "Add insult to injury",
            "Add insult to injury 2",
            "Barking up the wrong tree",
            "Barking up the wrong tree 2",
            "Birds of a feather flock together",
            "Birds of a feather flock together 2",
            "Bite off more than you can chew",
            "Break the ice",
            "Break the ice 2",
            "By the skin of your teeth",
            "By the skin of your teeth 2",
            "Comparing apples to oranges",
            "Comparing apples to oranges 2",
            "Costs an arm and a leg",
            "Do something at the drop of a hat",
            "Do unto others as you would have them do unto you",
            "Don't count your chickens before they hatch",
            "Don't cry over spilt milk",
            "Don't give up your day job",
            "Don't put all your eggs in one basket",
            "Every cloud has a silver lining",
            "Every cloud has a silver lining 2",
            "Give someone the cold shoulder",
            "Give someone the cold shoulder 2",
            "Go on a wild goose chase",
            "Good things come to those who wait",
            "Good things come to those who wait 2",
            "Hit the nail on the head",
            "Hit the nail on the head 2",
            "Ignorance is bliss",
            "Ignorance is bliss 2",
            "It takes one to know one",
            "It's a piece of cake",
            "It's a piece of cake 2",
            "It's raining cats and dogs",
            "It's raining cats and dogs2 ",
            "Kill two birds with one stone",
            "Let the cat out of the bag",
            "Live and learn",
            "Live and learn 2",
            "Look before you leap",
            "Look before you leap 2",
            "On thin ice",
            "On thin ice 2",
            "Once in a blue moon",
            "Once in a blue moon 2",
            "Play devil's advocate",
            "Play devil's advocate2 ",
            "Put something on ice",
            "Saving for a rainy day",
            "Saving for a rainy day 2",
            "Slow and steady wins the race",
            "Slow and steady wins the race 2",
            "Spill the beans",
            "Spill the beans 2",
            "Take a rain check",
            "Take it with a grain of salt",
            "The ball is in your court",
            "The best thing since sliced bread",
            "The devil is in the details",
            "The early bird gets the worm",
            "The early bird gets the worm 2",
            "The elephant in the room",
            "The elephant in the room 2",
            "The whole nine yards",
            "The whole nine yards 2",
            "There's no such thing as a free lunch",

    };
}