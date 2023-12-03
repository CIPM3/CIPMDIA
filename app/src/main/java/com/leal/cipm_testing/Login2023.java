package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login2023 extends AppCompatActivity {

    FirebaseAuth mAuth;
    LinearLayout btnlogin,recuperarcontra;
    TextView tvRegisterhere;
    EditText etloginemail,etloginpassword;
    TextView googlesignin;
    LinearLayout visitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2023);
        mAuth = FirebaseAuth.getInstance();
        tvRegisterhere= findViewById(R.id.btn_registro);
        etloginemail = findViewById(R.id.input_user);
        etloginpassword = findViewById(R.id.input_password);
        recuperarcontra =findViewById(R.id.recuperarcontras);
        visitante = findViewById(R.id.visitantebtn);
        // email and password
        btnlogin=findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
        tvRegisterhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login2023.this, Registro2023.class));
            }
        });
        recuperarcontra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(Login2023.this,Forgotpassword.class);
                startActivity(intento);
                finish();

            }
        });
        visitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signInAnonymously().addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser user = mAuth.getCurrentUser();
                            startActivity(new Intent(Login2023.this,Vocabulary2023.class));
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login2023.this, "something went wrong ", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }

    /*protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
                FirebaseAuth.getInstance().signInWithCredential(credential)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);

                                } else {
                                    Toast.makeText(Login2023.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }*/
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if(user!= null){
            if(user.isAnonymous()){

            }else{
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "entro en el onstart y no es anonimo", Toast.LENGTH_SHORT).show();
            }

        }else {

        }

    }

    // email-password sign in
    private void loginUser() {

        String email = etloginemail.getText().toString().trim();
        String password= etloginpassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            etloginemail.setError("email cannot be empty");
            etloginemail.requestFocus();
        }else if(TextUtils.isEmpty(password)){
            etloginpassword.setError("password cannot be empty");
            etloginpassword.requestFocus();
        }else {
            mAuth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(Login2023.this, "Usuario Logeado existosamente", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Login2023.this, ChooseLevel.class ));

                            }else {
                                Toast.makeText(Login2023.this, "Usuario o Contraseña incorrectos ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

    }
}