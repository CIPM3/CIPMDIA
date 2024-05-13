package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class Cultura2023 extends AppCompatActivity{


    int counterDb;

    Spinner spin;
    TextView textspin1,text_btn;
    TextView text_exp,text_key_word;
    LinearLayout txt_exp_est,lay_btn_empezar,lay_btn_emp,lay_btn_salt,lay_btn_get,lay_key_word;
    TextToSpeech tts;
    Prefs prefs;
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    String[] ArrayWithElementRemoved;
    FirebaseAuth mAuth=FirebaseAuth.getInstance();
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp =objetoArrays.culturaGratis;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    boolean getposActivated;
    int intentos = 0;
    public String selection;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    //DB
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan;
    boolean personalizedPlan,isCustom;
    int PositionOfElementsLeft=0;
    int PositionOfSelection;
    int CounterToSubtractSelection=0;
    boolean BasicListeningPlanFromDb,StandardBasicPlan,BasicListeningPlan;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,
            isInTransition,isinIntcon;

    int posKeyword = 0,posSele = 0;
    boolean explanation,clipMuestra;
    VideoPlayer fragment = new VideoPlayer();
    CollectionReference uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura2023);
        spin = findViewById(R.id.spinuno);
        textspin1 = findViewById(R.id.textspin1);
        txt_exp_est = findViewById(R.id.txt_exp_est);
        lay_btn_empezar = findViewById(R.id.lay_btn_empezar);
        lay_btn_empezar.setVisibility(View.INVISIBLE);
        text_exp = findViewById(R.id.text_exp);
        text_btn = findViewById(R.id.text_btn);
        text_key_word = findViewById(R.id.text_key_word);
        lay_btn_emp = findViewById(R.id.lay_btn_emp);
        lay_btn_salt = findViewById(R.id.lay_btn_salt);
        lay_btn_get = findViewById(R.id.lay_btn_get);
        lay_key_word = findViewById(R.id.lay_key_word);
        explanation = false;
        clipMuestra = true;

        prefs = new Prefs(this);
        CounterToSubtractSelection=1;
        userid = mAuth.getCurrentUser().getUid();
        docref= db.collection(userid).document("WhereisStudent");
        uid= db.collection(userid);
        loadRewardedAd();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5,fragment)
                .commit();

        Bundle args = new Bundle();
        args.putString("tema", selection);
        args.putBoolean("explicacion", explanation);
        args.putBoolean("explicacion", explanation);
        args.putString("video", (String) KeyWordsObject[posSele][posKeyword][3]);
        fragment.setArguments(args);

        PremiumAndArrayControler();

    }

    //DB FUNCTIONS
    private void PremiumAndArrayControler()  {
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        BasicListeningPlan= reciver.getBooleanExtra("BasicListeningPlan",false);

        //estas tres de abajo vienen dela db
        BasicListeningPlanFromDb=reciver.getBooleanExtra("FromListening",false);
        StandardBasicPlan=reciver.getBooleanExtra("FromBasicRecomended",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);


        if(personalizedPlan){
            if(isCustom){
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=documentSnapshot.toObject(VocabModeloPersistencia.class );
                            assert vmp != null;
                            temp= vmp.getResultArray().toArray(new String[0]);
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Cultura2023.this, android.R.layout.simple_list_item_1,temp);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    textspin1.setText(selection);
                                    PositionOfSelection=i;
                                    spinnerSelected();
                                   /* vf.setVisibility(View.VISIBLE);
                                    vv.setVisibility(View.GONE);
                                    lay_txt.setVisibility(View.GONE);
                                    txt_exp.setVisibility(View.VISIBLE);*/
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                        }
                    }) ;

                } else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user
                    docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            vmp=documentSnapshot.toObject(VocabModeloPersistencia.class );
                            assert vmp != null;
                            temp= vmp.getResultArray().toArray(new String[0]);
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Cultura2023.this, android.R.layout.simple_list_item_1,temp);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spin.setAdapter(adapter);
                            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    selection = spin.getSelectedItem().toString();
                                    textspin1.setText(selection);
                                    PositionOfSelection=i;
                                    spinnerSelected();
                                   /* vf.setVisibility(View.VISIBLE);
                                    vv.setVisibility(View.GONE);
                                    lay_txt.setVisibility(View.GONE);
                                    txt_exp.setVisibility(View.VISIBLE);*/
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                        }
                    }) ;



                }
            }else {

                // esto quiere decir que esta en plan personalizado pero va empezando, osea, no hay un array empezado
                // que se haya mandado a base de datos y traido de vuelta
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(Cultura2023.this, android.R.layout.simple_list_item_1,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);
                            spinnerSelected();
                           /* vf.setVisibility(View.VISIBLE);
                            vv.setVisibility(View.GONE);
                            lay_txt.setVisibility(View.GONE);
                            txt_exp.setVisibility(View.VISIBLE);*/
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


                } else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user+
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(Cultura2023.this, android.R.layout.simple_list_item_1,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);
                            PositionOfSelection=i;
                            spinnerSelected();

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
        else {
            checkPremiun();
        }

    }
    public void inWhatActivityisTheStudent() {

        isInCulture = true;
        if(BasicListeningPlan || BasicListeningPlanFromDb){
            isListeningPlan=true;
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
        if(temp.length==10){

            if(BasicListeningPlan || BasicListeningPlanFromDb ){
                Intent intent = new Intent(Cultura2023.this, Estructura2023.class);
                intent.putExtra("isThePlanPersonalized",personalizedPlan);
                intent.putExtra("basicSctructures",true);
                intent.putExtra("BasicListeningPlan",BasicListeningPlan || BasicListeningPlanFromDb);
                startActivity(intent);
            }else{
                Intent intent = new Intent(Cultura2023.this, ConInt2023.class);
                intent.putExtra("isThePlanPersonalized",personalizedPlan);
                startActivity(intent);
            }


        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(temp[PositionOfSelection]);
           // temp = RemoveApprovedElementFromArray(temp[PositionOfSelection-1]);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
            if(temp.length==1){

                if(BasicListeningPlan || BasicListeningPlanFromDb ){
                    Intent intent = new Intent(Cultura2023.this,Estructura2023.class);
                    intent.putExtra("isThePlanPersonalized",personalizedPlan);
                    intent.putExtra("basicSctructures",true);
                    intent.putExtra("BasicListeningPlan",BasicListeningPlan || BasicListeningPlanFromDb);

                    startActivity(intent);
                }else {
                    Intent intent = new Intent(Cultura2023.this,ConInt2023.class);
                    intent.putExtra("isThePlanPersonalized",personalizedPlan);
                    startActivity(intent);
                }
            }

        }
    }

    boolean isFromLessonPlan;
    String[] classFromLesson = new String[]{"place holder"}   ;

    public void checkPremiun(){
        Intent reciver= getIntent();
        isFromLessonPlan=reciver.getBooleanExtra("typeFromLessonPlan",false);
        classFromLesson= reciver.getStringArrayExtra("class");
       if(isFromLessonPlan){
           if(prefs.getPremium()==1){
               ArrayAdapter<String> adapter = new ArrayAdapter<>(Cultura2023.this, android.R.layout.simple_list_item_1,classFromLesson);

               adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
               spin.setAdapter(adapter);
               spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                   @Override
                   public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                       explanation = false;
                       spinnerSelected();
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
           } else if (prefs.getPremium()==0){

               ArrayAdapter<String> adapter = new ArrayAdapter<>(Cultura2023.this, android.R.layout.simple_list_item_1,classFromLesson);

               adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
               spin.setAdapter(adapter);
               spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                   @Override
                   public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                       explanation = false;
                       spinnerSelected();

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
       }else {
           if(prefs.getPremium()==1){
               ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.culturaPremium2023, android.R.layout.simple_spinner_item);
               adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
               spin.setAdapter(adapter);
               spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                   @Override
                   public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                       explanation = false;
                       spinnerSelected();
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
           } else if (prefs.getPremium()==0){
               //remove user all the premium features
               //show ads to the user
               ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cultura2023, android.R.layout.simple_spinner_item);
               adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
               spin.setAdapter(adapter);
               spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                   @Override
                   public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                       explanation = false;
                       spinnerSelected();

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

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected(){

        selection = spin.getSelectedItem().toString();
        textspin1.setText(selection);
        if(selection.equals("Tutorial")){
            text_exp.setText("Seleccione una estructura para continuar con la practica");
            ocultartodo();
        }else {

            lay_btn_empezar.setVisibility(View.VISIBLE);
            lay_btn_get.setVisibility(View.GONE);
            lay_btn_salt.setVisibility(View.GONE);
            lay_btn_emp.setVisibility(View.VISIBLE);
            lay_key_word.setVisibility(View.GONE);
            explanation = false;
            clipMuestra = true;

            videoPlayer();

        }
        switch (selection){
            case "Moonlight":
                posSele = 0;
                posKeyword=0;
                break;
            case "Rick and Morty":
                posSele = 1;
                posKeyword=0;

                break;

            case "Do You Want Pepsi":
                posSele = 2;
                posKeyword=0;
                break;
            case "Sangre Por Sangre Foodline":
                posSele = 3;
                posKeyword=0;
                break;
            case "Sangre Por Sangre Watch El Paisaje":
                posSele = 4;
                posKeyword=0;
                break;
            case "Training Day Rabbit Has The Gun":
                posSele = 5;
                posKeyword=0;
                break;

            case "Hancock Train":
                posSele = 6;
                posKeyword=0;
                break;

            case "Malcom in the Middle Teacher":
                posSele = 7;
                posKeyword=0;
                break;

            case "Sangre Por Sangre Comedor":
                posSele = 8;
                posKeyword=0;
                break;
            case "Dave Chapelle Man Rape":
                posSele = 9;
                posKeyword=0;
                break;
            case "Análisis de cultura Gringa y Frases Coloquiales 2":
                posSele = 10;
                posKeyword=0;
                break;

            case "Boys in the Hood":
                posSele = 11;
                posKeyword=0;
                break;

            case "Cultura y Fonética":
                posSele = 12;
                posKeyword=0;
                break;

            case "Kings of the Hills Drugs":
                posSele = 13;
                posKeyword=0;
                break;
        }


        VideoPlayer fragment = (VideoPlayer) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView5); // Use the actual container ID

        if (fragment != null) {
            fragment.updateFragmentState(selection, (String) KeyWordsObject[posSele][posKeyword][3], explanation);
        }


    }
    //ACTIVA LA INTERFAZ PARA EL VIDEO
    public void videoPlayer(){
        if(!explanation & clipMuestra){
            lay_btn_emp.setOnClickListener(view -> {
                text_exp.setText("Pon atencion al clip a continuacion y cuando termine haz click en empezar practica.");

               // DialogueBox2("hola alumno, espero hayas visto la escena para agarrar contexto antes de empezar la practica... si no la has visto no hay problema pero es preferente que si");

                dialogueContainer("hola alumno, espero hayas visto la escena para agarrar contexto antes de empezar la practica... si no la has visto no hay problema pero es preferente que si","continuar","no continuar");
            });
        }

        if(explanation & !clipMuestra){
            lay_btn_salt.setVisibility(View.VISIBLE);
            lay_key_word.setVisibility(View.GONE);
            lay_btn_salt.setOnClickListener(view -> {
               DialogueBox3("espero hayas visto la explicación de la frase, por que es la que buscaras a continuación ");
            });
        }

        if(!explanation & !clipMuestra){

            lay_btn_salt.setVisibility(View.GONE);
            lay_btn_get.setVisibility(View.VISIBLE);
            lay_key_word.setVisibility(View.VISIBLE);
            text_exp.setText("da click en el botón de get cuando escuches la frase que estamos buscando");

        }
    }

    public void dialogueContainer(String text,String buttonyes,String buttonno){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);
        textView.setText(text);
        AlertDialog dialog = builder.create();

// Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonyes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                explanation = true;
                clipMuestra = false;
                lay_btn_emp.setVisibility(View.GONE);
                lay_btn_salt.setVisibility(View.VISIBLE);

                saltarExp(explanation);
                dialog.dismiss();


            }
        });
        Button button2 = dialogView.findViewById(R.id.botondialogo2);
        button2.setText(buttonno);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();             }
        });

        dialog.show();

    }


    //SALTA LA EXPLICACION
    public void saltarExp(Boolean explanation){


        VideoPlayer fragment = (VideoPlayer) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView5); // Use the actual container ID
        if (fragment != null) {
            fragment.updateFragmentState(selection, (String) KeyWordsObject[posSele][posKeyword][3], explanation);
        }

        videoPlayer();

    }

    //EL BOTON QUE VALIDA SI ESTAS DENTRO DEL RANGO
    public void getpos(View vista)  {
    getposActivated = true;
        switch (selection){

            case "Moonlight":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }

                setKeywordAndPosition();
                break;
            case "Rick and Morty":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Do You Want Pepsi":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Sangre Por Sangre Foodline":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }

                setKeywordAndPosition();
                break;
            case "Sangre Por Sangre Watch El Paisaje":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }

                setKeywordAndPosition();
                break;
            case "Training Day Rabbit Has The Gun":
                if(personalizedPlan){
                    condicionParaPasarEs(6);
                }
                setKeywordAndPosition();
                break;
            case "Hancock Train":
                if(personalizedPlan){
                    condicionParaPasarEs(7);
                }
                setKeywordAndPosition();
                break;
            case "Malcom in the Middle Teacher":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Sangre Por Sangre Comedor":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Dave Chapelle Man Rape":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Análisis de cultura Gringa y Frases Coloquiales 2":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Boys in the Hood":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Cultura y Fonética":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
            case "Kings of the Hills Drugs":
                if(personalizedPlan){
                    condicionParaPasarEs(5);
                }
                setKeywordAndPosition();
                break;
        }
    }


    //SELECCIONA LA PALABRA A BUSCAR
    int g;
    public void setKeywordAndPosition() {
        lay_key_word.setVisibility(View.VISIBLE);
        g = (int) fragment.player.getCurrentPosition();
        String keyWord;
        int StartTime,StopTime;

        keyWord = (String) KeyWordsObject[posSele][posKeyword][0];
        StartTime = (int) KeyWordsObject[posSele][posKeyword][1];
        StopTime = (int) KeyWordsObject[posSele][posKeyword][2];
        setKeyWordToCulture(g,keyWord,StartTime,StopTime);
    }
    //VALIDACIONES DEL TIEMPO Y SI TERMINO LA LISTA DE PAlABRAS CLAVE
    public void setKeyWordToCulture(int g,String keyWord,int StartTime, int StopTime){
         text_key_word.setText(keyWord);
        int limit = KeyWordsObject[posSele].length;
            SpannableString ss= new SpannableString(keyWord);
            ClickableSpan txtone;
            txtone = new ClickableSpan() {
                @Override
                public void onClick(@NonNull View view) {


                    fragment.goToPosition(StartTime);


                }
            };
            ss.setSpan(txtone,0,keyWord.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
            text_key_word.setText(ss);
            text_key_word.setTextSize(15);
             text_key_word.setMovementMethod(LinkMovementMethod.getInstance());
            if(g> StartTime && g<StopTime) {
                if(posKeyword >= limit-1){
                    speakPass(true);
                    posKeyword=0;
                    if(isFromLessonPlan&&prefs.getPremium()==0){
                        dialogueShowRewardedAd("Ve Anuncio para Desbloquear Siguiente Clase","Ver Anuncio","Cipm Premium");
                    }else if(prefs.getPremium()==1){
                        if(isFromLessonPlan){
                            classSelector();
                            if(placeHolder[0].equals("Done")){
                                Intent intento = new Intent(this,Profile2023.class);
                                startActivity(intento);
                            }else if(placeHolder[0].equals("How to Make Our Cities Safer")||placeHolder[0].equals("How to End Systemic Racism")||placeHolder[0].equals("Should Government Bail Out Big Banks?")) {
                                Intent intent = new Intent(this, Availability2023.class);
                                intent.putExtra("typeFromLessonPlan",true );
                                intent.putExtra("class",placeHolder);
                                startActivity(intent);
                            }else if(placeHolder[0].equals("Dave Chapelle Man Rape")||placeHolder[0].equals("Análisis de cultura Gringa y Frases Coloquiales 2")||placeHolder[0].equals("Cultura y Fonética")||placeHolder[0].equals("Boys in the Hood")||placeHolder[0].equals("Kings of the Hills Drugs")){
                                Intent intent = new Intent(this, Cultura2023.class);
                                intent.putExtra("typeFromLessonPlan",true );
                                intent.putExtra("class",placeHolder);
                                startActivity(intent);
                            }else {
                                Intent intent = new Intent(this, ConInt2023.class);
                                intent.putExtra("typeFromLessonPlan",true );
                                intent.putExtra("class",placeHolder);
                                startActivity(intent);
                            }

                        }else {
                            Toast.makeText(this, "Felicidades! has terminado esta clase", Toast.LENGTH_SHORT).show();
                        }
                    }

                }else{
                    posKeyword++;
                    intentos = 0;
                    explanation = true;
                    saltarExp(explanation);
                    setKeywordAndPosition();
                    speakPass(false);
                    lay_key_word.setVisibility(View.GONE);
                    lay_btn_get.setVisibility(View.GONE);

                }
            } else if (getposActivated){

                getposActivated = false;
                text_key_word.setTextColor(Color.BLUE);
                text_key_word.setBackgroundColor(Color.BLACK);


            }
    }

    //TERMINAS LA PRACTICA Y TE MANDA TUTORIAL


    public void activaSpinner(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }


    //OTRA FUNC
    public void DialogueBox(String message)   {   AlertDialog alertDialog = new AlertDialog.Builder(this)
//set icon
            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
            .setTitle("Definición: ")
//set message
            .setMessage(message)
//set positive button
            .setPositiveButton("pasar a la siguiente clase", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    if(isFromLessonPlan&&prefs.getPremium()==0){

                          dialogueShowRewardedAd("Ve Anuncio para Desbloquear Siguiente Clase","Ver Anuncio","Cipm Premium");

                    }else if(prefs.getPremium()==1){
                        classSelector();
                        if(placeHolder[0].equals("Done")){
                            Intent intento = new Intent(getApplicationContext(),Profile2023.class);
                            startActivity(intento);
                        }else if(placeHolder[0].equals("How to Make Our Cities Safer")||placeHolder[0].equals("How to End Systemic Racism")||placeHolder[0].equals("Should Government Bail Out Big Banks?")) {
                            Intent intent = new Intent(getApplicationContext(), Availability2023.class);
                            intent.putExtra("typeFromLessonPlan",true );
                            intent.putExtra("class",placeHolder);
                            startActivity(intent);
                        }else if(placeHolder[0].equals("Dave Chapelle Man Rape")||placeHolder[0].equals("Análisis de cultura Gringa y Frases Coloquiales 2")||placeHolder[0].equals("Cultura y Fonética")||placeHolder[0].equals("Boys in the Hood")||placeHolder[0].equals("Kings of the Hills Drugs")){
                            Intent intent = new Intent(getApplicationContext(), Cultura2023.class);
                            intent.putExtra("typeFromLessonPlan",true );
                            intent.putExtra("class",placeHolder);
                            startActivity(intent);
                        }else {
                            Intent intent = new Intent(getApplicationContext(), ConInt2023.class);
                            intent.putExtra("typeFromLessonPlan",true );
                            intent.putExtra("class",placeHolder);
                            startActivity(intent);
                        }

                    }else {
                        posKeyword = 0;
                        SubtractSelectionAndSendinfoToDb();
                        resetCounter();
                        PremiumAndArrayControler();
                    }


                }
            })
//set negative button
            .setNegativeButton("Seguir en esta clase", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //set what should happen when negative button is clicked

                }
            })
            .show();}
    public void DialogueBox3(String message)   {   AlertDialog alertDialog = new AlertDialog.Builder(this)
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
                    explanation = false;
                    clipMuestra = false;
                    text_key_word.setBackgroundColor(Color.WHITE);

                    setKeywordAndPosition();
                    saltarExp(explanation);

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

    public void increaseCounter(){
        ++CounterToSubtractSelection;
    }
    public void resetCounter(){
        CounterToSubtractSelection=0;

    }
    public void condicionParaPasarEs(int condicionNumber){
        if(CounterToSubtractSelection>condicionNumber){
            DialogueBox("Cambiar de Video y seguir a siguiente clase?");
        }
    }
    public void ocultartodo(){
        lay_btn_empezar.setVisibility(View.GONE);
        txt_exp_est.setVisibility(View.VISIBLE);
        lay_key_word.setVisibility(View.GONE);
        lay_btn_get.setVisibility(View.GONE);
    }
    int counter = 1;
    public void speakPass(boolean cultureFinish){
        if( !cultureFinish){

            Toast.makeText(this, "correcto! ahora faltan " + String.valueOf(KeyWordsObject[posSele].length-counter)+ " frases para terminar la clase", Toast.LENGTH_SHORT).show();
            counter++;
            increaseCounter();
            if(counterDb<104){
                sendInfoOfRegularUseToDb();
                counterDb++;
            }

        }else{
            counter=1;
            spin.setSelection(0);
        }
    }
    DocumentReference scoresCulturaDocRef;
    ModeloCultura mso ;
    private void sendInfoOfRegularUseToDb() {
        scoresCulturaDocRef=db.collection(userid).document("Scores Cultura");
        scoresCulturaDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else {
                    mso= documentSnapshot.toObject(ModeloCultura.class);
                    assert mso!=null;
                    updateinfo();
                }

            }

            private void updateinfo() {
                double division,result;
                Map<String, Object> userdb = new HashMap<>();
                division = mso.culturaCounter / 104.0;
                result = division * 100;
                mso.culturaCounter++; // sube el counter 1

                userdb.put("culturaCounter",mso.culturaCounter);
                userdb.put("AvanceCultura",result);

                uid.document("Scores Cultura").update(userdb);
            }
        });
    }


    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                }
                break;
        }

    }
    String[] placeHolder = new String[]{"Default value"};
    private RewardedAd mRewardedAd;
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-9126282069959189/7390438577", adRequest,
                new RewardedAdLoadCallback() {
                    @Override
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d("TAG", "Ad was loaded.");

                        // Set FullScreenContentCallback
                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d("TAG", "Ad was shown.");
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.d("TAG", "Ad failed to show.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                Log.d("TAG", "Ad was dismissed.");

                                // Reload the ad
                                mRewardedAd = null;
                                loadRewardedAd();
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d("TAG", loadAdError.getMessage());
                        mRewardedAd = null;
                    }
                });
    }
    public void showRewardedAd() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                // Handle the reward.
                if(isFromLessonPlan){
                    classSelector();
                    if(placeHolder[0].equals("Done")){
                        Intent intento = new Intent(this,Profile2023.class);
                        startActivity(intento);
                    }else if(placeHolder[0].equals("How to Make Our Cities Safer")||placeHolder[0].equals("How to End Systemic Racism")||placeHolder[0].equals("Should Government Bail Out Big Banks?")) {
                        Intent intent = new Intent(this, Availability2023.class);
                        intent.putExtra("typeFromLessonPlan",true );
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);
                    }else if(placeHolder[0].equals("Dave Chapelle Man Rape")||placeHolder[0].equals("Análisis de cultura Gringa y Frases Coloquiales 2")||placeHolder[0].equals("Cultura y Fonética")||placeHolder[0].equals("Boys in the Hood")||placeHolder[0].equals("Kings of the Hills Drugs")){
                        Intent intent = new Intent(this, Cultura2023.class);
                        intent.putExtra("typeFromLessonPlan",true );
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);
                    }else {
                        Intent intent = new Intent(this, ConInt2023.class);
                        intent.putExtra("typeFromLessonPlan",true );
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);
                    }

                }else {
                    Intent intento = new Intent(this,Cultura2023.class);
                    startActivity(intento);
                }

            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }
    }

    private void classSelector() {
        switch (selection) {
            case "Moonlight":
                placeHolder = new String[]{"Steve Jobs 1"};
                break;
            case "Rick and Morty":
                placeHolder = new String[]{"Kot Fishing 1"};

                break;
            case "Do You Want Pepsi":
                placeHolder = new String[]{"Kot Fishing 2"};

                break;
            case "Sangre Por Sangre Foodline":
                placeHolder = new String[]{"Helicoptero 1"};

                break;
            case "Sangre Por Sangre Watch El Paisaje":
                placeHolder = new String[]{"Helicoptero 2"};
                break;
            case "Training Day Rabbit Has The Gun":
                placeHolder = new String[]{"How to Make Our Cities Safer"};

                break;
            case "Hancock Train":
                placeHolder = new String[]{"How to End Systemic Racism"};
                break;
            case "Malcom in the Middle Teacher":
                placeHolder = new String[]{"Should Government Bail Out Big Banks?"};

                break;
            case "Sangre Por Sangre Comedor":
                placeHolder = new String[]{"Dave Chapelle Man Rape"};

                break;
            case "Dave Chapelle Man Rape":
                placeHolder = new String[]{"Análisis de cultura Gringa y Frases Coloquiales 2"};

                break;
            case "Análisis de cultura Gringa y Frases Coloquiales 2":
                placeHolder = new String[]{"Boys in the Hood"};

                break;
            case "Boys in the Hood":
                placeHolder = new String[]{"Cultura y Fonética"};

                break;
            case "Cultura y Fonética":
                placeHolder = new String[]{"Kings of the Hills Drugs"};

                break;
            case "Kings of the Hills Drugs":
                placeHolder = new String[]{"Done"};

                break;
            default:
                // Code for undefined case
                break;
        }
    }

    public void  dialogueShowRewardedAd(String text, String buttonyes, String buttonno){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);

        textView.setText(Html.fromHtml(text));
        textView.setTextSize(18); // Set the text size to 18sp
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(text);

        AlertDialog dialog = builder.create();

// Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonyes);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable.setColor(Color.BLUE); // Set the background color
        button.setBackground(drawable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setHasSeenAd(true);
                showRewardedAd();


            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.GRAY); // Set the background color
        button2.setText(buttonno);
        button2.setTextColor(Color.BLACK);
        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setHasSeenAd(true);
                Intent intento = new Intent(Cultura2023.this,Premium2023.class);
                startActivity(intento);

            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                // Code to execute when the dialog is cancelled (e.g., user clicks outside the dialog)
                prefs.setHasSeenAd(false);
            }
        });

        dialog.show();

    }


    Object KeyWordsObject [][][] ={
            //Moonlight
            {
                    //"Ain't no refund"
                    {
                            //keyword
                            "Ain't no refund",
                            //timeStart
                            24000,
                            //timeStop
                            26000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Aint%20no%20refund%20-%20Moonlight.mp4"
                    },
                    //"Thought you was on vacation"
                    {
                            //keyword
                            "Thought you was on vacation",
                            //timeStart
                            36000,
                            //timeStop
                            38000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Thought%20you%20was%20on%20vacation%20-%20Moonlight.mp4"
                    }
                    ,
                    //"How peanut working out"
                    {
                            //keyword
                            "How peanut working out",
                            //timeStart
                            48000,
                            //timeStop
                            50000,
                            //URL EXP
                            "https://adrianlealcaldera.com/How%20peanut%20working%20out%20-%20Moonlight.mp4"
                    },
                    //"I got him in check"
                    {
                            //keyword
                            "I got him in check",
                            //timeStart
                            50000,
                            //timeStop
                            52000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20got%20him%20in%20check%20-%20Moonlight.mp4"
                    },
                    //"I ain´t go let that go down"
                    {
                            //keyword
                            "I ain´t go let that go down",
                            //timeStart
                            62800,
                            //timeStop
                            65000,
                            /*//time2
                            //timeStart
                            70000,
                            //timeStop
                            73000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20aint%20go%20let%20that%20go%20down%20-%20Moonlight.mp4"
                    },
                    //"What´s up"
                    {
                            //keyword
                            "What´s up",
                            //timeStart
                            93000,
                            //timeStop
                            95600,
                            //URL EXP
                            "https://adrianlealcaldera.com/Whats%20up%20-%20Moonlight.mp4"
                    },
                    //"It´s all good"
                    {
                            //keyword
                            "It´s all good",
                            //timeStart
                            96000,
                            //timeStop
                            97600,
                            /*//time2
                            //timeStart
                            103000,
                            //timeStop
                            105000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/Its%20all%20good%20-%20Moonlight.mp4"
                    },
                    //"What are you doing"
                    {
                            //keyword
                            "What are you doing",
                            //timeStart
                            98000,
                            //timeStop
                            100000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20are%20you%20doing%20-%20Moonlight.mp4"
                    },
                    //"What is wrong with you"
                    {
                            //keyword
                            "What is wrong with you",
                            //timeStart
                            107000,
                            //timeStop
                            108000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20is%20wrong%20with%20you%20-%20Moonlight.mp4"
                    },
                    //"Get the fuck out of here"
                    {
                            //keyword
                            "Get the fuck out of here",
                            //timeStart
                            115000,
                            //timeStop
                            116000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Get%20the%20fuck%20out%20of%20here%20-%20Moonlight.mp4"
                    },
                    //"Have you ever"
                    {
                            //keyword
                            "Have you ever",
                            //timeStart
                            179000,
                            //timeStop
                            180200,
                            //URL EXP
                            "https://adrianlealcaldera.com/Have%20you%20ever%20-%20Moonlight.mp4"
                    }
            },

            //Rick and Morty Clip 2
            {
                    //"What's up"
                    {
                            //keyword
                            "What's up",
                            //timeStart
                            0,
                            //timeStop
                            2000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Whats%20up%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"No can do"
                    {
                            //keyword
                            "No can do",
                            //timeStart
                            5000,
                            //timeStop
                            7000,
                            //URL EXP
                            "https://adrianlealcaldera.com/No%20can%20do%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"When i feel like it"
                    {
                            //keyword
                            "When i feel like it",
                            //timeStart
                            16000,
                            //timeStop
                            17500,
                            //URL EXP
                            "https://adrianlealcaldera.com/When%20i%20feel%20like%20it%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"You need to chill out"
                    {
                            //keyword
                            "You need to chill out",
                            //timeStart
                            18000,
                            //timeStop
                            20000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20need%20to%20chill%20out%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"Tryna - (trying to)"
                    {
                            //keyword
                            "Tryna - (trying to)",
                            //timeStart
                            24000,
                            //timeStop
                            25000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Tryna%20-%20(trying%20to)%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"You know what"
                    {
                            //keyword
                            "You know what",
                            //timeStart
                            24000,
                            //timeStop
                            25000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20know%20what%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"Hanging out"
                    {
                            //keyword
                            "Hanging out",
                            //timeStart
                            26000,
                            //timeStop
                            28000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Hanging%20out%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"You're overthinking it"
                    {
                            //keyword
                            "You're overthinking it",
                            //timeStart
                            54000,
                            //timeStop
                            58000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Youre%20overthinking%20it%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"Get your shit together"
                    {
                            //keyword
                            "Get your shit together",
                            //timeStart
                            104000,
                            //timeStop
                            106000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Get%20your%20shit%20together%20-%20Rick%20and%20Morty.mp4"
                    },
                    //"To be into"
                    {
                            //keyword
                            "To be into",
                            //timeStart
                            4000,
                            //timeStop
                            5000,
                            //URL EXP
                            "https://adrianlealcaldera.com/To%20be%20into%20-%20Rick%20and%20Morty.mp4"
                    }
            },

            //Do You Want Pepsi Clip 3
            {
                    //"Is there anything else a can get for you"
                    {
                            //keyword
                            "Is there anything else a can get for you",
                            //timeStart
                            0,
                            //timeStop
                            2000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Is%20there%20anything%20else%20a%20can%20get%20for%20you%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"Ain't got no"
                    {
                            //keyword
                            "Ain't got no",
                            //timeStart
                            6000,
                            //timeStop
                            9000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Aint%20got%20no%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"Do you want"
                    {
                            //keyword
                            "Do you want",
                            //timeStart
                            10000,
                            //timeStop
                            12000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Do%20you%20want%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"I was just wondering"
                    {
                            //keyword
                            "I was just wondering",
                            //timeStart
                            15000,
                            //timeStop
                            18000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20was%20just%20wondering%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"Might as well"
                    {
                            //keyword
                            "Might as well",
                            //timeStart
                            17000,
                            //timeStop
                            19000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Might%20as%20well%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"You feel me"
                    {
                            //keyword
                            "You feel me",
                            //timeStart
                            18000,
                            //timeStop
                            20000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20feel%20me%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"Is there a problem"
                    {
                            //keyword
                            "Is there a problem",
                            //timeStart
                            29000,
                            //timeStop
                            31000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Is%20there%20a%20problem%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"I didn't want"
                    {
                            //keyword
                            "I didn´t want",
                            //timeStart
                            31000,
                            //timeStop
                            33000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20didnt%20want%20-%20Do%20You%20Want%20Pepsi.mp4"
                    },
                    //"Why would you"
                    {
                            //keyword
                            "Why would you",
                            //timeStart
                            34000,
                            //timeStop
                            36000,
                            /*//time2
                            //timeStart
                            36000,
                            //timeStop
                            37000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/Why%20would%20you%20-%20Do%20You%20Want%20Pepsi.mp4"
                    }
            },

            //Sangre Por Sangre Foodline Clip 4
            {
                    //"You ain't going to no prom soon"
                    {
                            //keyword
                            "You ain't going to no prom soon",
                            //timeStart
                            8000,
                            //timeStop
                            10000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20aint%20going%20to%20no%20prom%20soon%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    },
                    //"Ain't nothing but"
                    {
                            //keyword
                            "Ain't nothing but",
                            //timeStart
                            15000,
                            //timeStop
                            16000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Aint%20nothing%20but%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    },
                    //"I ain't no muslim"
                    {
                            //keyword
                            "I ain't no muslim",
                            //timeStart
                            25000,
                            //timeStop
                            27000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20aint%20no%20muslim%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    },
                    //"I ain't no moving"
                    {
                            //keyword
                            "I ain't moving",
                            //timeStart
                            31000,
                            //timeStop
                            33000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20aint%20no%20moving%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    },
                    //"There is a ray of sunshine"
                    {
                            //keyword
                            "There is a ray of sunshine",
                            //timeStart
                            61000,
                            //timeStop
                            63000,
                            //URL EXP
                            "https://adrianlealcaldera.com/There%20is%20a%20ray%20of%20sunshine%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    },
                    //"I ain't buying whats mine"
                    {
                            //keyword
                            "I ain't buying whats mine",
                            //timeStart
                            132000,
                            //timeStop
                            134000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20aint%20buying%20whats%20mine%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    },
                    //"You've getting by with that shit"
                    {
                            //keyword
                            "You've getting by with that shit",
                            //timeStart
                            155000,
                            //timeStop
                            158000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Youve%20getting%20by%20with%20that%20shit%20-%20Sangre%20Por%20Sangre%20Foodline.mp4"
                    }
            },

            //Sangre Por Sangre Watch El Paisaje Clip 5
            {
                    //"I'm here to jack you up"
                    {
                            //keyword
                            "I'm here to jack you up",
                            //timeStart
                            23000,
                            //timeStop
                            25000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20here%20to%20jack%20you%20up%20-%20Sangre%20Por%20Sangre%20Watch%20El%20Paisaje.mp4"
                    },
                    //"What do you want to do"
                    {
                            //keyword
                            "What do you want to do",
                            //timeStart
                            42000,
                            //timeStop
                            44000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20do%20you%20want%20to%20do%20-%20Sangre%20Por%20Sangre%20Watch%20El%20Paisaje.mp4"
                    },
                    //"You gotta pay your dues"
                    {
                            //keyword
                            "You gotta pay your dues",
                            //timeStart
                            45000,
                            //timeStop
                            47000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20gotta%20pay%20your%20dues%20-%20Sangre%20Por%20Sangre%20Watch%20El%20Paisaje.mp4"
                    },
                    //"You wanna throw down"
                    {
                            //keyword
                            "You wanna throw down",
                            //timeStart
                            48000,
                            //timeStop
                            50000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20wanna%20throw%20down%20-%20Sangre%20Por%20Sangre%20Watch%20El%20Paisaje.mp4"
                    },
                    //"Catch you on the rebound"
                    {
                            //keyword
                            "Catch you on the rebound",
                            //timeStart
                            82000,
                            //timeStop
                            85000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Catch%20you%20on%20the%20rebound%20-%20Sangre%20Por%20Sangre%20Watch%20El%20Paisaje.mp4"
                    },
                    //"Should't done thate"
                    {
                            //keyword
                            "Should't done thate",
                            //timeStart
                            135000,
                            //timeStop
                            137000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Shouldt%20done%20thate%20-%20Sangre%20Por%20Sangre%20Watch%20El%20Paisaje.mp4"
                    }
            },

            //Training Day Rabbit Has The Gun Clip 6
            {
                    //"Is no fun"
                    {
                            //keyword
                            "Is no fun",
                            //timeStart
                            12000,
                            //timeStop
                            14000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Is%20no%20fun%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"Who want to get paid"
                    {
                            //keyword
                            "Who want to get paid",
                            //timeStart
                            32000,
                            //timeStop
                            34000,
                            /*//time2
                            //timeStart
                            35000,
                            //timeStop
                            37000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/Who%20want%20to%20get%20paid%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"I'm glad to hear that"
                    {
                            //keyword
                            "I'm glad to hear that",
                            //timeStart
                            49000,
                            //timeStop
                            51000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20glad%20to%20hear%20that%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"What are you gonna do"
                    {
                            //keyword
                            "What are you gonna do",
                            //timeStart
                            57000,
                            //timeStop
                            59000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20are%20you%20gonna%20do%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"There it is"
                    {
                            //keyword
                            "There it is",
                            //timeStart
                            67000,
                            //timeStop
                            69000,
                            //URL EXP
                            "https://adrianlealcaldera.com/There%20it%20is%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"Havent ever - ain't never"
                    {
                            //keyword
                            "Havent ever - ain't never",
                            //timeStart
                            73000,
                            //timeStop
                            75000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Havent%20ever%20-%20aint%20never%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"You get me twisted"
                    {
                            //keyword
                            "You get me twisted",
                            //timeStart
                            118000,
                            //timeStop
                            120000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20get%20me%20twisted%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"Ain't got it in you"
                    {
                            //keyword
                            "Ain't got it in you",
                            //timeStart
                            139000,
                            //timeStop
                            141000,
                            /*//time2
                            //timeStart
                            176000,
                            //timeStop
                            178000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/Aint%20got%20it%20in%20you%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"Ima get - i'm going to get"
                    {
                            //keyword
                            "Ima get - i'm going to get",
                            //timeStart
                            152000,
                            //timeStop
                            154000,
                            /*//time2
                            //timeStart
                             155000,
                             //timeStop
                             157000,*/
                            /*//time3
                            //timeStart
                            173000,
                            //timeStop
                            174000,*/
                            /*//time4
                            //timeStart
                            175000,
                            //timeStop
                            177000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/Ima%20get%20-%20im%20going%20to%20get%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    },
                    //"You ain't go"
                    {
                            //keyword
                            "You ain't go",
                            //timeStart
                            156000,
                            //timeStop
                            158000,
                            /*//time2
                            //timeStart
                             158000,
                             //timeStop
                             160000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20aint%20go%20-%20Training%20Day%20Rabbit%20Has%20The%20Gun.mp4"
                    }
            },

            //Hancock Train Clip 7
            {
                    //"I'm on my way"
                    {
                            //keyword
                            "I'm on my way",
                            //timeStart
                            1000,
                            //timeStop
                            3000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20on%20my%20way%20-%20Hancock%20Train.mp4"
                    },
                    //"I'll see you in about"
                    {
                            //keyword
                            "I'll see you in about",
                            //timeStart
                            15000,
                            //timeStop
                            18000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Ill%20see%20you%20in%20about%20-%20Hancock%20Train.mp4"
                    },
                    //"Are you alright"
                    {
                            //keyword
                            "Are you alright",
                            //timeStart
                            76000,
                            //timeStop
                            78000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Are%20you%20alright%20-%20Hancock%20Train.mp4"
                    },
                    //"You're the one who/that"
                    {
                            //keyword
                            "You're the one who/that",
                            //timeStart
                            126000,
                            //timeStop
                            129000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Youre%20the%20one%20who_that%20-%20Hancock%20Train.mp4"
                    },
                    //"Why didn't you just"
                    {
                            //keyword
                            "Why didn't you just",
                            //timeStart
                            126000,
                            //timeStop
                            129000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Why%20didnt%20you%20just%20-%20Hancock%20Train.mp4"
                    },
                    //"Coulda shoulda - could/should have"
                    {
                            //keyword
                            "Should't done thate",
                            //timeStart
                            175000,
                            //timeStop
                            178000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Coulda%20shoulda%20-%20could_should%20-%20Hancock%20Train.mp4"
                    }
            },

            //Malcom in the Middle Teacher Clip 8
            {
                    //"You're nothing but a"
                    {
                            //keyword
                            "You're nothing but a",
                            //timeStart
                            0,
                            //timeStop
                            2000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Youre%20nothing%20but%20a%20-%20Malcom%20in%20the%20Middle%20Teacher.mp4"
                    },
                    //"Took you long enough"
                    {
                            //keyword
                            "Took you long enough",
                            //timeStart
                            9000,
                            //timeStop
                            10000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Took%20you%20long%20enough%20-%20Malcom%20in%20the%20Middle%20Teacher.mp4"
                    },
                    //"I've been trynna / trying to"
                    {
                            //keyword
                            "I've been trynna / trying to",
                            //timeStart
                            11000,
                            //timeStop
                            13000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Ive%20been%20trynna%20-%20Malcom%20in%20the%20Middle%20Teacher.mp4"
                    },
                    //"What do you want"
                    {
                            //keyword
                            "What do you want",
                            //timeStart
                            18000,
                            //timeStop
                            20000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20do%20you%20want%20-%20Malcom%20in%20the%20Middle%20Teacher.mp4"
                    },
                    //"It's just a bunch of"
                    {
                            //keyword
                            "It's just a bunch of",
                            //timeStart
                            32000,
                            //timeStop
                            34000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Its%20just%20a%20bunch%20of%20-%20Malcom%20in%20the%20Middle%20Teacher.mp4"
                    },
                    //"Rub somebody the wrong way"
                    {
                            //keyword
                            "Rub somebody the wrong way",
                            //timeStart
                            88000,
                            //timeStop
                            90000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Rub%20somebody%20the%20wrong%20way%20-%20Malcom%20in%20the%20Middle%20Teacher.mp4"
                    }
            },

            //Sangre Por Sangre Comedor Clip 9
            {
                    //"You wanna buy"
                    {
                            //keyword
                            "You wanna buy",
                            //timeStart
                            17000,
                            //timeStop
                            19000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20wanna%20buy%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    },
                    //"Get your hands off"
                    {
                            //keyword
                            "Get your hands off",
                            //timeStart
                            26000,
                            //timeStop
                            28000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Get%20your%20hands%20off%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    },
                    //Give it to one of my
                    {
                            //keyword
                            "Give it to one of my",
                            //timeStart
                            120000,
                            //timeStop
                            123000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Give%20it%20to%20one%20of%20my%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    },
                    //I'm gonna have to
                    {
                            //keyword
                            "I'm gonna have to",
                            //timeStart
                            200000,
                            //timeStop
                            203000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20gonna%20have%20to%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    },
                    //What's the matter
                    {
                            //keyword
                            "What's the matter",
                            //timeStart
                            205000,
                            //timeStop
                            206000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Whats%20the%20matter%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    },
                    //Ain't you ever
                    {
                            //keyword
                            "Ain't you ever",
                            //timeStart
                            207000,
                            //timeStop
                            209000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Aint%20you%20ever%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    },
                    //"What are you looking for"
                    {
                            //keyword
                            "What are you looking for",
                            //timeStart
                            260000,
                            //timeStop
                            262000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20are%20you%20looking%20for%20-%20Sangre%20Por%20Sangre%20Comedor.mp4"
                    }
            },

            //Dave Chapelle Man Rape Clip 10
            {
                    //"I'm one of those people"
                    {
                            //keyword
                            "I'm one of those people",
                            //timeStart
                            1000,
                            //timeStop
                            3000,
                            /*//time2
                            //timeStart
                            13000,
                            //timeStop
                            15000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20one%20of%20those%20people%20-%20Dave%20Chapelle%20Man%20Rape.mp4"
                    },
                    //"And i'm scared to live"
                    {
                            //keyword
                            "And i'm scared to live",
                            //timeStart
                            7000,
                            //timeStop
                            10000,
                            /*//time2
                            //timeStart
                            20000,
                            //timeStop
                            22000,*/
                            //URL EXP
                            "https://adrianlealcaldera.com/And%20im%20scared%20to%20live%20-%20Dave%20Chapelle%20Man%20Rape.mp4"
                    }
            },

            //Análisis de cultura Gringa y Frases Coloquiales 2 Clip 11
            {
                    //"If ther is some firing Going on"
                    {
                            //keyword
                            "If ther is some firing Going on",
                            //timeStart
                            1000,
                            //timeStop
                            3000,
                            //URL EXP
                            "https://adrianlealcaldera.com/If%20ther%20is%20some%20firing%20Going%20on%20-%20Ana%CC%81lisis%20de%20cultura%20Gringa%20y%20Frases%20Coloquiales%202.mp4"
                    },
                    //"We first So we pretty much expect it"
                    {
                            //keyword
                            "We first So we pretty much expect it",
                            //timeStart
                            3000,
                            //timeStop
                            7000,
                            //URL EXP
                            "https://adrianlealcaldera.com/We%20first%20So%20we%20pretty%20much%20expect%20it%20-%20Ana%CC%81lisis%20de%20cultura%20Gringa%20y%20Frases%20Coloquiales%202.mp4"
                    },
                    //"I know what im Talking about"
                    {
                            //keyword
                            "I know what im Talking about",
                            //timeStart
                            7600,
                            //timeStop
                            9000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20know%20what%20im%20Talking%20about%20-%20Ana%CC%81lisis%20de%20cultura%20Gringa%20y%20Frases%20Coloquiales%202.mp4"
                    },
                    //"I done had a lot of jobs"
                    {
                            //keyword
                            "I done had a lot of jobs",
                            //timeStart
                            8900,
                            //timeStop
                            10000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20done%20had%20a%20lot%20of%20jobs%20-%20Ana%CC%81lisis%20de%20cultura%20Gringa%20y%20Frases%20Coloquiales%202.mp4"
                    },
                    //"Got into"
                    {
                            //keyword
                            "Got into",
                            //timeStart
                            10000,
                            //timeStop
                            12000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Got%20into%20-%20Ana%CC%81lisis%20de%20cultura%20Gringa%20y%20Frases%20Coloquiales%202.mp4"
                    },
                    //"Out of them"
                    {
                            //keyword
                            "Out of them",
                            //timeStart
                            15000,
                            //timeStop
                            16500,
                            //URL EXP
                            "https://adrianlealcaldera.com/Out%20of%20them%20-%20Ana%CC%81lisis%20de%20cultura%20Gringa%20y%20Frases%20Coloquiales%202.mp4"
                    }
            },

            //Boys in the Hood Clip 12
            {
                    //"What’s wrong with you"
                    {
                            //keyword
                            "What’s wrong with you",
                            //timeStart
                            12000,
                            //timeStop
                            14000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Whats%20wrong%20with%20you%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"What the fuck are you looking at"
                    {
                            //keyword
                            "What the fuck are you looking at",
                            //timeStart
                            15000,
                            //timeStop
                            17000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20the%20fuck%20are%20you%20looking%20at%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"I’m Still trying to find out “Tryna”"
                    {
                            //keyword
                            "I’m Still trying to find out “Tryna”",
                            //timeStart
                            16800,
                            //timeStop
                            19000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20Still%20trying%20to%20find%20out%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"We got a problem here?"
                    {
                            //keyword
                            "We got a problem here?",
                            //timeStart
                            21000,
                            //timeStop
                            23000,
                            //URL EXP
                            "https://adrianlealcaldera.com/We%20got%20a%20problem%20here%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"Start some shit"
                    {
                            //keyword
                            "Start some shit",
                            //timeStart
                            55000,
                            //timeStop
                            57000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Start%20some%20shit%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"That’s why fool be getting shot all the time"
                    {
                            //keyword
                            "That’s why fool be getting shot all the time",
                            //timeStart
                            61000,
                            //timeStop
                            63000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Thats%20why%20fool%20be%20getting%20shot%20all%20the%20time%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"Tryna show how hard they is"
                    {
                            //keyword
                            "Tryna show how hard they is",
                            //timeStart
                            64000,
                            //timeStop
                            66000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Tryna%20show%20how%20hard%20they%20is%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"You be doing that shit, too"
                    {
                            //keyword
                            "You be doing that shit, too",
                            //timeStart
                            69000,
                            //timeStop
                            72000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20be%20doing%20that%20shit,%20too%20-%20Boys%20in%20the%20Hood.mp4"
                    },
                    //"I’m getting the fuck out of LA"
                    {
                            //keyword
                            "I’m getting the fuck out of LA",
                            //timeStart
                            102000,
                            //timeStop
                            106000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20getting%20the%20fuck%20out%20of%20LA%20-%20Boys%20in%20the%20Hood.mp4"
                    }
            },

            //Cultura y Fonética Clip 13
            {
                    //"Look man I don’t mean no disrespect or nothing G"
                    {
                            //keyword
                            "Look man I don’t mean no disrespect or nothing G",
                            //timeStart
                            150,
                            //timeStop
                            2080,
                            //URL EXP
                            "https://adrianlealcaldera.com/Look%20man%20I%20dont%20mean%20no%20disrespect%20or%20nothing%20G%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"I’m just trying to see"
                    {
                            //keyword
                            "I’m just trying to see",
                            //timeStart
                            2250,
                            //timeStop
                            3000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Im%20just%20trying%20to%20see%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"If can get a little bro"
                    {
                            //keyword
                            "If can get a little bro",
                            //timeStart
                            3050,
                            //timeStop
                            3450,
                            //URL EXP
                            "https://adrianlealcaldera.com/If%20can%20get%20a%20little%20bro%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"You can’t get nothing man"
                    {
                            //keyword
                            "You can’t get nothing man",
                            //timeStart
                            4000,
                            //timeStop
                            5000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20cant%20get%20nothing%20man%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"You know what time it is"
                    {
                            //keyword
                            "You know what time it is",
                            //timeStart
                            5000,
                            //timeStop
                            6000,
                            //URL EXP
                            "https://adrianlealcaldera.com/You%20know%20what%20time%20it%20is%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"I keep looking out for you"
                    {
                            //keyword
                            "I keep looking out for you",
                            //timeStart
                            6900,
                            //timeStop
                            7500,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20keep%20looking%20out%20for%20you%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"Just a little something man"
                    {
                            //keyword
                            "Just a little something man",
                            //timeStart
                            8000,
                            //timeStop
                            8800,
                            //URL EXP
                            "https://adrianlealcaldera.com/Just%20a%20little%20something%20man%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"All my soothing cost a little something"
                    {
                            //keyword
                            "All my soothing cost a little something",
                            //timeStart
                            9000,
                            //timeStop
                            10800,
                            //URL EXP
                            "https://adrianlealcaldera.com/All%20my%20soothing%20cost%20a%20little%20something%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"If you ain’t got it get to stepping"
                    {
                            //keyword
                            "If you ain’t got it get to stepping",
                            //timeStart
                            11000,
                            //timeStop
                            12070,
                            //URL EXP
                            "https://adrianlealcaldera.com/If%20you%20aint%20got%20it%20get%20to%20stepping%20-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
                    //"I am not fixing to repeat myself"
                    {
                            //keyword
                            "I am not fixing to repeat myself",
                            //timeStart
                            13050,
                            //timeStop
                            14000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20am%20not%20fixing%20to%20repeat%20myself-%20Cultura%20y%20Fone%CC%81tica.mp4"
                    },
            },

            //Kings of the Hills Drugs Clip 14
            {
                    //"What do you want"
                    {
                            //keyword
                            "What do you want",
                            //timeStart
                            10900,
                            //timeStop
                            11200,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20do%20you%20want%20-%20Kings%20of%20the%20Hills%20Drugs.mp4"
                    },
                    //"Are you looking to"
                    {
                            //keyword
                            "Are you looking to",
                            //timeStart
                            15000,
                            //timeStop
                            17000,
                            //URL EXP
                            "https://adrianlealcaldera.com/Are%20you%20looking%20to%20-%20Kings%20of%20the%20Hills%20Drugs.mp4"
                    },
                    //"I have been thinking about"
                    {
                            //keyword
                            "I have been thinking about",
                            //timeStart
                            22000,
                            //timeStop
                            24000,
                            //URL EXP
                            "https://adrianlealcaldera.com/I%20have%20been%20thinking%20about%20-%20Kings%20of%20the%20Hills%20Drugs.mp4"
                    },
                    //"What do you need"
                    {
                            //keyword
                            "What do you need",
                            //timeStart
                            24000,
                            //timeStop
                            26000,
                            //URL EXP
                            "https://adrianlealcaldera.com/What%20do%20you%20need%20-%20Kings%20of%20the%20Hills%20Drugs.mp4"
                    }

            }
    };
}