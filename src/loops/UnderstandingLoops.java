package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        /*
        Introduction Java Loops
        - Loops in Java are used to execute a block of code repeatedly
        - Loops will run until a termination condition is met
        - Loops are helpful to eliminate duplicating codes and time saving

        THERE ARE 4 TYPES OF LOOPS IN JAVA
        1. For Loop (i loop - traditional loop - traditional i loop - fori)
        2. While loop
        3. Do-while loop
        4. For-each loop

        1. For loop (traditional i loop or i loop)
        Syntax:
        for(initialization; termination condition; change){
            // code block to be executed
        }
        initialization -> startPoint -> int i = 0; int i = 1;
        termination condition -> endPoint -> condition to stop - boolean;
        change -> update -> update after each iteration

        Iteration -> each repeated execution in the loop
        Infinite Loop -> when there is no termination point and
        your loop runs forever
         */

        /*
        Write a Java program to print "Hello" 5 times

        Expected:
        Hello
        Hello
        Hello
        Hello
        Hello

        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
        }
         */

        for (int count = 1; count <= 10; count ++){ // post-increment
            System.out.println("Hello World!");
        }
        int year = 2022;

        for (int age = 27; age <= 52; age ++){ // post-increment
            System.out.println("The age is = " + age + " in " + year);
            year++;
        }

        System.out.println("End of the program!");

        String str = "hello";
        String asd = "";
        System.out.println(str + asd);

    }
}
