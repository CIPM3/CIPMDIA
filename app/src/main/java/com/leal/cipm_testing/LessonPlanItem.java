package com.leal.cipm_testing;

public class LessonPlanItem {
    String title;
    String subTitle;
    String description;
    String circularBtnTxt;
    String completedTxt;
    int type;

    public LessonPlanItem() {

    }

    public LessonPlanItem(String title, String subTitle, String description, String circularBtnTxt, String completedTxt,int type) {
        this.title = title;
        this.subTitle = subTitle;
        this.description = description;
        this.circularBtnTxt = circularBtnTxt;
        this.completedTxt = completedTxt;
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCircularBtnTxt() {
        return circularBtnTxt;
    }

    public void setCircularBtnTxt(String circularBtnTxt) {
        this.circularBtnTxt = circularBtnTxt;
    }

    public String getCompletedTxt() {
        return completedTxt;
    }

    public void setCompletedTxt(String completedTxt) {
        this.completedTxt = completedTxt;
    }
}
