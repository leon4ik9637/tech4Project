package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle

        * * * * * *
        *         *
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *

         */

        for(int i = 1; i <= 25; i++){
            if(i == 1 || i == 25) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }
    }
}
