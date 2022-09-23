package com.leal.cipm_testing;

import androidx.annotation.NonNull;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MainTesting extends AppCompatActivity {
    FirebaseFirestore  db = FirebaseFirestore.getInstance();
    private Button     starttest,gotofrag;
    TextView           choose,sptx,getsent,save, chooselev;
    Spinner            spin,spinv;
    ImageButton        mic;
    TextToSpeech       tt1;
    EditText           Answerinput;
    String             txteng,userid;
    FirebaseAuth       mAuth;
    GoogleSignInClient gsc;


    public static final int REC_CODE_SPEECH_INPUT = 100;
    //p-present,pa-past,mi=might,m-must, vj=verbos juntos
    //1
    boolean ps,pc,pp,ppc,pss,psc,psp,pspc,fs,fc,fp,fpc,ws,wc,wp,wpc;
    boolean cos,coc,cop,copc,ms,mc,mp,mpc,cs,cc,mus,muc;
    boolean ss,sc,sp,spc,wt,ft,stp,wpp,ut,but;
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

    String selection,selectionv;
    int cp,cn;
    VideoView vv;
    ImageButton b;
    String see= "see Tutorial";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_testing);
        gotofrag=findViewById(R.id.gotofrag);
        gotofrag.setVisibility(View.GONE);
        starttest=findViewById(R.id.StartTestMain);
        vv= findViewById(R.id.tutgentest);
        vv.setVisibility(View.GONE);
        b=  findViewById(R.id.tutgenbtn);
        b.setVisibility(View.GONE);
        choose=findViewById(R.id.choosest);
        choose.setVisibility(View.GONE);
        spin = findViewById(R.id.spinnert);
        spin.setVisibility(View.GONE);
        chooselev = findViewById(R.id.chooselevel);
        chooselev.setVisibility(View.GONE);
        spinv= findViewById(R.id.spinnert2);
        spinv.setVisibility(View.GONE);

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


        Prefs prefs = new Prefs(this);
        if (prefs.getPremium()==1){
            //Give the user all the premium features
            //hide ads if you are showing ads
            ArrayAdapter<CharSequence> adapterv = ArrayAdapter.createFromResource
                    (this, R.array.LevelofAbstraction, android.R.layout.simple_spinner_item);
            adapterv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinv.setAdapter(adapterv);
            spinv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selectionv = spinv.getSelectedItem().toString();

                    switch (selectionv){

                        case "Vocabulary":
                            spin.setVisibility(View.VISIBLE);
                            choose.setText("Choose a Range");
                            choose.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.vocabPremium, android.R.layout.simple_spinner_item);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    if(!selection.equalsIgnoreCase("Tutorial")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            break;


                        case "Syntax":
                            spin.setVisibility(View.VISIBLE);
                            choose.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapters = ArrayAdapter.createFromResource(getApplicationContext(), R.array.structures, android.R.layout.simple_spinner_item);
                            adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapters);
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
                            break;


                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


        } else if (prefs.getPremium()==0){
            //remove user all the premium features
            //show ads to the user
            ArrayAdapter<CharSequence> adapterv = ArrayAdapter.createFromResource
                    (this, R.array.LevelofAbstraction, android.R.layout.simple_spinner_item);
            adapterv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinv.setAdapter(adapterv);
            spinv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selectionv = spinv.getSelectedItem().toString();

                    switch (selectionv){

                        case "Vocabulary":
                            spin.setVisibility(View.VISIBLE);
                            choose.setText("Choose a Range");
                            choose.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.vocab, android.R.layout.simple_spinner_item);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    if(!selection.equalsIgnoreCase("Tutorial")) {
                                        shownext();
                                    }
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            break;


                        case "Syntax":
                            spin.setVisibility(View.VISIBLE);
                            choose.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapters = ArrayAdapter.createFromResource(getApplicationContext(), R.array.structuresGratis, android.R.layout.simple_spinner_item);
                            adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapters);
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
                            break;


                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });



        }






    }
    public  void   start(View view){
        if(starttest.getText().equals(see)){
            vv.setVisibility(View.VISIBLE);
            b.setVisibility(View.VISIBLE);

        }else{
            chooselev.setVisibility(View.VISIBLE);
            spinv.setVisibility(View.VISIBLE);
            gotofrag.setVisibility(View.VISIBLE);
            starttest.setText(see);


        }


    }

    private void   shownext() {
        mic.setVisibility(View.VISIBLE);
        sptx.setVisibility(View.VISIBLE);
        starttest.setVisibility(View.VISIBLE);
        Answerinput.setVisibility(View.VISIBLE);
        getsent.setVisibility(View.VISIBLE);

    }
    //2
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPresPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPastCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPastPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenPastPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFutCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFutPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenFutPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWouldCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWouldPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWouldPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCouldCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCouldPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCouldPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMightCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMightPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMightPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenCanCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenMustCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenShouldCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenShouldPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenShouldPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWantYouTo2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenForTo2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenSupposedTopasado2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenWishPastPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenUsedTo2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    // este metodo de abajo se cambia para matchear el case
                                    gen1.GenBeUsedTo2();
                                    sptx.setText(gen1.gens);
                                    txteng=gen1.gene;

                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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

                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;
        }
    }
    //3
    private void   turnTrue(String CurrentStructure) {

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
        }
    }

    public void answerchecker(View view){
        switch (selectionv){
            case "Syntax":
                dbtesting();
                break;

            case "Vocabulary":
                vocabdbtesting();

                break;
        }
    }
    public  void   dbtesting() {
        String t = txteng.trim();
        String t2 = Answerinput.getText().toString().trim();
        if(t.equalsIgnoreCase(t2)){
            cp= cp+1;
            Toast.makeText(this, "inside good"+String.valueOf(cp), Toast.LENGTH_SHORT).show();

        }else {
            cn=cn+1;
            Toast.makeText(this, String.valueOf(cn)+" inside bad "+txteng, Toast.LENGTH_SHORT).show();
        }
        if(cp==4){
            Toast.makeText(this, selection+"pasaste-Pasa a otra estructura"+String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp=0;
            cn=0;
            turnTrue(selection);

        }else if(cn==4){
            Toast.makeText(this, selection+"not passed Pasa a otra estructura"+String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn=0;
            cp=0;


        }
        CollectionReference uid= db.collection(userid);
        // completar esta pendejada con las keys iguales a las de student
        Map<String, Object> user = new HashMap<>();
        user.put("name",Answerinput.getText().toString());
        user.put("presentesimple",ps);
        user.put("presenteContinuo",pc);
        user.put("presentePerfecto",pp);
        user.put("presentePerfectoContinuo",ppc);
        user.put("pastsimple",pss);
        user.put("pastContinuo",psc);
        user.put("pastPerfecto",psp);
        user.put("pastPerfectoContinuo",pspc);
        user.put("futuresimple",fs);
        user.put("futureContinuo",fc);
        user.put("futurePerfecto",fp);
        user.put("futurePerfectoContinuo",fpc);
        user.put("wouldsimple",ws);
        user.put("wouldContinuo",wc);
        user.put("wouldPerfecto",wp);
        user.put("wouldPerfectoContinuo",wpc);
        user.put("couldsimple",cos);
        user.put("couldContinuo",coc);
        user.put("couldPerfecto",cop);
        user.put("couldPerfectoContinuo",copc);
        user.put("mightsimple",ms);
        user.put("mightContinuo",mc);
        user.put("mightPerfecto",mp);
        user.put("mightPerfectoContinuo",mpc);
        user.put("cansimple",cs);
        user.put("canContinuo",cc);
        user.put("mustsimple",mus);
        user.put("mustContinuo",muc);
        user.put("shouldsimple",ss);
        user.put("shouldContinuo",sc);
        user.put("shouldPerfecto",sp);
        user.put("shouldPerfectoContinuo",spc);
        user.put("wantTo",wt);
        user.put("forTo",ft);
        user.put("supposedToPresent",stp);
        user.put("wishPastPerfect",wpp);
        user.put("usedTo",ut);
        user.put("beUsedTo",but);
        uid.document("structures").set(user);




    }
    public void vocabdbtesting(){
        String t = txteng.trim();
        String t2 = Answerinput.getText().toString().trim();
        if(t.equalsIgnoreCase(t2)){
             Toast.makeText(this, String.valueOf(cp)+" is correct", Toast.LENGTH_SHORT).show();
             turnTrue(t.trim());
        }else {
            Toast.makeText(this, String.valueOf(cn)+" is not correct "+txteng, Toast.LENGTH_SHORT).show();
        }
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
        user.put("more1",more1);
        user.put("use",use);
        user.put("no",no);
        user.put("man",man);
        user.put("find",find);
        user.put("here",here);
        user.put("thing",thing);
        user.put("give",give);
        user.put("many",many);
        user.put("well",well);
        //aqui termina 50 a 100


        uid.document("vocabulary").set(user);

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
    public void showvid(View view){
        b.setVisibility(View.INVISIBLE);
        Uri uri = Uri.parse("https://adrianlealcaldera.com/appupdatereducido.mp4");
        vv.setVideoURI(uri);
        vv.setMediaController(new MediaController(this));
        vv.requestFocus();
        vv.start();

    }

}