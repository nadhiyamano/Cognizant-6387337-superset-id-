package Implementing_the_Strategy_Pattern;

public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.payAmount(2500.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(1500.00);
    }
}

