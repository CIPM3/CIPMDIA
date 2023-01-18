package com.leal.cipm_testing;


import androidx.annotation.NonNull;

public class Student {

    String name;
    boolean presentesimple, presenteContinuo, presentePerfecto, presentePerfectoContinuo;
    boolean pastsimple, pastContinuo, pastPerfecto, pastPerfectoContinuo;
    boolean futuresimple, futureContinuo, futurePerfecto, futurePerfectoContinuo;
    boolean wouldsimple, wouldContinuo, wouldPerfecto, wouldPerfectoContinuo;
    boolean couldsimple, couldContinuo, couldPerfecto, couldPerfectoContinuo;
    boolean mightsimple, mightContinuo, mightPerfecto, mightPerfectoContinuo;
    boolean cansimple, canContinuo, mustsimple, mustContinuo;
    boolean shouldsimple, shouldContinuo, shouldPerfecto, shouldPerfectoContinuo;
    boolean wantTo, forTo, supposedToPresent, wishPastPerfect, usedTo, beUsedTo;

    //LR
    boolean feelLikeSimple, reportedSpeech, incrementoParalelo, verbalAdjectives, relativeClause;
    boolean whatSimple, whatContinuous, whatPerfect, whatModalsSimple, whatModalsContinuous, whatModalsPerfect;
    boolean whenSimple, whenContinuous, whenPerfect, whenModalsSimple, whenModalsContinuous, whenModalsPerfect;
    boolean whereSimple, whereContinuous, wherePerfect, whereModalsSimple, whereModalsContinuous, whereModalsPerfect;
    boolean whySimple, whyContinuous, whyPerfect, whyModalsSimple, whyModalsContinuous, whyModalsPerfect;
    boolean whoSimple, whoContinuous, whoPerfect, whoModalsSimple, whoModalsContinuous, whoModalsPerfect;



    boolean vocab0a50;
    boolean vocab50a100;
    boolean vocab100a150;
    boolean vocab150a200;
    boolean vocab200a250;
    boolean vocab250a300;
    boolean vocab300a350;
    boolean vocab350a400;
    boolean vocab400a450;

    int presentesimpleint;
    //5 Agregar el modelo time y generar los get y set

    //PR
    String presentesimpletime;
    String presentecontinuotime;
    String presenteperfectotime;
    String presenteperfectocontinuotime;
    String pastsimpletime;
    String pastcontinuotime;
    String pastperfectotime;
    String pastperfectocontinuotime;
    String futurosimpletime;
    String futurocontinuotime;
    String futuroperfectotime;
    String futuroperfectocontinuotime;

    String wouldsimpletime;
    String wouldcontinuotime;
    String wouldperfectotime;
    String wouldperfectocontinuotime;

    String couldsimpletime;
    String couldcontinuotime;
    String couldperfectotime;
    String couldperfectocontinuotime;

    //LR
    String mightsimpletime, mightContinuotime ,mightPerfectotime ,mightPerfectoContinuotime ;
    String cansimpletime ,canContinuotime ,mustsimpletime ,mustContinuotime ;
    String shouldsimpletime ,shouldContinuotime ,shouldPerfectotime ,shouldPerfectoContinuotime ;
    String wantTotime ,forTotime ,supposedToPresenttime ,wishPastPerfecttime ,usedTotime ,beUsedTotime ;
    String feelLikeSimpletime, reportedSpeechtime, incrementoParalelotime, verbalAdjectivestime, relativeClausetime;
    String whatSimpletime, whatContinuoustime, whatPerfecttime, whatModalsSimpletime, whatModalsContinuoustime, whatModalsPerfecttime;
    String whenSimpletime, whenContinuoustime, whenPerfecttime, whenModalsSimpletime, whenModalsContinuoustime, whenModalsPerfecttime;
    String whereSimpletime, whereContinuoustime, wherePerfecttime, whereModalsSimpletime, whereModalsContinuoustime, whereModalsPerfecttime;
    String whySimpletime, whyContinuoustime, whyPerfecttime, whyModalsSimpletime, whyModalsContinuoustime, whyModalsPerfecttime;
    String whoSimpletime, whoContinuoustime, whoPerfecttime, whoModalsSimpletime, whoModalsContinuoustime, whoModalsPerfecttime;

    public int getPresentesimpleint() {
        return presentesimpleint;
    }

    public void setPresentesimpleint(int presentesimpleint) {
        this.presentesimpleint = presentesimpleint;
    }

    public String getPresentesimpletime() {
        return presentesimpletime;
    }

    public void setPresentesimpletime(String presentesimpletime) {
        this.presentesimpletime = presentesimpletime;
    }

    public Student() {

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

    //Vocab Getters and Setters
    public boolean isVocab0a50() {
        return vocab0a50;
    }
    public void setVocab0a50(boolean vocab0a50) {
        this.vocab0a50 = vocab0a50;
    }

    public boolean isVocab50a100() {
        return vocab50a100;
    }
    public void setVocab50a100(boolean vocab50a100) {
        this.vocab50a100 = vocab50a100;
    }

    public boolean isVocab100a150() {
        return vocab100a150;
    }
    public void setVocab100a150(boolean vocab100a150) {
        this.vocab100a150 = vocab100a150;
    }

    public boolean isVocab150a200() {
        return vocab150a200;
    }
    public void setVocab150a200(boolean vocab150a200) {
        this.vocab150a200 = vocab150a200;
    }

    public boolean isVocab200a250() {
        return vocab200a250;
    }
    public void setVocab200a250(boolean vocab200a250) {
        this.vocab200a250 = vocab200a250;
    }

    public boolean isVocab250a300() {
        return vocab250a300;
    }
    public void setVocab250a300(boolean vocab250a300) {
        this.vocab250a300 = vocab250a300;
    }

    public boolean isVocab300a350() {
        return vocab300a350;
    }
    public void setVocab300a350(boolean vocab300a350) {
        this.vocab300a350 = vocab300a350;
    }

    public boolean isVocab350a400() {
        return vocab350a400;
    }
    public void setVocab350a400(boolean vocab350a400) {
        this.vocab350a400 = vocab350a400;
    }

    public boolean isVocab400a450() {
        return vocab400a450;
    }
    public void setVocab400a450(boolean vocab400a450) {
        this.vocab400a450 = vocab400a450;
    }

 //PD

    public String getPresentecontinuotime() {
        return presentecontinuotime;
    }
    public void setPresentecontinuotime(String presentecontinuotime) {
        this.presentecontinuotime = presentecontinuotime;
    }

    public String getPresenteperfectotime() {
        return presenteperfectotime;
    }
    public void setPresenteperfectotime(String presenteperfectotime) {
        this.presenteperfectotime = presenteperfectotime;
    }

    public String getPresenteperfectocontinuotime() {
        return presenteperfectocontinuotime;
    }
    public void setPresenteperfectocontinuotime(String presenteperfectocontinuo) {
        this.presenteperfectocontinuotime = presenteperfectocontinuo;
    }

    public String getPastsimpletime() {
        return pastsimpletime;
    }
    public void setPastsimpletime(String pastsimpletime) {
        this.pastsimpletime = pastsimpletime;
    }

    public String getPastcontinuotime() {
        return pastcontinuotime;
    }
    public void setPastcontinuotime(String pastcontinuotime) {
        this.pastcontinuotime = pastcontinuotime;
    }

    public String getPastperfectotime() {
        return pastperfectotime;
    }
    public void setPastperfectotime(String pastperfectotime) {
        this.pastperfectotime = pastperfectotime;
    }

    public String getPastperfectocontinuotime() {
        return pastperfectocontinuotime;
    }
    public void setPastperfectocontinuotime(String pastperfectocontinuotime) {
        this.pastperfectocontinuotime = pastperfectocontinuotime;
    }

    public String getFuturosimpletime() {
        return futurosimpletime;
    }
    public void setFuturosimpletime(String futurosimpletime) {
        this.futurosimpletime = futurosimpletime;
    }

    public String getFuturocontinuotime() {
        return futurocontinuotime;
    }
    public void setFuturocontinuotime(String futurocontinuotime) {
        this.futurocontinuotime = futurocontinuotime;
    }

    public String getFuturoperfectotime() {
        return futuroperfectotime;
    }
    public void setFuturoperfectotime(String futuroperfectotime) {
        this.futuroperfectotime = futuroperfectotime;
    }

    public String getFuturoperfectocontinuotime() {
        return futuroperfectocontinuotime;
    }
    public void setFuturoperfectocontinuotime(String futuroperfectocontinuotime) {
        this.futuroperfectocontinuotime = futuroperfectocontinuotime;
    }

    public String getWouldsimpletime() {
        return wouldsimpletime;
    }
    public void setWouldsimpletime(String wouldsimpletime) {
        this.wouldsimpletime = wouldsimpletime;
    }

    public String getWouldcontinuotime() {
        return wouldcontinuotime;
    }
    public void setWouldcontinuotime(String wouldcontinuotime) {
        this.wouldcontinuotime = wouldcontinuotime;
    }

    public String getWouldperfectotime() {
        return wouldperfectotime;
    }
    public void setWouldperfectotime(String wouldperfectotime) {
        this.wouldperfectotime = wouldperfectotime;
    }

    public String getWouldperfectocontinuotime() {
        return wouldperfectocontinuotime;
    }
    public void setWouldperfectocontinuotime(String wouldperfectocontinuotime) {
        this.wouldperfectocontinuotime = wouldperfectocontinuotime;
    }

    public String getCouldsimpletime() {
        return couldsimpletime;
    }
    public void setCouldsimpletime(String couldsimpletime) {
        this.couldsimpletime = couldsimpletime;
    }

    public String getCouldcontinuotime() {
        return couldcontinuotime;
    }
    public void setCouldcontinuotime(String couldcontinuotime) {
        this.couldcontinuotime = couldcontinuotime;
    }

    public String getCouldperfectotime() {
        return couldperfectotime;
    }
    public void setCouldperfectotime(String couldperfectotime) {
        this.couldperfectotime = couldperfectotime;
    }

    public String getCouldperfectocontinuotime() {
        return couldperfectocontinuotime;
    }
    public void setCouldperfectocontinuotime(String couldperfectocontinuotime) {
        this.couldperfectocontinuotime = couldperfectocontinuotime;
    }

    //LR

    //might get y set
    public String getMightsimpletime() {
        return mightsimpletime;
    }
    public void setMightsimpletime(String mightsimpletime) {
        this.mightsimpletime = mightsimpletime;
    }
    public String getMightContinuotime() {
        return mightContinuotime;
    }
    public void setMightContinuotime(String mightContinuotime) {
        this.mightContinuotime = mightContinuotime;
    }
    public String getMightPerfectotime() {
        return mightPerfectotime;
    }
    public void setMightPerfectotime(String mightPerfectotime) {
        this.mightPerfectotime = mightPerfectotime;
    }
    public String getMightPerfectoContinuotime() {
        return mightPerfectoContinuotime;
    }
    public void setMightPerfectoContinuotime(String mightPerfectoContinuotime) {
        this.mightPerfectoContinuotime = mightPerfectoContinuotime;
    }

    //can get y set
    public String getCansimpletime() {
        return cansimpletime;
    }
    public void setCansimpletime(String cansimpletime) {
        this.cansimpletime = cansimpletime;
    }
    public String getCanContinuotime() {
        return canContinuotime;
    }
    public void setCanContinuotime(String canContinuotime) {
        this.canContinuotime = canContinuotime;
    }

    //must get y set
    public String getMustsimpletime() {
        return mustsimpletime;
    }
    public void setMustsimpletime(String mustsimpletime) {
        this.mustsimpletime = mustsimpletime;
    }
    public String getMustContinuotime() {
        return mustContinuotime;
    }
    public void setMustContinuotime(String mustContinuotime) {
        this.mustContinuotime = mustContinuotime;
    }

    //should get y set
    public String getShouldsimpletime() {
        return shouldsimpletime;
    }
    public void setShouldsimpletime(String shouldsimpletime) {
        this.shouldsimpletime = shouldsimpletime;
    }
    public String getShouldContinuotime() {
        return shouldContinuotime;
    }
    public void setShouldContinuotime(String shouldContinuotime) {
        this.shouldContinuotime = shouldContinuotime;
    }
    public String getShouldPerfectotime() {
        return shouldPerfectotime;
    }
    public void setShouldPerfectotime(String shouldPerfectotime) {
        this.shouldPerfectotime = shouldPerfectotime;
    }
    public String getShouldPerfectoContinuotime() {
        return shouldPerfectoContinuotime;
    }
    public void setShouldPerfectoContinuotime(String shouldPerfectoContinuotime) {
        this.shouldPerfectoContinuotime = shouldPerfectoContinuotime;
    }

    //others get y set
    public String getWantTotime() {
        return wantTotime;
    }
    public void setWantTotime(String wantTotime) {
        this.wantTotime = wantTotime;
    }
    public String getForTotime() {
        return forTotime;
    }
    public void setForTotime(String forTotime) {
        this.forTotime = forTotime;
    }
    public String getSupposedToPresenttime() {
        return supposedToPresenttime;
    }
    public void setSupposedToPresenttime(String supposedToPresenttime) {
        this.supposedToPresenttime = supposedToPresenttime;
    }
    public String getWishPastPerfecttime() {
        return wishPastPerfecttime;
    }
    public void setWishPastPerfecttime(String wishPastPerfecttime) {
        this.wishPastPerfecttime = wishPastPerfecttime;
    }
    public String getUsedTotime() {
        return usedTotime;
    }
    public void setUsedTotime(String usedTotime) {
        this.usedTotime = usedTotime;
    }
    public String getBeUsedTotime() {
        return beUsedTotime;
    }
    public void setBeUsedTotime(String beUsedTotime) {
        this.beUsedTotime = beUsedTotime;
    }

    //others get y set LR
    public boolean isFeelLikeSimple() {
        return feelLikeSimple;
    }
    public void setFeelLikeSimple(boolean feelLikeSimple) {
        this.feelLikeSimple = feelLikeSimple;
    }
    public boolean isReportedSpeech() {
        return reportedSpeech;
    }
    public void setReportedSpeech(boolean reportedSpeech) {
        this.reportedSpeech = reportedSpeech;
    }
    public boolean isIncrementoParalelo() {
        return incrementoParalelo;
    }
    public void setIncrementoParalelo(boolean incrementoParalelo) {
        this.incrementoParalelo = incrementoParalelo;
    }
    public boolean isVerbalAdjectives() {
        return verbalAdjectives;
    }
    public void setVerbalAdjectives(boolean verbalAdjectives) {
        this.verbalAdjectives = verbalAdjectives;
    }
    public boolean isRelativeClause() {
        return relativeClause;
    }
    public void setRelativeClause(boolean relativeClause) {
        this.relativeClause = relativeClause;
    }

    public String getRelativeClausetime() {
        return relativeClausetime;
    }
    public void setRelativeClausetime(String relativeClausetime) {
        this.relativeClausetime = relativeClausetime;
    }
    public String getFeelLikeSimpletime() {
        return feelLikeSimpletime;
    }
    public void setFeelLikeSimpletime(String feelLikeSimpletime) {
        this.feelLikeSimpletime = feelLikeSimpletime;
    }
    public String getReportedSpeechtime() {
        return reportedSpeechtime;
    }
    public void setReportedSpeechtime(String reportedSpeechtime) {
        this.reportedSpeechtime = reportedSpeechtime;
    }
    public String getIncrementoParalelotime() {
        return incrementoParalelotime;
    }
    public void setIncrementoParalelotime(String incrementoParalelotime) {
        this.incrementoParalelotime = incrementoParalelotime;
    }
    public String getVerbalAdjectivestime() {
        return verbalAdjectivestime;
    }
    public void setVerbalAdjectivestime(String verbalAdjectivestime) {
        this.verbalAdjectivestime = verbalAdjectivestime;
    }

    //Question with What
    public boolean isWhatSimple() {
        return whatSimple;
    }
    public void setWhatSimple(boolean whatSimple) {
        this.whatSimple = whatSimple;
    }
    public boolean isWhatContinuous() {
        return whatContinuous;
    }
    public void setWhatContinuous(boolean whatContinuous) {
        this.whatContinuous = whatContinuous;
    }
    public boolean isWhatPerfect() {
        return whatPerfect;
    }
    public void setWhatPerfect(boolean whatPerfect) {
        this.whatPerfect = whatPerfect;
    }
    public boolean isWhatModalsSimple() {
        return whatModalsSimple;
    }
    public void setWhatModalsSimple(boolean whatModalsSimple) {
        this.whatModalsSimple = whatModalsSimple;
    }
    public boolean isWhatModalsContinuous() {
        return whatModalsContinuous;
    }
    public void setWhatModalsContinuous(boolean whatModalsContinuous) {
        this.whatModalsContinuous = whatModalsContinuous;
    }
    public boolean isWhatModalsPerfect() {
        return whatModalsPerfect;
    }
    public void setWhatModalsPerfect(boolean whatModalsPerfect) {
        this.whatModalsPerfect = whatModalsPerfect;
    }

    public String getWhatSimpletime() {
        return whatSimpletime;
    }
    public void setWhatSimpletime(String whatSimpletime) {
        this.whatSimpletime = whatSimpletime;
    }
    public String getWhatContinuoustime() {
        return whatContinuoustime;
    }
    public void setWhatContinuoustime(String whatContinuoustime) {
        this.whatContinuoustime = whatContinuoustime;
    }
    public String getWhatPerfecttime() {
        return whatPerfecttime;
    }
    public void setWhatPerfecttime(String whatPerfecttime) {
        this.whatPerfecttime = whatPerfecttime;
    }
    public String getWhatModalsSimpletime() {
        return whatModalsSimpletime;
    }
    public void setWhatModalsSimpletime(String whatModalsSimpletime) {
        this.whatModalsSimpletime = whatModalsSimpletime;
    }
    public String getWhatModalsContinuoustime() {
        return whatModalsContinuoustime;
    }
    public void setWhatModalsContinuoustime(String whatModalsContinuoustime) {
        this.whatModalsContinuoustime = whatModalsContinuoustime;
    }
    public String getWhatModalsPerfecttime() {
        return whatModalsPerfecttime;
    }
    public void setWhatModalsPerfecttime(String whatModalsPerfecttime) {
        this.whatModalsPerfecttime = whatModalsPerfecttime;
    }

    //Question with When
    public boolean isWhenSimple() {
        return whenSimple;
    }
    public void setWhenSimple(boolean whenSimple) {
        this.whenSimple = whenSimple;
    }
    public boolean isWhenContinuous() {
        return whenContinuous;
    }
    public void setWhenContinuous(boolean whenContinuous) {
        this.whenContinuous = whenContinuous;
    }
    public boolean isWhenPerfect() {
        return whenPerfect;
    }
    public void setWhenPerfect(boolean whenPerfect) {
        this.whenPerfect = whenPerfect;
    }
    public boolean isWhenModalsSimple() {
        return whenModalsSimple;
    }
    public void setWhenModalsSimple(boolean whenModalsSimple) {
        this.whenModalsSimple = whenModalsSimple;
    }
    public boolean isWhenModalsContinuous() {
        return whenModalsContinuous;
    }
    public void setWhenModalsContinuous(boolean whenModalsContinuous) {
        this.whenModalsContinuous = whenModalsContinuous;
    }
    public boolean isWhenModalsPerfect() {
        return whenModalsPerfect;
    }
    public void setWhenModalsPerfect(boolean whenModalsPerfect) {
        this.whenModalsPerfect = whenModalsPerfect;
    }

    public String getWhenSimpletime() {
        return whenSimpletime;
    }
    public void setWhenSimpletime(String whenSimpletime) {
        this.whenSimpletime = whenSimpletime;
    }
    public String getWhenContinuoustime() {
        return whenContinuoustime;
    }
    public void setWhenContinuoustime(String whenContinuoustime) {
        this.whenContinuoustime = whenContinuoustime;
    }
    public String getWhenPerfecttime() {
        return whenPerfecttime;
    }
    public void setWhenPerfecttime(String whenPerfecttime) {
        this.whenPerfecttime = whenPerfecttime;
    }
    public String getWhenModalsSimpletime() {
        return whenModalsSimpletime;
    }
    public void setWhenModalsSimpletime(String whenModalsSimpletime) {
        this.whenModalsSimpletime = whenModalsSimpletime;
    }
    public String getWhenModalsContinuoustime() {
        return whenModalsContinuoustime;
    }
    public void setWhenModalsContinuoustime(String whenModalsContinuoustime) {
        this.whenModalsContinuoustime = whenModalsContinuoustime;
    }
    public String getWhenModalsPerfecttime() {
        return whenModalsPerfecttime;
    }
    public void setWhenModalsPerfecttime(String whenModalsPerfecttime) {
        this.whenModalsPerfecttime = whenModalsPerfecttime;
    }

    //Question with Where
    public boolean isWhereSimple() {
        return whereSimple;
    }
    public void setWhereSimple(boolean whereSimple) {
        this.whereSimple = whereSimple;
    }
    public boolean isWhereContinuous() {
        return whereContinuous;
    }
    public void setWhereContinuous(boolean whereContinuous) {
        this.whereContinuous = whereContinuous;
    }
    public boolean isWherePerfect() {
        return wherePerfect;
    }
    public void setWherePerfect(boolean wherePerfect) {
        this.wherePerfect = wherePerfect;
    }
    public boolean isWhereModalsSimple() {
        return whereModalsSimple;
    }
    public void setWhereModalsSimple(boolean whereModalsSimple) {
        this.whereModalsSimple = whereModalsSimple;
    }
    public boolean isWhereModalsContinuous() {
        return whereModalsContinuous;
    }
    public void setWhereModalsContinuous(boolean whereModalsContinuous) {
        this.whereModalsContinuous = whereModalsContinuous;
    }
    public boolean isWhereModalsPerfect() {
        return whereModalsPerfect;
    }
    public void setWhereModalsPerfect(boolean whereModalsPerfect) {
        this.whereModalsPerfect = whereModalsPerfect;
    }

    public String getWhereSimpletime() {
        return whereSimpletime;
    }
    public void setWhereSimpletime(String whereSimpletime) {
        this.whereSimpletime = whereSimpletime;
    }
    public String getWhereContinuoustime() {
        return whereContinuoustime;
    }
    public void setWhereContinuoustime(String whereContinuoustime) {
        this.whereContinuoustime = whereContinuoustime;
    }
    public String getWherePerfecttime() {
        return wherePerfecttime;
    }
    public void setWherePerfecttime(String wherePerfecttime) {
        this.wherePerfecttime = wherePerfecttime;
    }
    public String getWhereModalsSimpletime() {
        return whereModalsSimpletime;
    }
    public void setWhereModalsSimpletime(String whereModalsSimpletime) {
        this.whereModalsSimpletime = whereModalsSimpletime;
    }
    public String getWhereModalsContinuoustime() {
        return whereModalsContinuoustime;
    }
    public void setWhereModalsContinuoustime(String whereModalsContinuoustime) {
        this.whereModalsContinuoustime = whereModalsContinuoustime;
    }
    public String getWhereModalsPerfecttime() {
        return whereModalsPerfecttime;
    }
    public void setWhereModalsPerfecttime(String whereModalsPerfecttime) {
        this.whereModalsPerfecttime = whereModalsPerfecttime;
    }

    //Question with Why
    public boolean isWhySimple() {
        return whySimple;
    }
    public void setWhySimple(boolean whySimple) {
        this.whySimple = whySimple;
    }
    public boolean isWhyContinuous() {
        return whyContinuous;
    }
    public void setWhyContinuous(boolean whyContinuous) {
        this.whyContinuous = whyContinuous;
    }
    public boolean isWhyPerfect() {
        return whyPerfect;
    }
    public void setWhyPerfect(boolean whyPerfect) {
        this.whyPerfect = whyPerfect;
    }
    public boolean isWhyModalsSimple() {
        return whyModalsSimple;
    }
    public void setWhyModalsSimple(boolean whyModalsSimple) {
        this.whyModalsSimple = whyModalsSimple;
    }
    public boolean isWhyModalsContinuous() {
        return whyModalsContinuous;
    }
    public void setWhyModalsContinuous(boolean whyModalsContinuous) {
        this.whyModalsContinuous = whyModalsContinuous;
    }
    public boolean isWhyModalsPerfect() {
        return whyModalsPerfect;
    }
    public void setWhyModalsPerfect(boolean whyModalsPerfect) {
        this.whyModalsPerfect = whyModalsPerfect;
    }

    public String getWhySimpletime() {
        return whySimpletime;
    }
    public void setWhySimpletime(String whySimpletime) {
        this.whySimpletime = whySimpletime;
    }
    public String getWhyContinuoustime() {
        return whyContinuoustime;
    }
    public void setWhyContinuoustime(String whyContinuoustime) {
        this.whyContinuoustime = whyContinuoustime;
    }
    public String getWhyPerfecttime() {
        return whyPerfecttime;
    }
    public void setWhyPerfecttime(String whyPerfecttime) {
        this.whyPerfecttime = whyPerfecttime;
    }
    public String getWhyModalsSimpletime() {
        return whyModalsSimpletime;
    }
    public void setWhyModalsSimpletime(String whyModalsSimpletime) {
        this.whyModalsSimpletime = whyModalsSimpletime;
    }
    public String getWhyModalsContinuoustime() {
        return whyModalsContinuoustime;
    }
    public void setWhyModalsContinuoustime(String whyModalsContinuoustime) {
        this.whyModalsContinuoustime = whyModalsContinuoustime;
    }
    public String getWhyModalsPerfecttime() {
        return whyModalsPerfecttime;
    }
    public void setWhyModalsPerfecttime(String whyModalsPerfecttime) {
        this.whyModalsPerfecttime = whyModalsPerfecttime;
    }

    //Question with Who
    public boolean isWhoSimple() {
        return whoSimple;
    }
    public void setWhoSimple(boolean whoSimple) {
        this.whoSimple = whoSimple;
    }
    public boolean isWhoContinuous() {
        return whoContinuous;
    }
    public void setWhoContinuous(boolean whoContinuous) {
        this.whoContinuous = whoContinuous;
    }
    public boolean isWhoPerfect() {
        return whoPerfect;
    }
    public void setWhoPerfect(boolean whoPerfect) {
        this.whoPerfect = whoPerfect;
    }
    public boolean isWhoModalsSimple() {
        return whoModalsSimple;
    }
    public void setWhoModalsSimple(boolean whoModalsSimple) {
        this.whoModalsSimple = whoModalsSimple;
    }
    public boolean isWhoModalsContinuous() {
        return whoModalsContinuous;
    }
    public void setWhoModalsContinuous(boolean whoModalsContinuous) {
        this.whoModalsContinuous = whoModalsContinuous;
    }
    public boolean isWhoModalsPerfect() {
        return whoModalsPerfect;
    }
    public void setWhoModalsPerfect(boolean whoModalsPerfect) {
        this.whoModalsPerfect = whoModalsPerfect;
    }

    public String getWhoSimpletime() {
        return whoSimpletime;
    }
    public void setWhoSimpletime(String whoSimpletime) {
        this.whoSimpletime = whoSimpletime;
    }
    public String getWhoContinuoustime() {
        return whoContinuoustime;
    }
    public void setWhoContinuoustime(String whoContinuoustime) {
        this.whoContinuoustime = whoContinuoustime;
    }
    public String getWhoPerfecttime() {
        return whoPerfecttime;
    }
    public void setWhoPerfecttime(String whoPerfecttime) {
        this.whoPerfecttime = whoPerfecttime;
    }
    public String getWhoModalsSimpletime() {
        return whoModalsSimpletime;
    }
    public void setWhoModalsSimpletime(String whoModalsSimpletime) {
        this.whoModalsSimpletime = whoModalsSimpletime;
    }
    public String getWhoModalsContinuoustime() {
        return whoModalsContinuoustime;
    }
    public void setWhoModalsContinuoustime(String whoModalsContinuoustime) {
        this.whoModalsContinuoustime = whoModalsContinuoustime;
    }
    public String getWhoModalsPerfecttime() {
        return whoModalsPerfecttime;
    }
    public void setWhoModalsPerfecttime(String whoModalsPerfecttime) {
        this.whoModalsPerfecttime = whoModalsPerfecttime;
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

                + "\n"+ "Feel Like Simple "+this.feelLikeSimple
                + "\n"+ "Reported Speech "+this.reportedSpeech
                + "\n"+ "Incremento Paralelo "+this.incrementoParalelo
                + "\n"+ "Verbal Adjectives "+this.verbalAdjectives
                + "\n"+ "Relative Clause "+this.relativeClause

                + "\n"+ "What Simple "+this.whatSimple
                + "\n"+ "What Continuous "+this.whatContinuous
                + "\n"+ "What Perfect "+this.whatPerfect
                + "\n"+ "What Modals Simple "+this.whatModalsSimple
                + "\n"+ "What Modals Continuous "+this.whatModalsContinuous
                + "\n"+ "What Modals Perfect "+this.whatModalsPerfect

                + "\n"+ "When Simple "+this.whenSimple
                + "\n"+ "When Continuous "+this.whenContinuous
                + "\n"+ "When Perfect "+this.whenPerfect
                + "\n"+ "When Modals Simple "+this.whenModalsSimple
                + "\n"+ "When Modals Continuous "+this.whenModalsContinuous
                + "\n"+ "When Modals Perfect "+this.whenModalsPerfect

                + "\n"+ "Where  Simple "+this.whereSimple
                + "\n"+ "Where Continuous "+this.whereContinuous
                + "\n"+ "Where Perfect "+this.wherePerfect
                + "\n"+ "Where Modals Simple "+this.whereModalsSimple
                + "\n"+ "Where Modals Continuous "+this.whereModalsContinuous
                + "\n"+ "Where Modals Perfect "+this.whereModalsPerfect

                + "\n"+ "Why  Simple "+this.whySimple
                + "\n"+ "Why Continuous "+this.whyContinuous
                + "\n"+ "Why Perfect "+this.whyPerfect
                + "\n"+ "Why Modals Simple "+this.whyModalsSimple
                + "\n"+ "Why Modals Continuous "+this.whyModalsContinuous
                + "\n"+ "Why Modals Perfect "+this.whyModalsPerfect

                + "\n"+ "Who  Simple "+this.whoSimple
                + "\n"+ "Who Continuous "+this.whoContinuous
                + "\n"+ "Who Perfect "+this.whoPerfect
                + "\n"+ "Who Modals Simple "+this.whoModalsSimple
                + "\n"+ "Who Modals Continuous "+this.whoModalsContinuous
                + "\n"+ "Who Modals Perfect "+this.whoModalsPerfect

                + "\n"+ "0 a 50 "+this.vocab0a50
                + "\n"+ "50 a 100 "+this.vocab50a100
                + "\n"+ "100 a 150 "+this.vocab100a150
                + "\n"+ "150 a 200 "+this.vocab150a200
                + "\n"+ "200 a 250 "+this.vocab200a250
                + "\n"+ "250 a 300 "+this.vocab250a300
                + "\n"+ "300 a 350 "+this.vocab300a350
                + "\n"+ "350 a 400 "+this.vocab350a400
                + "\n"+ "400 a 450 "+this.vocab400a450

                ;
    }
}
