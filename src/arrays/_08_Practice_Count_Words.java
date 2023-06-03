package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        Task-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
         */

        System.out.println("\n-------Task-1-------\n");
        String s1 = "Today is Tuesday";
        String[] s1SplitFromSpace = s1.split(" ");

        System.out.println(s1.split(" ").length);

        /*
        Find how many words you have in a given String starting with A or a
         */

        System.out.println("\n-------Task-2-------\n");

        String s2 = "Some counties I visited were Argentina, Belgium and Malta";

        String[] words = s2.split(" ");
        System.out.println(Arrays.toString(words));

        int countA = 0;
        for(String word : words){
            if (word.toLowerCase().charAt(0) == 'a') countA++;
        }
        System.out.println(countA);



    }
}
