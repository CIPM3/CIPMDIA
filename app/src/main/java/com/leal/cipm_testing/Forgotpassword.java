package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

public class Forgotpassword extends AppCompatActivity {
    LinearLayout recuperar;
    EditText email;
    FirebaseAuth mAuth;
    String stEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        recuperar = findViewById(R.id.recuperarcontra);
        email = findViewById(R.id.correorecuperar);
        mAuth=FirebaseAuth.getInstance();

        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 stEmail = email.getText().toString().trim();
                if(!TextUtils.isEmpty(stEmail)){
                    resetPassword();
                }else {
                    email.setError("El correo no puede estar vacio");
                }
            }
        });

    }

    public void recuperar (View vista ){
        stEmail = email.getText().toString().trim();
        if(!TextUtils.isEmpty(stEmail)){
            resetPassword();
        }else {
            email.setError("El correo no puede estar vacio");
        }
    }
    private void resetPassword() {
        mAuth.sendPasswordResetEmail(stEmail    ).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(Forgotpassword.this, "Se ha enviado un link al correo para resetear la contraseña", Toast.LENGTH_SHORT).show();
                Intent intento = new Intent(Forgotpassword.this,Login2023.class);
                startActivity(intento);
                finish();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Forgotpassword.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}