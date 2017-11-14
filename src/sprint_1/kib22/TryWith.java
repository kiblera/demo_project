package sprint_1.kib22;

// Using the file I/O method of your choice, read a file and change one character to a dash.
// For example, change all 'a' characters to '-'. Complete this task using try-with-resources.

import java.io.FileInputStream;
import java.io.IOException;

public class TryWith {
    public static void main(String args[]) {
        int i = 0;

        try (FileInputStream reader = new FileInputStream("/Users/andreamkibler/Desktop/Untitled.txt")) {

            do {
                i = reader.read();
                if ((char) i == 'a') i = '-';
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
