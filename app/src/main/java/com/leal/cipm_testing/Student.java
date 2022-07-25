package com.leal.cipm_testing;



public class Student {

    String name;
    boolean presentsimple,presenteContinuo, presenteperfecto,
            presentepp, pasadosimple,pasadocontinuo,pasadoperfecto,pasadopp;



    public Student() {

    }
    public Student(String name, boolean presentsimple, boolean presenteContinuo,
                   boolean presenteperfecto,boolean presentepp,boolean pasadosimple,boolean pasadocontinuo
                   ,boolean pasadoperfecto, boolean pasadopp

    ) {
        this.name = name;
        this.presentsimple = presentsimple;
        this.presenteContinuo= presenteContinuo;
        this.presenteperfecto=presenteperfecto;
        this.presentepp=presentepp;
        this.pasadosimple= pasadosimple;
        this.pasadocontinuo=pasadocontinuo;
        this.pasadoperfecto=pasadoperfecto;
        this.pasadopp=pasadopp;
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
    public boolean isPresenteperfecto() {
        return presenteperfecto;
    }
    public void setPresenteperfecto(boolean presenteperfecto) {
        this.presenteperfecto = presenteperfecto;
    }

    public boolean isPresentepp() {
        return presentepp;
    }
    public void setPresentepp(boolean presentepp) {
        this.presentepp = presentepp;
    }

    public boolean isPasadosimple() {
        return pasadosimple;
    }

    public void setPasadosimple(boolean pasadosimple) {
        this.pasadosimple = pasadosimple;
    }

    public boolean isPasadocontinuo() {
        return pasadocontinuo;
    }

    public void setPasadocontinuo(boolean pasadocontinuo) {
        this.pasadocontinuo = pasadocontinuo;
    }

    public boolean isPasadoperfecto() {
        return pasadoperfecto;
    }

    public void setPasadoperfecto(boolean pasadoperfecto) {
        this.pasadoperfecto = pasadoperfecto;
    }

    public boolean isPasadopp() {
        return pasadopp;
    }

    public void setPasadopp(boolean pasadopp) {
        this.pasadopp = pasadopp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
