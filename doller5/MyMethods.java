package doller5;

import java.util.Scanner;

public class MyMethods {

    Scanner scanner = new Scanner(System.in);

    public int validateAmountForGame(int amount, String game) {

        switch (game) {
               case "poker" :
                   amount = checkPoker(amount);
                   break;

               default:
                   amount = checkOtherGame(amount);
                   break;
           }

        return amount;
    }

    public int checkPoker(int amount) {
        if( amount > 50 && amount < 500) {
            return amount;
        }

        System.out.println("Re-enter your amount. It must be in the range of $50 to $500");
        int requestAmount = scanner.nextInt();
        return checkPoker(requestAmount);

    }

    public int checkOtherGame(int amount) {
        if( amount > 10 && amount < 100) {
            return amount;
        }

        System.out.println("Re-enter your amount. It must be in the range of $10 to $100");
        int requestAmount = scanner.nextInt();
        return checkOtherGame(requestAmount);
    }
}
