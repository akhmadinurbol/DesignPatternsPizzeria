package Factory.Drink;

public abstract class Drink {

    String name;
    int ml;
    int price;

    void prepare(){
        System.out.println("\nPreparing " + name + " " + ml + "ml");
    }

    public String getName() {
        return name;
    }

    public int getMl() {
        return ml;
    }

    public int getPrice() { return price; }
}
