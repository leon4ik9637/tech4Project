package collections.arrayList;

import utilities.CharacterHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class _01_Practice_Counting_ArrayList_Element {
    public static void main(String[] args) {
        /*
        Task-1
        Create ArrayList called numbers that store below numbers

         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println("\n-----Task-1-----\n");
        System.out.println("Not sorted list = " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list = " + numbers);


        /*
        Task-2
        Count how many odd numbers you have in the list and print the results

        RESULT:
        Odds = 3
         */

        System.out.println("\n-----Task-2 - for each loop-----\n");

        int countOdd = 0;
        for (Integer number : numbers){
            if(number % 2 == 1) countOdd++;
        }
        System.out.println("Odds = " + countOdd);

        System.out.println("\n-----Task-2 - fori loop-----\n");
        countOdd = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 1) countOdd++;
        }
        System.out.println("Odds = " + countOdd);

        /*
        Practices:
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        System.out.println("\n-----Task-3 - for each loop-----\n");

        int countEven = 0;
        for(Integer number : numbers){
            if(number % 2 == 0) countEven++;
        }
        System.out.println("Evens = " + countEven);

        System.out.println("\n-----Task-3 - fori loop-----\n");

        countEven = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) countEven++;
        }
        System.out.println("Evens = " + countEven);

        System.out.println("\n-----Task-4 - for each loop-----\n");

        int moreThan10 = 0;
        for (Integer number : numbers){
            if(number > 10) moreThan10++;
        }
        System.out.println("There are " + moreThan10 + " numbers more than 10");

        System.out.println("\n-----Task-3 - fori loop-----\n");

        int dividedBy5 = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 5 == 0) dividedBy5++;
        }
        System.out.println("There are " + dividedBy5 + " numbers divided by 5");

        /*
        Task-3
        Create a list called colors
         */
        System.out.println("\n-----TASK-3-----\n");

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);

        /*
        Task-4
        count how many colors in the colors list are starting with uppercase

        result:
        5
         */
        System.out.println("\n-----TASK-4 for each loop-----\n");

        int countU = 0;
        for(String color : colors){
           if(Character.isUpperCase(color.charAt(0))) countU++;
        }
        System.out.println(countU);

        System.out.println("\n-----TASK-4 fori loop-----\n");

        countU = 0;
        for(int i = 0; i < colors.size(); i++){
            if(Character.isUpperCase(colors.get(i).charAt(0))) countU++;
        }
        System.out.println(countU);

        /*
        Practices:
        Lowercases
        nulls
        empties
        That has length of 4 at least
        That has length of even or odd
        That has a or A
        That has w or W
         */



    }
}
