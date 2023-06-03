package mathClass;

public class FindMax {
    public static void main(String[] args){

        /*
        max() method:
        - Finds the largest number from given numbers


        int x = 8;
        int y = 20;
        int z = 12_345;
        int a = 34;
        int b = 123;

        int maxValueOfXY = Math.max(x, y); // char can be put as well
        int maxValueOfXYZ = Math.max(Math.max(x, y), z);
        int maxValueOfAB = Math.max(a, b);

        int maxOfEveryInt = Math.max(Math.max(Math.max(8, 20), 12_345),
                Math.max(34, 123));



        System.out.println("maxValueOfXY = " + maxValueOfXY);
        System.out.println("maxValueOfXYZ = " + maxValueOfXYZ);
        System.out.println("maxValueOfAB = " + maxValueOfAB);
        System.out.println("maxOfEveryInt = " + maxOfEveryInt);
*/

        // write a program which is going to give max of given 3 numbers:
        // 4, 56, 23
        int a = 4, b = 56, c = 23;
        int maxOfEvery = Math.max((Math.max(a, b)), c);
        System.out.println(maxOfEvery);
        System.out.println("The maximum of the 3 numbers is = " + Math.max((Math.max(4, 56)), 23));



    }
}
