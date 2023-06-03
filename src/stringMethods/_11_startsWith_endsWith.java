package stringMethods;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {
        /*
        Method Task: They are used to finding out if the string starts with or ends with
        another letter or string
        - They are non-static, and we call them with objects
        - They return boolean
        - They take String as arguments
        

        startsWith() & endsWith()

        "Hello".startsWith("h"); // false
        "Hello".toLowercase().startsWith("H"); // false
        "Hello".startsWith("He"); // true

        "Hello".endsWith("Hello"); // true
        "Hello".startsWith("Hello"); // true
        "Hello".startsWith("Hel") && "Hello".endsWith("llo"); // true

        "Hello".toUppercase().substring(3).startsWith("l"); // false
        HELLO
        LO

        "Hello".startsWith("Monday");    // false

         */

        String str = "Today is Sunday";
        System.out.println(str.startsWith("Today"));// true
        System.out.println(str.startsWith("today"));// false
        System.out.println(str.endsWith("day"));

        System.out.println(str.toUpperCase().endsWith("SUNDAY")); // true
        System.out.println(str.startsWith("is", 6)); // true
    }
}
