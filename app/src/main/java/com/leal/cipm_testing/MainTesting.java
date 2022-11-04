package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MainTesting extends AppCompatActivity {
    FirebaseFirestore  db = FirebaseFirestore.getInstance();
    private Button     starttest,gotofrag,audiorepeat;
    TextView           choose,sptx,getsent,save, chooselev , timerText;
    Spinner            spin,spinv;
    ImageButton        mic;
    TextToSpeech       tt1;
    EditText           Answerinput;
    String             txteng,userid;
    FirebaseAuth       mAuth;
    GoogleSignInClient gsc;
    String t0, t1, t2, t3, t4, t5, t6,engtx;
    int prom;


    public static final int REC_CODE_SPEECH_INPUT = 100;
    //p-present,pa-past,mi=might,m-must, vj=verbos juntos

    //1
    boolean ps,pc,pp,ppc,pss,psc,psp,pspc,fs,fc,fp,fpc,ws,wc,wp,wpc;
    boolean cos,coc,cop,copc,ms,mc,mp,mpc,cs,cc,mus,muc;
    boolean ss,sc,sp,spc,wt,ft,stp,wpp,ut,but;
    //1 crear string time

    //PD
    String pssec ,pcsec ,ppsec ,ppcsec ,psssec ,pscsec ,
            pspsec ,pspcsec ,fssec ,fcsec ,fpsec ,fpcsec ,
            wssec ,wcsec ,wpsec ,wpcsec , cossec ,cocsec ,copsec ,
            copcsec
    ;

    //LR
    String mssec ,mcsec ,mpsec ,mpcsec ,cssec ,ccsec ,mussec ,mucsec,
            sssec ,scsec ,spsec ,spcsec ,wtsec ,ftsec ,stpsec ,wppsec ,
            utsec ,butsec
            ;

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


    String selection,selectionv;
    int cp,cn;
    VideoView vv;
    ImageButton b;
    String see= "see Tutorial";
    boolean intxsub,intxprep,intxob,intxref,intpasiva;
    Timer timer;
    TimerTask timerTask;
    Double timen = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_testing);
        timer = new Timer();
        timerText= (TextView) findViewById(R.id.timertextv);
        timerText.setVisibility(View.INVISIBLE);
        timerText.setText(formatTime(0,0,0));
        audiorepeat = findViewById(R.id.audiorepeatbtn);
        audiorepeat.setVisibility(View.INVISIBLE);


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
                        case "Spanish Interference":
                            spin.setVisibility(View.VISIBLE);
                            choose.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapterst = ArrayAdapter.createFromResource(getApplicationContext(), R.array.Interference, android.R.layout.simple_spinner_item);
                            adapterst.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapterst);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView,
                                                           View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    if(!selection.equalsIgnoreCase("Tutorial")) {
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
                        case "Spanish Interference":
                            spin.setVisibility(View.VISIBLE);
                            choose.setVisibility(View.VISIBLE);
                            ArrayAdapter<CharSequence> adapterst = ArrayAdapter.createFromResource(getApplicationContext(), R.array.Interference, android.R.layout.simple_spinner_item);
                            adapterst.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapterst);
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
                            Toast.makeText(MainTesting.this, "inside int", Toast.LENGTH_SHORT).show();
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
    public void chooser(View view)  {
        switch (selectionv){
            case "Syntax":
                startTest();
                break;

            case "Vocabulary":
                startTest();

                break;
            case "Spanish Interference":
                startTest();
                break;

            case "Conscious Interference":
                soundtest();
                break;


        }
    }

    //2 cambiar en onDone de cada uno por
    //if(timerTask == null){
    //                                                startTimer();
    //                                            }
    public  void   startTest(){

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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
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
                                    sptx.setText(gen1.ob);
                                    txteng=gen1.eng;
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                break;

            //aqui debería ir los metodos de sp int

            case "Tutorial":
                Toast.makeText(this, "Estas en tutorial, elige algo", Toast.LENGTH_SHORT).show();
                break ;
            case "Por Sujeto":
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
                                    engtx=n.gene;
                                    t0= n.gene;
                                    t1= n.gene2;
                                    t2= n.gene3;
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    // en caso de int de sujeto tercer persona
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                    sptx.setText(n.gens);
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
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                    sptx.setText(n.gens);
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
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                    sptx.setText(n.gens);
                                    engtx=n.gene;// he
                                    t1= n.gene2;// she
                                    t2= n.gene3;// it
                                    t3= "null";
                                    t4= "null";
                                    t5= "null";
                                    t6= "null";
                                    // en caso de int de sujeto tercer persona
                                    //engtx.setTextColor(Color.WHITE);
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

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
                                    sptx.setText(n.gens);
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
                                    Answerinput.setText("");
                                    tt1.speak("como dirías..."+sptx.getText().toString().trim(),TextToSpeech.QUEUE_ADD, null, "one");

                                }

                            }
                        });
                break;

        }
    }
    String url = "https://adrianlealcaldera.com/kermet.mp3";

    //PD
    String soundArray[]={
            "https://adrianlealcaldera.com/Come%20rain%20or%20shine.mp3",
            "https://adrianlealcaldera.com/Calm%20before%20the%20storm.mp3",
            "https://adrianlealcaldera.com/Burn%20bridges.mp3",
            "https://adrianlealcaldera.com/Bolt%20from%20the%20blue.mp3",
            "https://adrianlealcaldera.com/As%20right%20as%20rain.mp3",
            "https://adrianlealcaldera.com/An%20ounce%20of%20prevention%20is%20worth%20a%20pound%20of%20cure.mp3",
            "https://adrianlealcaldera.com/An%20apple%20a%20day%20keeps%20the%20doctor%20away.mp3",
            "https://adrianlealcaldera.com/A%20storm%20in%20a%20teacup.mp3",
            "https://adrianlealcaldera.com/A%20stitch%20in%20time%20saves%20nine.mp3",
            "https://adrianlealcaldera.com/A%20snowball's%20chance%20in%20hell.mp3",
            "https://adrianlealcaldera.com/A%20snowball%20effect.mp3",
            "https://adrianlealcaldera.com/A%20little%20learning%20is%20a%20dangerous%20thing.mp3",
            "https://adrianlealcaldera.com/Curiosity%20killed%20the%20cat.mp3",
            "https://adrianlealcaldera.com/Cut%20the%20mustard.mp3",
            "https://adrianlealcaldera.com/Don't%20beat%20a%20dead%20horse.mp3",
            "https://adrianlealcaldera.com/Every%20dog%20has%20his%20day.mp3",
            "https://adrianlealcaldera.com/Familiarity%20breeds%20contempt.mp3",
            "https://adrianlealcaldera.com/Fit%20as%20a%20fiddle.mp3",
            "https://adrianlealcaldera.com/Get%20a%20second%20wind.mp3",
            "https://adrianlealcaldera.com/Get%20wind%20of%20something.mp3",
            "https://adrianlealcaldera.com/Go%20down%20in%20flames.mp3",
            "https://adrianlealcaldera.com/Haste%20makes%20waste.mp3",
            "https://adrianlealcaldera.com/Have%20your%20head%20in%20the%20clouds.mp3",
            "https://adrianlealcaldera.com/Hear%20something%20straight%20from%20the%20horse's%20mouth.mp3",
            "https://adrianlealcaldera.com/He's%20off%20his%20rocker.mp3",
            "https://adrianlealcaldera.com/He's%20sitting%20on%20the%20fence.mp3",
            "https://adrianlealcaldera.com/It%20is%20always%20darkest%20before%20the%20dawn.mp3",
            "https://adrianlealcaldera.com/It%20takes%20two%20to%20tango.mp3",
            "https://adrianlealcaldera.com/Jump%20on%20the%20bandwagon.mp3",
            "https://adrianlealcaldera.com/Know%20which%20way%20the%20wind%20is%20blowing.mp3",
            "https://adrianlealcaldera.com/Leave%20no%20stone%20unturned.mp3",
            "https://adrianlealcaldera.com/Let%20sleeping%20dogs%20lie.mp3",
            "https://adrianlealcaldera.com/Like%20riding%20a%20bicycle.mp3",
            "https://adrianlealcaldera.com/Like%20two%20peas%20in%20a%20pod.mp3",
            "https://adrianlealcaldera.com/Make%20hay%20while%20the%20sun%20shines.mp3",
            "https://adrianlealcaldera.com/On%20cloud%20nine.mp3",
            "https://adrianlealcaldera.com/Once%20bitten%20twice%20shy.mp3",
            "https://adrianlealcaldera.com/Out%20of%20the%20frying%20pan%20and%20into%20the%20fire.mp3",
            "https://adrianlealcaldera.com/Run%20like%20the%20wind.mp3",
            "https://adrianlealcaldera.com/Shape%20up%20or%20ship%20out.mp3",
            "https://adrianlealcaldera.com/Snowed%20under.mp3",
            "https://adrianlealcaldera.com/That%20ship%20has%20sailed.mp3",
            "https://adrianlealcaldera.com/The%20pot%20calling%20the%20kettle%20black.mp3",
            "https://adrianlealcaldera.com/There%20are%20clouds%20on%20the%20horizon.mp3",
            "https://adrianlealcaldera.com/Through%20thick%20and%20thin.mp3",
            "https://adrianlealcaldera.com/Time%20is%20money.mp3",
            "https://adrianlealcaldera.com/Waste%20not%20want%20not.mp3",
            "https://adrianlealcaldera.com/We%20see%20eye%20to%20eye.mp3",
            "https://adrianlealcaldera.com/Weather%20the%20storm.mp3",
            "https://adrianlealcaldera.com/Well%20begun%20is%20half%20done.mp3",
            "https://adrianlealcaldera.com/When%20it%20rains%20it%20pours.mp3",
            "https://adrianlealcaldera.com/You%20can%20catch%20more%20flies%20with%20honey%20than%20you%20can%20with%20vinegar.mp3",
            "https://adrianlealcaldera.com/You%20can%20lead%20a%20horse%20to%20water%20but%20you%20can't%20make%20him%20drink.mp3",
            "https://adrianlealcaldera.com/You%20can't%20make%20an%20omelet%20without%20breaking%20some%20eggs.mp3",

            //122...

            //LR
            "https://adrianlealcaldera.com/A%20penny%20for%20your%20thoughts.mp3",
            "https://adrianlealcaldera.com/A%20penny%20saved%20is%20a%20penny%20earned.mp3",
            "https://adrianlealcaldera.com/A%20perfect%20storm.mp3",
            "https://adrianlealcaldera.com/Actions%20speak%20louder%20than%20words.mp3",
            "https://adrianlealcaldera.com/Add%20insult%20to%20injury.mp3",
            "https://adrianlealcaldera.com/Barking%20up%20the%20wrong%20tree.mp3",
            "https://adrianlealcaldera.com/Birds%20of%20a%20feather%20flock%20together.mp3",
            "https://adrianlealcaldera.com/Break%20the%20ice.mp3",
            "https://adrianlealcaldera.com/By%20the%20skin%20of%20your%20teeth.mp3",
            "https://adrianlealcaldera.com/Comparing%20apples%20to%20oranges.mp3",
            "https://adrianlealcaldera.com/Costs%20an%20arm%20and%20a%20leg.mp3",
            "https://adrianlealcaldera.com/Do%20something%20at%20the%20drop%20of%20a%20hat.mp3",
            "https://adrianlealcaldera.com/Do%20unto%20others%20as%20you%20would%20have%20them%20do%20unto%20you.mp3",
            "https://adrianlealcaldera.com/Don't%20count%20your%20chickens%20before%20they%20hatch.mp3",
            "https://adrianlealcaldera.com/Don't%20cry%20over%20spilt%20milk.mp3",
            "https://adrianlealcaldera.com/Don't%20give%20up%20your%20day%20job.mp3",
            "https://adrianlealcaldera.com/Don't%20put%20all%20your%20eggs%20in%20one%20basket.mp3",
            "https://adrianlealcaldera.com/Every%20cloud%20has%20a%20silver%20lining.mp3",
            "https://adrianlealcaldera.com/Give%20someone%20the%20cold%20shoulder.mp3",
            "https://adrianlealcaldera.com/Go%20on%20a%20wild%20goose%20chase.mp3",
            "https://adrianlealcaldera.com/Good%20things%20come%20to%20those%20who%20wait.mp3",
            "https://adrianlealcaldera.com/Hit%20the%20nail%20on%20the%20head.mp3",
            "https://adrianlealcaldera.com/Ignorance%20is%20bliss.mp3",
            "https://adrianlealcaldera.com/It%20takes%20one%20to%20know%20one.mp3",
            "https://adrianlealcaldera.com/It's%20a%20piece%20of%20cake.mp3",
            "https://adrianlealcaldera.com/It's%20raining%20cats%20and%20dogs.mp3",
            "https://adrianlealcaldera.com/Kill%20two%20birds%20with%20one%20stone.mp3",
            "https://adrianlealcaldera.com/Let%20the%20cat%20out%20of%20the%20bag.mp3",
            "https://adrianlealcaldera.com/Live%20and%20learn.mp3",
            "https://adrianlealcaldera.com/Look%20before%20you%20leap.mp3",
            "https://adrianlealcaldera.com/On%20thin%20ice.mp3",
            "https://adrianlealcaldera.com/Once%20in%20a%20blue%20moon.mp3",
            "https://adrianlealcaldera.com/Play%20devil's%20advocate.mp3",
            "https://adrianlealcaldera.com/Put%20something%20on%20ice.mp3",
            "https://adrianlealcaldera.com/Saving%20for%20a%20rainy%20day.mp3",
            "https://adrianlealcaldera.com/Slow%20and%20steady%20wins%20the%20race.mp3",
            "https://adrianlealcaldera.com/Spill%20the%20beans.mp3",
            "https://adrianlealcaldera.com/Take%20a%20rain%20check.mp3",
            "https://adrianlealcaldera.com/Take%20it%20with%20a%20grain%20of%20salt.mp3",
            "https://adrianlealcaldera.com/The%20ball%20is%20in%20your%20court.mp3",
            "https://adrianlealcaldera.com/The%20best%20thing%20since%20sliced%20bread.mp3",
            "https://adrianlealcaldera.com/The%20devil%20is%20in%20the%20details.mp3",


    };
    String soundArrayRobot[] = {
            "Come rain or shine",
            "the calm before the storm",
            "burn bridges",
            "bolt from the blue",
            "as right as rain",
            "an ounce of prevention is worth a pound of cure",
            "an apple a day keeps the doctor away",
            "a storm in a teacup",
            "a stitch in time saves nine",
            "a snowball's chance in hell",
            "a snowball effect",
            "a little learning is a dangerous thing",//corregidos
            "Curiosity killed the cat",
            "Cut the mustard",
            "Don't beat a dead horse",
            "Every dog has his day",
            "Familiarity breeds contempt",
            "Fit as a fiddle",
            "Get a second wind",
            "Get wind of something",
            "Go down in flames",
            "Haste makes waste",
            "Have your head in the clouds",
            "Hear something straight from the horse's mouth",
            "He's off his rocker",
            "He's sitting on the fence",
            "It is always darkest before the dawn",
            "It takes two to tango",
            "Jump on the bandwagon",
            "Know which way the wind is blowing",
            "Leave no stone unturned",
            "Let sleeping dogs lie",
            "Like riding a bicycle",
            "Like two peas in a pod",
            "Make hay while the sun shines",
            "On cloud nine",
            "Once bitten twice shy",
            "Out of the frying pan and into the fire",
            "Run like the wind",
            "Shape up or ship out",
            "Snowed under",
            "That ship has sailed",
            "The pot calling the kettle black",
            "There are clouds on the horizon",
            "Through thick and thin",
            "Time is money",
            "Waste not want not",
            "We see eye to eye",
            "Weather the storm",
            "Well begun is half done",
            "When it rains it pours",
            "You can catch more flies with honey than you can with vinegar",
            "You can lead a horse to water but you can't make him drink",
            "You can't make an omelet without breaking some eggs",

            //LR
            "A penny for your thoughts",
            "A penny saved is a penny earned",
            "A perfect storm",
            "Actions speak louder than words",
            "Add insult to injury",
            "Barking up the wrong tree",
            "Birds of a feather flock together",
            "Bite off more than you can chew",
            "Break the ice",
            "By the skin of your teeth",
            "Comparing apples to oranges",
            "Costs an arm and a leg",
            "Do something at the drop of a hat",
            "Do unto others as you would have them do unto you",
            "Don't count your chickens before they hatch",
            "Don't cry over spilt milk",
            "Don't give up your day job",
            "Don't put all your eggs in one basket",
            "Every cloud has a silver lining",
            "Give someone the cold shoulder",
            "Go on a wild goose chase",
            "Good things come to those who wait",
            "Hit the nail on the head",
            "Ignorance is bliss",
            "It takes one to know one",
            "It's a piece of cake",
            "It's raining cats and dogs",
            "Kill two birds with one stone",
            "Let the cat out of the bag",
            "Live and learn",
            "Look before you leap",
            "On thin ice",
            "Once in a blue moon",
            "Play devil's advocate",
            "Put something on ice",
            "Saving for a rainy day",
            "Slow and steady wins the race",
            "Spill the beans",
            "Take a rain check",
            "Take it with a grain of salt",
            "The ball is in your court",
            "The best thing since sliced bread",
            "The devil is in the details",

    };

    int countPos=0;
    int pos0, pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9;
    int rsa;
    public void soundtest(){

        save.setVisibility(View.VISIBLE);
        audiorepeat.setVisibility(View.VISIBLE);
    sptx.setText("escribe lo que escuchas");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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


                                        Answerinput.setText("");
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
            case "Por Sujeto":
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
                break ;

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
    //3 poner las variables de segundos en cada case
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
            case "Por Sujeto":
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
                break ;



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
            case "Spanish Interference":
                spintdbtesting();
                break;
            case "Conscious Interference":
                Conintdbtesting();
                break;
        }
    }

    //4 crear en un userput con la estructura time
    public void      dbtesting()  {
        String t = txteng.trim();
        String t2 = Answerinput.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            cp = cp + 1;
            Toast.makeText(this, "inside good" + String.valueOf(cp), Toast.LENGTH_SHORT).show();
            prom = rounded / 4;


        } else {
            cn = cn + 1;
            Toast.makeText(this, String.valueOf(cn) + " inside bad " + txteng, Toast.LENGTH_SHORT).show();
        }
        if (cp == 4) {
            Toast.makeText(this, selection + "pasaste-Pasa a otra estructura" + String.valueOf(cp), Toast.LENGTH_SHORT).show();
            cp = 0;
            cn = 0;
            timerText.setText("your Average Response time: "  +String.valueOf(prom)+" seconds");
            timerText.setVisibility(View.VISIBLE);
            turnTrueTime(selection, String.valueOf(prom));
            timen = 0.0;
            if (timerTask != null) {
                timerTask.cancel();
            }
            timerTask = null;

        } else if (cn == 4) {
            Toast.makeText(this, selection + "not passed Pasa a otra estructura" + String.valueOf(cn), Toast.LENGTH_SHORT).show();
            cn = 0;
            cp = 0;


        }
        CollectionReference uid = db.collection(userid);
        // completar esta pendejada con las keys iguales a las de student
        Map<String, Object> user = new HashMap<>();
        user.put("name", Answerinput.getText().toString());
        user.put("presentesimple", ps);
        user.put("presentesimpletime", pssec);
        user.put("presenteContinuo", pc);
        user.put("presentecontinuotime", pcsec);
        user.put("presentePerfecto", pp);
        user.put("presenteperfectotime", ppsec);
        user.put("presentePerfectoContinuo", ppc);
        user.put("presenteperfectocontinuo", ppcsec);
        user.put("pastsimple", pss);
        user.put("pastsimpletime", psssec);
        user.put("pastContinuo", psc);
        user.put("pastcontinuotime", pscsec);
        user.put("pastPerfecto", psp);
        user.put("pastperfectotime", pspsec);
        user.put("pastPerfectoContinuo", pspc);
        user.put("pastperfectocontinuotime", pspcsec);
        user.put("futuresimple", fs);
        user.put("futuresimpletime", fssec);
        user.put("futureContinuo", fc);
        user.put("futurecontinuotime", fcsec);
        user.put("futurePerfecto", fp);
        user.put("futureperfectotime", fpsec);
        user.put("futurePerfectoContinuo", fpc);
        user.put("futureperfectocontinuotime", fpcsec);
        user.put("wouldsimple", ws);
        user.put("wouldsimpletime", wssec);
        user.put("wouldContinuo", wc);
        user.put("wouldcontinuotime", wcsec);
        user.put("wouldPerfecto", wp);
        user.put("wouldperfectotime", wpsec);
        user.put("wouldPerfectoContinuo", wpc);
        user.put("wouldperfectocontinuotime", wpcsec);
        user.put("couldsimple", cos);
        user.put("couldsimpletime", cossec);
        user.put("couldContinuo", coc);
        user.put("couldcontinuotime", cocsec);
        user.put("couldPerfecto", cop);
        user.put("couldperfectotime", copsec);
        user.put("couldPerfectoContinuo", copc);
        user.put("couldperfectocontinuotime", copcsec);
        //LR
        user.put("mightsimple", ms);
        user.put("mightsimpletime", mssec);
        user.put("mightContinuo", mc);
        user.put("mightContinuotime", mcsec);
        user.put("mightPerfecto", mp);
        user.put("mightPerfectotime", mpsec);
        user.put("mightPerfectoContinuo", mpc);
        user.put("mightPerfectoContinuotime", mpcsec);
        user.put("cansimple", cs);
        user.put("cansimpletime", cssec);
        user.put("canContinuo", cc);
        user.put("canContinuotime", ccsec);
        user.put("mustsimple", mus);
        user.put("mustsimpletime", mussec);
        user.put("mustContinuo", muc);
        user.put("mustContinuotime", mucsec);
        user.put("shouldsimple", ss);
        user.put("shouldsimpletime", sssec);
        user.put("shouldContinuo", sc);
        user.put("shouldContinuotime", scsec);
        user.put("shouldPerfecto", sp);
        user.put("shouldPerfectotime", spsec);
        user.put("shouldPerfectoContinuo", spc);
        user.put("shouldPerfectoContinuotime", spcsec);
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
        uid.document("structures").set(user);


    }
    public void vocabdbtesting()  {
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
        user.put("use",use);
        user.put("man",man);
        user.put("find",find);
        user.put("here",here);
        user.put("thing",thing);
        user.put("give",give);
        user.put("many",many);
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
        //aqui termina 450 a 500

        uid.document("vocabulary").set(user);

    }
    public void spintdbtesting()  {
        String ansin = Answerinput.getText().toString().trim();
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
    }

    int score0, score1, score2,score3, score4, score5,score6,score7,score8,score9,score10,score11,score12,score13,score14,score15,score16,score17,score18,score19;
    int ScoreFinal;

    public void Conintdbtesting(){

        String ansin = Answerinput.getText().toString().trim();
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
        Answerinput.setText("");
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
    int seconds;
    int minutes;
    int hours;
    int rounded;
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



}