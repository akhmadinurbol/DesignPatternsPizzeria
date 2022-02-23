package OtherClass;

import Iterator.DrinkMenu;
import Iterator.PizzaMenu;
import Iterator.Waitress;

public class ShowAllMenu {

    //Showing menu
    public void Menu(){

        PizzaMenu pizzaMenu = new PizzaMenu();
        DrinkMenu drinkMenu = new DrinkMenu();

        Waitress waitress = new Waitress(pizzaMenu, drinkMenu);

        waitress.printMenu();

    }

}
