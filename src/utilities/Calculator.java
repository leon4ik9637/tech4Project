package utilities;

public class Calculator {

    /*
    What do we need to create a method
    1. A proper name
    2. Decide its accessibility level (public)
    3. Decide its accessibility way (You want to call it with class name or
    with object name)
        static -> you want to call it with class name
        non-static -> You want to call it with object name
    4. Decide if it returns something or not
        if it returns -> then decide what it returns
        if it does not return -> then you put void
    5. Does it take any arguments
        if it takes, then decide what arguments it takes and how many arguments it takes

    NOTE: if your method is not void meaning it is return type
    you MUST return keyword in the body of the method.
    NOTE: if your method returns an int, then the variable used next to
    return keyword in the body MUST be an int
    NOTE: every method must have a body that runs a task
    NOTE: we can have multiple methods sharing same name in the same class only
    if the have different arguments. Different arguments could be either the number
    of arguments are different or the types of arguments are different
    NOTE: do not ever create a method inside another method

    public class Test{
        public static void main(String[] args){
            int ran1 = RandomNumberGenerator.getRandomNumber(25, 50);

            System.out.println("The number is between 25 and 50 is = "
            + (25 <= ran1 && ran1 <= 50)); // true
        }


     */
    public static int divideInt(int num1, int num2){
        return num1 / num2;
    }

    public static double divideDouble(double num1, double num2){
        return num1/num2;
    }

    // Create a method that finds the sum of 2 int numbers and returns it
    // Create a method that finds the sum of 2 double numbers and returns it
    // Create a method that finds the absolute difference of 2 int numbers and returns it
    // Create a method that finds the absolute difference of 2 double numbers and returns it
    // Create a method that finds the product of 2 int numbers and returns it
    // Create a method that finds the product of 2 double numbers and returns it

    public static int sumInt(int num1, int num2){
        return (num1 + num2);
    }
    public static double sumDouble(double num1, double num2){
        return (num1 + num2);
    }
    public static int differenceInt(int num1, int num2){
        return(Math.abs(num1 - num2));
    }
    public static double differenceDouble(double num1, double num2){
        return(Math.abs(num1 - num2));
    }
    public static int productInt(int num1, int num2){
        return(num1 * num2);
    }
    public static double productDouble(double num1, double num2){
        return(num1 * num2);
    }





}
