package lab_6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class separate {

    Scanner scanner = new Scanner(System.in);

    public String find1 (String [] licenseNumbers) {

        /* Ask the user to search the license*/
        System.out.println("Enter a license number to search for ");

        /* Read the input */
        String license = scanner.nextLine();

        // Check the search license if contains in array
         boolean test = Arrays.asList(licenseNumbers).contains(license);

         if(test) {
             return "Found";
         }

        return "Not Found";
    }

    public String find2(String [] licenseNumbers) {
        String result = "Not Found";

        /* Ask the user to search the license*/
        System.out.println("Enter a license number to search for : ");

        /* Read the input */
        String searchedLicense = scanner.nextLine();

        for (String element : licenseNumbers) {
            if (Objects.equals(element, searchedLicense)) {
                result = "Found";
                break;
            }
        }

        return result;
    }
}
