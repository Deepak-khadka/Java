package lab_9;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

public class Houseman1 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        String newword = "";
        String userLetter = null;
        int tries = 0;
        final int maxTries = 6;

        JOptionPane.showMessageDialog(null, "Welcome to Hangman120 - Guess the secret word!");

        File file = new File("a.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int i;

        // Holds true till there is nothing to read
        while ((newword = br.readLine()) != null) {

            String[] userWord = new String[newword.length()];

            java.util.Arrays.fill(userWord, "-");

            System.out.println(java.util.Arrays.toString(userWord));
            System.out.println("Remaining attempt time is " + (maxTries - tries));

            do {
                //PLAY
                //get user guess in userLetter
                Scanner userInput = new Scanner(System.in);
                System.out.println("Guess");

                //search WORD to see if userLetter is in there
                //use the String method INDEXOF () to find the userLetter or not
                userLetter = userInput.nextLine();
                int index1 = newword.indexOf(userLetter);

                if (index1 >= 0) {
                    //indexOf() returns the index of the matching position OR a (-) if no match
                    //IF to display the letter in the correct position OR a no match message
                    //IF match - assign userLetter into userWord[]
                    userWord[index1] = userLetter;

                    // - display the correct letter in the correct position in the userWord array
                }
                //IF NO match - message that letter is not in the word
                // - increment tries
                tries++;
                System.out.println(java.util.Arrays.toString(userWord));
                System.out.println("Remaining attempt time is " + (maxTries - tries));
            }
            //repeat logic to get the next letter from user
            while (maxTries > tries);

            //WIN - LOSE
            //LOSE - compare tries to maxTries
            //Win - if no dashes exist in userWord
            // - compare userWord to word (beware that word is a string and userWord is an array)
            // - count correct guess and compare to the number of chars in WORD
            String resultString = java.util.Arrays.toString(userWord);
            String result = "WIN";

            if (resultString.contains("-")) {
                result = "LOSE";
            }

            System.out.println("You " + result+ " the game");

        }
    }

}
