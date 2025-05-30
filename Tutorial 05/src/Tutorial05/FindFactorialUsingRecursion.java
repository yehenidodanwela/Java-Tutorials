package Tutorial05;

import java.util.Scanner;

public class FindFactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        System.out.println("The factorial of " + number + " is: " + factorial(number));

    }
    private static int factorial(int num){
        int factorialOfTheNumber = 1;
        for (int i = 1; i<= num; i++)
            factorialOfTheNumber *= i;
        return factorialOfTheNumber;
    }
}
