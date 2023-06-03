package arrays;

import java.util.Arrays;
import java.util.Locale;

public class IntroductionToArrays {
    public static void main(String[] args) {
        /*
        ARRAY SYNTAX:
        dataType[] variableName = new dataType[length];
        dataType[] variableName = {element1, element2};
        dataType[] variableName = new dataType[]{element1, element2};

        In Java, each Array has below features
        Data type
        Name
        Size

        - Arrays is a class stored java.util package
        - Arrays are used to store multiple values in a single
        variable, instead of declaring separate variables for each value
        - Arrays is one of the collection types in java
        - Collection is storing multiple similar items in one place
        - By using an Array, we can store many similar items/elements
        in one variable
        - To declare an array, define the variable type with
        square brackets

        // When you know what to store
        String[] names = {"Abe", "Alex", "John"};

        // When you know how many elements sore but you don't know
        the actual data

        Then, initialize the array with its length
        String[] names = new String[5];
        [null, null, null, null, null]

        names[0] = "Melda";
        [Melda, null, null, null, null]

        names[2] = "Regina";
        [Melda, null, Regina, null, null]

        names[2] = "John";
        [Melda, null, John, null, null]

        ELEMENT: Each data that is stored in an array

        DEFAULT VALUES OF String and PRIMITIVES
        String  -> null;
        int     -> 0;
        byte    -> 0;
        short   -> 0;
        long    -> 0;
        float   -> 0.0;
        double  -> 0.0;
        boolean -> false;
        char    -> 0;

        int[] nums = new int[3];
        [0, 0, 0]

        double[] balances = new double[2];
        [0.0, 0.0]

        char[] characters = new char[4];
        [ , , , ]

        boolean[] booleans = new boolean[5];
        [false, false, false, false, false]

        HOW TO FIND THE SIZE OF AN ARRAY
        - We can use length instance variable to find size
        - SIZE: It is how many elements array contains

        EXAMPLE:
        int[] numbers = {1, 5, 15, 23, 0, 5};
        System.out.println(numbers.length); // 6

        char[] chars = new char[15];
        System.out.println(chars.length); // 15

        Empty is a value, it is a data-information



         */
//        String studentsName = "Alex, Abe, Yakeen";
//        String ages = "20, 21, 22";

        //Can you print Abe's age only -> 21

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAY
        System.out.println(names);  // [Ljava.lang.String;@14ae5a5
        System.out.println(Arrays.toString(names)); // [Alex, Abe, Yakeen]

        String[] names3 = {"Leon", "Galyna", "Svetochek"};
        System.out.println(Arrays.toString(names3).contains("Galyna")); // [Leon, Galyna, Svetochek]

        // HOW TO GET A SINGLE ELEMENT FROM ARRAY
        System.out.println(names3[0].toLowerCase()); // Leon  [] -> (indexOf())
        System.out.println(names[1].toUpperCase()); // Abe
        System.out.println(names[2].charAt(2)); // Yakeen -> 'k'

        // HOW TO UPDATE AN ELEMENT --> Abe -> Abraham
        names [1] = "Abraham";
        System.out.println(Arrays.toString(names));

        // Alex's age is 20 and his fav char is A. His balance is 5.6,
        // and he likes Java is false.

        // HOW TO LOOP ARRAY USING FORI LOOP

        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + " 's age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }






    }
}
