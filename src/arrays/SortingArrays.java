package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        HOW TO SORT AN ARRAY OF NUMBERS
        byte, short, int, long, float, double

        We will sort these in ascending order
        How to sort an Array
        - We use static sort() method that comes from Arrays class
        - It is a void method and does not return anything
        - numbers are always sorted in ascending way
        - words or characters are always sorted lexicographically
        using ASCII table

         */
        System.out.println("\n-----Sorting Numbers-----\n");
        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};

        System.out.println("My array is = " + Arrays.toString(numbers));

        // Sort this array in ascending order

        Arrays.sort(numbers);

        System.out.println("My array sorted = " + Arrays.toString(numbers));

        /*
        How to sort an Array
        - We use static sort() method that comes from Arrays class
         */
        System.out.println("\n-----Sorting Characters-----\n");
        char[] characters = {'A', 'b', 'z', 'H'};

        System.out.println("My characters array = " + Arrays.toString(characters));
        Arrays.sort(characters);
        System.out.println("My sorted characters array = " + Arrays.toString(characters));

        System.out.println("\n-----Sorting Words-----\n");
        String[] names = {"Adam", "Adame", "Alex", "tom", "Ally", "Adele", "terry", "Josh"};

        for(int i = 0; i <= names.length-1; i++){
            names[i] = names[i].toLowerCase();
        }
        for (int i = 0; i <= names.length-1 ; i++) {
            names[i] = names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1);
        }
        System.out.println("My names array = " + Arrays.toString(names));

        Arrays.sort(names);
        //Lexicographically
        System.out.println("My sorted names array = " + Arrays.toString(names));

        for (int i = 0; i <= names.length-1 ; i++) {
            names[i] = names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1);
        }





    }
}
