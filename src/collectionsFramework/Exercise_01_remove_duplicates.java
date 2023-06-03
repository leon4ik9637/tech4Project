package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Exercise_01_remove_duplicates {
    public static void main(String[] args) {
        /*
        Create arraylist and store data and print with no duplicates
         */

        String[] arr = {"Computer", "Phone", "Mouse", "Mouse",
                "Phone", "Pen"};

        System.out.println("\n-----First way - not preferred-----\n");
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> noDuplicates1 = new ArrayList<>();

        for (String object : objects) {
            if(!noDuplicates1.contains(object)) noDuplicates1.add(object);
        }
        System.out.println(noDuplicates1);


        System.out.println("\n-----Second way - using collections-----\n");
        // TreeSet -> Computer, Mouse, Pen, Phone
        // HashSet -> random order
        // LinkedHashSet -> removes duplicates and the order it is

        System.out.println(new LinkedHashSet<>(Arrays.asList(arr)));


    }
}
