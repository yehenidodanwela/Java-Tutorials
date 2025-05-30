package Tutorial05;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        boolean result = isPalindrome(number);
        System.out.println("is " + number + " a palindrome? " + result);
    }
    private static boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        while (num > 0){
            int digit = num % 10;
            reversed = reversed *10 + digit;
            num = num/10;
        }
        return original == reversed;
    }
}
