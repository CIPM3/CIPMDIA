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
                    //paso 6 final
                    String[] est = {st.name,
                            "Present Simple : "+st.presentesimple+" Response time:"+st.presentesimpletime+" "+"Seconds",
                            "Present Continuous : "+st.presenteContinuo+" Response time:"+st.presentecontinuotime+" "+"Seconds",
                            "Present Perfect : "+st.presentePerfecto+" Response time:"+st.presenteperfectotime+" "+"Seconds",
                            "Present Perfect Continous: "+ st.presentePerfectoContinuo+" Response time:"+st.presenteperfectocontinuotime+" "+"Seconds",
                            "Past Simple : " + st.pastsimple+" Response time:"+st.pastsimpletime+" "+"Seconds",
                            "Past Continous : "+ st.pastContinuo+" Response time:"+st.pastcontinuotime+" "+"Seconds",
                            "Past Perfect : "+ st.pastPerfecto+" Response time:"+st.pastperfectotime+" "+"Seconds",
                            "Past Perfect Continous : " + st.pastPerfectoContinuo+" Response time:"+st.pastperfectotime+" "+"Seconds",
                            "Future Simple : "+ st.futuresimple+" Response time:"+st.futurosimpletime+" "+"Seconds",
                            "Future Continous : "+ st.futureContinuo+" Response time:"+st.futurocontinuotime+" "+"Seconds",
                            "Future Perfect : "+ st.futurePerfecto+" Response time:"+st.futuroperfectotime+" "+"Seconds",
                            "Future Perfect Continous : "+ st.futurePerfectoContinuo+" Response time:"+st.futuroperfectocontinuotime+" "+"Seconds",
                            "Would Simple : " + st.wouldsimple+" Response time:"+st.wouldsimpletime+" "+"Seconds",
                            "Would Continous : " + st.wouldContinuo+" Response time:"+st.wouldcontinuotime+" "+"Seconds",
                            "Would Perfect : "+ st.wouldPerfecto+" Response time:"+st.wouldperfectotime+" "+"Seconds",
                            "Would Perfect Continous : "+ st.wouldPerfectoContinuo+" Response time:"+st.wouldperfectocontinuotime+" "+"Seconds",
                            "Could Simple : " + st.couldsimple+" Response time:"+st.couldsimpletime+" "+"Seconds",
                            "Could Continous : "+ st.couldContinuo+" Response time:"+st.couldcontinuotime+" "+"Seconds",
                            "Could Perfect : "+ st.couldPerfecto+" Response time:"+st.couldperfectotime+" "+"Seconds",
                            "Could Perfect Continous : " + st.couldPerfectoContinuo+" Response time:"+st.couldperfectocontinuotime+" "+"Seconds",
                            //LR

                            "Might Simple : " + st.mightsimple + "Response time :" + st.mightsimpletime + " " + "Seconds",
                            "Might Continous : "+ st.mightContinuo + "Response time :" + st.mightContinuotime + " " + "Seconds",
                            "Might Perfect : "+ st.mightPerfecto + "Response time :" + st.mightPerfectotime + " " + "Seconds",
                            "Might Perfect Continous : "+ st.mightPerfectoContinuo + "Response time :" + st.mightPerfectoContinuotime + " " + "Seconds",
                            "Can Simple : " + st.cansimple + "Response time :" + st.cansimpletime + " " + "Seconds",
                            "Can Continous : " + st.canContinuo + "Response time :" + st.canContinuotime + " " + "Seconds",
                            "Must Simple : "+ st.mustsimple + "Response time :" + st.mustsimpletime + " " + "Seconds",
                            "Must Continous : "+ st.mustContinuo + "Response time :" + st.mustContinuotime + " " + "Seconds",
                            "Should Simple : "+ st.shouldsimple + "Response time :" + st.shouldsimpletime + " " + "Seconds",
                            "Should Continous : "+ st.shouldContinuo + "Response time :" + st.shouldContinuotime + " " + "Seconds",
                            "Should Perfect : "+ st.shouldPerfecto + "Response time :" + st.shouldPerfectotime + " " + "Seconds",
                            "Should Perfect Continous : "+ st.shouldPerfectoContinuo + "Response time :" + st.shouldPerfectoContinuotime + " " + "Seconds",
                            "Want to : " + st.wantTo + "Response time :" + st.wantTotime + " " + "Seconds",
                            "For to : "+ st.forTo + "Response time :" + st.forTotime + " " + "Seconds",
                            "Supposed to Present : " + st.supposedToPresent + "Response time :" + st.supposedToPresenttime + " " + "Seconds",
                            "Wish Past Perfect : "+ st.wishPastPerfect + "Response time :" + st.wishPastPerfecttime + " " + "Seconds",
                            "Used to : "+ st.usedTo + "Response time :" + st.usedTotime + " " + "Seconds",
                            "Be Used to : "+ st.beUsedTo + "Response time :" + st.beUsedTotime + " " + "Seconds",
                    };
                    adapter = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_list_item_1, est);
                }
                lv.setAdapter(adapter);
            }
        });


    }

}