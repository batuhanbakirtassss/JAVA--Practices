public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function: Checks if a number is prime
    // Parameter: int number
    // Returns: boolean, true if the number is prime, false otherwise
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}