package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import im.crisp.client.Crisp;

public class Profile2023 extends AppCompatActivity {
    Button logoutbtn,hamtest;
    ImageView Imgdeluser;
    TextView nombredeluser;
    LinearLayout menu,btn_menu_open,btn_menu_closed;
    TextView txt, tvnameuser;
    TextView scoreStructurasTv,scoreVocabTv;
    TextView tdrtvestructuras,tdrtvvocab;
    TextView tdrspinttv,spintavancetv;
    TextView tdrtranstv,transavancetv;
    TextView conintAvance,cultAvance,availAvance;
    VocabModelo vocabobject;
    ModeloEstructura structuraObject;
    ModeloSpInt spintObject;
    ModeloTrans transObject;
    ModeloConint conintObject;
    ModeloCultura cultObject;
    ModeloAvailability availObject;


    String userid;
    FirebaseAuth mAuth;
    FirebaseUser user;

    Map<String, Object> estudiante;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    DocumentReference docRef;
    DocumentReference scoresStructureDocRef,scoresVocabDocRef;
    DocumentReference scoresSpintDocRef;
    DocumentReference scoresConintDocRef;
    DocumentReference scoresTransDocRef;
    DocumentReference scoresCultDocRef;
    DocumentReference scoresAvailDocRef;



    Prefs prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        Crisp.configure(getApplicationContext(), "9793b001-eb11-4714-bfde-c26c83361406");
        prefs = new Prefs(this);
        tvnameuser = findViewById(R.id.UserNameTv);
        mAuth= FirebaseAuth.getInstance();
        logoutbtn=findViewById(R.id.btnlogout);
        txt = findViewById(R.id.itemName);
        menu = findViewById(R.id.menu);
        Imgdeluser = findViewById(R.id.Imgdeluser);
        nombredeluser = findViewById(R.id.nombredeluser);
        scoreStructurasTv = findViewById(R.id.scoreStrtProfile);
        tdrtvestructuras = findViewById(R.id.TDRtvestructuras);

        tdrspinttv = findViewById(R.id.spintdr);
        spintavancetv = findViewById(R.id.spintavance);
        tdrtranstv= findViewById(R.id.transtdr);
        transavancetv= findViewById(R.id.transavance);
        tdrtvvocab = findViewById(R.id.TDRtvocab);
        availAvance= findViewById(R.id.availAvance);
        cultAvance=findViewById(R.id.cultAvance);
        conintAvance=findViewById(R.id.conintavance);
        scoreVocabTv= findViewById(R.id.vocabScoreprofile);
        tdrtvestructuras = findViewById(R.id.TDRtvestructuras);

        //MENU
        btn_menu_open = findViewById(R.id.btn_menu_open);
        btn_menu_closed = findViewById(R.id.btn_menu_closed);
        menu.setVisibility(View.GONE);
        btn_menu_open.setVisibility(View.VISIBLE);
        btn_menu_closed.setVisibility(View.GONE);
        //DB
        mAuth= FirebaseAuth.getInstance();
        if(mAuth==null){
        }else {
            userid = mAuth.getCurrentUser().getUid();
            docRef  = db.collection(userid).document("EstudentsInfo");
        }





        sendInfoOfRegularUseToDB();
        sendInfoOfVocabUseToDB();
        sendInfoOfSpintUseToDb();
        sendInfoOfTransUseToDb();
        sendInfoOfConintUseToDb();
        sendInfoOFCultUseToDb();
        sendInfoOfAvailabilityToDb();

        getValuesFromDb();
    }



    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null) {
            // User is not signed in, or there is no current user
            tvnameuser.setText("Not Premium User");
        } else {
            // User is signed in
            String displayName = user.getDisplayName();
            if (displayName != null) {
                tvnameuser.setText(displayName);
            } else {
                // The user is signed in but doesn't have a display name set
                tvnameuser.setText("Not Premium User");
            }
        }


        docRef.get().addOnCompleteListener(taskUser -> {
            if (taskUser.isSuccessful()) {
                DocumentSnapshot document = taskUser.getResult();
                if (document.exists()) {
                    estudiante = document.getData();
                    String nombreUser = estudiante.get("nombre")+" "+estudiante.get("apellido");
                    String imageUrl = (String) estudiante.get("urlImage");
                    nombredeluser.setText(nombreUser);
                    if(prefs.getPremium()==0){
                        tvnameuser.setText("Not Premium User");
                    }else if(prefs.getPremium()==1){
                        tvnameuser.setText("Premium User");
                    }


                    //coloca la imagen en el xml
                    Glide.with(getApplicationContext())
                            .load(imageUrl)
                            .into(new CustomTarget<Drawable>() {
                                @Override
                                public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                                    // Establece el Drawable como fondo de la vista
                                    Imgdeluser.setBackground(resource);
                                }

                                @Override
                                public void onLoadCleared(@Nullable Drawable placeholder) {
                                    // Método vacío necesario para la implementación de CustomTarget
                                }
                            });

                } else {
                    System.out.println("No such document");
                }
            }
        });

    }

    public void logout(View v){
        FirebaseAuth.getInstance().signOut();  // Asynchronous sign out
        mAuth.signOut();  // If this is necessary, keep it, otherwise FirebaseAuth sign out might be sufficient

        // Add a listener to react to the change in authentication state
        FirebaseAuth.getInstance().addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null) {
                    // User is signed out
                    Intent intento = new Intent(Profile2023.this, Login2023.class);
                    startActivity(intento);
                    // Remove the listener after its job is done
                    FirebaseAuth.getInstance().removeAuthStateListener(this);
                }
            }
        });
    }
    public void Open_menu(View vista){
        //Toast.makeText(this, "Menu abierto", Toast.LENGTH_SHORT).show();

        menu.setVisibility(View.VISIBLE);
        btn_menu_open.setVisibility(View.GONE);
        btn_menu_closed.setVisibility(View.VISIBLE);


    }
    public void formulario(View view){
        Intent intento = new Intent(Profile2023.this,FormularioInfo2023.class);
        startActivity(intento);
    }
    public void Close_menu(View vista){
        //Toast.makeText(this, "Menu abierto", Toast.LENGTH_SHORT).show();
        menu.setVisibility(View.GONE);
        btn_menu_open.setVisibility(View.VISIBLE);
        btn_menu_closed.setVisibility(View.GONE);
    }

    public void sendInfoOfRegularUseToDB(){
        // Get the user ID from Firebase Authentication

        // Reference to the user's collection in Firestore
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        scoresStructureDocRef = db.collection(userid).document("Scores Structures");

        // Attempt to get the "Scores Profile" document from Firestore
        scoresStructureDocRef.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        if(!documentSnapshot.exists()){

                            SetDefaultValuesDeEstructuraFirstTime();

                        }else{

                        }






                    }

                    private void SetDefaultValuesDeEstructuraFirstTime() {
                        //aqui deber[ian ir todos los valores de estructura
                        user.put("AvanceStructura",0.0);
                        user.put("tdrStructure",0.0);
                        user.put("StructureCounter",1);
                        //presentes
                        user.put("PresenteSimple",false);
                        user.put("PresenteContinuo",false);
                        user.put("PresentePerfecto",false);
                        user.put("PresentePerfectoContinuo",false);
                        //pasados
                        user.put("PasadoSimple",false);
                        user.put("PasadoContinuo",false);
                        user.put("PasadoPerfecto",false);
                        user.put("PasadoPerfectoContinuo",false);
                        // futuros
                        user.put("FuturoSimple",false);
                        user.put("FuturoContinuo",false);
                        user.put("FuturoPerfecto",false);
                        user.put("FuturoPerfectoContinuo",false);
                        //would
                        user.put("WouldSimple",false);
                        user.put("WouldContinuo",false);
                        user.put("WouldPerfecto",false);
                        user.put("WouldPerfectoContinuo",false);
                        // could
                        user.put("CouldSimple",false);
                        user.put("CouldContinuo",false);
                        user.put("CouldPerfecto",false);
                        user.put("CouldPerfectoContinuo",false);
                        // mights
                        user.put("MightSimple", false);
                        user.put("MightContinuous", false);
                        user.put("MightPerfect", false);
                        user.put("MightPerfectContinuous", false);
                        //should
                        user.put("ShouldSimple", false);
                        user.put("ShouldContinuous", false);
                        user.put("ShouldPerfect", false);
                        user.put("ShouldPerfectContinuous", false);
                        //can
                        user.put("CanSimple", false);
                        user.put("CanContinuous", false);
                        //must
                        user.put("MustSimple", false);
                        user.put("MustContinuous", false);
                        //whats
                        user.put("WhatSimple", false);
                        user.put("WhatContinuous", false);
                        user.put("WhatPerfect", false);
                        user.put("WhatModalsSimple", false);
                        user.put("WhatModalsContinuous", false);
                        user.put("WhatModalsPerfect", false);
                        //whens
                        user.put("WhenSimple", false);
                        user.put("WhenContinuous", false);
                        user.put("WhenPerfect", false);
                        user.put("WhenModalsSimple", false);
                        user.put("WhenModalsContinuous", false);
                        user.put("WhenModalsPerfect", false);
                        //wheres
                        user.put("WhereSimple", false);
                        user.put("WhereContinuous", false);
                        user.put("WherePerfect", false);
                        user.put("WhereModalsSimple", false);
                        user.put("WhereModalsContinuous", false);
                        user.put("WhereModalsPerfect", false);
                        //whys
                        user.put("WhySimple", false);
                        user.put("WhyContinuous", false);
                        user.put("WhyPerfect", false);
                        user.put("WhyModalsSimple", false);
                        user.put("WhyModalsContinuous", false);
                        user.put("WhyModalsPerfect", false);
                        //hows
                        user.put("HowSimple", false);
                        user.put("HowContinuous", false);
                        user.put("HowPerfect", false);
                        user.put("HowModalsSimple", false);
                        user.put("HowModalsContinuous", false);
                        user.put("HowModalsPerfect", false);
                        //questions
                        user.put("QuestionStructure", false);
                        user.put("QuestionStructureModals", false);
                        //non/basics
                        user.put("AbleTo", false);
                        user.put("ReportedSpeech", false);
                        user.put("IncrementoParalelo", false);
                        user.put("VerbalAdjectives", false);
                        user.put("RelativeClause", false);
                        user.put("WantTo", false);
                        user.put("ForTo", false);
                        user.put("SupposedToPresent", false);
                        user.put("WishPastPerfect", false);
                        user.put("UsedTo", false);
                        user.put("BeUsedTo", false);









                        uid.document("Scores Structures").set(user);
                    }


                });

        // Note: Any code outside of the onSuccess method will execute immediately,
        // and should not contain logic dependent on the completion of the Firestore read operation.
    }
    public void sendInfoOfVocabUseToDB(){
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        scoresVocabDocRef = db.collection(userid).document("Scores Vocab");
        scoresVocabDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {

                if(!documentSnapshot.exists()){
                    setDefaultValuesDeVocabFirstTime();
                }
            }

            private void setDefaultValuesDeVocabFirstTime() {
                user.put("v0to50",false);
                user.put("v50to100",false);
                user.put("v100to150",false);
                user.put("v150to200",false);
                user.put("v200to250",false);
                user.put("v250to300",false);
                user.put("v300to350",false);
                user.put("v350to400",false);
                user.put("v400to500",false);
                user.put("AvanceVocab",0.0 );
                user.put("tdrVocab",0.0);
                user.put("VocabCounter",1);


                uid.document("Scores Vocab").set(user);
            }
        });
    }
    public void sendInfoOfSpintUseToDb(){
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
         scoresSpintDocRef = db.collection(userid).document("Scores Spint");
         scoresSpintDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
             @Override
             public void onSuccess(DocumentSnapshot documentSnapshot) {
                 if(!documentSnapshot.exists()){
                     setDefaultSpintValuesFirstTime();
                 }
             }

             private void setDefaultSpintValuesFirstTime() {
                 user.put("PorSujeto",false);
                 user.put("PorPreposición",false);
                 user.put("PorObjeto",false);
                 user.put("InterferenciaReflexiva",false);
                 user.put("InterferenciaPasiva",false);
                 user.put("AvanceSpint",0.0 );
                 user.put("tdrSpint",0.0);
                 user.put("SpintCounter",1);

                 uid.document("Scores Spint").set(user);
             }
         });
    }

    public void sendInfoOfTransUseToDb(){
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        scoresTransDocRef= db.collection(userid).document("Scores Trans"    );
        scoresTransDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){
                    createDefaultTransValues();
                }
            }

            private void createDefaultTransValues() {
                user.put("ConectoresStandarPresenteSimple",false);
                user.put("ConectoresStandarPresenteContinuo",false);
                user.put("ConectoresStandarPresentePerfecto",false);
                user.put("ConectoresStandarPresentePerfectoContinuo",false);
                user.put("ConectoresStandarFuturoSimple",false);
                user.put("ConectoresStandarReportedSpeech",false);
                user.put("ConectoresStandarMustSimple", false);
                user.put("ConectoresStandarCanSimple", false);
                user.put("ConectoresStandarPresenteSimpleXWantTo", false);
                user.put("ConectoresStandarPresenteSimpleXSupposedTo", false);
                user.put("ConectoresStandarPresenteSimpleXBeUsedTo", false);
                user.put("ConectoresStandarCanSimpleXCanSimple", false);
                user.put("ConectoresStandarShouldSimpleXPrensenteSimple", false);
                user.put("ConectoresStandarShouldSimpleXPrensenteContinuo", false);
                user.put("ConectoresStandarCanSimpleXPresenteSimple", false);
                user.put("ConectoresStandarCanSimpleXPresenteContinuo", false);
                user.put("ConectoresStandarCanSimpleXPresentePerfecto", false);
                user.put("ConectoresStandarCouldSimpleXPresenteSimple", false);
                user.put("ConectoresStandarCouldSimpleXPresenteContinuo", false);
                user.put("ConectoresStandarPresenteSimpleXPorSujeto", false);
                user.put("ConectoresStandarPresenteSimpleXPorObjeto", false);
                user.put("ConectoresStandarPresenteSimpleXPorPreposicion", false);
                user.put("ConectoresStandarPresenteSimpleXInterferenciaReflexiva", false);
                user.put("AvanceTrans",0.0 );
                user.put("tdrTrans",0.0);
                user.put("TransCounter",1);

                uid.document("Scores Trans").set(user);
            }
        });
    }
    public void sendInfoOfConintUseToDb(){
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        scoresConintDocRef=db.collection(userid).document("Scores Conint");
        scoresConintDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                    if(!documentSnapshot.exists()){
                        sendDefaultConintValuesToDb();
                    }else {

                    }
            }

            private void sendDefaultConintValuesToDb() {
                user.put("AvanceConint",0.0);
                user.put("conintCounter",1);
                uid.document("Scores Conint").set(user);
            }
        });
    }
    public void sendInfoOFCultUseToDb(){
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        scoresCultDocRef= db.collection(userid).document("Scores Cultura");
        scoresCultDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){
                    createDefaultValuesForCulture();
                }
            }

            private void createDefaultValuesForCulture() {
                user.put("AvanceCultura",0.0);
                user.put("culturaCounter",1);
                uid.document("Scores Cultura").set(user);
            }
        });
    }
    public void sendInfoOfAvailabilityToDb(){
        CollectionReference uid = db.collection(userid);
        Map<String, Object> user = new HashMap<>();
        scoresAvailDocRef= db.collection(userid).document("Scores Availability");
        scoresAvailDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){
                    createDefaultAvailabilityValues();
                }
            }

            private void createDefaultAvailabilityValues() {
                user.put("AvanceAvail",0.0);
                user.put("availabilityCounter",1 );
                uid.document("Scores Availability").set(user);
                dialogueContainer1("Tu perfil se ha guardado en base de datos, podrás ir viendo tu progreso aqui","ok","ok",Profile2023.this);

            }
        });
    }



    public void getValuesFromDb(){
        scoresVocabDocRef = db.collection(userid).document("Scores Vocab");
        scoresStructureDocRef = db.collection(userid).document("Scores Structures");
        scoresSpintDocRef= db.collection(userid).document("Scores Spint");
        scoresTransDocRef = db.collection(userid).document("Scores Trans");
        scoresConintDocRef=db.collection(userid).document("Scores Conint");
        scoresCultDocRef= db.collection(userid).document("Scores Cultura");
        scoresAvailDocRef= db.collection(userid).document("Scores Availability");

        scoresVocabDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    vocabobject= documentSnapshot.toObject(VocabModelo.class);
                    scoreVocabTv.setText(String.format("%.1f%%", vocabobject.AvanceVocab)+" de avance");
                    tdrtvvocab.setText("Respuesta Promedio: "+String.valueOf(vocabobject.tdrVocab)+ " segundos");

                }
            }
        });
        scoresStructureDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    structuraObject= documentSnapshot.toObject(ModeloEstructura.class);
                    assert structuraObject != null;
                    double avanceStructura = structuraObject.AvanceStructura;
                    double tdrestructura= structuraObject.tdrStructure;
                    scoreStructurasTv.setText(String.format("%.2f%%", avanceStructura)+" de avance");
                    tdrtvestructuras.setText("Respuesta Promedio: "+String.valueOf(tdrestructura)+ " segundos");

                }
            }
        });
        scoresSpintDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else {
                    spintObject= documentSnapshot.toObject(ModeloSpInt.class);
                    assert spintObject!=null;

                    spintavancetv.setText(String.format("%.1f%%", spintObject.AvanceSpint)+" de avance");
                    tdrspinttv.setText("Respuesta Promedio: "+String.valueOf(spintObject.tdrSpint)+ " segundos");
                }
            }
        });
        scoresTransDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    transObject= documentSnapshot.toObject(ModeloTrans.class);
                    assert  transObject!=null;
                    transavancetv.setText(String.format("%.1f%%", transObject.AvanceTrans)+" de avance");
                    tdrtranstv.setText("Respuesta Promedio: "+String.valueOf(transObject.tdrTrans)+ " segundos");
                }
            }
        });
        scoresConintDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else {
                    conintObject=documentSnapshot.toObject(ModeloConint.class);
                    assert conintObject!=null;
                    conintAvance.setText(String.valueOf(String.format("%.1f%%", conintObject.AvanceConint)+" de avance "));

                }
            }
        });
        scoresCultDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else {
                    cultObject=documentSnapshot.toObject(ModeloCultura.class);
                    assert cultObject!=null;
                    cultAvance.setText(String.valueOf(String.format("%.1f%%", cultObject.AvanceCultura)+" de avance "));

                }
            }
        });
        scoresAvailDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else{
                    availObject=documentSnapshot.toObject(ModeloAvailability.class);
                    assert availObject!=null;
                    availAvance.setText(String.valueOf(String.format("%.1f%%", availObject.AvanceAvail)+" de avance "));
                }
            }
        });
    }

    public void dialogueContainer1(String text,String buttonyes,String buttonno,Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);
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

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.RED); // Set the background color
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();


            }
        });
        Button button2 = dialogView.findViewById(R.id.botondialogo2);
        button2.setText(buttonno);

        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();             }
        });

        dialog.show();

    }

    public void deleteDataAndAccount(View v){
        deleteAllUserDocuments(userid);
        Intent intento = new Intent(this, Registro2023.class);
        startActivity(intento);

    }

    public void deleteAllUserDocuments(String userId) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection(userId)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        QuerySnapshot querySnapshot = task.getResult();
                        if (querySnapshot != null) {
                            for (DocumentSnapshot document : querySnapshot.getDocuments()) {
                                db.collection(userId).document(document.getId()).delete();
                            }
                            deleteUserAccount();  // Proceed to delete user account
                        }
                    } else {
                    }
                });
    }

    public void deleteUserAccount() {
        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            auth.getCurrentUser().delete()
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                        } else {
                        }
                    });
        }
    }



}