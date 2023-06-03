package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args){

        Scanner opt = new Scanner(System.in);
        System.out.println("Hey David! Please enter your balance?");
        double balance = opt.nextDouble();
        if(balance >= 600.0){
            System.out.println("Awesome! You have enough money!");
        }else{
            System.out.println("Sorry! You are poor!");
        }




    }
}
