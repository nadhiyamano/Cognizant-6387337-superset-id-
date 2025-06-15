package Implementing_the_Adapter_Pattern;

public class TestAdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PaypalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        paypal.processPayment(100.0);
        stripe.processPayment(250.0);
    }
}
