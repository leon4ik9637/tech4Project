package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class UnderstandingArrayList {
    public static void main(String[] args) {
        /*
        ArrayList: It is dynamic sized Arrays
        - ArrayList works only with reference types (objects)
        - It is dynamic considering size that you could add and remove
        elements (update the size)
        - It allows duplicates
        - It allows null
        - ArrayList provides us many useful methods that help manipulate
         data it has

         ArrayList Methods
         1. size() returns the number of elements that you have in the list
         2. add(object) adds given object to the end of the list
         3. add(index, object) adds given object to the specified index
         4. set(index, object) updates the object at given index with
         specified object
         5. get(index) retrieves the object at the specified index
         6. indexOf(object) gets the first index of given object in the list
         7. lastIndexOf(object) gets the last index of given object in the list
         8. contains(object) checks if the list contains the given object
         9. remove(index) removes object at specified index and returns object
            if index does not exist, it will throw IndexOutOfBoundException
        10. remove(object) removes given object if found and returns true
            it is not going to remove it if it is not found and returns false
        11. clear() removes all the elements in the list
        12. isEmpty() checks if the list is empty and returns true/false

        removeAll()
        addAll()
        removeIf()



        ArrayList<String> names = new ArrayList<>();
        size is zero but capacity is 10 (behind the scene)


        Array vs ArrayList

        Declaring an Array
        dataType[] variableName = new dataType[size];

        Declaring an ArrayList
        ArrayList<dataType> variableName = new ArrayList<>(dataType);
        ArrayList<dataType> variableName = new ArrayList<>(); // better

        Getting size of the Array
        int lengthOfArray = variableName.length;

        Getting size of the ArrayList
        int sizeOfTheArrayList = variableName.size();

        Collections:
        Arrays: it is a collection used to store multiple data
        - it is fixed size
        - it can be used to store both primitives and
        reference types (objects). This is an advantage
        of using Arrays over other collections

        NOTE: None of the collections except Arrays will
        not work with primitives.

        RECaP:
        Array: Fixed sized collection that stores multiple element
        ArrayList: Dynamic sized arrays

        SIMILARITIES:
        - both of them stores multiple elements as they are collections;
        - both allow duplicated elements
        - both can have null elements
        NOTE: primitives cannot be null
        String[] words = {null, "abc", "123"};


        - Arrays work with both primitives and reference types while
        ArrayList works only with reference types.
        - The size of the array cannot be changed once it is declared while
        ArrayList has dynamic size that we can add-remove elements
        - Array works with indexes to manipulate the data while
        ArrayList provides many methods to do that

        SYNTAX:
        array -> dataType[] variableName = new dataType[size];
        list  -> ArrayList<dataType> variableName = new ArrayList<>();

        ArrayList methods:
        ArrayList<Double> balances = new ArrayList<>();

        1. add(object)
        balances.add(10.5); // [10.5]
        balances.add(5.6); // [10.5, 5.6]

        2. add(index, object)
        balances.add(0, 4.5); // [4.5, 10.5, 5.6]

        3. set(index, object)
        balances.set(1, 5.3) // [4.5, 5.3, 5.6]

        4. get(index)
        balances.get(2); // 5.6

        5. indexOf(object)
        balances.indexOf(5.3); // 1
        balances.indexOf(10); // -1

        6. lastIndexOf(object);
        balances.lastIndexOf(4.5); // 0

        7. size()
        balances.size(); // 3

        8. contains(object)
        balances.contains(5.3); // true
        balances.contains(2); // false

        9. isEmpty()
        balances.isEmpty(); // false

        10. clear()
        balances.clear(); // it removes all the elements

        11. remove(object) - remove(index)
        balances.remove(5); // IndexOutOfBoundException
        balances.remove(20.23); // false

        12. removeAll(collection)


         */
        // 1. Declaring an Array vs ArrayList

        String[] namesArray = new String[5]; //Array

        ArrayList<String> namesList = new ArrayList<>(); //ArrayList

        //2. How to print the size of Array vs ArrayList

        System.out.println("Size of the Array = " +  namesArray.length); //5
        System.out.println("Size of the ArrayList = " +  namesList.size()); //0

        // 3. How to add elements to Array vs ArrayList

        namesArray[0] = "Abe";
        namesArray[4] = "Data";
        namesArray[4] = "Lionel";
        // namesArray[7] = "John"; // ArrayIndexOutOfBoundException Runtime error

        namesList.add("Abe"); // add method that takes object [Abe]
        namesList.add(1, "Data"); // [Abe, Data] // Add object to a specific index
        namesList.add(1, "John"); // [Abe, John, Data]
        namesList.add("Alona"); // [Abe, John, Data, Alona]
        namesList.add("Max"); // [Abe, John, Data, Alona, Max]
        namesList.add(0, "James"); // [James, Abe, John, Data, Alona, Max]

        namesList.set(3, "Lionel"); // [James, Abe, John, Lionel, Alona, Max]

        // 4. How to print Array vs ArrayList
        System.out.println(Arrays.toString(namesArray)); // [Abe, null, null, null, Lionel]

        System.out.println(namesList);
        namesList.add("Andrei"); // [James, Abe, John, Lionel, Alona, Max, Andrei]
        System.out.println(namesList);
        namesList.add(5,"Taylor");  // [James, Abe, John, Lionel, Alona, Taylor, Max, Andrei]
        System.out.println(namesList);
        namesList.set(3, "Daria"); // [James, Abe, John, Daria, Alona, Taylor, Max, Andrei]
        System.out.println(namesList);

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(null);
        namesList.add(null);
        namesList.add(null);
        namesList.add("Guluzar");

        System.out.println(namesList); // James, Abe, John, Daria, Alona, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar
        System.out.println(namesList.size());

        // namesList.remove(7) this will remove element at index of 7
        // namesList.remove("James") this will remove James
        // namesList.removeAll(collectionOfElementsToBeRemoved) this
        // will remove all the elements from the given collection

        namesList.remove(0); // James
        System.out.println(namesList); // [Abe, John, Daria, Alona, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.remove(2)); // Daria
        System.out.println(namesList); // Abe, John, Alona, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar

        // namesList.remove(20); // IndexOutOfBoundsException

        namesList.remove("Alona");
        System.out.println(namesList); // Abe, John, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar

        System.out.println(namesList.remove("John")); // true
        System.out.println(namesList); // Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar

        System.out.println(namesList.remove("max")); // false
        System.out.println(namesList.remove("Melda")); // false
        System.out.println(namesList); // Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar

        namesList.add(0,"Regina");
        System.out.println(namesList);

        System.out.println(namesList.get(3)); // Max
        System.out.println(namesList.get(5)); // Regina
        System.out.println(namesList); // [Regina, Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.indexOf("Regina")); // 0
        System.out.println(namesList.lastIndexOf("Regina")); // 7
        System.out.println(namesList.indexOf("Nataliia")); // -1
        System.out.println(namesList.lastIndexOf("Nataliia")); // -1

        System.out.println(namesList.contains("Max")); // true
        System.out.println(namesList.contains("max")); // false
        System.out.println(namesList.contains("Kaley")); // false

        System.out.println(namesList.isEmpty()); // false

        // namesList.removeAll(namesList);
        namesList.clear();
        System.out.println(namesList.size()); // 0
        System.out.println(namesList.isEmpty()); // true






















    }
}
