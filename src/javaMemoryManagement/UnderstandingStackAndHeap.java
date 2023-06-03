package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {
        /*

        STACK:
        - it is going to store local variables (primitives, object
        references), methods
        - When you run a program, different layers will be created in
        stack, and they will be executed in the order of program (Last
        in, first out)

        HEAP:
        - Heap is where objects (instances) are stored
        - Accessing object is slower compared to accessing a local
        variable
        - Instance variables are stored together with their objects in
        the heap

        NOTE: Primitives allocates less memory than objects
        NOTE: Primitives are faster to work with compared to objects

        Data Types:
        1. Primitives
        2. Reference types

        STRING POOL
        - String is an object (reference type)
        - There are 2 ways to create String
            1. String s1 = "value";
            2. String s2 = new String("value");
        - String that created without new keyword will be stored in the
        String Pool, a special area in the heap to store Strings
        - The reason of having String Pool is to save memory

        GARBAGE COLLECTION
         - Garbage means unreferenced objects (objects that lost their
         references)
         - Garbage Collection is a process of destroying objects that lost
         references
         - Garbage Collection runs automatically (implicitly) for better
         memory management in Java
         - NOTE: Garbage Collection applies only to reference types data
         (objects)

         int age = 45;
         age = 32;

        finalize() method
        - finalize() method cn be used to run a block of code before object
        reference is garbage collected
        - Purpose iof using this method is to do proper clean up before
        removing the object
        - By default, finalize() method is empty. However, you can write
        your own finalize method to take certain action by overriding it
        - This method is located in Object class and can be overridden
        wherever it is needed

        What is stack and heap in Java?
        - These are terms used for Java Memory Management
        - Heap stores all object and their instance variables while stack
        stores all methods and local variables
        - We also have a special area in the heap to store strings
        (String pool)

        What is garbage collection?
        - In our programs some objects lose reference, and they need to be
        cleared from the heap and this process happens implicitly

        null: an object point to nothing (no reference in the heap)

        Is there a way that you can do garbage collection explicitly?
        Yes, there are 2 ways
        1. System.gc();
        2. Runtime.getRuntime().gc();

        What is finalize() method?
        - This method belongs to Object class, and it is empty
        - Some classes may override this and provide a body
        - This body will be executed whenever an object of the class is
        garbage collected
        - Aim to override this method could be running a block of code when
        object is garbage collected

        What is final and finalize()?
        final is a non-access modifier used with instance variables,
        methods and classes
        finalize() is method related to garbage collection

        What is final, finalize() and finally?

        String -> immutable
        immutable: cannot be changed;

        String name = "John";
        name = "Johnathan";
        name = "John";
        name = "Abe";

        main(String[] args){
            String city = "Chicago";
            String address = "Chicago";
        }

        StringBuilder - StringBuffer -> mutable;
        mutable: Their value can be changed

        StringBuilder vs StringBuffer
         */

        int age = 45;
        System.out.println(age);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1); // Dog@14ae5a5
        System.out.println(dog2); // Dog@7f31245a
        System.out.println(dog3); // Dog@6d6f6e28


        System.out.println("\n\n\n");

        String s1 = "Data";
        String s2 = "Data";

        System.out.println("without new checking the VALUES = " + s1.equals(s2)); // checking the VALUES
        System.out.println("without new checking the LOCATION = " + (s1 == s2)); // checking the LOCATIONS

        String s3 = new String("Data");
        String s4 = new String("Data");

        System.out.println("with new checking the VALUES = " + s3.equals(s4)); // checking the VALUES
        System.out.println("without new checking the LOCATION = " + (s3 == s4)); // checking the LOCATIONS
    }
}
