package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*
        There are 2 control statements in loops:
        1. break;
            - break is used to terminate the loop
        2. continue;
            - continue is used to skip only current iteration if specified
            condition occurs, and continues with the next iteration in the loop

        int i = 10;

        while(true){
            if(i == 13) continue;
            else System.out.println(i); // 19 (20 is not included)
            i++;

            if(i==20) break;
        }

         */
        /*
        Write a program that prints all the numbers bt 1 to 25
        But skip the numbers that can be divided by 10
         */
        for(int i = 1; i <= 25; i++) {
            if (i % 10 != 0) {
                System.out.println(i);
            }
            if(i == 15) {
                break;
            }
        }

        // using continue control statement to skip numbers that can be divided by 10
        for(int i = 1; i <= 25; i++) {
            if (i % 10 == 0) {
                continue;
            }
            else{
                System.out.println(i);
            }
            if(i == 15) {
                break;
            }
        }

        System.out.println("End of the program");
    }
}
