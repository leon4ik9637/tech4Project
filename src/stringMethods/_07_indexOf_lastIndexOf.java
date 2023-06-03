package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
        Method Type: They are used to find the index or last index of some char or String
        values in another String
        - They are non-static methods and called with another String objects
        - They are return type, and they return in as index
        - They take either String or char as arguments

        NOTE: if the given char or String does not exist then they return -1
        NOTE: if you are looking for index of String, and it exists, it will return
        the first index of found match

        String name = "Lionel";
        name.charAt(2)    -> 0
        name.charAt(5)    -> l

        name.indexOf('o') -> 2
        name.indexOf('e') -> 4
        name.indexOf('i') -> 1

        name.charAt(45)     -> StringIndexOutOfBoundsException
        name.index(-1)      -> -1
        If the given character or number is not found in the string
        index returns "-1"

        String word = "Banana";
        word.indexOf('a')        -> 1
        word.indexOf('n')        -> 2
        word.lastIndexOf('a')    -> 5
        word.lastIndexOf('n')    -> 4

        word.indexOf("an")       -> 1
        word.lastIndexOf("an")   -> 3
        word.indexOf("Banana")   -> 0
        word.lastIndexOf("Banana") -> 0
        String sentence = "I like Chicago and Miami more than any other
        cities";
        sentence.indexOf("Chicago"); -> 7, 0, 8
        sentence.indexOf("an"); -> 15
        sentence.lastIndexOf("an"); -> 15

         */
//        String sentence = "I like Chicago and Miami more than any other cities";
//        System.out.println(sentence.indexOf('C')); // 7
//        System.out.println(sentence.indexOf('c')); // 10
//        System.out.println(sentence.lastIndexOf('c')); // 45
//
//        sentence.indexOf("Chicago"); //7
//        sentence.indexOf("Miami");  //19
//
//        System.out.println(sentence.indexOf("Florida")); //

        String str = "abcxyabcxy";
        //            0123456789

        //System.out.println(str.indexOf("xy", str.indexOf("xy")+1));
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.replace(0, str.indexOf("xy"), "+++");
        System.out.println(sb);
    }
}
