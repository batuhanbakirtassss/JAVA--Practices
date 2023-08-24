import java.util.Scanner;

public class RecursivePowerCalculation {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the base value
        System.out.print("Enter the base value: ");
        int base = scanner.nextInt();

        // Ask the user to enter the exponent value
        System.out.print("Enter the exponent value: ");
        int exponent = scanner.nextInt();

        // Calculate the power using the recursive method
        int result = calculatePower(base, exponent);

        // Display the result
        System.out.println("Result: " + result);

        // Close the Scanner
        scanner.close();
    }

    // Recursive method to calculate the power of a base raised to an exponent
    public static int calculatePower(int base, int exponent) {
        // Base case: Any number raised to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        } else {
            // Recursive case: Multiply the base with itself (exponent - 1) times
            return base * calculatePower(base, exponent - 1);
        }
    }
}