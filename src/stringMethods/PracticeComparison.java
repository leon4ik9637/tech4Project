package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    /*
    Write a JAVA program that asks a user to enter 2 strings
    And store answers of user in different String variables
    Finally, check if given 2 Strings are equal or not and print messagges given below

        Test data 1:
        Java
        java

        Expected output 1:
        These strings are not equal

        Test data 2:
        Hello
        Hello

        Expected output:
        These strings are equal
     */
    public static void main(String[] args) {
        System.out.println("\n-------------1st-Way-----------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String s1 = input.nextLine();
        System.out.println("Please enter another string");
        String s2 = input.nextLine();
        if(s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");


        //2nd way
        System.out.println("\n-------------2nd-Way------------\n");


        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ?
                "These strings are equal" : "These strings are not equal");


    }
}
