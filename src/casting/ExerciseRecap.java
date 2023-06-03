package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args){

        /*
        Write a program ASKS user for 5 of their grades as string and print out their avg

        Input:
        45
        50
        55
        60
        65

        Output:
        55


        Scanner output = new Scanner(System.in);
        System.out.println("Please enter five grades");

        System.out.println("The average of user's grades = " + (int)
                (Double.parseDouble(output.next()) + Double.parseDouble(output.next())
                        + Double.parseDouble(output.next()) + Double.parseDouble(output.next())
                        + Double.parseDouble(output.next()))
                / 5);

         */

        /*
        Write a program that  asks users their balance as a string and asks for 3 transactions as string and print out
        the end result as double.

        Input:
        "What is your balance?"
        user: 456.7
        "What is your next 3 transactions?"
        user:
        34.1
        65.3
        28.4

        Output:
        "Your balance is now = x"


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your balance?");
        String userBalance = scan.next();
        System.out.println("What is your next 3 transactions");

        System.out.println("Your balance is now = " +
                (Double.valueOf(userBalance) -
                        Double.valueOf(scan.next()) -
                        Double.valueOf(scan.next()) -
                        Double.valueOf(scan.next())));

         */

        /*
        Write a program ASK user for full name, age, phone number and then
        enter their 3 kids age as string then print out the oldest kid, youngest and
        the age difference between oldest and youngest
        Program: "Please enter your name"
        User: John Doe
        Program: "Please enter your age:"
        User: 45
        Program: "Please enter your phone number:"
        User: (123) 123 1234
        Program: "Enter the ages of your kids: "
        User:
        12
        22
        17
        Program: Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between ages are 10
        years.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scan.nextLine();
        System.out.println("Please enter your age:");
        String userAge = scan.nextLine();
        System.out.println("Please enter your phone number:");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the ages of your kids:");
        int kidAge1 = Integer.parseInt(scan.nextLine()),
                kidAge2 = Integer.parseInt(scan.nextLine()),
                kidAge3 = Integer.parseInt(scan.nextLine());

        int oldestKid = Math.max(Math.max(kidAge1, kidAge2), kidAge3);
        int youngestKid = Math.min(Math.min(kidAge1, kidAge2), kidAge3);

        System.out.println("Your name is " + userName + ", your phone number is " + phoneNumber + ",\n" +
                "You are " + userAge + " years old, Your oldest kid is " + oldestKid + " years old, your\n" +
                "youngest is " + youngestKid + ", difference between ages are " + Math.abs(oldestKid - youngestKid)
                + "\nyears");






    }
}
