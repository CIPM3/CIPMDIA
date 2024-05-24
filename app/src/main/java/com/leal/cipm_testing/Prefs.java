package com.leal.cipm_testing;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private final Context context;
    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    public Prefs(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }



    public void setInt(String key,int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    public void setString(String key,String value) {
        editor.putString(key, value);
        editor.apply();
    }

    public int getPremium() {
        return sharedPreferences.getInt("Premium", 0);
    }

    public void setPremium(int value) {
        editor.putInt("Premium", value);
        editor.apply();
    }

    public String getSelection() { return sharedPreferences.getString("tema","");}

    public void setSelection(String value){
        editor.putString("tema",value);
        editor.apply();
    }

    public String getVideoCultura() { return sharedPreferences.getString("video","");}

    public void setVideoCultura(String value){
        editor.putString("video",value);
        editor.apply();
    }

    public Boolean getExplanation() { return sharedPreferences.getBoolean("explicacion",false);}

    public void setExplanation(boolean value){
        editor.putBoolean("explicacion",value);
        editor.apply();
    }

    public void setLong(String key, long value) {
        editor.putLong(key, value);
        editor.apply();
    }

    public long getLong(String key, long defValue) {
        return sharedPreferences.getLong(key, defValue);
    }


    public void setTypeOfRecycler(int value){

        editor.putInt("typeOfRecycler", value);
        editor.apply();

    }

    public int getTypeOfRecycler(){
        return sharedPreferences.getInt("typeOfRecycler", 0);

    }

    public void setBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean def) {
        return sharedPreferences.getBoolean(key, def);
    }

    public int getInt(String key, int def) {
        return sharedPreferences.getInt(key, def);
    }


    public String getString(String key, String def) {
        return sharedPreferences.getString(key, def);
    }


    public void setHasSeenAd(boolean value) {
        editor.putBoolean("hasSeenAd", value);
        editor.apply();
    }

    public boolean getHasSeenAd() {
        return sharedPreferences.getBoolean("hasSeenAd", false); // Default to false if not set
    }



}
