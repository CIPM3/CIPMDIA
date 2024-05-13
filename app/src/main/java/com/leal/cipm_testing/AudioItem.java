package com.leal.cipm_testing;

public class AudioItem {
    private String question;
    private String title;
    private boolean isRecorded;
    private boolean isRecording;
    private String recordingTimer;
    private String feedback;
    private String audioFilePath;
    // Constructor, getters and setters
    private Runnable timerRunnable;

    private int type;
    private String listeningUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getListeningUrl() {
        return listeningUrl;
    }

    public void setListeningUrl(String listeningUrl) {
        this.listeningUrl = listeningUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Runnable getTimerRunnable() {
        return timerRunnable;
    }

    public void setTimerRunnable(Runnable timerRunnable) {
        this.timerRunnable = timerRunnable;
    }

    public String getAudioFilePath() {
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    public boolean isRecording() {
        return isRecording;
    }

    public void setRecording(boolean recording) {
        isRecording = recording;
    }

    public AudioItem() {
    }

    public AudioItem(String title ,String question, boolean isRecorded, String recordingTimer, String feedback, String audioFilePath,int type) {
        this.title= title;
        this.question = question;
        this.isRecorded = isRecorded;
        this.recordingTimer = recordingTimer;
        this.feedback = feedback;
        this.audioFilePath= audioFilePath;
        this.type= type;
    }
    public AudioItem(String title ,String question, String feedback, int type) {
        this.title= title;
        this.question = question;
        this.feedback = feedback;
        this.type= type;
    }

    public AudioItem(String title ,String question, boolean isRecorded, String recordingTimer, String feedback, String audioFilePath,int type,String listeningUrl) {
        this.title= title;
        this.question = question;
        this.isRecorded = isRecorded;
        this.recordingTimer = recordingTimer;
        this.feedback = feedback;
        this.audioFilePath= audioFilePath;
        this.type= type;
        this.listeningUrl= listeningUrl;
    }
    public AudioItem(String title ,String question, boolean isRecorded, String recordingTimer, String feedback) {
        this.title= title;
        this.question = question;
        this.isRecorded = isRecorded;
        this.recordingTimer = recordingTimer;
        this.feedback = feedback;

    }
    public AudioItem(String title ,String audioFilePath){
        this.title= title;
        this.audioFilePath= audioFilePath;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    public void setRecorded(boolean recorded) {
        isRecorded = recorded;
    }

    public String getRecordingTimer() {
        return recordingTimer;
    }

    public void setRecordingTimer(String recordingTimer) {
        this.recordingTimer = recordingTimer;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}

