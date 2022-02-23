package Iterator;

public class Waitress {

	PizzaMenu pizzaMenu;
	DrinkMenu drinkMenu;

	public Waitress(PizzaMenu pizzaMenu, DrinkMenu drinkMenu) {
		this.pizzaMenu = pizzaMenu;
		this.drinkMenu = drinkMenu;
	}

	public void printMenu() {
		Iterator pizzaIterator = pizzaMenu.createIterator();
		Iterator drinkIterator = drinkMenu.createIterator();

		System.out.println
				("MENU\n------------------------------------------------------------------------------------------------\nPIZZA:");
		printPizzaMenu(pizzaIterator);
		System.out.println
				("------------------------------------------------------------------------------------------------\n\nDRINKS:");
		printDrinkMenu(drinkIterator);

		System.out.println
				("------------------------------------------------------------------------------------------------\n");

	}

	private void printPizzaMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName());

			System.out.print("\n" + menuItem.getPrice()+"tg" + " -- ");
			System.out.println(menuItem.getDescription());

			if (menuItem.getName().equals("mix")){
				System.out.println("Mix pizza\n");
			}else if (menuItem.getVegetarian() == true){
				System.out.println("Vegetarian pizza\n");
			} else System.out.println("Non-vegetarian pizza\n");

		}
	}

	private void printDrinkMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getMl()+"ml");

			System.out.print("\n" + menuItem.getPrice()+"tg" + " -- ");
			System.out.println(menuItem.getDescription() + "\n");
		}
	}

}
