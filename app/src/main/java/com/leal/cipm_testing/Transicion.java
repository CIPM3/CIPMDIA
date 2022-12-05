package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Transicion extends AppCompatActivity {

    Button checkAnswer;
    ImageButton botonhablar;
    TextView spSentence,engSentence;
    EditText AnswerInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicion);
        spSentence=findViewById(R.id.sptrnstxt);
        engSentence=findViewById(R.id.engtrnstxt);
        checkAnswer=findViewById(R.id.checkanswertrnsbtn);
        botonhablar=findViewById(R.id.micbtntrns);
        AnswerInput=findViewById(R.id.answerinputtrns);

    }

    
}