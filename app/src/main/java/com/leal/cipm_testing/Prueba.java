package com.leal.cipm_testing;

import static com.leal.cipm_testing.R.drawable.ic_btn_green;
import static com.leal.cipm_testing.R.drawable.ic_btn_red;
import static com.leal.cipm_testing.R.drawable.ic_rect_ngulo_btncheck;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
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


    String selection;
    Button play_audio;
    MediaPlayer mediaPlayer;
    List<String> audioUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);



        Bundle args = new Bundle();
        args.putString("tema", selection);

        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence4picture1true.mp3?alt=media&token=2250bf7b-e078-4c99-b1d7-dbeb981102bc");
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence1picture1true.mp3?alt=media&token=11595ece-2dca-4367-a15a-74182ab68735");
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence3picture1true.mp3?alt=media&token=02ab8dde-39e2-4548-9b88-05db42688d28");
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestAudio%2Fsentence2picture1false.mp3?alt=media&token=5bd849d6-4cbe-45e0-87e3-1b3be16d3167");

        play_audio.setOnClickListener(new View.OnClickListener() {
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


    //ALL
    String Contenido[][];
    String RespCorrecta;
    String ImageUrl;
    String AudioUrl;


    //FUNCION DE EMPEZAR EL TEST
    public void EmpezarAudios(){
        preguntasSeleccionada();

        Contenido = new String[][]{
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

        //Imagen
        // Obtén la URL de la imagen
        String imageUrl = Contenido[pregIndex][0];

        // Encuentra la referencia al ImageView
        ImageView imageView = findViewById(R.id.imageView);

        // Carga la imagen desde la URL utilizando Glide
        Picasso.get().load(imageUrl).into(imageView);

        //Audio
        AudioUrl = Contenido[pregIndex][1];

        //RESPUESTA CORRECTA
        RespCorrecta = Contenido[pregIndex][2];

        //OPCIONES
//        btn_1.setText(Contenido[pregIndex][3]);
//        btn_1.setText(Contenido[pregIndex][4]);
//        btn_1.setText(Contenido[pregIndex][5]);
//        btn_1.setText(Contenido[pregIndex][6]);
    }

    public void preguntasSeleccionada(){

    }

}