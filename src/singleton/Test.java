package singleton;

public class Test {
    public static void main(String[] args) {
        /*
        This is not possible anymore as constructor became private
        Driver d1 = new Driver();
        Driver d2 = new Driver();

        System.out.println(d1); // singleton.Driver@14ae5a5
        System.out.println(d2); // singleton.Driver@7f31245a
         */

        System.out.println(Driver.getDriver()); // singleton.Driver@14ae5a5
        System.out.println(Driver.getDriver()); // singleton.Driver@14ae5a5
        System.out.println(Driver.getDriver()); // singleton.Driver@14ae5a5
    }
}
