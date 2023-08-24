import java.util.Scanner;

public class AdvancedCalculator {

    // Method to perform addition
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
        return result;
    }

    // Method to perform subtraction
    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
        return result;
    }

    // Method to perform multiplication
    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
        return result;
    }

    // Method to calculate power of a number
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    // Method to perform division
    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Second number must be different than 0");
            return 0;
        }
        int result = a / b;
        System.out.println("Division: " + result);
        return result;
    }

    // Method to calculate remainder (modulus)
    static int mod(int a, int b) {
        return a % b;
    }

    // Method to calculate area and perimeter of a rectangle
    static void rectangle(int a, int b) {
        System.out.println("Perimeter: " + (2 * (a + b)));
        System.out.println("Area: " + (a * b));
    }

    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu =
                "1- Addition Operation\n"
                        + "2- Subtraction Operation\n"
                        + "3- Multiplication Operation\n"
                        + "4- Division Operation\n"
                        + "5- Exponential Calculation Operation\n"
                        + "6- Modulus Operation\n"
                        + "7- Rectangle Area and Perimeter Calculation Operation\n"
                        + "0- Exit\n";

        while (true) {
            System.out.println(menu);
            System.out.print("Select an Operation: ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("First Number: ");
            int a = scan.nextInt();
            System.out.print("Second Number: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Exponential Calculation: " + power(a, b));
                    break;
                case 6:
                    System.out.println("Modulus Operation: " + mod(a, b));
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("You entered an invalid operation.");
            }
        }
        System.out.println("Goodbye!");
    }
}