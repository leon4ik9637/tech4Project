package exercises;

public class Mock2WhiteBoard {
    // Count words
    // Palindrome
    // codingBat arrays1/sum2

    public static void main(String[] args){
        String sentence = "Java is fun but hard";
        String word = "civic";
        System.out.println("This sentence has " + countWordsWithSplit(sentence) + " words");
        System.out.println(isPalindrome(word));
    }

    public static int countWords(String s){
        int spaces = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') spaces++;
        }
        return (spaces);
    }

    public static int countWordsWithSplit(String s){
        return s.split(" ").length;
    }

    public static boolean isPalindrome(String s){
        String rWord = "";
        for(int i = 0; i < s.length(); i++){
            rWord += s.charAt(s.length()-1 -i);
        }
        return s.equals(rWord);
    }
}
