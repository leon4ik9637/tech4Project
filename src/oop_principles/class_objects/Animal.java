package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    //default constructor
    public Animal(){


    }

    //Create constructor that takes 6 arguments - name, color...isOmnivore

    public Animal(String name, String color, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore){
        // I should assign these local variables into instance variables
        this.name = name;
        this.color = color;
        this.age = age;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    // Creating another 2 - args custom constructor
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    // Fields of an Animal instance
    public static int numOfAnimals = 0;
    public static final boolean hasEyes = true;
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
        public String toString() {
            String s =  "Animal{";
            if(name != null) s += "name='" + name + '\'';
            if(color != null) s += ", color='" + color + '\'';
            if(age != 0) s += ", age=" + age;
            if(isCarnivore) s += ", isCarnivore=" + isCarnivore;
            if(isHerbivore) s += ", isHerbivore=" + isHerbivore;
            if(isOmnivore) s += ", isOmnivore=" + isOmnivore;
            s += '}';
        return s;
    }

    // Testing Animal
    public static void main(String[] args) {

        // Create  an animal object called a1 and define its info

        Animal a1 = new Animal("Cow", "Black", 3, false, true, false);
//        a1.name = "Cow";
//        a1.age = 3;
//        a1.color = "Black";
//        a1.herbivore = true;
//        a1.carnivore = false;
//        a1.omnivore = false;

        System.out.println(a1);

        Animal a2 = new Animal("Cat", "Gray", 1, false,false, true);
        System.out.println(a2);

        Animal a3 = new Animal("Parrot", "White", 2, false, true, false);
        System.out.println(a3);

        Animal a4 = new Animal("Lion", "Beige", 4, true, false, false);
        System.out.println(a4);

        /*
        Task-1
        Store your animal objects in a collection
        Count how many herbivore, omnivore and carnivore animal objects you have

        result:
        Omnivore = 1
        Carnivore = 1
        Herbivore = 2
         */

        System.out.println("\n-----Task-1-----\n");

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        /*
        int herbivore = 0, carnivore = 0, omnivore = 0;

        for(Animal animal : animals){
            if(animal.isOmnivore) omnivore++;
            else if(animal.isCarnivore) carnivore++;
            else herbivore++;
        }
         */

        int herbivore = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carnivore = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omnivore = (int) animals.stream().filter(animal -> animal.isOmnivore).count();


        System.out.println("Herbivore = " + herbivore);
        System.out.println("Carnivore = " + carnivore);
        System.out.println("Omnivore = " + omnivore);


    }
}
