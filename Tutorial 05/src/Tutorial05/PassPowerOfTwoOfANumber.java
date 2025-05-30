package Tutorial05;

import java.util.Scanner;

public class PassPowerOfTwoOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextInt();
        System.out.print("Twice the number is: " + doubleNumber(num));
    }
    private static double doubleNumber (double number){
       double doubleOfTheNumber =  2 * number;
       return doubleOfTheNumber;
    }
}
