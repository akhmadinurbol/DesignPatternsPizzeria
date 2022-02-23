package OtherClass;

import Strategy.CreditCardStrategy;
import Strategy.PayPalStrategy;
import Strategy.PizzaCart;

import java.util.Scanner;

public class Pay {
    int price;
    Scanner scan = new Scanner(System.in);
    String payMethod;

    public int getPrice() { return price; }

    public void payProcess(int price){
        this.price = price;

        User user = new User();
        PizzaCart pizzaCart = new PizzaCart();

        Order order = new Order();
        System.out.println("\nYour bill is " + price + "tg");

        System.out.println("\nHow will you pay?" + "\npay pal or credit card: ");
        payMethod = scan.nextLine();

        //pay by paypal
        if (payMethod.equals("pay pal")){
            System.out.println("Your email: ");
            String email = scan.nextLine();

            System.out.println("Password: ");
            String pwd = scan.nextLine();

            pizzaCart.pay(new PayPalStrategy(email, pwd), getPrice());

        //pay by credit card
        }else if (payMethod.equals("credit card")){
            System.out.println("Credit card number: ");
            String ccNum = scan.nextLine(); //14 number

            System.out.println("cvv: ");
            String cvv = scan.nextLine(); //3 number

            System.out.println("Expiry date -> ");
            System.out.println("Month: ");
            String month = scan.nextLine();

            System.out.println("Year: ");
            String year = scan.nextLine();

            pizzaCart.pay(new CreditCardStrategy(user.getUserName(), ccNum, cvv, month + "/" + year), getPrice());
        }

        System.out.println("\nThank you for your purchase!");

    }

}
