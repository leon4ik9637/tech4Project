package homeworks;

import java.util.Arrays;

public class HomeWork_12 {
    public static void main(String[] args) {
//        System.out.println("\n-------Task-2-------\n");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a word");
//        String word = scanner.next();
//        String rWord = "";
//        if(!word.isEmpty()){
//            for(int i = word.length() -1; i >= 0; i--) rWord += word.charAt(i);
//            if (word.equals(rWord)) System.out.println("This word is palindrome");
//            else System.out.println("This word is not palindrome");
//        } else {
//            System.out.println("This word does not have more than 1 character");
//        }
//
//        System.out.println("\n-------Task-4-------\n");
//
//        /*
//        Write a program that asks user to enter a positive number.
//        Print all the numbers starting from 1 to given number. But, print "Foo"
//        for the numbers divided by 2, "Bar" for the numbers divided by 3 and
//        "FooBar" for the numbers divided by both 2 and 3
//
//        Test data:
//        6
//        Expected result:
//        1
//        Foo
//        Bar
//        Foo
//        5
//        FooBar
//         */
//        System.out.println("Please enter a positive number");
//        int number = scanner.nextInt();
//            for (int i = 1; i <= number; i++) {
//                if (i % 6 == 0) System.out.println("FooBar");
//                else if (i % 3 == 0) System.out.println("Bar");
//                else if (i % 2 == 0) System.out.println("Foo");
//                else System.out.println(i);
//

        /*
        Task-6
        - Create a String array that stores cats below
        - print the entire array sorted lexicographically
        then check if it contains Garfield and Felix
        if it contains both, print true
        if it doesn't contain both, print false
        Expected result:
        false

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael" };

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        boolean hasFelix = false;
        boolean hasGarfield = false;

        for(String cat : cats){
            if(cat.equals("Garfield")) hasGarfield = true;
            else if (cat.equals("Felix")) hasFelix = true;
        }
        System.out.println(hasFelix && hasGarfield);


        Task-9
        RESULTS:
        Elements start with uppercase = 3
        Elements start with lowercase = 4
        Elements start with B or P = 5
        Elements having "book" or "pen" = 4


        System.out.println("\nTask - 9\n");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil",
        "Ruler"};
        int upperCase = 0, lowerCase = 0, startingWithBOrP = 0, haveBookOrPen = 0;

        for(String object : objects){
            if(CharacterHelper.isUppercase(object.charAt(0))) upperCase++;
            else lowerCase++;
            if(object.toUpperCase().startsWith("B") || object.toUpperCase().startsWith("P")) startingWithBOrP++;
            if(object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) haveBookOrPen++;
        }
        System.out.println(Arrays.toString(objects));
        System.out.println("Elements start with uppercase = " + upperCase);
        System.out.println("Elements start with lowercase = " + lowerCase);
        System.out.println("Elements start with B or P = " + startingWithBOrP);
        System.out.println("Elements having \"book\" or \"pen\" = " + haveBookOrPen);
         */

        /*
        Task - 10
        print both arrays
        create a new array called that will take
        greatest of same index from first 2 arrays
        print third array as well
         */
/*
        int[] num1 = {5, 8, 13, 1, 2};
        int[] num2 = {9, 3, 67, 1, 0};
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        int[] num3 = new int[5];
        for(int i = 0; i <= num1.length-1; i++){
            num3[i] = Math.max(num1[i], num2[i]);
        }
        System.out.println(Arrays.toString(num3));



 */

        System.out.println("\nTask - 10\n");
        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0, 2, 9};
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int[] third = new int[Math.max(first.length, second.length)];

        for(int i = 0; i <= third.length-1; i++){
            if(i < Math.min(first.length, second.length))
                third[i] = Math.max(first[i], second[i]);
            else if(first.length > second.length)
                third[i] = first[i];
            else third[i] = second[i];
        }
        System.out.println("Third array made of greatest is = " + Arrays.toString(third));






    }
}
