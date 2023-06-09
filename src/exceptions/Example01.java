package exceptions;

public class Example01 {
    public static void main(String[] args) {
        /*
        Handle the exception below and report with message
         */
        String[] names = {"Alex", "John", "Max"};

        try{
            System.out.println(names[100]); // ArrayIndexOutOfBoundsException
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End of the program!");



    }
}
