package Factory.Pizza;

public class VeggieStyleMargheritaPizza extends Pizza {

	public VeggieStyleMargheritaPizza() {
		name = "Margherita Pizza";
		dough = "Thin Crust Dough";
		sauce = "Tomato Sauce";

		toppings.add("Grated Classic mozzarella cheese");
		price = 1700;
	}
}
