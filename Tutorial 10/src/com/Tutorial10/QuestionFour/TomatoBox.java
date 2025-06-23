package com.Tutorial10.QuestionFour;

public class TomatoBox extends Box {
    public TomatoBox(String bestBeforeDate) {
        super(bestBeforeDate);
    }

    @Override
    public String getType() {
        return "Tomato";
    }
}
