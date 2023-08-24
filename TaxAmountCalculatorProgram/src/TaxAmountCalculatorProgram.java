import java.util.Scanner;

public class TaxAmountCalculatorProgram {
    public static void main(String[] args) {
        // Declare variables to store input values and calculated amounts
        double amount, taxRate, taxAmount, totalAmount;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the amount
        System.out.println("Enter the Amount : ");

        // Read the amount from user input
        amount = input.nextDouble();

        // Determine the tax rate based on the entered amount
        // If amount is between 0 (exclusive) and 1000 (inclusive), tax rate is 0.18; otherwise, it's 0.08
        taxRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;

        // Calculate the tax amount using the tax rate
        taxAmount = amount * taxRate;

        // Calculate the total amount including tax
        totalAmount = amount + taxAmount;

        // Display the results
        System.out.println("Amount Without Tax : " + amount);
        System.out.println("Tax Rate : " + taxRate);
        System.out.println("Tax Amount : " + taxAmount);
        System.out.println("Total Amount : " + totalAmount);

    }
}
