package Tutorial07;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class QuesstionTwo {
    public static void main(String[] args) {
        try {
            File file = new File("Exercise1.txt");
            Scanner file_reader = new Scanner(file);

            while (file_reader.hasNextLine()) {
                String text = file_reader.nextLine();
                System.out.println(text);
            }
            file_reader.close();
        }
        catch(IOException e){
            System.out.println("Error while writing to a file.");
            e.printStackTrace();

        }


    }

}
