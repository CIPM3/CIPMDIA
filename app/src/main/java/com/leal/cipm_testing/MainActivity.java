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
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import im.crisp.client.Crisp;

public class MainActivity extends AppCompatActivity {
    Button btn,logoutbtn,testest;
    LinearLayout menu,btn_menu_open,btn_menu_closed;
    TextView txt, tvnameuser;
    FirebaseAuth mAuth;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    RegisterActivity r;
    FirebaseUser user;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tvnameuser = findViewById(R.id.UserNameTv);
        testest= findViewById(R.id.testest);
        gso= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);
        mAuth= FirebaseAuth.getInstance();
        logoutbtn=findViewById(R.id.btnlogout);
        Crisp.configure(getApplicationContext(), "9793b001-eb11-4714-bfde-c26c83361406");
        txt = findViewById(R.id.itemName);
        btn = findViewById(R.id.itemPrice);
        menu = findViewById(R.id.menu);
        btn_menu_open = findViewById(R.id.btn_menu_open);
        btn_menu_closed = findViewById(R.id.btn_menu_closed);
        Prefs prefs = new Prefs(this);
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
        btn.setOnClickListener(view -> {
            startActivity(new Intent(this,StoreActivity.class));
        });

        testest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainTesting.class));

            }
        });
    }
    public void logout(View v){
        mAuth.signOut();
        startActivity(new Intent(MainActivity.this,SignIn.class));
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        finish();
                        startActivity(new Intent(MainActivity.this,SignIn.class));
                    }
                });
            }
        });
    }
    protected void onStart() {
        super.onStart();
         user = mAuth.getCurrentUser();
        if(user==null){
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
            if(acct!=null){
                String personName = acct.getDisplayName();
                tvnameuser.setText(personName);
                return;
            }
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
            mAuth.signInAnonymously().addOnCompleteListener(this,new OnCompleteListener<AuthResult>() {
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
    public void tutorialGeneral(View vista) {
        Intent intento = new Intent(this, TutorialGeneral.class);
        startActivity(intento);
    }
    public void vocabulary(View vista) {
        Intent intento = new Intent(this, vocabulary.class);
        startActivity(intento);

    }
    public void availability(View vista) {
        Intent intento = new Intent(this, availability.class);
        startActivity(intento);

    }


    //billing
    public void Cultura(View vista) {
        Intent intento = new Intent(this, Culture.class);
        startActivity(intento);
    }
    public void ConInt(View vista) {
        Intent intento = new Intent(this, rachel.class);
        startActivity(intento);
    }
    public void premium(View vist) {
        Intent intent = new Intent(this, StoreActivity.class);
        startActivity(intent);
    }
    public void profile(View vist) {
        Intent crispIntent = new Intent(this, profile.class);
        startActivity(crispIntent);
    }
    public void chat_maestro(View vist) {
        Intent crispIntent = new Intent(this, chat_maestro.class);
        startActivity(crispIntent);
    }
    public void masinfo(View vist) {
        gotoURl("https://www.facebook.com/olympusgroupmx");
    }
    //Provisonal ventanas de eleccion
    public void chose_est(View vista) {
        Intent intento = new Intent(this, estructura_nuevo.class);
        startActivity(intento);
    }
    public void chose_vocab(View vista) {
        Intent intento = new Intent(this, vocabulary_nuevo.class);
        startActivity(intento);
    }
    public void chose_cultura(View vista) {
        Intent intento = new Intent(this, cultura_nuevo.class);
        startActivity(intento);
    }
    public void chose_aval(View vista) {
        Intent intento = new Intent(this, availability_nuevo.class);
        startActivity(intento);
    }
    public void chose_conscis(View vista) {
        Intent intento = new Intent(this, conscisousinterference_nuevo.class);
        startActivity(intento);
    }
    public void chose_spa_int(View vista) {
        Intent intento = new Intent(this, spa_int_nuevo.class);
        startActivity(intento);
        //Toast.makeText(this, "Esta parte esta bajo construción, perdón por el inconveniente", Toast.LENGTH_SHORT).show();
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

    //cambios

}