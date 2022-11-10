package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbn;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.concurrent.Executor;

public class SignIn extends AppCompatActivity {
    FirebaseAuth mAuth;
    Button btnlogin;
    TextView tvRegisterhere;
    EditText etloginemail,etloginpassword;
    TextView googlesignin,anonymus;
   /* private GoogleSignInOptions gso;
    private  GoogleSignInClient gsc;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
       // googlesignin=findViewById(R.id.googlesignintv);
        mAuth = FirebaseAuth.getInstance();
        tvRegisterhere= findViewById(R.id.notreg);
        etloginemail = findViewById(R.id.etemaillogin);
        etloginpassword = findViewById(R.id.etpasswordlogin);
        // email and password
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
        // anonymus sign in
        anonymus = findViewById(R.id.anonymuslink);
        anonymus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                procede();
            }
        });

     /*   gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
               .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();*/

      /*  gsc= GoogleSignIn.getClient(this,gso);
        googlesignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = gsc.getSignInIntent();
                startActivityForResult(i,1234);
            }
        });*/



    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
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
                                    Toast.makeText(SignIn.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }
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
                        Toast.makeText(SignIn.this, "User logged in succesfully ", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignIn.this,MainActivity.class ));

                    }else {
                        Toast.makeText(SignIn.this, "Email or password incorrect ", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }
    private void navigatetomain() {
        finish();
        Intent intent = new Intent(SignIn.this,MainActivity.class);
        startActivity(intent);
    }
    public void procede(){
        Intent intent = new Intent(this, ChooseLevel.class);
        startActivity(intent);
    }

}