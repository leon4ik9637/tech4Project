package casting;

public class CastingRecap {
    public static void main(String[] args){
        /*
        Casting
        primitive to primitive
        object ot object
        implicit or explicit
        String -> Dog
        Dog -> String

        Examples
        1.
        int number 1 = 45;
        double d = number1; // implicit

        2.
        int number2 = 1;
        short s = (short) number2;
        explicit
         */

        String s = "10.5";
        System.out.println(s+2); // 10.52 (concatination)


        Double d1 = Double.valueOf(s); // 10.5

        System.out.println(d1+2); // 12.5

        double d2 = Double.valueOf(s); // 10.5

        System.out.println(d2+2); // 12.5

        double d3 = Double.parseDouble(s); // 10.5

        System.out.println(d3+2); // 12.5






    }
}
