import java.util.Scanner;

public class PrimeNumberRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Read an integer from the user
        int num = scanner.nextInt();

        // Check if the entered number is prime using the isPrime function
        if (isPrime(num, num / 2)) {
            System.out.println(num + " is a PRIME number!");
        } else {
            System.out.println(num + " is NOT a prime number!");
        }
    }

    // Recursive function to check if a number is prime
    public static boolean isPrime(int num, int i) {
        // Base case: if i becomes 1, the number is prime
        if (i == 1) {
            return true;
        } else {
            // If the number is divisible evenly by i, it's not prime
            if (num % i == 0) {
                return false;
            } else {
                // Otherwise, continue checking with a smaller i
                return isPrime(num, i - 1);
            }
        }
    }
}