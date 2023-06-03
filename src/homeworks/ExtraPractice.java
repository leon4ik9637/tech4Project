package homeworks;

public class ExtraPractice {

        /* Task-1
        luckyUnluckyGame
        Create a method which will take an int as an argument and returns a String.
        - If the int number is in between -50/ 0 return "The number is negative and more than -50"
        - If the int number is in between 0/ 50 return "The number is positive and less than 50"
        - If the int number is 0 return "The number is zero"
        - If the number is 9 return "You have hit the lucky number!"
        - If the number is -11 return "You have hit the unlucky number!"
         */
/*
    public static String luckyUnluckyGame(int num) {
        if (num == -11) return "You have hit the unlucky number!";
        else if (num == 9) return "You have hit the lucky number!";
        else if (num > -50 && num < 0) return "The number is negative and more than -50";
        else if (num > 0 && num < 50) return "The number is positive and less than 50";
        else if (num == 0) return "The number is zero";

        return "The number you provided is not good for this game";
    }

 */
/*
    public static void main(String[] args) {
        // EDGE CASES - BOUNDARY CASES
        System.out.println(luckyUnluckyGame(-11));
        System.out.println(luckyUnluckyGame(9));
        System.out.println(luckyUnluckyGame(0));
        System.out.println(luckyUnluckyGame(-25));
        System.out.println(luckyUnluckyGame(49));
        System.out.println(luckyUnluckyGame(75324));
        System.out.println(luckyUnluckyGame(-75));


 */


    /* Task 2
    Create a method which will take an int for age and String as a name
    - if the age is older than 30 and first letter is uppercase print out
    "Age and letter checks out"
    - if the age is older than 30 and first letter is lowercase print out
    "Age checks out but letter doesn't"
    - if the age is equal or younger than 30 and first letter is uppercase print out
    "Age doesn't check out but letter does"
    - if the age is equal or younger than 30 and first letter is lowercase print out
    "Nothing checks out"

    age being more than 30 || less than or equal to 30
        name being uppercase || lowercase
     */
    public static void checkAgeAndName(String name, int age) {
        if (age > 30) {
            if (Character.isUpperCase(name.charAt(0))) {
                System.out.println("Age and letter checks out");
                // age is > 30 and first letter is uppercase
            } else {
                System.out.println("Age checks out but letter doesn't");
                // age is > 30 and first letter is lowercase
            }
        } else {
            if (Character.isUpperCase(name.charAt(0))) {
                System.out.println("Age doesn't check out but letter does");
                // age is <= 30 and first letter is uppercase
            } else {
                System.out.println("Nothing checks out");
                //// age is <= 30 and first letter is lowercase
            }


        }

    }

    public static void main(String[] args) {
        checkAgeAndName("Abe", 31);
        checkAgeAndName("Data", 25);
        checkAgeAndName("kaly", 35);
        checkAgeAndName("guluzar", 35);
    }
}

    /* Task 3
    Requirement:
    Check the number is in between 1-10 (inclusive)
    They will get some points based on numbers they entered.
    So, their points will be calculated as below
    - 1st number will be multiplied by 15 and added as points
    - 2nd number will be multiplied by 10 and added as points
    - 3rd number will be multiplied by 5 and added as points
    - if user enters any number that is not in the range,
    then user will not get any points from that number
    Test DATA:
    3 7 2 1 8
    Expected result:
    59
     */
    /* Task 4
    Create a method which will take a String as name and age
    - if user age getting divided by their name's length without any leftovers
    we will print out "Your age and name get along" otherwise print out
    "Your age and name need time :("
    - if name first letter is a vowel then print out
    "Starting with vowels" otherwise print out "Starting with consonants I see"
    - if the name ends with a consonant print out "Nice finish"
    otherwise "Seen better"
    NOTE: If the given name and age is the same as yours print out
    "IMPOSTER!!!" nothing else (Ignore cases)

    /* Task 5
    - Create a method which will take a full name as a String
    (only first name and the last name not middle)
    - Get the first name and make the name initial capped
    (only the first letter is uppercase rest is lowercase EX: jOe --> Joe)
    - Get the last name and make the last name fully uppercase
    - Put the first name and the last name in one String and return it
    NOTE: This method should work with every full name
     */




