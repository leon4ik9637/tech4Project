package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise_01 {
    public static void main(String[] args) {
        /*
        Create a List to store below data (cities)
         */
        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> citiesList = new LinkedList<>(Arrays.asList(cities));
        System.out.println(citiesList);

        citiesList.remove(3);
        citiesList.remove(2);
        System.out.println(citiesList);

        String[] countries = {"Ukraine", "Poland", "Wales", "Slovakia", "Slovenia",
        "Australia"};
        List<String> countriesList = new LinkedList<>();
        Collections.addAll(countriesList, countries);
        System.out.println(countriesList);

        countriesList.removeIf(element -> element.startsWith("S"));
        System.out.println(countriesList);



    }
}
