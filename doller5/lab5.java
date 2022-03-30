package doller5;

import javax.swing.*;
import java.util.Scanner;
import java.io.FileWriter;

public class lab5 {

    public static void main(String[] args) {

        /* Asking user for amount */
        System.out.println("Enter the amount you wish to bet ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        /* Asking user for the game he/she want to play */
        System.out.println("Enter the name of game you want to play");
        Scanner string = new Scanner(System.in);
        String game = string.nextLine();

        /* Methods making object as myMethods*/
        MyMethods myMethods = new MyMethods();

        /* Validated amount is accepting */
        int validatedAmount = myMethods.validateAmountForGame(amount, game);

        /* Display the thank you, message with game and bet amount*/
        System.out.println("Thank you for your bet of $" + validatedAmount + " for the game of " + game);

        /* Write the amount in a.txt file */
        try {
            FileWriter fw = new FileWriter("a.txt");
            /* Writing amount in a.txt file*/
            fw.write("Amount is " + validatedAmount);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
