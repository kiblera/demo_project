package sprint_1.kib4;

// Write a simple class with a main method that demonstrates the use of the for loop as well as the enhanced for loop
// (aka for-each loop).

public class ForLoops {

    public static void main(String[] args) {
        int i;
        int y;
        ForLoops forEachLoop = new ForLoops();

        for (i = 0; i < 5; i++) ;
        System.out.println("For example " + i);
    }

    public static void forEachLoop(int y) {
        int nums[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int x : nums) {
            sum += x;
            System.out.println(nums);
        }
    }
}