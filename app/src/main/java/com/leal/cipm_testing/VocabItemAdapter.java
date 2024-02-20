package com.leal.cipm_testing;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;

public class VocabItemAdapter extends RecyclerView.Adapter<VocabItemAdapter.VocabItemViewHolder> {

    private List<VocabItem> vocabItems;
    private SpeechInitiator speechInitiator;
    TextToSpeech ttr;
    public VocabItemAdapter(List<VocabItem> vocabItems, SpeechInitiator speechInitiator) {


        this.vocabItems = vocabItems;
        this.speechInitiator = speechInitiator;
    }
    @NonNull
    @Override
    public VocabItemAdapter.VocabItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vocab_recycler_view, parent, false);
        return  new VocabItemAdapter.VocabItemViewHolder(view);
    }
    String globalAnswer,globalAnswer2;
    NewVerbClass object = new NewVerbClass();
    @Override
    public void onBindViewHolder(@NonNull VocabItemAdapter.VocabItemViewHolder holder, @SuppressLint("RecyclerView") int position)   {
        VocabItem item = vocabItems.get(position);
        cerotofifty gen = new cerotofifty();

        holder.checarRespBtn.setVisibility(View.GONE);
        holder.continuarBtn.setVisibility(View.GONE);
        holder.description.setVisibility(View.GONE);
        holder.ejemplostxt.setVisibility(View.GONE);
        holder.mic.setVisibility(View.GONE);
        holder.comoDirias.setVisibility(View.GONE);
        holder.respCorrecta.setVisibility(View.GONE);
        holder.definition.setVisibility(View.VISIBLE);
        holder.definition.setTypeface(null, Typeface.BOLD);
        holder.title.setText(String.valueOf(position)+"."+item.getTitle());
        holder.title.setPaintFlags(holder.title.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        // sets original colors of buttons
        holder.ejemplosBtn.setBackgroundResource(R.drawable.borde_azul);
        holder.ejemplosBtn.setTextColor(Color.BLUE);
        holder.practicaBtn.setTextColor(Color.BLUE);
        holder.practicaBtn.setBackgroundResource(R.drawable.borde_azul);
        holder.masInfoBtn.setTextColor(Color.BLUE);
        holder.masInfoBtn.setBackgroundResource(R.drawable.borde_azul);

        holder.definition.setText(item.getDefinition());

        holder.userInput.setText(item.getUserInput());
        holder.userInput.setVisibility(View.GONE);
        if(!holder.userInput.getText().toString().isEmpty()){
            holder.userInput.setVisibility(View.VISIBLE);
            holder.checarRespBtn.setVisibility(View.VISIBLE);
            holder.comoDirias.setVisibility(View.GONE);

        }
        //no se si vayamos a poner diferentes tipos de palabras
        switch (item.getType()){
            case 0:

                break;

            case 1:

                break;

            case 2:

                break;
        }

        holder.ejemplosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)   {
                // Change the button's background color to green.
                holder.ejemplosBtn.setBackgroundResource(R.drawable.ic_btn_small_blue);
                holder.ejemplosBtn.setTextColor(Color.WHITE);
                holder.ejemplostxt.setVisibility(View.VISIBLE);
                //set the examples
                String sp;

                cerotofifty gen = new cerotofifty();
                Generator gen1 = new Generator();
                Nobles n = new Nobles();
                sp="first value";
                switch (position) {
                    case 0:
                        // the
                        gen.artob(0);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 1:
                        // to be
                        gen.tobe();
                        sp=gen.gens+" - "+gen.gene;
                        break;
                    case 2:
                        //and
                        gen.advpronverb(4);
                        sp=gen.gens+" - "+gen.gene;
                        break;
                    case 3:
                        //of
                        gen.prepartob(0);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 4:
                        //a
                        gen.artoba();
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 5:
                        // in
                        gen.prepartob(1);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 6:
                        //to infinitive
                        gen1.GenInfinitives();
                        sp=gen1.ob + " - "+ gen1.eng;
                        break;
                    case 7:
                        //have
                        int pos = (int) (Math.random() * 6);
                        n.GenPresSimp(pos,0);
                        sp=n.gens+" - "+n.gene;
                        break;
                    case 8:
                        //to preposition
                        gen.prepartob(2);
                        sp=gen.ob + " - "+ gen.eng;

                        break;
                    case 9:
                        //it
                        gen.pronverb("eso ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 10:
                        //i
                        gen.pronverb("yo ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 11:
                        // that para conectar
                        int r = (int) (Math.random() * 2);
                        n.GenRelativeClauses1(r);
                        sp=n.gens+" - "+n.gene;
                        break;
                    case 12:
                        //for como prep
                        gen.prepartob(3);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 13:
                        //you
                        gen.pronverb("tú ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 14:
                        //he
                        gen.pronverb("él ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 15:
                        //with
                        gen.prepartob(4);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 16:
                        //on
                        gen.prepartob(5);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 17:
                        // do
                        gen.pronverb(4);
                        sp=gen.gens + " - "+ gen.gene;

                        break;
                    case 18:
                        //apostrofe s
                        n.apostropheS();
                        sp = n.gens+" - "+n.gene;
                        break;
                    case 19:
                        //say
                        gen.pronverb(1);
                        sp=gen.gens + " - "+ gen.gene;
                        break;
                    case 20:
                        //they
                        gen.pronverb("ellos ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 21:
                        //this
                        gen.adjmethod("this ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 22:
                        //but
                        gen.advpronverb(3);
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 23:
                        //at
                        gen.atmeth(8);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 24:
                        //we
                        gen.pronverb("nosotros ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 25:
                        //his
                        gen.adjmethod("his ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 26:
                        //from
                        gen.atmeth(6);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 27:
                        //that determiner
                        gen.adjmethod("that ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 28:
                        //not
                        gen.not();
                        sp= gen.eng;
                        break;
                    case 29:
                        //n t
                        gen.nt();
                        sp= gen.eng;
                        break;
                    case 30:
                        //by
                        gen.atmeth(9);
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 31:
                        //or
                        gen.or();
                        sp=gen.ob + " - "+ gen.eng;
                        break;
                    case 32:
                        //she
                        gen.pronverb("ella ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 33:
                        //as conjunction
                        Nobles n1 = new Nobles();
                        int pos1 = (int) (Math.random() * 6);
                        n1.GenPresSimpAs(pos1);
                        sp=n1.gens + " - "+ n1.gene;
                        break;
                    case 34:
                        //what determiner
                        Nobles n2 = new Nobles();
                        int pos2 = (int) (Math.random() * 6);
                        n2.GenPresSimpWhat(pos2);
                        sp=n2.gens + " - "+ n2.gene;
                        break;
                    case 35:
                        //go
                        gen.pronverb(2);
                        sp = gen.gens+ " - "+gen.gene;
                        break;
                    case 36:
                        //their
                        gen.adjmethod("their ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 37:
                        //will
                        gen.pronverbwill();
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 38:
                        //who
                        gen.genWho();
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 39:
                        //can
                        gen.pronverbcan();
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 40:
                        //get
                        gen.pronverb(3);
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 41:
                        //if
                        gen.pronverbif();
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 42:
                        //all
                        gen.all();
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 43:
                        //would
                        gen.pronverbwould();
                        sp= gen.gens+" - "+gen.gene;
                        break;
                    case 44:
                        //her
                        gen.adjmethod("her ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 45:
                        //make
                        gen.make();
                        sp= gen.gens+" - "+gen.gene;

                        break;
                    case 46:
                        //about
                        gen.prepartob(7);
                        sp  = gen.ob+" - "+gen.eng;
                        break;
                    case 47:
                        //my
                        gen.adjmethod("my ");
                        sp= gen.gens+"- "+gen.gene;
                        break;
                    case 48:
                        //know
                        gen.pronverb(5);
                        sp= gen.gens+"- "+gen.gene;

                        break;
                    case 49:
                        //as preposition
                        gen.as();
                        sp= gen.gens+"- "+gen.gene;
                        break;

                    case 50:
                        // Code for case 50
                        object.GenPresSimp();
                        sp= object.gens+"- "+  object.gene;
                        break;
                    case 51:
                        // there for existence
                        break;
                    case 52:
                        // Code for case 52
                        break;
                    case 53:
                        // Code for case 53
                        break;
                    case 54:
                        // Code for case 54
                        break;
                    case 55:
                        // Code for case 55
                        break;
                    case 56:
                        // Code for case 56
                        break;
                    case 57:
                        // Code for case 57
                        break;
                    case 58:
                        // Code for case 58
                        break;
                    case 59:
                        // Code for case 59
                        break;
                    case 60:
                        // Code for case 60
                        break;
                    case 61:
                        // Code for case 61
                        break;
                    case 62:
                        // Code for case 62
                        break;
                    case 63:
                        // Code for case 63
                        break;
                    case 64:
                        // Code for case 64
                        break;
                    case 65:
                        // Code for case 65
                        break;
                    case 66:
                        // Code for case 66
                        break;
                    case 67:
                        // Code for case 67
                        break;
                    case 68:
                        // Code for case 68
                        break;
                    case 69:
                        // Code for case 69
                        break;
                    case 70:
                        // Code for case 70
                        break;
                    case 71:
                        // Code for case 71
                        break;
                    case 72:
                        // Code for case 72
                        break;
                    case 73:
                        // Code for case 73
                        break;
                    case 74:
                        // Code for case 74
                        break;
                    case 75:
                        // Code for case 75
                        break;
                    case 76:
                        // Code for case 76
                        break;
                    case 77:
                        // Code for case 77
                        break;
                    case 78:
                        // Code for case 78
                        break;
                    case 79:
                        // Code for case 79
                        break;
                    case 80:
                        // Code for case 80
                        break;
                    case 81:
                        // Code for case 81
                        break;
                    case 82:
                        // Code for case 82
                        break;
                    case 83:
                        // Code for case 83
                        break;
                    case 84:
                        // Code for case 84
                        break;
                    case 85:
                        // Code for case 85
                        break;
                    case 86:
                        // Code for case 86
                        break;
                    case 87:
                        // Code for case 87
                        break;
                    case 88:
                        // Code for case 88
                        break;
                    case 89:
                        // Code for case 89
                        break;
                    case 90:
                        // Code for case 90
                        break;
                    case 91:
                        // Code for case 91
                        break;
                    case 92:
                        // Code for case 92
                        break;
                    case 93:
                        // Code for case 93
                        break;
                    case 94:
                        // Code for case 94
                        break;
                    case 95:
                        // Code for case 95
                        break;
                    case 96:
                        // Code for case 96
                        break;
                    case 97:
                        // Code for case 97
                        break;
                    case 98:
                        // Code for case 98
                        break;
                    case 99:
                        // Code for case 99
                        break;
                    case 100:
                        // Code for case 100
                        break;

                    default:
                        sp= "no value";
                        break;
                }






                holder.ejemplostxt.setText(sp);

                //set views to original state
                holder.masInfoBtn.setTextColor(Color.BLUE);
                holder.masInfoBtn.setBackgroundResource(R.drawable.borde_azul);
                holder.description.setVisibility(View.GONE);

                holder.practicaBtn.setTextColor(Color.BLUE);
                holder.practicaBtn.setBackgroundResource(R.drawable.borde_azul);

                holder.continuarBtn.setVisibility(View.GONE);
                holder.comoDirias.setVisibility(View.GONE);
                holder.userInput.setVisibility(View.GONE);
                holder.mic.setVisibility(View.GONE);
                holder.checarRespBtn.setVisibility(View.GONE);
                holder.respCorrecta.setVisibility(View.GONE);

            }
        });
        holder.practicaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set views for practice
                holder.practicaBtn.setBackgroundResource(R.drawable.ic_btn_small_blue);
                holder.practicaBtn.setTextColor(Color.WHITE);
                holder.comoDirias.setVisibility(View.VISIBLE);
                holder.userInput.setVisibility(View.INVISIBLE);
                holder.placeholder.setVisibility(View.INVISIBLE);
                holder.mic.setVisibility(View.VISIBLE);
                holder.checarRespBtn.setVisibility(View.GONE);
                if(!holder.userInput.getText().toString().isEmpty()){
                    holder.userInput.setText("");
                }

                String sp;
                sp="";
                switch (position){
                    case 0:
                        //the
                        gen.artob();

                        break;
                    case 1:
                        //be
                        gen.tobe();

                        break;

                }

                if(gen.ob==null){
                    sp = gen.gens ;
                    globalAnswer2=gen.gene;
                }else {
                    sp = gen.ob;
                    globalAnswer=gen.eng;
                }
                holder.comoDirias.setText(sp);
                sayThis(v,"como dirías " +sp,new Locale("es", "MX"));


                // set views back
                holder.masInfoBtn.setTextColor(Color.BLUE);
                holder.masInfoBtn.setBackgroundResource(R.drawable.borde_azul);
                holder.ejemplosBtn.setTextColor(Color.BLUE);
                holder.ejemplosBtn.setBackgroundResource(R.drawable.borde_azul);
                holder.description.setVisibility(View.GONE);
                holder.ejemplostxt.setVisibility(View.GONE);
                holder.continuarBtn.setVisibility(View.GONE);

            }
        });
        holder.continuarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.continuarBtn.setVisibility(View.GONE);
                holder.respCorrecta.setVisibility(View.GONE);
                holder.mic.setVisibility(View.VISIBLE);
                holder.comoDirias.setVisibility(View.VISIBLE);
                holder.userInput.setVisibility(View.INVISIBLE);
                holder.placeholder.setVisibility(View.INVISIBLE);
                if(!holder.userInput.getText().toString().isEmpty()){
                    holder.userInput.setText("");
                }
                String sp;
                sp="";

                switch (position){
                    case 0:
                        //the
                        gen.artob();

                        break;
                    case 1:
                        //be
                        gen.tobe();

                        break;

                }

                if(gen.ob==null){
                    sp = gen.gens ;
                    globalAnswer2=gen.gene;
                }else {
                    sp = gen.ob;
                    globalAnswer=gen.eng;
                }

                holder.comoDirias.setText(sp);
                sayThis(v,"como dirías " +sp,new Locale("es", "MX"));
                holder.userInput.setText("");



            }
        });


        holder.masInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.masInfoBtn.setBackgroundResource(R.drawable.ic_btn_small_blue);
                holder.masInfoBtn.setTextColor(Color.WHITE);
                holder.description.setVisibility(View.VISIBLE);
                holder.description.setText(item.getDescription());
                //set the other views back
                holder.ejemplosBtn.setTextColor(Color.BLUE);
                holder.ejemplosBtn.setBackgroundResource(R.drawable.borde_azul);
                holder.practicaBtn.setTextColor(Color.BLUE);
                holder.practicaBtn.setBackgroundResource(R.drawable.borde_azul);
                holder.ejemplostxt.setVisibility(View.GONE);
                holder.continuarBtn.setVisibility(View.GONE);
                holder.comoDirias.setVisibility(View.GONE);
                holder.userInput.setVisibility(View.GONE);
                holder.mic.setVisibility(View.GONE);
                holder.checarRespBtn.setVisibility(View.GONE);




            }
        });
        holder.mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.checarRespBtn.setVisibility(View.VISIBLE);
                holder.userInput.setVisibility(View.VISIBLE);
                holder.placeholder.setVisibility(View.GONE);
                holder.userInput.setTextColor(Color.WHITE);

                if (speechInitiator != null) {
                    speechInitiator.startSpeechRecognition(holder.getAdapterPosition());
                   // holder.userInput.setText(item.getUserInput());
                }


            }
        });
        holder.checarRespBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.checarRespBtn.setVisibility(View.GONE);
                holder.respCorrecta.setVisibility(View.VISIBLE);
                holder.continuarBtn.setVisibility(View.VISIBLE);

                    if(globalAnswer== null){
                        globalAnswer=" ";
                    }
                if(globalAnswer2== null){
                    globalAnswer=" ";
                }
                    if(holder.userInput.getText().toString().equals(globalAnswer.trim())||holder.userInput.getText().toString().equals(globalAnswer2.trim())){
                        holder.respCorrecta.setText("La respuesta es correcta!");
                        holder.userInput.setTextColor(Color.GREEN);

                    }else {
                        holder.respCorrecta.setText("La respuesta correcta es: "+globalAnswer);
                        holder.userInput.setTextColor(Color.RED);
                    }





                   // holder.userInput.setText("");

            }
        });
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = holder.title.getText().toString();
// Remove the numeric prefix and the dot following it
                word = word.replaceFirst("^[0-9]+\\.", "").trim();
// Now 'word' contains the string without the numeric prefix and dot

                sayThis(v, word,Locale.ENGLISH);

            }
        });

    }

    private void sayThis(View v, String thingToSay, Locale language) {
        ttr = new TextToSpeech(v.getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    // Set the language based on the method parameter
                    int result = ttr.setLanguage(language);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TextToSpeech", "Language not supported or data missing");
                    } else {
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {
                                // Called when the speech starts
                            }

                            @Override
                            public void onDone(String utteranceId) {
                                // Called when the speech is done
                            }

                            @Override
                            public void onError(String s) {
                                // Called on an error during the speech
                            }
                        });
                        ttr.speak(thingToSay, TextToSpeech.QUEUE_ADD, null, "string");
                    }
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return vocabItems.size();
    }
    public static class VocabItemViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView definition;
        TextView description;
        TextView comoDirias;
        TextView respCorrecta;
        TextView ejemplostxt;
        Button masInfoBtn,practicaBtn,ejemplosBtn,continuarBtn,checarRespBtn;
        EditText userInput,placeholder;
        ImageButton mic;

        public VocabItemViewHolder(@NonNull View view) {
            super(view);
            title = view.findViewById(R.id.textViewWord);
            definition= view.findViewById(R.id.textViewTranslation);
            ejemplostxt= view.findViewById(R.id.textViewTranslation2);
            description= view.findViewById(R.id.descriptiondelapalabra);
            comoDirias=view.findViewById(R.id.comodiriasbla);
            respCorrecta=view.findViewById(R.id.resultadotext);
            masInfoBtn= view.findViewById(R.id.masinfo);
            practicaBtn=view.findViewById(R.id.buttonPractice);
            ejemplosBtn=view.findViewById(R.id.buttonExamples);
            continuarBtn=view.findViewById(R.id.buttonContinue);
            checarRespBtn=view.findViewById(R.id.buttonCheckAnswer);
            userInput=view.findViewById(R.id.editTextInput);
            placeholder=view.findViewById(R.id.editTextInput2);
            mic= view.findViewById(R.id.imageButtonSubmit);



        }
    }

    public interface SpeechInitiator {
        void startSpeechRecognition(int position);
    }
    private String determineSp(cerotofifty gen, Generator gen1, Nobles n) {
        if (n.gens != null) {
            return n.gens + " - " + n.gene;
        } else if (gen1.ob != null) {
            return gen1.ob + " - " + gen1.eng;
        } else if (gen.ob != null) {
            return gen.ob + " - " + gen.eng;
        } else if (gen.gens != null) {
            return gen.gens + " - " + gen.gene;
        } else {
            return "Default Value - Default Value"; // Or any other default you'd like
        }
    }




}
