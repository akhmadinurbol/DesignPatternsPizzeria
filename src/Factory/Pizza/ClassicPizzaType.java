package Factory.Pizza;

public class ClassicPizzaType extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("pepperoni")) {
			return new ClassicStylePepperoniPizza();
		} else if (item.equals("meat feast by Beksi")) {
			return new ClassicStyleDiabloPizza();
		} else return null;
	}

}
