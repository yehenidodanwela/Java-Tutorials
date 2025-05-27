package Tutorial05;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = input.nextInt();

        int result = exponent(number,exponent);
        System.out.println(number + " raised to the power of " + exponent + " is: " + result);

    }
    private static int exponent(int base ,int exp){
        if (exp == 0) {
            return 1;
        }
        else {
            return base * exponent(base, exp - 1);
        }

    }
}
