package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recap {
    public static void main(String[] args) {
        /*
        ArraysList:
        1. Creating an ArrayList
        - ArrayList<Integer> numbers = new ArrayList<>();
        - List<Integer> numbers = new ArrayList<>();

        2. Getting a value from an ArrayList;
        - getting the SECOND value from numbers
        -> numbers.get(1);

        - getting the FIRST one and changing it with the FOURTH
        -> numbers.set(0, numbers.get(4));

        - assigning 5 to second, 7 to first, 8 to third
        -> numbers.set(1, 5);
        -> numbers.set(0, 7);
        -> numbers.set(2, 8);

        3. Sorting the ArrayList
        - Collections.sort(numbers);

        4. Printing the ArrayList
        - sout(numbers) // printing the values

        5. Getting the size of the ArrayList
        - numbers.size();

        6. Searching a value in an ArrayList
        -> indexOf(), lastIndexOf(), contains(); containsAll();
         */

        // - getting the FIRST one and changing it with the THIRD
        ArrayList<String> names = new ArrayList<>();

        names.add("Abraham");
        names.add("Regina");
        names.add("Andrei");
        names.add(1, "Melda");

        names.set(2, names.get(0));
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        System.out.println(names.indexOf("Abraham"));
        System.out.println(names.lastIndexOf("Abraham"));
        System.out.println(names.contains("Abraham"));
        System.out.println(names.indexOf("Abe"));

        System.out.println("\nCONVERSION\n");

        String[] cars = {"bmw", "mercedes", "audi"};

        ArrayList<String> carsList = new ArrayList<>(Arrays.asList(cars)); // 1
        List<String> carsList2 = Arrays.asList(cars);                      // 2
        ArrayList<String> carsList3 = new ArrayList<>();                   // 3

        for (int i = 0; i < cars.length; i++) carsList3.add(cars[i]);
        carsList3.addAll(Arrays.asList(cars));                             // 4

        System.out.println(carsList);
        System.out.println(carsList2);
        System.out.println(carsList3);

        System.out.println("\n\n");

        int[] nums = {1, 2, 3};

        ArrayList<Integer> numsList = new ArrayList<>();
        for(Integer num : nums) numsList.add(num);
        System.out.println(numsList);

        System.out.println("\nITERATOR\n");



    }
}
