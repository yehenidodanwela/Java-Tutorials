package com.TutorialFour;

public class QuestionFour {
    public static void main(String[] args) {
        System.out.println("Part (a)");
        int [] array = {2, 3, 4, 5, 6, 7, 8, 9};
        int num = 0;
        while (num < array.length && array [num] != num){
            if (num % 2 == 0){
                System.out.println(array[num]);
            }
        num ++;
        }

        System.out.println("part (b)");
        for (int j : array) {
            int value = j * 2;
            for (int k : array) {
                if (value == k) {
                    System.out.println(value);
                }
            }

        }
    }
}


