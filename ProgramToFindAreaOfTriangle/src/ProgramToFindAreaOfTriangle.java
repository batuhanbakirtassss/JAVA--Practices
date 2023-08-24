import java.util.Scanner;

public class ProgramToFindAreaOfTriangle {
    public static void main(String[] args) {
        // Define variables to store triangle sides, semiperimeter (u), and area
        double a, b, c, u, area;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the lengths of the triangle sides
        System.out.print("Enter the 1st side: ");
        a = input.nextDouble();
        System.out.print("Enter the 2nd side: ");
        b = input.nextDouble();
        System.out.print("Enter the 3rd side: ");
        c = input.nextDouble();

        // Calculate the semiperimeter (u)
        u = (a + b + c) / 2;

        // Calculate the area of the triangle using Heron's formula
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Display the calculated area of the triangle
        System.out.println("Area of the triangle: " + area);

    }
}
