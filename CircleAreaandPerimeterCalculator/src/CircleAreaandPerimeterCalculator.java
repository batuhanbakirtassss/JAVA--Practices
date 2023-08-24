import java.util.Scanner;

public class CircleAreaandPerimeterCalculator {
    public static void main(String[] args) {
        // Declare variables to store radius, pi, area, and perimeter
        int r;
        double pi = 3.14;

        // Create a Scanner object for user input
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        r = inp.nextInt();

        // Calculate the area and perimeter of the circle
        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        // Display the calculated area and perimeter
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

        // Prompt the user to enter the measure of the central angle
        System.out.println("Enter the measure of the central angle: ");
        double angle = inp.nextDouble();

        // Calculate the area of the circle segment
        double segmentArea = (pi * r * r * angle) / 360;

        // Display the calculated area of the circle segment
        System.out.println("Area of the circle segment: " + segmentArea);
    }
}
