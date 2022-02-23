package Factory.Pizza;

import Decarator.MixPizzaOrder;

public class MixStyleThinPizza extends Pizza{

    public MixStyleThinPizza() {
        //Mix pizza -> thin
        MixPizzaOrder mixPizzaOrder = new MixPizzaOrder();
        mixPizzaOrder.MixThin();

        name = mixPizzaOrder.getPizzaCondiment();
        dough = "Extra Thin Crust Dough";
        sauce = "Pizza Sauce";

        price = mixPizzaOrder.getMixPizzaPrice();

        //toppings.add(mixPizza.getPizzaCondiment());
    }

}
