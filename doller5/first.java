package doller5;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


public class first {

    public static final double currencyIntoRewardRate = 0.01;

    public static final int maxAmount = 150;

    public static final int minAmount = 100;

    public void introductionMessage() {
        System.out.println("Hey Welcome to the House Management System");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Declare a numeric variable
        int paidAmount = 0, reward = 0;

        // Declare a string variable
        String billFor = "";

        // 2. Declare at lease one constant
        final int min = minAmount;

        // 3. Welcome the user using a dialog output box
        JOptionPane.showMessageDialog(null, "Welcome Message");

        // 4. Prompt the user to enter address of the house
        String homeAddress = JOptionPane.showInputDialog("Enter the House address : ");

        System.out.println("Enter the number to see the bill of  ");
        System.out.println("1. Phone \n2. Water \n3. Electricity \n4. Internet \n5. Mortgage");

        int inputChoice = scanner.nextInt();

        // 5. Include at least one if/else if/ else logic
        if (inputChoice == 1) {
            billFor = "Phone";
        } else if (inputChoice == 2) {
            billFor = "Water";
        } else if (inputChoice == 3) {
            billFor = "Electricity";
        } else if (inputChoice == 4) {
            billFor = "Internet";
        } else if (inputChoice == 5) {
            billFor = "Mortgage";
        } else {
            billFor = "other";
        }

        // 6. At least two mathematical calculation
        // 7. Generate the random number for bill amount
        int random_bill_amount = (int) Math.floor(Math.random() * (maxAmount - min + 1) + min);

        System.out.println("For House number " + homeAddress + "\nBill for " + billFor + " is $" + random_bill_amount);

        System.out.println("Enter the amount to pay : ");

        paidAmount = scanner.nextInt();

        //Calculate mathematical operation
        int calculateBillAmount = random_bill_amount - paidAmount;

        //Display the message for
        System.out.println("Successfully paid bill for " + billFor + " remaining bill amount is $" + calculateBillAmount);

        // If payment is more than a $100 then use will reward with $10
        // (P2-1) Compound Condition using AND condition
        if (calculateBillAmount >= 0 && paidAmount > 100) {
            reward = 10;
        }

        // (P2-3, P2-4) :- Using loop statement and abbreviated incrementor
        System.out.println("How many number of receipt you want to print ");
        int receiptNumber = scanner.nextInt();

        for (int i = 1; i <= receiptNumber; i++) {
            System.out.println("Receipt Printed " + i + " times");
        }

        // (P2-5) :- Using one method that took one argument and return a value
        double amount = convertRewardIntoCurrency(reward);

        System.out.println("Your total reward point is " + reward + " and converted reward into currency is $"+ amount);

        // (P2-6) Display at least 1 image.
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("horse1.jpg");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static double convertRewardIntoCurrency(int reward) {
        return reward * currencyIntoRewardRate;
    }
}