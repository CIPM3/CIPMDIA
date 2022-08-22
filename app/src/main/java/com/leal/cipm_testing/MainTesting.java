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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Locale;
public class MainTesting extends AppCompatActivity {
    private Button starttest;
    TextView choose,sptx, getsent,save;
    Spinner spin;
    ImageButton mic;
    TextToSpeech tt1;
    EditText Answerinput;
    String txteng;
    public static final int REC_CODE_SPEECH_INPUT = 100;


    //p-present,pa-past,mi=might,m-must, vj=verbos juntos
    boolean ps,pc,pp,ppc, pas,pac,pap,papc,fs,fc,fp,fpc,ws,wc,wp,wpc,cs,cc,ccp,cpc,ss,sc,sp,spc,mis,mip,mipc
            ,ms,mc,mp,mpc,cans,canc,pvpp,vj,pregunta,get,thereis,goingto,haveto,usedto,reflx,supp,wyt,wish,comp,superl,formeto
            ;
    DatabaseReference myDbRef= FirebaseDatabase.getInstance().getReference().child("UserName");
    String selection;
    int cp,cn;
    int number=0;
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

    public   void start(View view){
        choose.setVisibility(View.VISIBLE);
        spin.setVisibility(View.VISIBLE);
    }

    private void shownext() {
        mic.setVisibility(View.VISIBLE);
        sptx.setVisibility(View.VISIBLE);
        starttest.setVisibility(View.VISIBLE);
        Answerinput.setVisibility(View.VISIBLE);
        getsent.setVisibility(View.VISIBLE);


    }

    public void startTest(View view){
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
                                    gen1.GenPresCont2();
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
    public void iniciarentradavoz(View view) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        try {
            startActivityForResult(intent, REC_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException e) {
        }
    }
    public void checkanswer(View vista) {

        String t = txteng.trim();
        String t2 = Answerinput.getText().toString().trim();
        if(t.equalsIgnoreCase(t2)){
            cp= cp+1;
            Toast.makeText(this, "inside good"+String.valueOf(cp), Toast.LENGTH_SHORT).show();

        }else {
            cn=cn+1;
            Toast.makeText(this, String.valueOf(cp)+" inside bad "+txteng, Toast.LENGTH_SHORT).show();
        }
        Answerinput.setText("");

        if(cp==4){
            Toast.makeText(this, selection+"passed /pasa a la sig est"+String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp=0;


        }else if(cn==4){
            Toast.makeText(this, selection+"not passed / pasa a la sig est"+String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn=0;


        }



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

}