package loops.whileLoop;

import utilities.ScannerHelper;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        /*
        Assume that we are playing a game and one person in the class is just writing
        a number on a paper and others are trying to guess the number
        NOTE: number can only be between 1 and 10 (included)
        See how many attempts it is going to tae to find the written down number?
        Can I solve this issue with a loop?
        Write a program to play this game
         */

        int myNumber = 7;

        System.out.println("The random number is = " + myNumber);
        Random random = new Random();
        int usersNumbers = random.nextInt(10)+1;

        int attempt = 1;


        while(usersNumbers != myNumber){
            System.out.println("My random attempt number is = " + usersNumbers);
            usersNumbers = random.nextInt(10)+1;
            attempt++;
        }
        System.out.println("You could find it after " + attempt + " times!!!");
        System.out.println("Finally you could find the number!");

    }
}
