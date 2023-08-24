public class HarmonicMeanCalculator {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};

        // Initialize a variable to store the harmonic sum
        double harmonicSum = 0.0;

        // Calculate the harmonic sum by iterating through the array
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        // Calculate the harmonic mean using the formula
        double harmonicMean = numbers.length / harmonicSum;

        // Print the calculated harmonic mean
        System.out.println("Harmonic Mean: " + harmonicMean);
    }
}