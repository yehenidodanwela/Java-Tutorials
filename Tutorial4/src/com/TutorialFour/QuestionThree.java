package com.TutorialFour;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        double[] array = {0.0,1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your first integer: ");
        int value1 = input.nextInt();

        System.out.println("Enter your first array position: ");
        int position1 = input.nextInt();

        System.out.println("Enter your second integer: ");
        int value2 = input.nextInt();

        System.out.println("Enter your second array position: ");
        int position2 = input.nextInt();

        if (position1 >= 0 && position1 < array.length && position2 >= 0 && position2 < array.length) {

            array[position1] = value1;
            array[position2] = value2;

            double temp = array[position1];
            array[position1] = array[position2];
            array[position2] = temp;

            System.out.println("Updated Array: ");
            for (double newname : array) {
                System.out.println(newname);
            }

        }

        else {
            System.out.println("Invalid indices! Please enter values between 0 and " + (array.length - 1));
        }

    }
}
