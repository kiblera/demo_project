package sprint_1.kib4;

// Create a class with a single main method that demonstrates both the while and the do-while loops in action.

public class WhileLoops {

    public static void main(String[] args) {
        int count = 1;
        int x = 0;

        int i = doWhile (x);

        while (count < 10) {
            System.out.println("Count + " + count);
            count++;
        }
    }

    public static int doWhile(int i) {
        int x = 0;

        do {
            System.out.println("Number is " + x);
            x++;
        } while (x < 5);
        return x;
    }
}