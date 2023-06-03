package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        /*
        HashSet vs LinkedHashSet: The only difference between them is
        LinkedHashSet keeps insertion order
         */
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("bar");
        words.add(null);
        words.add("John");

        System.out.println(words);
    }
}
