package myFirstDay;

import methods.Introduction;

public class MyFirstProgram {
    public static void main (String [] args) {
        // Your code goes here

        //println() vs print()
        //println() -> it prints the statemenet in the "", and moves my cursor to next line
        //print() -> It prints the statement but does NOT move to the next line
        System.out.println("Hello World");
        System.out.println();// This line moves cursor to the next line
        System.out.println("My name is Leon");
        System.out.println("Me gusta tu, te amo");
        System.out.println("Hello World!");
        System.out.println("TechGlobal");
        System.out.println("Today is Wednesday");
        // print
        //System.out.print("TechGlobal");
        //System.out.print("Global");
        //System.out.print("Apple");
        //System.out.println();
        //System.out.println("Tech");
        //System.out.println("Global");
        //System.out.println("Apple");

       // System.out.println();
       // System.out.println("Tech\nGlobal");

       // System.out.println();
        //System.out.println("Apple\nOrange");

        //System.out.println("\tTech\nGlobal");
        System.out.println("\tleonid\n\tkuchman\n\n");
        //System.out.println("    leonid");
        //System.out.println("    kuchman");
        //System.out.println("\tlego\tplayCS\n\n\tGlobal\n\tOffensive\n");

        System.out.println("\"TechGlobal\"\n");
        System.out.println("\'TechGloba\'\n");
        //   \TechGlobal\
        System.out.println("\\TechGlobal\\");

        System.out.println("\t\"Nikola Tesla\" Serbian Cyrillic pronounced 10 July 1856 - 7 January 1943" +
                " was a Serbian-American\ninventor, elevtrical engineer, mechanical engineer, and futurist" +
                " best known for his\nto the design of the modern alternating curent (AC) electricity supply system.");



        //  leonid
        //  kuchman

        Introduction.introduce("Lionel", "soccer player", 25, "coach");
        Introduction.introduce("Guluzar", "trainer", 25, "Java");

    }
    /*
    To be able to run some code, we should first call main method
    All my codes MUST be inside class curly braces (block)
     */

}