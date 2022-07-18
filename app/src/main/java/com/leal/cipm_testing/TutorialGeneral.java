package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

public class TutorialGeneral extends AppCompatActivity {
    VideoView vv;
    ImageButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_general);
        vv= findViewById(R.id.tutgen);
        b=  findViewById(R.id.tutgenbtn);
    }

    public void showvid(View view){
        b.setVisibility(View.INVISIBLE);
        Uri uri = Uri.parse("https://adrianlealcaldera.com/tutgen.mp4");
        vv.setVideoURI(uri);
        vv.setMediaController(new MediaController(this));
        vv.requestFocus();
        vv.start();

    }
}