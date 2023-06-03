package loops.forLoop;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

import java.util.Random;
import java.util.Scanner;

public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {
        /*
        Project05 - 7
        Write a program that generates 2 random numbers between 0 and 25 (inclusive)
        Then print all numbers between 2 random numbers that cannot be divided by 5
        in ascending order.
        Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;
        Expected output:
        4-6-7-8-9-11-12

        3rd way of finding random number

         */
        Random random = new Random(); // 10 - 30
        int num1 = random.nextInt(26); // (21) + 10
        int num2 = random.nextInt(26); // (21) + 10
        // int randomNumber1 = RandomNumberGenerator.getRandomNumber(0, 25);
        // int randomNumber2 = RandomNumberGenerator.getRandomNumber(0, 25);
        System.out.println("The 2 random numbers between 0 and 25 are = " + num1 + " and " + num2);

        System.out.println("\nNumbers printed in ascending order\n");
        /*
        FIRST WAY
        if(randomNumber1 < randomNumber2){
            for(int i = randomNumber1; i <= randomNumber2; i++){
                if(i % 5 != 0){
                    System.out.println(i);
                }
            }

        }else{
            for(int i = randomNumber1; i >= randomNumber2; i--){
                if(i % 5 != 0){
                    System.out.println(i);
                }
            }
        }
        */
        /*
        SECOND WAY
        for(int i = minNumber; i <= maxNumber; i++){
            if(i % 5 != 0) System.out.println(i);
        }
         */
        String s = "";

        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 5 != 0) s += i + " - ";
        }
            System.out.println(s.substring(0, s.length()-3));

    }
}
