package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); // Fri Apr 21 19:13:04 EDT 2023

        // MM/dd/yyyy   04/21/2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));

        // Print date in the format of Sat hh:mm AM
        sdf = new SimpleDateFormat("EEE hh:mm a"); //
        System.out.println(sdf.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // day (Friday)
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // Year (2023)



    }
}
