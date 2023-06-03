package homeworks;

import java.util.ArrayList;
import java.util.List;

public class HomeWork_14 {
    public static void main(String[] args) {
        /*
        Task-1
        Write a program to find the first duplicated number in an int array
        if there are no duplicates print "There is no duplicates"
        Output 1 = 0;
        Output 2 = There is no duplicates;
        Output 3 = 3;
         */
        System.out.println("\n-----Task-1-----\n");
        boolean isDuplicateFound = false;
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        for(int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    isDuplicateFound = true;
                    break;
                }
            }
            if(isDuplicateFound) break;
        }
        if(!isDuplicateFound) System.out.println("There is no duplicates");

        /*
        Same as task 1 but first duplicated String
         */
        System.out.println("\n-----Task-2-----\n");

        String[] words = {"Abc", "java", "java", "abc"};

        boolean stringDuplicateFound = false;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    stringDuplicateFound = true;
                    break;
                }

            }
            if(stringDuplicateFound) break;
        }
        if(!stringDuplicateFound) System.out.println("There is no duplicates");


        /*
        Print all duplicates
         */
        System.out.println("\n-----Task-3-----\n");
        String s = "";
        int[] nums = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && !s.contains(nums[i] + "")){
                    s += nums[i] + "\n";
                }
            }
        }
        System.out.println((s.isEmpty()) ? "There is no duplicates" : s);

        System.out.println("\n-----Task-4-----\n");

        /*
        Print out duplicate words if there are any
        if not -> say there are no duplicates
         */

        String[] ws = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};

        String duplicates = "";

        for (int i = 0; i < ws.length - 1; i++) {
            for (int j = i + 1; j < ws.length; j++) {
                if(ws[i].equalsIgnoreCase(ws[j]) && !duplicates.contains(ws[i].toLowerCase())){
                    System.out.println(ws[i]);
                    duplicates += ws[i].toLowerCase();
                }
            }
        }

        if (duplicates.isEmpty()) System.out.println("There is no duplicates");



        System.out.println("\n-----Task-5-----\n");

        /*
        Print reversed elements in an array
         */

        String[] words1 = {"java", "python", "ruby"};
        List<String> reversedWords1 = new ArrayList<>();

        for(int i = words1.length-1; i >= 0; i--){
            reversedWords1.add(words1[i]);
        }
        System.out.println(reversedWords1);

        System.out.println("\n-----Task-6-----\n");

        /*
        reverse each word in a given String
         */
//        String str = "Java is fun";
//        String[] str1 = str.split(" ");
//        System.out.println(Arrays.toString(str1));
//
//        for (int i = 0; i < str1.length; i++) {
//            String currentReversedStr = "";
//            for (int j = str1[i].length() -1; j >= 0; j--){
//                currentReversedStr += str1[i].charAt(j);
//            }
//            //currentReversedStr --> avaJ
//            str1[i] = currentReversedStr;
//        }
//        // str1 -> [avaJ, si, nuf]
//
//        for (int i = 0; i < str1.length; i++) {
//            System.out.print(i == str1.length - 1 ? str1[i] : str1[i] + " ");
//
//        }
        String str = "Java is fun";
        String revStr = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);

        String[] revStrArr = revStr.split(" ");
        for (int i = revStrArr.length -1; i >= 0; i--) {
            System.out.print(i == 0 ? revStrArr[i] : revStrArr[i] + " ");
        }



    }
}
