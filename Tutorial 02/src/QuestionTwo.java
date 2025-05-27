import java.util.Scanner;

public class QuestionTwo {
        public static void main (String [] args){
            Scanner input = new Scanner (System.in);

            System.out.print ("Enter a number: ");
            int number = input.nextInt();

            if (number >= 18){
                System.out.println ("Over 18");
            }

            else if (number >= 0 && number < 18){
                System.out.println ("Under 18");
            }

            else {
                System.out.println ("The age entered is incorrect.");
            }

        }
}
