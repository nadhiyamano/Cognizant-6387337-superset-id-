package Implementing_the_Observer_Pattern;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileClient = new MobileApp("User1");
        Observer webClient = new WebApp("User2");

        market.registerObserver(mobileClient);
        market.registerObserver(webClient);

        System.out.println("== Stock Price Update 1 ==");
        market.setStock("TCS", 3700.50);

        System.out.println("\n== Stock Price Update 2 ==");
        market.setStock("INFY", 1540.25);

        System.out.println("\n== WebApp Unsubscribed ==");
        market.removeObserver(webClient);
        
        System.out.println("\n== Stock Price Update 3 ==");
        market.setStock("WIPRO", 530.90);
    }
}
