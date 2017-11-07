package sprint_1.kib4;

// Create a class with a single main method that demonstrates the full use of a switch case.

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.print("Enter a whole number between 1 and 10.");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        String dayString;

        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }
        System.out.println(dayString);
    }
}
