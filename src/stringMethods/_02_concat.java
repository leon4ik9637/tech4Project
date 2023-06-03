package stringMethods;

public class _02_concat {
    public static void main(String[] args) {
        /*
        1. concat();
        Method Task: It is used to combine multiple strings and forms a new one
        - It is non-static, and we can call it with an object created
        - It is a return type method, and it returns a new String that is the
        combination of the others
        - It takes a String as an argument

        STRING COMPARISON
        "Hello" is equal to "Hello"     -> true
        "hello" is equal to "HELLO"     -> false

        When we compare primitives, we can use == for comparison
        5 == 5          -> true
        'A' == 'A'      -> true
        'B' == 66       -> true
        true == true    -> true
        false == true   -> false
        12.5 == 12.4    -> false
        (int)(12.5) == (int)(12.4)      -> true

        When we compare primitives, we can use == for comparison

        5 == 5

        String s1 = "Hello";
        String s2 = "Hello";

        DO NOT EVER COMPARE STRINGS OR OTHER OBJECTS USING ==
        USE equals() or equalsIgnoreCase() methods

        if(s1 == s2){}  // INCORRECT

        if{s1.equals(s2)){      //CORRECT
            System.out.println("These strings are equal");
        }else{
            System.out.println("These strings are NOT equal");
        }

        if{s1.equalsIgnoreCase(s2)){      //CORRECT
            System.out.println("These strings are equal");
        }else{
            System.out.println("These strings are NOT equal");
        }




         */

        String s1 = "Tech";     // String object
        String s2 = "Global";   // String object

        String s3 = s1.concat(" ".concat(s2));  // String s3 = s1 + " " + s2;

        System.out.println(s3.concat(" School"));
        System.out.println("Hello".concat(" ").concat("World!"));
        System.out.println("Hello".concat(" " + "World!"));




    }
}
