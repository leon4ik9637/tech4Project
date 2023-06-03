package methods;

import utilities.Calculator;
import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args){

        //Math.max(5, 1, 5); // compiler error
/*
        double max = MathHelper.maxOfThree(5.1, 1.8, 10.4);
        System.out.println("Max of three numbers = " + max);

        byte b1 = (byte) (Math.random() * 10);
        byte b2 = (byte) (Math.random() * 10);
        byte b3 = (byte) (Math.random() * 10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3 = " + b3);

        System.out.println("Minimum number is = " + MathHelper.minOfThree(b1, b2, b3));


 */
        double resultInt = Calculator.sumDouble(101, 206);
        System.out.println(resultInt);
        System.out.println("The product of the 2 numbers is = " + Calculator.productInt(10,14));

    }
}
