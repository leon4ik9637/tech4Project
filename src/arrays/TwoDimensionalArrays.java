package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        /*
        -Arrays we have learned till now are called one-dimensional arrays.
        However, we can declare multidimensional arrays is Java

        String[] studentsOfTheBatch4 = {};

        String[][] groups {
                {"Abe", "Data", "Andrei", "Alona"}
                {"Ahmad", "Yakeen"}
                {"Kaycee", "Torrie", "David", "Jonathan"}
            };
        groups[0][1]; // Data      -> indexes
        groups[2][2]; // David     -> indexes

        groups[1][4]; // ArrayIndexOutOfBoundException
        groups[3][1]; // ArrayIndexOutOfBoundException

        Carnava
            {
                {
                    {honda},
                    {toyota},
                },
                {
                    {ford}
                },
                {
                    {mercedes},
                    {bmw},
                    {volkswagen}
                }

         */

        String[][] studentGroups = {
                                    {"Kaly", "Guluzar", "Melda"},
                                    {"Torrie", "David"},
                                    {"Abe", "Data"}
                                    };

        System.out.println(studentGroups[0][1]); // Guluzar
        System.out.println(studentGroups[1][0]); // Torrie
        System.out.println(studentGroups[1][1]); // David

        // how to get the size of the student groups;
        System.out.println(studentGroups.length); // 3

        // how to get the size of second group
        System.out.println(studentGroups[1].length); //2

        // how to print the inner third group
        System.out.println(Arrays.toString(studentGroups[2])); // [Abe, Data]

        System.out.println("\n Printing all groups at once\n");

        // how to print all
        System.out.println(Arrays.deepToString(studentGroups)); // everything

        /*
        How to print each group in separate lines?
        Result:
        [Kaly, Guluzar, Melda]
        [Torrie, David]
        [Abe, Data]
         */

//        System.out.println(Arrays.toString(studentGroups[0]));
//        System.out.println(Arrays.toString(studentGroups[1]));
//        System.out.println(Arrays.toString(studentGroups[2]));

        System.out.println("\n Printing each group with fori loop\n");

        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));
        }
        System.out.println("\n Printing each group with for each loop\n");

        for(String[] group : studentGroups){
            System.out.println(Arrays.toString(group));
        }
        
        /*
        How to print each group member in a separate lines
        
        RESULT:
        Kaly
        Guluzar
        Melda
        ...
        Data
         */
        System.out.println("\n Printing all members with fori loop\n");
        for (int i = 0; i < studentGroups.length; i++) {

            for (int j = 0; j < studentGroups[i].length; j++) { // 0
                System.out.println(studentGroups[i][j]);
            }
            
        }

        System.out.println("\n Printing all members with for each loop\n");
        for(String[] group : studentGroups){

            for(String student : group){
                System.out.println(student);
            }



        }

    }
}
