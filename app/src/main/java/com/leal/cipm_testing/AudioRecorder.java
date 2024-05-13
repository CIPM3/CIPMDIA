package com.leal.cipm_testing;

import android.content.Context;
import android.media.MediaRecorder;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;

public class AudioRecorder {

    private MediaRecorder mediaRecorder;
    private String audioFilePath;


    public AudioRecorder(String filePath) {

        this.audioFilePath = filePath;
    }
    public void startRecording() {
        if (mediaRecorder == null) {
            mediaRecorder = new MediaRecorder();
            mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            mediaRecorder.setOutputFile(audioFilePath);
            mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);

            try {
                mediaRecorder.prepare();
                mediaRecorder.start();
            } catch (IOException e) {
                Log.e("AudioRecorder", "Error preparing or starting MediaRecorder", e);
            } catch (IllegalStateException e) {
                Log.e("AudioRecorder", "Failed to set up MediaRecorder", e);
            }

        }
    }

    public void stopRecording() {
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();  // stop can throw IllegalStateException if it's called at an improper time
            } catch (IllegalStateException e) {
                Log.e("AudioRecorder", "Error stopping MediaRecorder", e);
            } finally {
                mediaRecorder.release();
                mediaRecorder = null;
            }
        }
    }

    public String getAudioFilePath() {
        return audioFilePath;
    }


}
