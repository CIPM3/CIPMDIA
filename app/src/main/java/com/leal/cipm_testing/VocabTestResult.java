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
                            "Aqui Termina el Rango 0 a 50",

                            "One :"+st.one,
                            "Time :"+st.time,
                            "There :"+st.there,
                            "Year :"+st.year,
                            "So :"+st.so,
                            "Think :"+st.think,
                            "When :"+st.when,
                            "Which :"+st.which,
                            "Them :"+st.them,
                            "Some :"+st.some,
                            "Me :"+st.me,
                            "People :"+st.people,
                            "Take :"+st.take,
                            "Out :"+st.out,
                            "Into :"+st.into,
                            "Just :"+st.just,
                            "See1 :"+st.see1,
                            "Him :"+st.him,
                            "Your :"+st.your,
                            "Come :"+st.come,
                            "Could :"+st.could,
                            "Now :"+st.now,
                            "Than :"+st.than,
                            "Like :"+st.like,
                            "Other :"+st.other,
                            "How :"+st.how,
                            "Then :"+st.them,
                            "Its :"+st.its,
                            "Our :"+st.our,
                            "Two :"+st.two,
                            "More :"+st.more,
                            "These :"+st.these,
                            "Want :"+st.want,
                            "Way :"+st.way,
                            "Look :"+st.look,
                            "First :"+st.first,
                            "Also :"+st.also,
                            "New1 :"+st.new1,
                            "Because :"+st.because,
                            "Day :"+st.day,
                            "More1 :"+st.more1,
                            "Use :"+st.use,
                            "No :"+st.no,
                            "Man :"+st.man,
                            "Find :"+st.find,
                            "Here :"+st.here,
                            "Thing :"+st.thing,
                            "Give :"+st.give,
                            "Many :"+st.many,
                            "Well :"+st.well,
                            "Aqui terminan 50 a 100",

                            "Only :"+st.only,
                            "Those :"+st.those,
                            "Tell :"+st.tell,
                            "One1 :"+st.one1,
                            "Very :"+st.very,
                            "Her1 :"+st.her1,
                            "Even :"+st.even,
                            "Back: "+st.back,
                            "Any :"+st.any,
                            "Good :"+st.good,
                            "Woman :"+st.woman,
                            "Through :"+st.through,
                            "Us :"+st.us,
                            "Life :"+st.life,
                            "Child :"+st.child,
                            "There1 :"+st.there1,
                            "Work :"+st.work,
                            "Down :"+st.down,
                            "May :"+st.may,
                            "After :"+st.after,
                            "Should :"+st.should,
                            "Call :"+st.call,
                            "World :"+st.world,
                            "Over :"+st.over,
                            "School :"+st.school,
                            "Still :"+st.still,
                            "Try1 :"+st.try1,
                            "In1 :"+st.in1,
                            "As :"+st.as,
                            "Last :"+st.last,
                            "Ask :"+st.ask,
                            "Need :"+st.need,
                            "Too :"+st.too,
                            "Feel :"+st.feel,
                            "Three :"+st.three,
                            "When1 :"+st.when1,
                            "State :"+st.state,
                            "Never :"+st.never,
                            "Become :"+st.become,
                            "Between :"+st.between,
                            "High :"+st.high,
                            "really :"+st.really,
                            "Something :"+st.something,
                            "Most :"+st.most,
                            "Another :"+st.another,
                            "Much :"+st.much,
                            "Another1 :"+st.another1,
                            "Much1 :"+st.much1,
                            "Family :"+st.family,
                            "Own :"+st.own,
                            "Out1 :"+st.out1,
                            "leave :"+st.leave,
                            "Put :"+st.put,
                            "Aqui termina de 100 a 150",

                            "Old :"+st.old,
                            "While1 :"+st.while1,
                            "Mean :"+st.mean,
                            "On2 :"+st.on2,
                            "Keep :"+st.keep,
                            "Student :"+st.student,
                            "Why :"+st.why,
                            "Let :"+st.let,
                            "Great :"+st.great,
                            "Same :"+st.same,
                            "Big :"+st.big,
                            "Group :"+st.group,
                            "Begin :"+st.begin,
                            "Seem :"+st.seem,
                            "country :"+st.country,
                            "help :"+st.help,
                            "talk :"+st.talk,
                            "where :"+st.where,
                            "turn :"+st.turn,
                            "problem :"+st.problem,
                            "every :"+st.every,
                            "start :"+st.start,
                            "hand :"+st.hand,
                            "might :"+st.might,
                            "american :"+st.american,
                            "show :"+st.show,
                            "part :"+st.part,
                            "about :"+st.about,
                            "against :"+st.against,
                            "place :"+st.place,
                            "over2 :"+st.over2,
                            "such :"+st.such,
                            "again :"+st.again,
                            "few :"+st.few,
                            "case1 :"+st.case1,
                            "most2 :"+st.most2,
                            "week :"+st.week,
                            "company :"+st.company,
                            "where2 :"+st.where2,
                            "system :"+st.system,
                            "each :"+st.each,
                            "right :"+st.right,
                            "program :"+st.program,
                            "hear :"+st.hear,
                            "so2 :"+st.so2,
                            "question :"+st.question,
                            "during :"+st.during,
                            "work2 :"+st.work2,
                            "play :"+st.play,
                            "Aqui termina de 150 a 200",

                            // falta completar aqui para que lo muestre el listview en el fragmento
                    };

                    adapter = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_list_item_1, est);
                }
                lv.setAdapter(adapter);
            }
        });


    }


}