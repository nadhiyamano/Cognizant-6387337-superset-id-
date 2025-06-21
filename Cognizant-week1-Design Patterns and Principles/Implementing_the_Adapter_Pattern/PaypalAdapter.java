package Implementing_the_Adapter_Pattern;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalGateway paypalGateway;

    public PaypalAdapter() {
        this.paypalGateway = new PaypalGateway();
    }

    @Override
    public void processPayment(double amount) {

        paypalGateway.sendPayment(amount);
    }
}

