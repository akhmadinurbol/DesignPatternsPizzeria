package Decarator;

public class TomatoDecorator  extends CondimentDecorator {

    private final UnknownPizza piz;

    public TomatoDecorator(UnknownPizza piz) {
        this.piz = piz;
    }

    @Override
    public int cost() {
        return 250 + piz.cost();
    }

    @Override
    public String getDescription() {
        return piz.getDescription() + " Tomato";
    }
}
