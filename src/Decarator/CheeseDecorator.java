package Decarator;

public class CheeseDecorator  extends CondimentDecorator {

    private final UnknownPizza piz;

    public CheeseDecorator(UnknownPizza piz) {
        this.piz = piz;
    }

    @Override
    public int cost() {
        return 150 + piz.cost();
    }

    @Override
    public String getDescription() {
        return piz.getDescription() + " Cheese";
    }
}
