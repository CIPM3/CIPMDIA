package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class PlanDeEstudiosChooser extends AppCompatActivity {
    Button basicPlanRecommendedBtn;
    boolean isOnPersonalizedPlan=true;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    DatabaseReference ref;
    String userid;
    VocabModeloPersistencia modeloDeVocab ;
    String[] arrayEnBlanco;
    boolean isCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_de_estudios_chooser);
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();

        userid= mAuth.getCurrentUser().getUid();

        isOnPersonalizedPlan = true;
        basicPlanRecommendedBtn= findViewById(R.id.basicplanbtn);
        basicPlanRecommendedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(PlanDeEstudiosChooser.this)
//set icon
                        .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                        .setTitle("Definición: ")
//set message
                        .setMessage("definicionArray[i]")
//set positive button
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
                                intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                                startActivity(intent);

                            }
                        })
//set negative button
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //set what should happen when negative button is clicked
                                Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                            }
                        })
                        .show();
            }
        });
    }

    public boolean isOnPersonalizedPlanMethod() {
        return isOnPersonalizedPlan;
    }
    public void setOnPersonalizedPlan(boolean onPersonalizedPlan) {
        isOnPersonalizedPlan = onPersonalizedPlan;
    }
    public void continueMyPlan(View view){
        isCustom=true;
                            Intent intent = new Intent(PlanDeEstudiosChooser.this,vocabulary_nuevo.class);
                            intent.putExtra("isThePlanPersonalized",isOnPersonalizedPlan);
                            intent.putExtra("isCustom",isCustom);
                            startActivity(intent);
    }

}