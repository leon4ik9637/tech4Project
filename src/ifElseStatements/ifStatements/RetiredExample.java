package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {

        /*
        Write a java program that asks user to enter their age
        And print "It is time to get retired!" if their age is more than or equal to 55
        NOTE: Write PSEUDO CODE first

        Example Program 1
        Program: Please enter your age?
        User: 60

        Program: It is your time to get retired

        EXAMPLE PROGRAM 2
        Program: Please enter your age?
        User: 45

        Program:

         */
        /*
        1. Create a Scanner object
        2. Ask a question about their age
        3. Retrieve age
        4. Use if statement and proper action in curly braces
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int userAge = input.nextInt();

        if(userAge >= 55){
            System.out.println("It is your time to get retired!");
        }else{
            System.out.println("You are not gonna retire!");
        }




    }
}
