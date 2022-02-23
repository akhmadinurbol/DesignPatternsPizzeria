package Decarator;

public class PepperoniDecorator extends CondimentDecorator {

    private final UnknownPizza piz;

    public PepperoniDecorator(UnknownPizza piz) {
        this.piz = piz;
    }

    @Override
    public int cost() {
        return 300 + piz.cost();
    }

    @Override
    public String getDescription() {
        return piz.getDescription() + " Pepperoni";
    }
}