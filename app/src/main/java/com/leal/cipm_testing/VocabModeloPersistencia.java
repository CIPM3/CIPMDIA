package com.leal.cipm_testing;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.List;

@IgnoreExtraProperties
public class VocabModeloPersistencia {

    List<String> resultArray, resultArrayStructure;
    boolean isInVocab,isInStructure,isInSpanishInt,isInCulture,isInPrager,isInTransition;

    public List<String> getResultArrayStructure() {
        return resultArrayStructure;
    }

    public void setResultArrayStructure(List<String> resultArrayStructure) {
        this.resultArrayStructure = resultArrayStructure;
    }

    public  VocabModeloPersistencia(){}

    public VocabModeloPersistencia(List<String> resultArray, boolean isInVocab,
                                   boolean isInStructure, boolean isInSpanishInt,
                                   boolean isInCulture, boolean isInPrager, boolean isInTransition) {
        this.resultArray = resultArray;
        this.isInVocab = isInVocab;
        this.isInStructure = isInStructure;
        this.isInSpanishInt = isInSpanishInt;
        this.isInCulture = isInCulture;
        this.isInPrager = isInPrager;
        this.isInTransition = isInTransition;
        this.resultArrayStructure = resultArrayStructure;
    }


    public VocabModeloPersistencia(List<String> resultArray, List<String> resultArrayStructure, boolean isInVocab,
                                   boolean isInStructure, boolean isInSpanishInt,
                                   boolean isInCulture, boolean isInPrager, boolean isInTransition) {
        this.resultArray = resultArray;
        this.isInVocab = isInVocab;
        this.isInStructure = isInStructure;
        this.isInSpanishInt = isInSpanishInt;
        this.isInCulture = isInCulture;
        this.isInPrager = isInPrager;
        this.isInTransition = isInTransition;
        this.resultArrayStructure = resultArrayStructure;
    }

    public List<String> getResultArray() {
        return resultArray;
    }

    public void setResultArray(List<String> resultArray) {
        this.resultArray = resultArray;
    }

    public boolean isInVocab() {
        return isInVocab;
    }

    public void setInVocab(boolean inVocab) {
        isInVocab = inVocab;
    }

    public boolean isInStructure() {
        return isInStructure;
    }

    public void setInStructure(boolean inStructure) {
        isInStructure = inStructure;
    }

    public boolean isInSpanishInt() {
        return isInSpanishInt;
    }

    public void setInSpanishInt(boolean inSpanishInt) {
        isInSpanishInt = inSpanishInt;
    }

    public boolean isInCulture() {
        return isInCulture;
    }

    public void setInCulture(boolean inCulture) {
        isInCulture = inCulture;
    }

    public boolean isInPrager() {
        return isInPrager;
    }

    public void setInPrager(boolean inPrager) {
        isInPrager = inPrager;
    }

    public boolean isInTransition() {
        return isInTransition;
    }

    public void setInTransition(boolean inTransition) {
        isInTransition = inTransition;
    }
}
