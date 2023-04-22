package ovning4;

import java.util.Scanner;

public class Kvadraten {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Skriv in ett heltal: ");

        // Read the integer entered by the user and store it in a variable named 'tal'
        int tal = scanner.nextInt();

        // Calculate the square of the integer entered by the user and store it in a variable named 'kvadraten'
        int kvadraten = tal * tal;

        // Print the result to the console
        System.out.println("Kvadraten av " + tal + " är " + kvadraten + ".");
    }
}
