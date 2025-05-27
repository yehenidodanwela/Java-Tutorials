import java.util.Scanner;
import java.util.InputMismatchException;

public class QuestionSix {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        double number1 = 0, number2 = 0;
        String operator;
        double result;

        while (true) {
            try {
                System.out.print("Enter your first number: ");
                number1 = input.nextDouble();
                break; // exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value");
                input.next(); // clear the invalid input
            }
        }

        while (true) {
            System.out.print("Enter your operator (+, -, /, *): ");
            operator = input.next();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            } else {
                System.out.println("Invalid operator. Please enter one of +, -, *, /");
            }
        }

        while (true) {
            try {
                System.out.print("Enter your second number: ");
                number2 = input.nextDouble();
                break; // exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value");
                input.next(); // clear the invalid input
            }
        }

        // Perform calculation
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Zero Division Error: Please enter another number");
                    return;
                }
                break;

            case "*":
                result = number1 * number2;
                break;

            default:
                System.out.println("Invalid operator");
                return;
        }

        // Output result
        System.out.println("Result: " + result);
    }
}
