package com.Tutorial10.QuestionFour;

public abstract class Box {
    protected String bestBeforeDate;

    public Box(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    public abstract String getType();

    public void printBox() {
        System.out.println(getType() + " Box - Best Before: " + bestBeforeDate);
    }
}
