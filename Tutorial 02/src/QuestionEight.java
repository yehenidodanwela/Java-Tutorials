import java.util.Scanner;
import java.util.Random;

public class QuestionEight {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("0 for Rock");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissors");
        int usersChoice = input.nextInt();

        int random_number = new Random().nextInt(3);

        if (usersChoice == random_number) {
            System.out.println("User's choice: " + usersChoice);
            System.out.println("Computer's choice: " + random_number);
            System.out.println("Tie");
        }
        if ((usersChoice == 0 && random_number == 2) || (usersChoice == 2 &&
                random_number == 1) || (usersChoice == 1 && random_number == 0)) {
            System.out.println("User's choice: " + usersChoice);
            System.out.println("Computer's choice: " + random_number);
            System.out.println("You Won!");
        }
        if ((random_number == 0 && usersChoice == 2) || (random_number == 2 &&
                usersChoice == 1) || (random_number == 1 && usersChoice == 0)) {
            System.out.println("User's choice: " + usersChoice);
            System.out.println("Computer's choice: " + random_number);
            System.out.println("The computer Won!");
        }
    }
}
