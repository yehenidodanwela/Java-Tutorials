package com.TutorialFour;

import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] myNamesArray = new int [10];

        System.out.println("Enter your 10 integers: ");
        for (int i=0; i< myNamesArray.length; i++){
            myNamesArray[i] = input.nextInt();
        }

        int [] myNamesArray2 = myNamesArray; //int[] myNamesArray2 = myNamesArray.clone();

        int minIndex, temp;
        for (int j=0; j<myNamesArray2.length-1; j++) {
            minIndex = j;
            for (int k = j+1; k<=myNamesArray2.length-1;k++) {
                if (myNamesArray2[k] < myNamesArray2[minIndex]){
                    minIndex = k;
            }
        }
            temp = myNamesArray2[j];
            myNamesArray2[j] = myNamesArray2[minIndex];
            myNamesArray2[minIndex] = temp;

        }
        System.out.println("Sorted array:");
        for (int num : myNamesArray) {
            System.out.print(num + " ");
        }
    }
}
