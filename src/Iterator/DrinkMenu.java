package Iterator;

public class DrinkMenu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DrinkMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("coca-cola",
			"draught cola",
			400,
			500
		);

		addItem("herbal tea",
			"served with milk or lemon",
			300,
			600
		);

		addItem("fruit juice",
			"orange, tomato, pineapple",
			450,
			800
		);

		addItem("asu",
			"filtered water",
			500,
			250
		);

		addItem("margarita",
			"a tangy citrus blend of tequila, lime and a dash of orange",
			450,
			1000
		);

		addItem("hot chocolate",
			"made with steamed milk and whipped cream, finished with flakes of chocolate",
			350,
			440
		);
	}

	public void addItem(String name, String description, int ml, int price) {
		MenuItem menuItem = new MenuItem(name, description, ml, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new DrinkMenuIterator(menuItems);
	}

}
