package Strategy;

import OtherClass.Pay;

public class PizzaCart {

    public void pay(PaymentStrategy paymentMethod, int price){
        int amount = price;
        paymentMethod.pay(amount);
    }
}
