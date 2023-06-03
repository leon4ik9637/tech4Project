package casting;

import java.util.Scanner;

public class AutoboxingAndUnboxing {
    public static void main(String[] args){


        // Autoboxing (primitive -> object[wrapper clas])

        float num = 45.6F;
        Float numFloat = num;

        //Unboxing (object[wrapper class] -> primitive)
        Character character = 't';
        char characterPrimitive = character;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age bitch?");
        int age = input.nextInt();
        System.out.println(age >= 21 ? "Beer" : "Juice");

        String string1 = "Hello";
        String string2 = "World";
        System.out.println(string1.concat(" ".concat(string2)));




    }
}
