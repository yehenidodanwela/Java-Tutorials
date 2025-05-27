import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPasscode = 486251;
        int numberOfInputs = 4;
        int i = 1;

        while (i <= numberOfInputs) {

            System.out.print("Enter the passcode: ");
            int passcode = input.nextInt();

                if (passcode == correctPasscode) {
                    System.out.println("Correct passcode");
                    break;
                }
                else {
                    System.out.println("Incorrect passcode");
                }

        i++;

        }

        System.out.println("Maximum number of attempts reached");


    }
}
