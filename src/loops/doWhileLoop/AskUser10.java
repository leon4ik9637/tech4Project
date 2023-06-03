package loops.doWhileLoop;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number
        If number is >= 10, then finish the program
        if n <= 10, keep asking user to enter a new number
        until user enters a number that is >= 10
         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int number = input.nextInt();
//
//        while(number < 10){
//            System.out.println("This number is not more than or equal to 10");
//            System.out.println("Please enter a new number");
//            number = input.nextInt();
//        }
//        System.out.println("This number is more than or equal to 10");

        Scanner input = new Scanner(System.in);

        int number;
        do{
            System.out.println("Please enter a number");
            number = input.nextInt();
        }while(number < 10);
        System.out.println("The number you entered is more than 10");
    }
}
