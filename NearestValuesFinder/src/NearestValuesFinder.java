import java.util.Arrays;

public class NearestValuesFinder {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int target = 5;

        int smallerNearest = Integer.MIN_VALUE; // Initialize with the smallest possible value
        int largerNearest = Integer.MAX_VALUE;  // Initialize with the largest possible value

        // Loop through the array elements
        for (int i : list) {
            // Find the nearest smaller value than the target
            if (i < target && i > smallerNearest) {
                smallerNearest = i;
            }
            // Find the nearest larger value than the target
            if (i > target && i < largerNearest) {
                largerNearest = i;
            }
        }

        // Print the array and target value
        System.out.println("Array : " + Arrays.toString(list));
        System.out.println("Target Value : " + target);
        // Print the nearest values found
        System.out.println("Nearest value smaller than the target : " + smallerNearest);
        System.out.println("Nearest value larger than the target : " + largerNearest);
    }
}