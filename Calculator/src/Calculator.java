import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Declare variables to store two numbers and user's choice
        int n1, n2, select;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        // Display available operations
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your choice: ");

        // Read the user's choice
        select = input.nextInt();

        // Perform the selected operation using a switch statement
        switch (select) {
            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Division: " + (n1 / n2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
