import java.util.Scanner;

public class HoroscopeFinderProgram {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        // Ask the user for their birth month
        System.out.print("Enter your birth month (1-12): ");
        month = input.nextInt();

        // Ask the user for their birth day
        System.out.print("Enter your birth day (1-31): ");
        day = input.nextInt();

        // Use a series of if-else statements to determine the user's horoscope based on their birth month and day
        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.println("Your horoscope is Aries");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.println("Your horoscope is Taurus");
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 21)) {
            System.out.println("Your horoscope is Gemini");
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            System.out.println("Your horoscope is Cancer");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("Your horoscope is Leo");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("Your horoscope is Virgo");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("Your horoscope is Libra");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("Your horoscope is Scorpio");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println("Your horoscope is Sagittarius");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            System.out.println("Your horoscope is Capricorn");
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            System.out.println("Your horoscope is Aquarius");
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.println("Your horoscope is Pisces");
        } else {
            // If the user enters an invalid date, display an error message
            System.out.println("You entered an invalid date.");
        }
    }
}