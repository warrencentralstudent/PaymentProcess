public class PayPalPayment extends Payment {


    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal payment of " + amount + " processed");
    }
}
