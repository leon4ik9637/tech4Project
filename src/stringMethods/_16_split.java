package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {

        /*
        - split()
        - It is used to split a String from a given regex
        - It is a String class method
        - it is a non-static method
        - it is return type and returns a String array
        - it takes an argument as a regex String

        String             Array
        "I like Java"   -> {"I", "like", "Java"}

        String s = "I like Java";

        String[] words = {"I", "like", "Java"};
        String[] words = s.split(" ");

        words.length(); // 3

         */

        String s = "Banana is nice";
        String[] sSplitFromSpace = s.split(" ");
        System.out.println(Arrays.toString(sSplitFromSpace));

        String[] sSplitFromI = s.split("i"); // []

        System.out.println(Arrays.toString(sSplitFromI));

        String[] sSplitFromA = s.split("a");
        System.out.println(Arrays.toString(sSplitFromA));

    }
}
