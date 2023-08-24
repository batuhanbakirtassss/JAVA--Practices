public class PrimeNumberFinder {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        // Loop through numbers from 2 to 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number from 2 to its square root
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}