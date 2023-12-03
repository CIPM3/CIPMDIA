package com.leal.cipm_testing;

import java.util.List;

public class CustomArrayAfterTestingHolder {

    List<String> StructureArrayAfterTEsting;
    List<String> VocabArrayAfterTEsting;
    List<String> SpanishInterferenceArrayAfterTEsting;
    List<String> ConsciousInterferenceArrayAfterTEsting; 
    List<String> CultureArrayAfterTEsting; 
    List<String> AvailabilityArrayAfterTEsting;




    public CustomArrayAfterTestingHolder() {

    }
    public CustomArrayAfterTestingHolder(List<String>structureArrayAfterTEsting,
                                         List<String> vocabArrayAfterTEsting,
                                         List<String> spanishInterferenceArrayAfterTEsting,
                                         List<String> consciousInterferenceArrayAfterTEsting,
                                         List<String> cultureArrayAfterTEsting,
                                         List<String> availabilityArrayAfterTEsting) {
        this.StructureArrayAfterTEsting = structureArrayAfterTEsting;
        this.VocabArrayAfterTEsting = vocabArrayAfterTEsting;
        this.SpanishInterferenceArrayAfterTEsting = spanishInterferenceArrayAfterTEsting;
        this.ConsciousInterferenceArrayAfterTEsting = consciousInterferenceArrayAfterTEsting;
        this.CultureArrayAfterTEsting = cultureArrayAfterTEsting;
        this.AvailabilityArrayAfterTEsting = availabilityArrayAfterTEsting;
    }

    public  CustomArrayAfterTestingHolder(List<String> structureArrayAfterTEsting,
                                          List<String> vocabArrayAfterTEsting) {
        this.StructureArrayAfterTEsting = structureArrayAfterTEsting;
        this.VocabArrayAfterTEsting = vocabArrayAfterTEsting;

    }

    public List<String> getStructureArrayAfterTEsting() {
        return StructureArrayAfterTEsting;
    }

    public void setStructureArrayAfterTEsting(List<String> structureArrayAfterTEsting) {
        this.StructureArrayAfterTEsting = structureArrayAfterTEsting;
    }

    public List<String> getVocabArrayAfterTesting() {
        return VocabArrayAfterTEsting;
    }

    public void setVocabArrayAfterTesting(List<String> vocabArrayAfterTEsting) {
        this.VocabArrayAfterTEsting = vocabArrayAfterTEsting;
    }

    public List<String> getSpanishInterferenceArrayAfterTEsting() {
        return SpanishInterferenceArrayAfterTEsting;
    }

    public void setSpanishInterferenceArrayAfterTEsting(List<String> spanishInterferenceArrayAfterTEsting) {
        this.SpanishInterferenceArrayAfterTEsting = spanishInterferenceArrayAfterTEsting;
    }

    public List<String> getConsciousInterferenceArrayAfterTEsting() {
        return ConsciousInterferenceArrayAfterTEsting;
    }

    public void setConsciousInterferenceArrayAfterTEsting(List<String> consciousInterferenceArrayAfterTEsting) {
        this.ConsciousInterferenceArrayAfterTEsting = consciousInterferenceArrayAfterTEsting;
    }

    public List<String> getCultureArrayAfterTEsting() {
        return CultureArrayAfterTEsting;
    }

    public void setCultureArrayAfterTEsting(List<String> cultureArrayAfterTEsting) {
        this.CultureArrayAfterTEsting = cultureArrayAfterTEsting;
    }

    public List<String> getAvailabilityArrayAfterTEsting() {
        return AvailabilityArrayAfterTEsting;
    }

    public void setAvailabilityArrayAfterTEsting(List<String> availabilityArrayAfterTEsting) {
        this.AvailabilityArrayAfterTEsting = availabilityArrayAfterTEsting;
    }
}
