package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ToeflSpeaking extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AudioItemAdapter audioItemAdapter;
    private List<AudioItem> audioItemList;
    private static final int MY_PERMISSIONS_RECORD_AUDIO = 1;

    String audioFilePath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toefl_speaking);


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, MY_PERMISSIONS_RECORD_AUDIO);
        }


        audioFilePath = Objects.requireNonNull(getExternalCacheDir()).getAbsolutePath();
        audioFilePath += "/audio.3gp";



        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Initialize your data list
        audioItemList = new ArrayList<>();
        // Populate the list with your data
        loadAudioItems();
        audioItemAdapter = new AudioItemAdapter(audioItemList);
        recyclerView.setAdapter(audioItemAdapter);
    }

    private void loadAudioItems() {
        texts text  = new texts();
        // Example items, replace with real data
        //test 1
        //speaking libre
        audioItemList.add(new AudioItem("Speaking Question 1 Test 1",text.speakingOpenQuestionPracticeTest1, false, "00:00", "",audioFilePath,0));
        //campus announcement
        audioItemList.add(new AudioItem("Speaking Question 2 Test 1",text.speakngintegratedquestion2test1, false, "00:00", "", audioFilePath,1,text.healthservicesurl));
        // text and lecture
        audioItemList.add(new AudioItem("Speaking Question 3 Test 1",text.socialLoafingtxt, false, "00:00", "", audioFilePath,1,text.socialLoafingUrl));
        //audio lecture
        audioItemList.add(new AudioItem("Speaking Question 4 Test 1","Listen to Instructions", false, "00:00", "", audioFilePath,3,text.testOneSpeakingQuestion4));
        //integrated writting
        audioItemList.add(new AudioItem("Integrated Writing 1 Test 1","Ve el video correspondiente en tu curso integrado de TOEFL","",2));
        //academic discussion 1
        audioItemList.add(new AudioItem("Academic Discussion test 1","Ve el video correspondiente en tu curso integrado de TOEFL","",2));

        // speaking libre test 2
        audioItemList.add(new AudioItem("Speaking Question 1 Test 2",text.speakingOpenQuestionPracticeTest2, false, "00:00", "",audioFilePath,0));
        // speaking campus discussion
        audioItemList.add(new AudioItem("Speaking Question 2 Test 2",text.speakingQuestion2Test2, false, "00:00", "", audioFilePath,1,text.speakingQuestion2url));
        // text and lecture
        audioItemList.add(new AudioItem("Speaking Question 3 Test 2",text.speakingQuestion3test2Txt, false, "00:00", "", audioFilePath,1,text.speakingQuestion3test2url));
        //audio lecture
        audioItemList.add(new AudioItem("Speaking Question 4 Test 2","Listen to Instructions", false, "00:00", "", audioFilePath,3,text.speakingQuestion4test2url));
        // integrated writing test 2
        audioItemList.add(new AudioItem("Integrated Writing 1 Test 2","Ve el video correspondiente en tu curso integrado de TOEFL","",2));
        //academic discussion test 2
        audioItemList.add(new AudioItem("Academic Discussion test 2","Ve el video correspondiente en tu curso integrado de TOEFL","",2));


        // speaking libre test 3
        audioItemList.add(new AudioItem("Speaking Question 1 Test 3",text.speakingQuestion1Test3, false, "00:00", "",audioFilePath,0));
        //campus announcement
        audioItemList.add(new AudioItem("Speaking Question 2 Test 3",text.hotBreakfastEliminated, false, "00:00", "", audioFilePath,1,text.getHotBreakfastEliminatedUrl));
        // lecture cognitive disonance tes 3
        audioItemList.add(new AudioItem("Speaking Question 3 Test 3",text.cognitiveDisonanceTxt, false, "00:00", "", audioFilePath,1,text.cognitiveDisonanceurl));
        // audio lecture
        audioItemList.add(new AudioItem("Speaking Question 4 Test 3","Listen to Instructions", false, "00:00", "", audioFilePath,3,text.speakingquestion4test3url));
        // integrated writing test 2
        audioItemList.add(new AudioItem("Integrated Writing 1 Test 3","Ve el video correspondiente en tu curso integrado de TOEFL","",2));
        //academic discussion test 2
        audioItemList.add(new AudioItem("Academic Discussion test 3","Ve el video correspondiente en tu curso integrado de TOEFL","",2));

        // speaking libre test 4
        audioItemList.add(new AudioItem("Speaking Question 1 Test 4",text.speakingquestion1test4, false, "00:00", "",audioFilePath,0));
        //campus announcement
        audioItemList.add(new AudioItem("Speaking Question 2 Test 4",text.question2test4txt, false, "00:00", "", audioFilePath,1,text.question2test4url));
        // lecture and audio
        audioItemList.add(new AudioItem("Speaking Question 3 Test 4",text.question3test4txt, false, "00:00", "", audioFilePath,1,text.question3test4url));
        //audio lecture
        audioItemList.add(new AudioItem("Speaking Question 4 Test 4","Listen to Instructions", false, "00:00", "", audioFilePath,3,text.question4test4url));
        // integrated writing test 2
        audioItemList.add(new AudioItem("Integrated Writing 1 Test 4","Ve el video correspondiente en tu curso integrado de TOEFL","",2));
        //academic discussion test 2
        audioItemList.add(new AudioItem("Academic Discussion test 4","Ve el video correspondiente en tu curso integrado de TOEFL","",2));



    }


    protected void onPause() {
        super.onPause();
        audioItemAdapter.stopAllAudioPlayback(); // Custom method to stop playback
    }
    MediaPlayer mediaPlayer = new MediaPlayer();
   /* void playAudio(String audioFilePath) {

        try {
            mediaPlayer.setDataSource(audioFilePath);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions
        }

        mediaPlayer.setOnCompletionListener(mp -> {
            mediaPlayer.release();
        });
    }*/

  /*  void playAudio(String audioFilePath) {
        try {
            mediaPlayer.reset(); // Reset the media player to its uninitialized state
            mediaPlayer.setDataSource(audioFilePath); // Set the data source (URL or file path)
            mediaPlayer.prepareAsync(); // Prepare the player asynchronously

            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start(); // Start playback once the media player is prepared
                }
            });

            mediaPlayer.setOnCompletionListener(mp -> {
                mediaPlayer.release(); // Release the media player once playback is complete
            });
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }*/
  void playAudio(String audioFilePath) {
      // Release the previous MediaPlayer, if it exists
      if (mediaPlayer != null) {
          if (mediaPlayer.isPlaying()) {
              mediaPlayer.stop();
          }
          mediaPlayer.release();
      }

      // Create a new MediaPlayer for each audio file
      mediaPlayer = new MediaPlayer();

      try {
          mediaPlayer.setDataSource(audioFilePath);
          mediaPlayer.prepareAsync();

          mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
              @Override
              public void onPrepared(MediaPlayer mp) {
                  mediaPlayer.start();
              }
          });

          mediaPlayer.setOnCompletionListener(mp -> {
              mediaPlayer.release();
              mediaPlayer = null; // Set mediaPlayer to null to avoid reuse
          });
      } catch (IOException e) {
          e.printStackTrace();
          // Handle exceptions
          if (mediaPlayer != null) {
              mediaPlayer.release();
              mediaPlayer = null;
          }
      }
  }


}