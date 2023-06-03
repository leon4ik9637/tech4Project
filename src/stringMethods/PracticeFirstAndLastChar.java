package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirstAndLastChar {
    public static void main(String[] args){
        /*
        Write a program that asks user to enter their name
        Print first char of the name with message
        "First character of the name is = "
        Print last char of the name with message
        "Last character of the name is = "

        Kaly
        charAt(0)
        charAt(3) -> name.length() - 1

        Taylor
        charAt(0)
        charAt(5) -> name.length() - 1

        Guluzar
        charAt(5) -> name.length() - 1

        NOTE:
        First character of String is always -> str.charAt(0)
        Last character of String is always -> str.charAt(str.length() - 1)

         */

        String name = ScannerHelper.getANameFromUser();


        System.out.println(name.charAt(0)); //First char
        System.out.println(name.charAt(name.length()-1)); // last char
        System.out.println(name.charAt(name.length()-2)); // second last char

        /*
        Taylor

        0 -> T
        5 -> r

         */





    }
}
