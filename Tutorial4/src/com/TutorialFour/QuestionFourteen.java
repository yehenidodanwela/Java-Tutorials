package com.TutorialFour;

import java.util.List;

public class QuestionFourteen {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(java.util.Arrays.asList(
                3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1
        ));
        removeBadPairs(list);
        System.out.println(list);
    }
    public static void removeBadPairs(List<Integer> list) {
        // If odd length, remove last element (it's a bad singleton)
        if (list.size() % 2 != 0) {
            list.remove(list.size() - 1);
        }
        for (int i = 0; i < list.size(); i += 2) {
            int left = list.get(i);
            int right = list.get(i + 1);

            if (left > right) {
                list.remove(i + 1);
                list.remove(i);
                i -= 2; // Step back to evaluate the next pair after shifting
            }
        }
    }
}
