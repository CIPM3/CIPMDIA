package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ToeflSpeaking extends AppCompatActivity {
    private AudioRecorder audioRecorder;
    private RecyclerView recyclerView;
    private AudioItemAdapter audioItemAdapter;
    private List<AudioItem> audioItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toefl_speaking);
        String audioFilePath = getExternalFilesDir(null).getAbsolutePath() + "/myaudio.3gp";
        audioRecorder = new AudioRecorder(audioFilePath);
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
        // Example items, replace with real data
        audioItemList.add(new AudioItem("Question 1", false, "00:00", "Feedback 1"));
        audioItemList.add(new AudioItem("Question 2", false, "00:00", "Feedback 2"));
        // Add as many items as needed
    }
}