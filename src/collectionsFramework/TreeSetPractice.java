package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        /*
        difference is not having nulls since it returns sorted list

        HashSet vs TreeSet: TreeSet does not allow any nulls while
        HashSet allows a single null element. TreeSet also sorts
        elements implicitly.
        Numbers: ascending
        String: lexicographically

         */

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers); // [1, 2, 3, 5]

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Joe");
        names.add("Alex");
        names.add("ali");

        System.out.println(names); // [Alex, Joe, John, ali]

    }
}
