package casting;

public class Homework6Task3 {
    public static void main(String[] args) {
        /*
        Requirement:
        Assume that you have a coin bank, and you save
        3 quarters, 1 dime, 2 nickels and 1 penny each
        day.
        NOTE: Scanner is not needed for this task!
        - find how many days later you can save $24
        - find how many days later you can save $168
        - How much you will save after 5 months (assume
        a month is 30 days)
         */

        double dailySave = (3 * 0.25) + 0.1 + (2 * 0.05) + 0.01; // 0.96
        System.out.println((int) (24 / dailySave) + " days");
        System.out.println((int) (168 / dailySave) + " days");
        System.out.println("$" + (150 * dailySave));




    }
}
