package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {
        /*
        Find greatest and print it

        RESULT:
        5
         */

        int[] numbers = {5, 3, 0, -5};

        System.out.println("\n-----Task-1 - solution with sort-----\n");
//        Arrays.sort(numbers); // --- -- --- --- -- greatest
//        System.out.println(numbers[numbers.length-1]); // 5

        System.out.println("\n-----Task-1 - solution without sort-----\n");
        // Assume
        int max = numbers[3];

        for(int number : numbers){
//            if(number > max) max = number;
            max = Math.max(max, number);
        }
        System.out.println(max);


        /*
        Task-2
        find the minimum value
        RESULT:
        0.5
         */
        System.out.println("\n-----Task-2 - solution without sort-----\n");

        double[] exchanges = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double min = Double.MAX_VALUE;
        for(double number : exchanges){
//            if(number < min) min = exchange;
            min = Math.min(min, number);
        }
        System.out.println(min); //0.5

        /*
        Use above double array and find second minimum value

        Result:
        1.5
         */
        double minValue2 = Double.MAX_VALUE;
        for(double number : exchanges){
            if(number != min && number < minValue2) minValue2 = number;
        }
        System.out.println(minValue2);




    }
}
