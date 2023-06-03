package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        int sum = 0;
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("\n-------Task-2 for each-------\n");

        System.out.println("The sum of numbers in the array = " + sum);

        System.out.println("\n-------Task-2 fori-------\n");

        int sum1 = 0;
        for(int i = 0; i <= numbers.length-1; i++){
            sum1 += numbers[i];
        }
        System.out.println(sum1);

        System.out.println("\n-------Task-3 fori-------\n");
        /*
        find sum of first 3 elements in the array
         */
        int sumOfFirst3 = 0;
        for (int i = 0; i <= 2; i++) {
            sumOfFirst3 += numbers[i];
        }
        System.out.println(sumOfFirst3);

        System.out.println("\n-------Task-4 fori-------\n");
        /*
        find sum of last 5 elements in the array
         */
        int sumLast5 = 0;
        for(int i = numbers.length-1; i >= numbers.length-5; i--){
            sumLast5 += numbers[i];
        }
        System.out.println(sumLast5);

        /*
        find the product of the last 4 but exclude 0 if there are any
         */
        System.out.println("\n-------Task-5 fori-------\n");

        int productOfLast4 = 1;
        for(int i = numbers.length-1; i >= numbers.length-4; i--){
            int number = numbers[i];
            if(number != 0) productOfLast4 *= number;
        }
        System.out.println(productOfLast4);


        /*
        Task-6
        Check your collection and print true if one of the elements is 0
        Print false if none of the elements is 0

        Result:
        true
         */
        System.out.println("\n-------Task-6 for each-------\n");

        boolean hasZero = false;

        for(int number : numbers){
            if (number == 0) {
                hasZero = true;
                break;
            }
        }
        System.out.println(hasZero);





    }
}
