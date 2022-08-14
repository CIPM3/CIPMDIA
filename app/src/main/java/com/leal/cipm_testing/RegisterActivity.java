package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {
    private EditText etname,etRegEmail,etRegPassword,etpassword2;
    private Button btnRegister;
    TextView tvloginhere;
    FirebaseAuth mAuth;
    String nameofuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etname = findViewById(R.id.nombrereg);
        etRegEmail= findViewById(R.id.emailreg);
        etRegPassword= findViewById(R.id.password1reg);
        etpassword2=findViewById(R.id.password2reg);
        btnRegister= findViewById(R.id.RegBut);
        tvloginhere= findViewById(R.id.tvloginhere);
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
                startActivity(new Intent(RegisterActivity.this,SignIn.class));
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
                        Toast.makeText(RegisterActivity.this, "User Registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this,SignIn.class));

                    }else{
                        Toast.makeText(RegisterActivity.this, "Registration Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }


}