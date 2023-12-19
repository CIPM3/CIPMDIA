package com.leal.cipm_testing;

public class AudioItem {
    private String question;
    private boolean isRecorded;
    private String recordingTimer;
    private String feedback;

    // Constructor, getters and setters

    public AudioItem() {
    }

    public AudioItem(String question, boolean isRecorded, String recordingTimer, String feedback) {
        this.question = question;
        this.isRecorded = isRecorded;
        this.recordingTimer = recordingTimer;
        this.feedback = feedback;
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

