class Competition {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Competition(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Method to decide who attacks first with a 50% chance
    void decideFirstAttacker() {
        java.util.Random random = new java.util.Random();
        boolean f1Starts = random.nextBoolean();

        if (f1Starts) {
            System.out.println(f1.name + " starts with the first attack!");
        } else {
            System.out.println(f2.name + " starts with the first attack!");
            Fighter temp = f1;
            f1 = f2;
            f2 = temp;
        }
    }

    // Method to run the competition simulation
    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=====NEW ROUND=====");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Health: " + this.f1.health);
                System.out.println(this.f2.name + " Health: " + this.f2.health);
            }
        } else {
            System.out.println("Fighters' weights do not match the requirements.");
        }
    }

    // Method to check if the fighters' weights are within the allowed range
    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    // Method to determine the winner based on health
    boolean isWin() {
        if (this.f1.health <= 0) {
            System.out.println(this.f2.name + " wins!");
            return true;
        }

        if (this.f2.health <= 0) {
            System.out.println(this.f1.name + " wins!");
            return true;
        }
        return false;
    }
}