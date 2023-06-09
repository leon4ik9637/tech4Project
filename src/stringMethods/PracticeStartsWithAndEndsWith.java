package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {
        /*
        Ask user to enter a name
        If the name starts with A or a, then print "You are in the club A"
        If the name does not start with A or a, print "You are not in the club A"

        alex -> You are in the club A
        Alex -> You are in the club A

        John -> You not are in the club A
         */

        String name = ScannerHelper.getANameFromUser();

        if(name.startsWith("a") || name.startsWith("A")){
            System.out.println("You are in the club A");
        }else{
            System.out.println("You are not in the club A");
        }

        if(name.toLowerCase().charAt(0) == 97){
            System.out.println("You are in the club A");
        }else{
            System.out.println("You are not in the club A");
        }
        System.out.println(name.toLowerCase().startsWith("a") ?
                "You are in the club A" : "You are not in the club A");


    }
}
