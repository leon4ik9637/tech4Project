package oop_principles;

public class Recap {
    public static void main(String[] args) {
        /*
        Class: It is a blueprint where we define many members of its
        instances and be able to create many instances from it

        Object: It is an instance of a class

        Class members:
        1. instance variables: defines the attributes of the instance
            These are declared in the class level

            Instance variables vs local variables
            Local variables: They are variables that are declared in main,
            if-else, switch, loops, methods, etc. Their scope is
            restricted to the statements or methods they are declared in.

            Instance variables: They are declared in the class level and
            belong to the instance of that class. Their scope is definitely
            wider that local variables and determined with access modifiers
            (public-protected-default-private)
        2. methods - functions: defines the behaviors of the instances
        3. constructor: helps instantiate the clas with instances
        4. blocks: used to initialize static and non-static instance
        variables

        NON-ACCESS MODIFIERS
        - final and static keywords are used as non-access modifiers
        static instance variables:
        - static instance variables mean that variables belong to the
        class and hence can be called with class name
        - non-static instance variables belong to object, and they can be
        called with and object name

        final instance variables:
        - They must be initialized meaning you must assign them some values
        - This default value that you initialized CANNOT BE CHANGED anywhere

        NOTE: One instance variable can be final and static at the same
        time.
        These instance variables are also known as constants

        4. Blocks
        {
            //This is a block
        }

        1. Local blocks: Switch, if-else, loops, methods, constructors

        Class Members
        2. Instance blocks: are used to initialize non-static instance
        variables
            Instance initialization block
        3. Static blocks: are used to initialize static instance variables
            Static initialization block

            NOTE: static instance variables can be initialized in the
            non-static block as well.
            NOTE: non-static instance variables can only be initialized in
            the non-static blocks

        class Animal{
            public static boolean hasEyes = true; // false -> true
            public String name = "abc"; // null -> abc

            static{
                hasEyes = true;
            }
            {
                name = "abc";
            }
        }

        WHEN DOES STATIC AND INSTANCE BLOCKS INVOKE?
        - Once you create an object both static and instance blocks will be
        executed.

        Can you run a code before main method in Java?
        - Yes, we can have static blocks which runs before main method

        DATA TYPES:
        1. Primitives
        2. Reference types

        NOTE: Primitives help us store a piece of data that is not
        complex such as 1, 5, 1000, 'A', '%', true, false, 34.56

        Any other complex information can be stored using Objects -
        Reference Types in Java.

        - To store a sequence of a characters, we can use String
        "Hello", "Data", "123 st, Chicago IL"
        - Collections are used for storing multiple similar items




        
         */

    }
}
