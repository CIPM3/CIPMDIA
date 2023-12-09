package com.leal.cipm_testing;

import static com.leal.cipm_testing.R.drawable.ic_rect_ngulo_btncheck;

import androidx.appcompat.app.AppCompatActivity;
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
import java.util.Random;

public class Prueba extends AppCompatActivity {

    private ImageView imageView;
    private Button button, btn_1, btn_2, btn_3;
    private boolean isImage1 = true;
    Spinner spin;
    Prefs prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        Button button = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes cargar una nueva imagen aleatoria desde una URL y establecerla en el ImageView
                String[] imageUrls = {
                        "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/images%2FUtl6sWoJy0SebHTiGsYCaioR7qE3?alt=media&token=34e0bb3c-031c-4960-9f32-d318b237a6d6",
                        "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/images%2FUtl6sWoJy0SebHTiGsYCaioR7qE3?alt=media&token=34e0bb3c-031c-4960-9f32-d318b237a6d6",
                        "https://www.shutterstock.com/shutterstock/photos/1841895469/display_1500/stock-photo-starry-nights-in-the-high-tatras-with-a-tourist-in-a-tent-on-top-1841895469.jpg"
                };
                Random random = new Random();
                int index = random.nextInt(imageUrls.length);
                String imageUrl = imageUrls[index];
                Picasso.get().load(imageUrl).into(imageView);
            }
        });

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