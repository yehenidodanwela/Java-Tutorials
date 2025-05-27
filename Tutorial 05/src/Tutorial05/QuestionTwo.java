package Tutorial05;

import java.util.*;

public class QuestionTwo {
    public static void main(String[] args) {
        int option;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("**********");
            System.out.println("   MENU   ");
            System.out.println("**********");
            System.out.println("1.- Addition");
            System.out.println("2.- Subtraction");
            System.out.println("0.- Quit");
            System.out.print("Please select an option:");
            option = input.nextInt();

            switch (option) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 0:
                    break;
            }

        }
        while (option != 0);
    }

    private static void Addition() {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = input2.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = input2.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }
    private static void Subtraction() {
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = input3.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = input3.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

}
