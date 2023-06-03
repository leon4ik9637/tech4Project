package stringMethods;

public class _13_replace {
    public static void main(String[] args) {
        /*
        Method Task: It is used to replace some values in a String with another value
        NOTE: It replaces all the occurrences.
        - It is non-static
        - It is a return type and return another which is modified
        - It takes arguments (char or String)

        "banana".replace('a', '$'); // b$n$n$
        "Can I can a can".replace("can", "XXX"); // Can I XXX a XXX
        "Hello".replace("l", ""); // Heo

        "TechGlobal".replace("abc", "XXX"); //TechGlobal
        ec -> xx
        Gl -> yy
        "TechGlobal".replace("ec", "xx").replace("Gl", "yy"); //Txxhyyobal
         */

        String sentence = "Can I can a can?";
        System.out.println(sentence.replace("can", "xxx")); // Can I xxx a xxx?
        String s = "banana";
        System.out.println(s.replace('a', '$'));

        String name = "John"; // o replace with ooo
        System.out.println(name.replace("o", "ooo"));

    }
}
