import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        printReverseTriangle(rows);
    }

    /**
     * Prints a reverse triangle pattern with a given number of rows.
     *
     * @param rows The number of rows in the reverse triangle
     */
    public static void printReverseTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}