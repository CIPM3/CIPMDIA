package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class Login2023 extends AppCompatActivity {

    FirebaseAuth mAuth;
    LinearLayout btnlogin;
    TextView tvRegisterhere;
    EditText etloginemail,etloginpassword;
    TextView googlesignin,anonymus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2023);
        mAuth = FirebaseAuth.getInstance();
        tvRegisterhere= findViewById(R.id.btn_registro);
        etloginemail = findViewById(R.id.input_user);
        etloginpassword = findViewById(R.id.input_password);
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
                startActivity(new Intent(Login2023.this,Registro2023.class));
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
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
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
                                startActivity(new Intent(Login2023.this,ChooseLevel.class ));

                            }else {
                                Toast.makeText(Login2023.this, "Usuario o Contraseña incorrectos ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

    }
}