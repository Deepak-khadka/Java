package lab_7;

import java.util.Scanner;

public class AnnualSalesReport {

    public static void main(String[] args) {

        /* Creating multiple array as annual_sales and annual_years which are also known as parallel array */
        int [] annual_sales = {503000, 813000, 856000, 659000, 525000};
        int [] annual_years = {2021, 2020, 2019, 2018, 2017};

        /*
        * Calculate the total sales form the given array
        * Call the method as calculate_total_sales with array of annual_sales
        * and receive the total calculated sales amount
        */

        int result = calculateTotalSales(annual_sales);

        /* Display the total sales from all array */
        System.out.println("Total Sales from " + annual_years[0] + " - " + annual_years[annual_years.length - 1] + " is " + result);

        /* Display all the annual years */
        for (int year : annual_years) {
            System.out.println(year);
        }

        Scanner sc = new Scanner(System.in);

        /* Ask the user to enter the year*/
        System.out.println("Enter the annual year : ");
        int searchedYear = sc.nextInt();

        /* Get the corresponding annual sales from the user searched annual year */
        int result_index = SearchAnnualYear(annual_years, searchedYear);
        if(result_index > 0) {
            System.out.println("Annual sales is " + annual_sales[result_index]);
        }
        else {
            System.out.println("Please enter correct annual year between "+ annual_years[0] + " - " + annual_years[annual_years.length - 1] );
        }

    }

    static int calculateTotalSales(int[] annualSales) {
        /* Assign the total sales as 0 */
        int totalSales = 0;

        for (int sale : annualSales) {
           totalSales += sale;
        }
        return totalSales;
    }

    static int SearchAnnualYear(int[] annualYears, int searchedYear) {
        int index = -1;

        for (int i = 0; i < annualYears.length; i++) {
            if(annualYears[i] == searchedYear) {
                index = i;
            }
        }

        return index;
    }
}
