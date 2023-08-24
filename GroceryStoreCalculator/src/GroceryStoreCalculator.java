import java.util.Scanner;

public class GroceryStoreCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prices per kilogram of fruits and vegetables
        double appleKgPrice = 2.14;
        double bananaKgPrice = 3.67;
        double tomatoKgPrice = 1.11;
        double orangeKgPrice = 0.95;
        double eggplantKgPrice = 5.00;


        // Getting the amount of fruits and vegetables from the user
        System.out.print("How many kilograms of apples do you want? : ");
        double appleKg = input.nextDouble();

        System.out.print("How many kilograms of bananas do you want? : ");
        double bananaKg = input.nextDouble();

        System.out.print("How many kilograms of tomatoes do you want? : ");
        double tomatoKg = input.nextDouble();

        System.out.print("How many kilograms of oranges do you want? : ");
        double orangeKg = input.nextDouble();

        System.out.print("How many kilograms of eggplants do you want? : ");
        double eggplantKg = input.nextDouble();

        // Calculating the total price of the purchase
        double totalPrice = appleKg * appleKgPrice +
                bananaKg * bananaKgPrice +
                tomatoKg * tomatoKgPrice +
                orangeKg * orangeKgPrice +
                eggplantKg * eggplantKgPrice;

        // Printing the total price of the purchase
        System.out.println("Total Price : " + totalPrice + " $");
    }
}