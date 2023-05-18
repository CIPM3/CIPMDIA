package com.leal.cipm_testing;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.List;

@IgnoreExtraProperties
public class VocabModeloPersistencia {

    public List<String> resultArray, basicStructuresArray,nonBasicStructuresArray;
    boolean isInVocab,isInStructure,isInSpanishInt,
            isInCulture,isInPrager,isInTransition,isInintCon,
    isPlanIntermedioStandard,isPlanBasicRecommended,
            isCustomPlan,isListeningPlan,isAdvancedPlan;

    public VocabModeloPersistencia(List<String> resultArray,
                                   boolean isInVocab, boolean isInStructure,
                                   boolean isInSpanishInt, boolean isInCulture, boolean isInPrager,
                                   boolean isInTransition, boolean isInintCon, boolean isPlanIntermedioStandard,
                                   boolean isPlanBasicRecommended, boolean isCustomPlan, boolean isListeningPlan,
                                   boolean isAdvancedPlan) {
        this.resultArray = resultArray;
        this.basicStructuresArray = basicStructuresArray;
        this.nonBasicStructuresArray = nonBasicStructuresArray;
        this.isInVocab = isInVocab;
        this.isInStructure = isInStructure;
        this.isInSpanishInt = isInSpanishInt;
        this.isInCulture = isInCulture;
        this.isInPrager = isInPrager;
        this.isInTransition = isInTransition;
        this.isInintCon = isInintCon;
        this.isPlanIntermedioStandard = isPlanIntermedioStandard;
        this.isPlanBasicRecommended = isPlanBasicRecommended;
        this.isCustomPlan = isCustomPlan;
        this.isListeningPlan = isListeningPlan;
        this.isAdvancedPlan = isAdvancedPlan;
    }

    public boolean isPlanIntermedioStandard() {
        return isPlanIntermedioStandard;
    }

    public void setPlanIntermedioStandard(boolean planIntermedioStandard) {
        isPlanIntermedioStandard = planIntermedioStandard;
    }

    public boolean isPlanBasicRecommended() {
        return isPlanBasicRecommended;
    }

    public void setPlanBasicRecommended(boolean planBasicRecommended) {
        isPlanBasicRecommended = planBasicRecommended;
    }

    public boolean isCustomPlan() {
        return isCustomPlan;
    }

    public void setCustomPlan(boolean customPlan) {
        isCustomPlan = customPlan;
    }

    public boolean isListeningPlan() {
        return isListeningPlan;
    }

    public void setListeningPlan(boolean listeningPlan) {
        isListeningPlan = listeningPlan;
    }

    public boolean isAdvancedPlan() {
        return isAdvancedPlan;
    }

    public void setAdvancedPlan(boolean advancedPlan) {
        isAdvancedPlan = advancedPlan;
    }

    public VocabModeloPersistencia(List<String> resultArray, List<String> basicStructuresArray,
                                   boolean isInVocab, boolean isInStructure, boolean isInSpanishInt,
                                   boolean isInCulture, boolean isInPrager,
                                   boolean isInTransition, boolean isInintCon) {
        this.resultArray = resultArray;
        this.basicStructuresArray = basicStructuresArray;
        this.isInVocab = isInVocab;
        this.isInStructure = isInStructure;
        this.isInSpanishInt = isInSpanishInt;
        this.isInCulture = isInCulture;
        this.isInPrager = isInPrager;
        this.isInTransition = isInTransition;
        this.isInintCon = isInintCon;
    }

    public VocabModeloPersistencia(List<String> resultArray, List<String> basicStructuresArray,List<String> nonBasicStructuresArray,
                                   boolean isInVocab, boolean isInStructure, boolean isInSpanishInt,
                                   boolean isInCulture, boolean isInPrager,
                                   boolean isInTransition, boolean isInintCon) {
        this.resultArray = resultArray;
        this.basicStructuresArray = basicStructuresArray;
        this.isInVocab = isInVocab;
        this.isInStructure = isInStructure;
        this.isInSpanishInt = isInSpanishInt;
        this.isInCulture = isInCulture;
        this.isInPrager = isInPrager;
        this.isInTransition = isInTransition;
        this.isInintCon = isInintCon;
        this.nonBasicStructuresArray=nonBasicStructuresArray;
    }
    public  VocabModeloPersistencia(){}

    public VocabModeloPersistencia(List<String> resultArray, boolean isInVocab,
                                   boolean isInStructure, boolean isInSpanishInt,
                                   boolean isInCulture, boolean isInPrager, boolean isInTransition,boolean isInintCon) {
        this.resultArray = resultArray;
        this.isInVocab = isInVocab;
        this.isInStructure = isInStructure;
        this.isInSpanishInt = isInSpanishInt;
        this.isInCulture = isInCulture;
        this.isInPrager = isInPrager;
        this.isInTransition = isInTransition;
        this.isInintCon= isInintCon;
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
        this.basicStructuresArray = resultArrayStructure;
    }



    public List<String> getNonBasicStructuresArray() {
        return nonBasicStructuresArray;
    }

    public void setNonBasicStructuresArray(List<String> nonBasicStructuresArray) {
        this.nonBasicStructuresArray = nonBasicStructuresArray;
    }

    public boolean isInintCon() {
        return isInintCon;
    }

    public void setInintCon(boolean inintCon) {
        isInintCon = inintCon;
    }

    public List<String> getBasicStructuresArray() {
        return basicStructuresArray;
    }

    public void setBasicStructuresArray(List<String> basicStructuresArray) {
        this.basicStructuresArray = basicStructuresArray;
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
