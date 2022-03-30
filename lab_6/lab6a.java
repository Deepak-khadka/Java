package lab_6;

public class lab6a {

    public static void main(String[] args) {

       // Create an array to hold 5 license plate number
        String [] licensePlateList = {"ABC 12D", "123 4AB", "0A B1234", "ABC-1234", "12AB3"};

      // Display the entire license plate number using for loop
        for (String license : licensePlateList) {
            System.out.println(license);
        }

        separate separate = new separate();

        String response = null;

        // Create find1 method and pass array as an argument
        response = separate.find1(licensePlateList);

        // Display the result
        System.out.println(response);

    }
}
