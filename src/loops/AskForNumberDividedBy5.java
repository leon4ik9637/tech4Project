package loops;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number
        If number is divisible by 5 then finish the program but if the number is not
        divisible by 5 keep asking user for a number until desired reached

         */


        System.out.println("\n-----do-while-way-----\n");
        Scanner scan = new Scanner(System.in);
        int number;

        do{
            System.out.println("Please enter a number");
            number =  scan.nextInt();
            if(number % 5 != 0) System.out.println("This number is not divisible by 5");
        }while(number % 5 != 0);

        System.out.println("This number is divisible by 5");
    }
}
