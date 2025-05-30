package com.TutorialFour;

public class QuestionSeven {
    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j > 0; j--) {
                System.out.print(i);  // fixed: print i, not j
            }
            System.out.println();
        }
    }
}
