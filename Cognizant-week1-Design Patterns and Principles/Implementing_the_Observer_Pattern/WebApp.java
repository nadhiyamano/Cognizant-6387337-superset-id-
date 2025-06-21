package Implementing_the_Observer_Pattern;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[" + name + " - WebApp] Stock: " + stockName + ", Price: ₹" + price);
    }
}
