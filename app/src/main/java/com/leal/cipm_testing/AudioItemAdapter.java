package com.leal.cipm_testing;

import android.media.MediaPlayer;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AudioItemAdapter extends RecyclerView.Adapter<AudioItemAdapter.AudioItemViewHolder> {
    private List<AudioItem> audioItems;
    AudioRecorder audioRecorder;
    ToeflSpeaking toeflspk = new ToeflSpeaking() ;
    private Handler timerHandler = new Handler();
    FirebaseUploader firebaseUploader = new FirebaseUploader();
    FirebaseAuth mAuth= FirebaseAuth.getInstance();
    String userEmail;
    FirebaseFirestore firestore = FirebaseFirestore.getInstance();
    String userid;
    DocumentReference docRef;
    DbAudioFetcherModel model;
    String placeholderAudio = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/audio%2Fplaceholderaudio.m4a?alt=media&token=c2bc2fb8-f3e4-4c12-8803-e46f3064bc7c";
    public AudioItemAdapter(List<AudioItem> audioItems) {
        this.audioItems = audioItems;
        userid = mAuth.getCurrentUser().getUid();
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

        // Resetting the visibility and states for all views
        holder.btnlisten.setVisibility(View.GONE);
        holder.playback.setVisibility(View.GONE);
        holder.essayEditText.setVisibility(View.GONE);
        holder.btnRecord.setVisibility(View.VISIBLE);
        holder.tvRecordingTimer.setVisibility(View.VISIBLE);
        holder.btnSubmit.setVisibility(View.GONE);
        holder.tvQuestion.setVisibility(View.VISIBLE);

         if(item.getType()==0)  {
            // open question no listening
            holder.btnlisten.setVisibility(View.GONE);
            holder.tvQuestion.setText(item.getQuestion());
            holder.title.setText(item.getTitle());
            holder.tvRecordingTimer.setText(item.getRecordingTimer());
            holder.tvFeedback.setText(item.getFeedback());
            holder.playback.setVisibility(View.GONE);
            audioRecorder =  new AudioRecorder(item.getAudioFilePath());
            holder.btnRecord.setOnClickListener(v -> {
                if (!item.isRecording()) {
                    // Start recording
                    startRecording(item, holder.tvRecordingTimer, audioRecorder);

                    holder.btnRecord.setText("Stop Recording");

                } else {
                    // Stop recording
                    stopRecording(item, holder.tvRecordingTimer, audioRecorder);
                    holder.btnRecord.setText("Record");
                    holder.playback.setVisibility(View.VISIBLE);


                }
            });
            holder.playback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    docRef = firestore.collection(userEmail).document(item.getTitle());
                    docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {

                            if(documentSnapshot.exists()){
                                model= documentSnapshot.toObject(DbAudioFetcherModel.class);
                                toeflspk.playAudio(model.getStorageLink());

                            }else {
                                    toeflspk.playAudio(placeholderAudio);
                            }
                        }
                    });

                }
            });

         }
         else if(item.getType() == 1){
           //integrated questions 2 and 3 speaking test
             holder.essayEditText.setVisibility(View.GONE);
             holder.tvQuestion.setText(item.getQuestion());
             holder.btnlisten.setVisibility(View.VISIBLE);
           holder.title.setText(item.getTitle());
           holder.playback.setVisibility(View.GONE);
           holder.tvRecordingTimer.setText(item.getRecordingTimer());
           holder.tvFeedback.setText(item.getFeedback());
           audioRecorder =  new AudioRecorder(item.getAudioFilePath());
           holder.btnRecord.setOnClickListener(v -> {
               if (!item.isRecording()) {
                   // Start recording
                   startRecording(item, holder.tvRecordingTimer, audioRecorder);
                   holder.btnRecord.setText("Stop Recording");

               } else {
                   // Stop recording
                   stopRecording(item, holder.tvRecordingTimer, audioRecorder);
                   holder.btnRecord.setText("Record");
                   holder.playback.setVisibility(View.VISIBLE);


               }
           });
           holder.btnlisten.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   toeflspk.playAudio(item.getListeningUrl());
               }
           });
           holder.playback.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     docRef = firestore.collection(userEmail).document(item.getTitle());
                     docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                         @Override
                         public void onSuccess(DocumentSnapshot documentSnapshot) {

                             if(documentSnapshot.exists()){
                                 model= documentSnapshot.toObject(DbAudioFetcherModel.class);
                                 toeflspk.playAudio(model.getStorageLink());

                             }else {
                                 toeflspk.playAudio(placeholderAudio);
                             }
                         }
                     });

                 }
             });





       }
         else if(item.getType()==2){

           //este es el de writting, no recording, no listening, will do in video?
           holder.title.setText(item.getTitle());
           holder.tvQuestion.setText(item.getQuestion());
           holder.btnlisten.setVisibility(View.GONE);
           holder.tvRecordingTimer.setVisibility(View.GONE);
           holder.btnRecord.setVisibility(View.GONE);
           holder.playback.setVisibility(View.GONE);
           holder.essayEditText.setVisibility(View.VISIBLE);
           holder.btnSubmit.setVisibility(View.VISIBLE);
             holder.tvFeedback.setText(item.getFeedback());

             docRef=firestore.collection(userEmail).document(item.getTitle());
           String key = item.getTitle();
           holder.btnSubmit.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View v) {
                   userEmail = mAuth.getCurrentUser().getEmail();
                   CollectionReference uid = firestore.collection(userEmail);
                   Map<String, Object> user = new HashMap<>();
                   docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                       @Override
                       public void onSuccess(DocumentSnapshot documentSnapshot) {
                            holder.btnSubmit.setText("Informacion ha sido enviada");
                            sendEssayToDB();
                       }

                       private void sendEssayToDB() {
                           String temp= holder.essayEditText.getText().toString();
                           user.put(key,temp);
                           user.put("feedback","");
                           uid.document(item.getTitle() ).set(user);

                       }
                   });
               }
           });
       }
         else if(item.getType()==3){
             //speaking question only audio
           holder.title.setText(item.getTitle());
           holder.tvQuestion.setVisibility(View.GONE);
           holder.btnlisten.setVisibility(View.VISIBLE);
           holder.btnRecord.setVisibility(View.VISIBLE);
             holder.playback.setVisibility(View.GONE);
           holder.tvFeedback.setText(item.getFeedback());
           holder.tvRecordingTimer.setText(item.getRecordingTimer());
           holder.btnlisten.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   toeflspk.playAudio(item.getListeningUrl());
               }
           });
             audioRecorder =  new AudioRecorder(item.getAudioFilePath());
           holder.btnRecord.setOnClickListener(v -> {
               if (!item.isRecording()) {
                   // Start recording
                   startRecording(item, holder.tvRecordingTimer, audioRecorder);

                   holder.btnRecord.setText("Stop Recording");

               } else {
                   // Stop recording
                   stopRecording(item, holder.tvRecordingTimer, audioRecorder);
                   holder.btnRecord.setText("Record");
                   holder.playback.setVisibility(View.VISIBLE);



               }
           });
             holder.playback.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     docRef = firestore.collection(userEmail).document(item.getTitle());
                     docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                         @Override
                         public void onSuccess(DocumentSnapshot documentSnapshot) {

                             if(documentSnapshot.exists()){
                                 model= documentSnapshot.toObject(DbAudioFetcherModel.class);
                                 toeflspk.playAudio(model.getStorageLink());

                             }else {
                                 toeflspk.playAudio(placeholderAudio);                             }
                         }
                     });

                 }
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
        userEmail = mAuth.getCurrentUser().getEmail();
        firebaseUploader.uploadAudioAndCreateDocument(userEmail, audioFile,item.getTitle());
    }
    private void fetchFeedbackAndUpdateUI() {
        userEmail = mAuth.getCurrentUser().getEmail();
        for (AudioItem item : audioItems) {
            String title = item.getTitle();
            firestore.collection(userEmail).document(title)
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
        EditText essayEditText;
        TextView title;

        Button btnRecord,playback,btnlisten,btnSubmit;
        TextView tvRecordingTimer;
        TextView tvFeedback;

        public AudioItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuestion = itemView.findViewById(R.id.tvQuestionItem);
            btnlisten = itemView.findViewById(R.id.btnplaytoefl);
            btnSubmit= itemView.findViewById(R.id.btnSendEssay);
            btnRecord = itemView.findViewById(R.id.btnRecord);
            tvRecordingTimer = itemView.findViewById(R.id.tvRecordingTimer);
            tvFeedback = itemView.findViewById(R.id.tvFeedback);
            playback = itemView.findViewById(R.id.btnplayback);
            essayEditText= itemView.findViewById(R.id.essayEditText);
            title= itemView.findViewById(R.id.tvTitle);
            essayEditText.setMovementMethod(new ScrollingMovementMethod());

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

