import java.util.HashMap;
import java.util.Map;

public class DuplicateEvenFinder {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 2, 6, 10, 12, 4, 14, 16, 18, 20, 12};

        // Create a HashMap to store even numbers and their frequencies
        Map<Integer, Integer> evenFrequencyMap = new HashMap<>();

        // Iterate through the numbers array to find even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {  // Check if the number is even
                // Update the frequency map for the even number
                if (evenFrequencyMap.containsKey(num)) {
                    evenFrequencyMap.put(num, evenFrequencyMap.get(num) + 1);
                } else {
                    evenFrequencyMap.put(num, 1);
                }
            }
        }

        // Print the duplicate even numbers and their frequencies
        System.out.println("Duplicate Even Numbers:");
        for (Map.Entry<Integer, Integer> entry : evenFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {  // Check if the even number is duplicated
                System.out.println(entry.getKey() + " (Frequency: " + entry.getValue() + ")");
            }
        }
    }
}