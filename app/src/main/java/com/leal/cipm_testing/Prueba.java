package com.leal.cipm_testing;

import static com.leal.cipm_testing.R.drawable.ic_rect_ngulo_btncheck;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Prueba extends AppCompatActivity {

    private ImageView imageView;
    private Button button, btn_1, btn_2, btn_3,soundBtn;
    private boolean isImage1 = true;
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
        audioUrls.add("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeicTestImages%2Fofficefoodmeeting.png?alt=media&token=4978382d-c732-4a89-a1cb-181690a1384b");
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
    int pregCorrect = 0;

    String preguntas []={};
    String Respuestas [][]={};
    String RespuestasCorrectas [][] = {};
    String RespCorrecta;

    //FUNCION DE EMPEZAR EL TEST

    public void bloquearBtns(){
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
    }

    public void activarBtns(){
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
    }

    public void btn1(View v){

        String Resp1 = btn_1.getText().toString();
        if(Resp1.equals(RespCorrecta)){
            btn_1.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;
        }else{
            btn_1.setBackgroundColor(getResources().getColor(R.color.rojo));
            pregIndex ++;
        }

        btn_2.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_3.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        bloquearBtns();
    };

    public void btn2(View v){

        String Resp2 = btn_2.getText().toString();

        if(Resp2.equals(RespCorrecta)){
            btn_2.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;

        }else{
            btn_2.setBackgroundColor(getResources().getColor(R.color.rojo));
            pregIndex ++;

        }

        btn_1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_3.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void btn3(View v){

        String Resp3 = btn_3.getText().toString();

        if(Resp3.equals(RespCorrecta)){
            btn_3.setBackgroundColor(getResources().getColor(R.color.success));
            pregCorrect ++;
            pregIndex ++;

        }else{
            btn_3.setBackgroundColor(getResources().getColor(R.color.rojo));
            pregIndex ++;

        }
        btn_1.setBackground(getDrawable(ic_rect_ngulo_btncheck));
        btn_2.setBackground(getDrawable(ic_rect_ngulo_btncheck));

        bloquearBtns();
    }

    public void limpBtns(){
        btn_1.setBackgroundResource(ic_rect_ngulo_btncheck);
        btn_2.setBackgroundResource(ic_rect_ngulo_btncheck);
        btn_3.setBackgroundResource(ic_rect_ngulo_btncheck);
    }

    private void openDialog(String s) {
        Dialog d = new Dialog(s);
        d.show(getSupportFragmentManager(), "");

    }
}