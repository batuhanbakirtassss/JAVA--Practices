public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate

        System.out.println("Fibonacci series of " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Function to calculate the nth Fibonacci number
    // Parameter: int n (the position of the Fibonacci number)
    // Returns: int (the Fibonacci number at the given position)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}