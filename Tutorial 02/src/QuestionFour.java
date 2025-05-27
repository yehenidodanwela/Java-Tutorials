import java.util.Scanner;

public class QuestionFour {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Marks: ");
        double marks = input.nextDouble();

        if (marks >= 40 && marks <= 49){
            System.out.println("3rd Class Honours (3)");
        }

        else if (marks >= 50 && marks <= 59){
            System.out.println("2nd Class Honours Lower Division (2:ii) ");
        }

        else if (marks >= 60 && marks <= 69){
            System.out.println("2nd Class Honours Upper Division (2:i)");
        }

        else if (marks >= 70 && marks <= 100){
            System.out.println("1st Class Honours (1)");
        }

        else {
            System.out.println("Invalid value");
        }
    }
}
