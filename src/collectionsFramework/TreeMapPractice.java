package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {

        TreeMap<String, Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly", 17);
        studentAges.put("Torrie", 20);
        studentAges.put("Alona", 15);
        studentAges.put("andrei", 25);
        // studentAges.put(null, 10); // NullPointerException
        studentAges.put("Leon", null); // possible


        System.out.println(studentAges);
    }
}
