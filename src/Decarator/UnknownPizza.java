package Decarator;

public abstract class UnknownPizza {

    protected String description = "Standard Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}