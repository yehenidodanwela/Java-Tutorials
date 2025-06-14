package com.TutorialFour;

public class QuestionTwelve {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30};
        modifyArray(myArray);
        System.out.println("First element after modification: " + myArray[0]);
    }

    public static void modifyArray(int[] array) {
        array[0] = 100;
    }
}

// In most programming languages like Java, C++, and Python, arrays are passed by reference, not by value. This means that when an array is passed to a method or function, the method receives a reference to the original array — not a copy of it. As a result, changes made to the array inside the method will affect the original array