package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {

        /*
        Method Task: These methods are used to convert letters of a String to uppercase or lowercase
        - They are non-static methods that you can call them with objects of String class
        - They are return type methods, and they return the modified String object back
        - They don't return any arguments
         */


        String s1 = "HELLO world $10";

        System.out.println(s1); // HELLO world
        System.out.println(s1.toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD


        System.out.println(("LSHDkjasndn bLJKHS  KDbkldbkasbHB").toUpperCase() + (" SHdbhbfkbskJSNKd" +
                " JKSHDjk JSDb").toLowerCase());
        String sentence = "I paid $100.99 to buy airpods";
        String s2 = sentence.toLowerCase(); // i paid $100.99 to buy airpods
        String s3 = sentence.toUpperCase(); // I PAID $100.99 TO BUY AIRPODS

        System.out.println(s3.toLowerCase().toUpperCase());



    }
}
