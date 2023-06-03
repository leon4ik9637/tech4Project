package projects;

import utilities.CharacterHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project_08 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println("Task-5 = " + removeDuplicateElements(words));

        String[] strs = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println("Task-1 = " + countMultipleWords(strs));

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,-5, 6, 7, -10, -78, 0, 15));
        System.out.println("Task-2 = " + removeNegatives(nums));

        String pass = "Andrei123$";
        String email = "ab@gm.co";
        System.out.println("Task-3 = " + validatePassword(pass));
        System.out.println("Task-4 = " + validateEmail(email));

        String str = "I      am      learning      Java      ";
        String[] strArr = str.trim().split(" ");
        System.out.println("Task-6 = " + removeExtraSpaces(str));

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println("Task-7 = " + Arrays.toString(add(arr1, arr2)));
        int[] numbers = {10, -13, 5, 70, 15, 57};
        System.out.println("Task-8 = " + findClosestTo10(numbers));
    }

    /*
    Task-1 countMultipleWords() method
     */

    public static int countMultipleWords(String[] str){
        int counter = 0;
        for(String s1 : str) if(s1.trim().contains(" ")) counter++;
        return counter;
    }

    /*
    Task-3 validatePassword() method
    Write a method that takes a "String password" as an argument and
    checks if the given password is valid or not
    This method will return true if given password is valid, or false if
    given password is not valid
    A valid password:
        - length of 8 to 16
        - should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
        - should not have any space

        Test data 1:

        Output:
        false

        2:
        abcd
        Output:
        false

        3:
        abcd1234
        Output:
        false
     */

    public static boolean validatePassword(String password){

        int dg = 0, up = 0, lo = 0, spe = 0;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))) dg++;
            else if(Character.isUpperCase(password.charAt(i))) up++;
            else if(Character.isLowerCase(password.charAt(i))) lo++;
            else spe++;
        }

        return (password.length() >= 8 && password.length() <= 16)
                && (dg > 0 && up > 0 && lo > 0 && spe > 0)
                && !(password.contains(" "));
    }

    /*
    Task-2 removeNegatives() method
    - Write a method that takes an "ArrayList<Integer> numbers" as an
    argument and removes all negative numbers from the given list if there
    are any
    - This method will return an ArrayList with removed negatives
     */

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numsbers){
        Iterator<Integer> it = numsbers.iterator();
        // I am not assigning next() into a variable cuz I am calling it ONCE
        while (it.hasNext()) if(it.next() < 0) it.remove();
        return numsbers;
    }

    /*
    Write method taking "String email" as an argument
    True if valid false if not
    Should not have spaces
    should not have more than one "@" character
    should be in the format <2+chars>@<2+chars>.<2+chars>
     */

    public static boolean validateEmail(String email){
        // +validation of . --> after the @ sign there shouldn't be more than 1 .
        // validation of @ --> only 1 @ AND the position
        // validation of first part --> (0, index of @) >= 2
        // validation of second part --> (index of @ + 1, last index of .) >= 2
        // validation of first part --> (last index of . + 1) >= 2
        int cD = 0, iAt = email.indexOf("@"), lAt = email.lastIndexOf("@"),
                lDot = email.lastIndexOf(".");
        for (int i = lAt + 1; i < email.length(); i++) {
            if(email.charAt(i) == '.') cD++;
        }
        
        return cD == 1
                && (iAt == lAt && email.contains("@"))
                && lAt >= 2
                && lDot - lAt >= 3
                && email.length() - lDot >= 3;
    }

    /*
    Task-5
    Write a method that takes ArrayList<String> and returns ArrayList<String>
    removeDuplicateElements()
     */
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> words){
        ArrayList<String> withoutDup = new ArrayList<>();
        for(String word : words) if(!withoutDup.contains(word)) withoutDup.add(word);
        return withoutDup;
    }


    /*
    Task-6
    Write a method removeExtraSpaces() taking String argument
    return String with removed extra spaces
     */
    public static String removeExtraSpaces(String s){
        // first way
        /*String[] sArr = s.trim().split(" ");
        String sentence = "";
        for (String el : sArr) {
            if(!el.isEmpty()) sentence += el + " ";
        }
        return sentence.substring(0, sentence.length() -1);*/
        // second way
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) sentence.append(s.charAt(i));
            else if (s.charAt(i) == ' ' && sentence.charAt(sentence.length() - 1) != ' ') sentence.append(" ");
        }
        return sentence.toString();
    }
    /*
    Task-7
    Write a method taking 2 int[] arrays and return a new array
    with sum of given arrays elements
     */
    public static int[] add(int[] n1, int[] n2){
        int[] sum = new int[Math.max(n1.length, n2.length)];
        for(int i = 0; i < Math.min(n1.length, n2.length); i++){
            if(n1.length > n2.length) n1[i] += n2[i];
            else n2[i] += n1[i];
        }
        return (n1.length > n2.length) ? n1 : n2;
    }

    /*
    Task-8
    Write a method findClosestTo10() that takes an int[] array as arg
    Return closest element to 10 from given array
     */

    public static int findClosestTo10(int[] arr){
        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10 && Math.abs(10 - arr[i]) < Math.abs(10 - closest))
                closest = arr[i];
        }
        return closest;
    }


}
