package com.TutorialFour;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        int [] marks = new int [6];
        Scanner input = new Scanner (System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        System.out.println("Entered Marks: ");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Updated Marks: ");
        marks[0] = 100;
        for (int mark : marks) {
            System.out.println(mark);
        }

        int count = 0;
        int sum = 0;
        for (int mark : marks) {
            if (mark < 40) {
                count++;
            }
            sum += mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("Number of Students who Failed: " + count);
        System.out.println("Average Mark: " + average);



    }
}
