public class Gorilla extends Mammal{
    public Gorilla() {
        super(DEFAULT_ENERGY);
    }

    //throw something
    public String throwSomething() {
        this.decreaseEnergy(5);
        return "Gorilla has thrown something. energy decreased by 5";
    }

    // eat bananas
    public String eatBananas() {
        this.increaseEnergy(10);
        return "the gorilla has eaten the bananas. energy increase by 10";
    }
    //climb
    public String climb() {
        this.decreaseEnergy(10);
        return "the gorilla has climbed the tree. energy decreased by 10 seconds";
    }
}
