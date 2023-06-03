package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args){
        /*
        Find the min and max of given 3 numbers, write down the Pseudo code and
        print min and max with proper messages.

        NOTE: Declare and Assign all of them in one single line
         */
/*
        int x = 4, y = 67, z = -54;
        int maxOfXY = Math.max(x, y);
        int maxOfEvery = Math.max(maxOfXY, z);
        int minOfXY = Math.min(x, y);
        int minOfEvery = Math.min(minOfXY, z);


        System.out.println("Maximum value of 3 numbers is = " + Math.max(Math.max(x, y), z));
        System.out.println("Minimum value of 3 numbers is = " + Math.min(Math.min(x, y), z));
        System.out.println("Minimum value of 3 numbers is = " + minOfEvery);
        System.out.println("Maximum value of 3 numbers is = " + maxOfEvery);

*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 numbers");
       // int num1 = scanner.nextInt(), num2 = scanner.nextInt(),
       //         num3 = scanner.nextInt(), num4 = scanner.nextInt();
      //  int maxNum1Num2 = Math.max(num1, num2);
      //  int maxNum3Num4 = Math.max(num3, num4);
        System.out.println("The minimum number user entered is = " +
                Math.min(Math.min(scanner.nextInt(), scanner.nextInt()), Math.min(scanner.nextInt(), scanner.nextInt())));










    }
}
