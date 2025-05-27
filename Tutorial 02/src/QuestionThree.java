import java.util.Scanner;

public class QuestionThree {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your ICT Marks: ");
        int ictMarks = input.nextInt();

        System.out.print("Enter your Coursework Marks: ");
        int courseworkMarks = input.nextInt();

        double finalMark = (ictMarks + courseworkMarks)/2;

        if (ictMarks >= 30 && courseworkMarks >= 30){
            if (finalMark >= 40){
                System.out.println("Pass; Final mark = " +finalMark);
            }
            else {
                System.out.println("fail");
            }
        }
        else {
            System.out.println("fail");
        }

    }
}
