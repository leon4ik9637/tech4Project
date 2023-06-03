package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise_02_find_second_greatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        // Second greatest is 3
        // Second Smallest is 7

        // TreeSet -> [3, 5, 7]

        TreeSet<Integer> uniques = new TreeSet<>(numbers);
        System.out.println(uniques);
        ArrayList<Integer> newUniques = new ArrayList<>(uniques);
        System.out.println(newUniques.get(newUniques.size()-2)); // 7
        System.out.println(newUniques.get(1)); // 3
    }
}
