package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        STEPS TO TEST:
        1. Create a Scanner object
        2. Ask user to enter number 1 and store it in an int variable called num1
        3. Ask user to enter number 2 and store it in an int variable called num2
        4. Use Math.max(num1, num2) to find max value and store it in an int variable
        called max
        5. Use Math.min(num1, num2) to find max value and store it in an int variable
        called min
        6. Start a fori loop where your start point is min, termination point is
        max and update is increment
        7. Print each number with loop but skip 5


        Write a Java program that asks user to enter 2 different integers
        between 0 and 10 (included)
        Print all the numbers between given 2 integers starting
        from the smallest to biggest
        HOWEVER, do not print the number of 5

        6 8     -> 6 7 8
        9 7     -> 7 8 9
        1 3     -> 1 2 3
        3 7     -> 3 4 6 7
        TC1: 5 5
        This should print nothing (empty)

        TC2: 4 6
        TC3: 6 4
        4
        6
        TC4: 8 8
        8

        TC5: 2 2
        2

        TC6: 5 8
        6
        7
        8

        TC7: 5 2
        2
        3
        4

        TC8: 7 9
        TC9: 9 7
        7
        8
        9

        TC10: 2 3
        TC11: 3 2
        2
        3

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int num1 = scan.nextInt();
        System.out.println("Please enter a different number");
        int num2 = scan.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);


        // First way - without control statements
//        for(int i = min; i <= max; i++){
//            if(i != 5) System.out.println(i);
//        }
        // Second way - with control statements
        for(int i = min; i <= max; i++){
            if(i == 5) continue;
            System.out.println(i);
        }
    }
}
