package phase3;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class creative {

    public static void main(String[] args) throws IOException {

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> markList = new ArrayList<>();

        /* Two parallel array name and marks*/
        BufferedReader names = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader marks = new BufferedReader(new FileReader("file2.txt"));

        /* Assign the name into nameList*/
        while (names.ready()) {
            nameList.add(names.readLine().toUpperCase());
        }

        /* Assign the marks in markList*/
        while (marks.ready()) {
            markList.add(marks.readLine());
        }

        /* Function that takes nameList and Marks List and search the result name*/
        searchResultByName(nameList, markList);

    }

/* Check the result from nameList with their marks*/
    private static void searchResultByName(ArrayList nameList, ArrayList markList) {

        /* Ask the user to enter their name */
        String input_name = JOptionPane.showInputDialog("Please Enter your name");

        /* Change the input value into upperCase*/
        if(nameList.contains(input_name.toUpperCase())) {

            /* If name contains in the array then search the marks */
            int index = nameList.lastIndexOf(input_name.toUpperCase());

            /* Show the message of congratulation*/
            JOptionPane.showMessageDialog(null, "Congratulation you have passed the exam with score of " + markList.get(index));
        }
        else {
            /* Show the message of not finding the name in the list */
            JOptionPane.showMessageDialog(null,"Sorry we couldn't find your name in list");
            int response =  JOptionPane.showConfirmDialog(null, "Do you want to try again");

            /* Ask the user to recheck the result in the name list */
            if(response == 0) {

                /* Recall the same function and check the process from beginning*/
                searchResultByName(nameList, markList);
            }
            else {
                /* Show message of giving thank you for using the system*/
                JOptionPane.showMessageDialog(null,"Thank you for using our system");
            }
        }
    }

}
