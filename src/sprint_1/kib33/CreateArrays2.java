package sprint_1.kib33;

//Demonstrate how to instantiate an array with values.

public class CreateArrays2 {

    public static void main(String[] args) {
        int i;
        int nums[] = new int[10];

        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 25;
        nums[5] = 30;
        nums[6] = 35;
        nums[7] = 40;
        nums[8] = 45;
        nums[9] = 50;
        System.out.println("Print the array in order:");
        for (i = 0; i < nums.length; i += 1)
        {
            System.out.println(nums[i]);
        }
    }
}