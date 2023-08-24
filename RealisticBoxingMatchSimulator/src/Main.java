public class Main {
    public static void main(String[] args) {
        // Create two Fighter instances
        Fighter f1 = new Fighter("Batuhan", 10, 120, 100, 30);
        Fighter f2 = new Fighter("Berat", 20, 85, 85, 40);

        // Initialize a Competition with weight restrictions
        Competition competition = new Competition(f1, f2, 85, 100);

        // Decide who attacks first
        competition.decideFirstAttacker();

        // Run the competition simulation
        competition.run();
    }
}