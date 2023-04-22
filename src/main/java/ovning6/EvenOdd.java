package ovning6;

public class EvenOdd {

    public static void main(String[] args) {
        int sum = 0; // initialize a variable for the sum of even numbers
        // For loop to iterate over numbers 0 through 30
        for (int i = 0; i <= 30; i++) {
            // Check if the number is even using the isEven method
            if (isEven(i)) {
                // If the number is even, print a message with the number and "är jämnt!"
                System.out.println(i + " är jämnt!");
                sum += i; // add the even number to the sum
            }
        }
        // Print the sum of even numbers
        System.out.println("Summan av alla jämna tal mellan 0 och 30 är: " + sum);
    }

    // Method to check if a number is even
    public static boolean isEven(int value) {
        // Return true if the number is even (remainder of division by 2 is 0), false otherwise
        return (value % 2) == 0;
    }
}