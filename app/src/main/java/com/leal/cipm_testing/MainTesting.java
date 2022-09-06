package com.leal.cipm_testing;

import androidx.annotation.NonNull;
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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MainTesting extends AppCompatActivity {
    FirebaseFirestore  db = FirebaseFirestore.getInstance();
    private Button     starttest;
    TextView           choose,sptx,getsent,save;
    Spinner            spin;
    ImageButton        mic;
    TextToSpeech       tt1;
    EditText           Answerinput;
    String             txteng,userid;
    FirebaseAuth       mAuth;
    GoogleSignInClient gsc;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    //p-present,pa-past,mi=might,m-must, vj=verbos juntos

    // 1. tiene que haber un booleano para cada estr
    boolean ps,pc,pp,ppc,passi;
    String selection;
    int cp,cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_testing);
        starttest=findViewById(R.id.StartTestMain);
        choose=findViewById(R.id.choosest);
        choose.setVisibility(View.GONE);
        spin = findViewById(R.id.spinnert);
        spin.setVisibility(View.GONE);
        Answerinput=findViewById(R.id.answerinputtest);
        Answerinput.setVisibility(View.GONE);
        sptx=findViewById(R.id.comodiriastestmain);
        sptx.setVisibility(View.GONE);
        mic = findViewById(R.id.btnhablartesting);
        mic.setVisibility(View.GONE);
        Answerinput=findViewById(R.id.answerinputtest);
        mic.setVisibility(View.GONE);
        getsent = findViewById(R.id.getsentence);
        getsent.setVisibility(View.GONE);
        save = findViewById(R.id.sendinfo);
        save.setVisibility(View.GONE);
        mAuth= FirebaseAuth.getInstance();

        // este es el id que identifica al usuario-aparentemente jala con los 3 diferentes tipos de auth
        userid = mAuth.getCurrentUser().getUid();
        // este culero de arriba es el user id del usuario jala con los 3 aparentemente

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.structuresGratis, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
                if(!selection.equalsIgnoreCase("Pick a Structure")) {
                    shownext();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
    public  void   start(View view){
        choose.setVisibility(View.VISIBLE);
        spin.setVisibility(View.VISIBLE);
    }
    private void   shownext() {
        mic.setVisibility(View.VISIBLE);
        sptx.setVisibility(View.VISIBLE);
        starttest.setVisibility(View.VISIBLE);
        Answerinput.setVisibility(View.VISIBLE);
        getsent.setVisibility(View.VISIBLE);


    }
    // 2. llenas start test
    public  void   startTest(View view){
        save.setVisibility(View.VISIBLE);
        switch (selection) {
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

                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            Generator gen1 = new Generator();
                            gen1.GenPresSimp2();
                            sptx.setText(gen1.gens);
                            txteng=gen1.gene;

                            Answerinput.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPresCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                   Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPresPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
        }
    }
    public  void   checkanswer(View vista) {
        String t = txteng.trim();
        String t2 = Answerinput.getText().toString().trim();
        if(t.equalsIgnoreCase(t2)){
            cp= cp+1;
            Toast.makeText(this, "inside good"+String.valueOf(cp), Toast.LENGTH_SHORT).show();

        }else {
            cn=cn+1;
            Toast.makeText(this, String.valueOf(cn)+" inside bad "+txteng, Toast.LENGTH_SHORT).show();
        }
        Answerinput.setText("");

        if(cp==4){
            Toast.makeText(this, selection+"passed /pasa a la sig est"+String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp=0;
            turnTrue(selection);

        }else if(cn==4){
            Toast.makeText(this, selection+"not passed / pasa a la sig est"+String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn=0;


        }



    }
    //3. llenas turn true
    private void   turnTrue(String CurrentStructure) {
        switch (selection){
            case "Present Simple":
                ps=true;
                break;
            case "Present Continuous":
                pc=true;
                break;
            case "Present Perfect":
                pp=true;
                break;

        }
    }

    //4. completar el hashmap
    public  void   dbtesting(View view) {
        String t = txteng.trim();
        String t2 = Answerinput.getText().toString().trim();
        if(t.equalsIgnoreCase(t2)){
            cp= cp+1;
            Toast.makeText(this, "inside good"+String.valueOf(cp), Toast.LENGTH_SHORT).show();

        }else {
            cn=cn+1;
            Toast.makeText(this, String.valueOf(cn)+" inside bad "+txteng, Toast.LENGTH_SHORT).show();
        }
        Answerinput.setText("");
        if(cp==4){
            Toast.makeText(this, selection+"passed /pasa a la sig est"+String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp=0;
            turnTrue(selection);

        }else if(cn==4){
            Toast.makeText(this, selection+"not passed / pasa a la sig est"+String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn=0;


        }


        Map<String, Boolean> user = new HashMap<>();
        user.put("Present Simple",ps);
        user.put("Present Continuous",pc);
        user.put("Present Perfect", pp);

            db.document(userid+"/structures")
                    .set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(MainTesting.this, "shit worked", Toast.LENGTH_SHORT)
                                    .show();
                        }
                    });

            db.document(userid+"/Vocabulario")
                .set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(MainTesting.this, "shit worked vocab", Toast.LENGTH_SHORT)
                                .show();
                    }
                });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    Answerinput.setText(result.get(0));

                }
                break;
        }

    }
    public    void iniciarentradavoz(View view) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        try {
            startActivityForResult(intent, REC_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException e) {
        }
    }
    public void gotofragments(View view){
        Intent intento = new Intent(this, TestResults.class);
        startActivity(intento);
    }

}