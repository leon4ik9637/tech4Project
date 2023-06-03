package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {

        /*
        Task-1
        Create an array that will store 4 fruit names
         */
        String[] fruitNames = new String[4];
        System.out.println(Arrays.toString(fruitNames));


        /*
        Task-2
        Store your fav fruit in the index of 0
        Store the 4th fav fruit in the index of 3
         */
        fruitNames[0] = "Apple";
        fruitNames[3] = "Banana";
        System.out.println(Arrays.toString(fruitNames));

        /*
        Task-3
        Find the size of your array and print it
        SIZE = How many elements you have in the array

        Output:
        4
         */
        System.out.println(fruitNames.length);

        /*
        Task-4
        Print the elements at index of 0 and 3
         */
        System.out.println(fruitNames[0].toUpperCase()); // APPLE
        System.out.println(fruitNames[0].charAt(0)); // A
        System.out.println(fruitNames[3].length()); // 6
        System.out.println(fruitNames[3].startsWith("B")); // true

        // System.out.println(fruitNames[1].length()); // NullPointerException

        /*
        null keyword
        - null means an object variable is not pointing a value
        (no value assigned to object)
        - Primitives cannot be null
        - If an object variable holds null, then it cannot
        be manipulated (methods cannot be used)
        - If object variable holds null and programmer tries
        to execute some methods over null vlue, then
        NullPointerException will be thrown as a run-time
        error

        compiler error - before run
        run-time error - after run

         */

    }
}
