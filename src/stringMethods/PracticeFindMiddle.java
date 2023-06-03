package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        /*
        String name1 = "Taylor";
        char first = name1.charAt(0);
        char last = name1.charAt(name1.length()-1);
        String middle = "" + name1.charAt(length()/2-1) + name.charAt(length()/2);

        'y' + 'l' -> 108 + 121 = 229


        String name2 = "Alona";
        char first = name2.charAt(0);
        char last = name2.charAt(name2.length()-1);
        char middle = name2.charAt(name2.length()/2);

        Please print the middle character from the name
        Alona   -> o    -> 2    -> name.length()/2 -> 2
        Guluzar -> u    -> 3    -> name.length()/2 -> 3
        Ali     -> l    -> 1    -> name.length()/2 -> 1

        Taylor  -> yl   -> 2-3  -> name.length()/2-1, name.length()/2
        John    -> oh   -> 1-2  -> name.length()/2-1, name.length()/2
        Mohammed-> am   -> 3-4  -> name.length()/2-1, name.length()/2
         */

        String name1 = "Leonid";
        String name2 = "Alona";
        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Kaly"));// al
        System.out.println(StringHelper.getMiddle("Guluzar")); // u
        System.out.println(StringHelper.getMiddle("Alexandr")); // xa

    }
}
