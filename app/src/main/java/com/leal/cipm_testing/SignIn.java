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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends AppCompatActivity {
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    FirebaseAuth mAuth;
    Button btnlogin;
    TextView tvRegisterhere;
    EditText etloginemail,etloginpassword;
    TextView googlesignin,anonymus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        googlesignin=findViewById(R.id.googlesignintv);
        mAuth = FirebaseAuth.getInstance();
        tvRegisterhere= findViewById(R.id.notreg);
        etloginemail = findViewById(R.id.etemaillogin);
        etloginpassword = findViewById(R.id.etpasswordlogin);
        gso= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);

        googlesignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();

            }
        });

        btnlogin=findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
        tvRegisterhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this,RegisterActivity.class));
            }
        });
        anonymus = findViewById(R.id.anonymuslink);
        anonymus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                procede();
            }
        });

    }
    //goole sign in
    private void signIn() {
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent,1000);
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
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(SignIn.this, "User logged in succesfully ", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignIn.this,MainActivity.class ));

                    }else {
                        Toast.makeText(SignIn.this, "Email or password incorrect ", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                task.getResult(ApiException.class);
                navigatetomain();
            } catch (ApiException e) {
                Toast.makeText(this,"Something Went Wrong", Toast.LENGTH_SHORT).show();
            }

        }
    }
    private void navigatetomain() {
        finish();
        Intent intent = new Intent(SignIn.this,MainActivity.class);
        startActivity(intent);
    }

    public void procede(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}