package javaMemoryManagement;

public class ReverseExercise {
    /*
    Write a method that takes a String and returns it reversed
     */

    //loop logic
    public static String reverse1(String s){
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            r.append(s.charAt(i));
        }
        return r.toString();
    }

    public static String reverse2(String str){
        return new StringBuilder(str).reverse().toString();
    }

    /*
    Create a method that takes a String and check if it is palindrome
    Return true if so, false otherwise
     */

    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(reverse1("Hello"));
        System.out.println(reverse1("World"));

        System.out.println(reverse2("Civic"));
        System.out.println(reverse2("John"));
        System.out.println(reverse2("Kaly"));

        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("Madam")); // false
        System.out.println(isPalindrome("123321")); // true
    }
}
