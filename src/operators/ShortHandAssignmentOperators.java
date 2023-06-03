package operators;

public class ShortHandAssignmentOperators {
    public static void main(String[] args) {

        int johnsAge = 5;

        // int johnsAge5YearsLater = johnsAge + 5;
        // johnsAge = johnsAge + 5;

        /*
        Please find the age of John for five years later
         */

        johnsAge += 5; // 10

        System.out.println(johnsAge);

        String name = "Alex"; // Alexander

        // String name2 = name + "an" + "d" + "e" + "r";
        name += "an"; // Alexan
        name += "d"; // Alexand
        name += "e"; // Alexande
        name += "r"; // Alexander


        System.out.println(name); // Alexander



    }
}
