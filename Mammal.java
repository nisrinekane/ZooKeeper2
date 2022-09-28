public class Mammal {
    private int energy = 0;
    static final int DEFAULT_ENERGY = 100;

    //constructor
    public Mammal(int energy) {
        this.energy = energy;
    }

    // energy getter
    public int getEnergy() {
        return energy;
    }

    //increase energy
    public void increaseEnergy(int amount) {
        this.energy += amount;
    }

    //decrease energy
    public void decreaseEnergy(int amount) {
        this.energy = energy - amount;
    }
    //display energy
    public int displayEnergy() {
        return this.energy;
    }



}
