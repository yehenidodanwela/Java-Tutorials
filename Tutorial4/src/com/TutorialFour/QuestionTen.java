package com.TutorialFour;

public class QuestionTen {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;

        System.out.println("Shifted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

