package com.Tutorial10.QuestionFour;

public class CarrotBox extends Box {
    public CarrotBox(String bestBeforeDate) {
        super(bestBeforeDate);
    }

    @Override
    public String getType() {
        return "Carrot";
    }
}
