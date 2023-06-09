package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        /*
        Create a Student object with below information
        Create another student named Lionel
         */
        Student student1 = new Student();

        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "male";
        student1.address = "Chicago";
        student1.height = 5.7;
        student1.weight = 170.5;
        student1.email = "johndoe@gmail.com";
        student1.id = 0001;

        System.out.println(student1); // Student{firstName='John', lastName='Doe', age=45, dateOfBirth='01/01/1977', gender='male', address='Chicago', height=5.7, weight=170.5, email='johndoe@gmail.com', id=1}

        Student student2 = new Student();
        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "male";
        student2.address = "Paris";
        student2.weight = 150.0;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 1002;

        System.out.println(student2); // Student{firstName='Lionel', lastName='Messi', age=34, dateOfBirth='01/01/1988', gender='male', address='Paris', height=4.9, weight=150.0, email='lionel@gmail.com', id=1002}

        Student student3 = new Student();

        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2020";
        student3.gender = "male";
        student3.address = "Chicago";
        student3.height = 5.5;
        student3.weight = 165;
        student3.email = "alex@gmail.com";
        student3.id = 1003;

        System.out.println(student3);

        Student student4 = new Student();

        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender = "female";
        student4.address = "Miami";
        student4.height = 5.7;
        student4.weight = 160;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;

        System.out.println(student4);

        Student student5 = new Student();

        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender = "female";
        student5.address = "Berlin";
        student5.height = 5.3;
        student5.weight = 150;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;

        System.out.println(student5);

        /*
        count how many students are from Chicago

        2
         */
        System.out.println("\n-----Task-1-----\n");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        int teen = 0;
        int count = 0;
        for (Student student : studentList) {
            if(student.address.equalsIgnoreCase("Chicago")) count++;
            if(student.age < 19) teen++;
        }
        System.out.println(count);

        /*
        Task-2
        Count how many students are male and female

        Expected
        Males = 3
        females = 2
         */
        System.out.println("\n-----Task-2-----\n");
        int males = 0, females = 0;

        for (Student student : studentList) {
            if(student.gender.equalsIgnoreCase("male")) males++;
            else females++;
        }
        System.out.println("Males = " + males);
        System.out.println("Females = " + females);

        System.out.println("\n-----Task-3-----\n");
        System.out.println("Teens = " + teen);

        System.out.println("\n-----Task-4-----\n");

        for (Student student : studentList) {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.dateOfBirth);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.height);
            System.out.println(student.weight);
            System.out.println(student.email);
            System.out.println(student.id);

        }



    }
}
