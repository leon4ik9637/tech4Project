package collections.arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        /*
        Removing elements from collection
        - DO NOT use for each loop to remove elements as while you are
        iterating elements, your size will keep changing, that is why
        for each loop will throw an exception. ConcurrentModificationException

        - DO NOT use fori as well as you may miss checking some elements

        NOTE: you can use removeIf() method to remove elements
        NOTE: You can use Iterator

         */


        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        // [Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        RESULT:
        [Java, JavaScript, C#, C++]
         */
        System.out.println("\n-----Task-1-----\n");
        languages.remove("Python");
        System.out.println(languages);

        /*
        Task-2
        Remove all starting with J
         */

        /*
        WAY TO SURVIVE
        LinkedList<String> startsWithJ = new LinkedList<>();

        for(String language : languages){
            if(language.startsWith("J")) startsWithJ.add(language);
        }
        System.out.println(startsWithJ);

        languages.removeAll(startsWithJ);

        System.out.println(languages);

         */
        /*
        System.out.println("\n-----Task-2-----\n");
        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);

         */
        // USING ITERATOR

        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while(iterator.hasNext()){ // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if(element.startsWith("J")) // if element came from the queue starts with J
                iterator.remove(); // Remove
        }
        System.out.println(languages);


    }
}
