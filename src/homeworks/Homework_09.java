package homeworks;

public class Homework_09 {
    public static void main(String[] args) {
        /*
        Task-1
        Requirement:
        Write a program that asks user to enter their names
        1. Print out the length of name
        2. Find the first character in the name and print out that
        3. Find the last character in the name and print out that
        4. Find the first 3 characters in the name and print out those
        5. Find the last 3 characters in the name and print out those
        6. Check if name starts with character A (or a) or not and
         print out messages below
        "You are in the club!" if yes
        "Sorry, you are not in the club!" if not

        System.out.println("\n----------Task-1----------\n");
        String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first three characters in the name are = " + name.substring(0, 3));
        System.out.println("The last three characters in the name are = " + name.substring(name.length()-3));
        if(name.toUpperCase().startsWith("A")){
            System.out.println("You are in the club!");
        }else{
            System.out.println("Sorry, you are not in the club!");
        }
        // Task - 2
        Requirements:
        Write a program that asks a user to enter their full address
        Check if city is Chicago, then print "You are in the club"
        If city is Des Plaines, then print "You are welcome to join the club"
        If city is any other city, then print "Sorry, you will never be in the club"

        Test data 1:
        2860 S River Rd Suite 350, Des Plaines, IL 60018
        Output 1:
        You are welcome to join the club
        Test data 2:
        3535 Abc St, Chicago, IL 12345
        Output 2:
        You are in the club

        System.out.println("\n----------Task-2----------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address?");
        String address = scanner.nextLine();

        if(address.isEmpty()){
            System.out.println("The address is required!");
        }else {
            if (address.toLowerCase().contains("chicago")) {
                System.out.println("You are in the club");
            } else if (address.toUpperCase().contains("DES PLAINES")) {
                System.out.println("You are welcome to join the club");
            } else {
                System.out.println("Sorry, you will never be in the club");
            }
        }

        Task - 3
        Requirement:
        Write a program that asks user to enter their colors, at least 4 colors
        Check if those colors contains "red" and "green"
        If "green" is listed in favorite colors, then print "Green is in the list"
        If "red" is listed in favorite colors, then print "Red is in the list"
        If both "green" and "red" are listed in favorite colors, then print
        "Green and red are in the list"
        If both "green" and "red" are not listed in favorite colors, then print
        "Green and red are not in the list"

        System.out.println("\n----------Task-3----------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, please enter 4 of your favorite colors");
        String colors = scanner.nextLine().toLowerCase();
        if(!colors.isEmpty()) {
            if (colors.contains("green") && colors.contains("red")) {
                System.out.println("Green and red are in the list");
            } else if (!colors.contains("green") && !colors.contains("red")) {
                System.out.println("Green and red are not in the list");
            } else if (colors.contains("green")) {
                System.out.println("Green is in the list");
            } else if (colors.contains("red")) {
                System.out.println("Red is in the list");
            }
        }else{
            System.out.println("You did not enter colors!");
        }

        Task-4
        Requirement:
        Assume that you are given a String below
        String str = "   Java is FUN   ";
        Create 3 new Strings and assign each word from str to those new Strings
        Finally print the results as below

        Expected output:
        The first word in the str is = java
        The second word in the str is = is
        The third word in the str is = fun

        NOTE:
        Make sure that you eliminate white spaces at the beginning and at the end
        of words in the str.
        Make sure that you converted all words to be in lower case in your results


        System.out.println("\n----------Task-4----------\n");
        String str = "   Make your code dynamic   ".trim().toLowerCase();
        System.out.println(str);

        System.out.println("The first word in the str is = " + str.substring(0, str.indexOf(' ')));
        System.out.println("The second word in the str is = " + str.substring((str.indexOf(' ') + 1), str.lastIndexOf(' ')));
        System.out.println("The third word in the str is = " + str.substring(str.lastIndexOf(' ') + 1));


        Task 5
        Requirements:
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

    }
}
