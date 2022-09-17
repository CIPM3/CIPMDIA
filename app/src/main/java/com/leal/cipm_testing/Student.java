package com.leal.cipm_testing;


import androidx.annotation.NonNull;

public class Student {

    String name;
    boolean presentesimple,presenteContinuo,presentePerfecto,
            presentePerfectoContinuo;
    boolean pastsimple,pastContinuo,pastPerfecto,pastPerfectoContinuo;
    boolean futuresimple,futureContinuo,futurePerfecto,futurePerfectoContinuo;
    boolean wouldsimple,wouldContinuo,wouldPerfecto,wouldPerfectoContinuo;
    boolean couldsimple,couldContinuo,couldPerfecto,couldPerfectoContinuo;
    boolean mightsimple,mightContinuo,mightPerfecto,mightPerfectoContinuo;
    boolean cansimple,canContinuo,mustsimple,mustContinuo;
    boolean shouldsimple,shouldContinuo,shouldPerfecto,shouldPerfectoContinuo;
    boolean wantTo,forTo,supposedToPresent,wishPastPerfect,usedTo,beUsedTo;


    public Student() {

    }
    public Student( String name,
          boolean presentesimple, boolean presenteContinuo, boolean presentePerfecto,boolean presentePerfectoContinuo,
            boolean pastsimple, boolean pastContinuo, boolean pastPerfecto, boolean pastPerfectoContinuo,
            boolean futuresimple, boolean futureContinuo, boolean futurePerfecto, boolean futurePerfectoContinuo,
            boolean wouldsimple, boolean wouldContinuo, boolean wouldPerfecto, boolean wouldPerfectoContinuo,
            boolean couldsimple, boolean couldContinuo, boolean couldPerfecto, boolean couldPerfectoContinuo,
            boolean mightsimple, boolean mightContinuo, boolean mightPerfecto, boolean mightPerfectoContinuo,
            boolean cansimple, boolean canContinuo, boolean mustsimple, boolean mustContinuo,
            boolean shouldsimple, boolean shouldContinuo, boolean shouldPerfecto, boolean shouldPerfectoContinuo,
            boolean wantTo, boolean forTo, boolean supposedToPresent, boolean wishPastPerfect, boolean usedTo,
            boolean beUsedTo
    ) {
        this.name=name;
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

        this.mightsimple = mightsimple;
        this.mightContinuo= mightContinuo;
        this.mightPerfecto = mightPerfecto;
        this.mightPerfectoContinuo = mightPerfectoContinuo;

        this.cansimple = cansimple;
        this.canContinuo= canContinuo;

        this.mustsimple = mustsimple;
        this.mustContinuo= mustContinuo;

        this.shouldsimple = shouldsimple;
        this.shouldContinuo= shouldContinuo;
        this.shouldPerfecto = shouldPerfecto;
        this.shouldPerfectoContinuo = shouldPerfectoContinuo;

        this.wantTo = wantTo;
        this.forTo = forTo;
        this.supposedToPresent = supposedToPresent;
        this.wishPastPerfect = wishPastPerfect;
        this.usedTo = usedTo;
        this.beUsedTo = beUsedTo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    //might get y set
    public boolean isMightsimple() {
        return mightsimple;
    }
    public void setMightsimple(boolean mightsimple) {
        this.mightsimple = mightsimple;
    }
    public boolean isMightContinuo() {
        return mightContinuo;
    }
    public void setMightContinuo(boolean mightContinuo) {
        this.mightContinuo = mightContinuo;
    }
    public boolean isMightPerfecto() {
        return mightPerfecto;
    }
    public void setMightPerfecto(boolean mightPerfecto) {
        this.mightPerfecto = mightPerfecto;
    }
    public boolean isMightPerfectoContinuo() {
        return mightPerfectoContinuo;
    }
    public void setMightPerfectoContinuo(boolean mightPerfectoContinuo) {
        this.mightPerfectoContinuo = mightPerfectoContinuo;
    }

    //can get y set
    public boolean isCansimple() {
        return cansimple;
    }
    public void setCansimple(boolean cansimple) {
        this.cansimple = cansimple;
    }
    public boolean isCanContinuo() {
        return canContinuo;
    }
    public void setCanContinuo(boolean canContinuo) {
        this.canContinuo = canContinuo;
    }

    //must get y set
    public boolean isMustsimple() {
        return mustsimple;
    }
    public void setMustsimple(boolean mustsimple) {
        this.mustsimple = mustsimple;
    }
    public boolean isMustContinuo() {
        return mustContinuo;
    }
    public void setMustContinuo(boolean mustContinuo) {
        this.mustContinuo = mustContinuo;
    }

    //should get y set
    public boolean isShouldsimple() {
        return shouldsimple;
    }
    public void setShouldsimple(boolean shouldsimple) {
        this.shouldsimple = shouldsimple;
    }
    public boolean isShouldContinuo() {
        return shouldContinuo;
    }
    public void setShouldContinuo(boolean shouldContinuo) {
        this.shouldContinuo = shouldContinuo;
    }
    public boolean isShouldPerfecto() {
        return shouldPerfecto;
    }
    public void setShouldPerfecto(boolean shouldPerfecto) {
        this.shouldPerfecto = shouldPerfecto;
    }
    public boolean isShouldPerfectoContinuo() {
        return shouldPerfectoContinuo;
    }
    public void setShouldPerfectoContinuo(boolean shouldPerfectoContinuo) {
        this.shouldPerfectoContinuo = shouldPerfectoContinuo;
    }

    //others get y set
    public boolean isWantTo() {
        return wantTo;
    }
    public void setWantTo(boolean wantTo) {
        this.wantTo = wantTo;
    }
    public boolean isForTo() {
        return forTo;
    }
    public void setForTo(boolean forTo) {
        this.forTo = forTo;
    }
    public boolean isSupposedToPresent() {
        return supposedToPresent;
    }
    public void setSupposedToPresent(boolean supposedToPresent) {
        this.supposedToPresent = supposedToPresent;
    }
    public boolean isWishPastPerfect() {
        return wishPastPerfect;
    }
    public void setWishPastPerfect(boolean wishPastPerfect) {
        this.wishPastPerfect = wishPastPerfect;
    }
    public boolean isUsedTo() {
        return usedTo;
    }
    public void setUsedTo(boolean usedTo) {
        this.usedTo = usedTo;
    }
    public boolean isBeUsedTo() {
        return beUsedTo;
    }
    public void setBeUsedTo(boolean beUsedTo) {
        this.beUsedTo = beUsedTo;
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
                + "\n"+ "Would Simple "+this.wouldsimple
                + "\n"+ "Would Continuous "+this.wouldContinuo
                + "\n"+ "Would Perfect "+this.wouldPerfecto
                + "\n"+ "Would Perfect Continuous "+this.wouldPerfectoContinuo
                + "\n"+ "Could Simple "+this.couldsimple
                + "\n"+ "Could Continuous "+this.couldContinuo
                + "\n"+ "Could Perfect "+this.couldPerfecto
                + "\n"+ "Could Perfect Continuous "+this.couldPerfectoContinuo
                + "\n"+ "Might Simple "+this.mightsimple
                + "\n"+ "Might Continuous "+this.mightContinuo
                + "\n"+ "Might Perfect "+this.mightPerfecto
                + "\n"+ "Might Perfect Continuous "+this.mightPerfectoContinuo
                + "\n"+ "Can Simple "+this.cansimple
                + "\n"+ "Can Continuous "+this.canContinuo
                + "\n"+ "Must Simple "+this.mustsimple
                + "\n"+ "Must Continuous "+this.mustContinuo
                ;
    }
}
