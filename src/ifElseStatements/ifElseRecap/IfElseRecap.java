package ifElseStatements.ifElseRecap;

import java.util.Scanner;

public class IfElseRecap {
    public static void main(String[] args) {

        /*
        if else statements:
        public static void main(String[] args){

        int hour = 10;

        if(hour > 6 && hour < 12){ // true
            System.out.println("Good morning");
        }
        if(hour > 17 && hour < 20){ // false
            System.out.println("Good evening");
        }
        if(hour > 20 && hour < 24){ // false
            System.out.println("Good night");
        }
        System.out.println("End of the program!");
        }
        Java runs from top to bottom and left to right
        CONSOLE OUTPUT:
        Good morning (when hour = 10)
        Good evening
        Good night
        End of the program!
        0-24 hours

        condition
        blocks - true block will be executed

        THE BEST CODE
        1. less line of code
        2. dynamic
        3. better performance
        4. readability (variable naming, camelCase rule, comments)


        Sunday -> 1. bowling 50 people
                  2. picnic
                  3. watching a movie
                  4. go to campus
        if we can reserve a place, then we will go to bowling
        else if weather is nice, we can go to picnic
        else if there is a nice movie, then we will watch a movie
        else we go to campus


        Debugging - Trouble-Shooting
        - It is used to run your code line by line to see progress slowly
        and we usually use it when we have issues

         */


        Scanner inputReader = new Scanner(System.in);

        /*System.out.println("Please tell me what time is it?");

        int hour = inputReader.nextInt();

        if(hour > 6 && hour < 12){ // true
            System.out.println("Good morning");
        }
        else if(hour > 17 && hour < 20){ // false
            System.out.println("Good evening");
        }
        else if(hour > 20 && hour < 24){ // false
            System.out.println("Good night");
        }else {
            System.out.println("Good bye");
        }

         */

        /*
        101 - Introduction to City Planning
        50+ -> PASSED
        <50 -> FAILED
        50-59 -> F
        60-69 -> D
        70-79 -> C
        80-89 -> B
        90-100-> A
        Did you pass that class?
            - Yes (Kaly's grade is more than or equal to 50)
            - No

        Did you pass that class?
            -> Yes
            -> No (Akin's grade is less than 50)

        int grade = ___;
        if(grade >= 50){ // more than 50
            System.out.println("Congrats! You passed the class!");
            if(grade < 60){
                System.out.println("You passed with F");
             }else if(60 < grade < 70)
                System.out.println("You passed with D");
             }else if(70 < grade < 80)
                System.out.println("You passed with C");
             }else if(80 < grade < 90)
                System.out.println("You passed with B");
             }else{
                System.out.println("You passed with A");
             }
         else{ // less than 50
            System.out.println("Sorry! Next time hopefully!");

        NOTE:
        - We can have if statement without else
        - Else CANNOT be used without if




         */
        System.out.println("What is your grade?");
        int grade = inputReader.nextInt();

        if (grade >= 50){ // more than 50
            System.out.println("Congrats! You passed the class!");
            if (grade < 60){
                System.out.println("You passed with F");
            }
            else if (grade < 70){
                System.out.println("You passed with D");
            }
            else if (grade < 80){
                System.out.println("You passed with C");
            }
            else if (grade < 90){
                System.out.println("You passed with B");
            }
            else{
                System.out.println("You passed with A");
            }
        }
        else { // less than 50
                System.out.println("Sorry! Next time hopefully!");
            }

        }
    }
