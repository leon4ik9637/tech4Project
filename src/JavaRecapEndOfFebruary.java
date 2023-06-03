import java.util.Scanner;

public class JavaRecapEndOfFebruary {
    public static void main(String[] args){
/*
        System.out.println("-------------Task-1-------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers below");
        int num1 = input.nextInt(), num2 = input.nextInt();

        System.out.println("The average of the given 2 numbers is: " +
                (num1 + num2) / 2);

    //write a program that asks user 2 numbers and find their product
        System.out.println("-------------Task-2-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers below");
        System.out.println("The product of the given 2 numbers is: " +
                (scan.nextInt() * scan.nextInt()));


        System.out.println("-------------Task-3-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers below");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
        System.out.println("The " + num1 + " multiplied with " + num1 + " is = " + (num1 * num1) +
                "\nThe " + num2 + " multiplied with " + num2 + " is = " + (num2 * num2) +
                "\nThe " + num3 + " multiplied with " + num3 + " is = " + (num3 * num3));



        System.out.println("-------------Task-4-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers below");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        System.out.println("The remainder of " + num1 + " % " + num2 + " = " + (num1 % num2));





        System.out.println("-------------Task-4-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers below");
        System.out.println("The average of the 5 numbers is: " + (scan.nextInt() + scan.nextInt() +
                scan.nextInt() + scan.nextInt() + scan.nextInt()) / 5);


        //------------------JAVA_HOMEWORK-7-----------------------
        int num1 =(int) (Math.random() * 101) - 50, num2 =(int) (Math.random() * 101) - 50,
                num3 =(int) (Math.random() * 101) - 50, num4 =(int) (Math.random() * 101) - 50,
                num5 =(int) (Math.random() * 101) - 50, num6 =(int) (Math.random() * 101) - 50,
                num7 =(int) (Math.random() * 101) - 50, num8 =(int) (Math.random() * 101) - 50;
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);
        System.out.println("Number 8 = " + num8);
        int maxNumber = Math.max(Math.max(Math.max(Math.max(Math.max( +
                Math.max(Math.max(num1, num2), num3), num4), num5), num6), num7), num8);
        int minNumber = Math.min(Math.min(Math.min(Math.min(Math.min( +
                Math.min(Math.min(num1, num2), num3), num4), num5), num6), num7), num8);

        System.out.println("Greatest number is = " + maxNumber);
        System.out.println("Smallest number is = " + minNumber);
        System.out.println("Average of 8 numbers is = " + (num1 + num2 + num3 + num4 + num5 + num6 +
                 num7 + num8) / 8);
        int difference = maxNumber - minNumber;
        System.out.println("Absolute difference between smallest and greatest is = " + Math.abs(difference));

        if(num3 > 0) {
            System.out.println("3rd number is positive = true");
        }else {
            System.out.println("3rd number is positive = false");
        }
        if(num5 < 0){
            System.out.println("5th number is negative = true");
        }else{
            System.out.println("5th number is negative = false");
        }
        if(num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 ||num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else{
            System.out.println("There is at least one zero among those numbers is = false");
        }




        int difNum1 = num1 - 5;
        int difNum2 = num2 - 5;
        int difNum3 = num3 - 5;
        int difNum4 = num4 - 5;
        System.out.println("Absolute difference of " + num1 + " with 5 is = " + Math.abs(difNum1));
        System.out.println("Absolute difference of " + num2 + " with 5 is = " + Math.abs(difNum2));
        System.out.println("Absolute difference of " + num3 + " with 5 is = " + Math.abs(difNum3));
        System.out.println("Absolute difference of " + num4 + " with 5 is = " + Math.abs(difNum4));
        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(num1, num2), num3),num4));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(num1, num2), num3),num4));



        //-----------------Task-8-----------------
        Scanner print = new Scanner(System.in);
        System.out.println("Please enter 2 numbers below");
        int number1 = print.nextInt();
        int number2 = print.nextInt();

        double division = ((double) number1 / (double) number2);

        System.out.println((division));


 */
        //----------------------TASK-9-----------------------
        int n1 = (int) (Math.random() * 51), n2 = (int) (Math.random() * 51),
                n3 = (int) (Math.random() * 51), n4 = (int) (Math.random() * 51),
                n5 = (int) (Math.random() * 51), n6 = (int) (Math.random() * 51),
                n7 = (int) (Math.random() * 51);
        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Number 3 = " + n3);
        System.out.println("Number 4 = " + n4);
        System.out.println("Number 5 = " + n5);
        System.out.println("Number 6 = " + n6);
        System.out.println("Number 7 = " + n7);

        System.out.println("Greatest number is = " + (Math.max(Math.max(Math.max(Math.max(Math.max(+
                Math.max(n1, n2), n3), n4), n5), n6), n7)));
        System.out.println("Smallest number is = " + (Math.min(Math.min(Math.min(Math.min(Math.min(+
                Math.min(n1, n2), n3), n4), n5), n6), n7)));
        System.out.println("Average of 7 numbers is = " + (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7);
        System.out.println("First number is greater than or equal to 10 = " + (n1 >= 10));
        System.out.println("Last number is less than or equal to 40 = " + (n7 <= 40));
        System.out.println("Both first and last numbers are greater than 25 = " + (n1 > 25 && n7 > 25));
        System.out.println("At least one of those numbers is 0 or 50 = " + (n1 == 0 || n1 == 50 ||
                n2 == 0 || n2 == 50 || n3 == 0 || n3 == 50 || n4 == 0 || n4 == 50 || n5 == 0 || n5 == 50 ||
                n6 == 0 || n6 == 50 || n7 == 0 || n7 == 50));




        System.out.println("There is no number between 40 and 50 = " + (n1 < 40 && n2 < 40 &&
                n3 < 40 && n4 < 40 && n5 < 40 && n6 < 40 && n7 < 40));




    }
}
