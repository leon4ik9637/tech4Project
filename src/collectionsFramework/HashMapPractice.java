package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {

        /*
        Map Interface
        - Map always stores data with key-value pairs
        - Each key-value pair is also known as entry
        - Keys are always unique but values could be duplicate
        - put() methods is used to add key-values pairs to the
        collection
        - get(key) method is used to get value from the collection
        NOTE: Maps do not work with methods that require index.

        - HashMap allows only one null key because keys must be unique
        - HashMap allows as many null values as you need

        HashMap vs LinkedHashMap: The only difference is
        LinkedHashMap keeps the insertion order

        HashMap vs TreeMap
        HashMap vs TreeMap: HashMap allows only one null key and
        many null values but TreeMap does not allow any null keys
        while it allows also many null values. TreeMap sorts
        key-value pairs with keys.

        HashMap vs HashTable: HashMap allows 1 null key and many
        null values. HashTable does not allow any null keys or
        null values.
        HashTable is thread-safe. (Synchronized)

        HashTable<T, T> varName = new HashTable<>();


        MORE METHODS FROM MAP
        - keySet();
        - values();
        - entrySet();

        NOTE: Do not try to use Iterator with any Map
        implementation as it does not extend to Iterable
        interface.
        We can use Iterator with List, Set, Queue and Dequeue


         */

        /*
        String - String
        Key - Value
        Ukraine -> Kiev
        Spain -> Madrid
        Portugal -> Lisbon
        Italy -> Roma
        US -> DC
        Canada -> Ottawa
         */

        System.out.println("\n-----Understanding Map--------\n");
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        // printing a HashMap
        System.out.println(capitals);

        // how to get a particular key-value pair
        System.out.println(capitals.get("Spain")); // Madrid
        System.out.println(capitals.get("Germany")); // null
        System.out.println(capitals.get("us")); // null


        System.out.println("\n-----Understanding HashMap--------\n");

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "John"); // {null=John, 1=Alona, 2=Abdullah, 3=Abdullah, 4=Data}
        students.put(null, "Alex"); // this will replace John with Alex
        // no duplicates for key
        students.put(1, "Daria"); // same key updating value (replace)
        students.put(5, null);
        students.put(6, null);
        students.put(7, null);
        students.put(null, null); // replacing (key) null value

        System.out.println(students.size()); // 4
        System.out.println(students);




    }
}
