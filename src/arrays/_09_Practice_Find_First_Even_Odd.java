package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*
        First even = 0
        First odd = 5
         */
        boolean isFirstEvenFound = false;
        //int firstEven = 1;
        boolean isFirstOddFound = false;
        //int firstOdd = 1;


        for(int number : numbers){
            if(number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First even is = " + number);
            }
            else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("First odd is = " + number);
            }
            if(isFirstEvenFound && isFirstOddFound) break;
        }
        if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");

//        if(isFirstEvenFound) System.out.println("First even is = " + firstEven);
//        else System.out.println("There is no even number in this array");
//        if(isFirstOddFound) System.out.println("First odd is = " + firstOdd);
//        else System.out.println("There is no odd number in this array");
//



        int firstEven = 1;
        int firstOdd = 0;

        for (int number : numbers) {
            if(firstEven % 2 == 0 && firstOdd % 2 == 1) break;

            if(firstEven % 2 == 1 && number % 2 == 0) firstEven = number;
            else if(firstOdd % 2 == 0 && number % 2 == 1) firstOdd = number;
        }


















    }
}
