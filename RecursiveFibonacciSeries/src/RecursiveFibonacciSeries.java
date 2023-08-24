public class RecursiveFibonacciSeries {

    // Recursive function to calculate Fibonacci number at index n
    static int fibonacci(int n) {
        if (n <= 1) { // Base cases: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
            return n;
        }
        // Recursive case: Calculate Fibonacci by summing two previous Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to generate different terms
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " "); // Generate and print Fibonacci series
        }
    }
}