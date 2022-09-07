package com.leal.cipm_testing;


import androidx.annotation.NonNull;

public class Student {

    String name;
    boolean presentesimple,presenteContinuo,presentePerfecto,presentePerfectoContinuo;
    boolean pastsimple,pastContinuo,pastPerfecto,pastPerfectoContinuo;
    boolean futuresimple,futureContinuo,futurePerfecto,futurePerfectoContinuo;
    boolean wouldsimple,wouldContinuo,wouldPerfecto,wouldPerfectoContinuo;
    boolean couldsimple,couldContinuo,couldPerfecto,couldPerfectoContinuo;


    public Student() {

    }

    public Student(
            String name, boolean presentesimple, boolean presenteContinuo, boolean presentePerfecto,boolean presentePerfectoContinuo,
            boolean pastsimple, boolean pastContinuo, boolean pastPerfecto, boolean pastPerfectoContinuo,
            boolean futuresimple, boolean futureContinuo, boolean futurePerfecto, boolean futurePerfectoContinuo,
            boolean wouldsimple, boolean wouldContinuo, boolean wouldPerfecto, boolean wouldPerfectoContinuo,
            boolean couldsimple, boolean couldContinuo, boolean couldPerfecto, boolean couldPerfectoContinuo
    ) {
        this.name = name;
        this.presentesimple = presentesimple;
        this.presenteContinuo= presenteContinuo;
        this.presentePerfecto = presentePerfecto;
        this.presentePerfectoContinuo = presentePerfectoContinuo;

        this.pastsimple = pastsimple;
        this.pastContinuo= pastContinuo;
        this.pastPerfecto = pastPerfecto;
        this.pastPerfectoContinuo = pastPerfectoContinuo;

        this.futuresimple = futuresimple;
        this.futureContinuo= futureContinuo;
        this.futurePerfecto = futurePerfecto;
        this.futurePerfectoContinuo = futurePerfectoContinuo;

        this.wouldsimple = wouldsimple;
        this.wouldContinuo= wouldContinuo;
        this.wouldPerfecto = wouldPerfecto;
        this.wouldPerfectoContinuo = wouldPerfectoContinuo;

        this.couldsimple = couldsimple;
        this.couldContinuo= couldContinuo;
        this.couldPerfecto = couldPerfecto;
        this.couldPerfectoContinuo = couldPerfectoContinuo;
    }

    // pressentes get y set
    public boolean isPresentesimple() {
        return presentesimple;
    }
    public void setPresentesimple(boolean presentesimple) {
        this.presentesimple = presentesimple;
    }
    public boolean isPresenteContinuo() {
        return presenteContinuo;
    }
    public void setPresenteContinuo(boolean presenteContinuo) {
        this.presenteContinuo = presenteContinuo;
    }
    public boolean isPresentePerfecto() {
        return presentePerfecto;
    }
    public void setPresentePerfecto(boolean presentePerfecto) {
        this.presentePerfecto = presentePerfecto;
    }
    public boolean isPresentePerfectoContinuo() {
        return presentePerfectoContinuo;
    }
    public void setPresentePerfectoContinuo(boolean presentePerfectoContinuo) {
        this.presentePerfectoContinuo = presentePerfectoContinuo;
    }

    //pasados get y set
    public boolean isPastsimple() {
        return pastsimple;
    }
    public void setPastsimple(boolean pastsimple) {
        this.pastsimple = pastsimple;
    }
    public boolean isPastContinuo() {
        return pastContinuo;
    }
    public void setPastContinuo(boolean pastContinuo) {
        this.pastContinuo = pastContinuo;
    }
    public boolean isPastPerfecto() {
        return pastPerfecto;
    }
    public void setPastPerfecto(boolean pastPerfecto) {
        this.pastPerfecto = pastPerfecto;
    }
    public boolean isPastPerfectoContinuo() {
        return pastPerfectoContinuo;
    }
    public void setPastPerfectoContinuo(boolean pastPerfectoContinuo) {
        this.pastPerfectoContinuo = pastPerfectoContinuo;
    }

    //futuros get y set
    public boolean isFuturesimple() {
        return futuresimple;
    }
    public void setFuturesimple(boolean futuresimple) {
        this.futuresimple = futuresimple;
    }
    public boolean isFutureContinuo() {
        return futureContinuo;
    }
    public void setFutureContinuo(boolean futureContinuo) {
        this.futureContinuo = futureContinuo;
    }
    public boolean isFuturePerfecto() {
        return futurePerfecto;
    }
    public void setFuturePerfecto(boolean futurePerfecto) {
        this.futurePerfecto = futurePerfecto;
    }
    public boolean isFuturePerfectoContinuo() {
        return futurePerfectoContinuo;
    }
    public void setFuturePerfectoContinuo(boolean futurePerfectoContinuo) {
        this.futurePerfectoContinuo = futurePerfectoContinuo;
    }

    //would get y set
    public boolean isWouldsimple() {
        return wouldsimple;
    }
    public void setWouldsimple(boolean wouldsimple) {
        this.wouldsimple = wouldsimple;
    }
    public boolean isWouldContinuo() {
        return wouldContinuo;
    }
    public void setWouldContinuo(boolean wouldContinuo) {
        this.wouldContinuo = wouldContinuo;
    }
    public boolean isWouldPerfecto() {
        return wouldPerfecto;
    }
    public void setWouldPerfecto(boolean wouldPerfecto) {
        this.wouldPerfecto = wouldPerfecto;
    }
    public boolean isWouldPerfectoContinuo() {
        return wouldPerfectoContinuo;
    }
    public void setWouldPerfectoContinuo(boolean wouldPerfectoContinuo) {
        this.wouldPerfectoContinuo = wouldPerfectoContinuo;
    }

    //could get y set
    public boolean isCouldsimple() {
        return couldsimple;
    }
    public void setCouldsimple(boolean couldsimple) {
        this.couldsimple = couldsimple;
    }
    public boolean isCouldContinuo() {
        return couldContinuo;
    }
    public void setCouldContinuo(boolean couldContinuo) {
        this.couldContinuo = couldContinuo;
    }
    public boolean isCouldPerfecto() {
        return couldPerfecto;
    }
    public void setCouldPerfecto(boolean couldPerfecto) {
        this.couldPerfecto = couldPerfecto;
    }
    public boolean isCouldPerfectoContinuo() {
        return couldPerfectoContinuo;
    }
    public void setCouldPerfectoContinuo(boolean couldPerfectoContinuo) {
        this.couldPerfectoContinuo = couldPerfectoContinuo;
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

        return "Present Simple " +this.presentesimple
                + "\n"+ "Present Continuous " +this.presenteContinuo
                + "\n"+ "Present Perfect "+this.presentePerfecto
                + "\n"+ "Present Perfect Continuous "+this.presentePerfectoContinuo
                + "\n"+ "Past Simple "+this.pastsimple
                + "\n"+ "Past Continuous "+this.pastContinuo
                + "\n"+ "Past Perfect "+this.pastPerfecto
                + "\n"+ "Past Perfect Continuous "+this.pastPerfectoContinuo
                + "\n"+ "Future Simple "+this.futuresimple
                + "\n"+ "Future Continuous "+this.futureContinuo
                + "\n"+ "Future Perfect "+this.futurePerfecto
                + "\n"+ "Future Perfect Continuous "+this.futurePerfectoContinuo
                + "\n"+ "Would Simple "+this.wouldPerfecto
                + "\n"+ "Would Continuous "+this.wouldContinuo
                + "\n"+ "Would Perfect "+this.wouldPerfecto
                + "\n"+ "Would Perfect Continuous "+this.wouldPerfectoContinuo
                + "\n"+ "Could Simple "+this.couldPerfecto
                + "\n"+ "Could Simple "+this.couldPerfecto
                + "\n"+ "Could Simple "+this.couldPerfecto
                + "\n"+ "Could Simple "+this.couldPerfecto
                ;
    }
}
