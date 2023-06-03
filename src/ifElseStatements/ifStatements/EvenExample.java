package ifElseStatements.ifStatements;

import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args){
        /*
        Write a program that asks user to enter a number.
        If the number entered is even then print a message:
         "The number you entered is even"


         */

        Scanner ask = new Scanner(System.in);
        System.out.println("Please enter a number?");
        int number1 = ask.nextInt();

        if(number1 % 2 == 0){
            System.out.println("The number you entered is even");


        }else{
            System.out.println("The number you entered is odd");
        }







    }
}
