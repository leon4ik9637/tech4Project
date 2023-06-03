package ifElseStatements.ifElseIfStatement;

public class Exercise1 {
    public static void main(String[] args){

        /*
        Write a program that generates a random number between -10, 10(Inclusive)
        and if the number is positive print out "number is POSITIVE!",
        if the number is negative print out "number is NEGATIVE!",
        and if the number is 0 print out "number is 0!"

        RUN1
        input:
        6
        output:
        number is POSITIVE!

        1. Generate a number
        2. Create if statements for checking 3 different possibilities
        3. Print out the number with the proper action for every single possibility
         */

        int num = (int) (Math.random() * 21) - 10;
        System.out.println(num);
//        if(num1 < 0){ // NEGATIVE
//            System.out.println("number is NEGATIVE!");
//        }
//        if(num1 > 0){ // POSITIVE
//            System.out.println("number is POSITIVE!");
//        }
//        if(num1 == 0){ // ZERO
//            System.out.println("number is ZERO!");
//        }
        // The 3 different possibilities are LINKED that means I can use if, else if

        if(num < 0){
            System.out.println("number is NEGATIVE!");
        }else if(num > 0){
            System.out.println("number is POSITIVE!");
        }else{
            System.out.println("number is ZERO!");

        }





    }
}
