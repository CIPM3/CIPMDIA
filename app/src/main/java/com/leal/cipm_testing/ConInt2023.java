package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leal.cipm_testing.components.VideoPlayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ConInt2023 extends AppCompatActivity {

    String selection;
    TextView textspin1,txteng,spanishsentence,txt_salt_btn,answerinput1,txtclip;
    Spinner spin;
    boolean explanation,clipMuestra;

    LinearLayout btn_salt_exp,btn_check_ans,btn_show_ans,input_lay_back,btn_clip;
    LinearLayout btn_ver_exp,answer_lay,input_lay;

    TextToSpeech tts;
    int control;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    private ImageButton botonhablar;
    boolean personalizedPlan,isCustom;
    boolean isInVocab,isInStructure,
            isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,
            isPlanIntermedioFromDb,
            isBasicStructures,isPlanIntermedio;
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    FirebaseAuth mAuth=FirebaseAuth.getInstance();
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp =objetoArrays.consciousInterferenciaGratis;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    int PositionOfSelection;
    int CounterToSubtractSelection=0;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan,AdvancedPlan,AdvancedPlanFromDb,rachelfinish;
    Prefs prefs;

    int posSele = 0;
    int posKeyWord = 0;

    String Rachel [][][]={
            //Steve Jobs 1
            {
                    {
                            //RESPUESTA 1
                            "actually nerd jesus died in the last year right steve jobs",
                            //URL
                            "http://adrianlealcaldera.com/bb1.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb1.mp4"
                    },
                    {
                            //RESPUESTA 2
                            "yeah he died right i know i know a lot of nerds here tonight",
                            //URL
                            "http://adrianlealcaldera.com/bb2.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb2.mp4"
                    },
                    {
                            //RESPUESTA 3
                            "i know you sad",
                            //URL
                            "http://adrianlealcaldera.com/bb3.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb3.mp4"
                    },
                    {
                            //RESPUESTA 4
                            "I didn't get it",
                            //URL
                            "http://adrianlealcaldera.com/bb4.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb4.mp4"
                    },
                    {
                            //RESPUESTA 5
                            "I didn't get the big deal they made about that guy",
                            //URL
                            "http://adrianlealcaldera.com/bb5.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb5.mp4"
                    }
            },
            //Steve Jobs 2
            {
                    {
                            //RESPUESTA 1
                            "Prueba",
                            //URL
                            "http://adrianlealcaldera.com/bb5.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb5.mp4"

                    },
                    {
                            //RESPUESTA 2
                            "Prueba 2",
                            //URL
                            "http://adrianlealcaldera.com/bb5.mp4",
                            //EXPLICACION
                            "http://adrianlealcaldera.com/expbb5.mp4"

                    }
            },
            //Kot Fishing 1
            {
                    {
                            //RESPUESTA 1
                            "Come on frank fish or get off the pot",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing1Clip1.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing1Exp1.mp4"
                    },
                    {
                            //RESPUESTA 2
                            "just a second how the heck does jack fish with this stuff",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing1Clip2.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing1Exp2.mp4"
                    },
                    {
                            //RESPUESTA 3
                            "i like beer don't you like beek i mean i love beer",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing1Clip3.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing1Exp3.mp4"
                    },
                    {
                            //RESPUESTA 4
                            "I just got one sweet jean vicent, i'm back",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing1Clip4.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing1Exp4.mp4"
                    },
                    {
                            //RESPUESTA 5
                            "that was quick talking about hank's the man damn go fishing magician",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing1Clip5.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing1Exp5.mp4"
                    },
            },
            //Kot Fishing 2
            {
                    {
                            //RESPUESTA 1
                            "looks like they're hungry for worms today pass me one, will you hank",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing2Clip1.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing2exp1.mp4"
                    },
                    {
                            //RESPUESTA 2
                            "what's the matter batteries go dead on your electric spinner",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing2Clip2.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing2exp2.mp4"
                    },
                    {
                            //RESPUESTA 3
                            "Wo hank what you got there, blood dough balls",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing2Clip3.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing2exp3.mp4"
                    },
                    {
                            //RESPUESTA 4
                            "hank only fishes with worms why anything else would be cheating",
                            //URL
                            "https://adrianlealcaldera.com/KothFishing2Clip4.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/kotfishing2exp4.mp4"
                    }
            },
            //Helicoptero 1
            {
                    {
                            //RESPUESTA 1
                            "I saw this story down in Orange County, Orange County, California in the sky. This guy gave helicopter your for 30 years, 30 years without incident.",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero1Clip1.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero1Exp1.mp4"
                    },
                    {
                            //RESPUESTA 2
                            "Hands the business off to his son, the American dream. “I built it up for 30 years. Here you go, son. Make the family and the family name proud.” ”All right, Dad, I love you.”",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero1Clip2.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero1Exp2.mp4"
                    },
                    {
                            //RESPUESTA 3
                            "All right? This poor kid, five days in, he’s supposed to give a tour to a couple, only the dude shows up.",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero1Clip3.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero1Exp3.mp4"
                    },
                    {
                            //RESPUESTA 4
                            "The kid thought it was weird, but he’s like, “I need the money. I gotta give him a tour.” Right? So he takes this guy up. Ten minutes into the tour, the dude fucking jumped out.",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero1Clip4.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero1Exp4.mp4"
                    }
            },
            //Helicoptero 2
            {
                    {
                            //RESPUESTA 1
                            "Yeah, five days in. Five days in from the balloons and the cake. “We love you, son. Keep the family tree going. The traditional line.”",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero2Clip1.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero2Exp1.mp4"
                    },
                    {
                            //RESPUESTA 2
                            "Five fucking days later, this kid, he probably barely had the speech down. Just sitting there, flying the helicopter.",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero2Clip2.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero2Exp2.mp4"
                    },
                    {
                            //RESPUESTA 3
                            "All right, if you look out the left side of the aircraft, that’s Orange County. There’s over 27 miles of beaches there. Put your seatbelt back on, 27 miles of beaches.",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero2Clip3.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero2Exp3.mp4"
                    },
                    {
                            //RESPUESTA 4
                            "Was established as a county in 1903. Sir, please don’t open the door. Sir, what are you doing? Sir, no, no. Don’t",
                            //URL
                            "https://adrianlealcaldera.com/Helicoptero2Clip4.mp4",
                            //EXPLICACION
                            "https://adrianlealcaldera.com/Helicoptero2Exp4.mp4"
                    }
            }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_int2023);

        spin = findViewById(R.id.spinuno);
        textspin1 = findViewById(R.id.textspin1);
        txteng = findViewById(R.id.txteng);
        txt_salt_btn = findViewById(R.id.txt_salt_btn);
        txtclip = findViewById(R.id.txtclip);
        spanishsentence = findViewById(R.id.spanishsentence);

        btn_salt_exp = findViewById(R.id.btn_salt_exp);
        btn_check_ans = findViewById(R.id.btn_check_ans);
        btn_show_ans = findViewById(R.id.btn_show_ans);
        input_lay_back = findViewById(R.id.input_lay_back);

        btn_ver_exp = findViewById(R.id.btn_ver_exp);
        answer_lay = findViewById(R.id.answer_lay);
        input_lay = findViewById(R.id.input_lay);
        btn_clip = findViewById(R.id.btn_clip);

        answerinput1 = findViewById(R.id.answerinput1);

        explanation = false;
        clipMuestra = true;
        rachelfinish = false;

        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        docref= db.collection(userid).document("WhereisStudent");

        prefs= new Prefs(this);
        PremiumAndArrayControler();
    }

    //DB FUNC
    public void PremiumAndArrayControler(){

        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        isPlanIntermedio=reciver.getBooleanExtra("planintermedio",false);
        isPlanIntermedioFromDb=reciver.getBooleanExtra("isFromIntermedioStandarPlan",false);
        AdvancedPlan = reciver.getBooleanExtra("AdvancedPlan",false);
        AdvancedPlanFromDb= reciver.getBooleanExtra("isFromAdvancedPlanFromDb",false);

        if(personalizedPlan){
            if(isCustom){
                if(prefs.getPremium()==1){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rachel, android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            /*limpiar_inputs();
                            set_ans();*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if(i==tts.SUCCESS){
                                int lang = tts.setLanguage(Locale.ENGLISH);
                            }
                        }
                    });

                }
                else if(prefs.getPremium()==0){
                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=documentSnapshot.toObject(VocabModeloPersistencia.class);
                            assert vmp != null;
                            temp= vmp.resultArray.toArray(new String[0]);
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(ConInt2023.this, android.R.layout.simple_spinner_item,temp);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    textspin1.setText(selection);

                                   /* limpiar_inputs();
                                    set_ans();*/
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                                @Override
                                public void onInit(int i) {
                                    if(i==tts.SUCCESS){
                                        int lang = tts.setLanguage(Locale.ENGLISH);
                                    }
                                }
                            });
                        }
                    });
                }
            }else{
                if(prefs.getPremium()==1){
                    ArrayAdapter<String> adapter =new  ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            /*limpiar_inputs();
                            set_ans();*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if(i==tts.SUCCESS){
                                int lang = tts.setLanguage(Locale.ENGLISH);
                            }
                        }
                    });

                }
                else if(prefs.getPremium()==0){
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            /*limpiar_inputs();
                            set_ans();*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int i) {
                            if(i==tts.SUCCESS){
                                int lang = tts.setLanguage(Locale.ENGLISH);
                            }
                        }
                    });
                }
            }
        }else {
            checkPremiun();
        }

    }
    public void inWhatActivityisTheStudent(){

        isinIntcon = true;
        if(isPlanIntermedio||isPlanIntermedioFromDb){
            isPlanIntermedioStandard=true;
        }

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
                VocabModeloPersistencia(Arrays.asList(temp),isInVocab,
                isInStructure,isInSpanishInt,
                isInCulture,isInPrager,isInTransition,isinIntcon,
                isPlanIntermedioStandard,isPlanBasicRecommended,
                isCustomPlan,isListeningPlan,isAdvancedPlan
        );
        uid.document("WhereisStudent").set(user);

    }
    public void SubtractSelectionAndSendinfoToDb(){
        if(temp.length==1){
            // si queda nada de arrays cambia de vocab a estructura
            isBasicStructures=true;
            if(AdvancedPlan||AdvancedPlanFromDb){
                DialogueBox("Pasar Con Maestro Para Determinar tu Nivel?");

            }else {
                Intent intent = new Intent(ConInt2023.this,MainActivity.class);
                startActivity(intent);
            }

        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
            if(temp.length==1){
                // si queda nada de arrays cambia de vocab a estructura
                isBasicStructures=true;
                if(AdvancedPlan||AdvancedPlanFromDb){
                    DialogueBox("Pasar Con Maestro Para Determinar tu Nivel?");

                }else {
                    Intent intent = new Intent(ConInt2023.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        }
    }
    public void resetCounter(){
        CounterToSubtractSelection=0;
        Toast.makeText(this, "Counter re-set"+String.valueOf(CounterToSubtractSelection), Toast.LENGTH_SHORT).show();

    }
    public void DialogueBox(String message)   {   AlertDialog alertDialog = new AlertDialog.Builder(this)
//set icon
            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
            .setTitle("Definición: ")
//set message
            .setMessage(message)
//set positive button
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(message.equalsIgnoreCase("Pasar Con Maestro Para Determinar tu Nivel?"))
                    { Intent intent = new Intent(ConInt2023.this,chat_maestro.class);
                        startActivity(intent);
                    }else {
                        SubtractSelectionAndSendinfoToDb();
                        resetCounter();
                        PremiumAndArrayControler();
                    }


                }
            })
//set negative button
            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //set what should happen when negative button is clicked

                }
            })
            .show();}

    //EMPIEZA ACTIVIDAD

    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        //USUARIO PREMIUM
        if(prefs.getPremium()==1){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rachel, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(adapter);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spin.getSelectedItem().toString();
                    textspin1.setText(selection);

                    explanation = false;
                    spinnerSelected();
                    /*limpiar_inputs();
                    set_ans();*/
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if(i==tts.SUCCESS){
                        int lang = tts.setLanguage(Locale.ENGLISH);
                    }
                }
            });
            //USUARIO BASICO
        } else if(prefs.getPremium()==0){
            ArrayAdapter<CharSequence > adapter = ArrayAdapter.createFromResource(this, R.array.rachel ,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(adapter);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    selection = spin.getSelectedItem().toString();
                    textspin1.setText(selection);


                    explanation = false;
                    spinnerSelected();
                    /*limpiar_inputs();
                    set_ans();*/
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if(i==tts.SUCCESS){
                        int lang = tts.setLanguage(Locale.ENGLISH);
                    }
                }
            });
        }
    }

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected(){
        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);

        VideoPlayer video_player = new VideoPlayer();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        args.putBoolean("explicacion", explanation);
        args.putString("video", (String) Rachel[posSele][posKeyWord][1]);
        args.putString("videouno", (String) Rachel[posSele][posKeyWord][1]);
        args.putString("videodos", (String) Rachel[posSele][posKeyWord][2]);
        args.putBoolean("videoShow", videoShow);

        video_player.setArguments(args);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();

        if(selection.equals("Tutorial")){
            spanishsentence.setText("Seleccione una estructura para continuar con la practica");
            btn_ver_exp.setVisibility(View.GONE);
            btn_check_ans.setVisibility(View.GONE);
            btn_show_ans.setVisibility(View.GONE);
            answer_lay.setVisibility(View.GONE);
            input_lay.setVisibility(View.GONE);
            btn_salt_exp.setVisibility(View.GONE);
        }else {
            spanishsentence.setVisibility(View.VISIBLE);
            btn_ver_exp.setVisibility(View.GONE);
            answer_lay.setVisibility(View.GONE);
            input_lay.setVisibility(View.GONE);
            btn_salt_exp.setVisibility(View.VISIBLE);
            videoPlayer();
        }
    }
    public void activaSpinner(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }

    public void videoPlayer(){
        btn_check_ans.setVisibility(View.GONE);
        btn_show_ans.setVisibility(View.GONE);
        if(explanation == false & clipMuestra == true){

            spanishsentence.setText("Pon atencion al clip a continuacion y cuando termine haz click en empezar practica.");
            txt_salt_btn.setText("Empezar Practica");

            btn_salt_exp.setOnClickListener(view -> {
                explanation = true;
                clipMuestra = false;
                setKeywordAndPosition();
                saltarExp(explanation);
            });
        }

        if(explanation == true & clipMuestra == false){
            spanishsentence.setText("Pon atencion a la siguiente frase a continuacion y cuando termine escribe lo que entendiste.");
            btn_salt_exp.setVisibility(View.GONE);
            input_lay.setVisibility(View.VISIBLE);

            btn_check_ans.setVisibility(View.VISIBLE);
            btn_show_ans.setVisibility(View.VISIBLE);
        }
    }

    public void saltarExp(Boolean explanation){
        VideoPlayer video_player = new VideoPlayer();
        Bundle args = new Bundle();
        args.putBoolean("explicacion", explanation);
        video_player.setArguments(args);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();



        spinnerSelected();
    }

    boolean videoShow;

    public void activarVideo(Boolean videoShow){
        spinnerSelected();
    };

    public void verClip(View v){
        videoShow = false;
        activarVideo(videoShow);
    }

    public void verClip(){
        videoShow = false;
        activarVideo(videoShow);
    }

    public void verExp(View v){
        videoShow = true;
        activarVideo(videoShow);
    }

    //SELECCIONA LA PALABRA A BUSCAR
    public void setKeywordAndPosition(){
        spanishsentence.setVisibility(View.VISIBLE);
        
        String keyWord;
        String numbertext = String.valueOf(posKeyWord+1);
        txtclip.setText(numbertext);
        switch (selection){
            case "Steve Jobs 1":
                posSele = 0;
                keyWord = (String) Rachel[posSele][posKeyWord][0];
                setKeyWordToCulture(keyWord);
                break;
            case "Steve Jobs 2":
                posSele = 1;
                keyWord = (String) Rachel[posSele][posKeyWord][0];
                setKeyWordToCulture(keyWord);
                break;
            case "Kot Fishing 1":
                posSele = 2;
                keyWord = (String) Rachel[posSele][posKeyWord][0];
                setKeyWordToCulture(keyWord);
                break;

            case "Kot Fishing 2":
                posSele = 3;
                keyWord = (String) Rachel[posSele][posKeyWord][0];
                setKeyWordToCulture(keyWord);
                break;
            case "Helicoptero 1":
                posSele = 4;
                keyWord = (String) Rachel[posSele][posKeyWord][0];
                setKeyWordToCulture(keyWord);
                break;
            case "Helicoptero 2":
                posSele = 5;
                keyWord = (String) Rachel[posSele][posKeyWord][0];
                setKeyWordToCulture(keyWord);
                break;
        }
    }

    //VALIDACIONES DEL TIEMPO Y SI TERMINO LA LISTA DE PAlABRAS CLAVE
    public void setKeyWordToCulture(String keyWord){
        txteng.setText(keyWord);
        int limit = Rachel[posSele].length;
        //CHEQUEAR RESPUESTA
        btn_check_ans.setOnClickListener(view -> {
            String ans = answerinput1.getText().toString();
            if (ans.equalsIgnoreCase(keyWord)) {
                answer_lay.setVisibility(View.GONE);
                input_lay_back.setBackgroundColor(Color.parseColor("#E6FBEB"));
                if(posKeyWord >= limit-1){
                    speakPass(true);
                    cleanInput();
                }else{
                    speakPass(rachelfinish);
                    passToNext();
                    verClip();
                }
            } else {
                input_lay_back.setBackgroundColor(Color.parseColor("#FEE6E6"));
                answer_lay.setVisibility(View.VISIBLE);
                btn_ver_exp.setVisibility(View.VISIBLE);
                speak();
            }

        });
    }
    Boolean showActive = false;

    public void passToNext(){
        posKeyWord++;
        cleanInput();
        setKeywordAndPosition();
    }

    public void cleanInput(){
        input_lay_back.setBackgroundColor(Color.WHITE);
        answerinput1.setText("");
        btn_ver_exp.setVisibility(View.GONE);
    }

    public void decir(View v){
        iniciarentradavoz();
    }

    public void showAns(View v){

        if(showActive == false){
            answer_lay.setVisibility(View.VISIBLE);
            showActive = true;
        }else{
            answer_lay.setVisibility(View.GONE);
            showActive = false;
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

    public void speak(View vista){
        String keyWord = (String) Rachel[posSele][posKeyWord][0];
        tts.speak(keyWord, TextToSpeech.QUEUE_ADD, null);
    }

    public void speak(){
        String keyWord = (String) Rachel[posSele][posKeyWord][0];
        tts.speak("Answer Incorrect the answer is: "+keyWord, TextToSpeech.QUEUE_ADD, null);
    }

    public void speakPass(boolean rachelfinish){
        if(rachelfinish == false){
            tts.speak("excellent. let's try with another one.Click on the video to see the clip", TextToSpeech.QUEUE_ADD, null);
        }else{
            tts.speak("excellent. you finish: "+selection+", now continue with other.", TextToSpeech.QUEUE_ADD, null);
            spin.setSelection(0);
        }
    }



    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    answerinput1.setText(result.get(0));
                }
                break;
        }

    }

}