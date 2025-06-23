package com.TutorialFour;

import java.util.ArrayList;

public class QuestionThirteen {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3); // Bad pair (5 > 3)
        nums.add(2);
        nums.add(4); // Good pair
        nums.add(10);
        nums.add(1); // Bad pair
        System.out.println("Before: " + nums);
        removeBadPairs(nums);
        System.out.println("After: " + nums);
    }

    public static void removeBadPairs(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size() - 1) {
            int left = list.get(i);
            int right = list.get(i + 1);
            if (left > right) {
                list.remove(i);
                list.remove(i);
            }
            else {
                i += 2;
            }
        }
    }
}
