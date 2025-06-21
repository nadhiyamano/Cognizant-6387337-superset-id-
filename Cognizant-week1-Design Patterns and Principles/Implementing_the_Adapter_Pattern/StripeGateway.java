package Implementing_the_Adapter_Pattern;

public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment through Stripe: ₹" + amount);
    }
}

