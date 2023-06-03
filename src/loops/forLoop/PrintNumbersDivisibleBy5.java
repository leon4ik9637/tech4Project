package loops.forLoop;

public class PrintNumbersDivisibleBy5 {
    public static void main(String[] args) {
        /*
        Write a Java program to check numbers from 1 to 50 (50 included)
        and print all the numbers that divide by 5
         */

        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
