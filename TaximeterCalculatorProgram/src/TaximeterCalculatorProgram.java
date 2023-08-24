import java.util.Scanner;

public class TaximeterCalculatorProgram {
    public static void main(String[] args) {
        // Declare variables to store distance in kilometers, price per kilometer, total amount, and starting price
        int km;
        double perKm = 2.20, total, startPrice = 10;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextInt();

        // Calculate the total fare based on the distance and price per kilometer
        total = (km * perKm);
        total += startPrice;

        // Ensure the total amount is at least 20 (minimum fare)
        total = (total < 20) ? 20 : total;

        // Display the total fare amount
        System.out.println("Total amount : " + total);
    }
}
