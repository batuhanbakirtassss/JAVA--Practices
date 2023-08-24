import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of the digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Print the result
        System.out.println("Sum of digits in " + originalNumber + " = " + sum);
    }
}