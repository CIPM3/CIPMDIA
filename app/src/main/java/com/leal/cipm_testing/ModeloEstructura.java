package com.leal.cipm_testing;

public class ModeloEstructura {
    int StructureCounter;
    boolean PresenteSimple;
    boolean PresenteContinuo,PresentePerfecto,PresentePerfectoContinuo;
    boolean PasadoSimple,PasadoContinuo,PasadoPerfecto,PasadoPerfectoContinuo;
    boolean FuturoSimple,FuturoContinuo,FuturoPerfecto,FuturoPerfectoContinuo;
    boolean WouldSimple,WouldContinuo,WouldPerfecto,WouldPerfectoContinuo;
    boolean CouldSimple,CouldContinuo,CouldPerfecto,CouldPerfectoContinuo;
    boolean MightSimple;
    boolean MightContinuous;
    boolean MightPerfect;
    boolean MightPerfectContinuous;
    boolean ShouldSimple;
    boolean ShouldContinuous;
    boolean ShouldPerfect;
    boolean ShouldPerfectContinuous;
    boolean CanSimple;
    boolean CanContinuous;
    boolean MustSimple;
    boolean MustContinuous;
    boolean WhatSimple;
    boolean WhatContinuous;
    boolean WhatPerfect;
    boolean WhatModalsSimple;
    boolean WhatModalsContinuous;
    boolean WhatModalsPerfect;
    boolean WhenSimple;
    boolean WhenContinuous;
    boolean WhenPerfect;
    boolean WhenModalsSimple;
    boolean WhenModalsContinuous;
    boolean WhenModalsPerfect;
    boolean WhereSimple;
    boolean WhereContinuous;
    boolean WherePerfect;
    boolean WhereModalsSimple;
    boolean WhereModalsContinuous;
    boolean WhereModalsPerfect;
    boolean WhySimple;
    boolean WhyContinuous;
    boolean WhyPerfect;
    boolean WhyModalsSimple;
    boolean WhyModalsContinuous;
    boolean WhyModalsPerfect;
    boolean HowSimple;
    boolean HowContinuous;
    boolean HowPerfect;
    boolean HowModalsSimple;
    boolean HowModalsContinuous;
    boolean HowModalsPerfect;
    boolean QuestionStructure;
    boolean QuestionStructureModals;
    boolean AbleTo;
    boolean ReportedSpeech;
    boolean IncrementoParalelo;
    boolean VerbalAdjectives;
    boolean RelativeClause;
    boolean WantTo;
    boolean ForTo;
    boolean SupposedToPresent;
    boolean WishPastPerfect;
    boolean UsedTo;
    boolean BeUsedTo;
    double AvanceStructura,tdrStructure;



    public ModeloEstructura() {
    }

    public double getAvanceStructura() {
        return AvanceStructura;
    }

    public void setAvanceStructura(double avanceStructura) {
        AvanceStructura = avanceStructura;
    }

    public double getTdrStructure() {
        return tdrStructure;
    }

    public void setTdrStructure(double tdrStructure) {
        this.tdrStructure = tdrStructure;
    }

    public boolean isWhereSimple() {
        return WhereSimple;
    }

    public void setWhereSimple(boolean whereSimple) {
        WhereSimple = whereSimple;
    }

    public boolean isWhereContinuous() {
        return WhereContinuous;
    }

    public void setWhereContinuous(boolean whereContinuous) {
        WhereContinuous = whereContinuous;
    }

    public boolean isWherePerfect() {
        return WherePerfect;
    }

    public void setWherePerfect(boolean wherePerfect) {
        WherePerfect = wherePerfect;
    }

    public boolean isWhereModalsSimple() {
        return WhereModalsSimple;
    }

    public void setWhereModalsSimple(boolean whereModalsSimple) {
        WhereModalsSimple = whereModalsSimple;
    }

    public boolean isWhereModalsContinuous() {
        return WhereModalsContinuous;
    }

    public void setWhereModalsContinuous(boolean whereModalsContinuous) {
        WhereModalsContinuous = whereModalsContinuous;
    }

    public boolean isWhereModalsPerfect() {
        return WhereModalsPerfect;
    }

    public void setWhereModalsPerfect(boolean whereModalsPerfect) {
        WhereModalsPerfect = whereModalsPerfect;
    }

    public boolean isWhySimple() {
        return WhySimple;
    }

    public void setWhySimple(boolean whySimple) {
        WhySimple = whySimple;
    }

    public boolean isWhyContinuous() {
        return WhyContinuous;
    }

    public void setWhyContinuous(boolean whyContinuous) {
        WhyContinuous = whyContinuous;
    }

    public boolean isWhyPerfect() {
        return WhyPerfect;
    }

    public void setWhyPerfect(boolean whyPerfect) {
        WhyPerfect = whyPerfect;
    }

    public boolean isWhyModalsSimple() {
        return WhyModalsSimple;
    }

    public void setWhyModalsSimple(boolean whyModalsSimple) {
        WhyModalsSimple = whyModalsSimple;
    }

    public boolean isWhyModalsContinuous() {
        return WhyModalsContinuous;
    }

    public void setWhyModalsContinuous(boolean whyModalsContinuous) {
        WhyModalsContinuous = whyModalsContinuous;
    }

    public boolean isWhyModalsPerfect() {
        return WhyModalsPerfect;
    }

    public void setWhyModalsPerfect(boolean whyModalsPerfect) {
        WhyModalsPerfect = whyModalsPerfect;
    }

    public boolean isHowSimple() {
        return HowSimple;
    }

    public void setHowSimple(boolean howSimple) {
        HowSimple = howSimple;
    }

    public boolean isHowContinuous() {
        return HowContinuous;
    }

    public void setHowContinuous(boolean howContinuous) {
        HowContinuous = howContinuous;
    }

    public boolean isHowPerfect() {
        return HowPerfect;
    }

    public void setHowPerfect(boolean howPerfect) {
        HowPerfect = howPerfect;
    }

    public boolean isHowModalsSimple() {
        return HowModalsSimple;
    }

    public void setHowModalsSimple(boolean howModalsSimple) {
        HowModalsSimple = howModalsSimple;
    }

    public boolean isHowModalsContinuous() {
        return HowModalsContinuous;
    }

    public void setHowModalsContinuous(boolean howModalsContinuous) {
        HowModalsContinuous = howModalsContinuous;
    }

    public boolean isHowModalsPerfect() {
        return HowModalsPerfect;
    }

    public void setHowModalsPerfect(boolean howModalsPerfect) {
        HowModalsPerfect = howModalsPerfect;
    }

    public boolean isQuestionStructure() {
        return QuestionStructure;
    }

    public void setQuestionStructure(boolean questionStructure) {
        QuestionStructure = questionStructure;
    }

    public boolean isQuestionStructureModals() {
        return QuestionStructureModals;
    }

    public void setQuestionStructureModals(boolean questionStructureModals) {
        QuestionStructureModals = questionStructureModals;
    }

    public boolean isAbleTo() {
        return AbleTo;
    }

    public void setAbleTo(boolean ableTo) {
        AbleTo = ableTo;
    }

    public boolean isReportedSpeech() {
        return ReportedSpeech;
    }

    public void setReportedSpeech(boolean reportedSpeech) {
        ReportedSpeech = reportedSpeech;
    }

    public boolean isIncrementoParalelo() {
        return IncrementoParalelo;
    }

    public void setIncrementoParalelo(boolean incrementoParalelo) {
        IncrementoParalelo = incrementoParalelo;
    }

    public boolean isVerbalAdjectives() {
        return VerbalAdjectives;
    }

    public void setVerbalAdjectives(boolean verbalAdjectives) {
        VerbalAdjectives = verbalAdjectives;
    }

    public boolean isRelativeClause() {
        return RelativeClause;
    }

    public void setRelativeClause(boolean relativeClause) {
        RelativeClause = relativeClause;
    }

    public boolean isWantTo() {
        return WantTo;
    }

    public void setWantTo(boolean wantTo) {
        WantTo = wantTo;
    }

    public boolean isForTo() {
        return ForTo;
    }

    public void setForTo(boolean forTo) {
        ForTo = forTo;
    }

    public boolean isSupposedToPresent() {
        return SupposedToPresent;
    }

    public void setSupposedToPresent(boolean supposedToPresent) {
        SupposedToPresent = supposedToPresent;
    }

    public boolean isWishPastPerfect() {
        return WishPastPerfect;
    }

    public void setWishPastPerfect(boolean wishPastPerfect) {
        WishPastPerfect = wishPastPerfect;
    }

    public boolean isUsedTo() {
        return UsedTo;
    }

    public void setUsedTo(boolean usedTo) {
        UsedTo = usedTo;
    }

    public boolean isBeUsedTo() {
        return BeUsedTo;
    }

    public void setBeUsedTo(boolean beUsedTo) {
        BeUsedTo = beUsedTo;
    }

    public boolean isMightSimple() {
        return MightSimple;
    }

    public void setMightSimple(boolean mightSimple) {
        MightSimple = mightSimple;
    }

    public boolean isMightContinuous() {
        return MightContinuous;
    }

    public void setMightContinuous(boolean mightContinuous) {
        MightContinuous = mightContinuous;
    }

    public boolean isMightPerfect() {
        return MightPerfect;
    }

    public void setMightPerfect(boolean mightPerfect) {
        MightPerfect = mightPerfect;
    }

    public boolean isMightPerfectContinuous() {
        return MightPerfectContinuous;
    }

    public void setMightPerfectContinuous(boolean mightPerfectContinuous) {
        MightPerfectContinuous = mightPerfectContinuous;
    }

    public boolean isShouldSimple() {
        return ShouldSimple;
    }

    public void setShouldSimple(boolean shouldSimple) {
        ShouldSimple = shouldSimple;
    }

    public boolean isShouldContinuous() {
        return ShouldContinuous;
    }

    public void setShouldContinuous(boolean shouldContinuous) {
        ShouldContinuous = shouldContinuous;
    }

    public boolean isShouldPerfect() {
        return ShouldPerfect;
    }

    public void setShouldPerfect(boolean shouldPerfect) {
        ShouldPerfect = shouldPerfect;
    }

    public boolean isShouldPerfectContinuous() {
        return ShouldPerfectContinuous;
    }

    public void setShouldPerfectContinuous(boolean shouldPerfectContinuous) {
        ShouldPerfectContinuous = shouldPerfectContinuous;
    }

    public boolean isCanSimple() {
        return CanSimple;
    }

    public void setCanSimple(boolean canSimple) {
        CanSimple = canSimple;
    }

    public boolean isCanContinuous() {
        return CanContinuous;
    }

    public void setCanContinuous(boolean canContinuous) {
        CanContinuous = canContinuous;
    }

    public boolean isMustSimple() {
        return MustSimple;
    }

    public void setMustSimple(boolean mustSimple) {
        MustSimple = mustSimple;
    }

    public boolean isMustContinuous() {
        return MustContinuous;
    }

    public void setMustContinuous(boolean mustContinuous) {
        MustContinuous = mustContinuous;
    }

    public boolean isWhatSimple() {
        return WhatSimple;
    }

    public void setWhatSimple(boolean whatSimple) {
        WhatSimple = whatSimple;
    }

    public boolean isWhatContinuous() {
        return WhatContinuous;
    }

    public void setWhatContinuous(boolean whatContinuous) {
        WhatContinuous = whatContinuous;
    }

    public boolean isWhatPerfect() {
        return WhatPerfect;
    }

    public void setWhatPerfect(boolean whatPerfect) {
        WhatPerfect = whatPerfect;
    }

    public boolean isWhatModalsSimple() {
        return WhatModalsSimple;
    }

    public void setWhatModalsSimple(boolean whatModalsSimple) {
        WhatModalsSimple = whatModalsSimple;
    }

    public boolean isWhatModalsContinuous() {
        return WhatModalsContinuous;
    }

    public void setWhatModalsContinuous(boolean whatModalsContinuous) {
        WhatModalsContinuous = whatModalsContinuous;
    }

    public boolean isWhatModalsPerfect() {
        return WhatModalsPerfect;
    }

    public void setWhatModalsPerfect(boolean whatModalsPerfect) {
        WhatModalsPerfect = whatModalsPerfect;
    }

    public boolean isWhenSimple() {
        return WhenSimple;
    }

    public void setWhenSimple(boolean whenSimple) {
        WhenSimple = whenSimple;
    }

    public boolean isWhenContinuous() {
        return WhenContinuous;
    }

    public void setWhenContinuous(boolean whenContinuous) {
        WhenContinuous = whenContinuous;
    }

    public boolean isWhenPerfect() {
        return WhenPerfect;
    }

    public void setWhenPerfect(boolean whenPerfect) {
        WhenPerfect = whenPerfect;
    }

    public boolean isWhenModalsSimple() {
        return WhenModalsSimple;
    }

    public void setWhenModalsSimple(boolean whenModalsSimple) {
        WhenModalsSimple = whenModalsSimple;
    }

    public boolean isWhenModalsContinuous() {
        return WhenModalsContinuous;
    }

    public void setWhenModalsContinuous(boolean whenModalsContinuous) {
        WhenModalsContinuous = whenModalsContinuous;
    }

    public boolean isWhenModalsPerfect() {
        return WhenModalsPerfect;
    }

    public void setWhenModalsPerfect(boolean whenModalsPerfect) {
        WhenModalsPerfect = whenModalsPerfect;
    }

    public boolean isCouldSimple() {
        return CouldSimple;
    }

    public void setCouldSimple(boolean couldSimple) {
        CouldSimple = couldSimple;
    }

    public boolean isCouldContinuo() {
        return CouldContinuo;
    }

    public void setCouldContinuo(boolean couldContinuo) {
        CouldContinuo = couldContinuo;
    }

    public boolean isCouldPerfecto() {
        return CouldPerfecto;
    }

    public void setCouldPerfecto(boolean couldPerfecto) {
        CouldPerfecto = couldPerfecto;
    }

    public boolean isCouldPerfectoContinuo() {
        return CouldPerfectoContinuo;
    }

    public void setCouldPerfectoContinuo(boolean couldPerfectoContinuo) {
        CouldPerfectoContinuo = couldPerfectoContinuo;
    }

    public boolean isWouldSimple() {
        return WouldSimple;
    }

    public void setWouldSimple(boolean wouldSimple) {
        WouldSimple = wouldSimple;
    }

    public boolean isWouldContinuo() {
        return WouldContinuo;
    }

    public void setWouldContinuo(boolean wouldContinuo) {
        WouldContinuo = wouldContinuo;
    }

    public boolean isWouldPerfecto() {
        return WouldPerfecto;
    }

    public void setWouldPerfecto(boolean wouldPerfecto) {
        WouldPerfecto = wouldPerfecto;
    }

    public boolean isWouldPerfectoContinuo() {
        return WouldPerfectoContinuo;
    }

    public void setWouldPerfectoContinuo(boolean wouldPerfectoContinuo) {
        WouldPerfectoContinuo = wouldPerfectoContinuo;
    }

    public boolean isFuturoSimple() {
        return FuturoSimple;
    }

    public void setFuturoSimple(boolean futuroSimple) {
        FuturoSimple = futuroSimple;
    }

    public boolean isFuturoContinuo() {
        return FuturoContinuo;
    }

    public void setFuturoContinuo(boolean futuroContinuo) {
        FuturoContinuo = futuroContinuo;
    }

    public boolean isFuturoPerfecto() {
        return FuturoPerfecto;
    }

    public void setFuturoPerfecto(boolean futuroPerfecto) {
        FuturoPerfecto = futuroPerfecto;
    }

    public boolean isFuturoPerfectoContinuo() {
        return FuturoPerfectoContinuo;
    }

    public void setFuturoPerfectoContinuo(boolean futuroPerfectoContinuo) {
        FuturoPerfectoContinuo = futuroPerfectoContinuo;
    }

    public boolean isPresentePerfectoContinuo() {
        return PresentePerfectoContinuo;
    }

    public void setPresentePerfectoContinuo(boolean presentePerfectoContinuo) {
        PresentePerfectoContinuo = presentePerfectoContinuo;
    }

    public boolean isPasadoSimple() {
        return PasadoSimple;
    }

    public void setPasadoSimple(boolean pasadoSimple) {
        PasadoSimple = pasadoSimple;
    }

    public boolean isPasadoContinuo() {
        return PasadoContinuo;
    }

    public void setPasadoContinuo(boolean pasadoContinuo) {
        PasadoContinuo = pasadoContinuo;
    }

    public boolean isPasadoPerfecto() {
        return PasadoPerfecto;
    }

    public void setPasadoPerfecto(boolean pasadoPerfecto) {
        PasadoPerfecto = pasadoPerfecto;
    }

    public boolean isPasadoPerfectoContinuo() {
        return PasadoPerfectoContinuo;
    }

    public void setPasadoPerfectoContinuo(boolean pasadoPerfectoContinuo) {
        PasadoPerfectoContinuo = pasadoPerfectoContinuo;
    }

    public boolean isPresentePerfecto() {
        return PresentePerfecto;
    }

    public void setPresentePerfecto(boolean presentePerfecto) {
        PresentePerfecto = presentePerfecto;
    }

    public boolean isPresenteContinuo() {
        return PresenteContinuo;
    }

    public void setPresenteContinuo(boolean presenteContinuo) {
        PresenteContinuo = presenteContinuo;
    }

    public boolean isPresenteSimple() {
        return PresenteSimple;
    }

    public void setPresenteSimple(boolean presenteSimple) {
        PresenteSimple = presenteSimple;
    }

    public int getStructureCounter() {
        return StructureCounter;
    }

    public void setStructureCounter(int structureCounter) {
        StructureCounter = structureCounter;
    }

}
