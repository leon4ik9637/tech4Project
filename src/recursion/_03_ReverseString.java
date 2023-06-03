package recursion;

public class _03_ReverseString {
    /*
    Write a recursive method to reverse a String
     */

    String str = "Apple";
    public static String reverse(String str){
        if(str.length() <= 1) return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Apple")); // elppA
    }

}
