// Programmed by Sabina Rana Magar

//Lab 2

package random;

import java.util.Random;

public class a {

    public static void main(String[] args) {

        // Here is random 5 Spinner Options in String
        String[] spinner_choices = {"$500", "$250", "BANKRUPT", "$600", "$100"};

        // Here we import random for selecting spinner choices
        Random random = new Random();

        // Welcome message
        System.out.println("Welcome to the Wheel of Fortune");
        System.out.println("Here we go oooooooooooooo");

        // Selected indexed option will be print out in this below line
        System.out.println("You won : " + spinner_choices[random.nextInt(spinner_choices.length)]);

        System.out.println("Congratulations...........");



    }
}
