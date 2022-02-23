package Factory.Drink;

public class DrinkType extends DrinkPizzaStore {

    protected Drink createDrink(String item) {
        if (item.equals("coca-cola")) {
            return new ColaDrink();
        } else if (item.equals("herbal tea")) {
            return new TeaDrink();
        } else if (item.equals("fruit juice")) {
			return new JuiceDrink();
		} else if (item.equals("asu")) {
			return new AsuDrink();
        } else if (item.equals("margarita")) {
			return new MargaritaDrink();
        } else if (item.equals("hot chocolate")) {
			return new HotChocolateDrink();
        } else return null;
    }

}
