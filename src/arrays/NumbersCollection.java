package arrays;

import java.util.Arrays;

public class NumbersCollection {
    public static void main(String[] args) {
        /*
        Create an array to store 1, 2, 3
        print array
        and then reassign all the values to be 5
        and print array once again
         */

        System.out.println("\n-----1st way-----\n");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(Arrays.toString(ints));
        ints[0] = 5;
        ints[1] = 5;
        ints[2] = 5;
        System.out.println(Arrays.toString(ints));


        System.out.println("\n-----2nd way-----\n");
        int[] numbers2 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers2));


        System.out.println("\n-----3rd way-----\n");
        int[] numbers3 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbers3));



    }
}
