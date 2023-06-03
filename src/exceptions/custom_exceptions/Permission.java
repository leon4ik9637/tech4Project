package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {
    public static void checkAge(int age){
        if(age >= 16) System.out.println("It is allowed to have driver's license");
        else throw new RuntimeException("Age of " + age + " is not allowed to have driver's license");
    }
    public static void checkIn2(int day){
        switch (day){
            case 1:
            case 7:
                System.out.println("user is allowed to check in from 10AM to 3PM");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("User is allowed to check in 10AM to 5PM");
                break;
            default:
                throw new RuntimeException("The input does not represent any day!!!");
        }
    }

    public static void checkIn(int day){
        if(day == 7 || day == 1) System.out.println("It is allowed to check in from 10AM to 3PM");
        else if(2 <= day && day <= 6) System.out.println("It is allowed to check in from 10AM to 5PM");
        else throw new RuntimeException("The input " + day + " does not represent any day");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user! Please enter your age?");
        int age = scanner.nextInt();
        try{
            checkAge(age);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Your age is = " + age);
        }
        System.out.println("End of the program");

        checkIn(9);
    }
}
