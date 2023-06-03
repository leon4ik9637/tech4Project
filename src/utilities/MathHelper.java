package utilities;

public class MathHelper {

    //Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    //method overloading
    public static double maxOfThree(double num1, double num2, double num3){
            return Math.max(num1, Math.max(num2, num3));

    }
    public static int divide(int num1, int num2) {
        return Math.max(num1, num2) / Math.min(num1, num2);
    }

    public static int average3Numbers(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }
    public static int average4Numbers(int num1, int num2, int num3, int num4){
        return (num1 + num2 + num3 + num4) / 4;
    }


    // Create a method that takes 3 byte numbers and returns min
    public static byte minOfThree(byte num1, byte num2, byte num3){
        return (byte) (Math.min(num1, Math.min(num2, num3)));
    }

    /*
    Create a method that takes an int as an argument and returns true if
    it is even, returns false if it is odd

    return type
    isEven
    static
    public
     */
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    //Create a method called isOdd() that takes one int parameter and returns true
    // if the number is odd, false otherwise
    public static boolean isOdd(int number){
        return number % 2 == 1;
    }
    public static boolean isNumberPositive(int num1){
        return num1 != 0 && num1 == Math.abs(num1);
    }

    public static boolean isPositive(int num1){
        return num1 > 0;
    }
    public static boolean isNegative(int num1){
        return num1 < 0;
    }
    //create another method called isZero
    public static boolean isZero(int num1){
        return num1 == 0;
    }


}
