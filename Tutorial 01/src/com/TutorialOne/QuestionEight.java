package com.TutorialOne;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Centigrade: ");
        double centigrade = input.nextDouble();

        double fahrenheit = centigrade* (9.0/5)+ 32;
        System.out.println("centigrade " + centigrade + "=" + "Fahrenheit " + fahrenheit);
    }
}
