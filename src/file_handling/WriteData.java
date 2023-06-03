package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        /*
        create studentList.txt
        put a wait for 5 sec and delete
         */
        File list = new File("studentList.txt");

        try {
            list.createNewFile();
            Thread.sleep(2500);

            // write some info to file
            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor\n");
            fileWriter.close(); // save

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            list.delete();
        }
        System.out.println("End of the program");
    }
}
