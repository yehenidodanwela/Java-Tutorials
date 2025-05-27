package com.TutorialOne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Manual people: ");
        int manual = input.nextInt();
        System.out.print("Enter the number of Skilled people: ");
        int skilled = input.nextInt();
        System.out.print("Enter the number of Management people: ");
        int management = input.nextInt();

        double wageBill = (manual * 500 + skilled * 700 + management * 800);
        System.out.println("Wage bill: " + wageBill);

        double taxtopay = (wageBill*20) / 100;
        System.out.println("Tax to pay: " + taxtopay);

    }
}
