package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class AudioTest extends AppCompatActivity {

    ImageView imageView;

    LinearLayout lay_btn_empezar,lay_btns,lay_btn_sig,lay_audiobtn;

    Button btn_empezar,btn_sig,btn_1,btn_2,btn_3,btn_4,play_audio;

    String [][] Contenido = new String[][]{
        {
            "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b",
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b",
                    "respuesta 3",
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
        },
        {
            "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b",
                    "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b",
                    "respuesta 1",
                    "respuesta 1",
                    "respuesta 2",
                    "respuesta 3",
                    "respuesta 4",
        }
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


