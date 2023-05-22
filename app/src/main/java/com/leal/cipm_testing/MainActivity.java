package com.leal.cipm_testing;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.leal.cipm_testing.screens.Availability2023;
import com.leal.cipm_testing.screens.ConInt2023;
import com.leal.cipm_testing.screens.Cultura2023;
import com.leal.cipm_testing.screens.Estructura2023;
import com.leal.cipm_testing.screens.FormularioInfo2023;
import com.leal.cipm_testing.screens.Login2023;
import com.leal.cipm_testing.screens.Premium2023;
import com.leal.cipm_testing.screens.SpaInt2023;
import com.leal.cipm_testing.screens.Transicion2023;
import com.leal.cipm_testing.screens.Vocabulary2023;

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

        if(prefs.getPremium()==0){
            Intent intent = new Intent(this, Availability2023.class);
            startActivity(intent);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }


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
        if(prefs.getPremium()==0){
            Intent intento = new Intent(MainActivity.this, Cultura2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }
    }

    public void myPlan(View vist){
//       Intent intent  = new Intent(MainActivity.this,PlanDeEstudiosChooser.class);
//        intent.putExtra("key", user.getUid());
//        startActivity(intent);

        Toast.makeText(this, "Actividad en Mantenimiento.", Toast.LENGTH_SHORT).show();
/*
        if(Objects.requireNonNull(mAuth.getCurrentUser()).isAnonymous()){
            Toast.makeText(this, "Favor de registrarse con email y password para hacer Plan", Toast.LENGTH_SHORT).show();
        }else{
            if(prefs.getPremium()==1){
                Intent intent  = new Intent(MainActivity.this,PlanDeEstudiosChooser.class);
                intent.putExtra("key", user.getUid());
                startActivity(intent);
            }else if(prefs.getPremium()==0){
                Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
            }
        }
      */

    }
    public void Transiciones(View vista) {
        if(prefs.getPremium()==0){
            Intent intento = new Intent(this, Transicion2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }

    }
    public void vocabulary(View vista) {

        if(prefs.getPremium()==0){
            Intent intento = new Intent(this, Vocabulary2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }


    }

    public void Form(View v){
        Intent intento = new Intent(this, FormularioInfo2023.class);
        startActivity(intento);
    }

    public void ConInt(View vista) {
        if(prefs.getPremium()==0){
            Intent intento = new Intent(this, ConInt2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }
    }

    public void SpaInt(View vista) {
        if(prefs.getPremium()==0){
            Intent intento = new Intent(this, SpaInt2023.class);
            startActivity(intento);
        }else if(prefs.getPremium()==0){
            Toast.makeText(this, "Función solo disponible para Alumno Premium", Toast.LENGTH_SHORT).show();
        }


        //Toast.makeText(this, "Esta parte esta bajo construción, perdón por el inconveniente", Toast.LENGTH_SHORT).show();
    }

    //billing





    //OJO
    public void TestNuevo(View vist){
        /*Toast.makeText(this, "funcion en desarrollo", Toast.LENGTH_SHORT).show();*/
        Intent intent = new Intent(this, test_student.class);
        startActivity(intent);
    }
    public void profile(View vist) {

        Toast.makeText(this, "Funcion no disponible por el momento", Toast.LENGTH_SHORT).show();

    }

    public void chat_maestro(View vist) {
        Intent crispIntent = new Intent(this, chat_maestro.class);
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

}