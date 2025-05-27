package com.TutorialOne;

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your fist name: ");
        String firstname = input.next();
        System.out.print("Enter your surname: ");
        String surname = input.next();

        System.out.print(firstname.substring(0,1).toUpperCase());
        System.out.print(surname.substring(0,1).toUpperCase());

        /* or
        String nameinitials = firstname.substring(0,1) + surname.substring(0,1);
        System.out.println (nameinitials.toUpperCase());
         */

    }
}
