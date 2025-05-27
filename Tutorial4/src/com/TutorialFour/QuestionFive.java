package com.TutorialFour;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionFive {
    public static void main (String [] args){
        double[][] marks = new double[5][3];

        Scanner input = new Scanner(System.in);
        for (int i=0; i < marks.length;i++){
            int mark1 = 0;
            int mark2= 0;
            int mark3= 0;

            for (int j=0; j < marks[i].length;j++){
                if (j == 0){
                    System.out.println("Enter your SD2 marks: ");
                    mark1 = input.nextInt();
                    marks[i][j] = mark1;
                }
                if (j == 1){
                    System.out.println("Enter your Web marks: ");
                    mark2 = input.nextInt();
                    marks[i][j] = mark2;
                }
                if (j == 2){
                    System.out.println("Enter your Maths marks: ");
                    mark3 = input.nextInt();
                    marks[i][j] = mark3;
                }
                }
            int avarage = (mark1+mark2+mark3)/3;
            System.out.println("Student "+ i+1 + " Average = "+avarage);


        }

        System.out.println("Marks of the student 1" + Arrays.toString(marks[0]));
        System.out.println("Marks of the student 2" + Arrays.toString(marks[1]));
        System.out.println("Marks of the student 3" + Arrays.toString(marks[2]));
        System.out.println("Marks of the student 4" + Arrays.toString(marks[3]));
        System.out.println("Marks of the student 5" + Arrays.toString(marks[4]));

    }
}
