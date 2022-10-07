package com.leal.cipm_testing;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;
import java.util.Map;

public class structureTestResult extends Fragment {
    ArrayAdapter<String> adapter;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    ListView lv;
    String userid;
    View v;
    Student  st= new Student();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         v =  inflater.inflate(R.layout.fragment_structure_test_result, container, false);
        return v;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();
        lv= view.findViewById(R.id.listviewfrag);
        userid= mAuth.getCurrentUser().getUid();
        DocumentReference docref = db.collection(userid).document("structures");
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    Toast.makeText(getContext(), "espere un segundo", Toast.LENGTH_SHORT).show();
                      st=  documentSnapshot.toObject(Student.class);
                    assert st != null;
                    //aparentemente ya funciona, solo llenar el array
                    String[] est = {st.name,
                            "Present Simple : "+st.presentesimple+" Response time:"+st.presentesimpletime+" "+"Seconds",
                            "Present Continuous : "+st.presenteContinuo,
                            "Present Perfect : "+st.presentePerfecto,
                            "Present Perfect Continous: "+ st.presentePerfectoContinuo,
                            "Past Simple : " + st.pastsimple,
                            "Past Continous : "+ st.pastContinuo,
                            "Past Perfect : "+ st.pastPerfecto,
                            "Past Perfect Continous : " + st.pastPerfectoContinuo,
                            "Future Simple : "+ st.futuresimple,
                            "Future Continous : "+ st.futureContinuo,
                            "Future Perfect : "+ st.futurePerfecto,
                            "Future Perfect Continous : "+ st.futurePerfectoContinuo,
                            "Would Simple : " + st.wouldsimple,
                            "Would Continous : " + st.wouldContinuo,
                            "Would Perfect : "+ st.wouldPerfecto,
                            "Would Perfect Continous : "+ st.wouldPerfectoContinuo,
                            "Could Simple : " + st.couldsimple,
                            "Could Continous : "+ st.couldContinuo,
                            "Could Perfect : "+ st.couldPerfecto,
                            "Could Perfect Continous : " + st.couldPerfectoContinuo,
                            "Might Simple : " + st.mightsimple,
                            "Might Continous : "+ st.mightContinuo,
                            "Might Perfect : "+ st.mightPerfecto,
                            "Might Perfect Continous : "+ st.mightPerfectoContinuo,
                            "Can Simple : " + st.cansimple,
                            "Can Continous : " + st.canContinuo,
                            "Must Simple : "+ st.mustsimple,
                            "Must Continous : "+ st.mustContinuo,
                            "Should Simple : "+ st.shouldsimple,
                            "Should Continous : "+ st.shouldContinuo,
                            "Should Perfect : "+ st.shouldPerfecto,
                            "Should Perfect Continous : "+ st.shouldPerfectoContinuo,
                            "Want to : " + st.wantTo,
                            "For to : "+ st.forTo,
                            "Supposed to Present : " + st.supposedToPresent,
                            "Wish Past Perfect : "+ st.wishPastPerfect,
                            "Used to : "+ st.usedTo,
                            "Be Used to : "+ st.beUsedTo,
                            "0 a 50 : "+st.vocab0a50,
                            "50 a 100 : "+st.vocab50a100,
                            "100 a 150 : "+st.vocab100a150,
                            "150 a 200 : "+st.vocab150a200,
                            "200 a 250 : "+st.vocab200a250,
                            "250 a 300 : "+st.vocab200a250
                    };
                    adapter = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_list_item_1, est);
                }
                lv.setAdapter(adapter);
            }
        });


    }

}