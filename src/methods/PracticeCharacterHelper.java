package methods;

import utilities.CharacterHelper;

public class PracticeCharacterHelper {
    public static void main(String[] args) {

        char c1 = 32;
        char c2 = 'c';

        System.out.println(" does this contain a space = " + CharacterHelper.isSpace(c1)); // true
        System.out.println(" does this contain a space = " + CharacterHelper.isSpace(c2)); // false

        char c3 = 'F';
        System.out.println(CharacterHelper.isUppercase(c3)); // true
        char c4 = 'a';
        System.out.println(CharacterHelper.isLowercase(c4)); // true
        System.out.println(CharacterHelper.isUppercase(c4)); // false
        System.out.println(CharacterHelper.isDigit(c4)); // false
        char c5 = 'x';
        System.out.println(CharacterHelper.isVowel(c5)); // false
        char c6 = 'i';
        System.out.println(CharacterHelper.isVowel(c6)); // true
        char c7 = 'I';
        System.out.println(CharacterHelper.isDigit(c7)); // false

    }
}
