package com.tutorial3;

public class QuestionOneSecondWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 15){
            if(i % 2 == 0) {
                if (i == 6){
                    i++;
                    continue;
                }
                System.out.println(i);
            }
            i++;
        }
    }
}
