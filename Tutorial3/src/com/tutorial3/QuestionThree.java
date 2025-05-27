package com.tutorial3;
import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

            System.out.print("Enter a number : ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Please enter a positive integer");
                return;
            }

            System.out.print("Enter a letter : ");
            String letter = input.next();

            int i = 0;
            while (i < num) {
                System.out.print(letter);
                i++;
            }

    }
}
