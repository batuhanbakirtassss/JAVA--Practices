import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        // Read the numbers and find the maximum and minimum
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            // Check if the number is greater than the current maximum
            if (number > maxNumber) {
                maxNumber = number;
            }

            // Check if the number is smaller than the current minimum
            if (number < minNumber) {
                minNumber = number;
            }
        }

        // Print the maximum and minimum numbers
        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Minimum number: " + minNumber);

        scanner.close();
    }
}