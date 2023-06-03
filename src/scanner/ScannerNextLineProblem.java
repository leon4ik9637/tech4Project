package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args){


        /*
        full name   --> nextLine()
        name        --> next()
        age         --> nextInt()
        fav quote   --> nextLine()
         */

        /*Scanner userInput = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = userInput.next();

        System.out.println("What's your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean friedBrain = userInput.nextBoolean();

        System.out.println("What's your favorite quote");
        userInput.nextLine();
        String favoriteQuote = userInput.nextLine();

        System.out.println("What's your address?");
        String address = userInput.nextLine();

        System.out.println("User name is = " + name +
                "\nUser age is = " + age +
                "\nIs user's brain OK? = " + friedBrain +
                "\nUser's fav quote is " + "\"" + favoriteQuote + "\"" +
                "\nUser's address is = " + address);

         */


        /*
        Write a java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("First number: ");
        int number1 = userInput.nextInt();
        System.out.println("Second number: ");
        int number2 = userInput.nextInt();
        System.out.println("Third number: ");
        int number3 = userInput.nextInt();
        System.out.println("The sum of the user's numbers = " + (number1 + number2 + number3));





    }

}
