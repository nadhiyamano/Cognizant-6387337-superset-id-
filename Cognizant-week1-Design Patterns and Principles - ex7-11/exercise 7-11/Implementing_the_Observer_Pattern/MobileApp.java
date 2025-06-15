package Implementing_the_Observer_Pattern;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[" + name + " - MobileApp] Stock: " + stockName + ", Price: ₹" + price);
    }
}

