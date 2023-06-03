package oop_principles;

public class Understanding {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);

        DO NOT MEMORIZE -> UNDERSTAND THE LOGIC (INTERPRET)

        Part-1

        1. Object vs Class
        2. Class members (what we have in a class)
            a. methods - functions - behaviours
                void methods
                return type methods
            b. attributes - fields - instance variables - states
            c. constructor;
            d. blocks
                instance blocks
                static blocks
        3. Access modifiers vs non-access modifiers
            1. Access modifiers
                a. public
                b. protected
                c. default
                d. private
            2. Non-access modifiers
                a. static
                b. final
        4. Object-Oriented Programming Principles (Concepts)
            a. Encapsulation
            b. Inheritance
            c. Abstraction
                Interface
                Abstract Classes
            d. Polymorphism
                Dynamic polymorphism (Runtime polymorphism)
                Static polymorphism (Compile-time polymorphism)
        5. Java Memory Management
            a. Stack & Heap
            b. Garbage Collection
        6. Mutable-Immutable

        Class: it is a blueprint-template-prototype that we use
        to create many objects from.

        Object: It is an instance of class (object of a class)
        NOTE: Objects are instance of a class. Class can be
        instantiated with objects

        Class: String, Arrays, LinkedList, ArrayList, Character,
        Scanner, Math, Random, System, Vector, Collections

        Class: ScannerHelper, CharacterHelper, MathHelper,
        RandomNumberGenerator;

        In Java, there is only class called as String

        String name1 = "Melda";
        String name2 = "Guluzar";
        String address = "Chicago";

        In Java, there is only class called as Scanner
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in)
        Scanner myScanner = new Scanner(System.in)
        Scanner t12 = new Scanner(System.in)

        DATA TYPES IN JAVA
        1. Primitives
        2. Reference types

        boolean-byte-char-short-int-long-float-double

        String greeting = "Hello";
        Apple object (green, sour)
        Apple object (red, sweet)

        apple1 = Apple{color = 'green', taste = 'sour'}
        apple2 = Apple{color = 'red', taste = 'sweet'}

        System.out.println(apple1.color); // green
        System.out.println(apple1.taste); // sour

        System.out.println(apple2.color); // red
        System.out.println(apple2.taste); // sweet

        HOW TO CREATE A CLASS

        SYNTAX:
        - class keyword helps us create a new class
        - class in Java can only be public or default
        - it CANNOT be protected or private

        class ClassName{

        }

        class Apple{
            //class members
        }
        HOW TO CREATE OBJECT
        SYNTAX:
        - new keyword is MUST, to use to create an object
        - without new keyword, you cannot create a new object
        - new keyword is always used together with constructor to
        create a new object

        ClassName variableName = new ClassName();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Scanner scan = new Scanner(System.in);

        Class Members:
        1. constructor
        - it is always used next to new keyword to create an
        object
        - it is a special kind of method that helps to create
        objects
        - the main difference between constructor and a method
        is that a constructor CANNOT BE void or return type
        - Constructor MUST ALWAYS HAVE THE SAME NAME as class name
        - Constructor name is always uppercase (same as class name)
        - Both constructors and methods can be overloaded
        - Like methods, constructors can also take as many arguments
        you need
        - Whenever you invoke a constructor to create an object, you
        also execute a block of from the constructor


        Method syntax:
        accessModifier returnType methodName(arg1){

        }

        accessModifier returnType methodName(arg1, arg2){

        }

        Constructor syntax:
        accessModifier ClassName(){

        }

        accessModifier ClassName(arg1){

        }

        accessModifier ClassName(arg1, arg2){

        }

        Every object has some features
        Car: color, model, make, engine, trim, year
        Fruits: color, shape, taste, texture, size
        Computer: OS, CPU, RAM, brand, color, size, drivers
        Person: Gender, name, race, country

        2. States - Attributes - Fields - Instance variables
        Apple: color, taste, price

        CLASS MEMBERS:
        1. constructor
        2. instance variables - attributes - states - fields
        3. methods - functions - behaviors
        4. blocks

        1. Constructor
            - Constructor are special methods allowing us to create
            objects of a class
            - Constructor MUST always have the same name as class name
            - Java provides a default (non-arg) constructor once a class
            is created. Since class name is always uppercase, constructor
            name should also always be uppercase.
                SYNTAX:
                public ClassName(){

                }
            - Constructor is always used next to "new" keyword which
            helps to instantiate an object
            - Constructor are like methods, but they don't have a return type.
            - They can tak arguments and can be overloaded just like methods
            - Default constructor will be provided unless you create
            your own custom constructor. Once you create yours, Java
            will not provide default one anymore. BUT, if you still
            want to the default one as well, then you need to create it
            explicitly by yourself.

        Scanner class cannot be instantiated with no argument.
        Scanner scan = new Scanner(); // compiler error

        public class Car{
            //default constructor

            public Car(){ // default constructor
                System.out.println("This is Car default constructor");
                System.out.println("Hello");
            }
            public Car(int i){ // overloaded constructor
                if(i > 0) System.out.println("This is positive");
        }

        public static void main(String[] args) {
            Car car1 = new Car(); //
            Car car2 = new Car();
            Car car3 = new Car();

            Car car4 = new Car(-2);
            Car car5 = new Car(0);
            Car car6 = new Car(5);

            Car car7 = new Car("Hello"); // compiler error

        }

        This is Car default constructor      // Car car1 = new Car();
        Hello
        This is Car default constructor      // Car car2 = new Car();
        Hello
        This is Car default constructor      // Car car3 = new Car();
        Hello
        This is positive

        EXAMPLES OF CLASS AND OBJECT

        Class -> Car
        Objects -> BMW X6, Audi Q8, Lexus 460, Volkswagen Jetta

        Class -> Food
        Objects -> Kebab, Salad, Rice, Sushi,

        Class -> Student
        Object -> Daria, Kaley, Rami, Wazwaz

        2. Instance Variables - attributes - states - fields
        - WHAT DOES OBJECT HAVE

        Class: Car
        Instance variables: year, make, model, trim, engine, color

        public class Car{

            // Default Constructor
            public Car(){

            }

            // Define instance variables
            public int year;
            public String make;


        }

        2017 BMW M3 Series
        2020 Toyota Camry SE Sport Edition

        Method Overloading vs Overriding
        - Method overloading happens in the same class, and it is known
        as having multiple methods with the same name but different
        arguments. Constructors can also be overloaded with different
        arguments similar to methods.
        - Method overriding happens in the child class and this is known
        as child class implementing a different method body for the
        parent class method

        3. Methods - functions
        - WHAT DOES OBJECT DO

        - drive(), stops(), signals(), brake(), accelerate(), honks()

        public class Car{

            public void honks(){
                System.out.println("This car honks");
            }
        }

        public class Mercedes extends Car{ // Inheritance

            @Override
            public void honks(){
                System.out.println("Mercedes honks");
            }
        }

        Mercedes becomes a child class
        Car becomes a parent to Mercedes

        Mercedes honks

        Mercedes m1 = new Mercedes();
        m1.honks(); // Mercedes honks

        Parent class - super class - base class
        Child class - sub class





         */
    }
}
