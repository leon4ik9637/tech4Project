package homeworks;

import java.util.Arrays;

public class HomeWork_13 {
    public static void main(String[] args) {

        /*
        Task-2
        Write a program to find the first positive and negative
        numbers in an int array
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        OUTPUT:
        First positive number is: 5
        First negative number is: -4
         */
        System.out.println("\n-----Task-2-----\n");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        int pos = 0;
        int neg = 0;
        boolean isFirstNegativeFound = false;
        boolean isFirstPositiveFound = false;

        for(int number : numbers){
            if(!isFirstPositiveFound && number > 0) {
                isFirstPositiveFound = true;
                System.out.println("First positive found is = " + number);
            }
            else if (!isFirstNegativeFound && number < 0) {
                isFirstNegativeFound = true;
                System.out.println("First negative found is = " + number);
            } if(isFirstNegativeFound && isFirstPositiveFound) break;


        }


        /*
        Task-3
        Write a program to generate 5 random numbers between 1 and 10
        and store those numbers in an int array
        Check if int array contains 2 or 3 as elements
        If it contains 2 or 3, then return true
        If it does not contain either 2 or 3, then return false
         */
        System.out.println("\n-----Task-3-----\n");
        int[] nums1 = new int[5];
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(nums1));
        boolean contains2Or3 = false;
        for(int num : nums1){
            if(num == 2 || num == 3) {
                contains2Or3 = true;
                break;
            }

        }
        System.out.println(contains2Or3);

        /*
        Task-4
        Write a program to find if String array contains "apple"
        as an element, ignore cases.
        Test data 1:
        String[] list = {"banana", "orange", "Apple"}
        Expected output:
        true
        Test data 2:
        String[] list = {"pineapple", "banana", "orange", "grapes"}
        Output:
        false
         */
        System.out.println("\n-----Task-4-----\n");
        String[] lists = {"banana", "orange", "Apple"};

        boolean hasApple = false;

        for(String list : lists){
            if (list.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);

        /*
        Task-5
        Write a program to find the all-matching elements between
        2 int arrays

        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers1 = {20, 50, 70, 100, 300};

        OUTPUT 1:
        20
        50
        70

        TEST DATA 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};

        Expected output 2:
        There is no matching elements

         */
        System.out.println("\n-----Task-5-----\n");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean isDuplicateFound = false;

        for(int i = 0; i < numbers1.length; i++){
            for(int j = 0; j < numbers2.length; j++){
                if(numbers1[i] == numbers2[j]){
                    isDuplicateFound = true;
                    System.out.println(numbers1[i]);
                    break;
                }
            }
        }
        if(!isDuplicateFound) System.out.println("There is no matching elements");

        /*
        Task-6
        Write a program to print duplicated characters in a String ignore cases
        Test data 1:
        String str = "baNana";
        output:
        a
        N
        Test data 2:
        String str = "aPple";
        OUTPUT:
        P
         */
        System.out.println("\n-----Task-6-----\n");
        String str = "aPple";
        String duplicate = "";

        for(int i = 0; i < str.length()-1; i++){
            for(int j = i + 1; j < str.length(); j++) {

                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                !duplicate.contains(str.toLowerCase().substring(i, i+1))){
                    duplicate += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }

            }
        }


    }
}
