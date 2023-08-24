import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        // Declare variables to store height, weight, and BMI
        double height, weight, bmi;

        // Create a Scanner object for user input
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter their height in meters
        System.out.print("Please enter your height (in meters): ");
        height = inp.nextDouble();

        // Prompt the user to enter their weight
        System.out.print("Please enter your weight: ");
        weight = inp.nextDouble();

        // Calculate the Body Mass Index (BMI)
        bmi = weight / (height * height);

        // Display the calculated BMI
        System.out.println("Your Body Mass Index (BMI): " + bmi);
    }
}
