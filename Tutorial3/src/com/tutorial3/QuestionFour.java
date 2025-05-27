package com.tutorial3;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            int factorial = 1;
            System.out.print("Factorial of " + num + "=");
            for (int i = num; i >= 1; i--) {
                factorial *= i;
                if (i != 1) {
                    System.out.println(i + "x");
                }
                else {
                    System.out.println(i + "=" + factorial);
                }

            }
        }
    }
}
