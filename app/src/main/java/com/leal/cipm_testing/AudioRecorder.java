package com.leal.cipm_testing;

import android.media.MediaRecorder;

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
            mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

            try {
                mediaRecorder.prepare();
                mediaRecorder.start();
            } catch (IOException e) {
                // Handle IOException
            } catch (IllegalStateException e) {
                // Handle IllegalStateException
            }
        }
    }

    public void stopRecording() {
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            mediaRecorder.release();
            mediaRecorder = null;
        }
    }

    public String getAudioFilePath() {
        return audioFilePath;
    }


}
