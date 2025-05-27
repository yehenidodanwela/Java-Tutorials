package Tutorial07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionOne {
    public static void main(String[] args) {
        try {
            File file = new File("Exercise1.txt");
            boolean file_created = file.createNewFile();
            if (file_created) {
                FileWriter writer = new FileWriter("Exercise1.txt");
                writer.write("This is my first file.");
                writer.close();
            }
        }
        catch(IOException e){
            System.out.println("Error while writing to a file.");
            e.printStackTrace();
        }
    }
}
