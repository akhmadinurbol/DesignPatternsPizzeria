package Decarator;

public class ThinPizza extends UnknownPizza {

    public ThinPizza() {
        this.description = "Thin Pizza with";
    }

    @Override
    public int cost() {
        return 1000;
    }
}