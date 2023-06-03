package oop_principles.class_objects;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Fruit {

    //Instance variables
    public static boolean hasColor;

    static{
        System.out.println("This is static block");
        hasColor = true;
    }

    public String name;
    public String shape;
    public boolean isSweet;

    {
        System.out.println("This is instance block");
        shape = "Round";
        isSweet = true;
    }





    public static void main(String[] args) {
        System.out.println("This is line 1 in the main method before object being created");;
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();
        Fruit fruit4 = new Fruit();
        Fruit fruit5 = new Fruit();
        System.out.println("This is last line in the main method after object being created");;



    }
}
