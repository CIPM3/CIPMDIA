package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

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
        audioItemList.add(new AudioItem("Question 1", false, "00:00", "Feedback 1",audioFilePath));
        audioItemList.add(new AudioItem("Question 2", false, "00:00", "Feedback 2",audioFilePath));

        // Add as many items as needed
    }
}