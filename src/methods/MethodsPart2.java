package methods;

public class MethodsPart2 {
    public static void main(String[] args) {
        /*
          METHODS PART 2
        Method:
        - It is also a function
        - Every method will have a task to execute when it is invoked
        - Reusable

        There are 2 types of methods in Java
        1. void methods
            - does not return anything but executes a block of code
            - return keyword cannot be used with this method
            - can be created with void keyword
            - void methods can be static or non-static
        2. return type methods
            - does return something
            - return keyword MUST be used, otherwise it is
            a compiler error
            - cannot use void keyword
            - return type methods can be static or non-static
        NOTE:
        Each time you invoke a method, all the code block will be executed

        NOTE:
        - static methods are accessible with className only, they
        cannot be accessed with objects
        - non-static methods are accessible with objects only, they
        cannot be accessed with className

        METHOD COMPONENTS
        accessModifier returnType methodName(){
            //body
        }

        ACCESS MODIFIERS:
        public      -> anywhere in the project
        default     -> only in the same package
        private     -> only same class
        protected   -> we will learn later


        returnType
        - It specifies what type of value a method returns. For
        example, if a method has an int return type then it
        returns an integer value
        - If the method does not return a value, its return type
        is void

        METHOD NAME
        - it always starts with lowercase
        - it follows camelCase rule
        - it must be meaningful

        method body
        - It includes the programming statements that are used to
        perform some tasks. The method body is enclosed inside the
        curly brackets {}

        Method parameters
        - Arguments that we pass inside the method parentheses

        BLOCK: {}
        public class Test{
            main(){

            }
            ------------------------------------------------------------

        How to create a method, what to consider?
        1. return type or void?
        2. is it static or non-static?
        3. arguments, does it take any arguments or not?
        4. what will be the access level (public, default, private)
        5. what will be the name?


        WHAT IS METHOD OVERLOADING?
        - In Java, two or more methods may have the same name

        HOW DO YOU ACHIEVE METHOD OVERLOADING?
        - different number of parameters or different types of
        parameters, or both

        METHOD SIGNATURE = methodName + arguments
        public static int max(int a, int b){
            return Math.max(a, b);
        }

        public static double max(double a, double b){
            return Math.max(a, b);
        }





         */





    }
}
