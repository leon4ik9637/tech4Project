package loops.whileLoop;

public class PrintNumbersDividedBy3 {
    public static void main(String[] args) {
        /*
        Write a Java program to check numbers from 1 to 30 (included)
        and print all the numbers that can be divided by 3
        NOTE: use while loop
        */
        int i = 1;
        while(i <= 30){
            if(i % 3 == 0) System.out.println(i);
            i++;
        }
    }
}
