package homeworks;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Requirement:
        Assume that you are given a String as below;
        String str = "SDLC is step-by-step procedure to create an application";
        Write a program to find length of given String and the indexes of
        "SDLC" and "application" words

        /////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n----------Task-1------------\n");
        String str = "SDLC is step-by-step procedure to create an application";
        System.out.println("The length of the string is = " + str.length()); // 55
        System.out.println("The index of 'SDLC' is = " + str.indexOf("SDLC")); // 0
        System.out.println("The index of \"application\" is = " +
                str.indexOf("application")); // 44



        Task 2
        Requirements:
        Assume that you are given a string as below:
        String str = "  I know how to code with Python  ";
        Write a program to manipulate given String and convert it to be:
        "I KNOW HOW TO CODE WITH JAVA"

        System.out.println("\n----------Task-2------------\n");
        String str = "  I know how to code with Python  ";
        System.out.println(str.trim().replace("Python", "Java").toUpperCase());

        Task-3
        Requirement:
        Assume that you are given a String as below:
        String str = "    SDLC has planning, design, development, testing, planning, deployment and maintenance phases    ";
        1. Find the first character of a given String which is not white space
        2. Find the last character of given String which is not white space


        System.out.println("\n----------Task-3------------\n");
        // 1st way
        String str = "    SDLC has planning, design, development, testing, planning, deployment and maintenance phases    ";

        System.out.println("The first character of a given String is = " + str.trim().charAt(0));
        System.out.println("The last character of a given String is = " + str.trim().charAt(str.trim().length() -1));

        // 2nd way

        System.out.println("\n----------Task-3------------\n");

        String str1 = "    SDLC has planning, design, development, testing, planning, deployment and maintenance phases    ".trim();

        System.out.println("The first character of a given String is = " + str1.charAt(0));
        System.out.println("The last character of a given String is = " + str1.charAt(str1.length() -1));

        Task-4
        Requirement:
        Assume you are given 3 Strings as below:
        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL        ";
        Write a program that manipulates these 3 String and stores them in a new String s4
        and s4 will get a value of "TechGlobal"
        NOTE: The length of s4 will be 10 at the end!!


        System.out.println("\n----------Task-4------------\n");
        String s1 = "  TECH ".trim();
        String s2 = " glo  ".trim();
        String s3 = " BAL        ".trim();
        String s4 = s1+ s2+ s3;
        System.out.println((s1 + s2 + s3).toLowerCase().replace('t', 'T').replace('g', 'G'));
        System.out.println((s1.trim() + s2.trim() + s3.trim()).toUpperCase().replace("ECH", "ech").replace("LOBAL", "lobal"));

        Task-5
        Requirement:
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character = g
        Last character = n
        First 3 characters are = gre
        Last 3 characters are = een



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite color?");
        String color = input.nextLine();
        System.out.println("1st character = " + color.charAt(0)); // p
        System.out.println("Last character = " + color.charAt(color.length() -1)); // e
        System.out.println("First 3 characters are = " + color.substring(0, 3)); // pur
        System.out.println("Last 3 characters are = " + color.substring(color.length()-3)); // ple


        TASK-6
        Requirements:
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print out the first and last words in the given sentence
        Test data:
        JavA is an object-oriented programming LanguAGE
        Expected output:
        1st word is = java
        2nd word is = language

        System.out.println("What is Java?");
        String sentence = ScannerHelper.getAStringFromUser().toLowerCase();

        System.out.println("1st word is = " + sentence.substring(0, sentence.indexOf(' ')));
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ')+1));

        Task-7
        Write a program that asks user to enter a full sentence
        Then check if given sentence contains $ character
        If it contains $ character then find index of the $ character and
        print a proper message for the found index

        Test data 1:
        I saved $100 to buy new airpods
        Expected output 1:
        This sentence contains $ character
        $ character's index is = 8

        Test data 2:
        I'll become a Software Engineer in Test
        Expected output 2:
        This sentence does not contain $ character
         */

        String sentence = ScannerHelper.getAStringFromUser();
        if(sentence.contains("$")) {
            System.out.println("This sentence contains $ character");
            System.out.println("$ character's index is = " + sentence.indexOf("$"));
        }else{
            System.out.println("This sentence does not contain $ character");
        }







    }
}
