package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        /*
        Set Interface
        NOTE: LinkedHashSet keeps the insertion order but still
        does not provide any methods that uses index
         */
        /*
        How to create a HashSet
         */

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);


        System.out.println(numbers);




    }
}
