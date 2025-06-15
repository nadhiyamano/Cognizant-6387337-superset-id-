package Implementing_the_Proxy_Pattern;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("\n--- First time loading photo1.jpg ---");
        image1.display(); 

        System.out.println("\n--- Displaying photo1.jpg again ---");
        image1.display();  

        System.out.println("\n--- First time loading photo2.jpg ---");
        image2.display(); 
    }
}

