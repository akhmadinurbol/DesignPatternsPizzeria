package Strategy;

public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalStrategy(String email, String pwd){
        this.email=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println("\n" + amount + "tg" + " paid using Paypal.");
    }

}
