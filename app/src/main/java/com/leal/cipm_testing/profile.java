package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.leal.cipm_testing.components.BottomNav;
import com.leal.cipm_testing.components.header;

import im.crisp.client.Crisp;

public class profile extends AppCompatActivity {
    Button logoutbtn,hamtest;
    LinearLayout menu,btn_menu_open,btn_menu_closed;
    TextView txt, tvnameuser;
    FirebaseAuth mAuth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvnameuser = findViewById(R.id.UserNameTv);
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
        AgregarFragments();
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

    public void logout(View v){
        FirebaseAuth.getInstance().signOut();
        mAuth.signOut();
        startActivity(new Intent(this,Login2023.class));

    }
    //FRAGMENT
    public void AgregarFragments(){
        findViewById(R.id.btn_opc);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //DECLARACION DE COMPONENTES
        BottomNav BottomNav = new BottomNav();

        fragmentTransaction.replace(R.id.btn_opc, BottomNav);
        fragmentTransaction.commit();
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