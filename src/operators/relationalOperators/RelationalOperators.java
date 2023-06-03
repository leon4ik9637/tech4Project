package operators.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args){


        /*
        < less than
        <= less than or equal to
        > greater than
        <= greater than or equal to
        == comparison -> checks if both sides are equal
        != comparison (not equal) -> checks if both sides are not equal

        Ex:
        int a = 5;
        int b = 3;

        int c = 5;
        int d = 7;

        a > b --> true
        a < b --> false

        a >= c --> true
        b < d  --> true
        c > a  --> false
        c >= a --> true

        3 <= 3 --> true
        3 < 7  --> true
        3 <= 7 --> true

        ----------------------------------
        int x = 3;
        int y = 5;
        int z = 9;

        x == 4; --> false // 3 is not equal to 4
        x == 3; --> true  // 3 is equal to 3

        x + y == z --> false // 8 is not equal to 9
        x + y + 1 == z --> true // 9 is equal to 9

        x != 4 --> true // 3 is not equal to 4
        x != 3 --> false // 3 is equal to 3

         */

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;       // false, a is equal to b
        boolean isANotEqualToB = a != b;    // true, a is not equal to b

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);

        boolean isASmallerThanB = a < b;
        boolean isAGreaterThanOrEqualToB = a >= b;
        boolean isASmallerThanOrEqualToB = a <= b;

        System.out.println("a > b : " + (a > b)); // false
        System.out.println("a < b : " + isASmallerThanB); // true
        System.out.println("a >= b : " + isAGreaterThanOrEqualToB); // false
        System.out.println("a <= b : " + isASmallerThanOrEqualToB); // true








    }
}
