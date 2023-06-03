package loops.forLoop;

import utilities.MathHelper;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to find sum of numbers from 10 to 15 (10 and 15 are included)

        Expected output:
        75
         */
        // 1. create a result container and eventually will have your answer
        int sum = 0;
        // 2. start filling your result
        for(int i = 10; i <= 15; i++){
            sum += i;
        }
        // 3. print out your result
        System.out.println(sum);

    }
}
