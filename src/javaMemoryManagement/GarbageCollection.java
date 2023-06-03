package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n-----object references before losing reference-----\n");
        System.out.println(dog1); // Dog@14ae5a5
        System.out.println(dog2); // Dog@7f31245a

        System.out.println("\n-----object references after losing reference-----\n");
        dog1 = dog2; // dog1 is losing reference here and garbage collected
        //dog1 = null;

        // Explicitly doing Garbage Collection
        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(dog1); // Dog@7f31245a
        System.out.println(dog2); // Dog@7f31245a

    }
}
