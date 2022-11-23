package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class MyPlan extends AppCompatActivity {
    TextView myPlanTemporaryString;
    ListView lv;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userid;
    VocabModeloPersistencia st = new VocabModeloPersistencia();
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plan);
        Intent reciver = getIntent();
        myPlanTemporaryString= findViewById(R.id.myPlanTemp);
        lv= findViewById(R.id.listviewmyplan);
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();
        userid= mAuth.getCurrentUser().getUid();

        DocumentReference docref = db.collection(userid).document("WhereisStudent");
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    st=  documentSnapshot.toObject(VocabModeloPersistencia.class);
                    assert st != null;
                    //aparentemente ya funciona, solo llenar el array
                    String[] est ;
                    est= st.resultArray.toArray(new String[0]);
                    adapter = new ArrayAdapter<String>(getApplicationContext(),
                            android.R.layout.simple_list_item_1, est);
                }
                lv.setAdapter(adapter);
            }
        });
        
    }
}