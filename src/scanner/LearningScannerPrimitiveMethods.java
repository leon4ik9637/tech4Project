package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){

        /*
        How to use Scanner Methods
        1. Create  an object of Scanner (import the class as well)
        ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed);
        2. variableName/objectName.methodName(if it is needed parameter);
         */

        /*
        Task-1
        1. Ask user to enter their age
        2. Print a question
        3. Use a proper next method (nextInt)
        4. Print out the user' age
         */


        Scanner collect = new Scanner(System.in);
        System.out.println("What is your age?");
        String usersAge = collect.nextLine();
        System.out.println("User's age is " + usersAge);

        /*
        Scanner collect = new Scanner(System.in);
        System.out.println("How old are you?");
        String usersAge = collect.nextLine();
        System.out.println("User is " + usersAge + " years old.");
        */
        /*
        Ask for the account balance of the user
        Get the account balance and store it
        Print it out
         */
        /*
        System.out.println("What is your account balance?");
        String accountBalance = collect.nextLine();
        System.out.println("The user has " + accountBalance + " dollah sign bills.");

        System.out.println("what country are you from");
        String countryName = collect.nextLine();
        System.out.println("User is originally from " + countryName);

        System.out.println("What is your account balance?");
        double userAccountBalance = collect.nextDouble();
        System.out.println("\t\n\'The account balance is\' = \"$" +userAccountBalance + "\"");
        */

        /*
        Ask for user "Are you understanding this java class today?"
        Get the answer and store it
        Print the answer
         */

        System.out.println("Are you understanding this java class today?");
        boolean userUnderstanding = collect.nextBoolean();
        System.out.println("User understands = " + userUnderstanding);









    }

}
