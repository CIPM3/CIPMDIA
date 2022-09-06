package com.leal.cipm_testing;


import androidx.annotation.NonNull;

public class Student {

    String name;
    boolean presentsimple,presenteContinuo;


    public Student() {

    }
    public Student(String name, boolean presentsimple, boolean presenteContinuo) {
        this.name = name;
        this.presentsimple = presentsimple;
        this.presenteContinuo= presenteContinuo;

    }

    // pressentes get y set
    public boolean isPresentsimple() {
        return presentsimple;
    }
    public void setPresentsimple(boolean presentsimple) {
        this.presentsimple = presentsimple;
    }
    public boolean isPresenteContinuo() {
        return presenteContinuo;
    }
    public void setPresenteContinuo(boolean presenteContinuo) {
        this.presenteContinuo = presenteContinuo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {

        return "Present Simple " +this.presentsimple + "\n"+ "Present Continuous "+this.presenteContinuo;
    }
}
