package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        /*
        Task-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        Expected:
        Unsorted array = [...]
        Sorted array = [...]
         */
        System.out.println("\n-------Task-1-------\n");
        String[] students = {"Alex", "Tom", "John", "James", "Jordan",
                "Lionel", "Adam"};

        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array = " + Arrays.toString(students));

        /*
        Task-2
        Print the first and the last names after it is sorted
        Expected:
        First name is = Adam
        Last name is = Tom
         */

        System.out.println("\n-------Task-2-------\n");
        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length-1]);


        /*
        Task-3
        Count how many names start with A
        Expected:
        2
         */
        System.out.println("\n-------Task-3-for-i-------\n");
//        int count = 0;
//        for(int i = 0; i <= students.length-1; i++){
//            if(students[i].startsWith("A")) count++;
//        }
//        System.out.println(count);


        System.out.println("\n-------Task-3-for-each-------\n");
        int count1 = 0;
        for(String student : students){
            if(student.startsWith("A")) count1++;
        }
        System.out.println(count1);


        /*
        Task-3
        Count how many names contains a-A or e-E

        Expected:
        5
         */
        System.out.println("\n-------Task-4-for-each-------\n");

        int count = 0;
        for(String student : students){
            student = student.toLowerCase();
            if(student.contains("a") || student.contains("e"))  count++;
        }
        System.out.println(count);

        System.out.println("\n-------Task-4-for-i-------\n");
        int count2 = 0;

        for(int i = 0; i <= students.length-1; i++){
            if (students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E")) count2++;
        }
        System.out.println(count2);

        /*
        Task-5
        Count how many names has at least 5 characters
        Expected:
        3
         */
        System.out.println("\n-------Task-5-for-each-------\n");

        int count3 = 0;
        for(String student : students){
            if(student.length() >= 5) count3++;
        }
        System.out.println(count3);

        /*
        Task-6
        Check if the array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        Expected:
        false
         */

        // 1st way
//        for(int i = 0; i <= students.length-1; i++){
//            if(students[i].equals("Jennifer")){
//                System.out.println(true);
//            }
//
//        }
//        System.out.println(false);
        // 2nd way
        System.out.println("\n-------Task-6-for-each-------\n");

        boolean hasJennifer = false;
        for (String student : students){
            if(student.equals("Jennifer")){
                hasJennifer = true;
                break;
            }
        }
        System.out.println(hasJennifer);



    }
}
