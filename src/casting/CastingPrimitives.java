package casting;

public class CastingPrimitives {
    public static void main(String[] args){

        /*
        double > float > long > int >= char >= short > byte

        char is unsigned, short is signed.
        So while they are both 2-byte long, they use sixteenth bit for
        different purposes.
        The range of the char type is 0 to 2^16 - 1 (0 to 65535)
        The short range is -2^15 to 2^15 - 1 (-32768 to 32767)
         */

        int myInt = 32;
        long myLong = myInt;        // implicit casting (smaller to bigger)
                                    // - automatic since no data can be lost

        myInt = (int) myLong;       // explicit casting (bigger to smaller)
                                    // - manual since bigger does not fit into smaller and data is lost


        int mySecondInt = 'B';      // implicit casting
        char myChar = (char) 56;           // you don't have to cast int to char and char to int
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4;    // SAY THE DATA TYPE YOU WANT TO CONVERT NOT THE OTHER ONE

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;
        /*
        Int max = 2147483647
        Int min = -2147483648
        Short max = 32767
        Short min = -32768
        char = NO NEGATIVE NUMBERS
         */

        System.out.println("Int max = " + Integer.MAX_VALUE);
        System.out.println("Int min = " + Integer.MIN_VALUE);
        System.out.println("Short max = " + Short.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE);
        char testing = (char) -78;
        System.out.println(testing);

        byte num1 = 45;
        int num2 = num1;        // implicit

        double num3 = 13.6;
        float num4 = (float) num3; // explicit

        int num5 = 45;
        int num6 = 34;

        char c = (char) num5;   // we have to cast for both cuz char should be positive every time
        c = (char) num6;        // cast, so it cannot be negative (only char)
        /*
        CASTING RECAP:
        - Casting is converting one Primitive to another

        Types of casting:

        double > float > long > int > char > short > byte

        NOTE:
        - Char cannot have NEGATIVE value because there is no negative ASCII value.
        - Boolean cannot be cast to any primitive.

        1. Implicit Casting
            - When we convert smaller size data type to bigger one.
            - Java does itself, we don't have to do anything.
            - There is NO data loss.
        2. Explicit Casting
            - When we convert bigger size data type to smaller one.
            - We have to explicitly cast it. (<dataType that you want to cast)
            - There CAN be data loss.

        ------------------------------------------------------------------------------------
        Primitive to String Conversion:
        - There are two ways we can convert a primitive to a String.
        1. (+ "" )             --> int x = 56;
                                int y = 34;

                                String str = y + x + ""; --> 90
                                    also
                                String str = "" + x + y; --> 5634
        2. String.valueOf(); --> String str = String.valueOf(x + y); --> 90
                                        also
                                 String str = String.valueOf(x) + String.valueOf(y);

       --------------------------------------------------------------------------------------

       String to Primitive Conversion:
       1. WrapperClassName.valueOf();
       - This method is going to take "String" and returns an "Wrapper Class".
       2. WrapperClassName.parseDataType();
       - This method is going to take "String" and return a "Primitive data type".

       Ex:
            String str = "45";
            String bool = "true";
            String cha = "Y";
            String string = "data";

            Double doubleVO = Double.valueOf(str);          --> 45.0 (Wrapper Class)
            double doublePD = Double.parseDouble(str);      --> 45.0 (Primitive)

            Boolean booVO = Boolean.valueOf(bool);          --> true (Wrapper Class)
            boolean booPD = Boolean.parseBoolean(bool);     --> true ()

            WrapperClass variableName = WrapperClass.valueOf(string); (Wrapper Class)
            primitive variableName = WrapperClass.parseWrapperClass(string); (Primitive)

      --------------------------------------------------------------------------------------

       Wrapper Classes:
       - It is an object representation of primitives. Wrapper Classes can do everything and MORE than primitives.
       - It has useful methods for manipulating the data.
       - They are usually with the same name as their primitive names. (int or char)
       --> Integer, Character.


       NOTE:
       - Autoboxing and unboxing happens implicitly. (We don't have to do anything).
       - There is no data loss. (Only for their own dataTypes).

       Autoboxing:
       - primitive -> wrapperClass(Object)(DataType)(Class)

       Unboxing:
       - wrapperClass(Object) -> primitives

     --------------------------------------------------------------------------------------

        "var" keyword
        - instead of putting dataType you can just put "var".
        Ex:

            int x = 45;
            var x = 45;
            String str = "something";
            var str = "something";















         */



    }
}
