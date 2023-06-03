package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException {

        /*
        Checked exception are immediately requiring a handling mechanism
        even before you run a code
        They are also known as compiler time exception

         */
        // First way to handle checked exception using try-catch block
        /*
        try{

            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000); // 2 seconds
                System.out.println(i);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

         */
        // Second way is adding exception to the method signature using throw keyword
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000); // 2 seconds
            System.out.println(i);
        }

        Thread.sleep(3000);
        System.out.println("End of the program");
    }
}
