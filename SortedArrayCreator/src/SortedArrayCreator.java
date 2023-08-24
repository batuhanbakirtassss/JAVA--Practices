import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array n: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Ask the user to input the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sort the array in ascending order using Arrays.sort() method
        Arrays.sort(arr);

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}