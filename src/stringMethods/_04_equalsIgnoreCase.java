package stringMethods;

import utilities.RandomNumberGenerator;

public class _04_equalsIgnoreCase {
    public static void main(String[] args) {
        /*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison is case-sensitive
        - It is non-static, and we call it with another String object
        - It is a return type and returns boolean
        - It takes a String as an argument
         */


        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));  // true
        System.out.println("Hello".equalsIgnoreCase(" hello"));  // false

        String s1 = "Good";
        String s2 = "Nice";

        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println(b);


    }
}
