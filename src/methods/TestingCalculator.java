package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        int i1 = 15, i2 = 2;

        int result = Calculator.divideInt(i1, i2);   //returns an int
        System.out.println(result); //7

        double d1 = 15, d2 = 2;
        double result2 = Calculator.divideDouble(d1, d2); // returns a double
        System.out.println(result2); // 7.5

        Introduction.introduce("wazwaz", "engineer", 20, "Books");

        int max = Math.max(1, 2);

        double max2 = Math.max(15.2, 10);
        System.out.println(Math.max(15.2, 10)); // this method is a return type
        System.out.println(Calculator.divideDouble(d1, d2)); // this method is also a return type




    }
}
