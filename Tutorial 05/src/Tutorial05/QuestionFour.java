package Tutorial05;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int inputNum = input.nextInt();
        printNumbers(inputNum);
    }
    private static void printNumbers(int num){
        if (num < 0) {
            return;
        }
            System.out.println(num);
            printNumbers(num - 1);
        }
    }
