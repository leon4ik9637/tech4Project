package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        /*
        User should be able to upload files to prove
        their information
        AC: User should be able to upload below file
        types
        .pdf
        .doc
        .txt
        .jpeg
        .png

        Your file is successfully submitted
        AC: User is not allowed to upload below files
        .tiff
        .psd
        .xls
        .pptx

        These file types are not supported, you can
        upload ... file types

         */
        // To create a file we use some classes

        File myFile = new File("myPage2.html");

        try {
            System.out.println("Checking existence before creating file = " + myFile.exists()); // false
            System.out.println(myFile.createNewFile()); // true
            System.out.println("Checking existence after creating file = " + myFile.exists()); // true
            System.out.println("File name is = " + myFile.getName());
            System.out.println("Absolute path of the file = " + myFile.getAbsolutePath());
            System.out.println("Can file write = " + myFile.canWrite());
            System.out.println("Can file read = " + myFile.canRead());
            System.out.println("Size of the file = " + myFile.length());


            Thread.sleep(1000);
            // System.out.println(myFile.delete()); // true

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }
}
