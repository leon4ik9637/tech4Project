package singleton;

public class Driver {

    /*
    how to achieve singleton
    1. make constructor private
    2. declare a private instance variable of the object of Driver
    3. make this variable static and provide a static getDriver method
    4. provide if condition to initialize the Driver instance variable
        if it is null then initialize it
        if it is not null then return the driver which has been already initialized

    NOTE: we understand that single Driver object is also encapsulated
     */


    private static Driver driver; // declare

    private Driver(){

    }

    public static Driver getDriver() {
        if(driver == null) driver = new Driver();
        return driver;
    }
}
