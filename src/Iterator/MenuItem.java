package Iterator;

public class MenuItem {

	String name;
	String description;
	boolean vegetarian;
	int ml;
	int price;

	//Pizza
	public MenuItem(String name, String description, boolean vegetarian, int price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	//Drink
	public MenuItem(String name, String description, int ml, int price) {
		this.name = name;
		this.description = description;
		this.ml = ml;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean getVegetarian() {
		return vegetarian;
	}

	public int getMl(){
		return ml;
	}

	public int getPrice() {
		return price;
	}

}
