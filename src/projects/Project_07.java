package projects;

import singleton.Driver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Project_07 {
        /*
        Task-6 findMostRepeatedElementInAnArray() method
        Write a method that takes a String array. Find the most repeated
        element and print it.
        Test data:
        ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]
        OUTPUT:
        pen
         */



    //Task 1 With Sort() Method
    public static void findGreatestAndSmallestWithSort(int[] nums){
        Arrays.sort(nums);
        int smallest = nums[0];
        int greatest = nums[nums.length - 1];

        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

    //Task-2 Without Sort
    public static void findGreatestAndSmallest(int[] nums){
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > greatest) greatest = num;
        }
        for(int num : nums){
            if(num < smallest) smallest = num;
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

    // Task-3 Second GR and SM with Sort
    public static void findSecondGreatestAndSmallestWithSort (int[] nums){
        // [10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(nums);

        // [5, 5, 6, 7, 8, 10, 15, 15]

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != nums[0]){
                System.out.println("Second smallest = " + nums[i]);
                break;
            }
        }

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] != nums[nums.length - 1]){
                System.out.println("Second greatest = " + nums[i]);
                break;
            }
        }

    }

    public static void findSecondGreatestAndSmallest(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int num : nums){
            if(num < min) min = num;
        }
        for(int num : nums){
            if(num != min && num < secondMin) secondMin = num;
        }
        System.out.println("Second smallest = " + secondMin);

        for(int num : nums){
            if(num > max) max = num;
        }
        for(int num : nums){
            if(num != max && num > secondMax) secondMax = num;
        }
        System.out.println("Second greatest = " + secondMax);
    }


    public static void findMostRepeatedElementInAnArray(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length -1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            for(String w : arr) {
                if(word.equals(w)) countOfWord++;
            }

            if(countOfWord > mostCountedTimes){
                mostCountedWord = word;
                mostCountedTimes = countOfWord;
            }
        }
        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");

    }

    public static void findSecGrAndSm(int[] nums){
        int gr = Integer.MIN_VALUE;
        int sm = Integer.MAX_VALUE;
        int gr2 = Integer.MIN_VALUE;
        int sm2 = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > gr) gr = nums[i];
            if (nums[i] < sm) sm = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != gr && nums[i] > gr2) gr2 = nums[i];
            if (nums[i] != sm && nums[i] < sm2) sm2 = nums[i];
            }
        System.out.println("2nd smallest = " + sm2);
        System.out.println("2nd greatest = " + gr2);

    }







    public static void main(String[] args) {
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen",
                "eraser"};
        String[] words2 = {"a", "a", "b", "c"}; // a counted 2 times in this array
        String[] words3 = {"abc", "ABC", "ab", "ab", "abc", "ab"}; // ab counted 3 times in this array

        findMostRepeatedElementInAnArray(words);
        findMostRepeatedElementInAnArray(words2);
        findMostRepeatedElementInAnArray(words3);
        findMostRepeatedElementInAnArray(new String[]{"x", "y", "z", "y"});

        System.out.println("\n-----Task-1-Sorted-----\n");
        int[] num1 = {10, 7, 7, 10, -3, 10, -3};
        int[] num2 = {10, 5, 6, 7, 8, 5, 15, 15};
        findGreatestAndSmallestWithSort(num1);
        System.out.println("\n-----Task-1-Not-Sorted-----\n");
        findGreatestAndSmallest(num1);

        System.out.println("\n-----Task-3-Sorted-----\n");
        findSecondGreatestAndSmallestWithSort(num2);

        System.out.println("\n-----Task-4-findSecondGreatestAndSmallest-----\n");
        findSecondGreatestAndSmallest(num2);
        findSecGrAndSm(num1);
        findSecGrAndSm(num2);








    }
}
