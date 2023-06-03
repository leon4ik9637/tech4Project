package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        RECAP:
        main method:
        - it does not belong to any class but JVM itself
        source code -> javac -> byte code -> JVM -> binary code
        - JVM is where our code is actually executed
        - JVM first looks where the main method is
        - It starts executing code in the main method from top to bottom
        and left to right
        - public: you can call it everywhere
        - static: easy access
        - void: it does not return anything
        - it takes a String[] (String array) as an argument

        String methods:
        John.toUppercase() -> JOHN
        John.equals("JOHN") -> false
        "John".equalsIgnoreCase("JoHN") -> true
        "John".startsWith("A") -> false
        "John".startsWith("j") -> false

-----------------------------------------------------------

        String methods learnt so far:
        What is the task? What is does?
        Is it static or non-static?
        Is it return type, then what it returns?
        Does it take any argument?

        1. valueOf();
        Method Task: Convert given variable to a String
        - it is static -  you can call it with class name
        - it is a return type, and it returns a String
        - it takes different arguments as it is an overloaded method
        and converts given args to a String





         */

        int i = 5;



        String num = String.valueOf(i);     // num = 5

        System.out.println((i + i));        // 10
        System.out.println(num + num);      // 55
    }
}
