import java.util.Scanner;

public class FibonacciSeriesFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int elementCount = scanner.nextInt();

        int[] fibonacci = new int[elementCount];
        fibonacci[0] = 0; // First element of Fibonacci series is 0
        fibonacci[1] = 1; // Second element of Fibonacci series is 1

        for (int i = 2; i < elementCount; i++) {
            // Calculate the next element by summing up the previous two elements
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci Series with " + elementCount + " elements:");
        for (int i = 0; i < elementCount; i++) {
            // Print each element of the Fibonacci series
            System.out.print(fibonacci[i] + " ");
        }
    }
}