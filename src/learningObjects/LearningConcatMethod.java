package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String global ="Global";

        String schoolName1 = tech + global;             //operator
        String schoolName2 = tech.concat(global);       //concat method


        System.out.println(schoolName1 + "\n" + schoolName2);

        /*
        String fullName1;
        fullName1 = "Leon";
        or;
        String fullName1 = "Leon";
        String myLastName = "Kuchman";
        create a string variable double quotations
        create a string variable with '+'
        create a string variable with concat() method

         */

        // "Leon Kuchman"
        String myName = "Leon";
        String myLastName = "Kuchman";
        String space = " ";

        String fullName1 = "Leon Kuchman";
        String fullName2 = myName + " " + myLastName;
        String fullName3 = myName.concat(" ".concat(myLastName));


        System.out.println(fullName1);
        System.out.println(fullName2);
        System.out.println(fullName3);

        // " Kuchman"
        String fullName4 = " ".concat(myLastName);
        System.out.println(fullName4);

        System.out.println("This is fullName1 --> " +  fullName1);
        System.out.println("This is fullName2 --> " + fullName2);



    }
}
