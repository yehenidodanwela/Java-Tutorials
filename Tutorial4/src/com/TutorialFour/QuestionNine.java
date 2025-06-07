package com.TutorialFour;

import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] marks = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            double mark = input.nextDouble();
            marks[i] = mark * 0.9;
        }
        System.out.println("\nReduced marks (after 10% penalty):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }
}
