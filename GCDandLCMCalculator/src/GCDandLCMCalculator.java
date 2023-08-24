import java.util.Scanner;

public class GCDandLCMCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Find the greatest common divisor (EBOB)
        int gcd = 1;
        int divisor = 2;
        while (divisor <= number1 && divisor <= number2) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }

        // Find the least common multiple (EKOK)
        int lcm = (number1 * number2) / gcd;

        System.out.println("Greatest Common Divisor (EBOB): " + gcd);
        System.out.println("Least Common Multiple (EKOK): " + lcm);
    }
}