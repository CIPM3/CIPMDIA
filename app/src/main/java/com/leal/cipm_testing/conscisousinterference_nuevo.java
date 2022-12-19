package com.leal.cipm_testing;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class conscisousinterference_nuevo extends AppCompatActivity {

    VideoView vv;
    //ss
    LinearLayout vf, mic_1,pass_1,inc_1, mic_2,pass_2,inc_2
            , mic_3,pass_3,inc_3, mic_4,pass_4,inc_4
            , mic_5,pass_5,inc_5;
    LinearLayout lay_resp_1,lay_resp_2,lay_resp_3,lay_resp_4,lay_resp_5;
    LinearLayout respescu_1,respescu_2,respescu_3,respescu_4,respescu_5;
    EditText eng_1,eng_2,eng_3,eng_4,eng_5;
    String selection;
    TextView txt1;
    Spinner spin;
    EditText ai1, ai2, ai3, ai4, ai5;
    String r1, r2, r3, r4, r5;
    String temp1 ,temp2, temp3, temp4, temp5;
    TextToSpeech tts;
    int control;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    private ImageButton botonhablar;
    boolean personalizedPlan,isCustom;
    boolean isInVocab,isInStructure,
            isInSpanishInt,isInCulture,isInPrager,isInTransition,isinIntcon,isBasicStructures;
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
    Prefs prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conscisousinterference_nuevo);
        vv = findViewById(R.id.vv);
        vf = findViewById(R.id.vf);
        spin = findViewById(R.id.spin1);
        txt1 = findViewById(R.id.txt1);
        ai1 = findViewById(R.id.ai1);
        ai2 = findViewById(R.id.ai2);
        ai3 = findViewById(R.id.ai3);
        ai4 = findViewById(R.id.ai4);
        ai5 = findViewById(R.id.ai5);

        mic_1 = findViewById(R.id.mic_1);
        mic_2 = findViewById(R.id.mic_2);
        mic_3 = findViewById(R.id.mic_3);
        mic_4 = findViewById(R.id.mic_4);
        mic_5 = findViewById(R.id.mic_5);

        pass_1 = findViewById(R.id.pass_1);
        pass_2 = findViewById(R.id.pass_2);
        pass_3 = findViewById(R.id.pass_3);
        pass_4 = findViewById(R.id.pass_4);
        pass_5 = findViewById(R.id.pass_5);

        inc_1 = findViewById(R.id.inc_1);
        inc_2 = findViewById(R.id.inc_2);
        inc_3 = findViewById(R.id.inc_3);
        inc_4 = findViewById(R.id.inc_4);
        inc_5 = findViewById(R.id.inc_5);

        lay_resp_1 = findViewById(R.id.lay_resp_1);
        lay_resp_2 = findViewById(R.id.lay_resp_2);
        lay_resp_3 = findViewById(R.id.lay_resp_3);
        lay_resp_4 = findViewById(R.id.lay_resp_4);
        lay_resp_5 = findViewById(R.id.lay_resp_5);

        eng_1 = findViewById(R.id.eng_1);
        eng_2 = findViewById(R.id.eng_2);
        eng_3 = findViewById(R.id.eng_3);
        eng_4 = findViewById(R.id.eng_4);
        eng_5 = findViewById(R.id.eng_5);

        respescu_1 = findViewById(R.id.respescu_1);
        respescu_2 = findViewById(R.id.respescu_2);
        respescu_3 = findViewById(R.id.respescu_3);
        respescu_4 = findViewById(R.id.respescu_4);
        respescu_5 = findViewById(R.id.respescu_5);
        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();

        prefs= new Prefs(this);
        PremiumAndArrayControler();


    }

    public void PremiumAndArrayControler(){

        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
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
                            txt1.setText(selection);

                            vf.setVisibility(View.VISIBLE);
                            vv.setVisibility(View.GONE);

                            limpiar_inputs();
                            set_ans();
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
                            temp= vmp.resultArray.toArray(new String[0]);
                            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(conscisousinterference_nuevo.this, R.array.rachel, android.R.layout.simple_spinner_item);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    txt1.setText(selection);

                                    vf.setVisibility(View.VISIBLE);
                                    vv.setVisibility(View.GONE);

                                    limpiar_inputs();
                                    set_ans();
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
                            txt1.setText(selection);

                            vf.setVisibility(View.VISIBLE);
                            vv.setVisibility(View.GONE);

                            limpiar_inputs();
                            set_ans();
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
                            txt1.setText(selection);

                            vf.setVisibility(View.VISIBLE);
                            vv.setVisibility(View.GONE);

                            limpiar_inputs();
                            set_ans();
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
            if(prefs.getPremium()==1){
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rachel, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();
                        txt1.setText(selection);

                        vf.setVisibility(View.VISIBLE);
                        vv.setVisibility(View.GONE);

                        limpiar_inputs();
                        set_ans();
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
            } else if(prefs.getPremium()==0){
                ArrayAdapter<CharSequence > adapter = ArrayAdapter.createFromResource(this, R.array.rachel ,android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();
                        txt1.setText(selection);

                        vf.setVisibility(View.VISIBLE);
                        vv.setVisibility(View.GONE);

                        limpiar_inputs();
                        set_ans();
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

    }
    public void inWhatActivityisTheStudent(){

        isinIntcon = true;


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
                VocabModeloPersistencia(Arrays.asList(temp),isInVocab,isInStructure,isInSpanishInt,
                isInCulture,isInPrager,isInTransition,isinIntcon
        );
        uid.document("WhereisStudent").set(user);

    }
    public void SubtractSelectionAndSendinfoToDb(){
        if(temp.length==1){
            // si queda nada de arrays cambia de vocab a estructura
            isBasicStructures=true;
            Intent intent = new Intent(conscisousinterference_nuevo.this,MainActivity.class);
            intent.putExtra("isThePlanPersonalized",personalizedPlan);
            intent.putExtra("basicSctructures",isBasicStructures );
            startActivity(intent);
        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
        }
    }
    public void checkA(View view) {
        condicionParaPasarEs(5);
        switch (control){
            case 1:
                temp1 = ai1.getText().toString();
                if (temp1.equalsIgnoreCase(r1)) {
                    ai1.setBackgroundColor(Color.parseColor("#E6FBEB"));
                    pass_1.setVisibility(View.VISIBLE);
                    inc_1.setVisibility(View.GONE);
                    mic_1.setVisibility(View.GONE);
                    lay_resp_1.setVisibility(View.GONE);
                    increaseCounter();

                } else {
                    ai1.setBackgroundColor(Color.parseColor("#FEE6E6"));
                    pass_1.setVisibility(View.GONE);
                    inc_1.setVisibility(View.VISIBLE);
                    // mic_1.setVisibility(View.GONE);
                    lay_resp_1.setVisibility(View.VISIBLE);
                }
                break;

            case 2:
                temp2 = ai2.getText().toString();
                if (temp2.equalsIgnoreCase(r2)) {
                    ai2.setBackgroundColor(Color.parseColor("#E6FBEB"));
                    pass_2.setVisibility(View.VISIBLE);

                    inc_2.setVisibility(View.GONE);
                    mic_2.setVisibility(View.GONE);

                    lay_resp_2.setVisibility(View.GONE);
                    increaseCounter();
                } else {
                    ai2.setBackgroundColor(Color.parseColor("#FEE6E6"));
                    pass_2.setVisibility(View.GONE);

                    inc_2.setVisibility(View.VISIBLE);
                    mic_2.setVisibility(View.GONE);

                    lay_resp_2.setVisibility(View.VISIBLE);
                }
                break;

            case 3:
                temp3 = ai3.getText().toString();
                if (temp3.equalsIgnoreCase(r3)) {
                    ai3.setBackgroundColor(Color.parseColor("#E6FBEB"));
                    pass_3.setVisibility(View.VISIBLE);

                    inc_3.setVisibility(View.GONE);
                    mic_3.setVisibility(View.GONE);

                    lay_resp_3.setVisibility(View.GONE);
                    increaseCounter();
                } else {
                    ai3.setBackgroundColor(Color.parseColor("#FEE6E6"));
                    pass_3.setVisibility(View.GONE);

                    inc_3.setVisibility(View.VISIBLE);
                    mic_3.setVisibility(View.GONE);

                    lay_resp_3.setVisibility(View.VISIBLE);
                }
                break;

            case 4:
                temp4 = ai4.getText().toString();
                if (temp4.equalsIgnoreCase(r4)) {
                    ai4.setBackgroundColor(Color.parseColor("#E6FBEB"));
                    pass_4.setVisibility(View.VISIBLE);

                    inc_4.setVisibility(View.GONE);
                    mic_4.setVisibility(View.GONE);

                    lay_resp_4.setVisibility(View.GONE);
                    increaseCounter();
                } else {
                    ai4.setBackgroundColor(Color.parseColor("#FEE6E6"));
                    pass_4.setVisibility(View.GONE);

                    inc_4.setVisibility(View.VISIBLE);
                    mic_4.setVisibility(View.GONE);

                    lay_resp_4.setVisibility(View.VISIBLE);
                }

                break;

            case 5:
                temp5 = ai5.getText().toString();
                if (temp5.equalsIgnoreCase(r5)) {
                    ai5.setBackgroundColor(Color.parseColor("#E6FBEB"));
                    pass_5.setVisibility(View.VISIBLE);

                    inc_5.setVisibility(View.GONE);
                    mic_5.setVisibility(View.GONE);

                    lay_resp_5.setVisibility(View.GONE);
                    increaseCounter();
                } else {
                    ai5.setBackgroundColor(Color.parseColor("#FEE6E6"));
                    pass_5.setVisibility(View.GONE);

                    inc_5.setVisibility(View.VISIBLE);
                    mic_5.setVisibility(View.GONE);

                    lay_resp_5.setVisibility(View.VISIBLE);
                }

                break;
        }

    }

    public void condicionParaPasarEs(int condicionNumber){
        if(CounterToSubtractSelection==condicionNumber){
            DialogueBox("Cambiar de Video y seguir a siguiente clase?");
        }
    }
    public void increaseCounter(){
        CounterToSubtractSelection= ++CounterToSubtractSelection;
        Toast.makeText(this, "increase counter called "+String.valueOf(CounterToSubtractSelection), Toast.LENGTH_SHORT).show();
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
                    SubtractSelectionAndSendinfoToDb();
                    resetCounter();
                    PremiumAndArrayControler();

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



    public void showv(View vista) {
        vf.setVisibility(View.GONE);
        vv.setVisibility(View.VISIBLE);

        switch (selection) {

            case "Tutorial":
                // video completo con los 5 diferentes temas
                Uri urit = Uri.parse("https://adrianlealcaldera.com/intconttut.mp4");
                vv.setVideoURI(urit);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                //clickbb1();
                break;
            case "Steve Jobs 1":
                // video completo con los 5 diferentes temas
                Uri uri = Uri.parse("http://adrianlealcaldera.com/billburrstevejobsclip1.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                //clickbb1();
                break;

                //PD
            case "Kot Fishing 1":
                // video completo con los 5 diferentes temas
                Uri urik1 = Uri.parse("http://adrianlealcaldera.com/kotfishing1Clip.mp4");
                vv.setVideoURI(urik1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                //clickbb1();
                break;

            case "Kot Fishing 2":
                // video completo con los 5 diferentes temas
                Uri urik2 = Uri.parse("https://adrianlealcaldera.com/kotfishing2Clip.mp4");
                vv.setVideoURI(urik2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                //clickbb1();
                break;

                //LUIS
            case "Helicoptero 1":
                // video completo con los 5 diferentes temas
                Uri urik3 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Clip.mp4");
                vv.setVideoURI(urik3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                //clickbb1();
                break;

            case "Helicoptero 2":
                // video completo con los 5 diferentes temas
                Uri urik4 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Clip.mp4");
                vv.setVideoURI(urik4);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();

                //clickbb1();
                break;

        }
    }
    public void set_ans(){

        switch (selection){
            case "Tutorial":
                break;
            case "Steve Jobs 1":
                r1 = "actually nerd jesus died in the last year right steve jobs";
                r2 = "yeah he died right i know i know a lot of nerds here tonight";
                r3 = "i know you sad";
                r4 = "I didn't get it";
                r5 = "I didn't get the big deal they made about that guy";
                break;

            case "Steve Jobs 2":
                r1 = "Prueba";
                r2 = "Prueba 2";
                r3 = "Prueba 3";
                r4 = "Prueba 4";
                r5 = "Prueba 5";
                break;

            case "Kot Fishing 1":
                r1 = "Come on frank fish or get off the pot";
                r2 = "just a second how the heck does jack fish with this stuff";
                r3 = "i like beer don't you like beek i mean i love beer";
                r4 = "I just got one sweet jean vicent, i'm back";
                r5 = "that was quick talking about hank's the man damn go fishing magician";
                break;

            case "Kot Fishing 2":
                r1 = "looks like they're hungry for worms today pass me one, will you hank";
                r2 = "what's the matter batteries go dead on your electric spinner";
                r3 = "Wo hank what you got there, blood dough balls";
                r4 = "hank only fishes with worms why anything else would be cheating";
                break;

            //LUIS
            case "Helicoptero 1":
                r1 = "I saw this story down in Orange County, Orange County, California in the sky. This guy gave helicopter your for 30 years, 30 years without incident.";
                r2 = "Hands the business off to his son, the American dream. “I built it up for 30 years. Here you go, son. Make the family and the family name proud.” ”All right, Dad, I love you.”";
                r3 = "All right? This poor kid, five days in, he’s supposed to give a tour to a couple, only the dude shows up.";
                r4 = "The kid thought it was weird, but he’s like, “I need the money. I gotta give him a tour.” Right? So he takes this guy up. Ten minutes into the tour, the dude fucking jumped out.";
                break;

            case "Helicoptero 2":
                r1 = "Yeah, five days in. Five days in from the balloons and the cake. “We love you, son. Keep the family tree going. The traditional line.”";
                r2 = "Five fucking days later, this kid, he probably barely had the speech down. Just sitting there, flying the helicopter.";
                r3 = "All right, if you look out the left side of the aircraft, that’s Orange County. There’s over 27 miles of beaches there. Put your seatbelt back on, 27 miles of beaches.";
                r4 = "Was established as a county in 1903. Sir, please don’t open the door. Sir, what are you doing? Sir, no, no. Don’t";
                break;
        }

        eng_1.setText(r1);
        eng_2.setText(r2);
        eng_3.setText(r3);
        eng_4.setText(r4);
        eng_5.setText(r5);
    }
    public void show_aud(){
        switch (selection){
            case "Tutorial":
                break;
            case "Steve Jobs 1":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri1 = Uri.parse("http://adrianlealcaldera.com/bb1.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("http://adrianlealcaldera.com/bb2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("http://adrianlealcaldera.com/bb3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("http://adrianlealcaldera.com/bb4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri5 = Uri.parse("http://adrianlealcaldera.com/bb5.mp4");
                        vv.setVideoURI(uri5);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;

            case "Kot Fishing 1":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri1 = Uri.parse("https://adrianlealcaldera.com/KothFishing1Clip1.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/KothFishing1Clip2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/KothFishing1Clip3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/KothFishing1Clip4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri5 = Uri.parse("https://adrianlealcaldera.com/KothFishing1Clip5.mp4");
                        vv.setVideoURI(uri5);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;
            case "Kot Fishing 2":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri1 = Uri.parse("https://adrianlealcaldera.com/KothFishing2Clip1.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/KothFishing2Clip2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/KothFishing2Clip3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/KothFishing2Clip4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;

            case "Helicoptero 1":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri1 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Clip1.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Clip2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Clip3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Clip4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Toast.makeText(this, "Aqui ya no hay nada solo 4 clips", Toast.LENGTH_SHORT).show();

                        break;
                }
                break;
            case "Helicoptero 2":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri1 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Clip1.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Clip2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Clip3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Clip4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Toast.makeText(this, "Aqui ya no hay nada solo 4 clips", Toast.LENGTH_SHORT).show();

                        break;
                }
                break;
        }
    }
    public void showExp() {
        switch (selection) {
            case "Steve Jobs 1":
                switch (control) {
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri = Uri.parse("http://adrianlealcaldera.com/expbb1.mp4");
                        vv.setVideoURI(uri);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri1 = Uri.parse("http://adrianlealcaldera.com/expbb2.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("http://adrianlealcaldera.com/expbb3.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;

                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("http://adrianlealcaldera.com/expbb4.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("http://adrianlealcaldera.com/expbb5.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;

            case "Kot Fishing 1":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri = Uri.parse("https://adrianlealcaldera.com/kotfishing1Exp1.mp4");
                        vv.setVideoURI(uri);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/kotfishing1Exp2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/kotfishing1Exp3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/kotfishing1Exp4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri5 = Uri.parse("https://adrianlealcaldera.com/kotfishing1Exp5.mp4");
                        vv.setVideoURI(uri5);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;
            case "Kot Fishing 2":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri = Uri.parse("https://adrianlealcaldera.com/kotfishing2exp1.mp4");
                        vv.setVideoURI(uri);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/kotfishing2exp2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/kotfishing2exp3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/kotfishing2exp4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;

                //LUIS
            case "Helicoptero 1":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Exp1.mp4");
                        vv.setVideoURI(uri);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Exp2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Exp3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/Helicoptero1Exp4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;
            case "Helicoptero 2":
                switch (control){
                    case 1:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Exp1.mp4");
                        vv.setVideoURI(uri);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Exp2.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri3 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Exp3.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 4:
                        Toast.makeText(this, "Cargando video porfavor espere", Toast.LENGTH_SHORT).show();
                        Uri uri4 = Uri.parse("https://adrianlealcaldera.com/Helicoptero2Exp4.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;
        }
    }
    public void showAnswers(View view) {
        switch (control) {
            case 1:
                ai1.setText(r1);
                break;

            case 2:
                ai2.setText(r2);
                break;

            case 3:
                ai3.setText(r3);
                break;

            case 4:
                ai4.setText(r4);
                break;

            case 5:
                ai5.setText(r5);
                break;
        }
    }
    public void hablar1(View vista){
        control = 1;
        iniciarentradavoz();
    }
    public void hablar2(View vista){
        control = 2;
        iniciarentradavoz();
    }
    public void hablar3(View vista){
        control = 3;
        iniciarentradavoz();
    }
    public void hablar4(View vista){
        control = 4;
        iniciarentradavoz();
    }
    public void hablar5(View vista){
        control = 5;
        iniciarentradavoz();
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
    public void show_aud_1(View vista){
        control = 1;
        show_aud();
    }
    public void show_aud_2(View vista){
        control = 2;
        show_aud();
    }
    public void show_aud_3(View vista){
        control = 3;
        show_aud();
    }
    public void show_aud_4(View vista){
        control = 4;
        show_aud();
    }
    public void show_aud_5(View vista){
        control = 5;
        show_aud();
    }
    public void showexp1(View vista){
        control = 1;
        showExp();
    }
    public void showexp2(View vista){
        control = 2;
        showExp();
    }
    public void showexp3(View vista){
        control = 3;
        showExp();
    }
    public void showexp4(View vista){
        control = 4;
        showExp();
    }
    public void showexp5(View vista){
        control = 5;
        showExp();
    }
    public void speak1(View vista){

        tts.speak(r1, TextToSpeech.QUEUE_ADD, null);
    }
    public void speak2(View vista){
        tts.speak(r2, TextToSpeech.QUEUE_ADD, null);
    }
    public void speak3(View vista){
        tts.speak(r3, TextToSpeech.QUEUE_ADD, null);
    }
    public void speak4(View vista){
        tts.speak(r4, TextToSpeech.QUEUE_ADD, null);
    }
    public void speak5(View vista){
        tts.speak(r5, TextToSpeech.QUEUE_ADD, null);
    }
    public void limpiar_inputs(){
        ai1.setText("");
        ai2.setText("");
        ai3.setText("");
        ai4.setText("");
        ai5.setText("");

        ai1.setBackgroundColor(Color.WHITE);
        ai2.setBackgroundColor(Color.WHITE);
        ai3.setBackgroundColor(Color.WHITE);
        ai4.setBackgroundColor(Color.WHITE);
        ai5.setBackgroundColor(Color.WHITE);

        pass_1.setVisibility(View.GONE);
        pass_2.setVisibility(View.GONE);
        pass_3.setVisibility(View.GONE);
        pass_4.setVisibility(View.GONE);
        pass_5.setVisibility(View.GONE);

        inc_1.setVisibility(View.GONE);
        inc_2.setVisibility(View.GONE);
        inc_3.setVisibility(View.GONE);
        inc_4.setVisibility(View.GONE);
        inc_5.setVisibility(View.GONE);

        mic_1.setVisibility(View.VISIBLE);
        mic_2.setVisibility(View.VISIBLE);
        mic_3.setVisibility(View.VISIBLE);
        mic_4.setVisibility(View.VISIBLE);
        mic_5.setVisibility(View.VISIBLE);

        lay_resp_1.setVisibility(View.GONE);
        lay_resp_2.setVisibility(View.GONE);
        lay_resp_3.setVisibility(View.GONE);
        lay_resp_4.setVisibility(View.GONE);
        lay_resp_5.setVisibility(View.GONE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    switch (control) {
                        case 1:
                            ai1.setText(result.get(0));
                            break;
                        case 2:
                            ai2.setText(result.get(0));
                            break;
                        case 3:
                            ai3.setText(result.get(0));
                            break;
                        case 4:
                            ai4.setText(result.get(0));
                            break;
                        case 5:
                            ai5.setText(result.get(0));
                            break;
                    }

                    // checkanswer();
                    //dificulty2();


                }
                break;
        }

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

    public void mideTuNivel(View view) {
        Toast.makeText(this, "mide tu nivel cons", Toast.LENGTH_SHORT).show();
    }
}