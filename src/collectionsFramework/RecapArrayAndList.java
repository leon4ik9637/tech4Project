package collectionsFramework;

import java.awt.*;
import java.util.*;
import java.util.List;

public class RecapArrayAndList {
    public static void main(String[] args) {

        /*
        ArrayList vs Vector: Vector is the thread-safe version of
        ArrayList. Thread-safe means synchronized.
        ArrayList vs LinkedList: LinkedList stores data with nodes
        (previous - itself - next) and this makes it faster when you
        remove or add elements. On the other hand, ArrayList stores
        data with indexes which takes less memory compared to
        LinkedList but slower when adding or removing elements.


         */

        int[] num = {1, 5, 7, 9, 10, 10}; // null is not allowed as it is a primitive array

        System.out.println(Arrays.toString(num));

        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));


        System.out.println("\n-----String ArrayList-----\n");
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        cities2.add(2, "Tokyo");

        System.out.println(cities2);
        System.out.println(cities2.get(4));

        System.out.println("\n-----String Vector-----\n");

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);

        System.out.println("\n-----String LinkedList-----\n");

        LinkedList<String> objects1 = new LinkedList<>();
        List<String> objects2 = new LinkedList<>();

        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());
        System.out.println(objects1);
        System.out.println(objects1.get(2)); // Airpods
        System.out.println(objects1.stream().filter(Objects::isNull).count()); //4

    }
}
