import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array n: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        // Input the elements of the array from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.print("Sorted array: ");
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Close the Scanner object to prevent resource leak
        input.close();
    }
}