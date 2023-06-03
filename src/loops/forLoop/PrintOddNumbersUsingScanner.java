package loops.forLoop;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Write java program to ask user to enter a number and print all odd numbers
        starting from 0 to giver number (inclusive)
        test data : 15
         */

        int userNumber = ScannerHelper.getNumberFromUser();
        for(int i = 0; i <= userNumber; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
