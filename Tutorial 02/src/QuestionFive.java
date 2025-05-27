import java.util.Scanner;

public class QuestionFive {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print ("Enter your first number: ");
        double number1 = input.nextDouble();

        System.out.print ("Enter your operator(+,-,/,*): ");
        String operator = input.next();

        System.out.print ("Enter your second number: ");
        double number2 = input.nextDouble();

        double result;

        switch (operator){
            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                }
                else {
                    System.out.println("Zero Division Error : Please enter another number");
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

        System.out.println("Result: " + result);

    }
}
