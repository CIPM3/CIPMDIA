package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
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

import java.util.Locale;

public class SpanishInt_nuevo extends AppCompatActivity {

    String t0, t1, t2, t3, t4, t5, t6;


    Spinner spin, spin2, spin3;
    Button shov, checkans;
    Button practice, sayans,pos;
    VideoView vv;
    LinearLayout vf;
    TextView sptx,txt1;
    TextView engtx, resultpr, engtx2;
    ImageButton botonhablar1;
    TextToSpeech tt1, ttr;
    Button playbtn;
    String selection, selection2,selection3;
    EditText answerinp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_int_nuevo);

        vv = findViewById(R.id.vv);
        vf = findViewById(R.id.vf);
        spin = findViewById(R.id.spin1);
        txt1 = findViewById(R.id.txt1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Interference, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
                txt1.setText(selection);

                vf.setVisibility(View.VISIBLE);
                vv.setVisibility(View.GONE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

    public void chat_maestro(View vista) {
        Intent intento = new Intent(this, chat_maestro.class);
        startActivity(intento);
    }

    public void profile(View vista) {
        Intent intento = new Intent(this, profile.class);
        startActivity(intento);
    }

    public void speakdecir(View vista){
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

    public void showv(View vista){
        vf.setVisibility(View.GONE);
        vv.setVisibility(View.VISIBLE);

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
}