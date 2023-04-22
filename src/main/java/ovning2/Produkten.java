package ovning2;

import java.util.Scanner;

public class Produkten {
    public static void main(String[] args) {
        // Declare variables to store user input and calculated results
        int tal1, tal2, tal3, produkten, storst;

        // Create a new Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Ange ett värde för första talet: ");
        tal1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Ange ett värde för andra talet: ");
        tal2 = input.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Ange ett värde för tredje talet: ");
        tal3 = input.nextInt();

        // Calculate the product of the three numbers
        produkten = tal1*tal2*tal3;

        // Determine the largest number
        if (tal1 > tal2 && tal1 > tal3) {
            storst = tal1;
        } else if (tal2 > tal1 && tal2 > tal3) {
            storst = tal2;
        } else {
            storst = tal3;
        }

        // Print the product and largest number to the console
        System.out.println("Produkten blev " + produkten + " och största talet är " + storst);
    }
}

