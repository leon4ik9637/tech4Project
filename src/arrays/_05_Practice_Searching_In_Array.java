package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        /*
        Task-1
        check the collection you have above and print true if it contains Mouse
        print false otherwise
         */

        boolean hasMouse = false;
        for(String object : objects){
            if(object.equals("Mouse")){
                hasMouse = true;
                break;
            }
        }

        /*
        Task-1
        check the collection you have above and print true if
        it contains board
        print false otherwise
        RESULT:
        false
         */

        boolean hasBoard = false;
        for(String object : objects){
            if(object.equals("board")){
                hasBoard = true;
                break;
            }
        }
        System.out.println(hasMouse);
        System.out.println(hasBoard);

        /*
        Check if you have an element equals to "iPad"

        Arrays class has binarySearch() method that helps us find if our
        collection contains a specific element
        NOTE: To be able to use this method, your array MUST be sorted first

        This method is taking 2 args, first is your array collection and the
        second is the element you are looking for

        1. One element is found -> it returns the index of the element
        2. Multiple elements are found -> it returns the index of last occurrence
        3. No element found -> always returns negative index (possible index -1)

        HOW TO CHECK IF ARRAY HAS A PARTICULAR ELEMENT?
        - I could do this in 2 ways
        1. Using loops -> check each element and see if you have
        your element you look for.
        2. Using binarySearch() method
            NOTE: binarySearch() will work properly only if your
            collection is sorted (if it is not sorted yet)
            - binarySearch() is static, we call it with class name
            - This method takes 2 arguments (collection, element)
            - binarySearch() method returns an int which is the
            index of the element that is found
                negative indexes    -> element not found
                zero index          -> element is found
                positives indexes   -> element is found

        Static methods of Array class:
            Arrays.binarySearch()
            Arrays.sort()
            Arrays.toString()
         */
        System.out.println("\n-----Task-3-----\n");
        Arrays.sort(objects); // My array is sorted

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Phone") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Grove") >= 0); // false

//        boolean hasiPad = false;
//        for(String object : objects){
//            if(object.equals("iPad")){
//                hasiPad = true;
//                break;
//            }
//        }
//        System.out.println(hasiPad);

        /*
        Task-4
        check if collection has 5
        check if collection has 0
        check if collection has 45
        check if collection has 3
        check if collection has -7

        RESULT:
        true
        true
        true
        false
        true
         */

        System.out.println("\n-----Task-4-----\n");

        int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(numbers); // numbers are sorted

        System.out.println(Arrays.binarySearch(numbers, 5) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 0) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 45) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 3) >= 0);
        System.out.println(Arrays.binarySearch(numbers, -7) >= 0);

        System.out.println(Arrays.binarySearch(numbers,
                5,9,0) >= 0); // false


    }
}
