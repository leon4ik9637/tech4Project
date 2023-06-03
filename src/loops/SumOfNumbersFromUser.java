package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter some numbers and find the sum
        of numbers given by a user
        Ex
        Program: Please enter how many numbers you want to enter
        User: 3

        Program: Please enter number 1
        User: 10

        Program: Please enter number 2
        User: 7

        Program: Please enter number 3
        User: 8

         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter how many numbers you want to enter");
//        int totalNumbers = scanner.nextInt();
//        System.out.println("Please enter number 1");
//        int number1 = scanner.nextInt();
//        System.out.println("Please enter number 2");
//        int number2 = scanner.nextInt();
//        System.out.println("Please enter number 3");
//        int number3 = scanner.nextInt();
//        System.out.println("");
        System.out.println("\n-----fori-solution-----\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter?");
        int totalNumbers = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= totalNumbers; i++){
            System.out.println("Please enter number " + i);
            sum += scanner.nextInt();
        }
        System.out.println("The sum of all numbers is = " + sum);

        System.out.println("\n-----while-solution-----\n");

        System.out.println("Please enter how many numbers you want to enter?");

        int times = scanner.nextInt();
        int count = 1;
        int sum1 = 0;
        while(count <= times){
            System.out.println("Please enter number " + count);
            sum1 += scanner.nextInt();
            count++;
        }
        System.out.println("The sum of all numbers is = " + sum1);









    }
}
