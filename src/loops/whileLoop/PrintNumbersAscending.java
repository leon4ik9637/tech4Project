package loops.whileLoop;

import java.util.Scanner;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        Loops:
        - Reusability - it allows us to execute a block of code repeatedly
        - It prevents code duplication and time-consuming
        - Loops always has a start and a termination point, and it will
        terminate whenever termination point met

        There are 4 loops:
        1. For Loop
            for(initialization; termination; change){
                // Block of code to execute
            }
            for(int i = 0; i < 10; i++){
                System.out.print(i + " ");
                System.out.print(i + "-");
            }
            0 1 2 3 4 5 6 7 8 9 10
            0-1-2-3-4-5-6-7-8-9-10

            String s == "";
            for(int i = 0; i < 10; i++){
                s += i + "-";
            }
            0-1-2-3-4-5-6-7-8-9-
            s.substring(0, s.length()-1); // 0-1-2-3-4-5-6-7-8-9


        2.While loop
        SYNTAX:
        while(condition){
            // block of code to execute
        }

        for(int i = 1; i <= 3; i++){
            System.out.println(i);
        }

        int i = 1;                  // start point
        while(i <= 3){              // condition/termination point
            System.out.println(i);
            i++;                    // update
        }
        Output:
        1
        2
        3

        Each attempt is an iteration
        WHEN TO USE WHILE OR FORI LOOPS OVER EACH OTHEr?
        - Do I know the termination point or do I know how many times the
        loop will run exactly.
        If yes -> fori loop
        If no  -> while loop
        - For loop is used to execute a block of code and preferred when
        we know the exact number of iteration
        - While loop is used to execute a block of code based on a condition
        and total number of iteration is not certain (dynamic)
        - While loop can be used instead of for loop

        3. Do-while loop
        while(condition){
            // Block of code to execute
        }

        SYNTAX:
        do{
            // Block of code to execute
        }
        while(condition);

         */
        /*
        Write a program that prints numbers from 1 to 7 (included)
         */
//        for(int i = 1; i <= 7; i++){
//            System.out.println(i);
//        }
        int i = 1;
        while(i <= 7){
            System.out.println(i);
            i++;
        }


    }
}
