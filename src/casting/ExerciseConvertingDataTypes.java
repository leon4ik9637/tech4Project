package casting;


public class ExerciseConvertingDataTypes {
    public static void main(String[] args){

        /*
        Write a program which will take two numbers as a STRING and get the avg of them
        and print it out

        Input:
        String num1 = "23";
        String num2 = "25";

        Output:
        24
         */
/*
        String num1 = "23";
        String num2 = "25";

        int num1Int = Integer.parseInt(num1); // String --> int
        int num2Int = Integer.parseInt(num2); // String --> int

        Integer num1Integer = Integer.valueOf(num1); // String --> Integer
        Integer num2Integer = Integer.valueOf(num2); // String --> int --> Integer


        System.out.println("Avg with int is = " + ((num1Int + num2Int) / 2));
        System.out.println("Avg with Integer is = " + ((num1Integer + num2Integer) / 2));
        System.out.println();


        String number1 = "29";
        String number2 = "45";

        Integer number1Integer = Integer.valueOf(number1);
        Integer number2Integer = Integer.valueOf(number2);

        System.out.println("The average of the two integers = " + (number1Integer
                + number2Integer) / 2);

 */
        String costBicycle = "390";
        String savePerDay = "15.60";

        double costBicycleDouble = Double.parseDouble(costBicycle);
        double savePerDayDouble = Double.parseDouble(savePerDay);

        Double costBicycleDDouble = Double.valueOf(costBicycleDouble);
        Double savePerDayDDouble = Double.valueOf(savePerDayDouble);


        System.out.println("David needs " + (int) (costBicycleDDouble / savePerDayDDouble)
                + " days to save for bicycle.");










    }
}
