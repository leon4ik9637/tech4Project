package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence (multiple words)
        Find and print the first and the last words from the given sentence with below messages

        Test data1:
        I like Java

        Expected output:
        The first word is = I;
        The last word is = Java;

        First word -> 0 - indexOf(' ')
        Last word -> lastIndexOf(' ') + 1 to the end

        Test data2:
        Today is Sunday

        Expected output:
        The first word is = Today;
        The last word is = Sunday;

         */
        /*
        Method 1:

        Scanner input = new Scanner(System.in);
        System.out.println("What do you like?");
        String str1 = input.nextLine();
        System.out.println("The first word is = " + str1.substring(0, 1));
        System.out.println("The last word is = " + str1.substring(str1.length()-4));

        System.out.println("What day is it today?");
        String str2 = input.nextLine();
        System.out.println("The first word is = " +
                str2.substring(str2.indexOf('T'), str2.length()-10));
        System.out.println("The last word is = " +
                str2.substring(str2.length()-6));

         */
        // 2nd way
        String sentence = ScannerHelper.getAStringFromUser(); // enter a sentence

        String first = sentence.substring(0, sentence.indexOf(' '));
        String last = sentence.substring(sentence.lastIndexOf(' ')+1);
        System.out.println("The first word is = '" + first + "'");
        System.out.println("The last word is = '" + last + "'");





    }
}
