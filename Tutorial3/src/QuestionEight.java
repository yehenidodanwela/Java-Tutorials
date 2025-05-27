import java.util.Scanner;
import java.util.Random;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = new Random().nextInt(20) + 1;

        while(true) {
            System.out.print("Enter a number between 1 and 20: ");
            int number = input.nextInt();

            if (number <= 0 || number >= 21) {
                System.out.println("Value out of range");
            }
            else{
                if (number == randomNumber) {
                    System.out.println("Correct Number, You won!");
                    break;
                } else {
                    System.out.println("Incorrect Number, Try again!");
                }
            }
        }
    }
}
