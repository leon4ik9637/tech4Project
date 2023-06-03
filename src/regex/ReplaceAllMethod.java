package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        //Removing vowels
        String str = "Hello World";
        System.out.println("Before: " + str);
        str = str.replaceAll("[aeiouAEIOU]", "!");
        System.out.println("After: " + str);

        //Removing digits

        String str2 = "Hello123World";

        str2 = str2.replaceAll("[^A-Za-z]", "");
        System.out.println(str2);

        /*
        Create a String as below:
        String str3 = " abc 123 $#^ ";
        Remove all special characters
        Result: abc123
         */

        String str3 = " abc 123 $#^%  )(! ";

        str3 = str3.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str3);



    }
}
