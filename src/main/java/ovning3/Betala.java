package ovning3;

import java.util.Scanner;

public class Betala {
    public static void main(String[] args) {

        // Creating an instance of Scanner class to read input from user
        Scanner input = new Scanner(System.in);

        // Initializing variables to hold sum and discount
        float sum = 0.0f;
        float rabatt = 0.0f;

        // Loop to read the sum until a positive value is entered
        while (sum <= 0.0f) {
            System.out.print("Skriv in köpesumma: ");
            sum = input.nextFloat();
        }

        // Reading the discount percentage from user
        System.out.print("Skriv in rabattprocenten: ");
        rabatt = input.nextFloat();

        // Applying discount if the sum is greater than or equal to 500
        if (sum >= 500) {
            sum = sum * (1.0f - (rabatt / 100.0f));
        }

        // Printing the total amount to be paid
        System.out.println("Summa att betala: " + sum);
    }
}