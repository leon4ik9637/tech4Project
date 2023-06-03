package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class DividableBy7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();
        if (num1 % 7 == 0) {
            System.out.println("Number is dividable by 7");
        }else{
            System.out.println("Number is not dividable by 7");
        }

    }

}
