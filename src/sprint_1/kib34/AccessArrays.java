package sprint_1.kib34;

import java.lang.reflect.Method;
import java.util.Arrays;
//  Write an example of how to:
//        -Access an element at a certain index of an array
//        -Set an element in an array

//  Once you are comfortable with those, write the code to:
//        -Populate an array using a for loop and
//        -Print out the contents of an array using an enhanced for loop

public class AccessArrays {

    public static void main(String[] args) {

        // Access an element at a certain index of an array
        String[] test = new String[25];

        // Set an element in an array
        test[0] = "first index";
        test[1] = "second index";
        //...
        test[24] = "25th index;";

        // Populate an array using a for loop
        int a [] = new int[10];
        a[0] = 10;
        a[1] = 9;
        a[2] = 8;
        a[3] = 7;
        a[4] = 6;
        a[5] = 5;
        a[6] = 4;
        a[7] = 3;
        a[8] = 2;
        a[9] = 1;

        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(a[i]);
            }

        // Print out the contents of an array using an enhanced for loop
        int nums [] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        for (int x : nums) {
            System.out.println(x);
        }
    }
}
