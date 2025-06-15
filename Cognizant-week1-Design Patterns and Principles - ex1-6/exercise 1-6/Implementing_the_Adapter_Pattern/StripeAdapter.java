package Implementing_the_Adapter_Pattern;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter() {
        this.stripeGateway = new StripeGateway();
    }

    @Override
    public void processPayment(double amount) {

        stripeGateway.makePayment(amount);
    }
}

