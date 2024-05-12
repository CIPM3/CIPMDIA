package com.leal.cipm_testing;

public class VocabItem {

    String title;
    String definition;
    String description;
    int type;
    String vidUrl;
    private boolean isAdWatched = false;
    // other fields and methods

    public void setAdWatched(boolean watched) {
        isAdWatched = watched;
    }

    public boolean isAdWatched() {
        return isAdWatched;
    }
    public String getVidUrl() {
        return vidUrl;
    }

    public void setVidUrl(String vidUrl) {
        this.vidUrl = vidUrl;
    }

    private String userInput; // Add this field
  // Field for storing user input from speech recognition

    // Constructor
   /* public VocabItem(String title, String definition, String description, int type, String userInput) {
        this.title = title;
        this.definition = definition;
        this.description = description;
        this.type = type;
        this.userInput = ""; // Initialize userInput with an empty string
    }*/
    // Add this method
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public VocabItem(String title, String definition, String description, int type) {
        this.title = title;
        this.definition = definition;
        this.description = description;
        this.type = type;

    }
    public VocabItem(String title, String definition, String description, int type, String vidUrl) {
        this.title = title;
        this.definition = definition;
        this.description = description;
        this.type = type;
        this.vidUrl=vidUrl;

    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getUserInput() {
        return userInput;
    }



}
