package stringMethods;

public class _06_charAt {
    public static void main(String[] args){

        /*
        Method Task: It helps to get a character at a specific index
        NOTE: Index starts with zero
        - non-static as we call it with object name
        - It is a return type and returns char primitive
        - It takes an argument which is int (index)

        NOTE: It will throw StringIndexOutOfBoundsException when the given
        index is not in the bounds

        String name = "Taylor";
        Can you tell me the first letter -> T
        What is the letter 1 in this name -> T
        What is the letter 4 in this name -> l
        What is the letter -5 in this name -> confused
        What is the letter 15 in this name -> no 15th letter

        Human reads starting from 1
        T -> 1
        a -> 2
        y -> 3
        l -> 4
        o -> 5
        r -> 6

        Java reads starting from 0
        T -> 0
        a -> 1
        y -> 2
        l -> 3
        o -> 4
        r -> 5
        String name = "Taylor";
        System.out.println(name.charAt(2)); // y
        System.out.println(name.charAt(-1)); // Error
        StringIndexOutOfBoundException (not compiler error)

        System.out.println(name.charAt(5)); // r
        System.out.println(name.charAt(6)); //
        StringIndexOutOfBoundException (not compiler error)
        Taylor
        0 - 5

        John
        0 - 3

         */
        String name = "John";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        // System.out.println(name.charAt(4)); // -1, 4

        /*
        Check if the name starts with A and print "This name starts with A"
        print "This name is not starting with A" otherwise
         */

        char firstChar = name.charAt(0);
        if(firstChar == 65 || firstChar == 97){
            System.out.println("This name starts with A");
        }else
            System.out.println("This name is not starting with A");






    }
}
