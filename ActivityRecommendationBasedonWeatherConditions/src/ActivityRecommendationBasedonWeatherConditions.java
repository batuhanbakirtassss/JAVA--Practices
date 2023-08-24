import java.util.Scanner;

public class ActivityRecommendationBasedonWeatherConditions {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        heat = input.nextInt();

        // If temperature is less than 5, recommend skiing
        if (heat < 5) {
            System.out.print("It's very cold, you can go skiing.");
        }
        // If temperature is between 5 and 15 (inclusive), recommend going to the cinema
        else if (heat >= 5 && heat <= 15) {
            System.out.print("It's warm, you can go to the cinema.");
        }
        // If temperature is between 16 and 25 (inclusive), recommend going on a picnic
        else if (heat >= 16 && heat <= 25) {
            System.out.print("It's nice outside, you can go on a picnic.");
        }
        // If temperature is greater than 25, recommend swimming
        else {
            System.out.print("It's hot, you can go swimming.");
        }
    }
}