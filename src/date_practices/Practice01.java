package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their Date of year
        then calculate their age and print with the message below
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int YOB = scanner.nextInt();

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date)) - YOB) + " years old!");
    }
}
