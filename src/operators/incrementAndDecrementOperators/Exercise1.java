package operators.incrementAndDecrementOperators;

public class Exercise1 {
    public static void main(String[] args){

        int i = 5;
        int age = 10 * (i++);     // 50
        System.out.println(age);

        age = 10 * (i++);         // 60
        System.out.println(age);

        age = 10 * i;             //70
        System.out.println(age);
        age = 10 * i++;           //70
        System.out.println(age);
        age = 10 * ++i;           //90

        System.out.println(age);
        age = 10 * i++;           //90

        System.out.println(age);
        age = 10 * i;             //100

        System.out.println(age);



    }
}
