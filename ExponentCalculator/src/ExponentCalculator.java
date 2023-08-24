import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the base number from the user
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        // Get the exponent from the user
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;

        // Calculate the exponential value using a for loop
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }
}