package ovning5;

// Importing Scanner class to read user input from console
import java.util.Scanner;

public class Omvandlare {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declaring a variable to store exchange rate
        double dagskurs;

        // Asking user if they want to enter a new exchange rate
        System.out.print("Ange ny dagskurs? (J/N): ");

        // Reading user's response
        String svar = scanner.nextLine();

        // Checking if user wants to enter a new exchange rate
        if (svar.equalsIgnoreCase("J")) {
            // Asking user to enter the exchange rate
            System.out.print("Mata in aktuell kurs (SEK/EUR): ");

            // Reading exchange rate from user input and converting it to a double
            dagskurs = Double.parseDouble(scanner.nextLine());
        } else {
            // Setting default exchange rate to 10 if user doesn't want to enter a new exchange rate
            dagskurs = 10;
        }

        // Declaring a variable to store the price in SEK
        double pris;

        // Asking user to enter the price in SEK
        System.out.print("Pris i SEK: ");

        // Reading price in SEK from user input and storing it in the pris variable
        pris = scanner.nextDouble();

        // Calculating price in euros using exchange rate and the price in SEK
        double euro = pris / dagskurs;

        // Displaying the converted price in euros to the user
        System.out.println(euro + " EUR");
    }
}