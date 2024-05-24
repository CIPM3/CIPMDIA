package com.leal.cipm_testing;

import static com.leal.cipm_testing.R.drawable.ic_btn_green;
import static com.leal.cipm_testing.R.drawable.ic_btn_red;
import static com.leal.cipm_testing.R.drawable.ic_rect_ngulo_btncheck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
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

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Availability2023 extends AppCompatActivity {

    TextView tv;
    TextView textspin1;
    Spinner spin;
    LinearLayout vf;
    Button preg1,preg2,preg3,preg4;
    TextView pregtxt,btn_test,scoreText;
    LinearLayout pasarSigNivel;
    LinearLayout test_view;
    LinearLayout result_view;
    String selection;
    String s;
    boolean personalizedPlan,isCustom;
    boolean isplanintermedio,isFromListeningPlan;
    boolean isFromListeningPlanDb;
    FirebaseAuth mAuth=FirebaseAuth.getInstance();
    String userid;
    ArraysdeLosPlanesPersonalizados objetoArrays = new ArraysdeLosPlanesPersonalizados();
    String[] temp = objetoArrays.pragerCompleto;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    int PositionOfSelection;
    int CounterToSubtractSelection=0;
    DocumentReference docref ;
    VocabModeloPersistencia vmp = new VocabModeloPersistencia();
    boolean isInVocab,
            isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition,
            isinIntcon,isBasicStructures,BasicListeningPlan;
    String[] ArrayWithElementRemoved;
    int PositionOfElementsLeft=0;
    Prefs prefs;
    boolean isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan;
    boolean BasicListeningPlanFromDb;
    VideoPlayer video_player = new VideoPlayer();
    boolean isInActividadDeComprension;
    DocumentReference scoresAvailDocRef;
    ModeloAvailability mso ;
    CollectionReference uid;
    int counterDb;
    Intent reciver;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability2023);

        tv = findViewById(R.id.txt_view);
        pregtxt = findViewById(R.id.pregtxt);
        preg1 = findViewById(R.id.preg1);
        preg2 = findViewById(R.id.preg2);
        preg3 = findViewById(R.id.preg3);
        preg4 = findViewById(R.id.preg4);
        test_view = findViewById(R.id.test_view);
        result_view = findViewById(R.id.result_view);
        textspin1 = findViewById(R.id.textspin1);
        scoreText = findViewById(R.id.scoreText);
        pasarSigNivel = findViewById(R.id.pasarSigNivel);
        pasarSigNivel.setVisibility(View.INVISIBLE );
        btn_test = findViewById(R.id.btn_test);
        spin = findViewById(R.id.spinuno);
        userid = mAuth.getCurrentUser().getUid();
        docref= db.collection(userid).document("WhereisStudent");
        counterDb=0;
        arrayGetter= new ArraysdeLosPlanesPersonalizados();
         reciver = getIntent();
         isFromLessonPlan=reciver.getBooleanExtra("typeFromLessonPlan",false);
         loadRewardedAd();
        setUpVideoFragmentStart();
        uid= db.collection(userid);
        PremiumAndArrayControler();
        sendInfotoDb();
    }

    private void setUpVideoFragmentStart() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView5, video_player)
                .commit();
        Bundle args = new Bundle();
        args.putString("tema", selection);
        video_player.setArguments(args);
    }

    //DB FUNC
    private void PremiumAndArrayControler() {
        prefs = new Prefs(this);
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        BasicListeningPlan= reciver.getBooleanExtra("BasicListeningPlan",false);
        BasicListeningPlanFromDb=reciver.getBooleanExtra("FromListeningDb",false);
        if(personalizedPlan){
          //  pasarSigNivel.setVisibility(View.VISIBLE);
            if(isCustom){
                //aqui viene de continue my plan
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                          /*  selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);*/

                           spinnerSelected1();
                          /*  tv.setText("");
                            btnFinalizarTest();*/

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                } else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                         /*   selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);
*/
                            spinnerSelected1();

                           /* tv.setText("");
                            btnFinalizarTest();*/

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }else {
                //aqui viene de la actividad anterior
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                         spinnerSelected1();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                } else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                          spinnerSelected1();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }
        }
        else {
            pasarSigNivel.setVisibility(View.GONE);
            btn_test.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
            checkPremiun();
        }

    }
    public void inWhatActivityisTheStudent(){

        isInPrager = true;
        if(BasicListeningPlan ||BasicListeningPlanFromDb){
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
        if(temp.length==2){
            // si queda nada de arrays cambia de vocab a estructura
            isBasicStructures=true;
            Intent intent = new Intent(Availability2023.this, Cultura2023.class);
            intent.putExtra("isThePlanPersonalized",personalizedPlan);
            intent.putExtra("FromBasicRecomended",isBasicStructures );
            intent.putExtra("isCustom",false);
            startActivity(intent);
        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
           selectPraggerText();

        }
    }
    public void PasarSiguienteEstructura(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(Availability2023.this)
//set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                .setTitle("Definición: ")
//set message
                .setMessage("aqui te lleva a la siguiente parte de tu plan ")
//set positive button
                .setPositiveButton("pasar a cultura", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(BasicListeningPlan||BasicListeningPlanFromDb){
                            Intent intent = new Intent(Availability2023.this, ConInt2023.class);
                            intent.putExtra("isThePlanPersonalized",personalizedPlan);
                            intent.putExtra("isCustom",false);
                            startActivity(intent);
                        }else {
                            Intent intent = new Intent(Availability2023.this, Cultura2023.class);
                            intent.putExtra("isThePlanPersonalized",personalizedPlan);
                            intent.putExtra("isCustom",false);
                            startActivity(intent);
                        }




                    }
                })
//set negative button
                .setNegativeButton("No ir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what should happen when negative button is clicked
                    }
                })
                .show();


    }

    //AVAILABILITY
    int pregIndex = 0;
    int pregCorrect = 0;

    String preguntas []={};
    String Respuestas [][]={};
    String RespuestasCorrectas [][] = {};
    String RespCorrecta;
    //EMPIEZA ESTRUCTURA
    ArrayAdapter<String> adapter;
    ArraysdeLosPlanesPersonalizados arrayGetter;
    boolean isFromLessonPlan;

    //EVALUA SI EL USUARIO ES PREMIUM O NO
    public void checkPremiun(){
        prefs.setHasSeenAd(true);
        reciver= getIntent();
         isFromLessonPlan = reciver.getBooleanExtra("typeFromLessonPlan", false);

        //USUARIO PREMIUM
        if(prefs.getPremium()==1){

            if(isFromLessonPlan){
                reciver= getIntent();
                temp= reciver.getStringArrayExtra("class");
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

            }else {
                temp= arrayGetter.pragerCompleto;
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

            }
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(adapter);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    spinnerSelected1();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

            //USUARIO BASICO
        } else if (prefs.getPremium()==0){

            if(isFromLessonPlan){
                reciver= getIntent();
                temp= reciver.getStringArrayExtra("class");
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

            }else {
                temp= arrayGetter.pragerCompleto;
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp);

            }
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
/*
                    Toast.makeText(Availability2023.this, "inside check premium " + String.valueOf(isInActividadDeComprension), Toast.LENGTH_SHORT).show();
*/

                        spinnerSelected1();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });


        }
    }

    //EVALUA QUE FUE SELECCIONADO
    public void spinnerSelected1(){
        if(isInActividadDeComprension){
            Toast.makeText(this, "termina actividad de comprensión", Toast.LENGTH_SHORT).show();
        }else {
            selection = spin.getSelectedItem().toString();
            textspin1.setText(selection);
            prefs.setSelection(selection);

            selectPraggerText();
            video_player.updateFragmentStateStructure(selection);
        }


    }

    //TOMA TODO EL ESPACIO PARA EL SPINNER 1
    public void activaSpinner1(View v){



        if(isInActividadDeComprension){
            Toast.makeText(this, "termina primero la actividad de comprension antes de pasar a otra clase", Toast.LENGTH_SHORT).show();
        }else{
            Spinner mySpinner = findViewById(R.id.spinuno);
            mySpinner.performClick();
        }

    }

    //SELECCIONA EL PRAGGER Y LE COLOCA EL TEXTO
    public void selectPraggerText(){
        switch (selection) {
            case "Black Fathers":
                texts t = new texts();
                String text = t.BlackFathers;
                setClickPragger(text);

                break;
            case "Is America Racist?":
                texts t1 = new texts();
                String text1 = t1.isAmericaRacist;
                setClickPragger(text1);
                break;

            case "Don't Compare Yourself to Others":
                texts t2 = new texts();
                String text2 = t2.DontCompareYourselftoOthers;
                setClickPragger(text2);
                break;

            case "Fix Yourself":
                texts t3 = new texts();
                String text3 = t3.fixyoursel;
                setClickPragger(text3);

                break;

            case "Are Men and Women Different?":
                texts t4 = new texts();
                String text4 = t4.AreMenAndWomenDifferent;
                setClickPragger(text4);

                break;

            case "Don't Waste Your Time":
                texts t5 = new texts();
                String text5 = t5.dontWasteYourTime;
                setClickPragger(text5);

                break;

            case "How to Make Our Cities Safer":
                texts t6 = new texts();
                String text6 = t6.HowtoMakeOurCitiesSafer;
                setClickPragger(text6);

                break;

            case "How to End Systemic Racism":
                texts t7 = new texts();
                String text7 = t7.howtoEndSystemicRacism;
                setClickPragger(text7);

                break;

            case "Should Government Bail Out Big Banks?":
                texts t8 = new texts();
                String text8 = t8.ShouldGovernmentBailOutBigBanks;
                setClickPragger(text8);

                break;

        }
    }

    //VUELVE MODO CLICK A CADA PALABRA SELECCIONADA
    public void setClickPragger(String text) {
        sendInfotoDb();
        SpannableString ss = new SpannableString(text);
        switch (selection) {
            case "Black Fathers":

                ClickableSpan between = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.between);
                    }
                };
                ClickableSpan children = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.children);
                    }
                };
                ClickableSpan ago = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.ago);
                    }
                };
                ClickableSpan then = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.then);
                    }
                };
                ClickableSpan iasked = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.iasked);
                    }
                };
                ClickableSpan which = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.which);
                    }
                };
                ClickableSpan poses = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.poses);
                    }
                };
                ClickableSpan bigger = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.bigger);
                    }
                };
                ClickableSpan threat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.threat);
                    }
                };
                ClickableSpan withouthmissingabeat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.withouthmissingabeat);
                    }
                };
                ClickableSpan hesaid = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hesaid);
                    }
                };
                ClickableSpan itwas = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.itwas);
                    }
                };
                ClickableSpan who = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.who);
                    }
                };
                ClickableSpan weall = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.weall);
                    }
                };
                ClickableSpan know = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.know);
                    }
                };
                ClickableSpan that = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.that);
                    }
                };
                ClickableSpan growup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.growup);
                    }
                };
                ClickableSpan likely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.likely);
                    }
                };
                ClickableSpan poverty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.poverty);
                    }
                };
                ClickableSpan dropout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.dropout);
                    }
                };
                ClickableSpan endup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.endup);
                    }
                };
                ClickableSpan even = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.even);
                    }
                };
                ClickableSpan after = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.after);
                    }
                };
                ClickableSpan controlling = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.controlling);
                    }
                };
                ClickableSpan varying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.varying);
                    }
                };
                ClickableSpan householdincome = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.householdincome);
                    }
                };
                ClickableSpan jail = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.jail);
                    }
                };
                ClickableSpan mostlikely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.mostlikely);
                    }
                };
                ClickableSpan windup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.windup);
                    }
                };
                ClickableSpan eachother = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.eachother);
                    }
                };
                ClickableSpan risen = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.risen);
                    }
                };
                ClickableSpan reached = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.reached);
                    }
                };
                ClickableSpan during = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.during);
                    }
                };
                ClickableSpan marriage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.marriage);
                    }
                };
                ClickableSpan were = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.were);
                    }
                };
                ClickableSpan than = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.than);
                    }
                };
                ClickableSpan raised = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.raised);
                    }
                };
                ClickableSpan both = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.both);
                    }
                };
                ClickableSpan written = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.written);
                    }
                };
                ClickableSpan according = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.according);
                    }
                };
                ClickableSpan outofwedlock = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.outofwedlock);
                    }
                };
                ClickableSpan birth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.birth);
                    }
                };
                ClickableSpan lessthan = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.lessthan);
                    }
                };
                ClickableSpan over = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.over);
                    }
                };
                ClickableSpan answer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.answer);
                    }
                };
                ClickableSpan found = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.found);
                    }
                };
                ClickableSpan law = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.law);
                    }
                };
                ClickableSpan iff = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.iff);
                    }
                };
                ClickableSpan subsidize = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.subsidize);
                    }
                };
                ClickableSpan undesirable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.undesirable);
                    }
                };
                ClickableSpan behavior = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.behavior);
                    }
                };
                ClickableSpan youwillget = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.youwillget);
                    }
                };
                ClickableSpan soCalled = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.soCalled);
                    }
                };
                ClickableSpan war = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.war);
                    }
                };
                ClickableSpan began = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.began);
                    }
                };
                ClickableSpan begantoflatline = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.begantoflatline);
                    }
                };
                ClickableSpan from = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.from);
                    }
                };
                ClickableSpan until = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.until);
                    }
                };
                ClickableSpan untilnow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.untilnow);
                    }
                };
                ClickableSpan spent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.spent);
                    }
                };
                ClickableSpan hasspent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hasspent);
                    }
                };
                ClickableSpan tofightpoverty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.tofightpoverty);
                    }
                };
                ClickableSpan rate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.rate);
                    }
                };
                ClickableSpan hasremainedunchanged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hasremainedunchanged);
                    }
                };
                ClickableSpan haschanged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.haschanged);
                    }
                };
                ClickableSpan dramatically = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.dramatically);
                    }
                };
                ClickableSpan Thatsbecause = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thatsbecause);
                    }
                };
                ClickableSpan generous = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.generous);
                    }
                };
                ClickableSpan ineffect = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.ineffect);
                    }
                };
                ClickableSpan abandon = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.abandon);
                    }
                };
                ClickableSpan traditional = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.traditional);
                    }
                };
                ClickableSpan financial = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.financial);
                    }
                };
                ClickableSpan responsibilities = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.responsibilities);
                    }
                };
                ClickableSpan suchdependency = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.suchdependency);
                    }
                };
                ClickableSpan learnedhelplessness = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.learnedhelplessness);
                    }
                };
                ClickableSpan disincentive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.disincentive);
                    }
                };
                ClickableSpan tryingtohelp = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.tryingtohelp);
                    }
                };
                ClickableSpan poor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.poor);
                    }
                };
                ClickableSpan nonpoor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.nonpoor);
                    }
                };
                ClickableSpan whether = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.whether);
                    }
                };
                ClickableSpan additional = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.additional);
                    }
                };
                ClickableSpan respondents = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.respondents);
                    }
                };
                ClickableSpan oncesaid = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.oncesaid);
                    }
                };
                ClickableSpan headmitted = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.headmitted);
                    }
                };
                ClickableSpan runningwith = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.runningwith);
                    }
                };
                ClickableSpan gangs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.gangs);
                    }
                };
                ClickableSpan structure = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.structure);
                    }
                };
                ClickableSpan protection = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.protection);
                    }
                };
                ClickableSpan calmyoudown = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.calmyoudown);
                    }
                };
                ClickableSpan theway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.theway);
                    }
                };
                ClickableSpan teachyou = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.teachyou);
                    }
                };
                ClickableSpan howtobe = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.howtobe);
                    }
                };
                ClickableSpan myrough = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.myrough);
                    }
                };
                ClickableSpan growingup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.growingup);
                    }
                };
                ClickableSpan fulltimejobs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.fulltimejobs);
                    }
                };
                ClickableSpan asa = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.asa);
                    }
                };
                ClickableSpan janitor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.janitor);
                    }
                };
                ClickableSpan also = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.also);
                    }
                };
                ClickableSpan hismid80s = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hismid80s);
                    }
                };
                ClickableSpan angry = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.angry);
                    }
                };
                ClickableSpan bitter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.bitter);
                    }
                };
                ClickableSpan insisted = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.insisted);
                    }
                };
                ClickableSpan racialsegregation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.racialsegregation);
                    }
                };
                ClickableSpan yougetoutoflifewhatyouputintoit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.yougetoutoflifewhatyouputintoit);
                    }
                };

                ClickableSpan blamingotherpeople = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.blamingotherpeople);
                    }
                };

                ClickableSpan whatcouldihavedonetochangetheoutcome = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.whatcouldihavedonetochangetheoutcome);
                    }
                };

                ClickableSpan Thisadviceshaped = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thisadviceshaped);
                    }
                };

                ClickableSpan staffsergeant = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.staffsergeant);
                    }
                };
                ClickableSpan jimcrowsouth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.jimcrowsouth);
                    }
                };
                ClickableSpan fulltime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.fulltime);
                    }
                };
                ClickableSpan somehow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.somehow);
                    }
                };
                ClickableSpan cooked = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.cooked);
                    }
                };
                ClickableSpan andsomehowmanaged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.andsomehowmanaged);
                    }
                };
                ClickableSpan nightschool = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.nightschool);
                    }
                };
                ClickableSpan gethisGED = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.gethisGED);
                    }
                };
                ClickableSpan heran = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.heran);
                    }
                };
                ClickableSpan thelaterapper = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.thelaterapper);
                    }
                };
                ClickableSpan fathersmatter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.fathersmatter);
                    }
                };
                ClickableSpan wehave = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.wehave);
                    }
                };

                int i1 = text.indexOf("between");
                int i2 = text.indexOf("children");
                int i3 = text.indexOf("ago");
                int i4 = text.indexOf("then");
                int i5 = text.indexOf("I asked");
                int i6 = text.indexOf("Which");
                int i7 = text.indexOf("poses");
                int i8 = text.indexOf("bigger");
                int i9 = text.indexOf("threat");
                int i10 = text.indexOf("Without missing a beat");
                int i11 = text.indexOf("he said");
                int i12 = text.indexOf("it was");
                int i13 = text.indexOf("who");
                int i14 = text.indexOf("We all");
                int i15 = text.indexOf("know");
                int i16 = text.indexOf("That");
                int i17 = text.indexOf("grow up");
                int i18 = text.indexOf("likely");
                int i19 = text.indexOf("poverty");
                int i20 = text.indexOf("drop out");
                int i21 = text.indexOf("end up");
                int i22 = text.indexOf("even");
                int i23 = text.indexOf("after");
                int i24 = text.indexOf("controlling");
                int i25 = text.indexOf("varying");
                int i26 = text.indexOf("household income");
                int i27 = text.indexOf("jail");
                int i28 = text.indexOf("most likely");
                int i29 = text.indexOf("wind up");
                int i30 = text.indexOf("each other");
                int i31 = text.indexOf("risen");
                int i32 = text.indexOf("reached");
                int i33 = text.indexOf("during");
                int i34 = text.indexOf("marriage");
                int i35 = text.indexOf("were");
                int i36 = text.indexOf("than");
                int i37 = text.indexOf("raised");
                int i38 = text.indexOf("both");
                int i39 = text.indexOf("written");
                int i40 = text.indexOf("according");
                int i41 = text.indexOf("out-of-wedlock");
                int i42 = text.indexOf("birth");
                int i43 = text.indexOf("less than");
                int i44 = text.indexOf("over");
                int i45 = text.indexOf("answer");
                int i46 = text.indexOf("found");
                int i47 = text.indexOf("law");
                int i48 = text.indexOf("If");
                int i49 = text.indexOf("subsidize");
                int i50 = text.indexOf("undesirable");
                int i51 = text.indexOf("behavior");
                int i52 = text.indexOf("you will get");
                int i53 = text.indexOf("so-called");
                int i54 = text.indexOf("war");
                int i55 = text.indexOf("began");
                int i56 = text.indexOf("began to flat line");
                int i57 = text.indexOf("from");
                int i58 = text.indexOf("until");
                int i59 = text.indexOf("until now");
                int i60 = text.indexOf("spent");
                int i61 = text.indexOf("has spent");
                int i62 = text.indexOf("to fight poverty");
                int i63 = text.indexOf("rate");
                int i64 = text.indexOf("has remained unchanged");
                int i65 = text.indexOf("has changed");
                int i66 = text.indexOf("dramatically");
                int i67 = text.indexOf("That’s because");
                int i68 = text.indexOf("generous");
                int i69 = text.indexOf("in effect");
                int i70 = text.indexOf("abandon");
                int i71 = text.indexOf("traditional");
                int i72 = text.indexOf("financial");
                int i73 = text.indexOf("responsibilities");
                int i74 = text.indexOf("such dependency");
                int i75 = text.indexOf("learned helplessness");
                int i76 = text.indexOf("disincentives");
                int i77 = text.indexOf("trying to help");
                int i78 = text.indexOf("poor");
                int i79 = text.indexOf("non-poor");
                int i80 = text.indexOf("whether");
                int i81 = text.indexOf("additional");
                int i82 = text.indexOf("respondents");
                int i83 = text.indexOf("once said");
                int i84 = text.indexOf("He admitted");
                int i85 = text.indexOf("running with");
                int i86 = text.indexOf("gangs");
                int i87 = text.indexOf("structure");
                int i88 = text.indexOf("protection");
                int i89 = text.indexOf("calm you down");
                int i90 = text.indexOf("the way");
                int i91 = text.indexOf("teach you");
                int i92 = text.indexOf("how to be");
                int i93 = text.indexOf("my rough");
                int i94 = text.indexOf("Growing up");
                int i95 = text.indexOf("full-time jobs");
                int i96 = text.indexOf("as a");
                int i97 = text.indexOf("janitor");
                int i98 = text.indexOf("also");
                int i99 = text.indexOf("his mid-80s");
                int i100 = text.indexOf("angry");
                int i101 = text.indexOf("bitter");
                int i102 = text.indexOf("insisted");
                int i103 = text.indexOf("racial segregation");
                int i104 = text.indexOf("You get out of life what you put into it");

                int i106 = text.indexOf("blaming other people");
                int i107 = text.indexOf("what could I have done to change the outcome");
                int i108 = text.indexOf("This advice shaped");
                int i109 = text.indexOf("staff sergeant");
                int i110 = text.indexOf("Jim Crow South");
                int i111 = text.indexOf("full-time");
                int i112 = text.indexOf("somehow");
                int i113 = text.indexOf("cooked");
                int i114 = text.indexOf("and somehow managed");
                int i115 = text.indexOf("night school");
                int i116 = text.indexOf("get his GED");

                int i118 = text.indexOf("he ran");
                int i119 = text.indexOf("the late rapper");
                int i120 = text.indexOf("Fathers matter");
                int i121 = text.indexOf("we have");

                ss.setSpan(between, i1, i1 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(children, i2, i2 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(ago, i3, i3 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(then, i4, i4 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(iasked, i5, i5 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(which, i6, i6 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(poses, i7, i7 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(bigger, i8, i8 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(threat, i9, i9 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(withouthmissingabeat, i10, i10 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hesaid, i11, i11 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(itwas, i12, i12 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(who, i13, i13 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(weall, i14, i14 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(know, i15, i15 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(that, i16, i16 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(growup, i17, i17 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(likely, i18, i18 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(poverty, i19, i19 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(dropout, i20, i20 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(endup, i21, i21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(even, i22, i22 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(after, i23, i23 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(controlling, i24, i24 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(varying, i25, i25 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(householdincome, i26, i26 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(jail, i27, i27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(mostlikely, i28, i28 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(windup, i29, i29 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(eachother, i30, i30 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(risen, i31, i31 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(reached, i32, i32 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(during, i33, i33 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(marriage, i34, i34 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(were, i35, i35 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(than, i36, i36 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(raised, i37, i37 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(both, i38, i38 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(written, i39, i39 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(according, i40, i40 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(outofwedlock, i41, i41 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(birth, i42, i42 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(lessthan, i43, i43 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(over, i44, i44 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(answer, i45, i45 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(found, i46, i46 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(law, i47, i47 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(iff, i48, i48 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(subsidize, i49, i49 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(undesirable, i50, i50 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(behavior, i51, i51 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(youwillget, i52, i52 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(soCalled, i53, i53 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(war, i54, i54 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(began, i55, i55 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(begantoflatline, i56, i56 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(from, i57, i57 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(until, i58, i58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(untilnow, i59, i59 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(spent, i60, i60 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hasspent, i61, i61 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(tofightpoverty, i62, i62 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(rate, i63, i63 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hasremainedunchanged, i64, i64 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(haschanged, i65, i65 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(dramatically, i66, i66 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thatsbecause, i67, i67 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(generous, i68, i68 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(ineffect, i69, i69 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(abandon, i70, i70 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(traditional, i71, i71 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(financial, i72, i72 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(responsibilities, i73, i73 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(suchdependency, i74, i74 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(learnedhelplessness, i75, i75 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(disincentive, i76, i76 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(tryingtohelp, i77, i77 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(poor, i78, i78 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(nonpoor, i79, i79 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(whether, i80, i80 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(additional, i81, i81 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(respondents, i82, i82 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(oncesaid, i83, i83 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(headmitted, i84, i84 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(runningwith, i85, i85 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(gangs, i86, i86 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(structure, i87, i87 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(protection, i88, i88 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(calmyoudown, i89, i89 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(theway, i90, i90 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(teachyou, i91, i91 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(howtobe, i92, i92 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(myrough, i93, i93 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(growingup, i94, i94 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(fulltimejobs, i95, i95 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(asa, i96, i96 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(janitor, i97, i97 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(also, i98, i98 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hismid80s, i99, i99 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(angry, i100, i100 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(bitter, i101, i101 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(insisted, i102, i102 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(racialsegregation, i103, i103 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(yougetoutoflifewhatyouputintoit, i104, i104 + 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss.setSpan(blamingotherpeople, i106, i106 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(whatcouldihavedonetochangetheoutcome, i107, i107 + 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thisadviceshaped, i108, i108 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(staffsergeant, i109, i109 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(jimcrowsouth, i110, i110 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(fulltime, i111, i111 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(somehow, i112, i112 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(cooked, i113, i113 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(andsomehowmanaged, i114, i114 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(nightschool, i115, i115 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(gethisGED, i116, i116 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss.setSpan(heran, i118, i118 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(thelaterapper, i119, i119 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(fathersmatter, i120, i120 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(wehave, i121, i121 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                tv.setText(ss);
                tv.setMovementMethod(LinkMovementMethod.getInstance());

                break;

            case "Is America Racist?":

                ClickableSpan Still = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Still);
                    }
                };
                ClickableSpan Certainly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Certainly);
                    }
                };
                ClickableSpan Thinksso = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thinksso);
                    }
                };
                ClickableSpan That = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.That);
                    }
                };
                ClickableSpan If = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.If);
                    }
                };
                ClickableSpan Doesntthatmean = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doesntthatmean);
                    }
                };
                ClickableSpan So = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.So);
                    }
                };
                ClickableSpan Vote = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Vote);
                    }
                };
                ClickableSpan who2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.who2);
                    }
                };
                ClickableSpan was = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.was);
                    }
                };
                ClickableSpan elected = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.elected);
                    }
                };
                ClickableSpan almost = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.almost);
                    }
                };
                ClickableSpan later = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.later);
                    }
                };
                ClickableSpan thats = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.thats);
                    }
                };
                ClickableSpan only = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.only);
                    }
                };
                ClickableSpan themost = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.themost);
                    }
                };
                ClickableSpan thereare = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.thereare);
                    }
                };
                ClickableSpan take = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.take);
                    }
                };
                ClickableSpan marriage2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.marriage2);
                    }
                };
                ClickableSpan wrote = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.wrote);
                    }
                };
                ClickableSpan viewed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.viewed);
                    }
                };
                ClickableSpan benchmark = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.benchmark);
                    }
                };
                ClickableSpan stage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.stage);
                    }
                };
                ClickableSpan were2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.were2);
                    }
                };
                ClickableSpan until2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.until2);
                    }
                };
                ClickableSpan Galluppoll = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Galluppoll);
                    }
                };
                ClickableSpan Found = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Found);
                    }
                };
                ClickableSpan That2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.That2);
                    }
                };
                ClickableSpan Of = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Of);
                    }
                };
                ClickableSpan All = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.All);
                    }
                };
                ClickableSpan By = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.By);
                    }
                };
                ClickableSpan Rising = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rising);
                    }
                };
                ClickableSpan Whatabout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whatabout);
                    }
                };
                ClickableSpan Racialprofiling = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Racialprofiling);
                    }
                };
                ClickableSpan Doesntthat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doesntthat);
                    }
                };
                ClickableSpan Remains = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Remains);
                    }
                };
                ClickableSpan Summer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Summer);
                    }
                };
                ClickableSpan Became = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Became);
                    }
                };
                ClickableSpan Groundzero = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Groundzero);
                    }
                };
                ClickableSpan Unarmed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unarmed);
                    }
                };
                ClickableSpan Teenager = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Teenager);
                    }
                };
                ClickableSpan While = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.While);
                    }
                };
                ClickableSpan Cleared = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cleared);
                    }
                };
                ClickableSpan Wrongdoing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wrongdoing);
                    }
                };
                ClickableSpan Citys = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Citys);
                    }
                };
                ClickableSpan Bias = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bias);
                    }
                };
                ClickableSpan Headlinegrabbingstat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Headlinegrabbingstat);
                    }
                };
                ClickableSpan Gap = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gap);
                    }
                };
                ClickableSpan Those = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Those);
                    }
                };
                ClickableSpan Notsofast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Notsofast);
                    }
                };
                ClickableSpan Coprise = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Coprise);
                    }
                };
                ClickableSpan Account = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Account);
                    }
                };
                ClickableSpan Bigger = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bigger);
                    }
                };
                ClickableSpan Even = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Even);
                    }
                };
                ClickableSpan Than = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Than);
                    }
                };
                ClickableSpan Pd = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pd);
                    }
                };
                ClickableSpan Cannot = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cannot);
                    }
                };
                ClickableSpan About = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.About);
                    }
                };
                ClickableSpan Withouth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Withouth);
                    }
                };
                ClickableSpan Though = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Though);
                    }
                };
                ClickableSpan Commit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commit);
                    }
                };
                ClickableSpan Almost = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Almost);
                    }
                };
                ClickableSpan Always = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Always);
                    }
                };
                ClickableSpan Accordingto = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Accordingto);
                    }
                };
                ClickableSpan Bytheway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bytheway);
                    }
                };
                ClickableSpan Over = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Over);
                    }
                };
                ClickableSpan Twice = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Twice);
                    }
                };
                ClickableSpan Thatmany = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thatmany);
                    }
                };
                ClickableSpan But = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.But);
                    }
                };
                ClickableSpan Same = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Same);
                    }
                };
                ClickableSpan Mostly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mostly);
                    }
                };
                ClickableSpan Unlike = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unlike);
                    }
                };
                ClickableSpan Dispatch = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dispatch);
                    }
                };
                ClickableSpan Whenitcomesto = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whenitcomesto);
                    }
                };
                ClickableSpan Therefore = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Therefore);
                    }
                };
                ClickableSpan Haveafieldday = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Haveafieldday);
                    }
                };
                ClickableSpan Actually = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Actually);
                    }
                };
                ClickableSpan Published = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Published);
                    }
                };
                ClickableSpan Called = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Called);
                    }
                };
                ClickableSpan Outof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Outof);
                    }
                };
                ClickableSpan Drivers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Drivers);
                    }
                };
                ClickableSpan Were = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Were);
                    }
                };
                ClickableSpan Average = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Average);
                    }
                };
                ClickableSpan Likely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Likely);
                    }
                };
                ClickableSpan Speeding = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Speeding);
                    }
                };
                ClickableSpan Seatbelt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Seatbelt);
                    }
                };
                ClickableSpan Usage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Usage);
                    }
                };
                ClickableSpan Lower = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lower);
                    }
                };
                ClickableSpan Among = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Among);
                    }
                };
                ClickableSpan From = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.From);
                    }
                };
                ClickableSpan Words = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Words);
                    }
                };
                ClickableSpan Becauseof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Becauseof);
                    }
                };
                ClickableSpan Also = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Also);
                    }
                };
                ClickableSpan Higher = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Higher);
                    }
                };
                ClickableSpan Rates = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rates);
                    }
                };
                ClickableSpan Whether = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whether);
                    }
                };
                ClickableSpan Wearing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wearing);
                    }
                };
                ClickableSpan Safety = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Safety);
                    }
                };
                ClickableSpan Thereis = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thereis);
                    }
                };
                ClickableSpan Theleast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theleast);
                    }
                };
                ClickableSpan Better = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Better);
                    }
                };
                ClickableSpan Any = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Any);
                    }
                };
                ClickableSpan Greater = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Greater);
                    }
                };


                int iar1 = text.indexOf("still");
                int iar2 = text.indexOf("certainly");
                int iar3 = text.indexOf("thinks so");
                int iar4 = text.indexOf("that");
                int iar5 = text.indexOf("if");
                int iar6 = text.indexOf("doesn’t that mean");
                int iar7 = text.indexOf("so");
                int iar8 = text.indexOf("vote");
                int iar9 = text.indexOf("who");
                int iar10 = text.indexOf("was");
                int iar11 = text.indexOf("elected");
                int iar12 = text.indexOf("almost");
                int iar13 = text.indexOf("later");
                int iar14 = text.indexOf("That’s");
                int iar15 = text.indexOf("only");
                int iar16 = text.indexOf("the most");
                int iar17 = text.indexOf("There are");
                int iar18 = text.indexOf("Take");
                int iar19 = text.indexOf("marriage");
                int iar20 = text.indexOf("wrote");
                int iar21 = text.indexOf("viewed");
                int iar22 = text.indexOf("benchmark");
                int iar23 = text.indexOf("stage");
                int iar24 = text.indexOf("were");
                int iar25 = text.indexOf("until");
                int iar26 = text.indexOf("Gallup poll");
                int iar27 = text.indexOf("found");
                int iar28 = text.indexOf("that");
                int iar29 = text.indexOf("of");
                int iar30 = text.indexOf("all");
                int iar31 = text.indexOf("by");
                int iar32 = text.indexOf("rising");
                int iar33 = text.indexOf("what about");
                int iar34 = text.indexOf("racial profiling");
                int iar35 = text.indexOf("Doesn’t that");
                int iar36 = text.indexOf("remains");
                int iar37 = text.indexOf("summer");
                int iar38 = text.indexOf("became");
                int iar39 = text.indexOf("ground zero");
                int iar40 = text.indexOf("unarmed");
                int iar41 = text.indexOf("teenager");
                int iar42 = text.indexOf("While");
                int iar43 = text.indexOf("cleared");
                int iar44 = text.indexOf("wrongdoing");
                int iar45 = text.indexOf("city’s");
                int iar46 = text.indexOf("bias");
                int iar47 = text.indexOf("headline grabbing stat");
                int iar48 = text.indexOf("gap");
                int iar49 = text.indexOf("those");
                int iar50 = text.indexOf("Not so fast");
                int iar51 = text.indexOf("comprise");
                int iar52 = text.indexOf("account");
                int iar53 = text.indexOf("bigger");
                int iar54 = text.indexOf("even");
                int iar55 = text.indexOf("than");
                int iar56 = text.indexOf("PD");
                int iar57 = text.indexOf("cannot");
                int iar58 = text.indexOf("about");
                int iar59 = text.indexOf("without");
                int iar60 = text.indexOf("Though");
                int iar61 = text.indexOf("commit");
                int iar62 = text.indexOf("almost");
                int iar63 = text.indexOf("always");
                int iar64 = text.indexOf("according to");
                int iar65 = text.indexOf("by the way");
                int iar66 = text.indexOf("over");
                int iar67 = text.indexOf("twice");
                int iar68 = text.indexOf("that many");
                int iar69 = text.indexOf("But");
                int iar70 = text.indexOf("same");
                int iar71 = text.indexOf("mostly");
                int iar72 = text.indexOf("Unlike");
                int iar73 = text.indexOf("dispatch");
                int iar74 = text.indexOf("when it comes to");
                int iar75 = text.indexOf("Therefore");
                int iar76 = text.indexOf("have a field day");
                int iar77 = text.indexOf("Actually");
                int iar78 = text.indexOf("published");
                int iar79 = text.indexOf("called");
                int iar80 = text.indexOf("out of");
                int iar81 = text.indexOf("drivers");
                int iar82 = text.indexOf("were");
                int iar83 = text.indexOf("average");
                int iar84 = text.indexOf("likely");
                int iar85 = text.indexOf("speeding");
                int iar86 = text.indexOf("Seatbelt");
                int iar87 = text.indexOf("usage");
                int iar88 = text.indexOf("lower");
                int iar89 = text.indexOf("among");
                int iar90 = text.indexOf("from");
                int iar91 = text.indexOf("words");
                int iar92 = text.indexOf("because of");
                int iar93 = text.indexOf("also");
                int iar94 = text.indexOf("higher");
                int iar95 = text.indexOf("rates");
                int iar96 = text.indexOf("whether");
                int iar97 = text.indexOf("wearing");
                int iar98 = text.indexOf("safety");
                int iar99 = text.indexOf("there is");
                int iar100 = text.indexOf("the least");
                int iar101 = text.indexOf("better");
                int iar102 = text.indexOf("any");
                int iar103 = text.indexOf("greater");

                ss.setSpan(Still, iar1, iar1 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Certainly, iar2, iar2 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thinksso, iar3, iar3 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(That, iar4, iar4 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(If, iar5, iar5 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Doesntthatmean, iar6, iar6 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(So, iar7, iar7 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Vote, iar8, iar8 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(who2, iar9, iar9 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(was, iar10, iar10 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(elected, iar11, iar11 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(almost, iar12, iar12 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(later, iar13, iar13 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(thats, iar14, iar14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(only, iar15, iar15 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(themost, iar16, iar16 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(thereare, iar17, iar17 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(take, iar18, iar18 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(marriage2, iar19, iar19 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(wrote, iar20, iar20 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(viewed, iar21, iar21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(benchmark, iar22, iar22 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(stage, iar23, iar23 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(were2, iar24, iar24 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(until2, iar25, iar25 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Galluppoll, iar26, iar26 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Found, iar27, iar27 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(That2, iar28, iar28 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Of, iar29, iar29 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(All, iar30, iar30 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(By, iar31, iar31 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rising, iar32, iar32 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whatabout, iar33, iar33 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Racialprofiling, iar34, iar34 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Doesntthat, iar35, iar35 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Remains, iar36, iar36 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Summer, iar37, iar37 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Became, iar38, iar38 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Groundzero, iar39, iar39 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unarmed, iar40, iar40 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Teenager, iar41, iar41 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(While, iar42, iar42 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Cleared, iar43, iar43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wrongdoing, iar44, iar44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Citys, iar45, iar45 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bias, iar46, iar46 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Headlinegrabbingstat, iar47, iar47 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Gap, iar48, iar48 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Those, iar49, iar49 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Notsofast, iar50, iar50 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Coprise, iar51, iar51 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Account, iar52, iar52 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bigger, iar53, iar53 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Even, iar54, iar54 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Than, iar55, iar55 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Pd, iar56, iar56 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Cannot, iar57, iar57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(About, iar58, iar58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Withouth, iar59, iar59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Though, iar60, iar60 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commit, iar61, iar61 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Almost, iar62, iar62 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Always, iar63, iar63 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Accordingto, iar64, iar64 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bytheway, iar65, iar65 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Over, iar66, iar66 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Twice, iar67, iar67 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thatmany, iar68, iar68 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(But, iar69, iar69 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Same, iar70, iar70 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Mostly, iar71, iar71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unlike, iar72, iar72 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Dispatch, iar73, iar73 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whenitcomesto, iar74, iar74 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Therefore, iar75, iar75 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Haveafieldday, iar76, iar76 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Actually, iar77, iar77 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Published, iar78, iar78 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Called, iar79, iar79 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Outof, iar80, iar80 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Drivers, iar81, iar81 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Were, iar82, iar82 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Average, iar83, iar83 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Likely, iar84, iar84 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Speeding, iar85, iar85 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Seatbelt, iar86, iar86 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Usage, iar87, iar87 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Lower, iar88, iar88 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Among, iar89, iar89 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(From, iar90, iar90 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Words, iar91, iar91 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Becauseof, iar92, iar92 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Also, iar93, iar93 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Higher, iar94, iar94 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rates, iar95, iar95 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whether, iar96, iar96 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wearing, iar97, iar97 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Safety, iar98, iar98 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thereis, iar99, iar99 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Theleast, iar100, iar100 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Better, iar101, iar101 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Any, iar102, iar102 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Greater, iar103, iar103 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            case "Don't Compare Yourself to Others":


                ClickableSpan Doyoueverlook = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doyoueverlook);
                    }
                };
                ClickableSpan Iwish = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Iwish);
                    }
                };
                ClickableSpan Everybody = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Everybody);
                    }
                };
                ClickableSpan Bet = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bet);
                    }
                };
                ClickableSpan Compared = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Compared);
                    }
                };
                ClickableSpan Yourself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Yourself);
                    }
                };
                ClickableSpan Do = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Do);
                    }
                };
                ClickableSpan Own = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Own);
                    }
                };
                ClickableSpan Middle = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Middle);
                    }
                };
                ClickableSpan Asbigas = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Asbigas);
                    }
                };
                ClickableSpan Pretty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pretty);
                    }
                };
                ClickableSpan Hereswhy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hereswhy);
                    }
                };
                ClickableSpan People = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.People);
                    }
                };
                ClickableSpan Whole = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whole);
                    }
                };
                ClickableSpan Trick = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Trick);
                    }
                };
                ClickableSpan HereswhatImean = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.HereswhatImean);
                    }
                };
                ClickableSpan Happiness = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Happiness);
                    }
                };
                ClickableSpan Werebased = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Werebased);
                    }
                };
                ClickableSpan Biggest = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Biggest);
                    }
                };
                ClickableSpan Business = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Business);
                    }
                };
                ClickableSpan Idbemad = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Idbemad);
                    }
                };
                ClickableSpan Whoever = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whoever);
                    }
                };
                ClickableSpan Hebeastme = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hebeastme);
                    }
                };
                ClickableSpan Rich = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rich);
                    }
                };
                ClickableSpan Alot = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Alot);
                    }
                };
                ClickableSpan Like = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Like);
                    }
                };
                ClickableSpan Therewere = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Therewere);
                    }
                };
                ClickableSpan Richer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Richer);
                    }
                };
                ClickableSpan Never = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Never);
                    }
                };
                ClickableSpan Measure = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Measure);
                    }
                };
                ClickableSpan Constitutes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Constitutes);
                    }
                };
                ClickableSpan Success = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Success);
                    }
                };
                ClickableSpan Entertainment = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Entertainment);
                    }
                };
                ClickableSpan Allthrough = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Allthrough);
                    }
                };
                ClickableSpan Career = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Career);
                    }
                };
                ClickableSpan Customers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Customers);
                    }
                };
                ClickableSpan Someday = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someday);
                    }
                };
                ClickableSpan Youllbe = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Youllbe);
                    }
                };
                ClickableSpan Successful = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Successful);
                    }
                };
                ClickableSpan Topguy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Topguy);
                    }
                };
                ClickableSpan Someone = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someone);
                    }
                };
                ClickableSpan Theyre = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theyre);
                    }
                };
                ClickableSpan Disease = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Disease);
                    }
                };
                ClickableSpan Save = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Save);
                    }
                };
                ClickableSpan Justlike = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Justlike);
                    }
                };
                ClickableSpan Lawyer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lawyer);
                    }
                };
                ClickableSpan Crazy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Crazy);
                    }
                };
                ClickableSpan Makingaliving = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Makingaliving);
                    }
                };
                ClickableSpan Pursuing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pursuing);
                    }
                };
                ClickableSpan Findingmeaning = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Findingmeaning);
                    }
                };
                ClickableSpan What = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.What);
                    }
                };
                ClickableSpan First = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.First);
                    }
                };
                ClickableSpan Standup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Standup);
                    }
                };
                ClickableSpan Nobody = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nobody);
                    }
                };
                ClickableSpan Tunedoutcrowds = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Tunedoutcrowds);
                    }
                };
                ClickableSpan Before = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Before);
                    }
                };
                ClickableSpan Jokes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Jokes);
                    }
                };
                ClickableSpan Laughing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Laughing);
                    }
                };
                ClickableSpan about = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.about);
                    }
                };
                ClickableSpan Soldouthouses = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Soldouthouses);
                    }
                };
                ClickableSpan Iwasntplaying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Iwasntplaying);
                    }
                };
                ClickableSpan Bigpayday = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bigpayday);
                    }
                };
                ClickableSpan Able = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Able);
                    }
                };
                ClickableSpan Their = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Their);
                    }
                };
                ClickableSpan Dark = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dark);
                    }
                };
                ClickableSpan Struggle = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Struggle);
                    }
                };
                ClickableSpan Envy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Envy);
                    }
                };
                ClickableSpan Wentalongwithit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wentalongwithit);
                    }
                };
                ClickableSpan Factor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Factor);
                    }
                };
                ClickableSpan Sortof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sortof);
                    }
                };
                ClickableSpan Mixandmatchgame = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mixandmatchgame);
                    }
                };
                ClickableSpan World = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.World);
                    }
                };
                ClickableSpan Heresoneoflifeslittletruths = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Heresoneoflifeslittletruths);
                    }
                };
                ClickableSpan Packagedeal = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Packagedeal);
                    }
                };
                ClickableSpan View = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.View);
                    }
                };
                ClickableSpan Someoneelseslife = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someoneelseslife);
                    }
                };
                ClickableSpan Cheating = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cheating);
                    }
                };
                ClickableSpan Prettycool = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prettycool);
                    }
                };
                ClickableSpan Hangwithhim = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hangwithhim);
                    }
                };
                ClickableSpan Pain = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pain);
                    }
                };
                ClickableSpan Anybody = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anybody);
                    }
                };
                ClickableSpan Really = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Really);
                    }
                };
                ClickableSpan Awfulstuff = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Awfulstuff);
                    }
                };
                ClickableSpan Dealwith = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dealwith);
                    }
                };
                ClickableSpan Battle = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Battle);
                    }
                };
                ClickableSpan Deadrockstars = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deadrockstars);
                    }
                };
                ClickableSpan Hard = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hard);
                    }
                };
                ClickableSpan Faceit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Faceit);
                    }
                };
                ClickableSpan Sellout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sellout);
                    }
                };
                ClickableSpan Biggestvenues = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Biggestvenues);
                    }
                };
                ClickableSpan PrimetimeTVshow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.PrimetimeTVshow);
                    }
                };
                ClickableSpan Viewers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Viewers);
                    }
                };
                ClickableSpan Half = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Half);
                    }
                };
                ClickableSpan Myself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Myself);
                    }
                };
                ClickableSpan Imdoingokay = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Imdoingokay);
                    }
                };
                ClickableSpan Try = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Try);
                    }
                };


                int ida1 = text.indexOf("Do you ever look");
                int ida2 = text.indexOf("I wish");
                int ida3 = text.indexOf("Everybody");
                int ida4 = text.indexOf("bet");
                int ida5 = text.indexOf("compared");
                int ida6 = text.indexOf("yourself");
                int ida7 = text.indexOf("do");
                int ida8 = text.indexOf("own");
                int ida9 = text.indexOf("middle");
                int ida10 = text.indexOf("as big as"); //10
                int ida11 = text.indexOf("pretty");
                int ida12 = text.indexOf("Here’s why");
                int ida13 = text.indexOf("people");
                int ida14 = text.indexOf("whole");
                int ida15 = text.indexOf("trick");
                int ida16 = text.indexOf("Here’s what I mean");

                int ida18 = text.indexOf("happiness");
                int ida19 = text.indexOf("were based");
                int ida20 = text.indexOf("biggest"); //20✓
                int ida21 = text.indexOf("business");
                int ida22 = text.indexOf("I’d be mad");
                int ida23 = text.indexOf("whoever");
                int ida24 = text.indexOf("He beats me");
                int ida25 = text.indexOf("rich");
                int ida26 = text.indexOf("a lot");
                int ida27 = text.indexOf("like");
                int ida28 = text.indexOf("there were");
                int ida29 = text.indexOf("richer");
                int ida30 = text.indexOf("never");//30✓
                int ida31 = text.indexOf("measure");
                int ida32 = text.indexOf("constitutes");
                int ida33 = text.indexOf("success");
                int ida34 = text.indexOf("entertainment");
                int ida35 = text.indexOf("All through");
                int ida36 = text.indexOf("career");
                int ida37 = text.indexOf("customers");
                int ida38 = text.indexOf("someday");
                int ida39 = text.indexOf("you’ll be");
                int ida40 = text.indexOf("successful");//40
                int ida41 = text.indexOf("top guy");
                int ida42 = text.indexOf("someone");
                int ida43 = text.indexOf("they’re");
                int ida44 = text.indexOf("disease");
                int ida45 = text.indexOf("save");
                int ida46 = text.indexOf("just like");
                int ida47 = text.indexOf("lawyer");
                int ida48 = text.indexOf("crazy");
                int ida49 = text.indexOf("making a living");
                int ida50 = text.indexOf("pursuing");//50
                int ida51 = text.indexOf("finding meaning");
                int ida52 = text.indexOf("what");
                int ida53 = text.indexOf("first");
                int ida54 = text.indexOf("standup");
                int ida55 = text.indexOf("nobody");
                int ida56 = text.indexOf("tuned-out crowds");
                int ida57 = text.indexOf("before");
                int ida58 = text.indexOf("jokes");
                int ida59 = text.indexOf("laughing");
                int ida60 = text.indexOf("about");//60
                int ida61 = text.indexOf("sold out houses");
                int ida62 = text.indexOf("I wasn’t playing");
                int ida63 = text.indexOf("big paydays");
                int ida64 = text.indexOf("able");
                int ida65 = text.indexOf("their");
                int ida66 = text.indexOf("dark");
                int ida67 = text.indexOf("struggles");
                int ida68 = text.indexOf("envy");
                int ida69 = text.indexOf("went along with it");
                int ida70 = text.indexOf("factor");//70
                int ida71 = text.indexOf("sort of");
                int ida72 = text.indexOf("mix-and-match game");
                int ida73 = text.indexOf("world");
                int ida74 = text.indexOf("Here’s one of life’s little truths");
                int ida75 = text.indexOf("package deal");
                int ida76 = text.indexOf("view");
                int ida77 = text.indexOf("someone else’s life");
                int ida78 = text.indexOf("cheating");
                int ida79 = text.indexOf("pretty cool");
                int ida80 = text.indexOf("hang with him");
                int ida81 = text.indexOf("pain");//80
                int ida82 = text.indexOf("anybody");
                int ida83 = text.indexOf("really");
                int ida84 = text.indexOf("awful stuff");
                int ida85 = text.indexOf("deal with");
                int ida86 = text.indexOf("battle");
                int ida87 = text.indexOf("dead rock stars");
                int ida88 = text.indexOf("hard");
                int ida89 = text.indexOf("Face it");
                int ida90 = text.indexOf("sell out");
                int ida91 = text.indexOf("biggest venues");//90
                int ida92 = text.indexOf("prime-time TV show");
                int ida93 = text.indexOf("viewers");
                int ida94 = text.indexOf("half");
                int ida95 = text.indexOf("myself");
                int ida96 = text.indexOf("I’m doing okay");
                int ida97 = text.indexOf("try");




                ss.setSpan(Doyoueverlook, ida1, ida1 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Iwish, ida2, ida2 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Everybody, ida3, ida3 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bet, ida4, ida4 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Compared, ida5, ida5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Yourself, ida6, ida6 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Do, ida7, ida7 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Own, ida8, ida8 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Middle, ida9, ida9 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Asbigas, ida10, ida10 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //10
                ss.setSpan(Pretty, ida11, ida11 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hereswhy, ida12, ida12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(People, ida13, ida13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whole, ida14, ida14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Trick, ida15, ida15 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(HereswhatImean, ida16, ida16 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss.setSpan(Happiness, ida18, ida18 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Werebased, ida19, ida19 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Biggest, ida20, ida20 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //20
                ss.setSpan(Business, ida21, ida21 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Idbemad, ida22, ida22 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whoever, ida23, ida23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hebeastme, ida24, ida24 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rich, ida25, ida25 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Alot, ida26, ida26 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Like, ida27, ida27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Therewere, ida28, ida28 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Richer, ida29, ida29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Never, ida30, ida30 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Measure, ida31, ida31 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss.setSpan(Constitutes, ida32, ida32 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Success, ida33, ida33 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Entertainment, ida34, ida34 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Allthrough, ida35, ida35 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Career, ida36, ida36 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Customers, ida37, ida37 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Someday, ida38, ida38 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Youllbe, ida39, ida39 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Successful, ida40, ida40 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss.setSpan(Topguy, ida41, ida41 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Someone, ida42, ida42 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Theyre, ida43, ida43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Disease, ida44, ida44 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Save, ida45, ida45 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Justlike, ida46, ida46 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Lawyer, ida47, ida47 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Crazy, ida48, ida48 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Makingaliving, ida49, ida49 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Pursuing, ida50, ida50 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss.setSpan(Findingmeaning, ida51, ida51 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(What, ida52, ida52 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(First, ida53, ida53 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Standup, ida54, ida54 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Nobody, ida55, ida55 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Tunedoutcrowds, ida56, ida56 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Before, ida57, ida57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Jokes, ida58, ida58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Laughing, ida59, ida59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(about, ida60, ida60 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss.setSpan(Soldouthouses, ida61, ida61 +15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Iwasntplaying, ida62, ida62 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bigpayday, ida63, ida63 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Able, ida64, ida64 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Their, ida65, ida65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Dark, ida66, ida66 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Struggle, ida67, ida67 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Envy, ida68, ida68 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wentalongwithit, ida69, ida69 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Factor, ida70, ida70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss.setSpan(Sortof, ida71, ida71 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Mixandmatchgame, ida72, ida72 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(World, ida73, ida73 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Heresoneoflifeslittletruths, ida74, ida74 + 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Packagedeal, ida75, ida75 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(View, ida76, ida76 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Someoneelseslife, ida77, ida77 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Cheating, ida78, ida78 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Prettycool, ida79, ida79 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hangwithhim, ida80, ida80 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss.setSpan(Pain, ida81, ida81 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Anybody, ida82, ida82 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Really, ida83, ida83 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Awfulstuff, ida84, ida84 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Dealwith, ida85, ida85 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Battle, ida86, ida86 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Deadrockstars, ida87, ida87 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hard, ida88, ida88 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Faceit, ida89, ida89 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Sellout, ida90, ida90 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss.setSpan(Biggestvenues, ida91, ida91 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(PrimetimeTVshow, ida92, ida92 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Viewers, ida93, ida93 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Half, ida94, ida94 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Myself, ida95, ida95 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Imdoingokay, ida96, ida96 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Try, ida97, ida97 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            case "Fix Yourself":


                ClickableSpan Blamingothers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Blamingothers);
                    }
                };
                ClickableSpan Wasteoftime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wasteoftime);
                    }
                };
                ClickableSpan That3 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.That3);
                    }
                };
                ClickableSpan Learn = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Learn);
                    }
                };
                ClickableSpan Anything = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anything);
                    }
                };
                ClickableSpan Grow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Grow);
                    }
                };
                ClickableSpan Mature = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mature);
                    }
                };
                ClickableSpan Thus = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thus);
                    }
                };
                ClickableSpan Life = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Life);
                    }
                };
                ClickableSpan Better1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Better1);
                    }
                };//10
                ClickableSpan As = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.As);
                    }
                };
                ClickableSpan Thereare = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thereare);
                    }
                };
                ClickableSpan Attitudes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Attitudes);
                    }
                };
                ClickableSpan Toward = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Toward);
                    }
                };
                ClickableSpan Sorrows = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sorrows);
                    }
                };
                ClickableSpan Those1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Those1);
                    }
                };
                ClickableSpan First1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.First1);
                    }
                };
                ClickableSpan World1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.World1);
                    }
                };
                ClickableSpan Second = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Second);
                    }
                };
                ClickableSpan Differently = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Differently);
                    }
                };//20
                ClickableSpan Couple = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Couple);
                    }
                };
                ClickableSpan Onthebrink = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Onthebrink);
                    }
                };
                ClickableSpan Theyre1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theyre1);
                    }
                };
                ClickableSpan Hurt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hurt);
                    }
                };
                ClickableSpan Angry = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Angry);
                    }
                };
                ClickableSpan Unhappy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unhappy);
                    }
                };
                ClickableSpan Bitter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bitter);
                    }
                };
                ClickableSpan Husband = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Husband);
                    }
                };
                ClickableSpan Recalls = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Recalls);
                    }
                };
                ClickableSpan Things = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Things);
                    }
                };//30
                ClickableSpan Wife = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wife);
                    }
                };
                ClickableSpan Reasons = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Reasons);
                    }
                };
                ClickableSpan Nolongerlivewithher = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nolongerlivewithher);
                    }
                };
                ClickableSpan Harried = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Harried);
                    }
                };
                ClickableSpan Disillusioned = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Disillusioned);
                    }
                };
                ClickableSpan All1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.All1);
                    }
                };
                ClickableSpan Ways = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Ways);
                    }
                };
                ClickableSpan Letherdown = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Letherdown);
                    }
                };
                ClickableSpan Each = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Each);
                    }
                };
                ClickableSpan Changes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Changes);
                    }
                };//40
                ClickableSpan Prospects = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prospects);
                    }
                };
                ClickableSpan Grim = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Grim);
                    }
                };
                ClickableSpan Arent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Arent);
                    }
                };
                ClickableSpan Youre = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Youre);
                    }
                };
                ClickableSpan Cant = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cant);
                    }
                };
                ClickableSpan Yourself1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Yourself1);
                    }
                };
                ClickableSpan Courage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Courage);
                    }
                };
                ClickableSpan Easier = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Easier);
                    }
                };
                ClickableSpan Muchmore = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Muchmore);
                    }
                };
                ClickableSpan Gratifying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gratifying);
                    }
                };//50
                ClickableSpan Basest = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Basest);
                    }
                };
                ClickableSpan Desires = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Desires);
                    }
                };
                ClickableSpan Someoneelse = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someoneelse);
                    }
                };
                ClickableSpan Youthful = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Youthful);
                    }
                };
                ClickableSpan Makingastatement = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Makingastatement);
                    }
                };
                ClickableSpan Against = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Against);
                    }
                };
                ClickableSpan Smashing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Smashing);
                    }
                };
                ClickableSpan Storefront = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Storefront);
                    }
                };
                ClickableSpan Business1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Business);
                    }
                };
                ClickableSpan Otherthan = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Otherthan);
                    }
                };//60
                ClickableSpan Bring = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bring);
                    }
                };
                ClickableSpan Harm = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Harm);
                    }
                };
                ClickableSpan Whohavenothingtodo = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whohavenothingtodo);
                    }
                };
                ClickableSpan Guilt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Guilt);
                    }
                };
                ClickableSpan Doubt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doubt);
                    }
                };
                ClickableSpan Shame = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shame);
                    }
                };
                ClickableSpan Inevitably = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inevitably);
                    }
                };
                ClickableSpan Suppressed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Suppressed);
                    }
                };
                ClickableSpan Beliefs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Beliefs);
                    }
                };
                ClickableSpan Unchanged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unchanged);
                    }
                };//70
                ClickableSpan Foster = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Foster);
                    }
                };
                ClickableSpan Anger = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anger);
                    }
                };
                ClickableSpan Alienation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Alienation);
                    }
                };
                ClickableSpan Play = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Play);
                    }
                };
                ClickableSpan Characters = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Characters);
                    }
                };
                ClickableSpan Veryhardtime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Veryhardtime);
                    }
                };
                ClickableSpan Profound = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Profound);
                    }
                };
                ClickableSpan Unhappiness = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unhappiness);
                    }
                };
                ClickableSpan Suffering = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Suffering);
                    }
                };
                ClickableSpan Own1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Own1);
                    }
                };//80
                ClickableSpan Fault = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fault);
                    }
                };
                ClickableSpan Takenaback = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Takenaback);
                    }
                };
                ClickableSpan If1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.If1);
                    }
                };
                ClickableSpan Herfault = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Herfault);
                    }
                };
                ClickableSpan Shes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shes);
                    }
                };
                ClickableSpan Doomed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doomed);
                    }
                };
                ClickableSpan Herself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Herself);
                    }
                };
                ClickableSpan Seem = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Seem);
                    }
                };
                ClickableSpan Consigned = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Consigned);
                    }
                };
                ClickableSpan Fate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fate);
                    }
                };//90
                ClickableSpan Mostofus = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mostofus);
                    }
                };
                ClickableSpan Chance = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Chance);
                    }
                };
                ClickableSpan Questions = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Questions);
                    }
                };
                ClickableSpan Full = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Full);
                    }
                };
                ClickableSpan Advantage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Advantage);
                    }
                };
                ClickableSpan Answer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Answer);
                    }
                };
                ClickableSpan Try1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Try1);
                    }
                };
                ClickableSpan Stopdoing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Stopdoing);
                    }
                };
                ClickableSpan Wrong = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wrong);
                    }
                };
                ClickableSpan Waste = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Waste);
                    }
                };//100
                ClickableSpan Inopportunequestioning  = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inopportunequestioning);
                    }
                };
                ClickableSpan Without = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Without);
                    }
                };
                ClickableSpan Enlightening = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Enlightening);
                    }
                };
                ClickableSpan Deflect = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deflect);
                    }
                };
                ClickableSpan Something = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Something);
                    }
                };
                ClickableSpan Right = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Right);
                    }
                };
                ClickableSpan Payingattention = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Payingattention);
                    }
                };
                ClickableSpan Showuplate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Showuplate);
                    }
                };
                ClickableSpan Spend = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Spend);
                    }
                };
                ClickableSpan Itsnotamatter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Itsnotamatter);
                    }
                };//110
                ClickableSpan Some = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Some);
                    }
                };
                ClickableSpan Imposed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Imposed);
                    }
                };
                ClickableSpan Whatcouldyouputright = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whatcouldyouputright);
                    }
                };
                ClickableSpan Rightnow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rightnow);
                    }
                };
                ClickableSpan Gettoworkontime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gettoworkontime);
                    }
                };
                ClickableSpan Diligently = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Diligently);
                    }
                };
                ClickableSpan Utilize = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Utilize);
                    }
                };
                ClickableSpan Peaceful = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Peaceful);
                    }
                };
                ClickableSpan Productive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Productive);
                    }
                };
                ClickableSpan Desirable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Desirable);
                    }
                };//120
                ClickableSpan Weeks = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Weeks);
                    }
                };
                ClickableSpan Months = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Months);
                    }
                };
                ClickableSpan Attentive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Attentive);
                    }
                };
                ClickableSpan Effort = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Effort);
                    }
                };
                ClickableSpan Yourmindwillclear = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Yourmindwillclear);
                    }
                };
                ClickableSpan Less = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Less);
                    }
                };
                ClickableSpan Path = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Path);
                    }
                };
                ClickableSpan Infront = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Infront);
                    }
                };
                ClickableSpan Willshine = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Willshine);
                    }
                };
                ClickableSpan Brightly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Brightly);
                    }
                };//130
                ClickableSpan Gettingyourownway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gettingyourownway);
                    }
                };
                ClickableSpan Instead = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Instead);
                    }
                };
                ClickableSpan Troubletoyourself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Troubletoyourself);
                    }
                };
                ClickableSpan Society = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Society);
                    }
                };
                ClickableSpan Suffer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Suffer);
                    }
                };
                ClickableSpan Thatsthepriceofbeingalive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thatsthepriceofbeingalive);
                    }
                };
                ClickableSpan Maybe = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Maybe);
                    }
                };
                ClickableSpan Enough = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Enough);
                    }
                };
                ClickableSpan Burden = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Burden);
                    }
                };
                ClickableSpan Inthatfashion = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inthatfashion);
                    }
                };//140
                ClickableSpan Nobly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nobly);
                    }
                };
                ClickableSpan Purpose = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Purpose);
                    }
                };
                ClickableSpan Properway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Properway);
                    }
                };
                ClickableSpan Fix = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fix);
                    }
                };
                ClickableSpan Inthatmanner = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inthatmanner);
                    }
                };
                ClickableSpan Atleast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Atleast);
                    }
                };
                ClickableSpan Place = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Place);
                    }
                };

                int ira1 = text.indexOf("Blaming others");
                int ira2 = text.indexOf("waste of time");
                int ira3 = text.indexOf("that");
                int ira4 = text.indexOf("learn");
                int ira5 = text.indexOf("anything");
                int ira6 = text.indexOf("grow");
                int ira7 = text.indexOf("mature");
                int ira8 = text.indexOf("Thus");
                int ira9 = text.indexOf("life");
                int ira10 = text.indexOf("better");//10
                int ira11 = text.indexOf("as");
                int ira12 = text.indexOf("there are");
                int ira13 = text.indexOf("attitudes");
                int ira14 = text.indexOf("toward");
                int ira15 = text.indexOf("sorrows");
                int ira16 = text.indexOf("Those");
                int ira17 = text.indexOf("first");
                int ira18 = text.indexOf("world");
                int ira19 = text.indexOf("second");
                int ira20 = text.indexOf("differently");//20
                int ira21 = text.indexOf("couple");
                int ira22 = text.indexOf("on the brink");
                int ira23 = text.indexOf("They’re");
                int ira24 = text.indexOf("hurt");
                int ira25 = text.indexOf("angry");
                int ira26 = text.indexOf("unhappy");
                int ira27 = text.indexOf("bitter");
                int ira28 = text.indexOf("husband");
                int ira29 = text.indexOf("recalls");
                int ira30 = text.indexOf("things");//30
                int ira31 = text.indexOf("wife");
                int ira32 = text.indexOf("reasons");
                int ira33 = text.indexOf("no longer live with her");
                int ira34 = text.indexOf("harried");
                int ira35 = text.indexOf("disillusioned");
                int ira36 = text.indexOf("all");
                int ira37 = text.indexOf("ways");
                int ira38 = text.indexOf("let her down");
                int ira39 = text.indexOf("Each");
                int ira40 = text.indexOf("changes");//40
                int ira41 = text.indexOf("prospects");
                int ira42 = text.indexOf("grim");
                int ira43 = text.indexOf("aren’t");
                int ira44 = text.indexOf("You’re");
                int ira45 = text.indexOf("can’t");
                int ira46 = text.indexOf("yourself");
                int ira47 = text.indexOf("courage");
                int ira48 = text.indexOf("easier");
                int ira49 = text.indexOf("much more");
                int ira50 = text.indexOf("gratifying");//50
                int ira51 = text.indexOf("basest");
                int ira52 = text.indexOf("desires");
                int ira53 = text.indexOf("someone else");
                int ira54 = text.indexOf("youthful");
                int ira55 = text.indexOf("making a statement");
                int ira56 = text.indexOf("against");
                int ira57 = text.indexOf("smashing");
                int ira58 = text.indexOf("storefront");
                int ira59 = text.indexOf("business");
                int ira60 = text.indexOf("other than");//60
                int ira61 = text.indexOf("bring");
                int ira62 = text.indexOf("harm");
                int ira63 = text.indexOf("who have nothing to do");
                int ira64 = text.indexOf("guilt");
                int ira65 = text.indexOf("doubt");
                int ira66 = text.indexOf("shame");
                int ira67 = text.indexOf("inevitably");
                int ira68 = text.indexOf("suppressed");
                int ira69 = text.indexOf("beliefs");
                int ira70 = text.indexOf("unchanged");//70
                int ira71 = text.indexOf("foster");
                int ira72 = text.indexOf("anger");
                int ira73 = text.indexOf("alienation");
                int ira74 = text.indexOf("play");
                int ira75 = text.indexOf("characters");
                int ira76 = text.indexOf("very hard time");
                int ira77 = text.indexOf("profound");
                int ira78 = text.indexOf("unhappiness");
                int ira79 = text.indexOf("suffering");
                int ira80 = text.indexOf("own");//80
                int ira81 = text.indexOf("fault");
                int ira82 = text.indexOf("Taken aback");
                int ira83 = text.indexOf("if");
                int ira84 = text.indexOf("her fault");
                int ira85 = text.indexOf("she’s");
                int ira86 = text.indexOf("doomed");
                int ira87 = text.indexOf("herself");
                int ira88 = text.indexOf("seem");
                int ira89 = text.indexOf("consigned");
                int ira90 = text.indexOf("fate");//90
                int ira91 = text.indexOf("most of us");
                int ira92 = text.indexOf("chance");
                int ira93 = text.indexOf("questions");
                int ira94 = text.indexOf("full");
                int ira95 = text.indexOf("advantage");
                int ira96 = text.indexOf("answer");
                int ira97 = text.indexOf("try");
                int ira98 = text.indexOf("stop doing");
                int ira99 = text.indexOf("wrong");
                int ira100 = text.indexOf("waste");//100
                int ira101 = text.indexOf("Inopportune questioning");
                int ira102 = text.indexOf("without");
                int ira103 = text.indexOf("enlightening");
                int ira104 = text.indexOf("deflect");
                int ira105 = text.indexOf("something");
                int ira106 = text.indexOf("right");
                int ira107 = text.indexOf("paying attention");
                int ira108 = text.indexOf("show up late");
                int ira109 = text.indexOf("spend");
                int ira110 = text.indexOf("It’s not a matter");//110
                int ira111 = text.indexOf("some");
                int ira112 = text.indexOf("imposed");
                int ira113 = text.indexOf("What could you put right");
                int ira114 = text.indexOf("right now");
                int ira115 = text.indexOf("Get to work on time");
                int ira116 = text.indexOf("Diligently");
                int ira117 = text.indexOf("utilize");
                int ira118 = text.indexOf("peaceful");
                int ira119 = text.indexOf("productive");
                int ira120 = text.indexOf("desirable");//120
                int ira121 = text.indexOf("weeks");
                int ira122 = text.indexOf("months");
                int ira123 = text.indexOf("attentive");
                int ira124 = text.indexOf("effort");
                int ira125 = text.indexOf("your mind will clear");
                int ira126 = text.indexOf("less");
                int ira127 = text.indexOf("path");
                int ira128 = text.indexOf("in front");
                int ira129 = text.indexOf("will shine");
                int ira130 = text.indexOf("brightly");//130
                int ira131 = text.indexOf("getting in your own way");
                int ira132 = text.indexOf("Instead");
                int ira133 = text.indexOf("trouble to yourself");
                int ira134 = text.indexOf("society");
                int ira135 = text.indexOf("suffer");
                int ira136 = text.indexOf("That’s the price of being alive");
                int ira137 = text.indexOf("maybe");
                int ira138 = text.indexOf("enough");
                int ira139 = text.indexOf("burden");
                int ira140 = text.indexOf("in that fashion");//140
                int ira141 = text.indexOf("nobly");
                int ira142 = text.indexOf("purpose");
                int ira143 = text.indexOf("proper way");
                int ira144 = text.indexOf("fix");
                int ira145 = text.indexOf("in that manner");
                int ira146 = text.indexOf("at least");
                int ira147 = text.indexOf("place");

                ss.setSpan(Blamingothers, ira1, ira1 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wasteoftime, ira2, ira2 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(That3, ira3, ira3 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Learn, ira4, ira4 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Anything, ira5, ira5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Grow, ira6, ira6 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Mature, ira7, ira7 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thus, ira8, ira8 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Life, ira9, ira9 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Better1, ira10, ira10 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss.setSpan(As, ira11, ira11 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thereare, ira12, ira12 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Attitudes, ira13, ira13 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Toward, ira14, ira14 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Sorrows, ira15, ira15 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Those1, ira16, ira16 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(First1, ira17, ira17 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(World1, ira18, ira18 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Second, ira19, ira19 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Differently, ira20, ira20 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss.setSpan(Couple, ira21, ira21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Onthebrink, ira22, ira22 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Theyre1, ira23, ira23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hurt, ira24, ira24 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Angry, ira25, ira25 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unhappy, ira26, ira26 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bitter, ira27, ira27 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Husband, ira28, ira28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Recalls, ira29, ira29 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Things, ira30, ira30 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss.setSpan(Wife, ira31, ira31 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Reasons, ira32, ira32 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Nolongerlivewithher, ira33, ira33 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Harried, ira34, ira34 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Disillusioned, ira35, ira35 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(All1, ira36, ira36 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Ways, ira37, ira37 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Letherdown, ira38, ira38 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Each, ira39, ira39 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Changes, ira40, ira40 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss.setSpan(Prospects, ira41, ira41 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Grim, ira42, ira42 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Arent, ira43, ira43 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Youre, ira44, ira44 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Cant, ira45, ira45 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Yourself1, ira46, ira46 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Courage, ira47, ira47 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Easier, ira48, ira48 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Muchmore, ira49, ira49 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Gratifying, ira50, ira50 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss.setSpan(Basest, ira51, ira51 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Desires, ira52, ira52 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Someoneelse, ira53, ira53 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Youthful, ira54, ira54 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Makingastatement, ira55, ira55 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Against, ira56, ira56 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Smashing, ira57, ira57 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Storefront, ira58, ira58 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Business1, ira59, ira59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Otherthan, ira60, ira60 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss.setSpan(Bring, ira61, ira61 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Harm, ira62, ira62 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whohavenothingtodo, ira63, ira63 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Guilt, ira64, ira64 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Doubt, ira65, ira65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Shame, ira66, ira66 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Inevitably, ira67, ira67 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Suppressed, ira68, ira68 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Beliefs, ira69, ira69 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unchanged, ira70, ira70 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss.setSpan(Foster, ira71, ira71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Anger, ira72, ira72 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Alienation, ira73, ira73 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Play, ira74, ira74 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Characters, ira75, ira75 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Veryhardtime, ira76, ira76 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Profound, ira77, ira77 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unhappiness, ira78, ira78 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Suffering, ira79, ira79 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Own1, ira80, ira80 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss.setSpan(Fault, ira81, ira81 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Takenaback, ira82, ira82 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(If1, ira83, ira83 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Herfault, ira84, ira84 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Shes, ira85, ira85 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Doomed, ira86, ira86 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Herself, ira87, ira87 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Seem, ira88, ira88 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Consigned, ira89, ira89 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Fate, ira90, ira90 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss.setSpan(Mostofus, ira91, ira91 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Chance, ira92, ira92 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Questions, ira93, ira93 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Full, ira94, ira94 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Advantage, ira95, ira95 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Answer, ira96, ira96 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Try1, ira97, ira97 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Stopdoing, ira98, ira98 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wrong, ira99, ira99 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Waste, ira100, ira100 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//100
                ss.setSpan(Inopportunequestioning, ira101, ira101 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Without, ira102, ira102 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Enlightening, ira103, ira103 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Deflect, ira104, ira104 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Something, ira105, ira105 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Right, ira106, ira106 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Payingattention, ira107, ira107 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Showuplate, ira108, ira108 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Spend, ira109, ira109 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Itsnotamatter, ira110, ira110 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//110
                ss.setSpan(Some, ira111, ira111 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Imposed, ira112, ira112 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whatcouldyouputright, ira113, ira113 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rightnow, ira114, ira114 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Gettoworkontime, ira115, ira115 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Diligently, ira116, ira116 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Utilize, ira117, ira117 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Peaceful, ira118, ira118 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Productive, ira119, ira119 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Desirable, ira120, ira120 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//120
                ss.setSpan(Weeks, ira121, ira121 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Months, ira122, ira122 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Attentive, ira123, ira123 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Effort, ira124, ira124 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Yourmindwillclear, ira125, ira125 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Less, ira126, ira126 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Path, ira127, ira127 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Infront, ira128, ira128 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Willshine, ira129, ira129 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Brightly, ira130, ira130 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//130
                ss.setSpan(Gettingyourownway, ira131, ira131 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Instead, ira132, ira132 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Troubletoyourself, ira133, ira133 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Society, ira134, ira134 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Suffer, ira135, ira135 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thatsthepriceofbeingalive, ira136, ira136 + 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Maybe, ira137, ira137 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Enough, ira138, ira138 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Burden, ira139, ira139 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Inthatfashion, ira140, ira140 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//140
                ss.setSpan(Nobly, ira141, ira141 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Purpose, ira142, ira142 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Properway, ira143, ira143 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Fix, ira144, ira144 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Inthatmanner, ira145, ira145 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Atleast, ira146, ira146 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Place, ira147, ira147 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            //Are Men and Women Different?
            case "Are Men and Women Different?":


                ClickableSpan Delusion = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Delusion);
                    }
                };
                ClickableSpan Discerning = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Discerning);
                    }
                };
                ClickableSpan Intimate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Intimate);
                    }
                };
                ClickableSpan Violated = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Violated);
                    }
                };
                ClickableSpan Vulnerable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Vulnerable);
                    }
                };
                ClickableSpan Confined = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Confined);
                    }
                };
                ClickableSpan Satisfying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Intimate);
                    }
                };
                ClickableSpan Emotionally = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Emotionally);
                    }
                };
                ClickableSpan Psychologically = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Psychologically);
                    }
                };
                ClickableSpan Physically = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Physically);
                    }
                };
                ClickableSpan Spiritually = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Spiritually);
                    }
                };
                ClickableSpan Commonsense = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commonsense);
                    }
                };
                ClickableSpan Agenda = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Agenda);
                    }
                };
                ClickableSpan Sociology = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sociology);
                    }
                };
                ClickableSpan Anthropology = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anthropology);
                    }
                };
                ClickableSpan Genderstudies = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Genderstudies);
                    }
                };
                ClickableSpan Spectrum = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Spectrum);
                    }
                };
                ClickableSpan Internalfeelings = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sociology);
                    }
                };
                ClickableSpan Toytrucks = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Toytrucks);
                    }
                };
                ClickableSpan Pinkandbluestereotype = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pinkandbluestereotype);
                    }
                };
                ClickableSpan Reality = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Reality);
                    }
                };
                ClickableSpan Collegeentertainment = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Collegeentertainment);
                    }
                };
                ClickableSpan Makingstuffup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Makingstuffup);
                    }
                };
                ClickableSpan Pushinganagenda = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pushinganagenda);
                    }
                };
                ClickableSpan Traditionally = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Traditionally);
                    }
                };
                ClickableSpan Marriage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Marriage);
                    }
                };
                ClickableSpan Experience = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Experience);
                    }
                };
                ClickableSpan Research = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Research);
                    }
                };
                ClickableSpan Associateprofessor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Associateprofessor);
                    }
                };
                ClickableSpan Theology = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theology);
                    }
                };
                ClickableSpan Philosophy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Philosophy);
                    }
                };
                ClickableSpan Beachball = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Beachball);
                    }
                };
                ClickableSpan Distinctnature = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Distinctnature);
                    }
                };
                ClickableSpan Bodyparts = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bodyparts);
                    }
                };
                ClickableSpan Biology = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Biology);
                    }
                };
                ClickableSpan Hormones = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hormones);
                    }
                };
                ClickableSpan Expressemotions = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Expressemotions);
                    }
                };
                ClickableSpan Needs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Needs);
                    }
                };
                ClickableSpan Desires2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Needs);
                    }
                };
                ClickableSpan Uninvitedtouch = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Uninvitedtouch);
                    }
                };
                ClickableSpan Leg = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Leg);
                    }
                };
                ClickableSpan HollywoodReporter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.HollywoodReporter);
                    }
                };
                ClickableSpan CoStar = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.CoStar);
                    }
                };
                ClickableSpan Actingout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Actingout);
                    }
                };
                ClickableSpan Commonsense2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commonsense2);
                    }
                };
                ClickableSpan Rememberthebeachball = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rememberthebeachball);
                    }
                };

                int prpd1 = text.indexOf("delusion");
                int prpd2 = text.indexOf("discerning");
                int prpd4 = text.indexOf("intimate");
                int prpd5 = text.indexOf("violated");
                int prpd6 = text.indexOf("vulnerable");
                int prpd7 = text.indexOf("confined");
                int prpd8 = text.indexOf("satisfying");
                int prpd9 = text.indexOf("emotionally");
                int prpd10 = text.indexOf("psychologically");
                int prpd11 = text.indexOf("physically");
                int prpd12 = text.indexOf("common sense");
                int prpd13 = text.indexOf("agenda");
                int prpd14 = text.indexOf("sociology");
                int prpd15 = text.indexOf("anthropology");
                int prpd16 = text.indexOf("gender studies");
                int prpd17 = text.indexOf("spectrum");
                int prpd18 = text.indexOf("internal feelings");
                int prpd19 = text.indexOf("toy trucks");
                int prpd20 = text.indexOf("pink and blue stereotype");
                int prpd21 = text.indexOf("reality");
                int prpd22 = text.indexOf("college entertainment");
                int prpd23 = text.indexOf("making stuff up");
                int prpd24 = text.indexOf("pushing an agenda");
                int prpd25 = text.indexOf("traditionally");
                int prpd26 = text.indexOf("marriage");
                int prpd27 = text.indexOf("experience");
                int prpd28 = text.indexOf("research");
                int prpd29 = text.indexOf("Associate Professor");
                int prpd30 = text.indexOf("Theology");
                int prpd31 = text.indexOf("Philosophy");
                int prpd32 = text.indexOf("beach ball");
                int prpd33 = text.indexOf("distinct nature");
                int prpd34 = text.indexOf("body parts");
                int prpd35 = text.indexOf("biology");
                int prpd36 = text.indexOf("hormones");
                int prpd37 = text.indexOf("express emotions");
                int prpd38 = text.indexOf("needs");
                int prpd39 = text.indexOf("desires");
                int prpd40 = text.indexOf("uninvited touch");
                int prpd41 = text.indexOf("Leg");
                int prpd42 = text.indexOf("Hollywood Reporter");
                int prpd43 = text.indexOf("co-star");
                int prpd44 = text.indexOf("acting out");
                int prpd45 = text.indexOf("common sense");
                int prpd46 = text.indexOf("remember the beach ball");

                ss.setSpan(Delusion, prpd1, prpd1 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Discerning, prpd2, prpd2 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                //ss.setSpan(Supervisedcurfews, prpd3, prpd3 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Intimate, prpd4, prpd4 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Violated, prpd5, prpd5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Vulnerable, prpd6, prpd6 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Confined, prpd7, prpd7 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Satisfying, prpd8, prpd8 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Emotionally, prpd9, prpd9 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Psychologically, prpd10, prpd10 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Physically, prpd11, prpd11 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commonsense, prpd12, prpd12 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Agenda, prpd13, prpd13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Sociology, prpd14, prpd14 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Anthropology, prpd15, prpd15 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Genderstudies, prpd16, prpd16 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Spectrum, prpd17, prpd17 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Internalfeelings, prpd18, prpd18 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Toytrucks, prpd19, prpd19 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Pinkandbluestereotype, prpd20, prpd20 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Reality, prpd21, prpd21 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Collegeentertainment, prpd22, prpd22 + 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Makingstuffup, prpd23, prpd23 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Pushinganagenda, prpd24, prpd24 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Traditionally, prpd25, prpd25 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Marriage, prpd26, prpd26 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Experience, prpd27, prpd27 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Research, prpd28, prpd28 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Associateprofessor, prpd29, prpd29 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Theology, prpd30, prpd30 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Philosophy, prpd31, prpd31 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Beachball, prpd32, prpd32 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Distinctnature, prpd33, prpd33 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bodyparts, prpd34, prpd34 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Biology, prpd35, prpd35 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hormones, prpd36, prpd36 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Expressemotions, prpd37, prpd37 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Needs, prpd38, prpd38 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Desires2, prpd39, prpd39 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Uninvitedtouch, prpd40, prpd40 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Leg, prpd41, prpd41 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(HollywoodReporter, prpd42, prpd42 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(CoStar, prpd43, prpd43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Actingout, prpd44, prpd44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commonsense2, prpd45, prpd45 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rememberthebeachball, prpd46, prpd46 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            case "Don't Waste Your Time":


                ClickableSpan Date = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Date);
                    }
                };
                ClickableSpan Purpose2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Purpose2);
                    }
                };
                ClickableSpan Getmarried = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Getmarried);
                    }
                };
                ClickableSpan Toofast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Toofast);
                    }
                };
                ClickableSpan Uncomfortable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Uncomfortable);
                    }
                };
                ClickableSpan Hookup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hookup);
                    }
                };
                ClickableSpan Casualflings = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Casualflings);
                    }
                };
                ClickableSpan Havefun = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Havefun);
                    }
                };
                ClickableSpan Dontgetmewrong = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dontgetmewrong);
                    }
                };
                ClickableSpan Deeper = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deeper);
                    }
                };//10
                ClickableSpan Happiness1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Happiness);
                    }
                };
                ClickableSpan Certainly2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Certainly2);
                    }
                };
                ClickableSpan Marriage2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Marriage2);
                    }
                };
                ClickableSpan Topic = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Topic);
                    }
                };
                ClickableSpan Atleast2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Atleast2);
                    }
                };
                ClickableSpan Else = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Else);
                    }
                };
                ClickableSpan Letsfaceit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Letsfaceit);
                    }
                };
                ClickableSpan Asfasasitgoes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Asfasasitgoes);
                    }
                };
                ClickableSpan Frankly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Frankly);
                    }
                };
                ClickableSpan Smart = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Smart);
                    }
                };//20
                ClickableSpan Playout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Playout);
                    }
                };
                ClickableSpan Often = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Often);
                    }
                };
                ClickableSpan Relationship = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Relationship);
                    }
                };
                ClickableSpan Commitment = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commitment);
                    }
                };
                ClickableSpan Infact = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Infact);
                    }
                };
                ClickableSpan Arise = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Arise);
                    }
                };
                ClickableSpan Whim = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whim);
                    }
                };
                ClickableSpan Develop = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Develop);
                    }
                };
                ClickableSpan Tryout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Tryout);
                    }
                };
                ClickableSpan Less1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Less);
                    }
                };//30
                ClickableSpan Lack = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lack);
                    }
                };
                ClickableSpan Afford = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Afford);
                    }
                };
                ClickableSpan Enterprise = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Enterprise);
                    }
                };
                ClickableSpan Entirely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Entirely);
                    }
                };
                ClickableSpan Build = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Build);
                    }
                };
                ClickableSpan Shared = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shared);
                    }
                };
                ClickableSpan Beliefs2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Beliefs2);
                    }
                };
                ClickableSpan Partner = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Partner);
                    }
                };
                ClickableSpan Profound2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Profound2);
                    }
                };
                ClickableSpan Understandings = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Understandings);
                    }
                };//40
                ClickableSpan Cutcome = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cutcome);
                    }
                };
                ClickableSpan Fool = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fool);
                    }
                };
                ClickableSpan Thrilled = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thrilled);
                    }
                };
                ClickableSpan Kombucha = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Kombucha);
                    }
                };
                ClickableSpan Getdownto = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Getdownto);
                    }
                };
                ClickableSpan Overthelongrun = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Overthelongrun);
                    }
                };
                ClickableSpan Stuff = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Stuff);
                    }
                };
                ClickableSpan Faith = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Faith);
                    }
                };
                ClickableSpan Sooner = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sooner);
                    }
                };
                ClickableSpan Doubt2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doubt2);
                    }
                };//50
                ClickableSpan Stuck = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Stuck);
                    }
                };
                ClickableSpan Deadendrelationships = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deadendrelationships);
                    }
                };
                ClickableSpan Articulate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Articulate);
                    }
                };
                ClickableSpan Crave = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Crave);
                    }
                };
                ClickableSpan Healthier = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Healthier);
                    }
                };
                ClickableSpan Wealthier = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wealthier);
                    }
                };
                ClickableSpan Towards = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Towards);
                    }
                };
                ClickableSpan Wasteoftime2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wasteoftime2);
                    }
                };
                ClickableSpan Between = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Between);
                    }
                };
                ClickableSpan Taketheplunge = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Taketheplunge);
                    }
                };//60
                ClickableSpan Country = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Country);
                    }
                };
                ClickableSpan Citizen = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Citizen);
                    }
                };
                ClickableSpan Thelatter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thelatter);
                    }
                };
                ClickableSpan Expectations = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Expectations);
                    }
                };
                ClickableSpan Mean = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mean);
                    }
                };
                ClickableSpan Reluctant = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Reluctant);
                    }
                };
                ClickableSpan Sign = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sign);
                    }
                };
                ClickableSpan Ruleofthumb = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Ruleofthumb);
                    }
                };
                ClickableSpan Thekindof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thekindof);
                    }
                };
                ClickableSpan Career2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Career2);
                    }
                };//70
                ClickableSpan Getitright = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Getitright);
                    }
                };

                int ila1 = text.indexOf("Date");
                int ila2 = text.indexOf("purpose");
                int ila3 = text.indexOf("Getting married");
                int ila4 = text.indexOf("too fast");
                int ila5 = text.indexOf("uncomfortable");
                int ila6 = text.indexOf("hook ups");
                int ila7 = text.indexOf("casual flings");
                int ila8 = text.indexOf("having fun");
                int ila9 = text.indexOf("Don’t get me wrong");
                int ila10 = text.indexOf("deeper");//10
                int ila11 = text.indexOf("happiness");
                int ila12 = text.indexOf("certainly");
                int ila13 = text.indexOf("marriage");
                int ila14 = text.indexOf("topic");
                int ila15 = text.indexOf("At least");
                int ila16 = text.indexOf("else");
                int ila17 = text.indexOf("Let’s face it");
                int ila18 = text.indexOf("as far as it goes");
                int ila19 = text.indexOf("frankly");
                int ila20 = text.indexOf("smart");//20
                int ila21 = text.indexOf("play out");
                int ila22 = text.indexOf("often");
                int ila23 = text.indexOf("relationships");
                int ila24 = text.indexOf("commitment");
                int ila25 = text.indexOf("in fact");
                int ila26 = text.indexOf("arise");
                int ila27 = text.indexOf("whim");
                int ila28 = text.indexOf("develop");
                int ila29 = text.indexOf("tryout");
                int ila30 = text.indexOf("less");//30
                int ila31 = text.indexOf("lack");
                int ila32 = text.indexOf("afford");
                int ila33 = text.indexOf("enterprise");
                int ila34 = text.indexOf("entirely");
                int ila35 = text.indexOf("build");
                int ila36 = text.indexOf("shared");
                int ila37 = text.indexOf("beliefs");
                int ila38 = text.indexOf("partner");
                int ila39 = text.indexOf("profound");
                int ila40 = text.indexOf("understandings");//40
                int ila41 = text.indexOf("outcome");
                int ila42 = text.indexOf("fooled");
                int ila43 = text.indexOf("thrilled");
                int ila44 = text.indexOf("kombucha");
                int ila45 = text.indexOf("get down to");
                int ila46 = text.indexOf("over the long run");
                int ila47 = text.indexOf("Stuff");
                int ila48 = text.indexOf("faith");
                int ila49 = text.indexOf("sooner");
                int ila50 = text.indexOf("doubt");//50
                int ila51 = text.indexOf("stuck");
                int ila52 = text.indexOf("dead-end relationships");
                int ila53 = text.indexOf("articulate");
                int ila54 = text.indexOf("crave");
                int ila55 = text.indexOf("healthier");
                int ila56 = text.indexOf("wealthier");
                int ila57 = text.indexOf("toward");
                int ila58 = text.indexOf("waste of time");
                int ila59 = text.indexOf("between");
                int ila60 = text.indexOf("taken the plunge");//60
                int ila61 = text.indexOf("country");
                int ila62 = text.indexOf("citizen");
                int ila63 = text.indexOf("The latter");
                int ila64 = text.indexOf("expectations");
                int ila65 = text.indexOf("means");
                int ila66 = text.indexOf("reluctant");
                int ila67 = text.indexOf("sign");
                int ila68 = text.indexOf("rule of thumb");
                int ila69 = text.indexOf("the kind of");
                int ila70 = text.indexOf("career");//70
                int ila71 = text.indexOf("get it right");



                ss.setSpan(Date, ila1, ila1 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Purpose2, ila2, ila2 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Getmarried, ila3, ila3 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Toofast, ila4, ila4 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Uncomfortable, ila5, ila5 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hookup, ila6, ila6 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Casualflings, ila7, ila7 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Havefun, ila8, ila8 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Dontgetmewrong, ila9, ila9 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Deeper, ila10, ila10 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss.setSpan(Happiness1, ila11, ila11 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Certainly2, ila12, ila12 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Marriage2, ila13, ila13 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Topic, ila14, ila14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Atleast2, ila15, ila15 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Else, ila16, ila16 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Letsfaceit, ila17, ila17 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Asfasasitgoes, ila18, ila18 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Frankly, ila19, ila19 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Smart, ila20, ila20 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss.setSpan(Playout, ila21, ila21 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Often, ila22, ila22 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Relationship, ila23, ila23 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commitment, ila24, ila24 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Infact, ila25, ila25 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Arise, ila26, ila26 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whim, ila27, ila27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Develop, ila28, ila28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Tryout, ila29, ila29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Less1, ila30, ila30 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss.setSpan(Lack, ila31, ila31 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Afford, ila32, ila32 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Enterprise, ila33, ila33 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Entirely, ila34, ila34 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Build, ila35, ila35 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Shared, ila36, ila36 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Beliefs2, ila37, ila37 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Partner, ila38, ila38 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Profound2, ila39, ila39 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Understandings, ila40, ila40 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss.setSpan(Cutcome, ila41, ila41 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Fool, ila42, ila42 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thrilled, ila43, ila43 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Kombucha, ila44, ila44 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Getdownto, ila45, ila45 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Overthelongrun, ila46, ila46 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Stuff, ila47, ila47 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Faith, ila48, ila48 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Sooner, ila49, ila49 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Doubt2, ila50, ila50 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss.setSpan(Stuck, ila51, ila51 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Deadendrelationships, ila52, ila52 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Articulate, ila53, ila53 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Crave, ila54, ila54 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Healthier, ila55, ila55 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wealthier, ila56, ila56 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Towards, ila57, ila57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Wasteoftime2, ila58, ila58 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Between, ila59, ila59 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Taketheplunge, ila60, ila60 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss.setSpan(Country, ila61, ila61 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Citizen, ila62, ila62 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thelatter, ila63, ila63 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Expectations, ila64, ila64 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Mean, ila65, ila65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Reluctant, ila66, ila66 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Sign, ila67, ila67 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Ruleofthumb, ila68, ila68 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thekindof, ila69, ila69 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Career2, ila70, ila70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss.setSpan(Getitright, ila71, ila71 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            case "How to Make Our Cities Safer":


                //COlOCAR PALABRAS CLAVE
                ClickableSpan Homicides = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Homicides);
                    }
                };

                ClickableSpan Constitutional = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Constitutional);
                    }
                };

                ClickableSpan Cohort = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cohort);
                    }
                };

                ClickableSpan Highfrequencyoffenders = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Highfrequencyoffenders);
                    }
                };

                ClickableSpan Felons = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Felons);
                    }
                };

                ClickableSpan Verticalprosecution = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Verticalprosecution);
                    }
                };

                ClickableSpan Legalerrors = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Legalerrors);
                    }
                };

                ClickableSpan Hostile = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hostile);
                    }
                };

                ClickableSpan Progressivepoliticians = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Progressivepoliticians);
                    }
                };

                ClickableSpan Incarceration = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Incarceration);
                    }
                };

                ClickableSpan Agecrimecurve = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Agecrimecurve);
                    }
                };

                ClickableSpan Circulation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Circulation);
                    }
                };

                ClickableSpan Rocketscience = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rocketscience);
                    }
                };

                ClickableSpan Streettested = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Streettested);
                    }
                };

                ClickableSpan Crimehotspots = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Crimehotspots);
                    }
                };

                ClickableSpan Potentialkillers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Potentialkillers);
                    }
                };

                ClickableSpan Potentialvictims = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Potentialvictims);
                    }
                };

                ClickableSpan Interrogates = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Interrogates);
                    }
                };

                ClickableSpan Nonfatal = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nonfatal);
                    }
                };

                ClickableSpan Organizedretailtheftrings = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Organizedretailtheftrings);
                    }
                };

                ClickableSpan Lawenforcementofficials = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lawenforcementofficials);
                    }
                };

                ClickableSpan UnitedStatesSentencingCommission = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.UnitedStatesSentencingCommission);
                    }
                };

                ClickableSpan Shatteringrecords = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shatteringrecords);
                    }
                };

                ClickableSpan Resourceandtimeintensive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Resourceandtimeintensive);
                    }
                };

                ClickableSpan Trialstage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Trialstage);
                    }
                };

                ClickableSpan Blamingeachother = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Blamingeachother);
                    }
                };

                ClickableSpan Hostiletowardsoneanother = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hostiletowardsoneanother);
                    }
                };

                ClickableSpan Sentencingguidelines = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sentencingguidelines);
                    }
                };

                ClickableSpan Violentcrimerates = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Violentcrimerates);
                    }
                };

                int ics1 = text.indexOf("homicides");
                int ics2 = text.indexOf("Constitutional");
                int ics3 = text.indexOf("high-frequency offenders");
                int ics4 = text.indexOf("Felons");
                int ics5 = text.indexOf("vertical prosecution");
                int ics6 = text.indexOf("legal errors");
                int ics7 = text.indexOf("hostile");
                int ics8 = text.indexOf("Progressive politicians");
                int ics9 = text.indexOf("incarceration");
                int ics10 = text.indexOf("age-crime curve");
                int ics11 = text.indexOf("circulation");
                int ics12 = text.indexOf("rocket science");
                int ics13 = text.indexOf("street-tested");
                int ics14 = text.indexOf("Crime “hot spots.”");
                int ics15 = text.indexOf("potential killers");
                int ics16 = text.indexOf("potential victims");
                int ics17 = text.indexOf("interrogates");
                int ics18 = text.indexOf("non-fatal");
                int ics19 = text.indexOf("organized retail theft rings");
                int ics20 = text.indexOf("vertical prosecution");
                int ics21 = text.indexOf("law enforcement officials");
                int ics22 = text.indexOf("United States Sentencing Commission");
                int ics23 = text.indexOf("shattering records");
                int ics24 = text.indexOf("resource and time intensive");
                int ics25 = text.indexOf("trial stage");
                int ics26 = text.indexOf("blaming each other");
                int ics27 = text.indexOf("hostile towards one another");
                int ics28 = text.indexOf("Progressive politicians");
                int ics29 = text.indexOf("age-crime curve");
                int ics30 = text.indexOf("rocket science");
                int ics31 = text.indexOf("violent crime rates");

                ss.setSpan(Homicides, ics1, ics1 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Constitutional, ics2, ics2 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Highfrequencyoffenders, ics3, ics3 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Felons, ics4, ics4 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Verticalprosecution, ics5, ics5 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Legalerrors, ics6, ics6 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hostile, ics7, ics7 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Progressivepoliticians, ics8, ics8 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Incarceration, ics9, ics9 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Agecrimecurve, ics10, ics10 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Circulation, ics11, ics11 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rocketscience, ics12, ics12 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Streettested, ics13, ics13 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Crimehotspots, ics14, ics14 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Potentialkillers, ics15, ics15 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Potentialvictims, ics16, ics16 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Interrogates, ics17, ics17 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Nonfatal, ics18, ics18 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Organizedretailtheftrings, ics19, ics19 + 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Verticalprosecution, ics20, ics20 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Lawenforcementofficials, ics21, ics21 + 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(UnitedStatesSentencingCommission, ics22, ics22 + 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Shatteringrecords, ics23, ics23 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Resourceandtimeintensive, ics24, ics24 + 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Trialstage, ics25, ics25 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Blamingeachother, ics26, ics26 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hostiletowardsoneanother, ics27, ics27 + 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Progressivepoliticians, ics28, ics28 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Agecrimecurve, ics29, ics29 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rocketscience, ics30, ics30 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Violentcrimerates, ics31, ics31 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            case "How to End Systemic Racism":


                ClickableSpan Racism = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Racism);
                    }
                };
                ClickableSpan Deserve = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deserve);
                    }
                };
                ClickableSpan Exposed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Exposed);
                    }
                };
                ClickableSpan Sooner2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sooner2);
                    }
                };
                ClickableSpan Just = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Just);
                    }
                };
                ClickableSpan Truth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Truth);
                    }
                };
                ClickableSpan College = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.College);
                    }
                };
                ClickableSpan Encouraged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Encouraged);
                    }
                };
                ClickableSpan Many = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Many);
                    }
                };
                ClickableSpan Government = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Government);
                    }
                };//10
                ClickableSpan Harder = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Harder);
                    }
                };
                ClickableSpan Businesses = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Businesses);
                    }
                };
                ClickableSpan Museum = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Museum);
                    }
                };
                ClickableSpan Hardwork = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hardwork);
                    }
                };
                ClickableSpan Major = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Major);
                    }
                };
                ClickableSpan Parties = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Parties);
                    }
                };
                ClickableSpan Obtaining = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Obtaining);
                    }
                };
                ClickableSpan Driverslicense = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Driverslicense);
                    }
                };
                ClickableSpan Construct = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Construct);
                    }
                };
                ClickableSpan Guaranteeing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Guaranteeing);
                    }
                };//20
                ClickableSpan Essentialskill = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Essentialskill);
                    }
                };
                ClickableSpan Failure = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Failure);
                    }
                };
                ClickableSpan Allowed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Allowed);
                    }
                };
                ClickableSpan Promoted = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Promoted);
                    }
                };
                ClickableSpan Thenextgrade = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thenextgrade);
                    }
                };
                ClickableSpan Council = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Council);
                    }
                };
                ClickableSpan Demonize = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Demonize);
                    }
                };
                ClickableSpan Budget = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Budget);
                    }
                };
                ClickableSpan Murder = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Murder);
                    }
                };
                ClickableSpan Skyrocket = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Skyrocket);
                    }
                };//30
                ClickableSpan Prosecutorsrefuse = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prosecutorsrefuse);
                    }
                };
                ClickableSpan Prosecute = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prosecute);
                    }
                };
                ClickableSpan Hardenedcriminals = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hardenedcriminals);
                    }
                };
                ClickableSpan Instead2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Instead2);
                    }
                };
                ClickableSpan Prey = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prey);
                    }
                };
                ClickableSpan Lawabiding = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lawabiding);
                    }
                };
                ClickableSpan Hardworkingcitizens = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hardworkingcitizens);
                    }
                };
                ClickableSpan Again = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Again);
                    }
                };
                ClickableSpan Few = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Few);
                    }
                };
                ClickableSpan Commonplace = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commonplace);
                    }
                };//40
                ClickableSpan Oppressive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Oppressive);
                    }
                };
                ClickableSpan Patronizing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Patronizing);
                    }
                };
                ClickableSpan Environment = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Environment);
                    }
                };
                ClickableSpan Prejudices = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prejudices);
                    }
                };
                ClickableSpan Prejudgments = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prejudgments);
                    }
                };
                ClickableSpan Goal = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Goal);
                    }
                };
                ClickableSpan Claiming = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Claiming);
                    }
                };
                ClickableSpan Instituting = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Instituting);
                    }
                };
                ClickableSpan Policies = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Policies);
                    }
                };
                ClickableSpan Holdingback = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Holdingback);
                    }
                };//50
                ClickableSpan Systemicracism = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Systemicracism);
                    }
                };
                ClickableSpan Movingforward = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Movingforward);
                    }
                };
                ClickableSpan Pluralistic = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pluralistic);
                    }
                };
                ClickableSpan Equalopportunitynation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Equalopportunitynation);
                    }
                };
                ClickableSpan Backward = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Backward);
                    }
                };
                ClickableSpan Heresthekicker = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Heresthekicker);
                    }
                };
                ClickableSpan Nasty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nasty);
                    }
                };
                ClickableSpan Bigoted = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bigoted);
                    }
                };
                ClickableSpan Misogynistic = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Misogynistic);
                    }
                };
                ClickableSpan Authoritariannationalists = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Authoritariannationalists);
                    }
                };//60
                ClickableSpan Imposingthesecrushingrules = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Imposingthesecrushingrules);
                    }
                };
                ClickableSpan Thewokeleft = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thewokeleft);
                    }
                };
                ClickableSpan Side = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Side);
                    }
                };
                ClickableSpan Revered = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Revered);
                    }
                };
                ClickableSpan Upuntil = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Upuntil);
                    }
                };
                ClickableSpan Commited = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commited);
                    }
                };
                ClickableSpan Proof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Proof);
                    }
                };
                ClickableSpan Dozens = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dozens);
                    }
                };
                ClickableSpan Overthelastfewyears = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Overthelastfewyears);
                    }
                };
                ClickableSpan Nooses = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nooses);
                    }
                };//70
                ClickableSpan Nword = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nword);
                    }
                };
                ClickableSpan Taunts = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Taunts);
                    }
                };
                ClickableSpan Faked = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Faked);
                    }
                };
                ClickableSpan Supply = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Supply);
                    }
                };
                ClickableSpan Against2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Against2);
                    }
                };
                ClickableSpan Rampant = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rampant);
                    }
                };
                ClickableSpan Raceobsessed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Raceobsessed);
                    }
                };
                ClickableSpan Unconscious = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unconscious);
                    }
                };
                ClickableSpan Smallminded = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Smallminded);
                    }
                };
                ClickableSpan Attorney = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Attorney);
                    }
                };//80
                ClickableSpan Hadnothingtodo = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hadnothingtodo);
                    }
                };
                ClickableSpan Available = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Available);
                    }
                };
                ClickableSpan Understand = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Understand);
                    }
                };
                ClickableSpan Once = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Once);
                    }
                };
                ClickableSpan Condescending = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Condescending);
                    }
                };
                ClickableSpan Outright = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Outright);
                    }
                };
                ClickableSpan Expect = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Expect);
                    }
                };
                ClickableSpan Purely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Purely);
                    }
                };
                ClickableSpan Basedon = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Basedon);
                    }
                };
                ClickableSpan Merits = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Merits);
                    }
                };//90
                ClickableSpan Equitable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Equitable);
                    }
                };
                ClickableSpan Hundred = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hundred);
                    }
                };
                ClickableSpan Realize = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Realize);
                    }
                };

                int ina1 = text.indexOf("racism");
                int ina2 = text.indexOf("deserve");
                int ina3 = text.indexOf("exposed");
                int ina4 = text.indexOf("sooner");
                int ina5 = text.indexOf("just");
                int ina6 = text.indexOf("truth");
                int ina7 = text.indexOf("colleges");
                int ina8 = text.indexOf("encouraged");
                int ina9 = text.indexOf("many");
                int ina10 = text.indexOf("government");//10
                int ina11 = text.indexOf("harder");
                int ina12 = text.indexOf("businesses");
                int ina13 = text.indexOf("museum");
                int ina14 = text.indexOf("hard work");
                int ina15 = text.indexOf("major");
                int ina16 = text.indexOf("parties");
                int ina17 = text.indexOf("obtaining");
                int ina18 = text.indexOf("driver’s license");
                int ina19 = text.indexOf("construct");
                int ina20 = text.indexOf("guaranteeing");//20
                int ina21 = text.indexOf("essential skill");
                int ina22 = text.indexOf("failure");
                int ina23 = text.indexOf("allowed");
                int ina24 = text.indexOf("promoted");
                int ina25 = text.indexOf("the next grade");
                int ina26 = text.indexOf("councils");
                int ina27 = text.indexOf("demonize");
                int ina28 = text.indexOf("budgets");
                int ina29 = text.indexOf("murder");
                int ina30 = text.indexOf("skyrocket");//30
                int ina31 = text.indexOf("Prosecutors refuse");
                int ina32 = text.indexOf("prosecute");
                int ina33 = text.indexOf("hardened criminals");
                int ina34 = text.indexOf("Instead");
                int ina35 = text.indexOf("prey");
                int ina36 = text.indexOf("law-abiding");
                int ina37 = text.indexOf("hard-working citizens");
                int ina38 = text.indexOf("again");
                int ina39 = text.indexOf("few");
                int ina40 = text.indexOf("commonplace");//40
                int ina41 = text.indexOf("oppressive");
                int ina42 = text.indexOf("patronizing");
                int ina43 = text.indexOf("environment");
                int ina44 = text.indexOf("prejudices");
                int ina45 = text.indexOf("prejudgments");
                int ina46 = text.indexOf("goal");
                int ina47 = text.indexOf("claiming");
                int ina48 = text.indexOf("instituting");
                int ina49 = text.indexOf("policies");
                int ina50 = text.indexOf("holding them back");//50
                int ina51 = text.indexOf("systemic racism");
                int ina52 = text.indexOf("moving forward");
                int ina53 = text.indexOf("pluralistic");
                int ina54 = text.indexOf("equal-opportunity nation");
                int ina55 = text.indexOf("backward");
                int ina56 = text.indexOf("here’s the kicker");
                int ina57 = text.indexOf("nasty");
                int ina58 = text.indexOf("bigoted");
                int ina59 = text.indexOf("misogynistic");
                int ina60 = text.indexOf("authoritarian nationalists");//60
                int ina61 = text.indexOf("imposing these crushing");
                int ina62 = text.indexOf("the woke left");
                int ina63 = text.indexOf("side");
                int ina64 = text.indexOf("revered");
                int ina65 = text.indexOf("up until");
                int ina66 = text.indexOf("committed");
                int ina67 = text.indexOf("proof");
                int ina68 = text.indexOf("dozens");
                int ina69 = text.indexOf("over the last few years");
                int ina70 = text.indexOf("Nooses");//70
                int ina71 = text.indexOf("N-word");
                int ina72 = text.indexOf("taunts");
                int ina73 = text.indexOf("faked");
                int ina74 = text.indexOf("supply");
                int ina75 = text.indexOf("against");
                int ina76 = text.indexOf("rampant");
                int ina77 = text.indexOf("race-obsessed");
                int ina78 = text.indexOf("unconscious");
                int ina79 = text.indexOf("small-minded");
                int ina80 = text.indexOf("Attorney");//80
                int ina81 = text.indexOf("had nothing to do");
                int ina82 = text.indexOf("available");
                int ina83 = text.indexOf("understand");
                int ina84 = text.indexOf("once");
                int ina85 = text.indexOf("condescending");
                int ina86 = text.indexOf("outright");
                int ina87 = text.indexOf("expect");
                int ina88 = text.indexOf("purely");
                int ina89 = text.indexOf("based on");
                int ina90 = text.indexOf("merits");//90
                int ina91 = text.indexOf("equitable");
                int ina92 = text.indexOf("hundred");
                int ina93 = text.indexOf("realize");

                ss.setSpan(Racism, ina1, ina1 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Deserve, ina2, ina2 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Exposed, ina3, ina3 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Sooner2, ina4, ina4 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Just, ina5, ina5 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Truth, ina6, ina6 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(College, ina7, ina7 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Encouraged, ina8, ina8 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Many, ina9, ina9 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Government, ina10, ina10 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss.setSpan(Harder, ina11, ina11 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Businesses, ina12, ina12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Museum, ina13, ina13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hardwork, ina14, ina14 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Major, ina15, ina15 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Parties, ina16, ina16 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Obtaining, ina17, ina17 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Driverslicense, ina18, ina18 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Construct, ina19, ina19 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Guaranteeing, ina20, ina20 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss.setSpan(Essentialskill, ina21, ina21 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Failure, ina22, ina22 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Allowed, ina23, ina23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Promoted, ina24, ina24 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thenextgrade, ina25, ina25 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Council, ina26, ina26 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Demonize, ina27, ina27 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Budget, ina28, ina28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Murder, ina29, ina29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Skyrocket, ina30, ina30 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss.setSpan(Prosecutorsrefuse, ina31, ina31 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Prosecute, ina32, ina32 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hardenedcriminals, ina33, ina33 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Instead2, ina34, ina34 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Prey, ina35, ina35 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Lawabiding, ina36, ina36 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hardworkingcitizens, ina37, ina37 + 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Again, ina38, ina38 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Few, ina39, ina39 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commonplace, ina40, ina40 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss.setSpan(Oppressive, ina41, ina41 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Patronizing, ina42, ina42 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Environment, ina43, ina43 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Prejudices, ina44, ina44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Prejudgments, ina45, ina45 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Goal, ina46, ina46 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Claiming, ina47, ina47 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Instituting, ina48, ina48 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Policies, ina49, ina49 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Holdingback, ina50, ina50 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss.setSpan(Systemicracism, ina51, ina51 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Movingforward, ina52, ina52 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Pluralistic, ina53, ina53 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Equalopportunitynation, ina54, ina54 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Backward, ina55, ina55 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Heresthekicker, ina56, ina56 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Nasty, ina57, ina57 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bigoted, ina58, ina58 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Misogynistic, ina59, ina59 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Authoritariannationalists, ina60, ina60 + 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss.setSpan(Imposingthesecrushingrules, ina61, ina61 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thewokeleft, ina62, ina62 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Side, ina63, ina63 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Revered, ina64, ina64 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Upuntil, ina65, ina65 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commited, ina66, ina66 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Proof, ina67, ina67 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Dozens, ina68, ina68 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Overthelastfewyears, ina69, ina69 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Nooses, ina70, ina70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss.setSpan(Nword, ina71, ina71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Taunts, ina72, ina72 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Faked, ina73, ina73 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Supply, ina74, ina74 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Against2, ina75, ina75 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Rampant, ina76, ina76 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Raceobsessed, ina77, ina77 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unconscious, ina78, ina78 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Smallminded, ina79, ina79 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Attorney, ina80, ina80 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss.setSpan(Hadnothingtodo, ina81, ina81 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Available, ina82, ina82 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Understand, ina83, ina83 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Once, ina84, ina84 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Condescending, ina85, ina85 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Outright, ina86, ina86 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Expect, ina87, ina87 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Purely, ina88, ina88 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Basedon, ina89, ina89 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Merits, ina90, ina90 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss.setSpan(Equitable, ina91, ina91 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hundred, ina92, ina92 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Realize, ina93, ina93 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                break;

            case "Should Government Bail Out Big Banks?":


                //32
                ClickableSpan Financialsector = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Financialsector);
                    }
                };

                ClickableSpan Governmentrescue = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Governmentrescue);
                    }
                };

                ClickableSpan Conventionalwisdom = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Conventionalwisdom);
                    }
                };

                ClickableSpan Shorttermpanic = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shorttermpanic);
                    }
                };

                ClickableSpan Creditmarketfreeze = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Creditmarketfreeze);
                    }
                };

                ClickableSpan TroubledAssetReliefProgram = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.TroubledAssetReliefProgram);
                    }
                };

                ClickableSpan PostDepressionbailout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.PostDepressionbailout);
                    }
                };

                ClickableSpan Commercialbank = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commercialbank);
                    }
                };

                ClickableSpan Globalbondholders = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Globalbondholders);
                    }
                };

                ClickableSpan Shorttermcreditmarkets = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shorttermcreditmarkets);
                    }
                };

                ClickableSpan Bondholders = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bondholders);
                    }
                };

                ClickableSpan Hedgefund = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hedgefund);
                    }
                };

                ClickableSpan Governmentsponsoredmortgagecompanies = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Governmentsponsoredmortgagecompanies);
                    }
                };

                ClickableSpan Financialstorm = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Financialstorm);
                    }
                };

                ClickableSpan Globalmeltdown = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Globalmeltdown);
                    }
                };

                ClickableSpan Governmentcontrol = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Governmentcontrol);
                    }
                };

                ClickableSpan Financialinstitutions = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Financialinstitutions);
                    }
                };

                ClickableSpan Creditunderpins = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Creditunderpins);
                    }
                };

                ClickableSpan Stockmarketcrash = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Stockmarketcrash);
                    }
                };

                ClickableSpan FederalReserve = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.FederalReserve);
                    }
                };

                ClickableSpan Riskmodels = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Riskmodels);
                    }
                };

                ClickableSpan Meltdown = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Meltdown);
                    }
                };

                ClickableSpan Deregulation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deregulation);
                    }
                };

                ClickableSpan Unmoored = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unmoored);
                    }
                };

                ClickableSpan Dependent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dependent);
                    }
                };

                ClickableSpan Enablingparent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Enablingparent);
                    }
                };

                ClickableSpan Bellyup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bellyup);
                    }
                };

                ClickableSpan Reckless = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Reckless);
                    }
                };

                ClickableSpan Teetered = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Teetered);
                    }
                };

                ClickableSpan Whack = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whack);
                    }
                };

                ClickableSpan Lobbyists = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lobbyists);
                    }
                };

                ClickableSpan Depressions = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Depressions);
                    }
                };

                int isg1 = text.indexOf("financial sector");
                int isg2 = text.indexOf("government rescue");
                int isg3 = text.indexOf("conventional wisdom");
                int isg4 = text.indexOf("short-term panic");
                int isg5 = text.indexOf("credit-market freeze");
                int isg6 = text.indexOf("Troubled Asset Relief Program");
                int isg7 = text.indexOf("post-Depression bailout");
                int isg8 = text.indexOf("commercial bank");
                int isg9 = text.indexOf("global bondholders");
                int isg10 = text.indexOf("short-term credit markets");
                int isg11 = text.indexOf("bondholders");
                int isg12 = text.indexOf("hedge fund");
                int isg13 = text.indexOf("government sponsored mortgage companies");
                int isg14 = text.indexOf("financial storm");
                int isg15 = text.indexOf("global meltdown");
                int isg16 = text.indexOf("government control");
                int isg17 = text.indexOf("financial institutions");
                int isg18 = text.indexOf("credit underpins");
                int isg19 = text.indexOf("stock-market crash");
                int isg20 = text.indexOf("Federal Reserve");
                int isg21 = text.indexOf("risk models");
                int isg22 = text.indexOf("meltdown");
                int isg23 = text.indexOf("deregulation");
                int isg24 = text.indexOf("unmoored");
                int isg25 = text.indexOf("dependent");
                int isg26 = text.indexOf("enabling parent");
                int isg27 = text.indexOf("belly up");
                int isg28 = text.indexOf("reckless");
                int isg29 = text.indexOf("teetered");
                int isg30 = text.indexOf("whack");
                int isg31 = text.indexOf("lobbyists");
                int isg33 = text.indexOf("Depression");

                ss.setSpan(Financialsector, isg1, isg1 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Governmentrescue, isg2, isg2 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Conventionalwisdom, isg3, isg3 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Shorttermpanic, isg4, isg4 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Creditmarketfreeze, isg5, isg5 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(TroubledAssetReliefProgram, isg6, isg6 + 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(PostDepressionbailout, isg7, isg7 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Commercialbank, isg8, isg8 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Globalbondholders, isg9, isg9 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Shorttermcreditmarkets, isg10, isg10 + 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bondholders, isg11, isg11 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Hedgefund, isg12, isg12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Governmentsponsoredmortgagecompanies, isg13, isg13 + 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Financialstorm, isg14, isg14 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Globalmeltdown, isg15, isg15 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Governmentcontrol, isg16, isg16 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Financialinstitutions, isg17, isg17 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Creditunderpins, isg18, isg18 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Stockmarketcrash, isg19, isg19 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(FederalReserve, isg20, isg20 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Riskmodels, isg21, isg21 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Meltdown, isg22, isg22 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Deregulation, isg23, isg23 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Unmoored, isg24, isg24 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Dependent, isg25, isg25 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Enablingparent, isg26, isg26 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Bellyup, isg27, isg27 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Reckless, isg28, isg28 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Teetered, isg29, isg29 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Whack, isg30, isg30 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Lobbyists, isg31, isg31 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Depressions, isg33, isg33 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
        }
        tv.setText(ss);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    //CALCULA EL PORCENTAJE
    public static double calcularPorcentaje(double total, int porcentaje, double cantidadPreg) {
        return (porcentaje * total) / cantidadPreg;
    }

    //SELECCIONA LAS PREGUNTAS
    public void preguntasSeleccionada(){
        String pregSele[];
        String RespSele [][];
        String RespuestasCorrectasSele [][];
        switch (selection) {
            case "Tutorial":
                Toast.makeText(this, "Por favor seleccione una actividad", Toast.LENGTH_SHORT).show();
                break;
            case "Black Fathers":
                pregSele = new String[]{
                        "Who did the author interview years ago?",
                        "According to President Barack Obama, what are the statistics for children who grow up without a father?",
                        "What does the Journal of Research on Adolescence confirm about kids in father-absent homes?",
                        "What is the current percentage of America's children who enter the world without a mother and father married to each other?",
                        "Were black children more likely to grow up with married parents during slavery than today?",
                        "What is the percentage of out-of-wedlock births for blacks in 2015?",
                        "What does the author attribute the decline in the presence of fathers to?",
                        "What is the name of the late named rapper?",
                        "What do psychologists call the dependency that arises from the welfare system?",
                        "What did a 1985 Los Angeles Times survey find about poor women having children to get additional benefits?",
                        "What did Tupac Shakur say he missed out on by not having a father?",
                        "What did Shakur say a man can provide that a mother cannot?",
                        "What was the author's father's occupation during the Great Depression?",
                        "What did the author's father tell him and his brothers about life?",
                        "According to the author, what is necessary for change in the absence of fathers?",
                        "Who is the author of the essay?"
                };

                RespSele = new String[][]{
                        {
                                "Martin Luther King Jr",
                                "Al Sharpton",
                                "Kweisi Mfume, the president of the NAACP",
                                "Jesse Jackson"
                        },
                        {
                                "They are five times more likely to live in poverty and commit crime; nine times more likely to drop out of school and 20 times more likely to end up in prison",
                                "They are three times more likely to live in poverty and commit crime; six times more likely to drop out of school and 15 times more likely to end up in prison",
                                "They are four times more likely to live in poverty and commit crime; eight times more likely to drop out of school and 18 times more likely to end up in prison",
                                "They are six times more likely to live in poverty and commit crime; 10 times more likely to drop out of school and 25 times more likely to end up in prison",
                        },
                        {
                                "They are less likely to engage in risky behavior",
                                "They are more likely to graduate from college",
                                "They are more likely to have stable relationships",
                                "They are more likely to end up in jail"
                        },
                        {
                                "50 percent",
                                "60 percent",
                                "41 percent",
                                "70 percent"
                        },
                        {
                                "No, they were less likely",
                                "Yes, but only slightly",
                                "Yes, significantly more likely",
                                "Yes, according to economist Walter Williams"
                        },
                        {
                                "53 percent",
                                "73 percent",
                                "63 percent",
                                "83 percent"
                        },
                        {
                                "The rise of feminism",
                                "The decrease in religious values",
                                "The welfare system that allows women to marry the government",
                                "The welfare system that allows women to marry the government",
                        },
                        {
                                "Lil Wayne",
                                "Tupac Shakur",
                                "Drake",
                                "Asap Rocky",
                        },
                        {
                                "Learned helplessness",
                                "Enabling behavior",
                                "Codependency",
                                "Social welfare syndrome"
                        },
                        {
                                "Most of the non-poor respondents said yes",
                                "50 percent of poor respondents said yes",
                                "64 percent of poor respondents said yes",
                                "75 percent of poor respondents said yes"
                        },
                        {
                                "Material possessions",
                                "A mother's love",
                                "A Grandma's love",
                                "Discipline and confidence"
                        },
                        {
                                "The ability to calm a child down and teach them how to be a man",
                                "The ability to teach a child how to fight",
                                "The ability to teach a child how to be a gentleman",
                                "The ability to teach a child how to be a man"
                        },
                        {
                                "Lawyer",
                                "Teacher",
                                "Fireman",
                                "Janitor",
                        },
                        {
                                "That hard work doesn't pay off",
                                "all of the above",
                                "That success is all about who you know",
                                "That hard work wins, and you get out of life what you put into it"
                        },
                        {
                                "A government policy that prioritizes the importance of fathers",
                                "Increased government welfare benefits",
                                "More government-funded job training programs",
                                "leave everything as is",
                        },
                        {
                                "Cornel West",
                                "Michael Eric Dyson",
                                "Larry Elder",
                                "Barack Obama"
                        }
                };

                RespuestasCorrectasSele = new String[][]{
                        {
                                "Kweisi Mfume, the president of the NAACP"
                        },
                        {
                                "They are five times more likely to live in poverty and commit crime; nine times more likely to drop out of school and 20 times more likely to end up in prison"
                        },
                        {
                                "They are more likely to end up in jail"
                        },
                        {
                                "41 percent"
                        },
                        {
                                "Yes, according to economist Walter Williams"
                        },
                        {
                                "73 percent"
                        },
                        {
                                "The welfare system that allows women to marry the government"
                        },
                        {
                                "Tupac Shakur"
                        },
                        {
                                "Learned helplessness"
                        },
                        {
                                "64 percent of poor respondents said yes"
                        },
                        {
                                "Discipline and confidence"
                        },
                        {
                                "The ability to calm a child down and teach them how to be a man"
                        },
                        {
                                "Janitor"
                        },
                        {
                                "Hard work wins, and you get out of life what you put into it"
                        },
                        {
                                "A government policy that prioritizes the importance of fathers"
                        },
                        {
                                "Larry Elder"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;
            case "Is America Racist?":
                pregSele = new String[]{
                        "According to the text, what percentage of Americans in 1960 said they would never vote for a black president?",
                        "In 1958, what percentage of Americans approved of black-white marriages?",
                        "Today, what percentage of Americans approve of black-white marriages?",
                        "What percentage of all marriages by blacks were black-white in 1960?",
                        "What is the current percentage of black-white marriages among all marriages by blacks?",
                        "In 2012, according to the CDC, how many blacks were killed by the police?",
                        "In the same year, how many whites were killed by the police according to the CDC?",
                        "What is the research agency of the Department of Justice called?",
                        "What is the title of the 2013 study published by the National Institute of Justice?",
                        "What percentage of black drivers admitted that they were stopped by the police for a legitimate reason?",
                        "According to the National Highway Traffic Safety Administration, do blacks or whites violate traffic laws at higher rates?",
                        "What is the gap between the percentage of blacks living in Ferguson and the percentage of those stopped by police for traffic violations who are black?",
                        "What percentage of blacks admitted they were stopped by the police for a legitimate reason according to the 2013 National Institute of Justice study?",
                        "Which institution found that blacks violate traffic laws at higher rates than whites in every offense?",
                        "According to Orlando Patterson, what does America offer more of to black persons compared to any other society?",
                        "What is the ethnicity of Orlando Patterson?"
                };

                RespSele = new String[][]{
                        {
                                "30%",
                                "40%",
                                "50%",
                                "60%",
                        },
                        {
                                "4%",
                                "14%",
                                "24%",
                                "34%"
                        },
                        {
                                "47%",
                                "67%",
                                "87%",
                                "97%"
                        },
                        {
                                "0.7%",
                                "1.7%",
                                "2.7%",
                                "3.7%"
                        },
                        {
                                "8%",
                                "10%",
                                "12%",
                                "14%"
                        },
                        {
                                "63",
                                "123",
                                "183",
                                "243"
                        },
                        {
                                "123",
                                "246",
                                "369",
                                "492"
                        },
                        {
                                "National Institute of Justice",
                                "National Highway Traffic Safety Administration",
                                "Federal Bureau of Investigation",
                                "Central Intelligence Agency"
                        },
                        {
                                "Race, Crime, and Policing",
                                "Race, Trust, and Police Legitimacy",
                                "Racial Disparities in Traffic Stops",
                                "The Impact of Race on Police Behavior"
                        },
                        {
                                "25%",
                                "50%",
                                "75%",
                                "100%"
                        },
                        {
                                "Blacks",
                                "Whites",
                                "Both have the same rate",
                                "The study does not specify"
                        },
                        {
                                "8 points",
                                "12 points",
                                "18 points",
                                "24 points"
                        },
                        {
                                "50%",
                                "75%",
                                "90%",
                                "25%"
                        },
                        {
                                "National Institute of Justice",
                                "National Highway Traffic Safety Administration",
                                "Department of Justice",
                                "Federal Bureau of Investigation"
                        },
                        {
                                "Educational opportunities",
                                "Legal protections",
                                "Job opportunities",
                                "Social integration"
                        },
                        {
                                "White",
                                "Black",
                                "Hispanic",
                                "Asian"
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "60%"
                        },
                        {
                                "4%"
                        },
                        {
                                "87%"
                        },
                        {
                                "1.7%"
                        },
                        {
                                "12%"
                        },
                        {
                                "123"
                        },
                        {
                                "246"
                        },
                        {
                                "National Institute of Justice"
                        },
                        {
                                "Race, Trust, and Police Legitimacy"
                        },
                        {
                                "75%"
                        },
                        {
                                "Blacks"
                        },
                        {
                                "18 points"
                        },
                        {
                                "75%"
                        },
                        {
                                "National Highway Traffic Safety Administration"
                        },
                        {
                                "Legal protections"
                        },
                        {
                                "Black"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;
            case "Don't Compare Yourself to Others":
                pregSele = new String[]{
                        "What is the main message of this speech?",
                        "Who did the speaker want to be as big as when starting their career?",
                        "Which comedian has a late-night TV show?",
                        "How long did it take the speaker to make a living from standup comedy?",
                        "What is the speaker's definition of professional success?",
                        "What did the speaker envy about comedians like George Carlin, Robin Williams, and Louis C.K.?",
                        "What is the main reason comparing yourself to others is problematic?",
                        "According to the speaker, what should you consider when comparing yourself to someone else?",
                        "What does the speaker say about everyone's life?",
                        "What did the speaker initially want in terms of venue size and TV show timings?",
                        "What does the speaker appreciate now in their career?",
                        "What is one of life's little truths according to the speaker?",
                        "According to the speaker, what is professional success about?",
                        "How long did it take for the speaker's stand-up comedy to start paying the bills?",
                        "What is the common mistake people make when comparing themselves to others?",
                        "What is the message the speaker wants to convey at the end of the speech?"
                };

                RespSele = new String[][]{
                        {
                                "Always compare yourself to others",
                                "Pursue fame and fortune",
                                "Stop comparing yourself to others",
                                "Only compare yourself to the best"
                        },
                        {
                                "Tom Shillue",
                                "Jimmy Fallon",
                                "George Carlin",
                                "Jerry Seinfeld"
                        },
                        {
                                "Jerry Seinfeld",
                                "Tom Shillue",
                                "Jimmy Fallon",
                                "Louis C.K"
                        },
                        {
                                "5 years",
                                "10 years",
                                "15 years",
                                "20 years"
                        },
                        {
                                "Being famous",
                                "Making a living, pursuing excellence, and finding meaning in what you do",
                                "Being rich",
                                "Having a prime-time TV show"
                        },
                        {
                                "Their fame and fortune",
                                "Their ability to turn dark personal struggles into brilliant comedy",
                                "Their lifestyles",
                                "Their TV shows"
                        },
                        {
                                "It leads to jealousy",
                                "It creates unrealistic expectations",
                                "It's a waste of time",
                                "It's discouraging"
                        },
                        {
                                "Their income",
                                "Their success",
                                "The complete package of their life",
                                "Their talents"
                        },
                        {
                                "It's easy",
                                "It's hard",
                                "It's filled with success",
                                "It's filled with happiness"
                        },
                        {
                                "Small venues and late-night shows",
                                "Small venues and prime-time shows",
                                "Big venues and late-night shows",
                                "Big venues and prime-time shows"
                        },
                        {
                                "Selling out small venues and having a late-night show with half a million viewers",
                                "Being on a prime-time TV show",
                                "Being the most famous comedian",
                                "Having a Netflix special"
                        },
                        {
                                "Everyone has an easy life",
                                "Everyone is a package deal",
                                "Success comes easily",
                                "Comparing yourself to others is necessary"
                        },
                        {
                                "Being the best in your field",
                                "Making a living, pursuing excellence, and finding meaning in what you do",
                                "Having fame and fortune",
                                "Surpassing your competition"
                        },
                        {
                                "5 years",
                                "10 years",
                                "15 years",
                                "20 years"
                        },
                        {
                                "Not considering the whole package of someone else's life",
                                "Not being ambitious enough",
                                "Only comparing themselves to less successful people",
                                "Ignoring their own talents and abilities"
                        },
                        {
                                "To keep striving for more success",
                                "To compare yourself only to the past version of yourself",
                                "To be envious of others' success",
                                "To focus on fame and fortune"
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "Stop comparing yourself to others"
                        },
                        {
                                "Jerry Seinfeld"
                        },
                        {
                                "Jimmy Fallon"
                        },
                        {
                                "10 years"
                        },
                        {
                                "Making a living, pursuing excellence, and finding meaning in what you do"
                        },
                        {
                                "Their ability to turn dark personal struggles into brilliant comedy"
                        },
                        {
                                "It creates unrealistic expectations"
                        },
                        {
                                "The complete package of their life"
                        },
                        {
                                "It's hard"
                        },
                        {
                                "Big venues and prime-time shows"
                        },
                        {
                                "Selling out small venues and having a late-night show with half a million viewers"
                        },
                        {
                                "Everyone is a package deal"
                        },
                        {
                                "Making a living, pursuing excellence, and finding meaning in what you do"
                        },
                        {
                                "10 years"
                        },
                        {
                                "Not considering the whole package of someone else's life"
                        },
                        {
                                "To compare yourself only to the past version of yourself"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;
            case "Fix Yourself":
                pregSele = new String[]{
                        "What topic does the psychologist discuss?",
                        "Repressing your feelings so that your beliefs can remain. What causes?",
                        "What questions should be asked of your own conscience?",
                        "What are the two attitudes towards life and its sorrows?",
                        "What goes through the mind of the unhappy and embittered husband?",
                        "What does the harassed and disappointed wife think?",
                        "Why is his prospect of reconciliation so bleak?",
                        "It is much easier and more rewarding for your lower desires:",
                        "What work is mentioned by the poet T.S Eliot?",
                        "What does the character say to the psychiatrist?",
                        "There are people who seem to be doomed to a terrible fate, but:",
                        "The right way to fix the world is:",
                        "Do you waste time asking what you are doing right or wrong?",
                        "What would happen if I start to improve and fix what I'm doing wrong?",
                        "What happens after careful effort is made for a few days, weeks, or months?",
                        "Where is the psychology teacher from?"
                };

                RespSele = new String[][]{
                        {
                                "Make people change to live better",
                                "Blaming people makes you the problem",
                                "Divorcing a partner takes courage",
                                "Being miserable makes us blame people",
                        },
                        {
                                "Encourage their anger and alteration of reason or senses",
                                "Happiness and calm",
                                "Loss of person",
                                "All of the above",

                        },
                        {
                                "What should you eat tomorrow? What did you eat yesterday?",
                                "What time do I have to work? What should I bring?",
                                "What is the dog doing?",
                                "What are you doing that is wrong, from your own perspective? What could you fix, right now?"
                        },
                        {
                                "Blaming people and not accepting their mistakes",
                                "The search for answers and why everything goes wrong",
                                "The first attitude blame the world. The second ask what they could do differently",
                                "Crying and not accepting mistakes"
                        },
                        {
                                "All the bad things he's done",
                                "Try to forgive the things your wife did",
                                "Not accepting help and feeling like you did nothing wrong",
                                "The memory of the terrible things his wife has done and why he can't live with her anymore"
                        },
                        {
                                "Think of all the ways her husband let her down",
                                "In all the mistakes you've had",
                                "In the problems that her husband has",
                                "How will your life be"
                        },
                        {
                                "Because no one seeks to improve personally",

                                "Due to the fact that they want to change the other person instead of changing themselves",
                                "By the opinions of outsiders",
                                "For the problems caused by the two"
                        },
                        {
                                "Blame someone else for your misery",
                                "Accept the situation",
                                "Blame yourself",
                                "Ignore the situation"
                        },
                        {
                                "The odyssey",
                                "The Cocktail Party",
                                "Romeo and Juliet",
                                "Romance of the Three Kingdoms"
                        },
                        {
                                "Who feels that everything is family fault",
                                "Who needs help to improve",
                                "She hopes that her suffering is her fault. because you can do something about it",
                                "She hates everyone around her"
                        },
                        {
                                "Never looking for ways to improve",
                                "They always look for a way to excuse themselves to others",
                                "But there are ways to improve",
                                "Most of us have the opportunity to improve our lives"
                        },
                        {
                                "Change people",
                                "Don't fix the world, there's no reason to. But you can fix yourself. You will not do by doing",
                                "Improving the political party",
                                "Taking care of the environment"
                        },
                        {
                                "You have to know what you are doing",
                                "You don't always know what you're doing",
                                "You can know that something is right or wrong without knowing why",
                                "It's always good to ask"
                        },
                        {
                                "If you do those things, your life will improve. You will become more peaceful, productive and desirable",
                                "It would be better than before",
                                "I wouldn't change a thing, I'm fine like that",
                                "He would love me more"
                        },
                        {
                                "Nothing is achieved if you don't feel",
                                "The mind will become clearer, life will become less tragic and more confident",
                                "Problems accumulate and you explode",
                                "Sores to a peace of mind"
                        },
                        {
                                "Toronto",
                                "California",
                                "Texas",
                                "Los Angeles"
                        },
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "Blaming people makes you the problem"
                        },
                        {
                                "Encourage their anger and alteration of reason or the senses"
                        },
                        {
                                "What are you doing that is wrong, from your own perspective? What could you fix, right now?"
                        },
                        {
                                "The first attitude blame the world. The second ask what they could do differently"
                        },
                        {
                                "The memory of the terrible things his wife has done and why he can't live with her anymore"
                        },
                        {
                                "Think of all the ways her husband let her down"
                        },
                        {
                                "Due to the fact that they want to change the other person instead of changing themselves"
                        },
                        {
                                "Blame someone else for your misery"
                        },
                        {
                                "The Cocktail Party"
                        },
                        {
                                "She hopes that her suffering is her fault. because you can do something about it"
                        },
                        {
                                "Most of us have the opportunity to improve our lives"
                        },
                        {
                                "Don't fix the world, there's no reason to. But you can fix yourself. You will not do by doing"
                        },
                        {
                                "You can know that something is right or wrong without knowing why"
                        },
                        {
                                "If you do those things, your life will improve. You will become more peaceful, productive and desirable"
                        },
                        {
                                "The mind will become clearer, life will become less tragic and more confident"
                        },
                        {
                                "Toronto"
                        },
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "Are Men and Women Different?":
                pregSele = new String[]{
                        "What is the analogy of the beach ball used for in the speech?",
                        "What does the speaker believe about men and women's natures?",
                        "Who would the speaker agree with more, great-grandmother or a gender studies PhD?",
                        "What does the speaker claim is a delusion?",
                        "What story does the New York pediatrician George Lazarus share?",
                        "According to the speaker, do men and women want the same things from sex?",
                        "How does the speaker describe the way college students view sex today?",
                        "What does Jennifer Lawrence's quote in the speech indicate about her feelings towards intimate scenes?",
                        "What does the speaker believe about sex within marriage compared to sex outside of marriage?",
                        "According to the speaker, who is pushing the agenda that men and women are basically the same?",
                        "Who is Sean McDowell?",
                        "What is the main message of the speech?",
                        "According to the speaker, why would a woman feel violated by an uninvited touch?",
                        "In the speech, why did the couple buy their daughter a set of toy trucks?",
                        "What example does the speaker use to illustrate that boys will turn any object into a weapon?",
                        "What does the speaker believe is the reason that sex has traditionally been confined to marriage?"
                };

                RespSele = new String[][]{
                        {
                                "To describe the differences between men and women",
                                "To illustrate the difficulty of learning a new skill",
                                "To show the importance of having fun at the beach",
                                "To explain the physics of buoyancy"
                        },
                        {
                                "They are basically the same",
                                "They are completely different",
                                "They are determined by socialization",
                                "They are interchangeable"
                        },
                        {
                                "Great-grandmother",
                                "Gender studies PhD",
                                "Both equally",
                                "Neither"
                        },
                        {
                                "Believing men and women are different",
                                "Believing men and women are the same",
                                "Believing gender roles are natural",
                                "Believing gender roles are socially constructed"
                        },
                        {
                                "A story about a girl who turned her toy trucks into weapons",
                                "A story about a girl who pretended her toy trucks were sleeping",
                                "A story about a boy who turned his toy trucks into weapons",
                                "A story about a boy who pretended his toy trucks were sleeping"
                        },
                        {
                                "Yes, always",
                                "No, never",
                                "Sometimes, depending on the individual",
                                "It is impossible to know"
                        },
                        {
                                "As a sacred act between committed partners",
                                "As a casual form of entertainment",
                                "As a strictly regulated activity",
                                "As a dangerous and risky behavior"
                        },
                        {
                                "She feels empowered",
                                "She feels indifferent",
                                "She feels vulnerable",
                                "She feels excited"
                        },
                        {
                                "It is less satisfying in all aspects",
                                "It is equally satisfying",
                                "It is more satisfying emotionally, psychologically, physically, and spiritually",
                                "It depends on the individual's personal beliefs"
                        },
                        {
                                "The media and entertainment industry",
                                "The religious institutions",
                                "The government and politicians",
                                "The academic and intellectual community"
                        },
                        {
                                "A Hollywood actor",
                                "A gender studies PhD",
                                "An Associate Professor of Theology and Philosophy at Biola University",
                                "A New York pediatrician"
                        },
                        {
                                "To embrace modern ideas about gender and sexuality",
                                "To trust common sense and recognize the differences between men and women",
                                "To argue that gender roles should be abolished",
                                "To promote a more casual attitude towards sex"
                        },
                        {
                                "Because it's physically painful",
                                "Because it has no meaning",
                                "Because sex and intimacy have deeper meaning for women",
                                "Because men and women are basically the same"
                        },
                        {
                                "Because she asked for them",
                                "To avoid conforming to gender stereotypes",
                                "Because they were on sale",
                                "To encourage her interest in mechanics"
                        },
                        {
                                "A story about a boy turning a toy truck into a weapon",
                                "A story about a boy using a stick as a weapon",
                                "A story about a boy turning a stuffed animal into a weapon",
                                "A story about a boy using a pillow as a weapon"
                        },
                        {
                                "Because it is a big deal with deep emotional, psychological, and physical implications",
                                "Because society wanted to control women's sexuality",
                                "Because it was more convenient for inheritance purposes",
                                "Because of religious dogma"
                        }
                };

                RespuestasCorrectasSele = new String[][]{
                        {
                                "To describe the differences between men and women"
                        },
                        {
                                "They are completely different"
                        },
                        {
                                "Great-grandmother"
                        },
                        {
                                "Believing men and women are the same"
                        },
                        {
                                "A story about a girl who pretended her toy trucks were sleeping"
                        },
                        {
                                "No, never"
                        },
                        {
                                "As a casual form of entertainment"
                        },
                        {
                                "She feels vulnerable"
                        },
                        {
                                "It is more satisfying emotionally, psychologically, physically, and spiritually"
                        },
                        {
                                "The academic and intellectual community"
                        },
                        {
                                "An Associate Professor of Theology and Philosophy at Biola University"
                        },
                        {
                                "To trust common sense and recognize the differences between men and women"
                        },
                        {
                                "Because sex and intimacy have deeper meaning for women"
                        },
                        {
                                "To avoid conforming to gender stereotypes"
                        },
                        {
                                "A story about a boy turning a toy truck into a weapon"
                        },
                        {
                                "Because it is a big deal with deep emotional, psychological, and physical implications"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "Don't Waste Your Time":
                pregSele = new String[]{
                        "According to the text, what is the purpose of dating for women?",
                        "What is the problem with assuming that relationships progress like levels in a video game?",
                        "What are some of the factors that may lead people to live together?",
                        "According to the text, what are people looking for in a good marriage?",
                        "What is the problem with getting distracted by superficial compatibility?",
                        "According to the text, what should you do if a relationship does not look like it has a future?",
                        "Why do many women get stuck in dead-end relationships, according to the text?",
                        "What are three reasons why women crave marriage, according to the text?",
                        "According to the text, what is the difference between living with someone and marriage?",
                        "How should you respond to someone who says that a marriage license is just a piece of paper?",
                        "According to the text, how should you think about the kind of relationship you want?",
                        "According to the text, how should you think about the kind of relationship you want?",
                        "What does Lauren Chen suggest women should do on a first date?",
                        "What does Lauren Chen suggest as a good rule of thumb for thinking about relationships?",
                        "What does a woman look for in a marriage?",
                        "What is the narrator's name?",
                };

                RespSele = new String[][]{
                        {
                                "To have fun and enjoy casual flings",
                                "To find someone to marry",
                                "To meet new people",
                                "To explore common interests",
                        },
                        {
                                "It leads to unrealistic expectations",
                                "It is too predictable",
                                "It does not take into account the importance of shared values",
                                "It can lead to miscommunication about the ideal outcome of the relationship",
                        },
                        {
                                "Real love and a tryout for marriage",
                                "Desire for a roommate or lack of other opportunities",
                                "Inability to afford a single apartment",
                                "All of the above",
                        },
                        {
                                "Someone who wants to build a shared life",
                                "Someone who shares their values and beliefs",
                                "Someone who views them as a partner",
                                "All of the above",
                        },
                        {
                                "It can lead to misunderstandings about the long-term future of the relationship",
                                "It is not a valid basis for a serious relationship",
                                "It can lead to boredom and a lack of excitement in the relationship",
                                "All of the above",
                        },
                        {
                                "Wait and see if things improve",
                                "End it",
                                "Try harder to make it work",
                                "Take a break from each other",
                        },
                        {
                                "They do not articulate what they really want",
                                "They are too picky",
                                "They are afraid of commitment",
                                "They do not know what they want",
                        },
                        {
                                "Protection, commitment, and love",
                                "Financial security, companionship, and emotional stability",
                                "Adventure, excitement, and passion",
                                "None of the above",
                        },
                        {
                                "There is no difference",
                                "Marriage involves more commitment, obligations, and expectations",
                                "Living together is more romantic",
                                "Marriage is more about having fun",
                        },
                        {
                                "Agree with them",
                                "Ask them why they are so reluctant to sign it",
                                "Tell them they are wrong",
                                "None of the above",
                        },
                        {
                                "As much as you think about what kind of career you want",
                                "More than what kind of career you want",
                                "More than what kind of career you want",
                                "Not at all",
                        },
                        {
                                "Living together is more fun",
                                "Living together is a tryout for marriage",
                                "Dating is a tryout for marriage",
                                "There is no difference",
                        },
                        {
                                "Discuss their values and beliefs",
                                "Talk about marriage",
                                "Wait until the pizza is served to discuss marriage",
                                "Have fun",
                        },
                        {
                                "To think about them as much as you think about your career",
                                "To prioritize relationships over your career",
                                "To only focus on your career",
                                "To think about relationships less than your career",
                        },
                        {
                                "Hate",
                                "Money",
                                "Love",
                                "Nothing",
                        },
                        {
                                "Adolfo Peñaloza",
                                "Alejandro Berry",
                                "Lauren Chen",
                                "Adriana Monsalve",
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "To find someone to marry"
                        },
                        {
                                "It can lead to miscommunication about the ideal outcome of the relationship"
                        },
                        {
                                "All of the above"
                        },
                        {
                                "All of the above"
                        },
                        {
                                "It can lead to misunderstandings about the long-term future of the relationship"
                        },
                        {
                                "End it"
                        },
                        {
                                "They do not articulate what they really want"
                        },
                        {
                                "Protection, commitment, and love"
                        },
                        {
                                "Marriage involves more commitment, obligations, and expectations"
                        },
                        {
                                "Ask them why they are so reluctant to sign it"
                        },
                        {
                                "As much as you"
                        },
                        {
                                "Living together is a tryout for marriage"
                        },
                        {
                                "Have fun"
                        },
                        {
                                "To think about them as much as you think about your career"
                        },
                        {
                                "Love"
                        },
                        {
                                "Lauren Chen"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "How to End Systemic Racism":
                pregSele = new String[]{
                        "What is the main point of the speech?",
                        "What does the speaker mean when they say ¨No truth. No peace¨?",
                        "According to the speech, what are some examples of systemic racism in America?",
                        "What does the speaker suggest is the real cause of the racism problem in America?",
                        "According to the speech, what is the ¨race hoax epidemic¨?",
                        "What does the speaker say about George Floyd?",
                        "What does the speaker say about education standards for young students of color?",
                        "What does the speaker suggest is a better way to create an equitable society?",
                        "According to the speech, what is the goal of the elites who have instigated systemic racism?",
                        "What is the speaker's opinion on the ideology of the left?",
                        "How does the speaker feel about the ideology of the left?",
                        "What does the speaker believe is the cause of the demand for racism exceeding the supply?",
                        "According to the speaker, what is the attitude of the left towards unconscious racism and microaggressions?",
                        "What does the speaker believe is the best way to create an equitable society?",
                        "According to the speech, where does the speaker believe systemic racism is coming from?",
                        "How does the speaker suggest that leftists re-examine their beliefs?"
                };

                RespSele = new String[][]{
                        {
                                "Systemic racism is a thing of the past in America",
                                "There is no racism against people of color in America",
                                "The woke left is responsible for systemic racism in America",
                                "Racism in America is solely perpetuated by the right"
                        },
                        {
                                "Without truth, there can be no justice or equality",
                                "Without truth, there can be no progress or improvement",
                                "Without truth, there can be no understanding or unity",
                                "Without truth, there can be no peace or harmony"
                        },
                        {
                                "State governments put regulations in place that make it harder for minorities to start businesses",
                                "Black students are told that math is a white construct in Oregon",
                                "City councils demonize their own police departments, then vote to cut police budgets",
                                "All of the above"

                        },
                        {
                                "The policies and attitudes of the right",
                                "Small-minded individuals",
                                "The ideology of the left",
                                "The demand for racism exceeds the supply"

                        },
                        {
                                "An epidemic of racism against people of color in America",
                                "An epidemic of fake claims of racism against people of color",
                                "An epidemic of racism hoaxes perpetuated by the right",
                                "An epidemic of microaggressions against people of color"

                        },
                        {
                                "The incident had nothing to do with Floyd being black",
                                "The incident was entirely racially motivated",
                                "The incident was a hoax",
                                "The incident was the result of systemic racism"
                        },
                        {
                                "They are the same as for other students",
                                "They are higher than for other students",
                                "They are lower than for other students",
                                "They are irrelevant to the issue of systemic racism"
                        },
                        {
                                "Government programs",
                                "Judging each person on their merits, not their skin color",
                                "Affirmative action",
                                "Separating people by race"
                        },
                        {
                                "To create a more just society",
                                "To hold people of color back",
                                "To promote equality and unity",
                                "To eliminate racism altogether"
                        },
                        {
                                "It is a beacon of tolerance and progress",
                                "It is responsible for systemic racism in America",
                                "It is irrelevant to the issue of racism",
                                "It is the only solution to racism"
                        },
                        {
                                "The speaker agrees with the ideology of the left",
                                "The speaker thinks the ideology of the left is well-intentioned but misguided",
                                "The speaker believes the ideology of the left is responsible for systemic racism",
                                "The speaker has never heard of the ideology of the left",
                        },
                        {
                                "The prevalence of small-minded people",
                                "b) The creation of false race hoaxes by the left",
                                "c) The success of anti-racism movements",
                                "d) The lack of systemic racism in America"
                        },
                        {
                                "They are real and should be addressed",
                                "They are a figment of people's imaginations",
                                "They are intentional acts of racism",
                                "They are exaggerated by the right to discredit the left"
                        },
                        {
                                "Judging each person on their merits, not their skin color",
                                "Implementing a hundred government programs",
                                "Encouraging people to embrace unconscious racism and microaggressions",
                                "Expecting less from people based on their race",
                        },
                        {
                                "The right",
                                "The left",
                                "Both the right and the left",
                                "The speaker does not believe in systemic racism"
                        },
                        {
                                "By avoiding any questioning of their beliefs",
                                "By dismissing the possibility of systemic racism",
                                "By questioning whether certain beliefs are helping or hurting Black people",
                                "By doubling down on their beliefs and pushing for more extreme policies",
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "The woke left is responsible for systemic racism in America"
                        },
                        {
                                "Without truth, there can be no peace or harmony"
                        },
                        {
                                "All of the above"
                        },
                        {
                                "The ideology of the left"
                        },
                        {
                                "An epidemic of fake claims of racism against people of color"
                        },
                        {
                                "The incident had nothing to do with Floyd being black"
                        },
                        {
                                "They are lower than for other students"
                        },
                        {
                                "Judging each person on their merits, not their skin color"
                        },
                        {
                                "To hold people of color back"
                        },
                        {
                                "It is responsible for systemic racism in America"
                        },
                        {
                                "The speaker believes the ideology of the left is responsible for systemic racism"
                        },
                        {
                                "The creation of false race hoaxes by the left"
                        },
                        {
                                "They are real and should be addressed"
                        },
                        {
                                "Judging each person on their merits, not their skin color"
                        },
                        {
                                "The left"
                        },
                        {
                                "By questioning whether certain beliefs are helping or hurting Black people"
                        },
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "How to Make Our Cities Safer":
                pregSele = new String[]{
                        "What is the main cause of the recent rise in violent crime in the United States?",
                        "According to the speech, what was the increase in homicides in the United States in 2020?",
                        "Which group of criminals is responsible for the majority of violent crimes in any given city?",
                        "What is the benefit of targeting drug dealers according to the speech?",
                        "What is vertical prosecution?",
                        "What is the conclusion of the United States Sentencing Commission's analysis of prison sentences?",
                        "What is the age-crime curve?",
                        "According to the speech, what is the best way to reduce crime rates in a city?",
                        "Why is collaboration between police and prosecutors important in investigations?",
                        "What is the main goal of the solutions proposed in the speech?",
                        "What is the term used in the speech to refer to criminals who are likely to commit and be victims of violent crimes?",
                        "According to the speech, what is the benefit of targeting the Power Few?",
                        "What is the main message of the speech?",
                        "What is the United States Sentencing Commission?",
                        "Why do most law enforcement officials believe that longer prison sentences reduce crime rates?",
                        "What is the benefit of keeping bad actors in jail according to the speech?"
                };

                RespSele = new String[][]{
                        {
                                "A lack of gun control laws",
                                "The increase in drug use",
                                "Economic inequality",
                                "The speech does not mention a specific cause"
                        },
                        {
                                "20 percent",
                                "25 percent",
                                "30 percent",
                                "35 percent"
                        },
                        {
                                "The Power Few",
                                "The Criminal Elite",
                                "The Dangerous Many",
                                "The speech does not mention a specific group"
                        },
                        {
                                "It reduces drug addiction rates",
                                "It helps law enforcement gather information about other crimes",
                                "It reduces gang violence",
                                "It prevents burglaries"
                        },
                        {
                                "A type of drug rehabilitation program",
                                "A form of criminal defense strategy",
                                "A concept where police and prosecutors collaborate from the beginning of an investigation",
                                "The speech does not define the term"
                        },
                        {
                                "Prison sentences have no significant impact on reducing crime rates",
                                "Longer prison sentences lead to an increase in crime rates",
                                "The longer the prison sentence, the less likely the criminal will commit another crime",
                                "The speech does not mention the conclusion of the analysis"
                        },
                        {
                                "A graph that shows the relationship between age and crime rates",
                                "A theory that argues that older people commit more crimes",
                                "A criminal defense strategy based on the defendant's age",
                                "The speech does not define the term"
                        },
                        {
                                "Implement more gun control laws",
                                "Increase social welfare programs",
                                "Target high-frequency offenders and keep them in jail",
                                "The speech does not mention a specific solution"
                        },
                        {
                                "It saves time and resources",
                                "It helps to determine the order of witnesses in trial",
                                "It minimizes legal errors and ensures justice is done",
                                "The speech does not mention a specific benefit"
                        },
                        {
                                "To punish criminals",
                                "To reduce crime rates in cities",
                                "To increase police presence in communities",
                                "The speech does not mention a specific goal"
                        },
                        {
                                "The High-Risk Group",
                                "The Violent Offenders",
                                "The Power Few",
                                "The speech does not mention a specific term"
                        },
                        {
                                "It reduces crime rates in a specific area only",
                                "It helps to identify drug dealers and gun-toting felons",
                                "It substantially reduces violent crime rates throughout an entire city",
                                "The speech does not mention a specific benefit"
                        },
                        {
                                "The United States needs to implement more social welfare programs",
                                "Law enforcement should focus on punishing all criminals equally",
                                "Targeting high-frequency offenders and keeping them in jail can substantially reduce crime rates in cities",
                                "The speech does not have a clear main message"
                        },
                        {
                                "An organization that promotes gun control laws",
                                "A federal agency that analyzes the impact of prison sentences on reducing crime rates",
                                "A group of criminal defense lawyers",
                                "The speech does not define the term"
                        },
                        {
                                "Because they believe that punishment is an effective deterrent to crime",
                                "Because they believe that rehabilitation programs are ineffective",
                                "Because they believe that prison sentences have no impact on crime rates",
                                "The speech does not mention a specific reason"
                        },
                        {
                                "It increases the prison population",
                                "It reduces the number of potential victims on the street",
                                "It is a cost-effective solution",
                                "The speech does not mention a specific benefit",
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "The speech does not mention a specific cause"
                        },
                        {
                                "30 percent"
                        },
                        {
                                "The Power Few"
                        },
                        {
                                "It helps law enforcement gather information about other crimes"
                        },
                        {
                                "A concept where police and prosecutors collaborate from the beginning of an investigation"
                        },
                        {
                                "The longer the prison sentence, the less likely the criminal will commit another crime"
                        },
                        {
                                "A graph that shows the relationship between age and crime rates"
                        },
                        {
                                "Target high-frequency offenders and keep them in jail"
                        },
                        {
                                "It minimizes legal errors and ensures justice is done"
                        },
                        {
                                "To reduce crime rates in cities"
                        },
                        {
                                "The Power Few"
                        },
                        {
                                "It substantially reduces violent crime rates throughout an entire city"
                        },
                        {
                                "Targeting high-frequency offenders and keeping them in jail can substantially reduce crime rates in cities"
                        },
                        {
                                "A federal agency that analyzes the impact of prison sentences on reducing crime rates"
                        },
                        {
                                "Because they believe that punishment is an effective deterrent to crime"
                        },
                        {
                                "It reduces the number of potential victims on the street"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "Should Government Bail Out Big Banks?":
                pregSele = new String[] {
                        "What is the conventional wisdom about the cause of the 2008 financial meltdown?",
                        "What was the main reason for the credit-market freeze that occurred during the 2008 financial crisis?",
                        "What was the purpose of the Troubled Asset Relief Program (TARP)?",
                        "What was the phrase \"too big to fail\" referring to in the context of the 1984 bailout of Continental Illinois?",
                        "How did the government's bailout of Continental Illinois in 1984 contribute to the 2008 financial crisis?",
                        "What was the government's response to the 1998 near-bankruptcy of Long-Term Capital Management?",
                        "How did the government's response to the 1998 Long-Term Capital Management crisis contribute to the 2008 financial crisis?",
                        "Why did the government not rescue Lehman Brothers during the 2008 financial crisis?",
                        "What was the impact of the government's decision not to rescue Lehman Brothers during the 2008 financial crisis?",
                        "What was the main solution proposed by the author to bring sanity back to the financial industry?",
                        "How did the government's bailout of Continental Illinois in 1984 introduce the phrase \"too big to fail\" to the financial media's vocabulary?",
                        "What was the impact of the government's decision to bail out Long-Term Capital Management in 1998?",
                        "What was the message that the government's rescue of Bear Stearns in 2008 sent to the financial industry?",
                        "What was the impact of the government's decision to rescue Fannie Mae and Freddie Mac in 2008?",
                        "Why did President George W. Bush sign the Troubled Asset Relief Program (TARP) into law in 2008?",
                        "What is the author's view on how to prevent future financial crises?"
                };

                RespSele = new String[][] {
                        {
                                "It was caused by three decades of bank de-regulation",
                                "It was caused by too much government involvement in the financial industry",
                                "It was caused by the banks becoming too large and powerful",
                                "It was caused by a lack of oversight and regulation of the financial industry"
                        },
                        {
                                "Banks stopped lending money to other banks",
                                "The stock market crashed, causing a chain reaction throughout the financial industry",
                                "General Electric was unable to pay its workers",
                                "The government refused to bail out Lehman Brothers"
                        },
                        {
                                "To bail out Lehman Brothers",
                                "To pump taxpayer cash into America's banks and financial institutions",
                                "To provide short-term credit to struggling companies",
                                "To regulate the financial industry more closely"
                        },
                        {
                                "The bank had too much debt to be saved",
                                "The bank was too large and powerful to be allowed to fail",
                                "The bank was too risky to be bailed out",
                                "The bank was too small to have a significant impact on the financial industry"
                        },
                        {
                                "It led to a short-term panic in the financial markets",
                                "It created a long-term expectation that the government would always bail out big banks",
                                "It resulted in a decline in the number of investors willing to lend money to American banks",
                                "It had no direct impact on the 2008 financial crisis"
                        },
                        {
                                "It allowed the hedge fund to fail, sending shockwaves through the financial industry",
                                "It bailed out the hedge fund and several big banks that were at risk of failing",
                                "It implemented new regulations to prevent future hedge fund failures",
                                "It did not take any action"
                        },
                        {
                                "It led to an increase in regulation and oversight of the financial industry",
                                "It sent a message to banks that they could take bigger risks because the government would bail them out",
                                "It resulted in a decrease in investor confidence in the financial industry",
                                "It had no direct impact on the 2008 financial crisis"
                        },
                        {
                                "The government did not have the funds to do so",
                                "The government believed that Lehman Brothers was too risky to be saved",
                                "The government wanted to send a message to the financial industry that it could not always rely ongovernment bailouts",
                                "The government believed that saving Lehman Brothers would have set a dangerous precedent"
                        },
                        {
                                "It caused a short-term panic in the financial markets",
                                "It led to a credit-market freeze",
                                "It resulted in the failure of several other large financial institutions",
                                "It had no direct impact on the financial industry"
                        },
                        {
                                "Passing thousands of new regulations",
                                "Allowing the big banks to fail",
                                "Increasing government control over the financial industry",
                                "The government must stop guaranteeing the big banks' losses"
                        },
                        {
                                "The government believed that Continental Illinois was too risky to be saved",
                                "The government wanted to send a message to the financial industry that it would always bail out big banks",
                                "The government feared that if Continental Illinois failed, it would cause a panic in the financial markets",
                                "The media coined the phrase to describe the government's response to the crisis"
                        },
                        {
                                "It led to an increase in regulation and oversight of the financial industry",
                                "It sent a message to banks that they could take bigger risks because the government would bail them out",
                                "It resulted in a decrease in investor confidence in the financial industry",
                                "It had no direct impact on the financial industry"
                        },
                        {
                                "Banks should be more cautious and avoid taking big risks",
                                "Banks should expect government bailouts in times of crisis",
                                "The government is unable to save all financial institutions that are in trouble",
                                "The financial industry should be more self-reliant and less dependent on government support"
                        },
                        {
                                "It led to an increase in regulation and oversight of the financial industry",
                                "It sent a message to banks that they could take bigger risks because the government would bail them out",
                                "It resulted in a decrease in investor confidence in the financial industry",
                                "It had no direct impact on the financial industry"
                        },
                        {
                                "Because he believed in government intervention in the financial industry",
                                "Because he wanted to send a message to the financial industry that the government would always bail out big banks",
                                "Because he believed that the global financial system was in danger of collapsing",
                                "Because he wanted to gain political support from the financial industry"
                        },
                        {
                                "Increase government regulation of the financial industry",
                                "Allow the big banks to fail",
                                "Decrease government involvement in the financial industry",
                                "Increase government support for the financial industry"
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "It was caused by three decades of bank de-regulation"
                        },
                        {
                                "Banks stopped lending money to other banks"
                        },
                        {
                                "To pump taxpayer cash into America's banks and financial institutions"
                        },
                        {
                                "The bank was too large and powerful to be allowed to fail"
                        },
                        {
                                "It created a long-term expectation that the government would always bail out big banks"
                        },
                        {
                                "It bailed out the hedge fund and several big banks that were at risk of failing"
                        },
                        {
                                "It sent a message to banks that they could take bigger risks because the government would bail them out"
                        },
                        {
                                "The government wanted to send a message to the financial industry that it could not always rely on government bailouts"
                        },
                        {
                                "It led to a credit-market freeze"
                        },
                        {
                                "The government must stop guaranteeing the big banks' losses"
                        },
                        {
                                "The government feared that if Continental Illinois failed, it would cause a panic in the financial markets"
                        },
                        {
                                "It sent a message to banks that they could take bigger risks because the government would bail them out"
                        },
                        {
                                "Banks should expect government bailouts in times of crisis"
                        },
                        {
                                "It sent a message to banks that they could take bigger risks because the government would bail them out"
                        },
                        {
                                "Because he believed that the global financial system was in danger of collapsing"
                        },
                        {
                                "Decrease government involvement in the financial industry"
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;
        }
    }

    //ACTIVA EL TEST DE AVAILABILITY
    public void availabilityTest(View v){
        pasarSigNivel.setVisibility(View.GONE);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment videoPlayerFragment = fragmentManager.findFragmentById(R.id.fragmentContainerView5);
        if (videoPlayerFragment != null) {
            fragmentManager.beginTransaction()
                    .remove(videoPlayerFragment)
                    .commit();
        }

        activarBtns();
        if (pregIndex == 16) {
            verResultado();
            pregIndex = 0;
        } else {
            if ("Tutorial".equals(selection)) {
                Toast.makeText(this, "Selecciona un prager", Toast.LENGTH_SHORT).show();
            } else {
                isInActividadDeComprension = true;

                tv.setVisibility(View.GONE);
                test_view.setVisibility(View.VISIBLE);
                startTest();
                limpBtns();
            }
        }
    }

    //AMBAS FUNCIONES LIMPIAN EL RESULTADO
    public void btnFinalizarTest(View v){
        if(isFromLessonPlan){
            if(!prefs.getHasSeenAd()||prefs.getPremium()==0){
                dialogueContainer("Ver anuncio para desbloquear clase","ver anuncio","premium",getApplicationContext());

            }else if(prefs.getPremium()==1){
                classSelector(selection);
                Intent intent = new Intent(this,  Cultura2023.class);
                intent.putExtra("typeFromLessonPlan",true);
                intent.putExtra("class",placeHolder);
                startActivity(intent);
            }



        }else {
            setUpVideoFragmentStart();
            double parameter = pregResult;
            if(parameter > 10){
                SubtractSelectionAndSendinfoToDb();
            }
            tv.setVisibility(View.VISIBLE);
            test_view.setVisibility(View.GONE);
            result_view.setVisibility(View.GONE);
            pregIndex = 0;
            LimpiarResultado();
            isInActividadDeComprension=false;
        }


    }

    public void btnFinalizarTest(){
        isInActividadDeComprension=false;
        tv.setVisibility(View.VISIBLE);
        test_view.setVisibility(View.GONE);
        result_view.setVisibility(View.GONE);
        pregIndex = 0;
        LimpiarResultado();
    }

    //AMBAS EL LAYOUT DEL RESULTADO
    double pregResult;
    public void verResultado(){
        tv.setVisibility(View.GONE);
        test_view.setVisibility(View.GONE);
        result_view.setVisibility(View.VISIBLE);
        int pregL = preguntas.length + 1;
        double result = calcularPorcentaje(100,pregCorrect,16);

        DecimalFormat df = new DecimalFormat("#.##");
         pregResult = Double.parseDouble(df.format(result));
        String numeroEnString = Double.toString(pregResult);
        scoreText.setText(numeroEnString);
        isInActividadDeComprension=false;
        if(counterDb<=9 ){
            sendInfoOfRegularUseToDb();
            counterDb++;

        }
        

    }

    private void sendInfoOfRegularUseToDb() {
        scoresAvailDocRef=db.collection(userid).document("Scores Availability");
        scoresAvailDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else {
                    mso= documentSnapshot.toObject(ModeloAvailability.class);
                    assert mso!=null;
                    updateinfo();
                }

            }

            private void updateinfo() {
                double division,result;
                Map<String, Object> userdb = new HashMap<>();
                division = mso.availabilityCounter / 9.0;
                result = division * 100;
                mso.availabilityCounter++; // sube el counter 1

                userdb.put("AvanceAvail",result);
                userdb.put("availabilityCounter",mso.availabilityCounter);

                uid.document("Scores Availability").update(userdb);
            }
        });
    }


    public void LimpiarResultado(){
        pregCorrect = 0;
    }


    //FUNCION DE EMPEZAR EL TEST
    public void startTest(){
        preguntasSeleccionada();
        String preg = preguntas[pregIndex];
        pregtxt.setText(preg);

        RespCorrecta = RespuestasCorrectas[pregIndex][0];

        preg1.setText(Respuestas[pregIndex][0]);
        preg2.setText(Respuestas[pregIndex][1]);
        preg3.setText(Respuestas[pregIndex][2]);
        preg4.setText(Respuestas[pregIndex][3]);
    }

    public void bloquearBtns(){
        preg1.setEnabled(false);
        preg2.setEnabled(false);
        preg3.setEnabled(false);
        preg4.setEnabled(false);
    }

    public void activarBtns(){
        preg1.setEnabled(true);
        preg2.setEnabled(true);
        preg3.setEnabled(true);
        preg4.setEnabled(true);
    }

    public void btn1(View v){

        String Resp1 = preg1.getText().toString();
        if(Resp1.equals(RespCorrecta)){
            preg1.setBackground(getDrawable(ic_btn_green));
            pregCorrect ++;
            pregIndex ++;
        }else{
            preg1.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;
        }

        preg2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg3.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg4.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        bloquearBtns();
    };

    public void btn2(View v){

        String Resp2 = preg2.getText().toString();

        if(Resp2.equals(RespCorrecta)){
            preg2.setBackground(getDrawable(ic_btn_green));
            pregCorrect ++;
            pregIndex ++;

        }else{
            preg2.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;

        }

        preg1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg3.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg4.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void btn3(View v){

        String Resp3 = preg3.getText().toString();

        if(Resp3.equals(RespCorrecta)){
            preg3.setBackground(getDrawable(ic_btn_green));
            pregCorrect ++;
            pregIndex ++;

        }else{
            preg3.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;

        }
        preg1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg4.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void btn4(View v){

        String Resp4 = preg4.getText().toString();

        if(Resp4.equals(RespCorrecta)){
            preg4.setBackground(getDrawable(ic_btn_green));
            pregCorrect ++;
            pregIndex ++;

        }else{
            preg4.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;

        }
        preg1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        preg3.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void limpBtns(){
        preg1.setBackgroundResource(ic_rect_ngulo_btncheck);
        preg2.setBackgroundResource(ic_rect_ngulo_btncheck);
        preg3.setBackgroundResource(ic_rect_ngulo_btncheck);
        preg4.setBackgroundResource(ic_rect_ngulo_btncheck);
    }

    private void openDialog(String s) {
        Dialog d = new Dialog(s);
        d.show(getSupportFragmentManager(), "");

    }

    public void dialogueContainer(String text, String buttonyes, String buttonno, Context contexto){
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
                Intent intento = new Intent(contexto,Premium2023.class  );
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
    private RewardedAd mRewardedAd;
    String[] placeHolder = new String[]{"Default value"};
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917", adRequest,
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
    // Call this method when the button is clicked.
    public void showRewardedAd() {

        if (mRewardedAd != null) {
            mRewardedAd.show(this, rewardItem -> {
                if(isFromLessonPlan){
                    // Handle the reward.
                    classSelector(selection);
                        Intent intent = new Intent(this,  Cultura2023.class);
                        intent.putExtra("typeFromLessonPlan",true);
                        intent.putExtra("class",placeHolder);
                        startActivity(intent);



                }else {

                    prefs.setHasSeenAd(true);
                    Intent intent = new Intent(this, Availability2023.class);
                    startActivity(intent);
                }

            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }
    }
    private void classSelector(String selected) {
        switch (selected) {
            case "Black Fathers":
                placeHolder = new String[]{"Moonlight"};
                break;
            case "Is America Racist?":
                placeHolder = new String[]{"Rick and Morty"};
                break;
            case "Don't Compare Yourself to Others":
                placeHolder = new String[]{"Do You Want Pepsi"};
                break;
            case "Fix Yourself":
                placeHolder = new String[]{"Sangre Por Sangre Foodline"};
                break;
            case "Are Men and Women Different?":
                placeHolder = new String[]{"Sangre Por Sangre Watch El Paisaje"};
                break;
            case "Don't Waste Your Time":
                placeHolder = new String[]{"Training Day Rabbit Has The Gun"};
                break;
            case "How to Make Our Cities Safer":
                placeHolder = new String[]{"Hancock Train"};
                break;
            case "How to End Systemic Racism":
                placeHolder = new String[]{"Malcom in the Middle Teacher"};
                break;
            case "Should Government Bail Out Big Banks?":
                placeHolder = new String[]{"Sangre Por Sangre Comedor"};
                break;
        }
    }
}