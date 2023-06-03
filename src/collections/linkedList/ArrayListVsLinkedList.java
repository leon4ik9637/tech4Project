package collections.linkedList;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args){
        /*
        LinkedList vs ArrayList

        Array: We use arrays to store multiple elements
        ArrayList: ArrayLst is also used to store multiple
        elements

        - LinkedList is almost same as ArrayList
        - LinkedList<String> names = new LinkedList<>();
        - List<String> names = new LinkedList<>();

        NOTE: LinkedList provides all the methods that
        ArrayList provides and even more.

        NOTE: The biggest difference between ArrayList and
        LinkedList is the way they store the data.

        List of names and storing below data
        Melda, Ozdan, Deniz, Kaly, Abe, Data

        NOTE: LinkedList is faster to use when removing or
        adding elements to your collection. We can prefer
        LinkedList when we know we will play a lot with the
        size of the collection.

        NOTE: Since LinkedList is storing 3 information instead
        of one, it takes more memory compared to ArrayList.
        We will prefer to use ArrayList if we don't remove or
        add element frequently to our collection.

        Array -> ArrayList
        ArrayList -> Array
        ArrayList -> LinkedList
        LinkedList -> ArrayList

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

                    List    -> Parent
            ArrayList LinkedList    -> Children
                    Fruit   -> Parent
                Apple   Banana  -> Children

                Apple is an Apple
                Apple is a Fruit

                    Animal  -> Parent
                Cat Dog Mouse   -> Children

                HOW TO CONVERT ARRAY TO LIST(ArrayList - LinkedList)
        Vector
        - Vector is like synchronized ArrayList.
        synchronized = thread-safe
         */


        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);

        System.out.println("\n-----Looping LinkedList-----\n");
        for(Double d : numbers)
            System.out.println(d);

        System.out.println("\n-----Some methods of LinkedList-----\n");
        System.out.println(numbers.get(0)); // 10.5
        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 17.7

        System.out.println("\n-----Some additional methods of LinkedList-----\n");
        System.out.println(numbers.peek()); //getFirst() 10.5
        System.out.println(numbers.peekFirst()); // 10.5
        System.out.println(numbers.peekLast()); // 17.7

        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]
        System.out.println("\n---------------------------\n");

        System.out.println(numbers.poll()); // 10.5 retrieves (gets) the first element and removes it
        System.out.println(numbers.pollFirst()); // 12.5 retrieves (gets) the first element and removes it

        System.out.println(numbers.pollLast()); // 17.7 retrieves the last element and removes it

        System.out.println("\n---------------------------\n");
        numbers.push(5.7); // adds the object to the head (to the index of 0)
        numbers.push(8.9);
        System.out.println(numbers.pop());
        System.out.println(numbers);
    }
}
