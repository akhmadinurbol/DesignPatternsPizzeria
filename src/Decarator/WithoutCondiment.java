package Decarator;

public class WithoutCondiment extends CondimentDecorator{

    private final UnknownPizza piz;

    public WithoutCondiment(UnknownPizza piz) {
        this.piz = piz;
    }

    @Override
    public int cost() {
        return piz.cost();
    }

    @Override
    public String getDescription() {
        return piz.getDescription() + "out condiment";
    }

}
