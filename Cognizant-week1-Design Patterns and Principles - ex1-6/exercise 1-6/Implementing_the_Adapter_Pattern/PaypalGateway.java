package Implementing_the_Adapter_Pattern;

public class PaypalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment through PayPal: ₹" + amount);
    }
}
