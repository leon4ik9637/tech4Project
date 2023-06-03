package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {

        /*
        Method Task: It is used to find out if a String contains another string or character
        - It is non-static, and we can call it with an object
        - it is a return type, and it returns a boolean
        - It takes a String argument

        "TechGlobal".contains("Tech"); // true
        "TechGlobal".contains("global"); // false
        "TechGlobal".contains("ech"); // true
        "Nataliia".contains("ii"); // true
        "asdjhjsfhfjb23984u30".contains("."); // false
        "Hello".contains("Hello ".trim()); // true

        "global".equals("Global"); // false

       // "Today is sunny".toUpperCase().substring(9).toLowerCase().startsWith("b") || "Hello".toLowerCase().contains("hello");


         */
        String s = "Good morning!";
        System.out.println(s.contains("Good")); // true
        System.out.println(s.contains("")); // true
        System.out.println(s.contains("123")); // false
        System.out.println(s.contains(s)); // true

        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"
        123 abc st, chicago IL 12345 -> You are in the club
        123 abc st, CHicagO IL 12345 -> You are in the club
        123 abc st, Des Plaines IL 12345 -> You are not in the club
        */

        String address = ScannerHelper.getAStringFromUser();

        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");

    }
}
