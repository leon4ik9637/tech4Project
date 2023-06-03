package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {


        /*
        Write a program that generate a random number bt -50 and 50
        And check if number is positive first
        If the number is positive, print "Number is positive"
        then also check if number is odd and print "Number is positive and odd"
        Note: if number is not positive, then you don't need to check if it is odd

        Pseudo
        1. Generate a random number bt -50 and 50
        2. Check if it is positive, and print message
        3. If positive, also check if it is odd and print message
         */
/*
        int num = (int) (Math.random() * 101) - 50;
        System.out.println(num);

        if(num > 0){
            // is number positive here YES so check it again inside of HERE

                if(num % 2 == 1){ // checking if the number is ODD or not
                    System.out.println("Number is positive and odd");
                }else{
                    System.out.println("Number is positive and even");
                }

        }else if(num < 0){
            System.out.println("Number is negative");
        }


         */
        int num = (int) (Math.random() * 101) - 50;
        System.out.println(num);


        if(num > 0){
            // Positive
            if (num % 2 == 0){ // Positive and Even
                System.out.println("Positive and Even");
            }else{ // Positive and Odd
                System.out.println("Positive and Odd");
            }


        }else if(num < 0){
            // Negative
            if(num % 2 == 0){
                System.out.println("Negative and Even");
            }else{
                System.out.println("Negative and Odd");
            }

        }else{
            // Zero
            System.out.println("Zero");
        }

    }
}
