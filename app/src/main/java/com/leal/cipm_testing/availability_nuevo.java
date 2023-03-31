package com.leal.cipm_testing;

import static com.leal.cipm_testing.R.drawable.ic_rect_ngulo_btncheck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.DecimalFormat;
import java.util.Arrays;

public class availability_nuevo extends AppCompatActivity {
    TextView tv;
    TextView textspin1;
    Spinner spin;
    VideoView vv;
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
    String[] temp =objetoArrays.pragerGratis;
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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability_nuevo);

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
        btn_test = findViewById(R.id.btn_test);
        spin = findViewById(R.id.spinuno);
        vv = findViewById(R.id.vv);
        vf = findViewById(R.id.vf);
        userid = mAuth.getCurrentUser().getUid();
        docref= db.collection(userid).document("WhereisStudent");


        PremiumAndArrayControler();
        sendInfotoDb();

    }

    private void PremiumAndArrayControler() {
        prefs = new Prefs(this);
        Intent reciver = getIntent();
        personalizedPlan = reciver.getBooleanExtra("isThePlanPersonalized",false);
        isCustom = reciver.getBooleanExtra("isCustom",false);
        BasicListeningPlan= reciver.getBooleanExtra("BasicListeningPlan",false);
        BasicListeningPlanFromDb=reciver.getBooleanExtra("FromListeningDb",false);


        if(personalizedPlan){
            pasarSigNivel.setVisibility(View.VISIBLE);
            if(isCustom){
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pragerPremium,
                            android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);

                            tv.setText("");
                            btnFinalizarTest();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                } else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.prager,
                            android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);

                            tv.setText("");
                            btnFinalizarTest();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }else {
                if (prefs.getPremium()==1){
                    //Give the user all the premium features
                    //hide ads if you are showing ads
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pragerPremium,
                            android.R.layout.simple_spinner_item);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);

                            tv.setText("");
                            btnFinalizarTest();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                } else if (prefs.getPremium()==0){
                    //remove user all the premium features
                    //show ads to the user
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                            android.R.layout.simple_spinner_item,temp);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin.setAdapter(adapter);
                    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            selection = spin.getSelectedItem().toString();
                            textspin1.setText(selection);

                            vv.setVisibility(View.GONE);
                            vf.setVisibility(View.VISIBLE);

                            tv.setText("");
                            btnFinalizarTest();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }
        }else {
            pasarSigNivel.setVisibility(View.GONE);
            btn_test.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
            if (prefs.getPremium()==1){
                //Give the user all the premium features
                //hide ads if you are showing ads
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pragerPremium,
                        android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();
                        textspin1.setText(selection);

                        vv.setVisibility(View.GONE);
                        vf.setVisibility(View.VISIBLE);

                        tv.setText("");
                        btnFinalizarTest();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

            } else if (prefs.getPremium()==0){
                //remove user all the premium features
                //show ads to the user
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.prager,
                        android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapter);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        selection = spin.getSelectedItem().toString();
                        textspin1.setText(selection);

                        vv.setVisibility(View.GONE);
                        vf.setVisibility(View.VISIBLE);

                        tv.setText("");
                        btnFinalizarTest();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }
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
        if(temp.length==1){
            // si queda nada de arrays cambia de vocab a estructura
            isBasicStructures=true;
            Intent intent = new Intent(availability_nuevo.this,estructura_nuevo.class);
            intent.putExtra("isThePlanPersonalized",personalizedPlan);
            intent.putExtra("basicSctructures",isBasicStructures );
            intent.putExtra("isCustom",false);
            startActivity(intent);
        }else{
            // aqui el temp que es un array es igual a este metodo que le quita la seleci[on
            temp = RemoveApprovedElementFromArray(selection);
            //premiumControler updatea el array del spinner
            PremiumAndArrayControler();
            sendInfotoDb();
        }
    }
    public void PasarSiguienteEstructura(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(availability_nuevo.this)
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
                            Intent intent = new Intent(availability_nuevo.this, conscisousinterference_nuevo.class);
                            intent.putExtra("isThePlanPersonalized",personalizedPlan);
                            intent.putExtra("isCustom",false);
                            startActivity(intent);
                        }else {
                            Intent intent = new Intent(availability_nuevo.this, cultura_nuevo.class);
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
                        Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                    }
                })
                .show();


    }

    int pregIndex = 0;
    int pregCorrect = 0;

    String preguntas []={};
    String Respuestas [][]={};
    String RespuestasCorrectas [][] = {};
    String RespCorrecta;

    public static double calcularPorcentaje(double total, int porcentaje, double cantidadPreg) {
        return (porcentaje * total) / cantidadPreg;
    }

    public void preguntasSeleccionada(){
        String pregSele[];
        String RespSele [][];
        String RespuestasCorrectasSele [][];
        switch (selection) {
            case "Tutorial":
                Toast.makeText(this, "Por favor seleccione una actividad.", Toast.LENGTH_SHORT).show();
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
                                "Martin Luther King Jr.",
                                "Al Sharpton",
                                "Kweisi Mfume, the president of the NAACP.",
                                "Jesse Jackson"
                        },
                        {
                                "They are five times more likely to live in poverty and commit crime; nine times more likely to drop out of school and 20 times more likely to end up in prison.",
                                "They are three times more likely to live in poverty and commit crime; six times more likely to drop out of school and 15 times more likely to end up in prison.",
                                "They are four times more likely to live in poverty and commit crime; eight times more likely to drop out of school and 18 times more likely to end up in prison.",
                                "They are six times more likely to live in poverty and commit crime; 10 times more likely to drop out of school and 25 times more likely to end up in prison.",
                        },
                        {
                                "They are less likely to engage in risky behavior.",
                                "They are more likely to graduate from college.",
                                "They are more likely to have stable relationships.",
                                "They are more likely to end up in jail."
                        },
                        {
                                "50 percent.",
                                "60 percent.",
                                "41 percent.",
                                "70 percent."
                        },
                        {
                                "No, they were less likely.",
                                "Yes, but only slightly.",
                                "Yes, significantly more likely.",
                                "Yes, according to economist Walter Williams."
                        },
                        {
                                "53 percent.",
                                "73 percent.",
                                "63 percent.",
                                "83 percent."
                        },
                        {
                                "The rise of feminism.",
                                "The decrease in religious values.",
                                "The welfare system that allows women to marry the government.",
                                "The welfare system that allows women to marry the government.",
                        },
                        {
                                "Lil Wayne.",
                                "Tupac Shakur.",
                                "Drake.",
                                "Asap Rocky.",
                        },
                        {
                                "Learned helplessness.",
                                "Enabling behavior.",
                                "Codependency.",
                                "Social welfare syndrome."
                        },
                        {
                                "Most of the non-poor respondents said yes.",
                                "50 percent of poor respondents said yes.",
                                "64 percent of poor respondents said yes.",
                                "75 percent of poor respondents said yes."
                        },
                        {
                                "Material possessions.",
                                "A mother's love.",
                                "A Grandma's love.",
                                "Discipline and confidence."
                        },
                        {
                                "The ability to calm a child down and teach them how to be a man.",
                                "The ability to teach a child how to fight.",
                                "The ability to teach a child how to be a gentleman.",
                                "The ability to teach a child how to be a man."
                        },
                        {
                                "Lawyer.",
                                "Teacher.",
                                "Fireman",
                                "Janitor.",
                        },
                        {
                                "That hard work doesn't pay off.",
                                "all of the above",
                                "That success is all about who you know.",
                                "That hard work wins, and you get out of life what you put into it."
                        },
                        {
                                "A government policy that prioritizes the importance of fathers.",
                                "Increased government welfare benefits.",
                                "More government-funded job training programs.",
                                "leave everything as is",
                        },
                        {
                                "Cornel West.",
                                "Michael Eric Dyson.",
                                "Larry Elder.",
                                "Barack Obama"
                        }
                };

                RespuestasCorrectasSele = new String[][]{
                        {
                            "Kweisi Mfume, the president of the NAACP."
                        },
                        {
                            "They are five times more likely to live in poverty and commit crime; nine times more likely to drop out of school and 20 times more likely to end up in prison."
                        },
                        {
                            "They are more likely to end up in jail."
                        },
                        {
                            "41 percent."
                        },
                        {
                            "Yes, according to economist Walter Williams."
                        },
                        {
                            "73 percent."
                        },
                        {
                            "The welfare system that allows women to marry the government."
                        },
                        {
                             "Tupac Shaku."
                        },
                        {
                            "Learned helplessness."
                        },
                        {
                            "64 percent of poor respondents said yes."
                        },
                        {
                            "Discipline and confidence."
                        },
                        {
                            "The ability to calm a child down and teach them how to be a man."
                        },
                        {
                            "Janitor."
                        },
                        {
                            "Hard work wins, and you get out of life what you put into it."
                        },
                        {
                            "A government policy that prioritizes the importance of fathers."
                        },
                        {
                            "Larry Elder."
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
            case "Dont Compare Yourself to Others":
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
                                "Louis C.K."
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
                                "Make people change to live better.",
                                "Blaming people makes you the problem.",
                                "Divorcing a partner takes courage.",
                                "Being miserable makes us blame people.",
                        },
                        {
                                "Encourage their anger and alteration of reason or senses.",
                                "Happiness and calm.",
                                "Loss of person.",
                                "All of the above.",

                        },
                        {
                                "What should you eat tomorrow? What did you eat yesterday?",
                                "What time do I have to work? What should I bring?",
                                "What is the dog doing?",
                                "What are you doing that is wrong, from your own perspective? What could you fix, right now?"
                        },
                        {
                                "Blaming people and not accepting their mistakes.",
                                "The search for answers and why everything goes wrong.",
                                "The first attitude blame the world. The second ask what they could do differently.",
                                "Crying and not accepting mistakes."
                        },
                        {
                                "All the bad things he's done.",
                                "Try to forgive the things your wife did.",
                                "Not accepting help and feeling like you did nothing wrong.",
                                "The memory of the terrible things his wife has done and why he can't live with her anymore."
                        },
                        {
                                "Think of all the ways her husband let her down.",
                                "In all the mistakes you've had.",
                                "In the problems that her husband has.",
                                "How will your life be."
                        },
                        {
                                "Because no one seeks to improve personally.",

                                "Due to the fact that they want to change the other person instead of changing themselves.",
                                "By the opinions of outsiders.",
                                "For the problems caused by the two."
                        },
                        {
                                "Blame someone else for your misery.",
                                "Accept the situation.",
                                "Blame yourself.",
                                "Ignore the situation."
                        },
                        {
                                "The odyssey.",
                                "The Cocktail Party.",
                                "Romeo and Juliet.",
                                "Romance of the Three Kingdoms."
                        },
                        {
                                "Who feels that everything is family fault.",
                                "Who needs help to improve.",
                                "She hopes that her suffering is her fault. because you can do something about it.",
                                "She hates everyone around her."
                        },
                        {
                                "Never looking for ways to improve.",
                                "They always look for a way to excuse themselves to others.",
                                "But there are ways to improve.",
                                "Most of us have the opportunity to improve our lives."
                        },
                        {
                                "Change people.",
                                "Don't fix the world, there's no reason to. But you can fix yourself. You will not do by doing.",
                                "Improving the political party.",
                                "Taking care of the environment."
                        },
                        {
                                "You have to know what you are doing.",
                                "You don't always know what you're doing.",
                                "You can know that something is right or wrong without knowing why.",
                                "It's always good to ask."
                        },
                        {
                                "If you do those things, your life will improve. You will become more peaceful, productive and desirable.",
                                "It would be better than before.",
                                "I wouldn't change a thing, I'm fine like that.",
                                "He would love me more."
                        },
                        {
                                "Nothing is achieved if you don't feel.",
                                "The mind will become clearer, life will become less tragic and more confident.",
                                "Problems accumulate and you explode.",
                                "Sores to a peace of mind."
                        },
                        {
                                "Toronto.",
                                "California.",
                                "Texas.",
                                "Los Angeles."
                        },
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "Blaming people makes you the problem."
                        },
                        {
                                "Encourage their anger and alteration of reason or the senses."
                        },
                        {
                                "What are you doing that is wrong, from your own perspective? What could you fix, right now?"
                        },
                        {
                                "The first attitude blame the world. The second ask what they could do differently."
                        },
                        {
                                "The memory of the terrible things his wife has done and why he can't live with her anymore."
                        },
                        {
                                "Think of all the ways her husband let her down."
                        },
                        {
                                "Due to the fact that they want to change the other person instead of changing themselves."
                        },
                        {
                                "Blame someone else for your misery."
                        },
                        {
                                "The Cocktail Party."
                        },
                        {
                                "She hopes that her suffering is her fault. because you can do something about it."
                        },
                        {
                                "Most of us have the opportunity to improve our lives."
                        },
                        {
                                "Don't fix the world, there's no reason to. But you can fix yourself. You will not do by doing."
                        },
                        {
                                "You can know that something is right or wrong without knowing why."
                        },
                        {
                                "If you do those things, your life will improve. You will become more peaceful, productive and desirable."
                        },
                        {
                                "The mind will become clearer, life will become less tragic and more confident."
                        },
                        {
                                "Toronto."
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
                                "A. To describe the differences between men and women.",
                                "B. To illustrate the difficulty of learning a new skill.",
                                "C. To show the importance of having fun at the beach.",
                                "D. To explain the physics of buoyancy."
                        },
                        {
                                "A. They are basically the same.",
                                "B. They are completely different.",
                                "C. They are determined by socialization.",
                                "D. They are interchangeable."
                        },
                        {
                                "A. Great-grandmother",
                                "B. Gender studies PhD",
                                "C. Both equally",
                                "D. Neither"
                        },
                        {
                                "A. Believing men and women are different.",
                                "B. Believing men and women are the same.",
                                "C. Believing gender roles are natural.",
                                "D. Believing gender roles are socially constructed."
                        },
                        {
                                "A. A story about a girl who turned her toy trucks into weapons.",
                                "B. A story about a girl who pretended her toy trucks were sleeping.",
                                "C. A story about a boy who turned his toy trucks into weapons.",
                                "D. A story about a boy who pretended his toy trucks were sleeping."
                        },
                        {
                                "A. Yes, always.",
                                "B. No, never.",
                                "C. Sometimes, depending on the individual.",
                                "D. It is impossible to know."
                        },
                        {
                                "A. As a sacred act between committed partners.",
                                "B. As a casual form of entertainment.",
                                "C. As a strictly regulated activity.",
                                "D. As a dangerous and risky behavior."
                        },
                        {
                                "A. She feels empowered.",
                                "B. She feels indifferent.",
                                "C. She feels vulnerable.",
                                "D. She feels excited."
                        },
                        {
                                "A. It is less satisfying in all aspects.",
                                "B. It is equally satisfying.",
                                "C. It is more satisfying emotionally, psychologically, physically, and spiritually.",
                                "D. It depends on the individual's personal beliefs."
                        },
                        {
                                "A. The media and entertainment industry.",
                                "B. The religious institutions.",
                                "C. The government and politicians.",
                                "D. The academic and intellectual community."
                        },
                        {
                                "A. A Hollywood actor.",
                                "B. A gender studies PhD.",
                                "C. An Associate Professor of Theology and Philosophy at Biola University.",
                                "D. A New York pediatrician."
                        },
                        {
                                "A. To embrace modern ideas about gender and sexuality.",
                                "B. To trust common sense and recognize the differences between men and women.",
                                "C. To argue that gender roles should be abolished.",
                                "D. To promote a more casual attitude towards sex."
                        },
                        {
                                "A. Because it's physically painful.",
                                "B. Because it has no meaning.",
                                "C. Because sex and intimacy have deeper meaning for women.",
                                "D. Because men and women are basically the same."
                        },
                        {
                                "A. Because she asked for them.",
                                "B. To avoid conforming to gender stereotypes.",
                                "C. Because they were on sale.",
                                "D. To encourage her interest in mechanics."
                        },
                        {
                                "A. A story about a boy turning a toy truck into a weapon.",
                                "B. A story about a boy using a stick as a weapon.",
                                "C. A story about a boy turning a stuffed animal into a weapon.",
                                "D. A story about a boy using a pillow as a weapon."
                        },
                        {
                                "A. Because it is a big deal with deep emotional, psychological, and physical implications.",
                                "B. Because society wanted to control women's sexuality.",
                                "C. Because it was more convenient for inheritance purposes.",
                                "D. Because of religious dogma."
                        }
                };

                RespuestasCorrectasSele = new String[][]{
                        {
                            "A. To describe the differences between men and women."
                        },
                        {
                            "B. They are completely different."
                        },
                        {
                            "A. Great-grandmother"
                        },
                        {
                            "B. Believing men and women are the same."
                        },
                        {
                            "B. A story about a girl who pretended her toy trucks were sleeping."
                        },
                        {
                            "B. No, never."
                        },
                        {
                            "B. As a casual form of entertainment."
                        },
                        {
                            "C. She feels vulnerable."
                        },
                        {
                            "C. It is more satisfying emotionally, psychologically, physically, and spiritually."
                        },
                        {
                            "D. The academic and intellectual community."
                        },
                        {
                            "C. An Associate Professor of Theology and Philosophy at Biola University."
                        },
                        {
                            "B. To trust common sense and recognize the differences between men and women."
                        },
                        {
                            "C. Because sex and intimacy have deeper meaning for women."
                        },
                        {
                            "B. To avoid conforming to gender stereotypes."
                        },
                        {
                            "A. A story about a boy turning a toy truck into a weapon."
                        },
                        {
                            "A. Because it is a big deal with deep emotional, psychological, and physical implications."
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "Dont Waste Your Time":
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
                                "To have fun and enjoy casual flings.",
                                "To find someone to marry.",
                                "To meet new people.",
                                "To explore common interests",
                        },
                        {
                                "It leads to unrealistic expectations.",
                                "It is too predictable.",
                                "It does not take into account the importance of shared values.",
                                "It can lead to miscommunication about the ideal outcome of the relationship.",
                        },
                        {
                                "Real love and a tryout for marriage.",
                                "Desire for a roommate or lack of other opportunities.",
                                "Inability to afford a single apartment.",
                                "All of the above.",
                        },
                        {
                                "Someone who wants to build a shared life.",
                                "Someone who shares their values and beliefs.",
                                "Someone who views them as a partner.",
                                "All of the above.",
                        },
                        {
                                "It can lead to misunderstandings about the long-term future of the relationship.",
                                "It is not a valid basis for a serious relationship.",
                                "It can lead to boredom and a lack of excitement in the relationship.",
                                "All of the above.",
                        },
                        {
                                "Wait and see if things improve.",
                                "End it.",
                                "Try harder to make it work.",
                                "Take a break from each other.",
                        },
                        {
                                "They do not articulate what they really want.",
                                "They are too picky.",
                                "They are afraid of commitment.",
                                "They do not know what they want.",
                        },
                        {
                                "Protection, commitment, and love.",
                                "Financial security, companionship, and emotional stability.",
                                "Adventure, excitement, and passion.",
                                "None of the above.",
                        },
                        {
                                "There is no difference.",
                                "Marriage involves more commitment, obligations, and expectations.",
                                "Living together is more romantic.",
                                "Marriage is more about having fun.",
                        },
                        {
                                "Agree with them.",
                                "Ask them why they are so reluctant to sign it.",
                                "Tell them they are wrong.",
                                "None of the above.",
                        },
                        {
                                "As much as you think about what kind of career you want.",
                                "More than what kind of career you want.",
                                "More than what kind of career you want.",
                                "Not at all.",
                        },
                        {
                                "Living together is more fun.",
                                "Living together is a tryout for marriage.",
                                "Dating is a tryout for marriage.",
                                "There is no difference.",
                        },
                        {
                                "Discuss their values and beliefs.",
                                "Talk about marriage.",
                                "Wait until the pizza is served to discuss marriage.",
                                "Have fun.",
                        },
                        {
                                "To think about them as much as you think about your career.",
                                "To prioritize relationships over your career.",
                                "To only focus on your career.",
                                "To think about relationships less than your career.",
                        },
                        {
                                "Hate.",
                                "Money.",
                                "Love.",
                                "Nothing.",
                        },
                        {
                                "Adolfo Peñaloza.",
                                "Alejandro Berry.",
                                "Lauren Chen.",
                                "Adriana Monsalve.",
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "To find someone to marry."
                        },
                        {
                                "It can lead to miscommunication about the ideal outcome of the relationship."
                        },
                        {
                                "All of the above."
                        },
                        {
                                "All of the above."
                        },
                        {
                                "It can lead to misunderstandings about the long-term future of the relationship."
                        },
                        {
                                "End it."
                        },
                        {
                                "They do not articulate what they really want."
                        },
                        {
                                "Protection, commitment, and love."
                        },
                        {
                                "Marriage involves more commitment, obligations, and expectations."
                        },
                        {
                                "Ask them why they are so reluctant to sign it."
                        },
                        {
                                "As much as you."
                        },
                        {
                                "Living together is a tryout for marriage."
                        },
                        {
                                "Have fun."
                        },
                        {
                                "To think about them as much as you think about your career."
                        },
                        {
                                "Love."
                        },
                        {
                                "Lauren Chen."
                        }
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
                            "The speech does not mention a specific cause."
                        },
                        {
                            "30 percent."
                        },
                        {
                            "The Power Few."
                        },
                        {
                            "It helps law enforcement gather information about other crimes."
                        },
                        {
                            "A concept where police and prosecutors collaborate from the beginning of an investigation."
                        },
                        {
                            "The longer the prison sentence, the less likely the criminal will commit another crime."
                        },
                        {
                            "A graph that shows the relationship between age and crime rates."
                        },
                        {
                            "Target high-frequency offenders and keep them in jail."
                        },
                        {
                            "It minimizes legal errors and ensures justice is done."
                        },
                        {
                            "To reduce crime rates in cities."
                        },
                        {
                            "The Power Few."
                        },
                        {
                            "It substantially reduces violent crime rates throughout an entire city."
                        },
                        {
                            "Targeting high-frequency offenders and keeping them in jail can substantially reduce crime rates in cities."
                        },
                        {
                            "A federal agency that analyzes the impact of prison sentences on reducing crime rates."
                        },
                        {
                            "Because they believe that punishment is an effective deterrent to crime."
                        },
                        {
                            "It reduces the number of potential victims on the street."
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
                                "It was caused by three decades of bank de-regulation.",
                                "It was caused by too much government involvement in the financial industry.",
                                "It was caused by the banks becoming too large and powerful.",
                                "It was caused by a lack of oversight and regulation of the financial industry."
                        },
                        {
                                "Banks stopped lending money to other banks.",
                                "The stock market crashed, causing a chain reaction throughout the financial industry.",
                                "General Electric was unable to pay its workers.",
                                "The government refused to bail out Lehman Brothers."
                        },
                        {
                                "To bail out Lehman Brothers.",
                                "To pump taxpayer cash into America's banks and financial institutions.",
                                "To provide short-term credit to struggling companies.",
                                "To regulate the financial industry more closely."
                        },
                        {
                                "The bank had too much debt to be saved.",
                                "The bank was too large and powerful to be allowed to fail.",
                                "The bank was too risky to be bailed out.",
                                "The bank was too small to have a significant impact on the financial industry."
                        },
                        {
                                "It led to a short-term panic in the financial markets.",
                                "It created a long-term expectation that the government would always bail out big banks.",
                                "It resulted in a decline in the number of investors willing to lend money to American banks.",
                                "It had no direct impact on the 2008 financial crisis."
                        },
                        {
                                "It allowed the hedge fund to fail, sending shockwaves through the financial industry.",
                                "It bailed out the hedge fund and several big banks that were at risk of failing.",
                                "It implemented new regulations to prevent future hedge fund failures.",
                                "It did not take any action."
                        },
                        {
                                "It led to an increase in regulation and oversight of the financial industry.",
                                "It sent a message to banks that they could take bigger risks because the government would bail them out.",
                                "It resulted in a decrease in investor confidence in the financial industry.",
                                "It had no direct impact on the 2008 financial crisis."
                        },
                        {
                                "The government did not have the funds to do so.",
                                "The government believed that Lehman Brothers was too risky to be saved.",
                                "The government wanted to send a message to the financial industry that it could not always rely ongovernment bailouts.",
                                "The government believed that saving Lehman Brothers would have set a dangerous precedent."
                        },
                        {
                                "It caused a short-term panic in the financial markets.",
                                "It led to a credit-market freeze.",
                                "It resulted in the failure of several other large financial institutions.",
                                "It had no direct impact on the financial industry."
                        },
                        {
                                "Passing thousands of new regulations.",
                                "Allowing the big banks to fail.",
                                "Increasing government control over the financial industry.",
                                "The government must stop guaranteeing the big banks' losses."
                        },
                        {
                                "The government believed that Continental Illinois was too risky to be saved.",
                                "The government wanted to send a message to the financial industry that it would always bail out big banks.",
                                "The government feared that if Continental Illinois failed, it would cause a panic in the financial markets.",
                                "The media coined the phrase to describe the government's response to the crisis."
                        },
                        {
                                "It led to an increase in regulation and oversight of the financial industry.",
                                "It sent a message to banks that they could take bigger risks because the government would bail them out.",
                                "It resulted in a decrease in investor confidence in the financial industry.",
                                "It had no direct impact on the financial industry."
                        },
                        {
                                "Banks should be more cautious and avoid taking big risks.",
                                "Banks should expect government bailouts in times of crisis.",
                                "The government is unable to save all financial institutions that are in trouble.",
                                "The financial industry should be more self-reliant and less dependent on government support."
                        },
                        {
                                "It led to an increase in regulation and oversight of the financial industry.",
                                "It sent a message to banks that they could take bigger risks because the government would bail them out.",
                                "It resulted in a decrease in investor confidence in the financial industry.",
                                "It had no direct impact on the financial industry."
                        },
                        {
                                "Because he believed in government intervention in the financial industry.",
                                "Because he wanted to send a message to the financial industry that the government would always bail out big banks.",
                                "Because he believed that the global financial system was in danger of collapsing.",
                                "Because he wanted to gain political support from the financial industry"
                        },
                        {
                                "Increase government regulation of the financial industry.",
                                "Allow the big banks to fail.",
                                "Decrease government involvement in the financial industry.",
                                "Increase government support for the financial industry."
                        }
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                            "It was caused by three decades of bank de-regulation."
                        },
                        {
                            "Banks stopped lending money to other banks."
                        },
                        {
                            "To pump taxpayer cash into America's banks and financial institutions."
                        },
                        {
                            "The bank was too large and powerful to be allowed to fail."
                        },
                        {
                            "It created a long-term expectation that the government would always bail out big banks."
                        },
                        {
                            "It bailed out the hedge fund and several big banks that were at risk of failing."
                        },
                        {
                            "It sent a message to banks that they could take bigger risks because the government would bail them out."
                        },
                        {
                            "The government wanted to send a message to the financial industry that it could not always rely on government bailouts."
                        },
                        {
                            "It led to a credit-market freeze."
                        },
                        {
                            "The government must stop guaranteeing the big banks' losses."
                        },
                        {
                            "The government feared that if Continental Illinois failed, it would cause a panic in the financial markets."
                        },
                        {
                            "It sent a message to banks that they could take bigger risks because the government would bail them out."
                        },
                        {
                            "Banks should expect government bailouts in times of crisis."
                        },
                        {
                            "It sent a message to banks that they could take bigger risks because the government would bail them out."
                        },
                        {
                            "Because he believed that the global financial system was in danger of collapsing."
                        },
                        {
                            "Decrease government involvement in the financial industry."
                        }
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;
        }
    }

    public void availabilityTest(View v){
        activarBtns();
        if (pregIndex == 16) {
            verResultado();
            pregIndex = 0;
        } else {
            switch (selection){
                case "Tutorial":
                    Toast.makeText(this, "Selecciona un pragger", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    tv.setVisibility(View.GONE);
                    test_view.setVisibility(View.VISIBLE);
                    startTest();
                    limpBtns();
                    break;
            }
        }
    }

    public void btnFinalizarTest(View v){
        tv.setVisibility(View.VISIBLE);
        test_view.setVisibility(View.GONE);
        result_view.setVisibility(View.GONE);
        LimpiarResultado();
    }

    public void btnFinalizarTest(){
        tv.setVisibility(View.VISIBLE);
        test_view.setVisibility(View.GONE);
        result_view.setVisibility(View.GONE);
        pregIndex = 0;
        LimpiarResultado();
    }

    public void verResultado(View v){
        tv.setVisibility(View.GONE);
        test_view.setVisibility(View.GONE);
        result_view.setVisibility(View.VISIBLE);
        int pregL = preguntas.length + 1;
        double result = calcularPorcentaje(100,pregCorrect,16);

        DecimalFormat df = new DecimalFormat("#.##");
        double pregResult = Double.parseDouble(df.format(result));

        String numeroEnString = Double.toString(pregResult);
        scoreText.setText(numeroEnString);
    }

    public void LimpiarResultado(){
        pregCorrect = 0;
    };

    public void verResultado(){
        tv.setVisibility(View.GONE);
        test_view.setVisibility(View.GONE);
        result_view.setVisibility(View.VISIBLE);
        int pregL = preguntas.length + 1;
        double result = calcularPorcentaje(100,pregCorrect,16);

        DecimalFormat df = new DecimalFormat("#.##");
        double pregResult = Double.parseDouble(df.format(result));

        String numeroEnString = Double.toString(pregResult);
        scoreText.setText(numeroEnString);
    }

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
            preg1.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;
        }else{
            preg1.setBackgroundColor(getResources().getColor(R.color.rojo));
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
            preg2.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;

        }else{
            preg2.setBackgroundColor(getResources().getColor(R.color.rojo));
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
            preg3.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;

        }else{
            preg3.setBackgroundColor(getResources().getColor(R.color.rojo));
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
            preg4.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;

        }else{
            preg4.setBackgroundColor(getResources().getColor(R.color.rojo));
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

    public void select(View v) {
        vv.setVisibility(View.VISIBLE);
        vf.setVisibility(View.GONE);
        sendInfotoDb();
        switch (selection) {

            case "Tutorial":
                Uri urit = Uri.parse("https://adrianlealcaldera.com/avtut.mp4");
                vv.setVideoURI(urit);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;


            case "Black Fathers":
                texts t = new texts();
                String text = t.BlackFathers;
                SpannableString ss = new SpannableString(text);

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

                Uri uri = Uri.parse("http://adrianlealcaldera.com/blackfathers.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Is America Racist?":
                texts t1 = new texts();
                String text1 = t1.isAmericaRacist;
                SpannableString ss1 = new SpannableString(text1);
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


                int iar1 = text1.indexOf("still");
                int iar2 = text1.indexOf("certainly");
                int iar3 = text1.indexOf("thinks so");
                int iar4 = text1.indexOf("that");
                int iar5 = text1.indexOf("if");
                int iar6 = text1.indexOf("doesn’t that mean");
                int iar7 = text1.indexOf("so");
                int iar8 = text1.indexOf("vote");
                int iar9 = text1.indexOf("who");
                int iar10 = text1.indexOf("was");
                int iar11 = text1.indexOf("elected");
                int iar12 = text1.indexOf("almost");
                int iar13 = text1.indexOf("later");
                int iar14 = text1.indexOf("That’s");
                int iar15 = text1.indexOf("only");
                int iar16 = text1.indexOf("the most");
                int iar17 = text1.indexOf("There are");
                int iar18 = text1.indexOf("Take");
                int iar19 = text1.indexOf("marriage");
                int iar20 = text1.indexOf("wrote");
                int iar21 = text1.indexOf("viewed");
                int iar22 = text1.indexOf("benchmark");
                int iar23 = text1.indexOf("stage");
                int iar24 = text1.indexOf("were");
                int iar25 = text1.indexOf("until");
                int iar26 = text1.indexOf("Gallup poll");
                int iar27 = text1.indexOf("found");
                int iar28 = text1.indexOf("that");
                int iar29 = text1.indexOf("of");
                int iar30 = text1.indexOf("all");
                int iar31 = text1.indexOf("by");
                int iar32 = text1.indexOf("rising");
                int iar33 = text1.indexOf("what about");
                int iar34 = text1.indexOf("racial profiling");
                int iar35 = text1.indexOf("Doesn’t that");
                int iar36 = text1.indexOf("remains");
                int iar37 = text1.indexOf("summer");
                int iar38 = text1.indexOf("became");
                int iar39 = text1.indexOf("ground zero");
                int iar40 = text1.indexOf("unarmed");
                int iar41 = text1.indexOf("teenager");
                int iar42 = text1.indexOf("While");
                int iar43 = text1.indexOf("cleared");
                int iar44 = text1.indexOf("wrongdoing");
                int iar45 = text1.indexOf("city’s");
                int iar46 = text1.indexOf("bias");
                int iar47 = text1.indexOf("headline grabbing stat");
                int iar48 = text1.indexOf("gap");
                int iar49 = text1.indexOf("those");
                int iar50 = text1.indexOf("Not so fast");
                int iar51 = text1.indexOf("comprise");
                int iar52 = text1.indexOf("account");
                int iar53 = text1.indexOf("bigger");
                int iar54 = text1.indexOf("even");
                int iar55 = text1.indexOf("than");
                int iar56 = text1.indexOf("PD");
                int iar57 = text1.indexOf("cannot");
                int iar58 = text1.indexOf("about");
                int iar59 = text1.indexOf("without");
                int iar60 = text1.indexOf("Though");
                int iar61 = text1.indexOf("commit");
                int iar62 = text1.indexOf("almost");
                int iar63 = text1.indexOf("always");
                int iar64 = text1.indexOf("according to");
                int iar65 = text1.indexOf("by the way");
                int iar66 = text1.indexOf("over");
                int iar67 = text1.indexOf("twice");
                int iar68 = text1.indexOf("that many");
                int iar69 = text1.indexOf("But");
                int iar70 = text1.indexOf("same");
                int iar71 = text1.indexOf("mostly");
                int iar72 = text1.indexOf("Unlike");
                int iar73 = text1.indexOf("dispatch");
                int iar74 = text1.indexOf("when it comes to");
                int iar75 = text1.indexOf("Therefore");
                int iar76 = text1.indexOf("have a field day");
                int iar77 = text1.indexOf("Actually");
                int iar78 = text1.indexOf("published");
                int iar79 = text1.indexOf("called");
                int iar80 = text1.indexOf("out of");
                int iar81 = text1.indexOf("drivers");
                int iar82 = text1.indexOf("were");
                int iar83 = text1.indexOf("average");
                int iar84 = text1.indexOf("likely");
                int iar85 = text1.indexOf("speeding");
                int iar86 = text1.indexOf("Seatbelt");
                int iar87 = text1.indexOf("usage");
                int iar88 = text1.indexOf("lower");
                int iar89 = text1.indexOf("among");
                int iar90 = text1.indexOf("from");
                int iar91 = text1.indexOf("words");
                int iar92 = text1.indexOf("because of");
                int iar93 = text1.indexOf("also");
                int iar94 = text1.indexOf("higher");
                int iar95 = text1.indexOf("rates");
                int iar96 = text1.indexOf("whether");
                int iar97 = text1.indexOf("wearing");
                int iar98 = text1.indexOf("safety");
                int iar99 = text1.indexOf("there is");
                int iar100 = text1.indexOf("the least");
                int iar101 = text1.indexOf("better");
                int iar102 = text1.indexOf("any");
                int iar103 = text1.indexOf("greater");

                ss1.setSpan(Still, iar1, iar1 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Certainly, iar2, iar2 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Thinksso, iar3, iar3 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(That, iar4, iar4 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(If, iar5, iar5 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Doesntthatmean, iar6, iar6 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(So, iar7, iar7 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Vote, iar8, iar8 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(who2, iar9, iar9 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(was, iar10, iar10 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(elected, iar11, iar11 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(almost, iar12, iar12 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(later, iar13, iar13 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(thats, iar14, iar14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(only, iar15, iar15 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(themost, iar16, iar16 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(thereare, iar17, iar17 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(take, iar18, iar18 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(marriage2, iar19, iar19 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(wrote, iar20, iar20 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(viewed, iar21, iar21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(benchmark, iar22, iar22 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(stage, iar23, iar23 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(were2, iar24, iar24 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(until2, iar25, iar25 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Galluppoll, iar26, iar26 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Found, iar27, iar27 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(That2, iar28, iar28 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Of, iar29, iar29 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(All, iar30, iar30 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(By, iar31, iar31 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Rising, iar32, iar32 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Whatabout, iar33, iar33 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Racialprofiling, iar34, iar34 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Doesntthat, iar35, iar35 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Remains, iar36, iar36 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Summer, iar37, iar37 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Became, iar38, iar38 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Groundzero, iar39, iar39 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Unarmed, iar40, iar40 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Teenager, iar41, iar41 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(While, iar42, iar42 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Cleared, iar43, iar43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Wrongdoing, iar44, iar44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Citys, iar45, iar45 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Bias, iar46, iar46 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Headlinegrabbingstat, iar47, iar47 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Gap, iar48, iar48 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Those, iar49, iar49 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Notsofast, iar50, iar50 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Coprise, iar51, iar51 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Account, iar52, iar52 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Bigger, iar53, iar53 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Even, iar54, iar54 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Than, iar55, iar55 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Pd, iar56, iar56 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Cannot, iar57, iar57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(About, iar58, iar58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Withouth, iar59, iar59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Though, iar60, iar60 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Commit, iar61, iar61 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Almost, iar62, iar62 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Always, iar63, iar63 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Accordingto, iar64, iar64 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Bytheway, iar65, iar65 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Over, iar66, iar66 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Twice, iar67, iar67 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Thatmany, iar68, iar68 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(But, iar69, iar69 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Same, iar70, iar70 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Mostly, iar71, iar71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Unlike, iar72, iar72 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Dispatch, iar73, iar73 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Whenitcomesto, iar74, iar74 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Therefore, iar75, iar75 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Haveafieldday, iar76, iar76 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Actually, iar77, iar77 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Published, iar78, iar78 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Called, iar79, iar79 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Outof, iar80, iar80 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Drivers, iar81, iar81 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Were, iar82, iar82 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Average, iar83, iar83 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Likely, iar84, iar84 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Speeding, iar85, iar85 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Seatbelt, iar86, iar86 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Usage, iar87, iar87 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Lower, iar88, iar88 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Among, iar89, iar89 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(From, iar90, iar90 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Words, iar91, iar91 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Becauseof, iar92, iar92 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Also, iar93, iar93 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Higher, iar94, iar94 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Rates, iar95, iar95 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Whether, iar96, iar96 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Wearing, iar97, iar97 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Safety, iar98, iar98 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Thereis, iar99, iar99 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Theleast, iar100, iar100 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Better, iar101, iar101 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Any, iar102, iar102 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Greater, iar103, iar103 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss1);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/isamericaracist.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Dont Compare Yourself to Others":
                texts t2 = new texts();
                String text2 = t2.DontCompareYourselftoOthers ;
                SpannableString ss2 = new SpannableString(text2);

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


                int ida1 = text2.indexOf("Do you ever look");
                int ida2 = text2.indexOf("I wish");
                int ida3 = text2.indexOf("Everybody");
                int ida4 = text2.indexOf("bet");
                int ida5 = text2.indexOf("compared");
                int ida6 = text2.indexOf("yourself");
                int ida7 = text2.indexOf("do");
                int ida8 = text2.indexOf("own");
                int ida9 = text2.indexOf("middle");
                int ida10 = text2.indexOf("as big as"); //10
                int ida11 = text2.indexOf("pretty");
                int ida12 = text2.indexOf("Here’s why");
                int ida13 = text2.indexOf("people");
                int ida14 = text2.indexOf("whole");
                int ida15 = text2.indexOf("trick");
                int ida16 = text2.indexOf("Here’s what I mean");

                int ida18 = text2.indexOf("happiness");
                int ida19 = text2.indexOf("were based");
                int ida20 = text2.indexOf("biggest"); //20✓
                int ida21 = text2.indexOf("business");
                int ida22 = text2.indexOf("I’d be mad");
                int ida23 = text2.indexOf("whoever");
                int ida24 = text2.indexOf("He beats me");
                int ida25 = text2.indexOf("rich");
                int ida26 = text2.indexOf("a lot");
                int ida27 = text2.indexOf("like");
                int ida28 = text2.indexOf("there were");
                int ida29 = text2.indexOf("richer");
                int ida30 = text2.indexOf("never");//30✓
                int ida31 = text2.indexOf("measure");
                int ida32 = text2.indexOf("constitutes");
                int ida33 = text2.indexOf("success");
                int ida34 = text2.indexOf("entertainment");
                int ida35 = text2.indexOf("All through");
                int ida36 = text2.indexOf("career");
                int ida37 = text2.indexOf("customers");
                int ida38 = text2.indexOf("someday");
                int ida39 = text2.indexOf("you’ll be");
                int ida40 = text2.indexOf("successful");//40
                int ida41 = text2.indexOf("top guy");
                int ida42 = text2.indexOf("someone");
                int ida43 = text2.indexOf("they’re");
                int ida44 = text2.indexOf("disease");
                int ida45 = text2.indexOf("save");
                int ida46 = text2.indexOf("just like");
                int ida47 = text2.indexOf("lawyer");
                int ida48 = text2.indexOf("crazy");
                int ida49 = text2.indexOf("making a living");
                int ida50 = text2.indexOf("pursuing");//50
                int ida51 = text2.indexOf("finding meaning");
                int ida52 = text2.indexOf("what");
                int ida53 = text2.indexOf("first");
                int ida54 = text2.indexOf("standup");
                int ida55 = text2.indexOf("nobody");
                int ida56 = text2.indexOf("tuned-out crowds");
                int ida57 = text2.indexOf("before");
                int ida58 = text2.indexOf("jokes");
                int ida59 = text2.indexOf("laughing");
                int ida60 = text2.indexOf("about");//60
                int ida61 = text2.indexOf("sold out houses");
                int ida62 = text2.indexOf("I wasn’t playing");
                int ida63 = text2.indexOf("big paydays");
                int ida64 = text2.indexOf("able");
                int ida65 = text2.indexOf("their");
                int ida66 = text2.indexOf("dark");
                int ida67 = text2.indexOf("struggles");
                int ida68 = text2.indexOf("envy");
                int ida69 = text2.indexOf("went along with it");
                int ida70 = text2.indexOf("factor");//70
                int ida71 = text2.indexOf("sort of");
                int ida72 = text2.indexOf("mix-and-match game");
                int ida73 = text2.indexOf("world");
                int ida74 = text2.indexOf("Here’s one of life’s little truths");
                int ida75 = text2.indexOf("package deal");
                int ida76 = text2.indexOf("view");
                int ida77 = text2.indexOf("someone else’s life");
                int ida78 = text2.indexOf("cheating");
                int ida79 = text2.indexOf("pretty cool");
                int ida80 = text2.indexOf("hang with him");
                int ida81 = text2.indexOf("pain");//80
                int ida82 = text2.indexOf("anybody");
                int ida83 = text2.indexOf("really");
                int ida84 = text2.indexOf("awful stuff");
                int ida85 = text2.indexOf("deal with");
                int ida86 = text2.indexOf("battle");
                int ida87 = text2.indexOf("dead rock stars");
                int ida88 = text2.indexOf("hard");
                int ida89 = text2.indexOf("Face it");
                int ida90 = text2.indexOf("sell out");
                int ida91 = text2.indexOf("biggest venues");//90
                int ida92 = text2.indexOf("prime-time TV show");
                int ida93 = text2.indexOf("viewers");
                int ida94 = text2.indexOf("half");
                int ida95 = text2.indexOf("myself");
                int ida96 = text2.indexOf("I’m doing okay");
                int ida97 = text2.indexOf("try");




                ss2.setSpan(Doyoueverlook, ida1, ida1 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Iwish, ida2, ida2 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Everybody, ida3, ida3 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Bet, ida4, ida4 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Compared, ida5, ida5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Yourself, ida6, ida6 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Do, ida7, ida7 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Own, ida8, ida8 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Middle, ida9, ida9 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Asbigas, ida10, ida10 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //10
                ss2.setSpan(Pretty, ida11, ida11 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hereswhy, ida12, ida12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(People, ida13, ida13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Whole, ida14, ida14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Trick, ida15, ida15 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(HereswhatImean, ida16, ida16 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss2.setSpan(Happiness, ida18, ida18 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Werebased, ida19, ida19 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Biggest, ida20, ida20 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //20
                ss2.setSpan(Business, ida21, ida21 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Idbemad, ida22, ida22 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Whoever, ida23, ida23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hebeastme, ida24, ida24 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Rich, ida25, ida25 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Alot, ida26, ida26 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Like, ida27, ida27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Therewere, ida28, ida28 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Richer, ida29, ida29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Never, ida30, ida30 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Measure, ida31, ida31 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss2.setSpan(Constitutes, ida32, ida32 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Success, ida33, ida33 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Entertainment, ida34, ida34 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Allthrough, ida35, ida35 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Career, ida36, ida36 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Customers, ida37, ida37 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Someday, ida38, ida38 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Youllbe, ida39, ida39 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Successful, ida40, ida40 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss2.setSpan(Topguy, ida41, ida41 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Someone, ida42, ida42 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Theyre, ida43, ida43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Disease, ida44, ida44 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Save, ida45, ida45 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Justlike, ida46, ida46 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Lawyer, ida47, ida47 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Crazy, ida48, ida48 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Makingaliving, ida49, ida49 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Pursuing, ida50, ida50 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss2.setSpan(Findingmeaning, ida51, ida51 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(What, ida52, ida52 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(First, ida53, ida53 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Standup, ida54, ida54 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Nobody, ida55, ida55 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Tunedoutcrowds, ida56, ida56 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Before, ida57, ida57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Jokes, ida58, ida58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Laughing, ida59, ida59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(about, ida60, ida60 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss2.setSpan(Soldouthouses, ida61, ida61 +15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Iwasntplaying, ida62, ida62 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Bigpayday, ida63, ida63 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Able, ida64, ida64 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Their, ida65, ida65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Dark, ida66, ida66 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Struggle, ida67, ida67 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Envy, ida68, ida68 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Wentalongwithit, ida69, ida69 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Factor, ida70, ida70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss2.setSpan(Sortof, ida71, ida71 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Mixandmatchgame, ida72, ida72 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(World, ida73, ida73 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Heresoneoflifeslittletruths, ida74, ida74 + 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Packagedeal, ida75, ida75 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(View, ida76, ida76 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Someoneelseslife, ida77, ida77 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Cheating, ida78, ida78 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Prettycool, ida79, ida79 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hangwithhim, ida80, ida80 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss2.setSpan(Pain, ida81, ida81 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Anybody, ida82, ida82 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Really, ida83, ida83 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Awfulstuff, ida84, ida84 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Dealwith, ida85, ida85 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Battle, ida86, ida86 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Deadrockstars, ida87, ida87 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hard, ida88, ida88 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Faceit, ida89, ida89 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Sellout, ida90, ida90 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss2.setSpan(Biggestvenues, ida91, ida91 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(PrimetimeTVshow, ida92, ida92 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Viewers, ida93, ida93 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Half, ida94, ida94 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Myself, ida95, ida95 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Imdoingokay, ida96, ida96 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Try, ida97, ida97 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss2);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri2 = Uri.parse("https://adrianlealcaldera.com/DontCompareYourselftoOthersPrag.mp4");
                vv.setVideoURI(uri2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Fix Yourself":
                texts t3 = new texts();
                String text3 = t3.fixyoursel;
                SpannableString ss3 = new SpannableString(text3);

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
                        openDialog(d.Business1);
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

                int ira1 = text3.indexOf("Blaming others");
                int ira2 = text3.indexOf("waste of time");
                int ira3 = text3.indexOf("that");
                int ira4 = text3.indexOf("learn");
                int ira5 = text3.indexOf("anything");
                int ira6 = text3.indexOf("grow");
                int ira7 = text3.indexOf("mature");
                int ira8 = text3.indexOf("Thus");
                int ira9 = text3.indexOf("life");
                int ira10 = text3.indexOf("better");//10
                int ira11 = text3.indexOf("as");
                int ira12 = text3.indexOf("there are");
                int ira13 = text3.indexOf("attitudes");
                int ira14 = text3.indexOf("toward");
                int ira15 = text3.indexOf("sorrows");
                int ira16 = text3.indexOf("Those");
                int ira17 = text3.indexOf("first");
                int ira18 = text3.indexOf("world");
                int ira19 = text3.indexOf("second");
                int ira20 = text3.indexOf("differently");//20
                int ira21 = text3.indexOf("couple");
                int ira22 = text3.indexOf("on the brink");
                int ira23 = text3.indexOf("They’re");
                int ira24 = text3.indexOf("hurt");
                int ira25 = text3.indexOf("angry");
                int ira26 = text3.indexOf("unhappy");
                int ira27 = text3.indexOf("bitter");
                int ira28 = text3.indexOf("husband");
                int ira29 = text3.indexOf("recalls");
                int ira30 = text3.indexOf("things");//30
                int ira31 = text3.indexOf("wife");
                int ira32 = text3.indexOf("reasons");
                int ira33 = text3.indexOf("no longer live with her");
                int ira34 = text3.indexOf("harried");
                int ira35 = text3.indexOf("disillusioned");
                int ira36 = text3.indexOf("all");
                int ira37 = text3.indexOf("ways");
                int ira38 = text3.indexOf("let her down");
                int ira39 = text3.indexOf("Each");
                int ira40 = text3.indexOf("changes");//40
                int ira41 = text3.indexOf("prospects");
                int ira42 = text3.indexOf("grim");
                int ira43 = text3.indexOf("aren’t");
                int ira44 = text3.indexOf("You’re");
                int ira45 = text3.indexOf("can’t");
                int ira46 = text3.indexOf("yourself");
                int ira47 = text3.indexOf("courage");
                int ira48 = text3.indexOf("easier");
                int ira49 = text3.indexOf("much more");
                int ira50 = text3.indexOf("gratifying");//50
                int ira51 = text3.indexOf("basest");
                int ira52 = text3.indexOf("desires");
                int ira53 = text3.indexOf("someone else");
                int ira54 = text3.indexOf("youthful");
                int ira55 = text3.indexOf("making a statement");
                int ira56 = text3.indexOf("against");
                int ira57 = text3.indexOf("smashing");
                int ira58 = text3.indexOf("storefront");
                int ira59 = text3.indexOf("business");
                int ira60 = text3.indexOf("other than");//60
                int ira61 = text3.indexOf("bring");
                int ira62 = text3.indexOf("harm");
                int ira63 = text3.indexOf("who have nothing to do");
                int ira64 = text3.indexOf("guilt");
                int ira65 = text3.indexOf("doubt");
                int ira66 = text3.indexOf("shame");
                int ira67 = text3.indexOf("inevitably");
                int ira68 = text3.indexOf("suppressed");
                int ira69 = text3.indexOf("beliefs");
                int ira70 = text3.indexOf("unchanged");//70
                int ira71 = text3.indexOf("foster");
                int ira72 = text3.indexOf("anger");
                int ira73 = text3.indexOf("alienation");
                int ira74 = text3.indexOf("play");
                int ira75 = text3.indexOf("characters");
                int ira76 = text3.indexOf("very hard time");
                int ira77 = text3.indexOf("profound");
                int ira78 = text3.indexOf("unhappiness");
                int ira79 = text3.indexOf("suffering");
                int ira80 = text3.indexOf("own");//80
                int ira81 = text3.indexOf("fault");
                int ira82 = text3.indexOf("Taken aback");
                int ira83 = text3.indexOf("if");
                int ira84 = text3.indexOf("her fault");
                int ira85 = text3.indexOf("she’s");
                int ira86 = text3.indexOf("doomed");
                int ira87 = text3.indexOf("herself");
                int ira88 = text3.indexOf("seem");
                int ira89 = text3.indexOf("consigned");
                int ira90 = text3.indexOf("fate");//90
                int ira91 = text3.indexOf("most of us");
                int ira92 = text3.indexOf("chance");
                int ira93 = text3.indexOf("questions");
                int ira94 = text3.indexOf("full");
                int ira95 = text3.indexOf("advantage");
                int ira96 = text3.indexOf("answer");
                int ira97 = text3.indexOf("try");
                int ira98 = text3.indexOf("stop doing");
                int ira99 = text3.indexOf("wrong");
                int ira100 = text3.indexOf("waste");//100
                int ira101 = text3.indexOf("Inopportune questioning");
                int ira102 = text3.indexOf("without");
                int ira103 = text3.indexOf("enlightening");
                int ira104 = text3.indexOf("deflect");
                int ira105 = text3.indexOf("something");
                int ira106 = text3.indexOf("right");
                int ira107 = text3.indexOf("paying attention");
                int ira108 = text3.indexOf("show up late");
                int ira109 = text3.indexOf("spend");
                int ira110 = text3.indexOf("It’s not a matter");//110
                int ira111 = text3.indexOf("some");
                int ira112 = text3.indexOf("imposed");
                int ira113 = text3.indexOf("What could you put right");
                int ira114 = text3.indexOf("right now");
                int ira115 = text3.indexOf("Get to work on time");
                int ira116 = text3.indexOf("Diligently");
                int ira117 = text3.indexOf("utilize");
                int ira118 = text3.indexOf("peaceful");
                int ira119 = text3.indexOf("productive");
                int ira120 = text3.indexOf("desirable");//120
                int ira121 = text3.indexOf("weeks");
                int ira122 = text3.indexOf("months");
                int ira123 = text3.indexOf("attentive");
                int ira124 = text3.indexOf("effort");
                int ira125 = text3.indexOf("your mind will clear");
                int ira126 = text3.indexOf("less");
                int ira127 = text3.indexOf("path");
                int ira128 = text3.indexOf("in front");
                int ira129 = text3.indexOf("will shine");
                int ira130 = text3.indexOf("brightly");//130
                int ira131 = text3.indexOf("getting in your own way");
                int ira132 = text3.indexOf("Instead");
                int ira133 = text3.indexOf("trouble to yourself");
                int ira134 = text3.indexOf("society");
                int ira135 = text3.indexOf("suffer");
                int ira136 = text3.indexOf("That’s the price of being alive");
                int ira137 = text3.indexOf("maybe");
                int ira138 = text3.indexOf("enough");
                int ira139 = text3.indexOf("burden");
                int ira140 = text3.indexOf("in that fashion");//140
                int ira141 = text3.indexOf("nobly");
                int ira142 = text3.indexOf("purpose");
                int ira143 = text3.indexOf("proper way");
                int ira144 = text3.indexOf("fix");
                int ira145 = text3.indexOf("in that manner");
                int ira146 = text3.indexOf("at least");
                int ira147 = text3.indexOf("place");

                ss3.setSpan(Blamingothers, ira1, ira1 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Wasteoftime, ira2, ira2 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(That3, ira3, ira3 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Learn, ira4, ira4 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Anything, ira5, ira5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Grow, ira6, ira6 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Mature, ira7, ira7 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Thus, ira8, ira8 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Life, ira9, ira9 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Better1, ira10, ira10 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss3.setSpan(As, ira11, ira11 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Thereare, ira12, ira12 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Attitudes, ira13, ira13 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Toward, ira14, ira14 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Sorrows, ira15, ira15 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Those1, ira16, ira16 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(First1, ira17, ira17 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(World1, ira18, ira18 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Second, ira19, ira19 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Differently, ira20, ira20 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss3.setSpan(Couple, ira21, ira21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Onthebrink, ira22, ira22 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Theyre1, ira23, ira23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Hurt, ira24, ira24 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Angry, ira25, ira25 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Unhappy, ira26, ira26 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Bitter, ira27, ira27 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Husband, ira28, ira28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Recalls, ira29, ira29 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Things, ira30, ira30 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss3.setSpan(Wife, ira31, ira31 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Reasons, ira32, ira32 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Nolongerlivewithher, ira33, ira33 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Harried, ira34, ira34 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Disillusioned, ira35, ira35 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(All1, ira36, ira36 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Ways, ira37, ira37 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Letherdown, ira38, ira38 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Each, ira39, ira39 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Changes, ira40, ira40 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss3.setSpan(Prospects, ira41, ira41 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Grim, ira42, ira42 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Arent, ira43, ira43 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Youre, ira44, ira44 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Cant, ira45, ira45 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Yourself1, ira46, ira46 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Courage, ira47, ira47 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Easier, ira48, ira48 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Muchmore, ira49, ira49 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Gratifying, ira50, ira50 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss3.setSpan(Basest, ira51, ira51 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Desires, ira52, ira52 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Someoneelse, ira53, ira53 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Youthful, ira54, ira54 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Makingastatement, ira55, ira55 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Against, ira56, ira56 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Smashing, ira57, ira57 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Storefront, ira58, ira58 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Business1, ira59, ira59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Otherthan, ira60, ira60 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss3.setSpan(Bring, ira61, ira61 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Harm, ira62, ira62 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Whohavenothingtodo, ira63, ira63 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Guilt, ira64, ira64 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Doubt, ira65, ira65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Shame, ira66, ira66 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Inevitably, ira67, ira67 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Suppressed, ira68, ira68 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Beliefs, ira69, ira69 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Unchanged, ira70, ira70 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss3.setSpan(Foster, ira71, ira71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Anger, ira72, ira72 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Alienation, ira73, ira73 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Play, ira74, ira74 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Characters, ira75, ira75 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Veryhardtime, ira76, ira76 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Profound, ira77, ira77 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Unhappiness, ira78, ira78 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Suffering, ira79, ira79 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Own1, ira80, ira80 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss3.setSpan(Fault, ira81, ira81 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Takenaback, ira82, ira82 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(If1, ira83, ira83 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Herfault, ira84, ira84 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Shes, ira85, ira85 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Doomed, ira86, ira86 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Herself, ira87, ira87 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Seem, ira88, ira88 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Consigned, ira89, ira89 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Fate, ira90, ira90 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss3.setSpan(Mostofus, ira91, ira91 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Chance, ira92, ira92 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Questions, ira93, ira93 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Full, ira94, ira94 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Advantage, ira95, ira95 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Answer, ira96, ira96 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Try1, ira97, ira97 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Stopdoing, ira98, ira98 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Wrong, ira99, ira99 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Waste, ira100, ira100 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//100
                ss3.setSpan(Inopportunequestioning, ira101, ira101 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Without, ira102, ira102 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Enlightening, ira103, ira103 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Deflect, ira104, ira104 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Something, ira105, ira105 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Right, ira106, ira106 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Payingattention, ira107, ira107 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Showuplate, ira108, ira108 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Spend, ira109, ira109 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Itsnotamatter, ira110, ira110 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//110
                ss3.setSpan(Some, ira111, ira111 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Imposed, ira112, ira112 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Whatcouldyouputright, ira113, ira113 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Rightnow, ira114, ira114 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Gettoworkontime, ira115, ira115 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Diligently, ira116, ira116 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Utilize, ira117, ira117 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Peaceful, ira118, ira118 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Productive, ira119, ira119 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Desirable, ira120, ira120 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//120
                ss3.setSpan(Weeks, ira121, ira121 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Months, ira122, ira122 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Attentive, ira123, ira123 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Effort, ira124, ira124 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Yourmindwillclear, ira125, ira125 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Less, ira126, ira126 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Path, ira127, ira127 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Infront, ira128, ira128 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Willshine, ira129, ira129 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Brightly, ira130, ira130 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//130
                ss3.setSpan(Gettingyourownway, ira131, ira131 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Instead, ira132, ira132 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Troubletoyourself, ira133, ira133 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Society, ira134, ira134 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Suffer, ira135, ira135 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Thatsthepriceofbeingalive, ira136, ira136 + 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Maybe, ira137, ira137 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Enough, ira138, ira138 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Burden, ira139, ira139 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Inthatfashion, ira140, ira140 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//140
                ss3.setSpan(Nobly, ira141, ira141 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Purpose, ira142, ira142 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Properway, ira143, ira143 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Fix, ira144, ira144 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Inthatmanner, ira145, ira145 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Atleast, ira146, ira146 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Place, ira147, ira147 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss3);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri3 = Uri.parse("https://adrianlealcaldera.com/FixYourself.mp4");
                vv.setVideoURI(uri3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

                //Are Men and Women Different?
            case "Are Men and Women Different?":
                //blob:https://www.prageru.com/28c8257e-190d-4fa4-82a4-b0c7b0d0b365
                texts t4 = new texts();
                String text4 = t4.AreMenAndWomenDifferent;
                SpannableString ss4 = new SpannableString(text4);

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

                int prpd1 = text4.indexOf("delusion");
                int prpd2 = text4.indexOf("discerning");
                int prpd4 = text4.indexOf("intimate");
                int prpd5 = text4.indexOf("violated");
                int prpd6 = text4.indexOf("vulnerable");
                int prpd7 = text4.indexOf("confined");
                int prpd8 = text4.indexOf("satisfying");
                int prpd9 = text4.indexOf("emotionally");
                int prpd10 = text4.indexOf("psychologically");
                int prpd11 = text4.indexOf("physically");
                int prpd12 = text4.indexOf("common sense");
                int prpd13 = text4.indexOf("agenda");
                int prpd14 = text4.indexOf("sociology");
                int prpd15 = text4.indexOf("anthropology");
                int prpd16 = text4.indexOf("gender studies");
                int prpd17 = text4.indexOf("spectrum");
                int prpd18 = text4.indexOf("internal feelings");
                int prpd19 = text4.indexOf("toy trucks");
                int prpd20 = text4.indexOf("pink and blue stereotype");
                int prpd21 = text4.indexOf("reality");
                int prpd22 = text4.indexOf("college entertainment");
                int prpd23 = text4.indexOf("making stuff up");
                int prpd24 = text4.indexOf("pushing an agenda");
                int prpd25 = text4.indexOf("traditionally");
                int prpd26 = text4.indexOf("marriage");
                int prpd27 = text4.indexOf("experience");
                int prpd28 = text4.indexOf("research");
                int prpd29 = text4.indexOf("Associate Professor");
                int prpd30 = text4.indexOf("Theology");
                int prpd31 = text4.indexOf("Philosophy");
                int prpd32 = text4.indexOf("beach ball");
                int prpd33 = text4.indexOf("distinct nature");
                int prpd34 = text4.indexOf("body parts");
                int prpd35 = text4.indexOf("biology");
                int prpd36 = text4.indexOf("hormones");
                int prpd37 = text4.indexOf("express emotions");
                int prpd38 = text4.indexOf("needs");
                int prpd39 = text4.indexOf("desires");
                int prpd40 = text4.indexOf("uninvited touch");
                int prpd41 = text4.indexOf("Leg");
                int prpd42 = text4.indexOf("Hollywood Reporter");
                int prpd43 = text4.indexOf("co-star");
                int prpd44 = text4.indexOf("acting out");
                int prpd45 = text4.indexOf("common sense");
                int prpd46 = text4.indexOf("remember the beach ball");

                ss4.setSpan(Delusion, prpd1, prpd1 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Discerning, prpd2, prpd2 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                //ss4.setSpan(Supervisedcurfews, prpd3, prpd3 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Intimate, prpd4, prpd4 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Violated, prpd5, prpd5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Vulnerable, prpd6, prpd6 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Confined, prpd7, prpd7 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Satisfying, prpd8, prpd8 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Emotionally, prpd9, prpd9 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Psychologically, prpd10, prpd10 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Physically, prpd11, prpd11 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Commonsense, prpd12, prpd12 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Agenda, prpd13, prpd13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Sociology, prpd14, prpd14 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Anthropology, prpd15, prpd15 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Genderstudies, prpd16, prpd16 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Spectrum, prpd17, prpd17 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Internalfeelings, prpd18, prpd18 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Toytrucks, prpd19, prpd19 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Pinkandbluestereotype, prpd20, prpd20 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Reality, prpd21, prpd21 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Collegeentertainment, prpd22, prpd22 + 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Makingstuffup, prpd23, prpd23 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Pushinganagenda, prpd24, prpd24 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Traditionally, prpd25, prpd25 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Marriage, prpd26, prpd26 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Experience, prpd27, prpd27 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Research, prpd28, prpd28 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Associateprofessor, prpd29, prpd29 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Theology, prpd30, prpd30 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Philosophy, prpd31, prpd31 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Beachball, prpd32, prpd32 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Distinctnature, prpd33, prpd33 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Bodyparts, prpd34, prpd34 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Biology, prpd35, prpd35 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Hormones, prpd36, prpd36 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Expressemotions, prpd37, prpd37 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Needs, prpd38, prpd38 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Desires2, prpd39, prpd39 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Uninvitedtouch, prpd40, prpd40 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Leg, prpd41, prpd41 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(HollywoodReporter, prpd42, prpd42 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(CoStar, prpd43, prpd43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Actingout, prpd44, prpd44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Commonsense2, prpd45, prpd45 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss4.setSpan(Rememberthebeachball, prpd46, prpd46 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss4);
                tv.setMovementMethod(LinkMovementMethod.getInstance());

                //VIDEO
                Uri uri4 = Uri.parse("https://adrianlealcaldera.com/Are%20Men%20and%20Women%20Different.mp4");
                vv.setVideoURI(uri4);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Dont Waste Your Time":
                texts t5 = new texts();
                String text5 = t5.dontWasteYourTime;
                SpannableString ss5 = new SpannableString(text5);

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
                ClickableSpan Happiness2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Happiness2);
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
                ClickableSpan Less2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Less2);
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

                int ila1 = text5.indexOf("Date");
                int ila2 = text5.indexOf("purpose");
                int ila3 = text5.indexOf("Getting married");
                int ila4 = text5.indexOf("too fast");
                int ila5 = text5.indexOf("uncomfortable");
                int ila6 = text5.indexOf("hook ups");
                int ila7 = text5.indexOf("casual flings");
                int ila8 = text5.indexOf("having fun");
                int ila9 = text5.indexOf("Don’t get me wrong");
                int ila10 = text5.indexOf("deeper");//10
                int ila11 = text5.indexOf("happiness");
                int ila12 = text5.indexOf("certainly");
                int ila13 = text5.indexOf("marriage");
                int ila14 = text5.indexOf("topic");
                int ila15 = text5.indexOf("At least");
                int ila16 = text5.indexOf("else");
                int ila17 = text5.indexOf("Let’s face it");
                int ila18 = text5.indexOf("as far as it goes");
                int ila19 = text5.indexOf("frankly");
                int ila20 = text5.indexOf("smart");//20
                int ila21 = text5.indexOf("play out");
                int ila22 = text5.indexOf("often");
                int ila23 = text5.indexOf("relationships");
                int ila24 = text5.indexOf("commitment");
                int ila25 = text5.indexOf("in fact");
                int ila26 = text5.indexOf("arise");
                int ila27 = text5.indexOf("whim");
                int ila28 = text5.indexOf("develop");
                int ila29 = text5.indexOf("tryout");
                int ila30 = text5.indexOf("less");//30
                int ila31 = text5.indexOf("lack");
                int ila32 = text5.indexOf("afford");
                int ila33 = text5.indexOf("enterprise");
                int ila34 = text5.indexOf("entirely");
                int ila35 = text5.indexOf("build");
                int ila36 = text5.indexOf("shared");
                int ila37 = text5.indexOf("beliefs");
                int ila38 = text5.indexOf("partner");
                int ila39 = text5.indexOf("profound");
                int ila40 = text5.indexOf("understandings");//40
                int ila41 = text5.indexOf("outcome");
                int ila42 = text5.indexOf("fooled");
                int ila43 = text5.indexOf("thrilled");
                int ila44 = text5.indexOf("kombucha");
                int ila45 = text5.indexOf("get down to");
                int ila46 = text5.indexOf("over the long run");
                int ila47 = text5.indexOf("Stuff");
                int ila48 = text5.indexOf("faith");
                int ila49 = text5.indexOf("sooner");
                int ila50 = text5.indexOf("doubt");//50
                int ila51 = text5.indexOf("stuck");
                int ila52 = text5.indexOf("dead-end relationships");
                int ila53 = text5.indexOf("articulate");
                int ila54 = text5.indexOf("crave");
                int ila55 = text5.indexOf("healthier");
                int ila56 = text5.indexOf("wealthier");
                int ila57 = text5.indexOf("toward");
                int ila58 = text5.indexOf("waste of time");
                int ila59 = text5.indexOf("between");
                int ila60 = text5.indexOf("taken the plunge");//60
                int ila61 = text5.indexOf("country");
                int ila62 = text5.indexOf("citizen");
                int ila63 = text5.indexOf("The latter");
                int ila64 = text5.indexOf("expectations");
                int ila65 = text5.indexOf("means");
                int ila66 = text5.indexOf("reluctant");
                int ila67 = text5.indexOf("sign");
                int ila68 = text5.indexOf("rule of thumb");
                int ila69 = text5.indexOf("the kind of");
                int ila70 = text5.indexOf("career");//70
                int ila71 = text5.indexOf("get it right");



                ss5.setSpan(Date, ila1, ila1 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Purpose2, ila2, ila2 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Getmarried, ila3, ila3 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Toofast, ila4, ila4 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Uncomfortable, ila5, ila5 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Hookup, ila6, ila6 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Casualflings, ila7, ila7 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Havefun, ila8, ila8 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Dontgetmewrong, ila9, ila9 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Deeper, ila10, ila10 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss5.setSpan(Happiness2, ila11, ila11 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Certainly2, ila12, ila12 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Marriage2, ila13, ila13 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Topic, ila14, ila14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Atleast2, ila15, ila15 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Else, ila16, ila16 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Letsfaceit, ila17, ila17 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Asfasasitgoes, ila18, ila18 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Frankly, ila19, ila19 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Smart, ila20, ila20 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss5.setSpan(Playout, ila21, ila21 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Often, ila22, ila22 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Relationship, ila23, ila23 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Commitment, ila24, ila24 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Infact, ila25, ila25 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Arise, ila26, ila26 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Whim, ila27, ila27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Develop, ila28, ila28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Tryout, ila29, ila29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Less2, ila30, ila30 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss5.setSpan(Lack, ila31, ila31 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Afford, ila32, ila32 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Enterprise, ila33, ila33 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Entirely, ila34, ila34 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Build, ila35, ila35 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Shared, ila36, ila36 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Beliefs2, ila37, ila37 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Partner, ila38, ila38 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Profound2, ila39, ila39 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Understandings, ila40, ila40 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss5.setSpan(Cutcome, ila41, ila41 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Fool, ila42, ila42 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Thrilled, ila43, ila43 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Kombucha, ila44, ila44 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Getdownto, ila45, ila45 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Overthelongrun, ila46, ila46 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Stuff, ila47, ila47 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Faith, ila48, ila48 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Sooner, ila49, ila49 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Doubt2, ila50, ila50 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss5.setSpan(Stuck, ila51, ila51 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Deadendrelationships, ila52, ila52 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Articulate, ila53, ila53 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Crave, ila54, ila54 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Healthier, ila55, ila55 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Wealthier, ila56, ila56 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Towards, ila57, ila57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Wasteoftime2, ila58, ila58 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Between, ila59, ila59 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Taketheplunge, ila60, ila60 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss5.setSpan(Country, ila61, ila61 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Citizen, ila62, ila62 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Thelatter, ila63, ila63 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Expectations, ila64, ila64 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Mean, ila65, ila65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Reluctant, ila66, ila66 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Sign, ila67, ila67 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Ruleofthumb, ila68, ila68 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Thekindof, ila69, ila69 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss5.setSpan(Career2, ila70, ila70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss5.setSpan(Getitright, ila71, ila71 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss5);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri5 = Uri.parse("https://adrianlealcaldera.com/Dating%20Dont%20Waste%20Your%20Time.mp4");
                vv.setVideoURI(uri5);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "How to Make Our Cities Safer":
                texts t6 = new texts();
                String text6 = t6.HowtoMakeOurCitiesSafer;
                SpannableString ss6 = new SpannableString(text6);

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

                int ics1 = text6.indexOf("homicides");
                int ics2 = text6.indexOf("Constitutional");
                int ics3 = text6.indexOf("high-frequency offenders");
                int ics4 = text6.indexOf("Felons");
                int ics5 = text6.indexOf("vertical prosecution");
                int ics6 = text6.indexOf("legal errors");
                int ics7 = text6.indexOf("hostile");
                int ics8 = text6.indexOf("Progressive politicians");
                int ics9 = text6.indexOf("incarceration");
                int ics10 = text6.indexOf("age-crime curve");
                int ics11 = text6.indexOf("circulation");
                int ics12 = text6.indexOf("rocket science");
                int ics13 = text6.indexOf("street-tested");
                int ics14 = text6.indexOf("Crime “hot spots.”");
                int ics15 = text6.indexOf("potential killers");
                int ics16 = text6.indexOf("potential victims");
                int ics17 = text6.indexOf("interrogates");
                int ics18 = text6.indexOf("non-fatal");
                int ics19 = text6.indexOf("organized retail theft rings");
                int ics20 = text6.indexOf("vertical prosecution");
                int ics21 = text6.indexOf("law enforcement officials");
                int ics22 = text6.indexOf("United States Sentencing Commission");
                int ics23 = text6.indexOf("shattering records");
                int ics24 = text6.indexOf("resource and time intensive");
                int ics25 = text6.indexOf("trial stage");
                int ics26 = text6.indexOf("blaming each other");
                int ics27 = text6.indexOf("hostile towards one another");
                int ics28 = text6.indexOf("Progressive politicians");
                int ics29 = text6.indexOf("age-crime curve");
                int ics30 = text6.indexOf("rocket science");
                int ics31 = text6.indexOf("violent crime rates");

                ss6.setSpan(Homicides, ics1, ics1 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Constitutional, ics2, ics2 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Highfrequencyoffenders, ics3, ics3 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Felons, ics4, ics4 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Verticalprosecution, ics5, ics5 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Legalerrors, ics6, ics6 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Hostile, ics7, ics7 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Progressivepoliticians, ics8, ics8 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Incarceration, ics9, ics9 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Agecrimecurve, ics10, ics10 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Circulation, ics11, ics11 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Rocketscience, ics12, ics12 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Streettested, ics13, ics13 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Crimehotspots, ics14, ics14 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Potentialkillers, ics15, ics15 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Potentialvictims, ics16, ics16 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Interrogates, ics17, ics17 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Nonfatal, ics18, ics18 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Organizedretailtheftrings, ics19, ics19 + 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Verticalprosecution, ics20, ics20 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Lawenforcementofficials, ics21, ics21 + 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(UnitedStatesSentencingCommission, ics22, ics22 + 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Shatteringrecords, ics23, ics23 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Resourceandtimeintensive, ics24, ics24 + 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Trialstage, ics25, ics25 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Blamingeachother, ics26, ics26 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Hostiletowardsoneanother, ics27, ics27 + 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Progressivepoliticians, ics28, ics28 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Agecrimecurve, ics29, ics29 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Rocketscience, ics30, ics30 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss6.setSpan(Violentcrimerates, ics31, ics31 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


                tv.setText(ss6);
                tv.setMovementMethod(LinkMovementMethod.getInstance());

                // vid
                Uri uri6 = Uri.parse("https://adrianlealcaldera.com/How%20to%20Make%20Our%20Cities%20Safer.mp4");
                vv.setVideoURI(uri6);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "How to End Systemic Racism":
                texts t7 = new texts();
                String text7 = t7.howtoEndSystemicRacism;
                SpannableString ss7 = new SpannableString(text7);

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

                int ina1 = text7.indexOf("racism");
                int ina2 = text7.indexOf("deserve");
                int ina3 = text7.indexOf("exposed");
                int ina4 = text7.indexOf("sooner");
                int ina5 = text7.indexOf("just");
                int ina6 = text7.indexOf("truth");
                int ina7 = text7.indexOf("colleges");
                int ina8 = text7.indexOf("encouraged");
                int ina9 = text7.indexOf("many");
                int ina10 = text7.indexOf("government");//10
                int ina11 = text7.indexOf("harder");
                int ina12 = text7.indexOf("businesses");
                int ina13 = text7.indexOf("museum");
                int ina14 = text7.indexOf("hard work");
                int ina15 = text7.indexOf("major");
                int ina16 = text7.indexOf("parties");
                int ina17 = text7.indexOf("obtaining");
                int ina18 = text7.indexOf("driver’s license");
                int ina19 = text7.indexOf("construct");
                int ina20 = text7.indexOf("guaranteeing");//20
                int ina21 = text7.indexOf("essential skill");
                int ina22 = text7.indexOf("failure");
                int ina23 = text7.indexOf("allowed");
                int ina24 = text7.indexOf("promoted");
                int ina25 = text7.indexOf("the next grade");
                int ina26 = text7.indexOf("councils");
                int ina27 = text7.indexOf("demonize");
                int ina28 = text7.indexOf("budgets");
                int ina29 = text7.indexOf("murder");
                int ina30 = text7.indexOf("skyrocket");//30
                int ina31 = text7.indexOf("Prosecutors refuse");
                int ina32 = text7.indexOf("prosecute");
                int ina33 = text7.indexOf("hardened criminals");
                int ina34 = text7.indexOf("Instead");
                int ina35 = text7.indexOf("prey");
                int ina36 = text7.indexOf("law-abiding");
                int ina37 = text7.indexOf("hard-working citizens");
                int ina38 = text7.indexOf("again");
                int ina39 = text7.indexOf("few");
                int ina40 = text7.indexOf("commonplace");//40
                int ina41 = text7.indexOf("oppressive");
                int ina42 = text7.indexOf("patronizing");
                int ina43 = text7.indexOf("environment");
                int ina44 = text7.indexOf("prejudices");
                int ina45 = text7.indexOf("prejudgments");
                int ina46 = text7.indexOf("goal");
                int ina47 = text7.indexOf("claiming");
                int ina48 = text7.indexOf("instituting");
                int ina49 = text7.indexOf("policies");
                int ina50 = text7.indexOf("holding them back");//50
                int ina51 = text7.indexOf("systemic racism");
                int ina52 = text7.indexOf("moving forward");
                int ina53 = text7.indexOf("pluralistic");
                int ina54 = text7.indexOf("equal-opportunity nation");
                int ina55 = text7.indexOf("backward");
                int ina56 = text7.indexOf("here’s the kicker");
                int ina57 = text7.indexOf("nasty");
                int ina58 = text7.indexOf("bigoted");
                int ina59 = text7.indexOf("misogynistic");
                int ina60 = text7.indexOf("authoritarian nationalists");//60
                int ina61 = text7.indexOf("imposing these crushing");
                int ina62 = text7.indexOf("the woke left");
                int ina63 = text7.indexOf("side");
                int ina64 = text7.indexOf("revered");
                int ina65 = text7.indexOf("up until");
                int ina66 = text7.indexOf("committed");
                int ina67 = text7.indexOf("proof");
                int ina68 = text7.indexOf("dozens");
                int ina69 = text7.indexOf("over the last few years");
                int ina70 = text7.indexOf("Nooses");//70
                int ina71 = text7.indexOf("N-word");
                int ina72 = text7.indexOf("taunts");
                int ina73 = text7.indexOf("faked");
                int ina74 = text7.indexOf("supply");
                int ina75 = text7.indexOf("against");
                int ina76 = text7.indexOf("rampant");
                int ina77 = text7.indexOf("race-obsessed");
                int ina78 = text7.indexOf("unconscious");
                int ina79 = text7.indexOf("small-minded");
                int ina80 = text7.indexOf("Attorney");//80
                int ina81 = text7.indexOf("had nothing to do");
                int ina82 = text7.indexOf("available");
                int ina83 = text7.indexOf("understand");
                int ina84 = text7.indexOf("once");
                int ina85 = text7.indexOf("condescending");
                int ina86 = text7.indexOf("outright");
                int ina87 = text7.indexOf("expect");
                int ina88 = text7.indexOf("purely");
                int ina89 = text7.indexOf("based on");
                int ina90 = text7.indexOf("merits");//90
                int ina91 = text7.indexOf("equitable");
                int ina92 = text7.indexOf("hundred");
                int ina93 = text7.indexOf("realize");

                ss7.setSpan(Racism, ina1, ina1 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Deserve, ina2, ina2 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Exposed, ina3, ina3 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Sooner2, ina4, ina4 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Just, ina5, ina5 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Truth, ina6, ina6 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(College, ina7, ina7 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Encouraged, ina8, ina8 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Many, ina9, ina9 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Government, ina10, ina10 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss7.setSpan(Harder, ina11, ina11 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Businesses, ina12, ina12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Museum, ina13, ina13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Hardwork, ina14, ina14 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Major, ina15, ina15 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Parties, ina16, ina16 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Obtaining, ina17, ina17 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Driverslicense, ina18, ina18 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Construct, ina19, ina19 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Guaranteeing, ina20, ina20 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss7.setSpan(Essentialskill, ina21, ina21 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Failure, ina22, ina22 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Allowed, ina23, ina23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Promoted, ina24, ina24 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Thenextgrade, ina25, ina25 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Council, ina26, ina26 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Demonize, ina27, ina27 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Budget, ina28, ina28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Murder, ina29, ina29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Skyrocket, ina30, ina30 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss7.setSpan(Prosecutorsrefuse, ina31, ina31 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Prosecute, ina32, ina32 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Hardenedcriminals, ina33, ina33 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Instead2, ina34, ina34 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Prey, ina35, ina35 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Lawabiding, ina36, ina36 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Hardworkingcitizens, ina37, ina37 + 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Again, ina38, ina38 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Few, ina39, ina39 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Commonplace, ina40, ina40 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss7.setSpan(Oppressive, ina41, ina41 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Patronizing, ina42, ina42 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Environment, ina43, ina43 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Prejudices, ina44, ina44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Prejudgments, ina45, ina45 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Goal, ina46, ina46 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Claiming, ina47, ina47 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Instituting, ina48, ina48 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Policies, ina49, ina49 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Holdingback, ina50, ina50 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss7.setSpan(Systemicracism, ina51, ina51 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Movingforward, ina52, ina52 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Pluralistic, ina53, ina53 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Equalopportunitynation, ina54, ina54 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Backward, ina55, ina55 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Heresthekicker, ina56, ina56 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Nasty, ina57, ina57 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Bigoted, ina58, ina58 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Misogynistic, ina59, ina59 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Authoritariannationalists, ina60, ina60 + 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss7.setSpan(Imposingthesecrushingrules, ina61, ina61 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Thewokeleft, ina62, ina62 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Side, ina63, ina63 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Revered, ina64, ina64 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Upuntil, ina65, ina65 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Commited, ina66, ina66 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Proof, ina67, ina67 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Dozens, ina68, ina68 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Overthelastfewyears, ina69, ina69 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Nooses, ina70, ina70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss7.setSpan(Nword, ina71, ina71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Taunts, ina72, ina72 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Faked, ina73, ina73 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Supply, ina74, ina74 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Against2, ina75, ina75 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Rampant, ina76, ina76 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Raceobsessed, ina77, ina77 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Unconscious, ina78, ina78 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Smallminded, ina79, ina79 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Attorney, ina80, ina80 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss7.setSpan(Hadnothingtodo, ina81, ina81 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Available, ina82, ina82 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Understand, ina83, ina83 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Once, ina84, ina84 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Condescending, ina85, ina85 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Outright, ina86, ina86 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Expect, ina87, ina87 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Purely, ina88, ina88 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Basedon, ina89, ina89 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Merits, ina90, ina90 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss7.setSpan(Equitable, ina91, ina91 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Hundred, ina92, ina92 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss7.setSpan(Realize, ina93, ina93 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss7);
                tv.setMovementMethod(LinkMovementMethod.getInstance());

                // vid
                Uri uri7 = Uri.parse("https://adrianlealcaldera.com/How%20to%20End%20Systemic%20Racism.mp4");
                vv.setVideoURI(uri7);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Should Government Bail Out Big Banks?":
                texts t8 = new texts();
                String text8 = t8.ShouldGovernmentBailOutBigBanks;
                SpannableString ss8 = new SpannableString(text8);

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

                int isg1 = text8.indexOf("financial sector");
                int isg2 = text8.indexOf("government rescue");
                int isg3 = text8.indexOf("conventional wisdom");
                int isg4 = text8.indexOf("short-term panic");
                int isg5 = text8.indexOf("credit-market freeze");
                int isg6 = text8.indexOf("Troubled Asset Relief Program");
                int isg7 = text8.indexOf("post-Depression bailout");
                int isg8 = text8.indexOf("commercial bank");
                int isg9 = text8.indexOf("global bondholders");
                int isg10 = text8.indexOf("short-term credit markets");
                int isg11 = text8.indexOf("bondholders");
                int isg12 = text8.indexOf("hedge fund");
                int isg13 = text8.indexOf("government sponsored mortgage companies");
                int isg14 = text8.indexOf("financial storm");
                int isg15 = text8.indexOf("global meltdown");
                int isg16 = text8.indexOf("government control");
                int isg17 = text8.indexOf("financial institutions");
                int isg18 = text8.indexOf("credit underpins");
                int isg19 = text8.indexOf("stock-market crash");
                int isg20 = text8.indexOf("Federal Reserve");
                int isg21 = text8.indexOf("risk models");
                int isg22 = text8.indexOf("meltdown");
                int isg23 = text8.indexOf("deregulation");
                int isg24 = text8.indexOf("unmoored");
                int isg25 = text8.indexOf("dependent");
                int isg26 = text8.indexOf("enabling parent");
                int isg27 = text8.indexOf("belly up");
                int isg28 = text8.indexOf("reckless");
                int isg29 = text8.indexOf("teetered");
                int isg30 = text8.indexOf("whack");
                int isg31 = text8.indexOf("lobbyists");
                int isg33 = text8.indexOf("Depression");

                ss8.setSpan(Financialsector, isg1, isg1 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Governmentrescue, isg2, isg2 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Conventionalwisdom, isg3, isg3 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Shorttermpanic, isg4, isg4 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Creditmarketfreeze, isg5, isg5 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(TroubledAssetReliefProgram, isg6, isg6 + 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(PostDepressionbailout, isg7, isg7 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Commercialbank, isg8, isg8 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Globalbondholders, isg9, isg9 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Shorttermcreditmarkets, isg10, isg10 + 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Bondholders, isg11, isg11 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Hedgefund, isg12, isg12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Governmentsponsoredmortgagecompanies, isg13, isg13 + 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Financialstorm, isg14, isg14 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Globalmeltdown, isg15, isg15 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Governmentcontrol, isg16, isg16 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Financialinstitutions, isg17, isg17 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Creditunderpins, isg18, isg18 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Stockmarketcrash, isg19, isg19 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(FederalReserve, isg20, isg20 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Riskmodels, isg21, isg21 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Meltdown, isg22, isg22 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Deregulation, isg23, isg23 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Unmoored, isg24, isg24 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Dependent, isg25, isg25 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Enablingparent, isg26, isg26 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Bellyup, isg27, isg27 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Reckless, isg28, isg28 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Teetered, isg29, isg29 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Whack, isg30, isg30 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Lobbyists, isg31, isg31 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss8.setSpan(Depressions, isg33, isg33 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


                tv.setText(ss8);
                tv.setMovementMethod(LinkMovementMethod.getInstance());

                // vid Cambiar URL DEL VIDEO
                Uri uri8 = Uri.parse("https://adrianlealcaldera.com/Should%20Government%20Bail%20Out%20Big%20Banks.mp4");
                vv.setVideoURI(uri8);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
        }
    }
    private void openDialog(String s) {
        Dialog d = new Dialog(s);
        d.show(getSupportFragmentManager(), "");

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
}