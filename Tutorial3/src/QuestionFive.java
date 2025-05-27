import java.util.Scanner;
public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to display: ");
        int number = input.nextInt();

        int first = 1, second = 1;

        if (number <= 0) {
            System.out.println("Please enter a positive number");
        }
        else if (number == 1) {
            System.out.print("Fibonacci Series: " + first);
        }
        else {
            System.out.print("Fibonacci Series: " + first + ", " + second);
        }

        for (int i=3; i <= number; i++){
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

    }
}
