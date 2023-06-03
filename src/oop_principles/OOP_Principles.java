package oop_principles;

public class OOP_Principles {
    public static void main(String[] args) {



        /*
        1. Encapsulation
        2. Inheritance
        3. Abstraction
        4. Polymorphism

        1. ENCAPSULATION
        public class Car{

            //instance variables
            public String make;
            public String model;
            private int year;

            public int getYear(){
                return this.year;
            }

            public void setYear(int year, String username, String password){
                if(password.equals("abcd1234")
                && username.equals("johndoe")){
                    this.year = year;
                }
            }
        }

        public static void main(String[] args){
            Car car1 = new Car();
            car1.make = "BMW"; // direct access
            car1.model = "X6"; // direct access
            // car1.year = 2020; // restricted

            car1.setYear(2020, "abcd1234", "johndoe");
            System.out.println(car1.getYear()); // 2020
        }
         */
    }

}
