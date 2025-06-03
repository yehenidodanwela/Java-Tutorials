package Tutorial07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        ArrayList<Double> numberList = new ArrayList<>();

        try {
            File file = new File("array_output.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                numberList.add(value);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        // Convert ArrayList to array
        double[] newArray = new double[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            newArray[i] = numberList.get(i);
        }

        // Print the contents of the array
        System.out.println("Contents of the new array:");
        for (double num : newArray) {
            System.out.println(num);
        }
    }
}
