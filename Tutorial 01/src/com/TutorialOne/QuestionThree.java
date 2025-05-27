package com.TutorialOne;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first mark: ");
        int mark1 = input.nextInt();
        System.out.print("Enter your second mark: ");
        int mark2 = input.nextInt();
        System.out.print("Enter your third mark: ");
        int mark3 = input.nextInt();
        double average = (mark1 + mark2 + mark3)/3.0;
        System.out.println("Average: " + average);

    }
}
