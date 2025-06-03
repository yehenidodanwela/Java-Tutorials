package Tutorial07;

import java.io.FileWriter;
import java.io.IOException;

public class QuestionThree {
    public static void main(String[] args) {
        double[] array = {1.3, 5.6, 2.3, 9.0};
        try {
            FileWriter writer = new FileWriter("array_output.txt");

            for (double value : array) {
                writer.write(value + "\n"); // Write each value on a new line
            }

            writer.close();
            System.out.println("Array written to file successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
        }
    }
}

// If you try something like this: writer.write(array.toString()); It will not write the actual numbers in the array. Instead, it will write something like: [D@1b6d3586 This is the default string representation of the array object (its memory reference), not the values inside it.