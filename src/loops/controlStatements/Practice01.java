package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers starting from biggest to smallest
        (given numbers included)
        HOWEVER, do not print any number less than 10
        1. Ask user to enter 2 numbers
        2. Store numbers in int variables
        3. Compare numbers and find biggest and smallest
        4. start a loop with below info
            StartPoint: max
            Endpoint  : min
            Update    : decrement
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 different numbers");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int maxNumber = Math.max(firstNumber, secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);

        for(int i = maxNumber; i >= minNumber; i--){
            if(maxNumber == minNumber) System.out.println("The numbers are not different");
            if(i < 10) break;
            System.out.println(i);
        }
//        if(maxNumber >= 10){
//            for(int i = maxNumber; i >= minNumber; i--) {
//                System.out.println(i);
//                if (i == 10) break;
//        }



    }
}
