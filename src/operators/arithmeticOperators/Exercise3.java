package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args){

        /*
        Pseudo Code:
        1. create variable
        2. do the equation
        3. print them out
         */

        double yearlySalary = 90_000.00;
        double monthlySal = yearlySalary / 12;
        double biweeklySal = yearlySalary / 26;
        double weekly = yearlySalary /52;
        int weeksPerYear = 52;
        int monthsPerYear = 12;
        int biweeksPerYear = 26;
        double monthlySalary = yearlySalary / monthsPerYear;
        double biweeklySalary = yearlySalary / biweeksPerYear;
        double weeklySalary = yearlySalary / weeksPerYear;

        System.out.println("Monthly Salary = $" + monthlySal);
        System.out.println("Monthly Salary = $" + monthlySalary);
        System.out.println("Biweekly Salary = $" + biweeklySal);
        System.out.println("Biweekly Salary = $" + biweeklySalary);
        System.out.println("Weekly Salary = $" + weekly);
        System.out.println("Weekly Salary = $" + weeklySalary);







    }
}
