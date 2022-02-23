package Factory.Pizza;

public class ClassicStylePepperoniPizza extends Pizza {

	public ClassicStylePepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Tomato Sauce";

		toppings.add("Pepperoni");
		price = 1800;
	}

}
