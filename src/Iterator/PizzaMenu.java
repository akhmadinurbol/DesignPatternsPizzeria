package Iterator;

import java.util.ArrayList;

public class PizzaMenu {

	ArrayList<MenuItem> menuItems;

	public PizzaMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("pepperoni",
			"Pepperoni, pepperoni, and an extra bit of pepperoni",
			false,
			1800
		);

		addItem("meat feast by Diablo",
			"Pepperoni, ham, beef & chicken breast",
			false,
			2000
		);

		addItem("veggie",
			"Fresh spinach, sweetcorn, mixed peppers, red onions & mushrooms",
			true,
			1500
		);

		addItem("margherita",
			"Classic mozzarella cheese & tomato sauce",
			true,
			1700
		);

		addItem("mix",
				"You can choose condiment: pepperoni, mushroom, cheese, tomato",
				true,
				2000
		);
	}

	public void addItem(String name, String description, boolean vegetarian, int price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator createIterator() {
		return new PizzaMenuIterator(menuItems);
	}

}
