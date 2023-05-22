package com.leal.cipm_testing.screens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.leal.cipm_testing.R;

public class Registro2023 extends AppCompatActivity {
    private EditText etname,etRegEmail,etRegPassword,etpassword2;
    private LinearLayout btnRegister;
    TextView tvloginhere;
    FirebaseAuth mAuth;
    String nameofuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2023);
        etname = findViewById(R.id.input_nombre);
        etRegEmail= findViewById(R.id.input_user);
        etRegPassword= findViewById(R.id.input_password);
        etpassword2=findViewById(R.id.input_password);
        btnRegister= findViewById(R.id.btn_reg);
        tvloginhere= findViewById(R.id.btn_login);
        mAuth = FirebaseAuth.getInstance();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });

        tvloginhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registro2023.this, Login2023.class));
            }
        });
    }

    private void createUser() {
        nameofuser= etname.getText().toString().trim();
        String email = etRegEmail.getText().toString().trim();
        String password = etRegPassword.getText().toString().trim();
        String passwordcheck = etpassword2.getText().toString();
        if(!password.equalsIgnoreCase(passwordcheck)){
            etpassword2.setError("passwords Do not match");
            etpassword2.requestFocus();

        }else if(TextUtils.isEmpty(email)){
            etRegEmail.setError("Email Cannot be Empty");
            etRegEmail.requestFocus();
        }else if(TextUtils.isEmpty(password)){
            etRegPassword.setError("password cannot be empty");
            etRegPassword.requestFocus();
        }else {
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Registro2023.this, "User Registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Registro2023.this,Login2023.class));

                    }else{
                        Toast.makeText(Registro2023.this, "Registration Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}