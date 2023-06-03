package arrays;

public class Recap {
    public static void main(String[] args) {
        /*
        1. Arrays:
        - It is a collection that stores multiple similar data
        - Data structures: Arrays, ArrayList, LinkedList, Vector,
        HashSet, TreeSet, HashMap, HashTable
        - Once we learn Arrays well, it will help us to easily
        learn all other data structures.

        numbers -> int
        words -> String
        currencies -> double

        //Initialization
        dataType[] variableName = new dataType[10];
        int[] numbers = new int[3]; // [0, 0, 0]
        char[] chars = new char[4]; // [, , ,]

        //Initializing with known values
        dataType[] variableName = {element1, element2...};
        int[] numbers = {5432, 3654, 5, 7, 39848};
        String[] cities = {"Tokyo", "Berlin", "Rio"};

        dataType[] variableName = new dataType[]{el1, el2};
        char[] chars = new char[]{'a', '2', 'u'};

        NOTE: Arrays are fixed sized collections.
        Once you declare an array, you cannot change its size
        anymore. Basically, deleting or adding more elements
        is not possible
        int[] numbers = new int[3]; // [0, 0, 0]
        numbers[1] = 15; // [0, 15, 0]
        numbers[2] = 5; // [0, 15, 5]
        numbers[3] = 20; // ArrayIndexOutOfBoundsException

        2. Printing Arrays
        String[] countries = {"Argentina", "Brazil", "Belgium"};
        String s = Arrays.toString(countries);
        System.out.println(s); // [Argentina, Brazil, Belgium]

        int[] numbers = new int[3]; //
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0]

        3. Size of an array
        String[] countries = {"Argentina", "Brazil", "Belgium"};
        System.out.println(countries.length);

        4. Default values
        byte, int, short, long    -> 0
        float, double             -> 0.0
        char                      ->
        boolean                   -> false

        boolean[] bs = new boolean[2]; // [false, false]
        String[] states = new String[50]; // [null, null, null...]

        5. For each loop
        int[] numbers = {3, 7, 10, 2, 0, 7};
        numbers.length; // 6
        numbers[2]; // 10
        numbers[3] = 20; // 2 -> 20

        System.out.println(Arrays.toString(numbers)); // [3, 7, 10, 20, 0, 7]

        for(int i = 0; i <= numbers.length-1; i++){
            System.out.println(numbers[i]);
        }

        3
        7
        10
        20
        0
        7

        For each element in the numbers, print element
        for(int element : numbers){
            System.out.println(element);
        }
        - For each loop always starts from the beginning
        - For loop is more flexible that you can start from
        the beginning or from the end

        for(int i = numbers.length/2; i <= numbers.length-1; i++)}
            System.out.println(numbers[i]);
        }

        for(int element : numbers){
            if(index >= 3) System.out.println(element);
            index++;
        }

        Arrays Part-3

        Array:
        - Collection that stores multiple data
        - It is fixed considering size. ONce you declare it,
        you cannot change it. (you cannot add or remove elements)

        Syntax:
        dataType[] variableName = new dataType[size];
        dataType[] variableName = {el1, el2, el3};
        variableName [3] = el4; // ArrayIndexOutOfBoundsException

        Restriction of arrays:
        - Fixed sized
        - It works only with indexes, does not provide
        methods as the other collections do.

        Enhanced for loop:
        for(dataType variableName : collection){
            // run this code for each element
        }
        - It is only used with collections
        - It executes a block of code for each collection element
        - It is not as flexible as fori loop if you
        would work with indexes or partial collection

        Sorting arrays:
        Arrays.sort(collection);
        - It is a void method that does not return anything.
        - String is sorted lexicographically
        - char and int are sorted in ascending order

        Arrays:
        1. Creating an array
        - int[] numbers = new int[size]; // you have to put the size
        - int[] numbers = {1, 2, 3}; // size and values are given
        - int[] numbers = new int[]{1, 2, 3}; // you don't have to specify the size

        2. Getting a value from an array;
        - getting the SECOND value from nums
        -> numbers[1]

        - getting the FIRST one and changing it with the THIRD
        -> numbers[0] = numbers[2];
        - assigning 5 to second, 7 to first, 8 to third
        -> numbers[1] = 5;
        -> numbers[0] = 7;
        -> numbers[2] = 8;

        3. Sorting the arrays
        - Arrays.sort(numbers);

        4. Printing the arrays
        - sout(numbers) // printing the location of the array
        - sout(Arrays.toString(numbers)); // printing the values

        5. Getting the size of the array
        - nums.length // don't put () after the length

        6. Searching a value in an array (SORT BEFORE YOU SEARCH)
        -> numbers[0] = 7;
        -> numbers[5] = 7;
        - Arrays.sort(numbers);
        - Arrays.binarySearch(numbers, 7); // returns 0 which is
        index of "7";
        - Arrays.binarySearch(numbers, 9); // returns a negative
         number which should be the index of "0" in that array
         if it would EXIST;
        - if returns negative number it means that object is not found







         */

    }
}
