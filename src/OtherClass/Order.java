package OtherClass;

import Factory.Drink.Drink;
import Factory.Drink.DrinkPizzaStore;
import Factory.Drink.DrinkType;
import Factory.Pizza.*;

import java.util.Scanner;

public class Order {
    Scanner scan = new Scanner(System.in);
    String drinkOrPizza;
    String drink;
    String pizza;
    String item;
    String type;
    String yesOrNo;
    int totalPrice = 0;

    public String DrinkOrPizza(){

        System.out.println("drink or pizza: ");

        drinkOrPizza = scan.nextLine();

        if (drinkOrPizza.equals("drink")){
            System.out.println("Choose a drink: ");
            drink = scan.nextLine();
            item = drink;
        }else if (drinkOrPizza.equals("pizza")){
            System.out.println("veggie or classic or mix: ");
            type = scan.nextLine();

            if (type.equals("mix")){
                System.out.println("Choose the type of pizza\n" + "thin or traditional: ");
                pizza = scan.nextLine();

            } else {
                System.out.println("Choose a pizza: ");
                pizza = scan.nextLine();
            }
            item = pizza;
        }else return null;

        return item;
    }

    public String getItem() { return item; }

    public String getType() { return type; }

    public int getTotalPrice() { return totalPrice; }

    public void Ordering(){
        Boolean next = true;

        PizzaStore vgType = new VeggiePizzaType();
        PizzaStore clType = new ClassicPizzaType();
        PizzaStore mxType = new MixPizzaType();
        DrinkPizzaStore drType = new DrinkType();

        User user = new User();
        user.UserName();


        while (next != false) {
            DrinkOrPizza();

            if (drinkOrPizza.equals("pizza")) {
                if (getType().equals("veggie")) {
                    Pizza pizza = vgType.orderPizza(getItem());
                    System.out.println("\n" + user.getUserName() + " ordered a " + pizza.getName() + "\n");
                    totalPrice += pizza.getPrice();
                    System.out.println("Price: " + pizza.getPrice());
                    System.out.println("Total: " + totalPrice + "\n");

                }else if (getType().equals("classic")) {
                    Pizza pizza = clType.orderPizza(getItem());
                    System.out.println("\n" + user.getUserName() + " ordered a " + pizza.getName() + "\n");
                    totalPrice += pizza.getPrice();
                    System.out.println("Price: " + pizza.getPrice());
                    System.out.println("Total: " + totalPrice + "\n");

                }else if (getType().equals("mix")) {
                    Pizza pizza = mxType.orderPizza(getItem());
                    System.out.println("\n" + user.getUserName() + " ordered a " + pizza.getName() + "\n");
                    totalPrice += pizza.getPrice();
                    System.out.println("Price: " + pizza.getPrice());
                    System.out.println("Total: " + totalPrice + "\n");
                }
            } else if (drinkOrPizza.equals("drink")){
                Drink drink = drType.orderDrink(getItem());
                System.out.println("\n" + user.getUserName() + " ordered a " + drink.getName() + " " + drink.getMl() + "ml\n");
                totalPrice += drink.getPrice();
                System.out.println("Price: " + drink.getPrice());
                System.out.println("Total: " + totalPrice + "\n");
            }

            System.out.println("Continue?\n" + "yes or no: ");
            yesOrNo = scan.nextLine();
            if (yesOrNo.equals("yes")){
                next = true;

            }else if (yesOrNo.equals("no")){
                next = false;
            }
        }

        //Next -> Pay
        Pay pay = new Pay();
        pay.payProcess(getTotalPrice());
    }

}
