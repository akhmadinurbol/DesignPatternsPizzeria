package Decarator;

public class TraditionalPizza extends UnknownPizza {

    public TraditionalPizza() {
        this.description = "Traditional Pizza with";
    }

    @Override
    public int cost() {
        return 1100;
    }
}