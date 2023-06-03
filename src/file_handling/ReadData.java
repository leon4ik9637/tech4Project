package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        /*
        1. create a new txt file called shoppingList
        2. Write all student names below
         */

        File file = new File("shoppingList.txt");

        try{
            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream\n");
            fileWriter.write("Fruits\n");
            fileWriter.write("Pen\n");
            fileWriter.write("Paper\n");
            fileWriter.write("Milk");
            fileWriter.close();
            Thread.sleep(2500);


            // How to read info from a file
            Scanner scanner = new Scanner(file);

            int index = 1;
            while(scanner.hasNextLine()){
                Thread.sleep(1500);
                System.out.println("Item " + index++ + " = " + scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            file.delete();
        }
    }
}
