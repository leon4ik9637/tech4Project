package ifElseStatements.ifStatements;

public class BalanceExamples {
    public static void main(String[] args){

        double balance = 1000;
        // you can use relational and logical operators.
        // expression which is going to be true if balance is less than 0
        boolean isBalanceLessThan0 = balance < 0;       // false
        boolean isBalanceEqualTo100 = balance == 0;     // false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000;   // false

        // create an expression for checking if balance is not equal to -1
        boolean isBalanceNotEqualToNegative1 = balance != -1; // true



        if(balance < 0){ //if this is true execute otherwise print
           System.out.println("Your balance is under 0");
        }







    }
}
