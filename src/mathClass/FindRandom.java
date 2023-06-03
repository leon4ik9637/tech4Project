package mathClass;

public class FindRandom {
    public static void main(String[] args){

        double random = Math.random(); // 0.0 - 0.9999

        double random0And9Included = Math.random() * 10; // 0 - 9
        System.out.println(random);
        System.out.println(random0And9Included);

        // to create random number between 0 - 20 included:

        int random0And10Included = (int) (Math.random() * 11); // 0 - 10

        int random0And20Included = (int) (Math.random() * 21); // 0 - 20

        System.out.println(random0And10Included);
        System.out.println(random0And20Included);

        // create a random number between 10 - 20 included take that as an int
        int random10And20Included = (int) (Math.random() * 11) + 10; // 0(+10) - 10(+10)


        //create a random number between 103 - 346 included take that as int
        // get the difference --> 346 - 103 = 243 add +1
        // multiply it by 243 + 1 = 244
        // add the starting point to the equation

        int random103And346Included = (int) (Math.random() * 244) + 103;
        System.out.println(random103And346Included);

        // create a random number between -50 and 50 included take that as an int
        // difference + 1 = 101
        int randomNeg50And50Included = (int) (Math.random() * 101) - 50;
        System.out.println(randomNeg50And50Included);






    }
}
