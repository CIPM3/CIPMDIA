package com.leal.cipm_testing;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import im.crisp.client.Crisp;

public class MainActivity extends AppCompatActivity {
    Button btn,logoutbtn,testest,hamtest;
    LinearLayout menu,btn_menu_open,btn_menu_closed;
    TextView txt, tvnameuser;
    FirebaseAuth mAuth;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    FirebaseUser user;
    Prefs prefs;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String userid;
    DocumentReference rachaDocRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        tvnameuser = findViewById(R.id.UserNameTv);
        //createRequest();
        hamtest= findViewById(R.id.hamtestbtn);
//      testest= findViewById(R.id.testest);
        mAuth= FirebaseAuth.getInstance();
        logoutbtn=findViewById(R.id.btnlogout);
        Crisp.configure(getApplicationContext(), "9793b001-eb11-4714-bfde-c26c83361406");
        txt = findViewById(R.id.itemName);
        menu = findViewById(R.id.menu);
        btn_menu_open = findViewById(R.id.btn_menu_open);
        btn_menu_closed = findViewById(R.id.btn_menu_closed);
        menu.setVisibility(View.GONE);
        btn_menu_open.setVisibility(View.VISIBLE);
        btn_menu_closed.setVisibility(View.GONE);
        prefs = new Prefs(this);

        mAuth= FirebaseAuth.getInstance();
        if(user!= null){
            if(user.isAnonymous()){
                Toast.makeText(this, "user is anonymous shouldnt be here", Toast.LENGTH_SHORT).show();
            }else {
                userid = mAuth.getCurrentUser().getUid();
                Toast.makeText(this, "user is not anonimus", Toast.LENGTH_SHORT).show();
            }


        }


        if (prefs.getPremium()==1){
            //Give the user all the premium features
            //hide ads if you are showing ads
            txt.setText("Your Subscription is Active");
            Log.d("tag","inside yes active suscription");

        } else if (prefs.getPremium()==0){
            //remove user all the premium features
            //show ads to the user
            txt.setText("No active Subscription");
            Log.d("tag","inside no active suscription");
        }

        gso= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);

        UsageTracker.updateUsageStats(new UsageTracker.UserStatsUpdateListener() {
            @Override
            public void onUpdated(UserStats userStats) {
                // Update your UI here
                // For example, update a TextView with the usage count

            }
        });
        dialogueContainer("ok","ok",MainActivity.this);

    }
    public void starttest(View view){

        Intent crispIntent = new Intent(this, MainTesting.class);
        startActivity(crispIntent);

      /*  if(Objects.requireNonNull(mAuth.getCurrentUser()).isAnonymous()){
            Toast.makeText(this, "Favor de registrarse con email y password para hacer examen", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(new Intent(MainActivity.this,MainTesting.class));
        }                */
    }
    /* public void createRequest(){
         GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                 .requestIdToken(getString(R.string.default_web_client_id))
                 .requestEmail()
                 .build();
         gsc = GoogleSignIn.getClient(this,gso);
     }*/
    public void logout(View v){
        FirebaseAuth.getInstance().signOut();
        mAuth.signOut();
        startActivity(new Intent(MainActivity.this, Login2023.class));

    }
    protected void onStart() {
        super.onStart();
        user = mAuth.getCurrentUser();
        if(user==null){
            mAuth.signInAnonymously().addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        FirebaseUser currentUser = mAuth.getCurrentUser();
                        updateUi(currentUser);
                        tvnameuser.setText("Anonimo");
                    }else { updateUi(null); }

                }
            });
        }else {
            tvnameuser.setText(user.getEmail());
        }
    }
    private void updateUi(FirebaseUser user) {
        if(user==null   ){
            mAuth.signInAnonymously()
                    .addOnCompleteListener(this,new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUi(user);
                            }else {
                                updateUi(null );
                            }
                        }
                    });

        }
    }
    private void gotoURl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    //SCREENS
    public void availability(View vista) {
        Intent intent = new Intent(this, Availability2023.class);
        startActivity(intent);



    }
    public void premium(View vist) {
        Intent intent = new Intent(this, Premium2023.class);
        startActivity(intent);
    }
    public void estructura(View vist) {
        Intent intent = new Intent(this, Estructura2023.class);
        startActivity(intent);
    }

    public void Cultura(View vista) {
        Intent intento = new Intent(MainActivity.this, Cultura2023.class);
        startActivity(intento);
      /*  if(prefs.getPremium()==1){
            Intent intento = new Intent(MainActivity.this, Cultura2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }*/
    }

    public void myPlan(View vist){

        if(prefs.getPremium()==1){
            Intent intent  = new Intent(MainActivity.this,PlanDeEstudiosChooser.class);
            intent.putExtra("key", user.getUid());
            startActivity(intent);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }




    }
    public void Transiciones(View vista) {

        Intent intento = new Intent(this, Transicion2023.class);
        startActivity(intento);

    }
    public void vocabulary(View vista) {
        Intent intento = new Intent(this, Vocabulary2023.class);
        startActivity(intento);



    }
    boolean isfromtest;
    public void test(View vista) {
        isfromtest=true;
        Intent intento = new Intent(this, Vocabulary2023.class);
        intento.putExtra("test", isfromtest);

        startActivity(intento);


    }

    public void Form(View v){
        Intent intento = new Intent(this, FormularioInfo2023.class);
        startActivity(intento);
    }

    public void ConInt(View vista) {

        Intent intento = new Intent(this, ConInt2023.class);
        startActivity(intento);

    }

    public void SpaInt(View vista) {

        Intent intento = new Intent(this, SpaInt2023.class);
        startActivity(intento);

    }

    public void AudioTest(View vista) {
        Intent intento = new Intent(MainActivity.this, AudioTest.class);
        startActivity(intento);
      /*  if(prefs.getPremium()==1){
            Intent intento = new Intent(MainActivity.this, Cultura2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }*/
    }

    //billing





    //OJO
    public void TestNuevo(View vist){


        Intent intent = new Intent(this, MainTesting.class);
        startActivity(intent);
    }
    public void profile(View vist) {

        Toast.makeText(this, "Bajo construción por el momento", Toast.LENGTH_SHORT).show();

    }

    public void chat_maestro(View vist) {
        Intent crispIntent = new Intent(this, ChatMaestro2023.class);
        startActivity(crispIntent);
    }
    public void masinfo(View vist) {

        gotoURl("https://www.cursosdeinglespersonalizadosenmonterrey.com/");
    }

    public void Open_menu(View vista){
        //Toast.makeText(this, "Menu abierto", Toast.LENGTH_SHORT).show();
        menu.setVisibility(View.VISIBLE);
        btn_menu_open.setVisibility(View.GONE);
        btn_menu_closed.setVisibility(View.VISIBLE);
    }

    public void Close_menu(View vista){
        //Toast.makeText(this, "Menu abierto", Toast.LENGTH_SHORT).show();
        menu.setVisibility(View.GONE);
        btn_menu_open.setVisibility(View.VISIBLE);
        btn_menu_closed.setVisibility(View.GONE);
    }
    UserStats userStatsObject  ;
/*
    public void dialogueContainer( String buttonyes, String buttonno,Context context){
        db= FirebaseFirestore.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        rachaDocRef= db.collection(userid).document("users");
        rachaDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(!documentSnapshot.exists()){

                }else {
                userStatsObject= documentSnapshot.toObject(UserStats.class);
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    LayoutInflater inflater = getLayoutInflater();

                    View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
                    builder.setView(dialogView);

                    TextView textView = dialogView.findViewById(R.id.textodialogo);
                     textView.setText("Felicidades! has usado el app por "+ String.valueOf(userStatsObject.getUsageCount())+"dias");
                    String text = "Felicidades! has usado el app por <b>" + String.valueOf(userStatsObject.getUsageCount()) + " días</b>";

                    textView.setText(Html.fromHtml(text));
                    textView.setTextSize(18); // Set the text size to 18sp (adjust the size as needed)
                    textView.setTypeface(null, Typeface.BOLD); //
                    AlertDialog dialog = builder.create();

// Set up the button click listener if needed
                    Button button = dialogView.findViewById(R.id.buttondialogo1);
                    button.setText(buttonyes);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
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
            }
        });



    }
*/

    public void dialogueContainer(String buttonyes, String buttonno, Context context) {
       SharedPreferences prefs = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE);
        String lastShownDate = prefs.getString("lastDialogShownDate", "");

        String currentDate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

        // Check if the dialog has been shown today
        if (lastShownDate.equals(currentDate)) {
            return; // Don't show the dialog, it's already been shown today
        }

        db = FirebaseFirestore.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        rachaDocRef = db.collection(userid).document("users");

        rachaDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (!documentSnapshot.exists()) {
                    // Handle the case where the document doesn't exist
                } else {
                    userStatsObject = documentSnapshot.toObject(UserStats.class);
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    LayoutInflater inflater = getLayoutInflater();

                    View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
                    builder.setView(dialogView);

                    TextView textView = dialogView.findViewById(R.id.textodialogo);
                    String text = "Felicidades! has usado el app por <b>" + userStatsObject.usageCount + " días</b>";
                    textView.setText(Html.fromHtml(text));
                    textView.setTextSize(18); // Set the text size to 18sp
                    textView.setTypeface(null, Typeface.BOLD);

                    AlertDialog dialog = builder.create();

                    // Set up the button click listeners
                    Button button = dialogView.findViewById(R.id.buttondialogo1);
                    button.setText(buttonyes);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    Button button2 = dialogView.findViewById(R.id.botondialogo2);
                    button2.setText(buttonno);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                    // Update SharedPreferences with the current date after showing the dialog
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("lastDialogShownDate", currentDate);
                    editor.apply();
                }
            }
        });
    }

    public void Voice(View vista){
        Intent intento = new Intent(this,ToeflSpeaking.class);
        startActivity(intento);
    }

}