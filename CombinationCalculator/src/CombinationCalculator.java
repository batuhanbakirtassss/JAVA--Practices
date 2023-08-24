import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of R: ");
        int r = scanner.nextInt();

        // Calculate the factorial of N
        long nFactorial = calculateFactorial(n);

        // Calculate the factorial of R
        long rFactorial = calculateFactorial(r);

        // Calculate the factorial of (N-R)
        long nMinusRFactorial = calculateFactorial(n - r);

        // Calculate the combination C(n, r)
        long combination = nFactorial / (rFactorial * nMinusRFactorial);

        System.out.println("C(" + n + ", " + r + ") = " + combination);

        scanner.close();
    }

    // Method to calculate the factorial of a number
    private static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}