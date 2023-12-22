package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AudioTest extends AppCompatActivity {

    ImageView imageView;

    LinearLayout lay_btn_empezar, lay_btns, lay_btn_sig, lay_audiobtn, lay_txt_rec, lay_txt_exp;

    Button btn_empezar, btn_sig, btn_1, btn_2, btn_3, btn_4, play_audio;

    MediaPlayer mediaPlayer;

    String [][] Contenido = new String[][]{
            //Architect
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FArchitects.png?alt=media&token=6e0a9bb1-30c4-4bf8-9c15-41f3d87219bc",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FArchitect%20-%20Completo.mp3?alt=media&token=6b4ed553-1fe3-4126-b898-20ccca8bef70",
                    //RESP CORRECT
                    "respuesta 4",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Baker
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FBaker.png?alt=media&token=3a29c2e9-b2d5-47fa-852f-9ccdfec65a8b",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FBaker%20-%20Completo.mp3?alt=media&token=20112559-d060-4d68-afd0-56c7bacc0436",
                    //RESP CORRECT
                    "respuesta 1",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Bank Teller
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FBank%20Teller.png?alt=media&token=ab542e70-c3aa-4bcd-8013-3816d1a94540",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FBank%20Teller%20-%20Completo.mp3?alt=media&token=614057eb-e290-4d1d-a6d1-a838e63d06af",
                    //RESP CORRECT
                    "respuesta 4",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Coffee Shop
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FCoffee%20Shop.png?alt=media&token=4929985e-a7ed-429f-90d0-759e54aae3a4",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FCoffee%20Shop%20-%20Completo.mp3?alt=media&token=807ecf8a-b8a9-4b52-8ed1-06e05f483f07",
                    //RESP CORRECT
                    "respuesta 4",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Dentist
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FDentist.png?alt=media&token=099331ed-1178-4819-a6b4-0a648a69aa0a",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FDentist%20-%20Completo.mp3?alt=media&token=18225dba-bdc7-4c07-8ebb-a2cb449b6f60",
                    //RESP CORRECT
                    "respuesta 2",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Meeting
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FMeeting.png?alt=media&token=8d20d40c-fbd4-40ad-877a-9ee8d01367cc",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FMeeting%20-%20Completo.mp3?alt=media&token=de43eb03-d1c3-451d-a476-2b414717ee4d",
                    //RESP CORRECT
                    "respuesta 1",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Supermarket
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FSupermarket.png?alt=media&token=969d9399-76f9-4c31-8a64-174d53eb8997",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FSupermarket%20-%20Completo.mp3?alt=media&token=3bb07850-b4fd-41cf-a491-c5c0d2f55f06",
                    //RESP CORRECT
                    "respuesta 3",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },

            //Technician
            {
                    //URL IMG
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2FTechnician.png?alt=media&token=3017b365-ef52-4d8e-832c-fdf67e42e502",
                    //URL AUD
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2FTechnician%20-%20Completo.mp3?alt=media&token=f17beb60-6300-45a4-bca1-5b0049ef1ee4",
                    //RESP CORRECT
                    "respuesta 4",
                    //BTN
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
            },
    };

    int pregIndex = 0;
    String ImageUrl = "";

    String RespuestaCorrecta = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_test);

        //DECLARACIONES
        imageView = findViewById(R.id.imageView);
        lay_btn_empezar = findViewById(R.id.lay_btn_empezar);
        btn_empezar = findViewById(R.id.btn_empezar);
        lay_btns = findViewById(R.id.lay_btns);
        lay_btn_sig = findViewById(R.id.lay_btn_sig);
        lay_audiobtn = findViewById(R.id.lay_audiobtn);
        play_audio = findViewById(R.id.play_audio);
        lay_txt_rec = findViewById(R.id.lay_txt_rec);
        lay_txt_exp = findViewById(R.id.lay_txt_exp);

        //BOTONES
        btn_sig = findViewById(R.id.btn_sig);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);


        btn_empezar.setOnClickListener(view -> {
            StartTest();
        });
    }

    public void StartTest(){
        activarBtns();
        AudioTest();
    }

    public void activarBtns(){
        //BTN EMPEZAR CERRADO
        lay_btn_empezar.setVisibility(View.GONE);

        //TXT & REC CERRADO
        lay_txt_rec.setVisibility(View.GONE);

        //TXT EXPLICACIÓN CERRADO
        lay_txt_exp.setVisibility(View.GONE);

        //BTN SIGUIENTE VISIBLE
        lay_btn_sig.setVisibility(View.VISIBLE);
        //LAY BTNS VISIBLE
        lay_btns.setVisibility(View.VISIBLE);
        //LAY AUDIO BTN VISIBLE
        lay_audiobtn.setVisibility(View.VISIBLE);
    }

    @SuppressLint("NotConstructor")
    public void AudioTest(){
        //Imagen
        // Obtén la URL de la imagen
        String imageUrl = Contenido[pregIndex][0];

        // Carga la imagen desde la URL utilizando Glide
        Picasso.get().load(imageUrl).into(imageView);

        //Audio
        String audioUrl = Contenido[pregIndex][1];


        //RESPUESTA CORRECTA
        RespuestaCorrecta = Contenido[pregIndex][2];

        //OPCIONES
        btn_1.setText(Contenido[pregIndex][3]);
        btn_2.setText(Contenido[pregIndex][4]);
        btn_3.setText(Contenido[pregIndex][5]);
        btn_4.setText(Contenido[pregIndex][6]);
    }

    public void btn1(View v){
        compararYCambiarColor(btn_1,"success","error",RespuestaCorrecta);
    }

    public void btn2(View v){
        compararYCambiarColor(btn_2,"success","error",RespuestaCorrecta);
    }

    public void btn3(View v){
        compararYCambiarColor(btn_3,"success","error",RespuestaCorrecta);
    }

    public void btn4(View v){
        compararYCambiarColor(btn_4,"success","error",RespuestaCorrecta);
    }

    private void compararYCambiarColor(Button button, String colorCorrecto, String colorIncorrecto, String respuestaCorrecta) {
        // Obtiene el texto actual del botón
        String textoBoton = button.getText().toString();

        // Obtiene los recursos de color por nombre
        int colorCorrectoInt = getResources().getColor(getResources().getIdentifier(colorCorrecto, "color", getPackageName()));
        int colorIncorrectoInt = getResources().getColor(getResources().getIdentifier(colorIncorrecto, "color", getPackageName()));

        // Compara el texto con la respuesta correcta
        if (textoBoton.equals(respuestaCorrecta)) {
            // Si es correcto, cambia el color de fondo al colorCorrecto
            button.setBackgroundColor(colorCorrectoInt);
            // Puedes agregar más lógica aquí si es necesario
            Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
        } else {
            // Si no es correcto, cambia el color de fondo al colorIncorrecto
            button.setBackgroundColor(colorIncorrectoInt);
            // Puedes agregar más lógica aquí si es necesario
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }

    private void cambiarDrawableBoton(Button button, int nuevoDrawable) {
        // Cambia el drawable del botón
        button.setBackgroundResource(nuevoDrawable);
    }

    public void limpBtns(View v){
        cambiarDrawableBoton(btn_1,R.drawable.ic_rect_ngulo_btncheck);
        cambiarDrawableBoton(btn_2,R.drawable.ic_rect_ngulo_btncheck);
        cambiarDrawableBoton(btn_3,R.drawable.ic_rect_ngulo_btncheck);
        cambiarDrawableBoton(btn_4,R.drawable.ic_rect_ngulo_btncheck);
    }

}


