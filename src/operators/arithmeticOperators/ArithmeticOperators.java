package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args){

        //addition
        int number1 = 9;
        int number2 = 3;

        number1 = 5; // from this line number1 = 5; before number1 = 9.
                     // Don't need to put 'int number1' since number already created



        int sum = number1 + number2; // 8

        // subtraction
        int sub = number1 - number2; // 2

        // multiply
        int times = number1 * number2; // 15

        // division
        int div = number1 / number2;

        // remainder
        int remainder = number1 % number2; // 5 - (3 * 1(n)) = 2, n = number of times 3 can be found in 5

        System.out.println("Addition is = " + sum);
        System.out.println("subtraction is = " + sub);
        System.out.println("multiply is = " + times);
        System.out.println("division is = " + div);
        System.out.println("remainder is = " + remainder);

        //Arithmetic Operators:
        /*
        Addition        -> +
        Subtraction     -> -
        Multiplication  -> *
        Division        -> /
        Remainder       -> %  // 7 % 2 = 1, 7 % 5 = 2;

        Shorthand Assignments:
        Addition        -> +=
        Subtraction     -> -=
        Multiplication  -> *=
        Division        -> /=
        Remainder       -> %=

        Ex:
        int a = 10;
        a += 5; --> a = a + 5;

        Post/Pre Increment and Decrement:
        int a = 10;
        a++;    --> 10              ++a;    --> 11
        a;      --> 11              a;      --> 11

        ---------------------------------------
        int b = 6;
        b++ * 5 =       --> 30, b = 6
        b * 5 =         --> 35, b = 7

        ++b * 5 =       --> 40, b = 8
        b * 5 =         --> 40, b = 8

        b-- * 5 =       --> 40, b = 8
        b * 5 =         --> 35, b = 7

        RECAP: END

         */








    }
}
