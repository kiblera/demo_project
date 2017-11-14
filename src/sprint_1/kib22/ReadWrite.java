package sprint_1.kib22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Using the file I/O method of your choice, read a file and change one character to a dash.
// For example, change all 'a' characters to '-'. Close the file using the close() method.

public class ReadWrite {

    public static void main(String[] args) {

        FileReader reader = null;
        try {
            reader = new FileReader("/Users/andreamkibler/Desktop/Untitled.txt");
            int a;

            do {
                a = reader.read();
                if (a == 'a') {
                    System.out.println('-');
                } else {
                    System.out.println((char) a);
                }
            } while (a != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
            if(reader != null) reader.close();
        } catch(IOException exc) {
            System.out.println("Error Closing File");
            }
        }
    }
}
