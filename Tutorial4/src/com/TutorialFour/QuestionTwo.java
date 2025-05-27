package com.TutorialFour;

import java.util.Scanner;


public class QuestionTwo {
    public static void main(String[] args) {

        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};

        System.out.println("Original Array: ");
        for (String name : array) {
            System.out.println(name);
        }

        Scanner input = new Scanner(System.in);
            System.out.println("Enter first index to swap: ");
            int index1 = input.nextInt();
            System.out.println("Enter second index to swap: ");
            int index2 = input.nextInt();

            if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {

                String temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;

                System.out.println("Updated Array: ");
                for (String newname : array) {
                    System.out.println(newname);
                }

            }

            else {
                System.out.println("Invalid indices! Please enter values between 0 and " + (array.length - 1));
            }

    }

}
