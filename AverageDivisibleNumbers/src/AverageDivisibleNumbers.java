import java.util.Scanner;

public class AverageDivisibleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0; // Variable to store the sum of divisible numbers
        int count = 0; // Variable to keep track of the count of divisible numbers

        // Loop through the numbers from 0 to the given number
        for (int i = 0; i <= number; i++) {
            // Check if the number is divisible by both 3 and 4
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; // Add the number to the sum
                count++; // Increment the count
            }
        }

        if (count == 0) {
            System.out.println("No numbers divisible by 3 and 4 found.");
        } else {
            double average = (double) sum / count; // Calculate the average
            System.out.println("Average of numbers divisible by 3 and 4: " + average);
        }

        input.close();
    }
}