package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {
        /*
        primitives      Wrapper
        byte            Byte
        short           Short
        int             Integer
        long            Long
        float           Float
        double          Double
        char            Character
        boolean         Boolean

        - Wrpper are the reference type representations of
        primitives (Objects)
        - Wrappers will do all that primitives can do
        - Also, they can do more with their pre-built methods

        char vs Character
        char c = 'a';
        Character c2 = 'a';

        Character class static methods
        Character.isDigit('A'); // false
        Character.isDigit('7'); // true

        Character.isLetter(' '); // false
        Character.isLetter('Q'); // true

         */
        char c = '9';
        boolean b = Character.isDigit(c);
        System.out.println(b); // true

        System.out.println(Character.isDigit('9')); // trur

        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.isUpperCase('B')); // true

        System.out.println(Character.isLowerCase('G')); // false
        System.out.println(Character.isLowerCase('h')); // true

        System.out.println(Character.isLetter('l')); // true
        System.out.println(Character.isLetter('2')); // false

        System.out.println(Character.isDigit('2')); // true
        System.out.println(Character.isDigit('k')); // false

        System.out.println(Character.isLetterOrDigit('5')); // true
        System.out.println(Character.isLetterOrDigit('t')); // true
        System.out.println(Character.isLetterOrDigit(' ')); // false

        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isSpaceChar(' ')); // true

        char c2 = '$';
        System.out.println(!Character.isLetterOrDigit(c2) &&
                !Character.isSpaceChar(c2));            // true

        char c3 = 'A';

        String s = "AEOUIaeoui";
        System.out.println(s.contains(c3 + "")); // true; + "" -> concatenation to convert to a String
        //                                                     -> could also do String.valueOf(c3)

        char c4 = 'a';
        boolean isC4Vowel = false;

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c4) {
                isC4Vowel = true;
                break;
            }
        }


    }
}
