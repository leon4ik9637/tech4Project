package homeworks;

import java.util.Scanner;

public class HomeWorkOperators {
    public static void main(String[] args){

        int number1 = 5;
        int number2 = 10;

        System.out.println("\n-----Task-1-----\n");

        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = collect.nextInt(), num2 = collect.nextInt();
        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));



        System.out.println("\n-----Task-2-----\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 decimal numbers");
        double old1 = input.nextDouble(), old2 = input.nextDouble();
        System.out.println("The number 1 entered by user is = " + old1);
        System.out.println("The number 2 entered by user is = " + old2);
        System.out.println("The division of number 1 entered by user is = " + (old1 / old2));



        System.out.println("\n-----Task-3-----\n");
        System.out.println("1.\t" + (-10 + 7 * 5));
        System.out.println("1.\t" + ((72 + 24) % 24));
        System.out.println("1.\t" + ((10 + (-3)) * 9) / 9);
        System.out.println("1.\t" + (5 + 18 / 3 * 3 - (6 % 3)));


        System.out.println("\n-----Task-4-----\n");
        Scanner data = new Scanner(System.in);
        System.out.println("Please enter 2 floating numbers");
        double d1 = data.nextDouble(), d2 = data.nextDouble();
        System.out.println("The sum of the given numbers is = " + (d1 + d2));
        System.out.println("The product of the given numbers is = " + (d1 * d2));
        System.out.println("The subtraction of the given numbers is = " + (d1 - d2));
        System.out.println("The division of the given numbers is = " + (d1 / d2));
        System.out.println("The remainder of the given numbers is = " + (d1 % d2));


        System.out.println("\n-----Task-5-----\n");
        double width = 7.5, height = 10.5;
        System.out.println("The area of the rectangle = " + (width * height));
        System.out.println("The perimeter of the rectangle = " + (2 * (width + height)));









    };

}
