package Factory.Pizza;

public class VeggiePizzaType extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("margherita")) {
			return new VeggieStyleMargheritaPizza();
		} else if (item.equals("veggie")) {
			return new VeggieStyleVeggiePizza();
		} else return null;
	}

}
