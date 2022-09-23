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


public class VocabTestResult extends Fragment {
    ArrayAdapter<String> adapter;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    ListView lv;
    String userid;
    View v;
    StudentVocabRestultsModel  st= new StudentVocabRestultsModel();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v =  inflater.inflate(R.layout.fragment_vocab_test_result, container, false);

        return v;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //  ttv= v.findViewById(R.id.testertv);
        db = FirebaseFirestore.getInstance();
        mAuth= FirebaseAuth.getInstance();
        lv= view.findViewById(R.id.listviewfragv);
        userid= mAuth.getCurrentUser().getUid();
        DocumentReference docref = db.collection(userid).document("vocabulary");

        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    Toast.makeText(getContext(), "espere un segundo", Toast.LENGTH_SHORT).show();
                    st=  documentSnapshot.toObject(StudentVocabRestultsModel.class);
                    assert st != null;
                    //aparentemente ya funciona, solo llenar el array
                    String[] est = {
                            "The :"+ st.the,
                            "To Be: "+st.tobe,
                            "And : "+st.and,
                            "Of :"+st.of,
                            "A :"+st.a,
                            "In :"+st.in,
                            "To :"+st.to,
                            "To Have :"+st.tohave,
                            "It :"+st.it,
                            "I :"+st.I,
                            "That :"+st.that1,
                            "That :"+st.that2,
                            "For :"+st.for1,
                            "For :"+st.for2 ,
                            "You :"+st.you,
                            "He :"+st.he,
                            "With :"+st.with,
                            "On :"+st.on,
                            "To Do :"+st.todo,
                            "To Say :"+st.tosay,
                            "This :"+st.tosay ,
                            "They :"+st.they,
                            "At :"+st.at,
                            "But :"+st.but,
                            "We "+st.we,
                            "His :"+st.his,
                            "From :"+st.from1,
                            "From :"+st.from2,
                            "Since :"+st.since,
                            "By :"+st.by,
                            "She :"+st.she,
                            "Or :"+st.or,
                            "As :"+st.as1,
                            "As :"+st.as2,
                            "What :"+st.what1,
                            "What :"+st.what2,
                            "To Go :"+st.togo,
                            "Their :"+st.their,
                            "Can :"+st.can,
                            "Who :"+st.who,
                            "To Get :"+st.toget,
                            "If :"+st.if1,
                            "Would :"+st.would,
                            "Her :"+st.her,
                            "All :"+st.all,
                            "My :"+st.my,
                            "To Make :"+st.tomake,
                            "About :"+st.about1,
                            "About :"+st.about2,
                            "To Know :"+st.toknow,
                            "Will :"+st.will,
                            "Up :"+st.up,
                            "Aqui Termina el Rango 0 a 50"
                    };

                    adapter = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_list_item_1, est);
                }
                lv.setAdapter(adapter);
            }
        });


    }


}