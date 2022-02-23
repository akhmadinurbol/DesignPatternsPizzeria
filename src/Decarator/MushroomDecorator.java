package Decarator;

public class MushroomDecorator extends CondimentDecorator {

    private final UnknownPizza piz;

    public MushroomDecorator(UnknownPizza piz) {
        this.piz = piz;
    }

    @Override
    public int cost() {
        return 200 + piz.cost();
    }

    @Override
    public String getDescription() {
        return piz.getDescription() + " Mushroom";
    }
}