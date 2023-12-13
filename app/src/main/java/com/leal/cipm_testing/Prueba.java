package com.leal.cipm_testing;

import static com.leal.cipm_testing.R.drawable.ic_btn_green;
import static com.leal.cipm_testing.R.drawable.ic_btn_red;
import static com.leal.cipm_testing.R.drawable.ic_rect_ngulo_btncheck;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

import org.checkerframework.checker.units.qual.C;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Prueba extends AppCompatActivity {

    private ImageView imageView;
    private Button button, btn_1, btn_2, btn_3, btn_4, soundBtn;
    private boolean isImage1 = true;
    String selection;
    TextView textspin1;
    Spinner spin;
    Prefs prefs;
    MediaPlayer mediaPlayer;
    List<String> audioUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        Button button = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView);
        soundBtn= findViewById(R.id.play_audio);
        mediaPlayer = new MediaPlayer();

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        textspin1 = (TextView) findViewById(R.id.textspin1);
        spin = (Spinner) findViewById(R.id.spinuno);

        Bundle args = new Bundle();
        args.putString("tema", selection);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes cargar una nueva imagen aleatoria desde una URL y establecerla en el ImageView
                String[] imageUrls = {
                        "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b"
                };
                Random random = new Random();
                int index = random.nextInt(imageUrls.length);
                String imageUrl = imageUrls[index];
                Picasso.get().load(imageUrl).into(imageView);
            }
        });

        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence4picture1true.mp3?alt=media&token=2250bf7b-e078-4c99-b1d7-dbeb981102bc");
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence1picture1true.mp3?alt=media&token=11595ece-2dca-4367-a15a-74182ab68735");
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence3picture1true.mp3?alt=media&token=02ab8dde-39e2-4548-9b88-05db42688d28");
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence2picture1false.mp3?alt=media&token=5bd849d6-4cbe-45e0-87e3-1b3be16d3167");

        soundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio(audioUrls);
            }
        });



    }
 /*   private void playAudio(String url) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
            }
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepareAsync(); // might take long for buffering, etc.
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }*/
 // Assuming mediaPlayer is a class member


    private void playAudio(List<String> urls) {
        AtomicInteger currentIndex = new AtomicInteger(0);

        // Helper method to play a single audio file
        MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                if (currentIndex.get() < urls.size()) {
                    playSingleAudio(urls.get(currentIndex.getAndIncrement()));
                }
            }
        };

        // Start playing the first audio file
        playSingleAudio(urls.get(currentIndex.getAndIncrement()));
        mediaPlayer.setOnCompletionListener(onCompletionListener);
    }

    // Separate method to handle playing of a single audio file
    private void playSingleAudio(String url) {
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        super.onDestroy();
    }

    //AVAILABILITY
    int pregIndex = 0;
    String preguntas []={};
    String Respuestas [][]={};
    String RespuestasCorrectas [][] = {};


    //ALL
    String Contenido[][];
    String RespCorrecta;
    String ImageUrl;
    String AudioUrl;


    //TOMA TODO EL ESPACIO PARA EL SPINNER
    public void activaSpinner1(View v){
        Spinner mySpinner = findViewById(R.id.spinuno);
        mySpinner.performClick();
    }

    //FUNCION DE EMPEZAR EL TEST
    public void startTest(){
        preguntasSeleccionada();

//        RespCorrecta = RespuestasCorrectas[pregIndex][0];
//
//        btn_1.setText(Respuestas[pregIndex][0]);
//        btn_1.setText(Respuestas[pregIndex][1]);
//        btn_1.setText(Respuestas[pregIndex][2]);
//        btn_1.setText(Respuestas[pregIndex][3]);

        //Imagen
        ImageUrl = Contenido[pregIndex][0];

        //Audio
        AudioUrl = Contenido[pregIndex][1];

        //RESPUESTA CORRECTA
        RespCorrecta = Contenido[pregIndex][2];

        //OPCIONES
        btn_1.setText(Contenido[pregIndex][3]);
        btn_1.setText(Contenido[pregIndex][4]);
        btn_1.setText(Contenido[pregIndex][5]);
        btn_1.setText(Contenido[pregIndex][6]);
    }

    //SELECCIONA LAS PREGUNTAS
    public void preguntasSeleccionada(){
        String pregSele[];
        String RespSele [][];
        String RespuestasCorrectasSele [][];

        switch (selection) {
            case "Extra":
                Contenido = new String[][]{
                        {
                                "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b",
                                "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b",
                                "respuesta 3",
                                "respuesta 1",
                                "respuesta 2",
                                "respuesta 3",
                                "respuesta 4",
                        }
                };

                break;
            case "Tutorial":
                Toast.makeText(this, "Por favor seleccione una actividad", Toast.LENGTH_SHORT).show();
                break;

            case "Trabajos":
                pregSele = new String[]{
                        "Pregunta Trabajos 1",
                        "Pregunta Trabajos 2",
                        "Pregunta Trabajos 3",
                        "Pregunta Trabajos 4",
                };

                RespSele = new String[][]{
                        {
                                "Respuesta Trabajos 1.1",
                                "Respuesta Trabajos 1.2",
                                "Respuesta Trabajos 1.3",
                                "Respuesta Trabajos 1.4"
                        },
                        {
                                "Respuesta Trabajos 2.1",
                                "Respuesta Trabajos 2.2",
                                "Respuesta Trabajos 2.3",
                                "Respuesta Trabajos 2.4"
                        },
                        {
                                "Respuesta Trabajos 3.1",
                                "Respuesta Trabajos 3.2",
                                "Respuesta Trabajos 3.3",
                                "Respuesta Trabajos 3.4"
                        },
                        {
                                "Respuesta Trabajos 4.1",
                                "Respuesta Trabajos 4.2",
                                "Respuesta Trabajos 4.3",
                                "Respuesta Trabajos 4.4"
                        },
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "Respuesta Trabajos 1.2"
                        },
                        {
                                "Respuesta Trabajos 2.3"
                        },
                        {
                                "Respuesta Trabajos 3.4"
                        },
                        {
                                "Respuesta Trabajos 4.1"
                        },
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "Deportes":
                pregSele = new String[]{
                        "Pregunta Deportes 1",
                        "Pregunta Deportes 2",
                        "Pregunta Deportes 3",
                        "Pregunta Deportes 4",
                };

                RespSele = new String[][]{
                        {
                                "Respuesta Deportes 1.1",
                                "Respuesta Deportes 1.2",
                                "Respuesta Deportes 1.3",
                                "Respuesta Deportes 1.4"
                        },
                        {
                                "Respuesta Deportes 2.1",
                                "Respuesta Deportes 2.2",
                                "Respuesta Deportes 2.3",
                                "Respuesta Deportes 2.4"
                        },
                        {
                                "Respuesta Deportes 3.1",
                                "Respuesta Deportes 3.2",
                                "Respuesta Deportes 3.3",
                                "Respuesta Deportes 3.4"
                        },
                        {
                                "Respuesta Deportes 4.1",
                                "Respuesta Deportes 4.2",
                                "Respuesta Deportes 4.3",
                                "Respuesta Deportes 4.4"
                        },
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "Respuesta Deportes 1.2"
                        },
                        {
                                "Respuesta Deportes 2.3"
                        },
                        {
                                "Respuesta Deportes 3.4"
                        },
                        {
                                "Respuesta Deportes 4.1"
                        },
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

            case "Paisajes":
                pregSele = new String[]{
                        "Pregunta Paisajes 1",
                        "Pregunta Paisajes 2",
                        "Pregunta Paisajes 3",
                        "Pregunta Paisajes 4",
                };

                RespSele = new String[][]{
                        {
                                "Respuesta Paisajes 1.1",
                                "Respuesta Paisajes 1.2",
                                "Respuesta Paisajes 1.3",
                                "Respuesta Paisajes 1.4"
                        },
                        {
                                "Respuesta Paisajes 2.1",
                                "Respuesta Paisajes 2.2",
                                "Respuesta Paisajes 2.3",
                                "Respuesta Paisajes 2.4"
                        },
                        {
                                "Respuesta Paisajes 3.1",
                                "Respuesta Paisajes 3.2",
                                "Respuesta Paisajes 3.3",
                                "Respuesta Paisajes 3.4"
                        },
                        {
                                "Respuesta Paisajes 4.1",
                                "Respuesta Paisajes 4.2",
                                "Respuesta Paisajes 4.3",
                                "Respuesta Paisajes 4.4"
                        },
                };

                RespuestasCorrectasSele = new String[][] {
                        {
                                "Respuesta Paisajes 1.2"
                        },
                        {
                                "Respuesta Paisajes 2.3"
                        },
                        {
                                "Respuesta Paisajes 3.4"
                        },
                        {
                                "Respuesta Paisajes 4.1"
                        },
                };

                preguntas = pregSele;
                Respuestas = RespSele;
                RespuestasCorrectas = RespuestasCorrectasSele;
                break;

        }
    }

    //ACCIONES DE BOTONES
    public void bloquearBtns(){
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
    }

    public void activarBtns(){
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
    }

    public void btn1(View v){

        String Resp1 = btn_1.getText().toString();

        if(Resp1.equals(RespCorrecta)){
            btn_1.setBackground(getDrawable(ic_btn_green));
            pregIndex ++;
        }else{
            btn_1.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;
        }

        btn_2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_3.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_4.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        bloquearBtns();
    };

    public void btn2(View v){

        String Resp2 = btn_2.getText().toString();

        if(Resp2.equals(RespCorrecta)){
            btn_2.setBackground(getDrawable(ic_btn_green));
            pregIndex ++;

        }else{
            btn_2.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;

        }

        btn_1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_3.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_4.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void btn3(View v){

        String Resp3 = btn_3.getText().toString();

        if(Resp3.equals(RespCorrecta)){
            btn_3.setBackground(getDrawable(ic_btn_green));
            pregIndex ++;

        }else{
            btn_3.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;

        }
        btn_1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_4.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void btn4(View v){

        String Resp4 = btn_4.getText().toString();

        if(Resp4.equals(RespCorrecta)){
            btn_4.setBackground(getDrawable(ic_btn_green));
            pregIndex ++;

        }else{
            btn_4.setBackground(getDrawable(ic_btn_red));
            pregIndex ++;

        }
        btn_1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_3.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void limpBtns(){
        btn_1.setBackgroundResource(ic_rect_ngulo_btncheck);
        btn_2.setBackgroundResource(ic_rect_ngulo_btncheck);
        btn_3.setBackgroundResource(ic_rect_ngulo_btncheck);
        btn_4.setBackgroundResource(ic_rect_ngulo_btncheck);
    }
}