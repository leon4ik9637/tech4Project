package characterClass;

import utilities.CharacterHelper;
import utilities.MathHelper;

public class CountCharacters {
    public static void main(String[] args) {
        /*
        Task-1
        Write a program that counts spaces for the String below
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        Excpected result:
        9
         */
        // 1st way
        /*
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count = 0;

        for(int i = 0; i <= address.length() -1; i++){
            if(Character.isWhitespace(address.charAt(i))){
                count++;
            }
        }
        System.out.println(count);


        // 2nd way
        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int count1 = 0;
        for(int i = 0; i <= address1.length()-1; i++){
            if(address.charAt(i) == ' '){
                count1++;
            }
        }
        System.out.println(count1);

        Task-2
        Write a program that counts letters for String below
        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        Expected outcome:
        25
         */
        // 1st way
//        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
//        int count = 0;
////        for(int i = 0; i <= address1.length()-1; i++){
////            if(Character.isLetter(address1.charAt(i))) count++;
////
////        }
//        System.out.println("The number of letters in a String is = " + count);
        // 2nd way
//         for(int i = 0; i < address1.length(); i++){
//             char c = address1.charAt(i);
//             if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) count++;
//         }
//        System.out.println("The number of letters in a String is = " + count);

         //Task 3 1st way (count Uppercase and Lowercase letters separately)

//        int countU = 0, countL = 0;
//
//        for(int i = 0; i < address1.length(); i++){
//            char c = address1.charAt(i);
//            if(Character.isUpperCase(c)) countU++;
//            else if(Character.isLowerCase(c)) countL++;
//        }
//        System.out.println(Math.abs(countL - countU));
//
        // Task 3 2nd way
//        int count3 = 0;

//        for(int i = 0; i < address1.length(); i++) {
//            char c = address1.charAt(i);
//            if (Character.isUpperCase(c)) count3++;
//            else if (Character.isLowerCase(c)) count3--;
//        }
//        System.out.println(Math.abs(count3));
//
        // 3rd way
//        count3 = 0;
//        for(int i = 0; i < address1.length(); i++){
//            char c = address1.charAt(i);
//
//            if(Character.isLetter(c)){
//                if(Character.isUpperCase(c)) count3++;
//                else count3--;
//            }
//        }
//        System.out.println(Math.abs(count3));
        /*
        Task 4
        Write a program that counts vowel and consonants letters for the String below
        Then print them with below messages
        Expected result:
        Vowels = 10
        Consonants = 15
         */

//        int consonants = 0;
//        for(int i = 0; i < address1.length(); i++){
//            char c = address1.charAt(i);
//            if(Character.isLetter(c)){
//                if(CharacterHelper.isVowel(c)) vowels++;
//                else consonants++;
//            }
//
//        }
//        System.out.println("Vowels = " + vowels);
//        System.out.println("Consonants = " + consonants);
        /*
        Task-6
         */
        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, evenCounter = 0, oddCounter = 0,
                vowelCounter = 0, consonantCounter = 0;
        for(int i = 0; i < address1.length(); i++){
            char c = address1.charAt(i);
            if(Character.isLetter(c)){
                letterCounter++;
                if(Character.isUpperCase(c)) upperCounter++;
                else lowerCounter++;
                if(CharacterHelper.isVowel(c)) vowelCounter++;
                else consonantCounter++;
            }
            else if(Character.isDigit(c)){
                digitCounter++;
                if(MathHelper.isEven(c)) evenCounter++;
                else oddCounter++;
            }
            else if(Character.isWhitespace(c)){
                spaceCounter++;
            }else{
                specialCounter++;
            }
        }
        System.out.println("Letters = " + letterCounter);
        System.out.println("Lowercase = " + lowerCounter);
        System.out.println("Uppercase = " + upperCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonant = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Even digits = " + evenCounter);
        System.out.println("Odd digits = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);






    }
}
