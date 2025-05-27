import java.util.Scanner;

public class QuestionSix {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print ("Enter the number of classes held: ");
        int classesHeld = input.nextInt();

        System.out.print ("Enter the number of classes attended: ");
        int classesAttended = input.nextInt();

        double percentage = ((double)classesAttended / (double)classesHeld) * 100;
        System.out.println ("Percentage of class attended: " + percentage + "%");

        if (percentage >= 75){
            System.out.println("Allowed to sit in exam");
        }

        else {
            System.out.println("Do you have a medical cause? ('Y' or 'N' ): ");
            String medicalCause = input.next();

            if (medicalCause.equalsIgnoreCase("Y")) {
                System.out.println("Allowed to sit in exam due to medical cause");
            }
            else if (medicalCause.equalsIgnoreCase("N")){
                System.out.println("Not allowed to sit in exam");
            }
            else {
                System.out.println("Enter a valid character");
            }
        }

    }
}
