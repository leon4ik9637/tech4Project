package casting;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 3?");
        int day = scanner.nextInt();


        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 6:
            case 7:
                System.out.println("It is weekend");
                break;

            default:
                System.out.println("Wednesday");
        }

    }
    }
