package com.leal.cipm_testing;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;

import java.util.ArrayList;
import java.util.List;

public class NewVocabRecyclerView extends AppCompatActivity implements VocabItemAdapter.SpeechInitiator {
    private RecyclerView recyclerView;
    private List<VocabItem> vocabItemList;
    private VocabItemAdapter vocabItemAdapter;
    private ActivityResultLauncher<Intent> speechRecognitionLauncher;
    private int activeItemPosition = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_vocab_recycler_view);
        Intent reciver = getIntent();

        recyclerView=findViewById(R.id.recyclerViewvocab);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        vocabItemList  = new ArrayList<>();
        if(reciver.getBooleanExtra("fromStructures",false)){
            loadStructureItems();
        }else {
            loadVocabItems();
        }

        vocabItemAdapter= new VocabItemAdapter(vocabItemList,this);
        recyclerView.setAdapter(vocabItemAdapter);
            escribirEnelInputTextResultadodeUtterance();
    }

    private void loadVocabItems()  {
        texts text= new texts();

        vocabItemList.add(new VocabItem("the","El-La-Los-Las",text.theDef,0));
        vocabItemList.add(new VocabItem("be","Ser o Estar",text.toBeDef,0));
        vocabItemList.add(new VocabItem("and","Y",text.andDef,0));
        vocabItemList.add(new VocabItem("of","de",text.ofDef,0));
        vocabItemList.add(new VocabItem("a","un-una",text.aDef,0));
        vocabItemList.add(new VocabItem("in","en-dentro",text.inDef,0));
        vocabItemList.add(new VocabItem("to(infinitive)","parte de un verbo sin conjugar",text.toInfinitiveDef,0));
        vocabItemList.add(new VocabItem("have","tener-haber-consumir",text.haveDef,0));
        vocabItemList.add(new VocabItem("to","a-como preposición ",text.toPrepositionDef,0));
        vocabItemList.add(new VocabItem("it","eso",text.itDef,0));
        //10
        vocabItemList.add(new VocabItem("I","Yo",text.iDef,0));
        vocabItemList.add(new VocabItem("that","que-para conectar ideas",text.thatConnectorDef,0));
        vocabItemList.add(new VocabItem("for","por o para",text.forDef,0));
        vocabItemList.add(new VocabItem("you","tú",text.youDef,0));
        vocabItemList.add(new VocabItem("he","él",text.heDef,0));
        vocabItemList.add(new VocabItem("with","con",text.withDef,0));
        vocabItemList.add(new VocabItem("on","sobre",text.onDef,0));
        vocabItemList.add(new VocabItem("do","hacer",text.doDef,0));
        vocabItemList.add(new VocabItem("´s","indica posesión",text.possessiveSDef,0));
        vocabItemList.add(new VocabItem("say","Decir",text.sayDef,0));
        //20
        vocabItemList.add(new VocabItem("they","ellos",text.theyDef,0));
        vocabItemList.add(new VocabItem("this","esto",text.thisDef,0));
        vocabItemList.add(new VocabItem("but","pero",text.butDef,0));
        vocabItemList.add(new VocabItem("at","en",text.atDef,0));
        vocabItemList.add(new VocabItem("we","nosotros",text.weDef,0));
        vocabItemList.add(new VocabItem("his","su de él",text.hisDef,0));
        vocabItemList.add(new VocabItem("from","de-proveniencia",text.fromDef,0));
        vocabItemList.add(new VocabItem("that (determiner)","eso",text.thatDeterminerDef,0));
        vocabItemList.add(new VocabItem("not","negador",text.notDef,0));
        vocabItemList.add(new VocabItem("n´t","negador contraido",text.nTDef,0));
        //30
        vocabItemList.add(new VocabItem("by","por",text.byDef,0));
        vocabItemList.add(new VocabItem("or","o",text.orDef,0));
        vocabItemList.add(new VocabItem("she","ella",text.sheDef,0));
        vocabItemList.add(new VocabItem("as(conjunction)","en lo que",text.asConjunctionDef,0));
        vocabItemList.add(new VocabItem("what(determiner)","que",text.whatDeterminerDef,0));
        vocabItemList.add(new VocabItem("go","ir",text.goDef,0));
        vocabItemList.add(new VocabItem("their","su de ellos",text.theirDef,0));
        vocabItemList.add(new VocabItem("will","modal para futuro",text.willDef,0));
        vocabItemList.add(new VocabItem("who","quien",text.whoDef,0));
        vocabItemList.add(new VocabItem("can","poder",text.canDef,0));
        //40
        vocabItemList.add(new VocabItem("get","obtener",text.getDef,0));
        vocabItemList.add(new VocabItem("if","si",text.ifDef,0));
        vocabItemList.add(new VocabItem("all","todo",text.allDef,0));
        vocabItemList.add(new VocabItem("would","modal hipotético",text.wouldDef,0));
        vocabItemList.add(new VocabItem("her","su de ella",text.herDef,0));
        vocabItemList.add(new VocabItem("make","hacer",text.makeDef,0));
        vocabItemList.add(new VocabItem("about","acerca de",text.aboutDef,0));
        vocabItemList.add(new VocabItem("my","mi-posesivo",text.myDef,0));
        vocabItemList.add(new VocabItem("know","saber-conocer",text.knowDef,0));
        vocabItemList.add(new VocabItem("as(preposition)","como",text.asPrepositionDef,0));


        //---------

        vocabItemList.add(new VocabItem("there", "ahí", text.thereDef, 0));
        vocabItemList.add(new VocabItem("one", "uno", text.oneDef, 0));
        vocabItemList.add(new VocabItem("up", "arriba", text.upDef, 0));
        vocabItemList.add(new VocabItem("time", "tiempo", text.timeDef, 0));
        vocabItemList.add(new VocabItem("year", "año", text.yearDef, 0));
        vocabItemList.add(new VocabItem("so", "tan-asi que", text.soDef, 0));
        vocabItemList.add(new VocabItem("think", "pensar", text.thinkDef, 0));
        vocabItemList.add(new VocabItem("see", "ver", text.seeDef, 0));
        vocabItemList.add(new VocabItem("which", "cual", text.whichDef, 0));
        vocabItemList.add(new VocabItem("when", "cuando", text.whenDef, 0));
        //60
        vocabItemList.add(new VocabItem("some", "unos-unas-algunos-algunas", text.someDef, 0));
        vocabItemList.add(new VocabItem("them", "ellos(como objeto)", text.themDef, 0));
        vocabItemList.add(new VocabItem("people", "gente", text.peopleDef, 0));
        vocabItemList.add(new VocabItem("take", "tomar", text.takeDef, 0));
        vocabItemList.add(new VocabItem("me", "mi", text.meDef, 0));
        vocabItemList.add(new VocabItem("out", "fuera", text.outDef, 0));
        vocabItemList.add(new VocabItem("into", "hacia dentro", text.intoDef, 0));
        vocabItemList.add(new VocabItem("just", "solo-apenas-no mas que-justo", text.justDef, 0));
        vocabItemList.add(new VocabItem("him", "él (como objeto)", text.himDef, 0));
        vocabItemList.add(new VocabItem("come", "venir", text.comeDef, 0));
        //70
        vocabItemList.add(new VocabItem("your", "tu -posesivo", text.yourDef, 0));
        vocabItemList.add(new VocabItem("now", "ahora", text.nowDef, 0));
        vocabItemList.add(new VocabItem("could", "podría-podía", text.couldDef, 0));
        vocabItemList.add(new VocabItem("than", "que(comparativo)", text.thanDef, 0));
        vocabItemList.add(new VocabItem("like", "como-(preposición)", text.likeDef, 0));
        vocabItemList.add(new VocabItem("other", "otro", text.otherDef, 0));
        vocabItemList.add(new VocabItem("then", "entonces", text.thenDef, 0));
        vocabItemList.add(new VocabItem("how", "como", text.howDef, 0));
        vocabItemList.add(new VocabItem("its", "su-de eso", text.itsDef, 0));
        vocabItemList.add(new VocabItem("two", "dos", text.twoDef, 0));

        //80
        vocabItemList.add(new VocabItem("our", "nuestro", text.ourDef, 0));
        vocabItemList.add(new VocabItem("more", "mas", text.moreDef, 0));
        vocabItemList.add(new VocabItem("these", "estos", text.theseDef, 0));
        vocabItemList.add(new VocabItem("want", "querer", text.wantDef, 0));
        vocabItemList.add(new VocabItem("way", "camino-forma", text.wayDef, 0));
        vocabItemList.add(new VocabItem("no", "(como adjetivo)-nada de-ningún", text.noDef, 0));
        vocabItemList.add(new VocabItem("look", "mirar", text.lookDef, 0));
        vocabItemList.add(new VocabItem("first", "primero-primer", text.firstDef, 0));
        vocabItemList.add(new VocabItem("also", "también", text.alsoDef, 0));
        vocabItemList.add(new VocabItem("new", "nuevo", text.newDef, 0));

        //90
        vocabItemList.add(new VocabItem("because", "porque", text.becauseDef, 0));
        vocabItemList.add(new VocabItem("day", "día", text.dayDef, 0));
        vocabItemList.add(new VocabItem("more", "determiner", text.moreDef, 0)); // Assuming "moreDeterminerDef" is defined for its use as a determiner
        vocabItemList.add(new VocabItem("use", "usar", text.useDef, 0));
        vocabItemList.add(new VocabItem("man", "hombre", text.manDef, 0));
        vocabItemList.add(new VocabItem("here", "aquí", text.hereDef, 0));
        vocabItemList.add(new VocabItem("find", "encontrar", text.findDef, 0)); // Corrected the spelling of "encontrar"
        vocabItemList.add(new VocabItem("give", "dar", text.giveDef, 0));
        vocabItemList.add(new VocabItem("thing", "cosa", text.thingDef, 0));
        vocabItemList.add(new VocabItem("well", "(adverbio) bien", text.wellDef, 0));

        //100
        vocabItemList.add(new VocabItem("many", "muchos", text.manyDef, 0));
        vocabItemList.add(new VocabItem("only", "sólo", text.onlyDef, 0));
        vocabItemList.add(new VocabItem("those", "esos", text.thoseDef, 0));
        vocabItemList.add(new VocabItem("tell", "decir", text.tellDef, 0));
        vocabItemList.add(new VocabItem("very", "muy", text.veryDef, 0));
        vocabItemList.add(new VocabItem("one", "uno", text.oneDef, 0));
        vocabItemList.add(new VocabItem("even", "incluso", text.evenDef, 0));
        vocabItemList.add(new VocabItem("her", "su de ella", text.herDef, 0));
        vocabItemList.add(new VocabItem("back", "espalda", text.backNounDef, 0)); // Assuming "backNounDef" for "espalda" as a noun. If needed as an adverb, replace with "backAdverbDef".
        vocabItemList.add(new VocabItem("any", "cualquier", text.anyDef, 0));


        //10
        vocabItemList.add(new VocabItem("good", "bueno", text.goodDef, 0));
        vocabItemList.add(new VocabItem("us", "nosotros", text.usDef, 0));
        vocabItemList.add(new VocabItem("through", "a través de", text.throughDef, 0));
        vocabItemList.add(new VocabItem("woman", "mujer", text.womanDef, 0));
        vocabItemList.add(new VocabItem("life", "vida", text.lifeDef, 0));
        vocabItemList.add(new VocabItem("child", "niño", text.childDef, 0));
        vocabItemList.add(new VocabItem("there", "allí", text.thereDef, 0));
        vocabItemList.add(new VocabItem("down", "abajo", text.downDef, 0));
        vocabItemList.add(new VocabItem("work", "trabajo", text.workNounDef, 0)); // Assuming "work" is requested as a noun here.
        vocabItemList.add(new VocabItem("after", "después", text.afterDef, 0));

        //20
        vocabItemList.add(new VocabItem("call", "llamar", text.callDef, 0));
        vocabItemList.add(new VocabItem("may", "poder", text.mayDef, 0));
        vocabItemList.add(new VocabItem("world", "mundo", text.worldDef, 0));
        vocabItemList.add(new VocabItem("over", "sobre", text.overDef, 0));
        vocabItemList.add(new VocabItem("should", "debería", text.shouldDef, 0));
        vocabItemList.add(new VocabItem("still", "todavía", text.stillDef, 0));
        vocabItemList.add(new VocabItem("try", "intentar", text.tryDef, 0));
        vocabItemList.add(new VocabItem("in", "en", text.inDef, 0));
        vocabItemList.add(new VocabItem("school", "escuela", text.schoolDef, 0));
        vocabItemList.add(new VocabItem("as", "como", text.asConjunctionDef, 0)); // Assuming "as" is requested as a conjunction here. If needed as a preposition or in another form, please adjust accordingly.


        //30

        vocabItemList.add(new VocabItem("last", "último", text.lastDef, 0));
        vocabItemList.add(new VocabItem("ask", "preguntar", text.askDef, 0));
        vocabItemList.add(new VocabItem("too", "también", text.tooDef, 0));
        vocabItemList.add(new VocabItem("need", "necesitar", text.needDef, 0));
        vocabItemList.add(new VocabItem("three", "tres", text.threeDef, 0));
        vocabItemList.add(new VocabItem("feel", "sentir", text.feelDef, 0));
        vocabItemList.add(new VocabItem("when", "cuando", text.whenDef, 0));
        vocabItemList.add(new VocabItem("become", "convertirse", text.becomeDef, 0));
        vocabItemList.add(new VocabItem("state", "estado", text.stateDef, 0));
        vocabItemList.add(new VocabItem("never", "nunca", text.neverDef, 0));


        //40

        vocabItemList.add(new VocabItem("between", "entre", text.betweenDef, 0));
        vocabItemList.add(new VocabItem("high", "alto", text.highDef, 0));
        vocabItemList.add(new VocabItem("something", "algo", text.somethingDef, 0));
        vocabItemList.add(new VocabItem("really", "realmente", text.reallyDef, 0));
        vocabItemList.add(new VocabItem("most", "la mayoría", text.mostDef, 0));
        vocabItemList.add(new VocabItem("another", "otro", text.anotherDef, 0));
        vocabItemList.add(new VocabItem("much", "mucho", text.muchDef, 0));
        vocabItemList.add(new VocabItem("own", "propio", text.ownDef, 0));
        vocabItemList.add(new VocabItem("family", "familia", text.familyDef, 0));
        vocabItemList.add(new VocabItem("out", "fuera", text.outDef, 0));


        // 50
        vocabItemList.add(new VocabItem("house", "casa", text.houseDef, 0));
        vocabItemList.add(new VocabItem("leave", "dejar", text.leaveDef, 0));
        vocabItemList.add(new VocabItem("put", "poner", text.putDef, 0));
        vocabItemList.add(new VocabItem("old", "viejo", text.oldDef, 0));
        vocabItemList.add(new VocabItem("on", "en", text.onAdverbDef, 0)); // Assuming "on" is requested as a preposition here. If needed as an adverb, please adjust accordingly.
        vocabItemList.add(new VocabItem("while", "mientras", text.whileConnectorDef, 0));
        vocabItemList.add(new VocabItem("mean", "significar", text.meanDef, 0));
        vocabItemList.add(new VocabItem("let", "dejar", text.letDef, 0));
        vocabItemList.add(new VocabItem("why", "por qué", text.whyDef, 0));
        vocabItemList.add(new VocabItem("president", "presidente", text.presidentDef, 0));



        vocabItemList.add(new VocabItem("keep", "mantener", text.keepDef, 0));
        vocabItemList.add(new VocabItem("same", "mismo", text.sameDef, 0));
        vocabItemList.add(new VocabItem("great", "gran", text.greatDef, 0));
        vocabItemList.add(new VocabItem("begin", "comenzar", text.beginDef, 0));
        vocabItemList.add(new VocabItem("big", "grande", text.bigDef, 0));
        vocabItemList.add(new VocabItem("seem", "parecer", text.seemDef, 0));
        vocabItemList.add(new VocabItem("group", "grupo", text.groupDef, 0));
        vocabItemList.add(new VocabItem("country", "país", text.countryDef, 0));
        vocabItemList.add(new VocabItem("talk", "hablar", text.talkDef, 0));
        vocabItemList.add(new VocabItem("problem", "problema", text.problemDef, 0));



        vocabItemList.add(new VocabItem("where", "dónde", text.whereDef, 0));
        vocabItemList.add(new VocabItem("turn", "girar", text.turnDef, 0));
        vocabItemList.add(new VocabItem("student", "estudiante", text.studentDef, 0));
        vocabItemList.add(new VocabItem("every", "cada", text.everyDef, 0));
        vocabItemList.add(new VocabItem("hand", "mano", text.handDef, 0));
        vocabItemList.add(new VocabItem("help", "ayudar", text.helpDef, 0));
        vocabItemList.add(new VocabItem("against", "contra", text.againstDef, 0));
        vocabItemList.add(new VocabItem("start", "empezar", text.startDef, 0));
        vocabItemList.add(new VocabItem("american", "americano", text.americanDef, 0));
        vocabItemList.add(new VocabItem("part", "parte", text.partDef, 0));

//....................................c
        vocabItemList.add(new VocabItem("show", "mostrar", text.showVerb, 0));
        vocabItemList.add(new VocabItem("about", "acerca de", text.aboutAdverb, 0));
        vocabItemList.add(new VocabItem("over", "sobre", text.overAdverb, 0));
        vocabItemList.add(new VocabItem("might", "podría", text.might, 0));
        vocabItemList.add(new VocabItem("such", "tal", text.suchDeterminer, 0));
        vocabItemList.add(new VocabItem("place", "lugar", text.placeNoun, 0));
        vocabItemList.add(new VocabItem("again", "otra vez", text.againAdverb, 0));
        vocabItemList.add(new VocabItem("city", "ciudad", text.city, 0));
        vocabItemList.add(new VocabItem("case", "caso", text.casedef, 0));
        vocabItemList.add(new VocabItem("most", "la mayoría", text.mostDeterminer, 0));
        vocabItemList.add(new VocabItem("few", "pocos", text.fewDeterminer, 0));
        vocabItemList.add(new VocabItem("system", "sistema", text.system, 0));
        vocabItemList.add(new VocabItem("week", "semana", text.week, 0));
        vocabItemList.add(new VocabItem("where", "semana", text.whereAdverb, 0));
        vocabItemList.add(new VocabItem("company", "empresa", text.company, 0));
        vocabItemList.add(new VocabItem("each", "cada uno", text.eachDeterminer, 0));
        vocabItemList.add(new VocabItem("percent", "porcentaje", text.percent, 0));
        vocabItemList.add(new VocabItem("hear", "escuchar", text.hear, 0));
        vocabItemList.add(new VocabItem("so", "así que", text.soConnector, 0));
        vocabItemList.add(new VocabItem("during", "durante", text.duringPreposition, 0)); // "during" is not typically used as an adjective, might need clarification.

        //
        vocabItemList.add(new VocabItem("question", "pregunta", text.questionNounDef, 0));
        vocabItemList.add(new VocabItem("right", "derecho", text.rightAdverbDef, 0));
        vocabItemList.add(new VocabItem("program", "programa", text.programNounDef, 0));
        vocabItemList.add(new VocabItem("work", "verbo-trabajo", text.workDef, 0));
        vocabItemList.add(new VocabItem("run", "correr", text.runVerbDef, 0));
        vocabItemList.add(new VocabItem("number", "número", text.numberDef, 0));
        vocabItemList.add(new VocabItem("small", "pequeño", text.smallDef, 0));
        vocabItemList.add(new VocabItem("government", "gobierno", text.governmentDef, 0));
        vocabItemList.add(new VocabItem("play", "jugar", text.playVerbDef, 0));
        vocabItemList.add(new VocabItem("off", "apagado", text.offAdverbDef, 0));

        vocabItemList.add(new VocabItem("move", "mover", text.moveVerbDef, 0));
        vocabItemList.add(new VocabItem("like", "gustar", text.likeVerbDef, 0));
        vocabItemList.add(new VocabItem("always", "siempre", text.alwaysAdverbDef, 0));
        vocabItemList.add(new VocabItem("night", "noche", text.nightDef, 0));
        vocabItemList.add(new VocabItem("believe", "creer", text.believeDef, 0));
        vocabItemList.add(new VocabItem("today", "hoy", text.todayDef, 0));
        vocabItemList.add(new VocabItem("hold", "sostener", text.holdDef, 0));
        vocabItemList.add(new VocabItem("point", "punto", text.pointNounDef, 0));
        vocabItemList.add(new VocabItem("live", "vivir", text.liveDef, 0));
        vocabItemList.add(new VocabItem("happen", "suceder", text.happenDef, 0));

        vocabItemList.add(new VocabItem("bring", "traer", text.bringDef, 0));
        vocabItemList.add(new VocabItem("next", "siguiente", text.nextAsANumberDef, 0));
        vocabItemList.add(new VocabItem("without", "sin", text.withoutDef, 0));
        vocabItemList.add(new VocabItem("before", "antes", text.beforePrepositionDef, 0));
        vocabItemList.add(new VocabItem("large", "grande", text.largeDef, 0));
        vocabItemList.add(new VocabItem("must", "deber", text.mustDef, 0));
        vocabItemList.add(new VocabItem("all", "todo", text.allAdverbDef, 0));
        vocabItemList.add(new VocabItem("war", "guerra", text.warNounDef, 0));
        vocabItemList.add(new VocabItem("home", "hogar", text.homeDef, 0));
        vocabItemList.add(new VocabItem("under", "debajo", text.underPrepositionDef, 0));


        //......................................................


        vocabItemList.add(new VocabItem("room", "habitación", text.roomDef, 0));
        vocabItemList.add(new VocabItem("fact", "hecho", text.factDef, 0));
        vocabItemList.add(new VocabItem("area", "área", text.areaDef, 0));
        vocabItemList.add(new VocabItem("national", "nacional", text.nationalDef, 0));
        vocabItemList.add(new VocabItem("write", "escribir", text.writeDef, 0));
        vocabItemList.add(new VocabItem("money", "dinero", text.moneyDef, 0));
        vocabItemList.add(new VocabItem("right", "correcto/derecho", text.rightAdverbDef, 0)); // Note: Adjust the definition variable as needed
        vocabItemList.add(new VocabItem("story", "historia", text.storyDef, 0));
        vocabItemList.add(new VocabItem("water", "agua", text.waterDef, 0));
        vocabItemList.add(new VocabItem("mother", "madre", text.motherDef, 0));


        vocabItemList.add(new VocabItem("different", "diferente", text.differentDef, 0));
        vocabItemList.add(new VocabItem("young", "joven", text.youngDef, 0));
        vocabItemList.add(new VocabItem("month", "mes", text.monthDef, 0));
        vocabItemList.add(new VocabItem("lot", "mucho", text.lotDef, 0));
        vocabItemList.add(new VocabItem("book", "libro", text.bookDef, 0));
        vocabItemList.add(new VocabItem("eye", "ojo", text.eyeDef, 0));
        vocabItemList.add(new VocabItem("study", "estudiar", text.studyDef, 0));
        vocabItemList.add(new VocabItem("job", "trabajo", text.jobDef, 0));
        vocabItemList.add(new VocabItem("kind", "tipo", text.kindDef, 0));
        vocabItemList.add(new VocabItem("word", "palabra", text.wordDef, 0));

        //250
        vocabItemList.add(new VocabItem("issue", "problema", text.issueDef, 0));
        vocabItemList.add(new VocabItem("side", "lado", text.sideDef, 0));
        vocabItemList.add(new VocabItem("four", "cuatro", text.fourDef, 0));
        vocabItemList.add(new VocabItem("business", "negocio", text.businessDef, 0));
        vocabItemList.add(new VocabItem("though", "aunque", text.thoughDef, 0));
        vocabItemList.add(new VocabItem("head", "cabeza", text.headNounDef, 0));
        vocabItemList.add(new VocabItem("far", "lejos", text.farDef, 0));
        vocabItemList.add(new VocabItem("long", "largo", text.longAdverbDef, 0));
        vocabItemList.add(new VocabItem("black", "negro", text.blackDef, 0));
        vocabItemList.add(new VocabItem("million", "millón", text.millionDef, 0));


        vocabItemList.add(new VocabItem("both", "ambos", text.bothDef, 0));
        vocabItemList.add(new VocabItem("little", "pequeño", text.littleDef, 0));
        vocabItemList.add(new VocabItem("yes", "sí", text.yesDef, 0));
        vocabItemList.add(new VocabItem("after", "después", text.afterDef, 0));
        vocabItemList.add(new VocabItem("since", "desde", text.sinceDef, 0));
        vocabItemList.add(new VocabItem("around", "alrededor", text.aroundPrepositionDef, 0));
        vocabItemList.add(new VocabItem("provide", "proveer", text.provideDef, 0));
        vocabItemList.add(new VocabItem("service", "servicio", text.serviceNounDef, 0));
        vocabItemList.add(new VocabItem("important", "importante", text.importantDef, 0));
        vocabItemList.add(new VocabItem("sit", "sentarse", text.sitDef, 0));


        vocabItemList.add(new VocabItem("away", "lejos", text.awayDef, 0));
        vocabItemList.add(new VocabItem("friend", "amigo", text.friendDef, 0));
        vocabItemList.add(new VocabItem("however", "sin embargo", text.howeverAdverbDef, 0));
        vocabItemList.add(new VocabItem("power", "poder", text.powerNounDef, 0));
        vocabItemList.add(new VocabItem("no", "no", text.noDef, 0));
        vocabItemList.add(new VocabItem("yet", "aún", text.yetDef, 0));
        vocabItemList.add(new VocabItem("father", "padre", text.fatherDef, 0));
        vocabItemList.add(new VocabItem("hour", "hora", text.hourDef, 0));
        vocabItemList.add(new VocabItem("often", "a menudo", text.oftenDef, 0));
        vocabItemList.add(new VocabItem("until", "hasta", text.untilDef, 0));


        vocabItemList.add(new VocabItem("political", "político", text.politicalDef, 0));
        vocabItemList.add(new VocabItem("line", "línea", text.lineDef, 0));
        vocabItemList.add(new VocabItem("end", "fin", text.endDef, 0));
        vocabItemList.add(new VocabItem("stand", "estar de pie", text.standVerbDef, 0));
        vocabItemList.add(new VocabItem("among", "entre", text.amongDef, 0));
        vocabItemList.add(new VocabItem("game", "juego", text.gameDef, 0));
        vocabItemList.add(new VocabItem("ever", "alguna vez", text.everDef, 0));
        vocabItemList.add(new VocabItem("lose", "perder", text.loseDef, 0));
        vocabItemList.add(new VocabItem("bad", "malo", text.badDef, 0));
        vocabItemList.add(new VocabItem("member", "miembro", text.memberDef, 0));


        vocabItemList.add(new VocabItem("meet", "conocer", text.meetDef, 0));
        vocabItemList.add(new VocabItem("pay", "pagar", text.payDef, 0));
        vocabItemList.add(new VocabItem("law", "ley", text.lawDef, 0));
        vocabItemList.add(new VocabItem("almost", "casi", text.almostDef, 0));
        vocabItemList.add(new VocabItem("car", "coche", text.carDef, 0));
        vocabItemList.add(new VocabItem("later", "más tarde", text.laterDef, 0));
        vocabItemList.add(new VocabItem("much", "mucho", text.muchDef, 0));
        vocabItemList.add(new VocabItem("name", "nombre", text.nameNounDef, 0));
        vocabItemList.add(new VocabItem("include", "incluir", text.includeDef, 0));


        //300
        vocabItemList.add(new VocabItem("five", "cinco", text.fiveDef, 0));
        vocabItemList.add(new VocabItem("center", "centro", text.centerDef, 0));
        vocabItemList.add(new VocabItem("once", "una vez", text.onceDef, 0));
        vocabItemList.add(new VocabItem("university", "universidad", text.universityDef, 0));
        vocabItemList.add(new VocabItem("continue", "continuar", text.continueDef, 0));
        vocabItemList.add(new VocabItem("least", "menos", text.leastDef, 0));
        vocabItemList.add(new VocabItem("real", "real", text.realDef, 0));
        vocabItemList.add(new VocabItem("white", "blanco", text.whiteDef, 0));
        vocabItemList.add(new VocabItem("change", "cambiar", text.changeDef, 0));
        vocabItemList.add(new VocabItem("set", "conjunto", text.setDef, 0));


        vocabItemList.add(new VocabItem("several", "varios", text.severalDef, 0));
        vocabItemList.add(new VocabItem("ago", "hace", text.agoDef, 0));
        vocabItemList.add(new VocabItem("information", "información", text.informationDef, 0));
        vocabItemList.add(new VocabItem("nothing", "nada", text.nothingDef, 0));
        vocabItemList.add(new VocabItem("community", "comunidad", text.communityDef, 0));
        vocabItemList.add(new VocabItem("best", "mejor", text.bestDef, 0));
        vocabItemList.add(new VocabItem("right", "derecho/correcto", text.rightAdjectiveDef, 0)); // Adjust based on context
        vocabItemList.add(new VocabItem("idea", "idea", text.ideaDef, 0));
        vocabItemList.add(new VocabItem("lead", "liderar", text.leadVerbDef, 0));
        vocabItemList.add(new VocabItem("body", "cuerpo", text.bodyDef, 0));


        vocabItemList.add(new VocabItem("learn", "aprender", text.learnDef, 0));
        vocabItemList.add(new VocabItem("kid", "niño", text.kidDef, 0));
        vocabItemList.add(new VocabItem("minute", "minuto", text.minuteDef, 0));
        vocabItemList.add(new VocabItem("table", "mesa", text.tableDef, 0));
        vocabItemList.add(new VocabItem("whether", "si (condicional)", text.whetherDef, 0));
        vocabItemList.add(new VocabItem("understand", "entender", text.understandDef, 0));
        vocabItemList.add(new VocabItem("team", "equipo", text.teamDef, 0));
        vocabItemList.add(new VocabItem("back", "espalda", text.backDef, 0)); // Include a note on dual meaning for context
        vocabItemList.add(new VocabItem("watch", "reloj/mirar", text.watchVerbDef, 0)); // Adjust according to context
        vocabItemList.add(new VocabItem("together", "juntos", text.togetherDef, 0));


        vocabItemList.add(new VocabItem("follow", "seguir", text.followDef, 0));
        vocabItemList.add(new VocabItem("around", "alrededor", text.aroundAdverbDef, 0)); // Note: "around" was included earlier. Adjust if needed.
        vocabItemList.add(new VocabItem("only", "solo", text.onlyDef, 0));
        vocabItemList.add(new VocabItem("stop", "parar", text.stopVerbDef, 0));
        vocabItemList.add(new VocabItem("face", "cara", text.faceNounDef, 0));
        vocabItemList.add(new VocabItem("anything", "cualquier cosa", text.anythingDef, 0));
        vocabItemList.add(new VocabItem("public", "público", text.publicAdjectiveDef, 0));
        vocabItemList.add(new VocabItem("social", "social", text.socialDef, 0));
        vocabItemList.add(new VocabItem("already", "ya", text.alreadyDef, 0));
        vocabItemList.add(new VocabItem("parent", "padre/madre", text.parentDef, 0));

        vocabItemList.add(new VocabItem("speak", "hablar", text.speakDef, 0));
        vocabItemList.add(new VocabItem("create", "crear", text.createDef, 0));
        vocabItemList.add(new VocabItem("office", "oficina", text.officeDef, 0));
        vocabItemList.add(new VocabItem("allow", "permitir", text.allowDef, 0));
        vocabItemList.add(new VocabItem("level", "nivel", text.levelDef, 0));
        vocabItemList.add(new VocabItem("read", "leer", text.readDef, 0));
        vocabItemList.add(new VocabItem("spend", "gastar", text.spendDef, 0));
        vocabItemList.add(new VocabItem("person", "persona", text.personDef, 0));
        vocabItemList.add(new VocabItem("door", "puerta", text.doorDef, 0));
        vocabItemList.add(new VocabItem("sure", "seguro", text.sureDef, 0));

        //350
        vocabItemList.add(new VocabItem("add", "añadir", text.addDef, 0));
        vocabItemList.add(new VocabItem("street", "calle", text.streetDef, 0));
        vocabItemList.add(new VocabItem("such", "tal", text.suchDef, 0));
        vocabItemList.add(new VocabItem("history", "historia", text.historyDef, 0));
        vocabItemList.add(new VocabItem("party", "fiesta/partido", text.partyDef, 0)); // Note: Adjust the definition to clarify the context (social event or political organization).
        vocabItemList.add(new VocabItem("grow", "crecer", text.growDef, 0));
        vocabItemList.add(new VocabItem("reason", "razón", text.reasonDef, 0));
        vocabItemList.add(new VocabItem("morning", "mañana", text.morningDef, 0));
        vocabItemList.add(new VocabItem("open", "abrir", text.openDef, 0));
        vocabItemList.add(new VocabItem("within", "dentro de", text.withinDef, 0));


        vocabItemList.add(new VocabItem("change", "cambiar", text.changeDef, 0)); // Noting that "change" was included previously. Adjust if this is a duplicate.
        vocabItemList.add(new VocabItem("although", "aunque", text.althoughDef, 0));
        vocabItemList.add(new VocabItem("walk", "caminar", text.walkVerbDef, 0));
        vocabItemList.add(new VocabItem("news", "noticias", text.newsDef, 0));
        vocabItemList.add(new VocabItem("health", "salud", text.healthDef, 0));
        vocabItemList.add(new VocabItem("court", "tribunal", text.courtNounDef, 0));
        vocabItemList.add(new VocabItem("force", "fuerza", text.forceNounDef, 0));
        vocabItemList.add(new VocabItem("early", "temprano", text.earlyDef, 0));
        vocabItemList.add(new VocabItem("himself", "él mismo", text.himselfDef, 0));
        vocabItemList.add(new VocabItem("air", "aire", text.airDef, 0));


        vocabItemList.add(new VocabItem("low", "bajo", text.lowDef, 0));
        vocabItemList.add(new VocabItem("before", "antes", text.beforeDef, 0)); // Noting "before" was included previously. Adjust if this is a duplicate.
        vocabItemList.add(new VocabItem("art", "arte", text.artDef, 0));
        vocabItemList.add(new VocabItem("result", "resultado", text.resultDef, 0));
        vocabItemList.add(new VocabItem("moment", "momento", text.momentDef, 0));
        vocabItemList.add(new VocabItem("offer", "ofrecer", text.offerDef, 0));
        vocabItemList.add(new VocabItem("both", "ambos", text.bothDef, 0)); // Note: "both" was included earlier. Adjust if needed.
        vocabItemList.add(new VocabItem("remember", "recordar", text.rememberDef, 0));
        vocabItemList.add(new VocabItem("research", "investigación", text.researchDef, 0));
        vocabItemList.add(new VocabItem("enough", "suficiente", text.enoughDef, 0));


        vocabItemList.add(new VocabItem("girl", "niña", text.girlDef, 0));
        vocabItemList.add(new VocabItem("boy", "niño", text.boyDef, 0));
        vocabItemList.add(new VocabItem("win", "ganar", text.winDef, 0));
        vocabItemList.add(new VocabItem("food", "comida", text.foodDef, 0));
        vocabItemList.add(new VocabItem("across", "a través de", text.acrossDef, 0));
        vocabItemList.add(new VocabItem("guy", "chico", text.guyDef, 0));
        vocabItemList.add(new VocabItem("second", "segundo", text.secondDef, 0));
        vocabItemList.add(new VocabItem("able", "capaz", text.ableDef, 0));
        vocabItemList.add(new VocabItem("toward", "hacia", text.towardDef, 0));
        vocabItemList.add(new VocabItem("maybe", "quizás", text.maybeDef, 0));


        vocabItemList.add(new VocabItem("process", "proceso", text.processDef, 0));
        vocabItemList.add(new VocabItem("off", "apagado/fuera", text.offPrepositionDef, 0)); // Noting "off" was included previously. Adjust if this is a duplicate or if additional context is provided.
        vocabItemList.add(new VocabItem("everything", "todo", text.everythingDef, 0));
        vocabItemList.add(new VocabItem("appear", "aparecer", text.appearDef, 0));
        vocabItemList.add(new VocabItem("age", "edad", text.ageDef, 0));
        vocabItemList.add(new VocabItem("policy", "política", text.policyDef, 0));
        vocabItemList.add(new VocabItem("consider", "considerar", text.considerDef, 0));
        vocabItemList.add(new VocabItem("including", "incluyendo", text.includingDef, 0));
        vocabItemList.add(new VocabItem("probably", "probablemente", text.probablyDef, 0));
        vocabItemList.add(new VocabItem("education", "educación", text.educationDef, 0));

        //401
        vocabItemList.add(new VocabItem("love", "amor", text.loveDef, 0));
        vocabItemList.add(new VocabItem("actually", "realmente", text.actuallyDef, 0));
        vocabItemList.add(new VocabItem("buy", "comprar", text.buyDef, 0));
        vocabItemList.add(new VocabItem("wait", "esperar", text.waitDef, 0));
        vocabItemList.add(new VocabItem("die", "morir", text.dieDef, 0));
        vocabItemList.add(new VocabItem("human", "humano", text.humanDef, 0));
        vocabItemList.add(new VocabItem("send", "enviar", text.sendDef, 0));
        vocabItemList.add(new VocabItem("fee", "tarifa", text.feeDef, 0));
        vocabItemList.add(new VocabItem("expect", "esperar", text.expectDef, 0)); // Note: "esperar" is shared with "wait", ensure context is clear.
        vocabItemList.add(new VocabItem("serve", "servir", text.serveDef, 0));


        vocabItemList.add(new VocabItem("sense", "sentido", text.senseNounDef, 0));
        vocabItemList.add(new VocabItem("teacher", "profesor", text.teacherDef, 0));
        vocabItemList.add(new VocabItem("home", "hogar", text.homeDef, 0)); // Noting "home" was included previously. Adjust if this is a duplicate.
        vocabItemList.add(new VocabItem("market", "mercado", text.marketDef, 0));
        vocabItemList.add(new VocabItem("stay", "quedarse", text.stayDef, 0));
        vocabItemList.add(new VocabItem("build", "construir", text.buildVerbDef, 0));
        vocabItemList.add(new VocabItem("nation", "nación", text.nationDef, 0));
        vocabItemList.add(new VocabItem("fall", "caer", text.fallVerbDef, 0));
        vocabItemList.add(new VocabItem("oh", "oh", text.ohDef, 0)); // May need context or specific use case for a definition.
        vocabItemList.add(new VocabItem("death", "muerte", text.deathDef, 0));


        vocabItemList.add(new VocabItem("plan", "plan", text.planNounDef, 0));
        vocabItemList.add(new VocabItem("interest", "interés", text.interestDef, 0));
        vocabItemList.add(new VocabItem("someone", "alguien", text.someoneDef, 0));
        vocabItemList.add(new VocabItem("experience", "experiencia", text.experienceNounDef, 0));
        vocabItemList.add(new VocabItem("cut", "cortar", text.cutDef, 0));
        vocabItemList.add(new VocabItem("kill", "matar", text.killVerbDef, 0));
        vocabItemList.add(new VocabItem("behind", "detrás", text.behindDef, 0));
        vocabItemList.add(new VocabItem("reach", "alcanzar", text.reachVerbDef, 0));
        vocabItemList.add(new VocabItem("six", "seis", text.sixDef, 0));
        vocabItemList.add(new VocabItem("local", "local", text.localDef, 0));


        vocabItemList.add(new VocabItem("remain", "permanecer", text.remainDef, 0));
        vocabItemList.add(new VocabItem("effect", "efecto", text.effectDef, 0));
        vocabItemList.add(new VocabItem("suggest", "sugerir", text.suggestDef, 0));
        vocabItemList.add(new VocabItem("use", "usar", text.useDef, 0));
        vocabItemList.add(new VocabItem("control", "controlar", text.controlNounDef, 0));
        vocabItemList.add(new VocabItem("perhaps", "quizás", text.perhapsDef, 0));
        vocabItemList.add(new VocabItem("raise", "levantar", text.raiseVerbDef, 0));
        vocabItemList.add(new VocabItem("class", "clase", text.classNounDef, 0));
        vocabItemList.add(new VocabItem("late", "tarde", text.lateDef, 0));
        vocabItemList.add(new VocabItem("little", "pequeño", text.littleDef, 0)); // Noting "little" was included previously. Adjust if this is a duplicate or if additional context is provided.


        vocabItemList.add(new VocabItem("major", "mayor", text.majorDef, 0));
        vocabItemList.add(new VocabItem("yeah", "sí", text.yeahDef, 0));
        vocabItemList.add(new VocabItem("else", "otro", text.elseAdverbDef, 0));
        vocabItemList.add(new VocabItem("pass", "pasar", text.passVerbDef, 0));
        vocabItemList.add(new VocabItem("photo", "foto", text.photoDef, 0));
        vocabItemList.add(new VocabItem("sell", "vender", text.sellVerbDef, 0));
        vocabItemList.add(new VocabItem("themselves", "ellos mismos", text.themselvesPronounDef, 0));
        vocabItemList.add(new VocabItem("field", "campo", text.fieldNounDef, 0));
        vocabItemList.add(new VocabItem("college", "colegio/universidad", text.collegeDef, 0));
        vocabItemList.add(new VocabItem("sometimes", "a veces", text.sometimesDef, 0));


        //450
        vocabItemList.add(new VocabItem("former", "anterior", text.formerDef, 0));
        vocabItemList.add(new VocabItem("development", "desarrollo", text.developmentDef, 0));
        vocabItemList.add(new VocabItem("require", "requerir", text.requireDef, 0));
        vocabItemList.add(new VocabItem("along", "a lo largo de", text.alongPrepositionDef, 0));
        vocabItemList.add(new VocabItem("decide", "decidir", text.decideDef, 0));
        vocabItemList.add(new VocabItem("security", "seguridad", text.securityDef, 0));
        vocabItemList.add(new VocabItem("up", "arriba", text.upDef, 0));
        vocabItemList.add(new VocabItem("possible", "posible", text.possibleDef, 0));
        vocabItemList.add(new VocabItem("effort", "esfuerzo", text.effortDef, 0));
        vocabItemList.add(new VocabItem("role", "rol", text.roleDef, 0));

        vocabItemList.add(new VocabItem("better", "mejor", text.betterAdjectiveDef, 0));
        vocabItemList.add(new VocabItem("rate", "tasa", text.rateDef, 0));
        vocabItemList.add(new VocabItem("strong", "fuerte", text.strongDef, 0));
        vocabItemList.add(new VocabItem("music", "música", text.musicDef, 0));
        vocabItemList.add(new VocabItem("report", "informe", text.reportNounDef, 0));
        vocabItemList.add(new VocabItem("leader", "líder", text.leaderDef, 0));
        vocabItemList.add(new VocabItem("light", "luz", text.lightDef, 0));
        vocabItemList.add(new VocabItem("whole", "todo", text.wholeDef, 0));
        vocabItemList.add(new VocabItem("voice", "voz", text.voiceDef, 0));

        vocabItemList.add(new VocabItem("color", "color", text.colorDef, 0));

        vocabItemList.add(new VocabItem("heart", "corazón", text.heartDef, 0));
        vocabItemList.add(new VocabItem("care", "cuidado", text.careNounDef, 0));
        vocabItemList.add(new VocabItem("police", "policía", text.policeDef, 0));
        vocabItemList.add(new VocabItem("economic", "económico", text.economicDef, 0));
        vocabItemList.add(new VocabItem("wife", "esposa", text.wifeNounDef, 0));
        vocabItemList.add(new VocabItem("show", "mostrar", text.showVerb, 0));
        vocabItemList.add(new VocabItem("mind", "mente", text.mindNounDef, 0));


        vocabItemList.add(new VocabItem("report", "reportar -verbo", text.reportVerbDef, 0));
        vocabItemList.add(new VocabItem("finally", "finalmente", text.finallyDef, 0));
        vocabItemList.add(new VocabItem("drug", "droga", text.drugNounDef, 0));
        vocabItemList.add(new VocabItem("less", "menos", text.lessDef, 0));
        vocabItemList.add(new VocabItem("return", "regresar", text.returnDef, 0));
        vocabItemList.add(new VocabItem("according", "según", text.accordingDef, 0));
        vocabItemList.add(new VocabItem("pull", "tirar", text.pullDef, 0));
        vocabItemList.add(new VocabItem("decision", "decisión", text.decisionDef, 0));
        vocabItemList.add(new VocabItem("explain", "explicar", text.explainDef, 0));
        vocabItemList.add(new VocabItem("carry", "llevar", text.carryDef, 0));
        vocabItemList.add(new VocabItem("develop", "desarrollar", text.developDef, 0));
        vocabItemList.add(new VocabItem("view", "vista", text.viewNounDef, 0));
        vocabItemList.add(new VocabItem("free", "gratis", text.freeAdjectiveDef, 0));


        vocabItemList.add(new VocabItem("hope", "tener esperanza", text.hopeVerbDef, 0));
        vocabItemList.add(new VocabItem("even", "incluso", text.even2Def, 0));
        vocabItemList.add(new VocabItem("drive", "conducir", text.driveDef, 0));
        vocabItemList.add(new VocabItem("son", "hijo", text.sonDef, 0));
        vocabItemList.add(new VocabItem("arm", "brazo", text.armDef, 0));
        vocabItemList.add(new VocabItem("department", "departamento", text.departmentDef, 0));
        vocabItemList.add(new VocabItem("true", "verdadero", text.trueDef, 0));
        vocabItemList.add(new VocabItem("price", "precio", text.priceDef, 0));
        vocabItemList.add(new VocabItem("military", "militar", text.militaryDef, 0));
        vocabItemList.add(new VocabItem("federal", "federal", text.federalDef, 0));

    }

    private void loadStructureItems(){
        texts text = new texts();
        vocabItemList.add(new VocabItem("Present Simple","Qué pasa?",text.simplePresentDefinition,0));
    }
    public void iniciarentradavoz() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US");
        speechRecognitionLauncher.launch(intent);
        try {
        } catch (ActivityNotFoundException e) {
        }

    }
    private void escribirEnelInputTextResultadodeUtterance() {
        speechRecognitionLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                        ArrayList<String> resultArray = result.getData().getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        if (resultArray != null && !resultArray.isEmpty()) {
                            String recognizedText = resultArray.get(0);

                            // Update the specific RecyclerView item
                            if (activeItemPosition != -1) {
                                VocabItem item = vocabItemList.get(activeItemPosition);
                                // Assuming you have a method or way to set the text in your VocabItem model
                                item.setUserInput(recognizedText); // This method needs to be added to your VocabItem class
                                vocabItemAdapter.notifyItemChanged(activeItemPosition);
                                activeItemPosition = -1;
                            }
                        }
                    }
                }
        );
    }



    @Override
    public void startSpeechRecognition(int position) {
        activeItemPosition = position; // Track the item that initiated speech recognition
        iniciarentradavoz(); // Start speech recognition
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save necessary state (e.g., vocabItemList or activeItemPosition)
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state
    }

}