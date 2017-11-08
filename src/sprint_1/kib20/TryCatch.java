package sprint_1.kib20;

//  Create a class with one method. Inside the method, demonstrate the use of a two try/catch blocks.
//        -In the first example the try can complete without error.
//        -In the second, make sure the catch block executes (ie. make sure you generate an error)

public class TryCatch {
    public static void main(String[] args) {

        int[] nums = new int[10];

        try {
            nums[0] = 10;
            System.out.println("The try completes without an error in example 1.");
        }
        catch (ArithmeticException exc) {
            System.out.println("Index exception won't show.");
        }

        try {
            nums[-1] = 10;
            System.out.println("The try will have an error in example 2 but this won't show.");
        }
        catch (ArithmeticException exc) {
            System.out.println("Index exception will show instead of this message.");
        }
    }
}
