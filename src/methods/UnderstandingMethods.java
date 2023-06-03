package methods;

public class UnderstandingMethods {
    public static void main(String[] args) {
        /*
        println() method is involved
        this method belongs to System, that is why it is involved with the
        System class name
        this method has a task of printing the variable given in its
        parentheses (argument-parameter)

         */
        // Introduction
        Introduction.introduce("C. Ronaldo", "Programmer",
                25, "Java");
        Math.min(4, 5); // 4








        /*
        Methods:
        1. Main method

        2.max(), min(), random(), abs(), parseInt(),
        parseDouble(), valueOf(), print(), println()

        Math.max(5, 10); // returns 10

        3. next(), nextInt(), nextLine()
        Scanner input = new Scanner(System.in);
        input.nextInt();

        METHODS
        - Methods are also known as functions
        - Methods are used to run specific tasks
        - This task is a block of code

        DEFINING ACCESSIBILITY OF THE METHODS
        1. public   -> you can use everywhere in the project
        2. private  -> you can use it only in the same class
        3. default  -> you can use it only in the same package
        4. protected

        DECIDING A METHOD TO BE STATIC OR NON-STATIC
        - If you want to call your method with class name, them
        declare as static method
            Math.max(), Math.min(), println(), print(), parseInt()
        - If you want to call it with object name, then declare it
        non-static (do not mention static)
            Scanner input = new Scanner(System.in)
            input.nextLine();
        --------------------------------------------


        --------------------------------------------

        CALCULATOR
        divide(20, 2);      // 10
        average(5, 3);      // 4
        average(5, 7, 3);   // 5

        DIVISION:
        public static int divide(int num1, unt num2){
            return Math.max(num1, num2) / Math.min(num1, num2);
        }
        public static int average(int num1, int num2, int num3){
            return (num1 + num2 + num3) / 3
        }
        public static int average(int num1, int num2, int num3, int num4){
            return (num1 + num2 + num3 + num4) / 4
        }

        Generate a random number between 50 to 100
        int ran1 = (int) (Math.random() * 51) + 50;

        getRandomNumber(50, 100); //

        public static int getRandomNumber(int start, int end){
        return (int)(Math.random() * (end - start + 1)) + start;
        }




         */



    }
}
