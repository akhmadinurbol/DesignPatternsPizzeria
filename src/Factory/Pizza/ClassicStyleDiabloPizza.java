package Factory.Pizza;

public class ClassicStyleDiabloPizza extends Pizza{

    public ClassicStyleDiabloPizza(){
        name = "Meat feast by Diablo";
        dough = "Extra Thick Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Pepperoni, ham*, beef & chicken breast");
        price = 2000;
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices...");
    }

}
