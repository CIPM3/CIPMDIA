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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ToeflSpeaking extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AudioItemAdapter audioItemAdapter;
    private List<AudioItem> audioItemList;
    private static final int MY_PERMISSIONS_RECORD_AUDIO = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toefl_speaking);


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, MY_PERMISSIONS_RECORD_AUDIO);
        }


        audioFilePath = Objects.requireNonNull(getExternalCacheDir()).getAbsolutePath();
        audioFilePath += "/audio.3gp";

       // audioRecorder = new AudioRecorder(audioFilePath);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Initialize your data list
        audioItemList = new ArrayList<>();
        // Populate the list with your data
        loadAudioItems();

        audioItemAdapter = new AudioItemAdapter(audioItemList);
        recyclerView.setAdapter(audioItemAdapter);
    }
    String audioFilePath;
    private void loadAudioItems() {
        // Example items, replace with real data
        audioItemList.add(new AudioItem("Some people who unexpectedly receive a large amount of money spend it on practical things, while others spend it for pleasure only.which do you think is better and why", false, "00:00", "Feedback 1",audioFilePath,0));
        audioItemList.add(new AudioItem("Describe your favorite movie or TV show and explain why you recommend it to others.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("Describe a teacher who has influenced you and explain why their influence was important.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("If you could visit any country in the world, where would you go and why?", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("Explain a hobby or activity you enjoy and why it is important to you.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("Discuss a challenge you have faced and how you overcame it.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("Describe your favorite movie or TV show and explain why you recommend it to others.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("If you could change one aspect of your hometown, what would it be and why?", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("Talk about a memorable event from your childhood and explain why it stands out to you.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("Describe an achievement you are proud of and explain why it is significant to you.", false, "00:00", "", audioFilePath,0));
        audioItemList.add(new AudioItem("You know, everybody wants to be happy, so why isn’t everybody happy? The obvious answer is, it’s not easy. And one of the single biggest obstacles to being happy is that people naturally compare themselves to other people and assume nearly all of them are happier than they are. This is a big problem. So, how would like an equation to determine the exact amount of unhappiness in your life?", false, "00:00", "", audioFilePath,1,"https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/ToeflListening%2FPractice_001.mp3?alt=media&token=a0503417-07eb-4335-9026-1cab828cfa2e"));


        // Add as many items as needed
    }

    protected void onPause() {
        super.onPause();
        audioItemAdapter.stopAllAudioPlayback(); // Custom method to stop playback
    }
    MediaPlayer mediaPlayer = new MediaPlayer();
    void playAudio(String audioFilePath) {

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
    }


}