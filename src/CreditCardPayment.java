public class CreditCardPayment extends Payment {


    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment of " + amount + " processed");
    }
}
