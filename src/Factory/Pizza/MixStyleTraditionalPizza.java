package Factory.Pizza;

import Decarator.MixPizzaOrder;

public class MixStyleTraditionalPizza extends Pizza{

    public MixStyleTraditionalPizza() {
        //Mix pizza -> traditional
        MixPizzaOrder mixPizzaOrder = new MixPizzaOrder();
        mixPizzaOrder.MixTraditional();

        name = mixPizzaOrder.getPizzaCondiment();
        dough = "Extra Thick Crust Dough";
        sauce = "Pizza Sauce";

        price = mixPizzaOrder.getMixPizzaPrice();

        //toppings.add(mixPizza.getPizzaCondiment());
    }

}
