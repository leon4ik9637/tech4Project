package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        /*
        Create a list and store below data - countries

         */
        String[] countries = {"USA", "Brasilia", "Argentina", "France",
        "Belgium", "Germany", "Portugal"};

        System.out.println("\n-----Way-1 of converting Array to List-----\n");
        // WAY - 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);

        System.out.println("\n-----Way-2 of converting Array to List-----\n");
        // WAY - 2 to convert Arrays To List (ArrayList or LinkedList)
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries); // this method is adding all array elements to the List collection
        Collections.addAll(countries4, countries); // this method is adding all array elements to the List collection
        System.out.println(countries3);
        System.out.println(countries4);

        System.out.println("\n-----Way-3 of converting Array to List-----\n");
        // 3rd way - manual way
        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new LinkedList<>(); // or ArrayList

        for(int i : numbers){
            numbersList.add(i);
        }
        System.out.println(numbersList);



    }
}
