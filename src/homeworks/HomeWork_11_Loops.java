package homeworks;

import java.util.Scanner;

public class HomeWork_11_Loops {
    public static void main(String[] args) {
        /*
        Task 7
        Write a program that asks user to enter their first and last name
        And count how many vowel letters they have in their first and last name

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String fullName = input.nextLine();
        int count = 0;
        for(int i = 0; i < fullName.length(); i++){
            char c = fullName.charAt(i);
            if(CharacterHelper.isVowel(c)) count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name");


        Task - 8
        Requirement:
        Write a program that asks a user to enter a number
        If number is less than 100, then ask user to enter another number
        and find sum of entered 2 numbers.
        Keep asking user to enter numbers until the sum of all entered
        numbers is at least 100.

        If first number entered by user more than or equal to 100, print
        message "This number is already more than 100" and do not ask
        user to enter any other numbers.
        NOTE: Use do while loop!!!


        int number = 0;
        int sum = 0;
        int attempt = 1;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter a number");
            number = input.nextInt();
            if(attempt == 1 && number >= 100){
                System.out.println("This number is already more than 100");
                break;
            }else{
                sum += number;
                if(sum >= 100){
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            }
            attempt++;
        }while(sum < 100);

        Task unknown

        int n1 = 0;
        int n2 = 1;
        int total = 0;
        String message = "";

               n1   n2  total
        i = 0| 0    1   1
        i = 1| 1    1   2
        i = 2| 1    2   3
        i = 3| 2    3   5
        ...
        ..
        0 - 1 - 1 - 2 - 3 - 5 - 8

        for (int i = 0; i < 7; i++) {
            message += n1 + " - ";
            total = n1 + n2;
            n1 = n2;
            n2 = total;

        }
        System.out.println(message.substring(0, message.length()-3));

        Task-10
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String s1 = scanner.nextLine();
        if(s1.length() < 1){
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + s1.length());
            System.out.println("First char is = " + s1.charAt(0));
            System.out.println("Last char is = " + s1.charAt(s1.length()-1));
        if(s1.toLowerCase().contains("a") || s1.toLowerCase().contains("e") ||
                s1.toLowerCase().contains("o") || s1.toLowerCase().contains("u") ||
                s1.toLowerCase().contains("i")){
            System.out.println("This String has vowel");
        }else{
            System.out.println("This String does not have vowel");
        }
        }
        }
}
