package sprint_1.kib33;

public class CreateArrays {
    public static void main(String[] args) {

        //Demonstrate how to declare an array.
        int nums[] = new int[10];
        int i;

        //Demonstrate how to instantiate an array of size 10.
        for (i = 0; i < 10; i = i + 1) {
            nums[i] = i;
            System.out.println("Position in the array: " + i);
        }
    }
}