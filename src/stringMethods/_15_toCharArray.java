package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        /*
        String s = "Hello";

        int countL = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAr(i) == 'l') count++;
        }

        System.out.println(countL);

        - toCharArray();
        - this is a non-static method
        - it is a return method and returns an array which is char
        - it does not take any arguments

        String str = "Hello";
        char[] letters = str.toCharArray();
        "Hello"     -> {'H', 'e', 'l', 'l', 'o'};

        System.out.println(Arrays.toString(letters)); // [H, e, l, l, o]

        int countL2 = 0;
        for(char c : str.toCharArray()){
            if(c == 'l')  countL2++
        }
        System.out.println(countL2);
         */

        String s = "Java";

        char[] chars = s.toCharArray();

        System.out.println(Arrays.toString(chars)); // [H, e, l, l, o]

        int countA = 0;
        for(char element : chars){
            if(element == 'a') countA++;
        }
        System.out.println(countA);

        System.out.println(Arrays.toString("Leon".toCharArray())); // [H, e, l, l, o]


    }
}
