package arrays;

import utilities.CharacterHelper;

import java.lang.reflect.Array;
import java.util.Arrays;


public class _01_Practice_Char_Array {
    public static void main(String[] args) {
        /*
        Task-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print first and last values
        Print the array (eliminate square brackets)
         */
        System.out.println("\n-----Task-1-----\n");

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));
        System.out.println(characters[0] + " " + characters[5]);

        System.out.println("\n-----Task-2-----\n");
        /*
        Print the size of array with a message

        Expected:
        The size of the array is = 6
         */

        System.out.println("The size of the array is = " + characters.length);
        System.out.println("The size of the array is = " + Array.getLength(characters));

        System.out.println("\n-----Task-3-----\n");
        /*
        Print each element using fori loop
        Expected:
        #
        $
        5
        A
        b
        H
         */
        for(int i = 0; i <= characters.length-1; i++){
            System.out.println(characters[i]);
        }

        System.out.println("\n-----Task-4-----\n");
        /*
        Print each element using for each loop

        Expected:
        #
        $
        5
        A
        b
        H
         */

        for (char character : characters){
            System.out.println(character);
        }


        System.out.println("\n-----Task-5 - fori loop-----\n");
        /*
        Task-5
        Print each element that are letters

        EXPECTED:

         */
        for(int i = 0; i <= characters.length-1; i++){
            if(Character.isLetter(characters[i]))
            System.out.println(characters[i]);
        }

        System.out.println("\n-----Task-5 - for each loop-----\n");
        for(char character : characters){
            if(Character.isLetter(character))
                System.out.println(character);
        }

        System.out.println("\n-----Task-6 - fori loop-----\n");
        /*
        Task-6
        Count how many uppercase characters you have in the array
         */

        int count = 0;

        for(int i = 0; i <= characters.length-1; i++){
            if(Character.isUpperCase(characters[i]))
                    count++;
        }
        System.out.println("There are " + count + " uppercase letters in the array");

        System.out.println("\n-----Task-6 - for each loop-----\n");

        int count1 = 0;
        for(char uppercase : characters){
            if(Character.isUpperCase(uppercase)) count1++;
        }
        System.out.println("There are " + count1 + " uppercase letters in the array");

        // For each loop is also known as enhanced for loop


    }
}
