package collections.arrayList;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
        /*
        Task-1
         */

        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);

        /*
        Task-2
         */
        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");
        System.out.println("Japanese cars = " + japaneseCars);

        /*
        Task-3
        arraylist of luxury cars
         */
        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("\n-------Put all together-------\n");
        ArrayList<String> inventory = new ArrayList<>();

        System.out.println("Inventory at the beginning = " + inventory);

        // adding all german cars to the inventory collection
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);

        // adding all luxury cars to the inventory collection
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);

        // adding all japanese cars to the inventory collection
        inventory.addAll(japaneseCars);
        System.out.println("Inventory after adding japanese cars = " + inventory);


        // Removing all japanese cars from the inventory

        inventory.removeAll(japaneseCars);
        System.out.println();
        System.out.println("Inventory after removing japanese cars = " + inventory);

        /*
        Remove Tesla and BMW
         */
        ArrayList<String> carsToBeRemoved = new ArrayList<>();
        carsToBeRemoved.add("BMW");
        carsToBeRemoved.add("Tesla");

        inventory.removeAll(carsToBeRemoved);
        System.out.println(inventory);
    }
}
