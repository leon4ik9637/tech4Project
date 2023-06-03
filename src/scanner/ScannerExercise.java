package scanner;

import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args){

        // Write a Java program that reads firstName and lastName from user and
        //print those as full name in 1 statement
        /*
        Pseudo Code:
        1. Create an object of scanner
        2. Print out instructions about what we need
        3. Use next() method for reading
        4. Print out the first and last name in one statement
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name?");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name?");
        String lastName = input.nextLine();
        System.out.println("Your full name is " + firstName +" "+ lastName);


        /*
        Write a java program that reads the full address from user and print the address
         */

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter your full address?");
        String fullAddress = input.nextLine(); //now it can take the rest of the sentence;
        input.nextLine( ); // takes the space;


        System.out.println("The user's address is " + "\"" + fullAddress + "\"");


    }



}
