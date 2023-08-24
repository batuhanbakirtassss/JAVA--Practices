import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of steps: ");
        int steps = scanner.nextInt();

        int starCount = steps * 2 - 1; // Number of stars (*) to be printed in the first row

        // Loop for each row
        for (int i = 0; i < steps; i++) {
            // Printing the spaces at the beginning of the row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Printing the stars
            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }

            starCount -= 2; // Decreasing the number of stars for each row

            System.out.println(); // Moving to a new line after each row
        }

        scanner.close();
    }
}