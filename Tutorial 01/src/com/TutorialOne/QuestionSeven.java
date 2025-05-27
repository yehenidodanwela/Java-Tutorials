package com.TutorialOne;

import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number in metres: ");
        double number = input.nextDouble();
        double cm = number*100;
        System.out.println(number + "m = " + cm + "cm" );

    }
}
