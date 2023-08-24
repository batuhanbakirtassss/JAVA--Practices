import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        String zodiacSign = calculateChineseZodiac(birthYear);

        System.out.println("Your Chinese Zodiac sign is: " + zodiacSign);
    }

    /**
     * Calculates the Chinese Zodiac sign based on the birth year.
     * @param birthYear the year of birth
     * @return the Chinese Zodiac sign
     */
    public static String calculateChineseZodiac(int birthYear) {
        // Array of Chinese Zodiac signs
        String[] zodiacSigns = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        // Calculate the index of the Zodiac sign based on the birth year
        int zodiacIndex = birthYear % 12;

        // Return the corresponding Zodiac sign
        return zodiacSigns[zodiacIndex];
    }
}