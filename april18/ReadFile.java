package april18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {

        int totalAttendance = 0;

        /* Read the file */
        File file = new File("dailyAttendance-1-1.txt");
        Scanner sc = new Scanner(file);

        int count = 0;
        /* do while unitll the file will end */
        while (sc.hasNextLine()) {
           totalAttendance += sc.nextInt();
           count++;
        }

        int average_attendance = 0;
        /* If count is 0 then Display no records is found */
        if(count > 0)
        {
            /* Calculate the total average of attendance and display in console */
            average_attendance = totalAttendance / count;
            System.out.println("Total average marks is : "+ average_attendance + " and total Count is :" + count);
        }
        else {
            System.out.println("Sorry, Empty record is detected in file");
        }

        try{
            Date date = new Date();

            /* Write in 4 lines in report1.txt file.*/
            FileWriter fileWriter = new FileWriter("report1.txt");

            /* With today's date , attendance report, total number of attendance, and daily attendance */
            fileWriter.write("Today's Date  : " + date.toString() + "\n");
            fileWriter.write("Attendance Report is :"+ totalAttendance  + "\n");
            fileWriter.write("The total Number of attendance is " + count + "\n");
            fileWriter.write("The Average daily attendance is " + average_attendance + "\n");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
