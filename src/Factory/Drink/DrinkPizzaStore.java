package Factory.Drink;

public abstract class DrinkPizzaStore {
    public Drink orderDrink(String type) {
        Drink drink;

        drink = createDrink(type);

        drink.prepare();

        return drink;
    }

    abstract Drink createDrink(String type);
}
