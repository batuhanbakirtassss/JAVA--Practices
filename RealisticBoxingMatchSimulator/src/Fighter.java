class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        // Ensure dodge is within valid range [0, 100]
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    // Method to calculate the result of a hit on an opponent
    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " damage dealt.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " blocked the incoming damage!");
            System.out.println("----------");
            return foe.health;
        }

        // Check if the opponent's health goes below zero
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    // Method to check if a dodge attempt is successful
    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}