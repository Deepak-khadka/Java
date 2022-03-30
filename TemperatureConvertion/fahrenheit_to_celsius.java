//Lab-1
//Sabina Rana Magar

package TemperatureConvertion;

import javax.swing.*;
import java.util.Scanner;

public class fahrenheit_to_celsius {

    private static final double FAHRENHEIT = .5556;

    JFrame frame;

    fahrenheit_to_celsius() {
        frame = new JFrame();

        Scanner myObj = new Scanner(System.in);

        String name = JOptionPane.showInputDialog(frame, "Enter City Name");

        System.out.println("Enter the temperature in Fahrenheit : ");
        int temperature = myObj.nextInt();

        double celsius = (temperature - 32) * FAHRENHEIT;

        double roundOff = Math.floor(celsius);

        System.out.println("The temperature in " + name.toUpperCase() + " today is " + temperature + " degree Fahrenheit and" + roundOff + " degree Celsius");

        if (roundOff <= 0) {
            JOptionPane.showMessageDialog(null,"Temperature is Below Freezing Point");
        }
        else if (roundOff > 100) {
            JOptionPane.showMessageDialog(null,"Temperature is at Above Boiling Point");
        }
        else {
            JOptionPane.showMessageDialog(null,"Temperature is at AT");
        }
    }

    public static void main(String[] args) {
        new fahrenheit_to_celsius();
        System.out.println();
    }
}
