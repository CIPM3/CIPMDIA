package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Map;

import im.crisp.client.Crisp;

public class profile extends AppCompatActivity {
    Button logoutbtn,hamtest;
    ImageView Imgdeluser;
    TextView nombredeluser;
    LinearLayout menu,btn_menu_open,btn_menu_closed;
    TextView txt, tvnameuser;

    String userid;
    FirebaseAuth mAuth;
    FirebaseUser user;

    Map<String, Object> estudiante;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    DocumentReference docRef;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //VARIABLES
        tvnameuser = findViewById(R.id.UserNameTv);
        mAuth= FirebaseAuth.getInstance();
        logoutbtn=findViewById(R.id.btnlogout);
        Crisp.configure(getApplicationContext(), "9793b001-eb11-4714-bfde-c26c83361406");
        txt = findViewById(R.id.itemName);
        menu = findViewById(R.id.menu);
        Imgdeluser = findViewById(R.id.Imgdeluser);
        nombredeluser = findViewById(R.id.nombredeluser);

        //DB
        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();

        //MENU
        btn_menu_open = findViewById(R.id.btn_menu_open);
        btn_menu_closed = findViewById(R.id.btn_menu_closed);
        menu.setVisibility(View.GONE);
        btn_menu_open.setVisibility(View.VISIBLE);
        btn_menu_closed.setVisibility(View.GONE);

        docRef  = db.collection(userid).document("EstudentsInfo");

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
            docRef.get().addOnCompleteListener(taskUser -> {
                if (taskUser.isSuccessful()) {
                    DocumentSnapshot document = taskUser.getResult();

                    if (document.exists()) {

                        estudiante = document.getData();
                        String nombreUser = estudiante.get("nombre")+" "+estudiante.get("apellido");
                        String imageUrl = (String) estudiante.get("urlImage");

                        nombredeluser.setText(nombreUser);
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