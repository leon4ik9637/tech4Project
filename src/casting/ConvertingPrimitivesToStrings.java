package casting;

public class ConvertingPrimitivesToStrings {
    public static void main(String[] args){

        int num = 36;

        // + (concatenation)
        // valueOf() method

        String numStr1 = 45 + "" + num;         // 4536 (concat instead of adding)
        String numStr3 = 45 + num + "";         // sums and then makes it a string
        String numStr2 = String.valueOf(num +45);   // 81


        System.out.println("numStr1 " + numStr1);
        System.out.println("numStr3 " + numStr3);
        System.out.println("numStr2 " + numStr2);






    }
}
