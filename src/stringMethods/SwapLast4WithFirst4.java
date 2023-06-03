package stringMethods;

import java.util.Scanner;

public class SwapLast4WithFirst4 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print out the modified String
        Test data:
        TechGlobal
        Expected output:
        obalGLTech
        NOTE: Write a program that handles any String
        NOTE: First check if the length of string is at least 8, if the String's
        length is less than 8, then print message
        "This String does not have 8 characters"


        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.length() < 8){
            System.out.println("This String does not have 8 characters");
        }
        else{
            String first4 = word.substring(0, 4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4, word.length()-4);
            System.out.println(last4 + middle + first4);

        }

        Write a program that asks user to enter a sentence, and swaps
        first and last words of this sentence and print the modified sentence
        Test data:
        Selenium is an automation tool

        Expected output:
        tool is an automation Selenium
        NOTE: First check if the sentence is at least 2 words. If the sentence
        has only one or no word, then print message
        "This sentence does not have 2 or more words to swap"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease write a sentence");
        String sentence = scanner.nextLine().trim();
        if(sentence.trim().contains(" ")){
            System.out.println("This sentence does not have 2 or more words to swap");
        }else{
            System.out.println((sentence.substring(sentence.lastIndexOf(' '))));
        }
        // str.trim().indexOf(' ') >= 0  // -1


    }
}
