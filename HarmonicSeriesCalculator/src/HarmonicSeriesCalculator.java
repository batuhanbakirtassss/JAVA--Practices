import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        double harmonicSum = 0;

        // Calculate the harmonic series
        for (int i = 1; i <= number; i++) {
            harmonicSum += 1.0 / i;
        }

        // Print the result
        System.out.println("Harmonic series sum of " + number + " = " + harmonicSum);
    }
}