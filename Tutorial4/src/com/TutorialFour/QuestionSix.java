package com.TutorialFour;

public class QuestionSix {
    public static void main(String[] args) {
        int[] runs = {5, 12, 28, 34, 47, 52, 65, 71, 80, 99};
        int target = 47;

        int matchIndex = binarySearch(runs, target);

        if (matchIndex != -1) {
            System.out.println("Batsman scored 47 runs in match number: " + (matchIndex + 1));
        } else {
            System.out.println("Batsman did not score 47 runs in any match.");
        }
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid; // Match found
            } else if (array[mid] < key) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Not found
    }
}

