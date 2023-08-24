import java.util.Scanner;

public class SumEvenMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers (enter a single number to stop):");

        while (true) {
            number = input.nextInt();

            // Check if the entered number is a single number
            if (input.hasNextInt()) {
                break;
            }

            // Check if the number is even and a multiple of 4
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number; // Add the number to the sum
            }
        }

        System.out.println("Sum of even numbers and multiples of 4: " + sum);

        input.close();
    }
}