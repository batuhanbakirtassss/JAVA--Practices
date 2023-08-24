import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows in the matrix from the user
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        // Get the number of columns in the matrix from the user
        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();

        // Create a matrix with the specified dimensions
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a matrix to store the transpose of the original matrix
        int[][] transpose = new int[cols][rows];

        // Calculate the transpose of the matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Display the transpose matrix
        System.out.println("Transpose Matrix:");
        printMatrix(transpose);

        // Close the scanner
        scanner.close();
    }

    // A utility function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "    ");
            }
            System.out.println();
        }
    }
}