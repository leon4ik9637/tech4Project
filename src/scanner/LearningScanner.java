package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){


        /*
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading the data.
         */

        Scanner scanner = new Scanner(System.in);// creating a scanner object for using the methods of it

        System.out.println("Please put your first name"); // this is what i want user to put
        String firstName = scanner.next(); // leon

        System.out.println("Please put your last name");
        String lastName = scanner.next();  // kuchman
        System.out.println("Enter your address");
        String yourAddress = scanner.next();

        System.out.println("First name = " + firstName); // Printing my object/variable
        System.out.println("Last name = " + lastName);
        System.out.println("Address = " + yourAddress);


        /*
        Scanner Recap
        - It is a class
        - It collects data from user
        - For using it we have to create and object of it and import the Scanner class
        - java.util package is where Scanner is
        - It has methods for reading numbers, true or false words.

        DataType/ClassType variableName/objectName = new DataTypa/ClassType(if it is needed);
        package pageName;

        import java.util.Scanner;

        public class ClassName(){
            main(){
            Scanner input = new Scanner(System.in)
            }
}
        1. input.next();
        - Code is getting pause and waiting for user's input
        - It is returning a String
        - Whenever the space is present it stops taking the input
        // Tech Global --> Tech

        2. input.nextLine();
        - Code is getting pause and waiting for user's input
        - It is taking and returning a String (more words in one string)
        - It is taking every single character as an input.
        // Tech Global --> Tech Global

        3. input.nextInt(), input.nextByte(), input.nextLong(), input.nextShort();
        - Code is getting pause and waiting for user's input
        - This is taking and returning  whole numbers
        - It is taking every number if it has the available size
        // Tech Global --> InputMissMatchException
        // 123 --> 123

        4. input.nextFloat(), input.nextDouble();
        - Code is getting pause and waiting for user's input
        - This is taking and returning decimal numbers
        - It is taking every number if it has the available size
        // Tech Global --> InputMissMatchException
        // 123 --> 123.0
        // 123.123 --> 123.123

        5. input. nextBoolean();
        - Code is getting pause and waiting for user's input
        - This is taking and returning true or false
        - It is taking every NOT CASE SENSITIVE true or false;
        // Tech Global --> InputMissMatchException
        // 123 --> InputMissMatchException
        // 123.123 --> InputMissMatchException
        // true --> true
        // TrUe --> true


        nextLine();
        ISSUE!:
        - Whenever we use different scanner methods other than nextLine();

        Solution:
        1. Extra nextLine() for getting rid space from other method.
        2. new Scanner for using the nextLine();
        //
        input.nextInt();

        input.nextLine(); // this will take the excess space from the nextInt() before.











         */






    }
}
