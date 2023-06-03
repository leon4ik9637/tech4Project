package exercises;

public class WhiteBoardQuestions {
    public static void main(String[] args) {

        // fibonacci 10 numbers from fibonacci
        System.out.println("\nfibonacci\n");

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        String s = "";

        for (int i = 0; i < 10; i++) {
            // store the num
            s += n1 + " - ";
            // get the third
            n3 = n1 + n2;
            // change n1 and n2 for the next line
            n1 = n2;
            n2 = n3;
        }
        System.out.println(s.substring(0 , s.length() - 3));
        // 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34

        // finding max and second max from an array
        /*
        1. 2 containers for max and second max
        2. find the max with loop
        3. find the second max with loop (if it is not the max and bigger
        than the rest it is the second max
         */
        System.out.println("\nfinding max and second max from an array\n");

        int[] nums = {4, 5, 64234, 345, 36324, 74, 3223423};
        int maxNum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int number : nums) if(number > maxNum) maxNum = number;
        for (int number : nums)
            if (number > secondMax && number != maxNum) secondMax = number;
        System.out.println(maxNum);
        System.out.println(secondMax);

        // palindrome
        System.out.println("\npalindrome\n");

        String word = "civic";
        String rWord = "";
        for(int i = word.length() -1; i >= 0; i--){ //
            rWord += word.charAt(i);
        }
        System.out.println(rWord.equals(word));

        // fizzbazz --> 4 conditions
        /*
        both divided by 3 and 5 it is "fizzbuzz
        by 3 it is "fizz"
        by 5 it is "buzz"
        by none it is number itself
         */
        System.out.println("\nFizzBuzz\n");
        for(int i = 1; i <= 25; i++){
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }



        // foobar
        System.out.println("\nfoobar\n");

        for(int i = 1; i <= 16; i++){
            if(i % 6 == 0) System.out.println("FooBar");
            else if(i % 3 == 0) System.out.println("Foo");
            else if(i % 2 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\ncounting positive numbers in int array\n");

        int[] numbers = {7, -3, -7, 0, 2, 0, 7, 10, 2, 1};

        System.out.println(WhiteBoardQuestions.countPositives(numbers));






    }

    public static int countPositives(int[] number){
        int counter = 0;
        for(int i = 0; i < number.length; i++){
            if (number[i] >0) counter++;
        }
        return counter;
    }
    public static int countChars(char[] characters){
        int counter = 0;
        for(int i = 0; i < characters.length; i++){
            if(Character.isLetter(characters[i])) counter++;
        }
        return counter;
    }
}
