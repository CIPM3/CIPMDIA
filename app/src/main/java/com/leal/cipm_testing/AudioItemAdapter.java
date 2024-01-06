package com.leal.cipm_testing;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class AudioItemAdapter extends RecyclerView.Adapter<AudioItemAdapter.AudioItemViewHolder> {
    private List<AudioItem> audioItems;
    AudioRecorder audioRecorder;
    ToeflSpeaking toeflspk = new ToeflSpeaking() ;
    private Handler timerHandler = new Handler();
    FirebaseUploader firebaseUploader = new FirebaseUploader();
    FirebaseAuth mAuth= FirebaseAuth.getInstance();
    String userEmail;
    FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    public AudioItemAdapter(List<AudioItem> audioItems) {
        this.audioItems = audioItems;
        fetchFeedbackAndUpdateUI();
    }

    @NonNull
    @Override
    public AudioItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question, parent, false);
        return new AudioItemViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AudioItemViewHolder holder, int position) {
        AudioItem item = audioItems.get(position);

       if(item.getType() == 1){
           holder.btnlisten.setVisibility(View.VISIBLE);

           holder.tvQuestion.setText(item.getQuestion());
           holder.tvRecordingTimer.setText(item.getRecordingTimer());
           holder.tvFeedback.setText(item.getFeedback());
           audioRecorder=  new AudioRecorder(item.getAudioFilePath());
           holder.btnRecord.setOnClickListener(v -> {
               if (!item.isRecording()) {
                   // Start recording
                   startRecording(item, holder.tvRecordingTimer, audioRecorder);
                   holder.btnRecord.setText("Stop Recording");

               } else {
                   // Stop recording
                   stopRecording(item, holder.tvRecordingTimer, audioRecorder);
                   holder.btnRecord.setText("Record");

               }
           });
           holder.playback.setOnClickListener(v -> {
               toeflspk.playAudio(item.getAudioFilePath());
           });
           holder.btnlisten.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   toeflspk.playAudio(item.getListeningUrl());
               }
           });
       }else {
           holder.btnlisten.setVisibility(View.GONE);
           holder.tvQuestion.setText(item.getQuestion());
           holder.tvRecordingTimer.setText(item.getRecordingTimer());
           holder.tvFeedback.setText(item.getFeedback());
           audioRecorder=  new AudioRecorder(item.getAudioFilePath());
           holder.btnRecord.setOnClickListener(v -> {
               if (!item.isRecording()) {
                   // Start recording
                   startRecording(item, holder.tvRecordingTimer, audioRecorder);

                   holder.btnRecord.setText("Stop Recording");

               } else {
                   // Stop recording
                   stopRecording(item, holder.tvRecordingTimer, audioRecorder);
                   holder.btnRecord.setText("Record");
               }
           });
           holder.playback.setOnClickListener(v -> {
              toeflspk.playAudio(item.getAudioFilePath());
           });
       }

    }

    private void startRecording(AudioItem item ,TextView tvRecordingTimer, AudioRecorder audioRecorder) {

        audioRecorder.startRecording();
        item.setRecording(true);
        long startTime = System.currentTimeMillis();
        Runnable timerRunnable = new Runnable() {
            @Override
            public void run() {
                long millis = System.currentTimeMillis() - startTime;
                int seconds = (int) (millis / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;

                tvRecordingTimer.setText(String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds));
                timerHandler.postDelayed(this, 500);
            }
        };
        timerHandler.postDelayed(timerRunnable, 0);
        item.setTimerRunnable(timerRunnable);



    }
    private void stopRecording(AudioItem item, TextView tvRecordingTimer, AudioRecorder audioRecorder) {


        audioRecorder.stopRecording();
        item.setRecording(false);

        // Stop and remove the timer runnable
        if (item.getTimerRunnable() != null) {
            timerHandler.removeCallbacks(item.getTimerRunnable());
            item.setTimerRunnable(null); // Reset the timer runnable in the AudioItem
        }

        // Reset the timer text view to default or zero time
        tvRecordingTimer.setText("00:00");

        File audioFile = new File(item.getAudioFilePath());
        userEmail =mAuth.getCurrentUser().getEmail();
        firebaseUploader.uploadAudioAndCreateDocument(userEmail, audioFile,item.getQuestion());
    }
    private void fetchFeedbackAndUpdateUI() {
        userEmail = mAuth.getCurrentUser().getEmail();
        for (AudioItem item : audioItems) {
            String question = item.getQuestion();
            firestore.collection(userEmail).document(question)
                    .get()
                    .addOnSuccessListener(documentSnapshot -> {
                        if (documentSnapshot.exists()) {
                            String feedback = documentSnapshot.getString("feedback");
                            if(feedback.equals("")){
                                item.setFeedback("a la brevedad escribiremos tu feedback aqui o ve a chat con maestro");
                                notifyDataSetChanged();
                            }else {
                                item.setFeedback(feedback);
                                notifyDataSetChanged();
                            }

                        }
                    })
                    .addOnFailureListener(e -> {
                        // Handle any errors here
                    });
        }
    }


    @Override
    public int getItemCount() {
        return audioItems.size();
    }

    public static class AudioItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvQuestion;

        Button btnRecord,playback,btnlisten;
        TextView tvRecordingTimer;
        TextView tvFeedback;

        public AudioItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuestion = itemView.findViewById(R.id.tvQuestionItem);
            btnlisten = itemView.findViewById(R.id.btnplaytoefl);
            btnRecord = itemView.findViewById(R.id.btnRecord);
            tvRecordingTimer = itemView.findViewById(R.id.tvRecordingTimer);
            tvFeedback = itemView.findViewById(R.id.tvFeedback);
            playback = itemView.findViewById(R.id.btnplayback);


        }
    }

    public void stopAllAudioPlayback() {

        // Logic to stop MediaPlayer
        if (toeflspk.mediaPlayer != null && toeflspk.mediaPlayer.isPlaying()) {
            toeflspk.mediaPlayer.stop();
            toeflspk.mediaPlayer.release();
        }
    }




}

