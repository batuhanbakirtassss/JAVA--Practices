import java.util.Scanner;

public class AirlineTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        int distance = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the travel type (1 => One-way, 2 => Round-trip): ");
        int travelType = scanner.nextInt();

        double unitPrice = 0.10;
        double totalPrice = distance * unitPrice;

        // Check if the entered values are valid
        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Invalid Data Entry!");
        } else {
            // Apply discounts based on age and travel type
            if (age < 12) {
                totalPrice -= totalPrice * 0.50; // 50% discount
            } else if (age >= 12 && age <= 24) {
                totalPrice -= totalPrice * 0.10; // 10% discount
            } else if (age >= 65) {
                totalPrice -= totalPrice * 0.30; // 30% discount
            }

            if (travelType == 2) {
                totalPrice -= totalPrice * 0.20; // 20% discount
            }

            System.out.println("Total Price = " + totalPrice + " $");
        }

        scanner.close();
    }
}