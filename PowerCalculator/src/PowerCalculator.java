import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Powers of 4 and 5 up to " + number + ":");

        // Print powers of 4
        System.out.println("Powers of 4:");
        for (int i = 0; i <= number; i++) {
            int powerOf4 = (int) Math.pow(4, i);
            System.out.println(powerOf4);
        }

        // Print powers of 5
        System.out.println("Powers of 5:");
        for (int i = 0; i <= number; i++) {
            int powerOf5 = (int) Math.pow(5, i);
            System.out.println(powerOf5);
        }

        scanner.close();
    }
}