package stringMethods;

import java.util.Locale;

public class _14_isEmpty {
    public static void main(String[] args) {
        /*
        Method Task: It is used to check if a given string is empty or not
        - It is non-static, and we call it with object
        - It is a return type, and it returns a boolean
        - It does not take any arguments

        "".isEmpty()      -> true
        "Hello".isEmpty() -> false
        " ".isEmpty()     -> false
        !"".isEmpty()     -> false
         */

        String name = "John";
        System.out.println(name.isEmpty()); // false
        System.out.println(name.replace(name, "").isEmpty()); // true
        System.out.println("Hello".toLowerCase().replace("hello", "").isEmpty()); // true
    }
}
