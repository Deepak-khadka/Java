package lab_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
public class ReadWriteOperation {

    public static void main(String[] args) throws FileNotFoundException {

        int total_attendance = 0;
        int total_count = 0;
        int average_attendance = 0;

        /* Read the file */
        File file = new File("dailyAttendance-1-1.txt");
        Scanner sc = new Scanner(file);

        /* Scan all the attendance from file */
        while (sc.hasNextLine()) {

            /* Calculate the total attendance and count total number of attendance */
            total_attendance = total_attendance + sc.nextInt();
            total_count = total_count + 1;
        }

        /* Calculate the total average of attendance */
        average_attendance = total_attendance / total_count;

        /* Output the result of average attendance and total number of attendance count */
        System.out.println("Total average marks is : "+ average_attendance + " and total Count is :" + total_count);

        try{
            /* Import Date*/
            Date date = new Date();

            /* Write file in report1.txt*/
            FileWriter fileWriter = new FileWriter("report1.txt");

            /* Write today's date, attendance report, Total Number of attendance and average daily attendance in 4 line*/
            fileWriter.write("Today's Date is " + date.getDate() + "\n");
            fileWriter.write("Attendance Report is "+ total_attendance  + "\n");
            fileWriter.write("The total Number of attendance is " + total_count + "\n");
            fileWriter.write("The Average daily attendance is " + average_attendance + "\n");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

