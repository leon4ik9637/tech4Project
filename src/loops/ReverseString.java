package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from a user
        Reverse the name and print it back

        Test Data:
        Abraham

        Expected output:
        The reversed name = maharbA
         */

        String name = ScannerHelper.getANameFromUser();
        String reversedNameJohn = "" + name.charAt(3) + name.charAt(2) +
                name.charAt(1) + name.charAt(0);

        String reversedNameLionel = "" + name.charAt(5) + name.charAt(4) +
                name.charAt(3) + name.charAt(2) +
                name.charAt(1) + name.charAt(0);

        String reversedName = "";
        for(int i = name.length()-1; i >= 0; i--){
            reversedName += name.charAt(i);
        }
        System.out.println("The reversed name = " + reversedName);
        System.out.println("The reversed name to uppercase = " + reversedName.toUpperCase());
    }
}
