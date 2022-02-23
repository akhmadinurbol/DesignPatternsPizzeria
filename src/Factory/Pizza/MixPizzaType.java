package Factory.Pizza;

public class MixPizzaType extends PizzaStore{

    protected Pizza createPizza(String item) {
        if (item.equals("thin")) {
            return new MixStyleThinPizza();
        } else if (item.equals("traditional")) {
            return new MixStyleTraditionalPizza();
        } else return null;
    }


}
