import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random rand = new Random();
        // Generate a random number between 0 and 100
        int number = rand.nextInt(100);

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        int attemptsLeft = 5;  // Number of attempts allowed
        int selected;  // User's guessed number
        int[] wrongGuesses = new int[5];  // Array to store wrong guesses
        boolean isWin = false;  // Flag to track if user won
        boolean hasInvalidInput = false;  // Flag to track invalid inputs

        System.out.println("Guess a number between 0 and 100.");
        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0 and 100.");
                if (hasInvalidInput) {
                    attemptsLeft--;
                    System.out.println("Too many invalid inputs. Remaining attempts: " + attemptsLeft);
                } else {
                    hasInvalidInput = true;
                    System.out.println("Your attempts will be deducted for further invalid inputs.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! The guessed number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Incorrect guess!");
                if (selected > number) {
                    System.out.println(selected + " is greater than the hidden number.");
                } else {
                    System.out.println(selected + " is less than the hidden number.");
                }

                // Store the wrong guess and update attempts left
                wrongGuesses[5 - attemptsLeft] = selected;
                System.out.println("Remaining attempts: " + attemptsLeft);
                attemptsLeft--;
            }
        }

        if (!isWin) {
            System.out.println("You lost!");
            if (!hasInvalidInput) {
                System.out.println("Your guesses: " + Arrays.toString(wrongGuesses));
            }
        }
    }
}