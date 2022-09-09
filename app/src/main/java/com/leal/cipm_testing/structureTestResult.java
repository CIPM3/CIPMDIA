package com.leal.cipm_testing;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class structureTestResult extends Fragment {
    ArrayAdapter<String> adapter;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();
        DocumentReference docref = db.collection(mAuth.getCurrentUser().getUid()).document("structures");
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                Student st = documentSnapshot.toObject(Student.class);
                String[] estructuras= {
                        "Present Simple :" + st.presentesimple,
                        "Present Continuous :"+ st.presenteContinuo,
                        "Present Perfect :"+ st.presentePerfecto,
                        "Present Perfect Continuous :"+ st.presentePerfectoContinuo,
                        "Past Simple :" + st.pastsimple,
                        "Past Continuous :"+ st.pastContinuo,
                        "Past Perfect :"+ st.pastPerfecto,
                        "Past Perfect Continuous :"+ st.pastPerfectoContinuo,
                        "Future Simple :" + st.futuresimple,
                        "Future Continuous :"+ st.futureContinuo,
                        "Future Perfect :"+ st.futurePerfecto,
                        "Future Perfect Continuous :"+ st.futurePerfectoContinuo,
                        "Would Simple :" + st.wouldsimple,
                        "Would Continuous :"+ st.wouldContinuo,
                        "Would Perfect :"+ st.wouldPerfecto,
                        "Would Perfect Continuous :"+ st.wouldPerfectoContinuo,
                        "Could Simple :" + st.couldsimple,
                        "Could Continuous :"+ st.couldContinuo,
                        "Could Perfect :"+ st.couldPerfecto,
                        "Could Perfect Continuous :"+ st.couldPerfectoContinuo,
                        "Should Simple :" + st.shouldsimple,
                        "Should Continuous :"+ st.shouldContinuo,
                        "Should Perfect :"+ st.shouldPerfecto,
                        "Should Perfect Continuous :"+ st.shouldPerfectoContinuo,
                        "Might Simple :" + st.mightsimple,
                        "Might Continuous :"+ st.mightContinuo,
                        "Might Perfect :"+ st.mightPerfecto,
                        "Might Perfect Continuous :"+ st.mightPerfectoContinuo,
                        "Can Simple :" + st.cansimple,
                        "Can Continuous :"+ st.canContinuo,
                        "Must Simple :" + st.mustsimple,
                        "Must Continuous :"+ st.mustContinuo,
                        "Want To :"+ st.wantTo,
                        "For To :"+ st.forTo,
                        "Supposed To Present :"+ st.supposedToPresent,
                        "Wish Past Perfect :"+ st.wishPastPerfect,
                        "Used To :"+ st.usedTo,
                        "Be Used To :"+ st.beUsedTo,
                };
                adapter = new ArrayAdapter<String>(getContext(),
                        R.layout.list,estructuras
                );
            }
        });
        View v =  inflater.inflate(R.layout.fragment_structure_test_result, container, false);
        ListView lv =v.findViewById(R.id.listviewtestres);
        lv.setAdapter(adapter);
        return v;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}