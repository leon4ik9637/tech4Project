package loops.doWhileLoop;

import java.util.Random;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {
        /*
        Syntax:
        do{
            //code
        }while(condition);
        NOTE: use do-while loop if your block of code will execute at least
        once without condition
        - This is very similar to while loop
        - However, it will execute the block of code at least  once
        - It will first execute the block of code, then will check
        the condition
        - While condition is true, the block of code will be executed
        again
         */

//        Random random = new Random();
//        boolean b = random.nextBoolean();
//
//
//        while(b){
//            System.out.println("It is true");
//            b = random.nextBoolean();
//        }
//

        boolean b = false;

        while(b){
            System.out.println("true");
            b = false;
        }
        System.out.println("End of the program!");


        boolean b2 = false;

        do{
            System.out.println("true");
        }while(b2);




    }
}
