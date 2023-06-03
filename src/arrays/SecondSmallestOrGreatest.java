package arrays;

public class SecondSmallestOrGreatest {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 1, 1, 7};

        /*
        1, 1, 2, 7, 7
        max = 7
        second max = 3

        min = 1
        second min = 2
         */

        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) min = number;
        }
        System.out.println("Min = " + min);


        int secondMin = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number != min && number < secondMin) secondMin = number;
        }
        System.out.println("Second min = " + secondMin);


        int max = Integer.MIN_VALUE;

        for(int number : numbers){
            if(number > max) max = number;
        }
        System.out.println("Max = " + max);


        int secondMax = Integer.MIN_VALUE;

        for(int number : numbers){
            if(number != max && number > secondMax) secondMax = number;
        }
        System.out.println("Second max = " + secondMax);



        System.out.println("\n-------Finding second min with 1 loop-------\n");

        int smallest = Math.min(numbers[0], numbers[1]);
        int secondSmallest = Math.max(numbers[0], numbers[1]);

        for (int number : numbers) {
            if (number < secondSmallest && number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) secondSmallest = number;
        }

        System.out.println(smallest + " " + secondSmallest);


    }
}
