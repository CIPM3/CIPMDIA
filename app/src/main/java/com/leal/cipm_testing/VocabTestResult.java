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
                            "The :" + st.the,
                            "To Be: " + st.tobe,
                            "And : " + st.and,
                            "Of :" + st.of,
                            "A :" + st.a,
                            "In :" + st.in,
                            "To :" + st.to,
                            "To Have :" + st.tohave,
                            "It :" + st.it,
                            "I :" + st.I,
                            "That :" + st.that1,
                            "That :" + st.that2,
                            "For :" + st.for1,
                            "For :" + st.for2,
                            "You :" + st.you,
                            "He :" + st.he,
                            "With :" + st.with,
                            "On :" + st.on,
                            "To Do :" + st.todo,
                            "To Say :" + st.tosay,
                            "This :" + st.tosay,
                            "They :" + st.they,
                            "At :" + st.at,
                            "But :" + st.but,
                            "We " + st.we,
                            "His :" + st.his,
                            "From :" + st.from1,
                            "From :" + st.from2,
                            "Since :" + st.since,
                            "By :" + st.by,
                            "She :" + st.she,
                            "Or :" + st.or,
                            "As :" + st.as1,
                            "As :" + st.as2,
                            "What :" + st.what1,
                            "What :" + st.what2,
                            "To Go :" + st.togo,
                            "Their :" + st.their,
                            "Can :" + st.can,
                            "Who :" + st.who,
                            "To Get :" + st.toget,
                            "If :" + st.if1,
                            "Would :" + st.would,
                            "Her :" + st.her,
                            "All :" + st.all,
                            "My :" + st.my,
                            "To Make :" + st.tomake,
                            "About :" + st.about1,
                            "About :" + st.about2,
                            "To Know :" + st.toknow,
                            "Will :" + st.will,
                            "Up :" + st.up,
                            "Aqui Termina el Rango 0 a 50",

                            "One :" + st.one,
                            "Time :" + st.time,
                            "There :" + st.there,
                            "Year :" + st.year,
                            "So :" + st.so,
                            "Think :" + st.think,
                            "When :" + st.when,
                            "Which :" + st.which,
                            "Them :" + st.them,
                            "Some :" + st.some,
                            "Me :" + st.me,
                            "People :" + st.people,
                            "Take :" + st.take,
                            "Out :" + st.out,
                            "Into :" + st.into,
                            "Just :" + st.just,
                            "See1 :" + st.see1,
                            "Him :" + st.him,
                            "Your :" + st.your,
                            "Come :" + st.come,
                            "Could :" + st.could,
                            "Now :" + st.now,
                            "Than :" + st.than,
                            "Like :" + st.like,
                            "Other :" + st.other,
                            "How :" + st.how,
                            "Then :" + st.them,
                            "Its :" + st.its,
                            "Our :" + st.our,
                            "Two :" + st.two,
                            "More :" + st.more,
                            "These :" + st.these,
                            "Want :" + st.want,
                            "Way :" + st.way,
                            "Look :" + st.look,
                            "First :" + st.first,
                            "Also :" + st.also,
                            "New1 :" + st.new1,
                            "Because :" + st.because,
                            "Day :" + st.day,
                            "More1 :" + st.more1,
                            "Use :" + st.use,
                            "No :" + st.no,
                            "Man :" + st.man,
                            "Find :" + st.find,
                            "Here :" + st.here,
                            "Thing :" + st.thing,
                            "Give :" + st.give,
                            "Many :" + st.many,
                            "Well :" + st.well,
                            "Aqui terminan 50 a 100",

                            "Only :" + st.only,
                            "Those :" + st.those,
                            "Tell :" + st.tell,
                            "One1 :" + st.one1,
                            "Very :" + st.very,
                            "Her1 :" + st.her1,
                            "Even :" + st.even,
                            "Back: " + st.back,
                            "Any :" + st.any,
                            "Good :" + st.good,
                            "Woman :" + st.woman,
                            "Through :" + st.through,
                            "Us :" + st.us,
                            "Life :" + st.life,
                            "Child :" + st.child,
                            "There1 :" + st.there1,
                            "Work :" + st.work,
                            "Down :" + st.down,
                            "May :" + st.may,
                            "After :" + st.after,
                            "Should :" + st.should,
                            "Call :" + st.call,
                            "World :" + st.world,
                            "Over :" + st.over,
                            "School :" + st.school,
                            "Still :" + st.still,
                            "Try1 :" + st.try1,
                            "In1 :" + st.in1,
                            "As :" + st.as,
                            "Last :" + st.last,
                            "Ask :" + st.ask,
                            "Need :" + st.need,
                            "Too :" + st.too,
                            "Feel :" + st.feel,
                            "Three :" + st.three,
                            "When1 :" + st.when1,
                            "State :" + st.state,
                            "Never :" + st.never,
                            "Become :" + st.become,
                            "Between :" + st.between,
                            "High :" + st.high,
                            "really :" + st.really,
                            "Something :" + st.something,
                            "Most :" + st.most,
                            "Another :" + st.another,
                            "Much :" + st.much,
                            "Another1 :" + st.another1,
                            "Much1 :" + st.much1,
                            "Family :" + st.family,
                            "Own :" + st.own,
                            "Out1 :" + st.out1,
                            "leave :" + st.leave,
                            "Put :" + st.put,
                            "Aqui termina de 100 a 150",

                            "Old :" + st.old,
                            "While1 :" + st.while1,
                            "Mean :" + st.mean,
                            "On2 :" + st.on2,
                            "Keep :" + st.keep,
                            "Student :" + st.student,
                            "Why :" + st.why,
                            "Let :" + st.let,
                            "Great :" + st.great,
                            "Same :" + st.same,
                            "Big :" + st.big,
                            "Group :" + st.group,
                            "Begin :" + st.begin,
                            "Seem :" + st.seem,
                            "country :" + st.country,
                            "help :" + st.help,
                            "talk :" + st.talk,
                            "where :" + st.where,
                            "turn :" + st.turn,
                            "problem :" + st.problem,
                            "every :" + st.every,
                            "start :" + st.start,
                            "hand :" + st.hand,
                            "might :" + st.might,
                            "american :" + st.american,
                            "show :" + st.show,
                            "part :" + st.part,
                            "about :" + st.about,
                            "against :" + st.against,
                            "place :" + st.place,
                            "over2 :" + st.over2,
                            "such :" + st.such,
                            "again :" + st.again,
                            "few :" + st.few,
                            "case1 :" + st.case1,
                            "most2 :" + st.most2,
                            "week :" + st.week,
                            "company :" + st.company,
                            "where2 :" + st.where2,
                            "system :" + st.system,
                            "each :" + st.each,
                            "right :" + st.right,
                            "program :" + st.program,
                            "hear :" + st.hear,
                            "so2 :" + st.so2,
                            "question :" + st.question,
                            "during :" + st.during,
                            "work2 :" + st.work2,
                            "play :" + st.play,
                            "Aqui termina de 150 a 200",

                            "goverment :" + st.goverment,
                            "run :" + st.run,
                            "small :" + st.small,
                            "number :" + st.number,
                            "off :" + st.off,
                            "always :" + st.always,
                            "move :" + st.move,
                            "like2 :" + st.like2,
                            "night :" + st.night,
                            "live :" + st.live,
                            "mr :" + st.mr,
                            "point :" + st.point,
                            "believe :" + st.believe,
                            "hold :" + st.hold,
                            "today :" + st.today,
                            "bring :" + st.bring,
                            "happen :" + st.happen,
                            "next :" + st.next,
                            "without :" + st.without,
                            "before :" + st.before,
                            "large :" + st.large,
                            "all2 :" + st.all2,
                            "million :" + st.million,
                            "must :" + st.must,
                            "home :" + st.home,
                            "under :" + st.under,
                            "water :" + st.water,
                            "room :" + st.room,
                            "write :" + st.write,
                            "mother :" + st.mother,
                            "area :" + st.area,
                            "national :" + st.national,
                            "money :" + st.money,
                            "story :" + st.story,
                            "young :" + st.young,
                            "fact :" + st.fact,
                            "month :" + st.month,
                            "different :" + st.different,
                            "lot :" + st.lot,
                            "right2 :" + st.right2,
                            "study :" + st.study,
                            "book :" + st.book,
                            "eye :" + st.eye,
                            "job :" + st.job,
                            "word :" + st.word,
                            "though :" + st.through,
                            "business :" + st.business,
                            "issue :" + st.issue,
                            "side :" + st.side,
                            "kind :" + st.kind,
                            "Aqui termina de 200 a 250",

                            "four :" + st.four,
                            "head :" + st.head,
                            "far :" + st.far,
                            "black :" + st.black,
                            "long1 :" + st.long1,
                            "both2 :" + st.both2,
                            "little :" + st.little,
                            "house :" + st.house,
                            "yes :" + st.yes,
                            "after2 :" + st.after2,
                            "since2 :" + st.since2,
                            "long2 :" + st.long2,
                            "provide :" + st.provide,
                            "service :" + st.service,
                            "around :" + st.around,
                            "friend :" + st.friend,
                            "important :" + st.important,
                            "father :" + st.father,
                            "sit :" + st.sit,
                            "away :" + st.away,
                            "until :" + st.until,
                            "power :" + st.power,
                            "hour :" + st.hour,
                            "game :" + st.game,
                            "often :" + st.often,
                            "yet :" + st.yet,
                            "line :" + st.line,
                            "political :" + st.political,
                            "end :" + st.end,
                            "among :" + st.among,
                            "ever :" + st.ever,
                            "stand :" + st.stand,
                            "bad :" + st.bad,
                            "lose :" + st.lose,
                            "however :" + st.however,
                            "member :" + st.member,
                            "pay :" + st.pay,
                            "law :" + st.law,
                            "meet :" + st.meet,
                            "car :" + st.car,
                            "city :" + st.city,
                            "almost :" + st.almost,
                            "include :" + st.include,
                            "continue1 :" + st.continue1,
                            "set :" + st.set,
                            "later :" + st.later,
                            "community :" + st.community,
                            "much2 :" + st.much2,
                            "name :" + st.name,
                            "Aqui termina de 250 a 300",

                            "five :" + st.five,
                            "once :" + st.once,
                            "white :" + st.white,
                            "least :" + st.least,
                            "president :" + st.president,
                            "learn :" + st.learn,
                            "real :" + st.real,
                            "change2 :" + st.change2,
                            "team :" + st.team,
                            "minute :" + st.minute,
                            "best :" + st.best,
                            "several :" + st.several,
                            "idea :" + st.idea,
                            "kid :" + st.kid,
                            "body :" + st.body,
                            "information :" + st.information,
                            "nothing :" + st.nothing,
                            "ago :" + st.ago,
                            "right3 :" + st.right3,
                            "lead :" + st.lead,
                            "social :" + st.social,
                            "understand :" + st.understand,
                            "whether :" + st.whether,
                            "back2 :" + st.back2,
                            "watch :" + st.watch,
                            "together :" + st.together,
                            "follow :" + st.follow,
                            "around2 :" + st.around2,
                            "parent :" + st.parent,
                            "only2 :" + st.only2,
                            "stop :" + st.stop,
                            "face :" + st.face,
                            "anything :" + st.anything,
                            "create :" + st.create,
                            "public2 :" + st.public2,
                            "already :" + st.already,
                            "speak :" + st.speak,
                            "others :" + st.others,
                            "read :" + st.read,
                            "level :" + st.level,
                            "allow :" + st.allow,
                            "add :" + st.add,
                            "office :" + st.office,
                            "spend :" + st.spend,
                            "door :" + st.door,
                            "health :" + st.health,
                            "person :" + st.person,
                            "art :" + st.art,
                            "sure :" + st.sure,
                            "such2 :" + st.such2,
                            "Aqui termina de 300 a 350",

                            "war :" + st.war,
                            "history :" + st.history,
                            "party :" + st.party,
                            "within :" + st.within,
                            "to grow :" + st.togrow,
                            "result :" + st.result,
                            "open :" + st.open,
                            "change :" + st.change,
                            "morning :" + st.morning,
                            "to walk :" + st.towalk,
                            "reason :" + st.reason,
                            "low :" + st.low,
                            "to win :" + st.towin,
                            "to research :" + st.toresearch,
                            "girl :" + st.girl,
                            "guy :" + st.guy,
                            "early :" + st.early,
                            "food :" + st.food,
                            "before :" + st.before2,
                            "moment :" + st.moment,
                            "himself :" + st.himself,
                            "to air :" + st.toair,
                            "teacher :" + st.teacher,
                            "to force :" + st.toforce,
                            "to offer :" + st.tooffer,
                            "enough :" + st.enough,
                            "both :" + st.both,
                            "education :" + st.education,
                            "across :" + st.across,
                            "although :" + st.although,
                            "to remember :" + st.toremember,
                            "foot :" + st.foot,
                            "second :" + st.second,
                            "boy :" + st.boy,
                            "maybe :" + st.maybe,
                            "to ward :" + st.toward,
                            "able :" + st.able,
                            "age :" + st.age,
                            "off :" + st.off2,
                            "policy :" + st.policy,
                            "everything :" + st.everything,
                            "love :" + st.love,
                            "to process :" + st.toprocess,
                            "music :" + st.music,
                            "including :" + st.including,
                            "to consider :" + st.toconsider,
                            "to appear :" + st.toappear,
                            "actually :" + st.actually,
                            "to buy :" + st.tobuy,
                            "probably :" + st.probably,
                            "Aqui termina de 350 a 400",

                            "human :" + st.human,
                            "to wait :" + st.towait,
                            "to serve :" + st.toserve,
                            "market :" + st.market,
                            "to die :" + st.todie,
                            "to send :" + st.tosend,
                            "to expect :" + st.toexpect,
                            "home :" + st.home2,
                            "sense :" + st.sense,
                            "to build :" + st.tobuild,
                            "to stay :" + st.tostay,
                            "to fall :" + st.tofall,
                            "oh :" + st.oh,
                            "nation :" + st.nation,
                            "to plan :" + st.toplan,
                            "cut :" + st.cut,
                            "college :" + st.college,
                            "interest :" + st.interest,
                            "death :" + st.death,
                            "course :" + st.course,
                            "someone :" + st.someone,
                            "experience :" + st.experience,
                            "behind :" + st.behind,
                            "reach :" + st.reach,
                            "local :" + st.local,
                            "to kill :" + st.tokill,
                            "six :" + st.six,
                            "remain :" + st.remain,
                            "effect :" + st.effect,
                            "use :" + st.use2,
                            "yeah :" + st.yeah,
                            "to suggest :" + st.tosuggest,
                            "class :" + st.class2,
                            "control :" + st.control,
                            "to raise :" + st.toraise,
                            "care :" + st.care,
                            "perhaps :" + st.perhaps,
                            "little :" + st.little2,
                            "late :" + st.late,
                            "hard :" + st.hard,
                            "field :" + st.field,
                            "else :" + st.else2,
                            "to pass :" + st.topass,
                            "former :" + st.former,
                            "sell :" + st.sell,
                            "major :" + st.major,
                            "sometimes :" + st.sometimes,
                            "require :" + st.require,
                            "along :" + st.along,
                            "development :" + st.development,
                            "themselves :" + st.themselves,
                            "Aqui termina de 400 a 450",

                            "report :" + st.report,
                            "role :" + st.role,
                            "better :" + st.better,
                            "economic :" + st.economic,
                            "effort :" + st.effort,
                            "up :" + st.up2,
                            "to decide :" + st.todecide,
                            "rate :" + st.rate,
                            "strong :" + st.strong,
                            "possible :" + st.possible,
                            "heart :" + st.heart,
                            "drug :" + st.drug,
                            "to show :" + st.toshow,
                            "leader :" + st.leader,
                            "light :" + st.light,
                            "voice :" + st.voice,
                            "wife :" + st.wife,
                            "whole :" + st.whole,
                            "police :" + st.police,
                            "mind :" + st.mind,
                            "finally :" + st.finally2,
                            "to pull :" + st.topull,
                            "to return :" + st.toreturn,
                            "free :" + st.free,
                            "military :" + st.military,
                            "price :" + st.price,
                            "report :" + st.report2,
                            "less :" + st.less,
                            "according to :" + st.accordingto,
                            "decision :" + st.decision,
                            "to explain :" + st.toexplain,
                            "son :" + st.son,
                            "hope :" + st.hope,
                            "even :" + st.even2,
                            "to develop :" + st.todevelop,
                            "view :" + st.view,
                            "relationship :" + st.relationship,
                            "carry :" + st.carry,
                            "town :" + st.town,
                            "road :" + st.road,
                            "to drive :" + st.todrive,
                            "arm :" + st.arm,
                            "true :" + st.true2,
                            "federal :" + st.federal,
                            "to break :" + st.tobreak,
                            "better :" + st.better2,
                            "difference :" + st.difference,
                            "to thank :" + st.tothank,
                            "to receive :" + st.toreceive,
                            "value :" + st.value,
                            "Aqui termina de 450 a 500",

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