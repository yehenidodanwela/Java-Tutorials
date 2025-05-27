package com.tutorial3;

public class QuestionOneSecondForLoop {
    public static void main(String[] args) {
        for (int i = 0 ; i <15; i++ ){
            if (i % 2 == 0){
                if(i == 6){
                    continue;
                }
                    System.out.println(i);
            }
        }
    }
}
