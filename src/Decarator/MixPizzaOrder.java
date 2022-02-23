package Decarator;

import java.util.Scanner;

public class MixPizzaOrder {
    Scanner scan = new Scanner(System.in);
    String pizzaCondiment;
    String condiment;
    int mixPizzaPrice;

    public void MixThin(){

        System.out.println("Would you like some pepperoni ?\n" + "yes or no");
        condiment = scan.nextLine();

        System.out.println("Would you like some mushroom ?\n" + "yes or no");
        condiment += scan.nextLine();

        System.out.println("Would you like some cheese ?\n" + "yes or no");
        condiment += scan.nextLine();

        System.out.println("Would you like some tomato ?\n" + "yes or no");
        condiment += scan.nextLine();


        switch(condiment) {
            //One
            case "yesnonono":
                final UnknownPizza ThinPizzaWithPepperoni = (new PepperoniDecorator(new ThinPizza()));
                pizzaCondiment = ThinPizzaWithPepperoni.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoni.cost();
                break;

            case "noyesnono":
                final UnknownPizza ThinPizzaWithMushroom =(new MushroomDecorator(new ThinPizza()));
                pizzaCondiment = ThinPizzaWithMushroom.getDescription();
                mixPizzaPrice = ThinPizzaWithMushroom.cost();
                break;

            case "nonoyesno":
                final UnknownPizza ThinPizzaWithCheese = (new CheeseDecorator(new ThinPizza()));
                pizzaCondiment = ThinPizzaWithCheese.getDescription();
                mixPizzaPrice = ThinPizzaWithCheese.cost();
                break;

            case "nononoyes":
                final UnknownPizza ThinPizzaWithTomato = (new TomatoDecorator(new ThinPizza()));
                pizzaCondiment = ThinPizzaWithTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithTomato.cost();
                break;


            //Two
            case "yesyesnono":
                final UnknownPizza ThinPizzaWithPepperoniMushroom = (new MushroomDecorator(new PepperoniDecorator(new ThinPizza())));
                pizzaCondiment = ThinPizzaWithPepperoniMushroom.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniMushroom.cost();
                break;

            case "yesnoyesno":
                final UnknownPizza ThinPizzaWithPepperoniCheese = (new CheeseDecorator(new PepperoniDecorator(new ThinPizza())));
                pizzaCondiment = ThinPizzaWithPepperoniCheese.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniCheese.cost();
                break;

            case "yesnonoyes":
                final UnknownPizza ThinPizzaWithPepperoniTomato = (new TomatoDecorator(new PepperoniDecorator(new ThinPizza())));
                pizzaCondiment = ThinPizzaWithPepperoniTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniTomato.cost();
                break;

            case "noyesnoyes":
                final UnknownPizza ThinPizzaWithMushroomTomato = (new TomatoDecorator(new MushroomDecorator(new ThinPizza())));
                pizzaCondiment = ThinPizzaWithMushroomTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithMushroomTomato.cost();
                break;

            case "nonoyesyes":
                final UnknownPizza ThinPizzaWithCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new ThinPizza())));
                pizzaCondiment = ThinPizzaWithCheeseTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithCheeseTomato.cost();
                break;

            case "noyesyesno":
                final UnknownPizza ThinPizzaWithMushroomCheese = (new CheeseDecorator(new MushroomDecorator(new ThinPizza())));
                pizzaCondiment = ThinPizzaWithMushroomCheese.getDescription();
                mixPizzaPrice = ThinPizzaWithMushroomCheese.cost();
                break;


            //Three
            case "yesyesyesno":
                final UnknownPizza ThinPizzaWithPepperoniMushroomCheese = (new CheeseDecorator(new MushroomDecorator(new PepperoniDecorator(new ThinPizza()))));
                pizzaCondiment = ThinPizzaWithPepperoniMushroomCheese.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniMushroomCheese.cost();
                break;

            case "yesyesnoyes":
                final UnknownPizza ThinPizzaWithPepperoniMushroomTomato = (new TomatoDecorator(new MushroomDecorator(new PepperoniDecorator(new ThinPizza()))));
                pizzaCondiment = ThinPizzaWithPepperoniMushroomTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniMushroomTomato.cost();
                break;

            case "yesnoyesyes":
                final UnknownPizza ThinPizzaWithPepperoniCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new PepperoniDecorator(new ThinPizza()))));
                pizzaCondiment = ThinPizzaWithPepperoniCheeseTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniCheeseTomato.cost();
                break;

            case "noyesyesyes":
                final UnknownPizza ThinPizzaWithMushroomCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new MushroomDecorator(new ThinPizza()))));
                pizzaCondiment = ThinPizzaWithMushroomCheeseTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithMushroomCheeseTomato.cost();
                break;


            //Four
            case "yesyesyesyes":
                final UnknownPizza ThinPizzaWithPepperoniMushroomCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new MushroomDecorator(new PepperoniDecorator(new ThinPizza())))));
                pizzaCondiment = ThinPizzaWithPepperoniMushroomCheeseTomato.getDescription();
                mixPizzaPrice = ThinPizzaWithPepperoniMushroomCheeseTomato.cost();
                break;

            case "nononono":
                final UnknownPizza ThinPizza = (new WithoutCondiment(new ThinPizza()));
                pizzaCondiment = ThinPizza.getDescription();
                mixPizzaPrice = ThinPizza.cost();
                break;
        }

    }

    public void MixTraditional() {

        System.out.println("Would you like some pepperoni ?\n" + "yes or no");
        condiment = scan.nextLine();

        System.out.println("Would you like some mushroom ?\n" + "yes or no");
        condiment += scan.nextLine();

        System.out.println("Would you like some cheese ?\n" + "yes or no");
        condiment += scan.nextLine();

        System.out.println("Would you like some tomato ?\n" + "yes or no");
        condiment += scan.nextLine();


        switch(condiment) {
            //One
            case "yesnonono":
                final UnknownPizza TraditionalPizzaWithPepperoni = (new PepperoniDecorator(new TraditionalPizza()));
                pizzaCondiment = TraditionalPizzaWithPepperoni.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoni.cost();
                break;

            case "noyesnono":
                final UnknownPizza TraditionalPizzaWithMushroom =(new MushroomDecorator(new TraditionalPizza()));
                pizzaCondiment = TraditionalPizzaWithMushroom.getDescription();
                mixPizzaPrice = TraditionalPizzaWithMushroom.cost();
                break;

            case "nonoyesno":
                final UnknownPizza TraditionalPizzaWithCheese = (new CheeseDecorator(new TraditionalPizza()));
                pizzaCondiment = TraditionalPizzaWithCheese.getDescription();
                mixPizzaPrice = TraditionalPizzaWithCheese.cost();
                break;

            case "nononoyes":
                final UnknownPizza TraditionalPizzaWithTomato = (new TomatoDecorator(new TraditionalPizza()));
                pizzaCondiment = TraditionalPizzaWithTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithTomato.cost();
                break;


            //Two
            case "yesyesnono":
                final UnknownPizza TraditionalPizzaWithPepperoniMushroom = (new MushroomDecorator(new PepperoniDecorator(new TraditionalPizza())));
                pizzaCondiment = TraditionalPizzaWithPepperoniMushroom.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniMushroom.cost();
                break;

            case "yesnoyesno":
                final UnknownPizza TraditionalPizzaWithPepperoniCheese = (new CheeseDecorator(new PepperoniDecorator(new TraditionalPizza())));
                pizzaCondiment = TraditionalPizzaWithPepperoniCheese.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniCheese.cost();
                break;

            case "yesnonoyes":
                final UnknownPizza TraditionalPizzaWithPepperoniTomato = (new TomatoDecorator(new PepperoniDecorator(new TraditionalPizza())));
                pizzaCondiment = TraditionalPizzaWithPepperoniTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniTomato.cost();
                break;

            case "noyesnoyes":
                final UnknownPizza TraditionalPizzaWithMushroomTomato = (new TomatoDecorator(new MushroomDecorator(new TraditionalPizza())));
                pizzaCondiment = TraditionalPizzaWithMushroomTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithMushroomTomato.cost();
                break;

            case "nonoyesyes":
                final UnknownPizza TraditionalPizzaWithCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new TraditionalPizza())));
                pizzaCondiment = TraditionalPizzaWithCheeseTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithCheeseTomato.cost();
                break;

            case "noyesyesno":
                final UnknownPizza TraditionalPizzaWithMushroomCheese = (new CheeseDecorator(new MushroomDecorator(new TraditionalPizza())));
                pizzaCondiment = TraditionalPizzaWithMushroomCheese.getDescription();
                mixPizzaPrice = TraditionalPizzaWithMushroomCheese.cost();
                break;


            //Three
            case "yesyesyesno":
                final UnknownPizza TraditionalPizzaWithPepperoniMushroomCheese = (new CheeseDecorator(new MushroomDecorator(new PepperoniDecorator(new TraditionalPizza()))));
                pizzaCondiment = TraditionalPizzaWithPepperoniMushroomCheese.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniMushroomCheese.cost();
                break;

            case "yesyesnoyes":
                final UnknownPizza TraditionalPizzaWithPepperoniMushroomTomato = (new TomatoDecorator(new MushroomDecorator(new PepperoniDecorator(new TraditionalPizza()))));
                pizzaCondiment = TraditionalPizzaWithPepperoniMushroomTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniMushroomTomato.cost();
                break;

            case "yesnoyesyes":
                final UnknownPizza TraditionalPizzaWithPepperoniCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new PepperoniDecorator(new TraditionalPizza()))));
                pizzaCondiment = TraditionalPizzaWithPepperoniCheeseTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniCheeseTomato.cost();
                break;

            case "noyesyesyes":
                final UnknownPizza TraditionalPizzaWithMushroomCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new MushroomDecorator(new TraditionalPizza()))));
                pizzaCondiment = TraditionalPizzaWithMushroomCheeseTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithMushroomCheeseTomato.cost();
                break;


            //Four
            case "yesyesyesyes":
                final UnknownPizza TraditionalPizzaWithPepperoniMushroomCheeseTomato = (new TomatoDecorator(new CheeseDecorator(new MushroomDecorator(new PepperoniDecorator(new TraditionalPizza())))));
                pizzaCondiment = TraditionalPizzaWithPepperoniMushroomCheeseTomato.getDescription();
                mixPizzaPrice = TraditionalPizzaWithPepperoniMushroomCheeseTomato.cost();
                break;

            case "nononono":
                final UnknownPizza TraditionalPizza = (new WithoutCondiment(new TraditionalPizza()));
                pizzaCondiment = TraditionalPizza.getDescription();
                mixPizzaPrice = TraditionalPizza.cost();
                break;
        }
    }


    public String getPizzaCondiment() { return pizzaCondiment; }

    public int getMixPizzaPrice() { return mixPizzaPrice; }

}
