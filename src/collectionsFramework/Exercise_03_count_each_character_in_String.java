package collectionsFramework;

import java.util.LinkedHashMap;

public class Exercise_03_count_each_character_in_String {
    public static void main(String[] args) {

        /*
        count each character
        C = 1
        h = 1
        i = 4
        ...and so on
         */
        String word = "Chicago is a nice city";

        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();

        for(Character c : word.toCharArray()){
            if(!charCounts.containsKey(c)) charCounts.put(c, 1);
            else charCounts.put(c, charCounts.get(c) + 1);
        }

        System.out.println(charCounts);




    }
}
