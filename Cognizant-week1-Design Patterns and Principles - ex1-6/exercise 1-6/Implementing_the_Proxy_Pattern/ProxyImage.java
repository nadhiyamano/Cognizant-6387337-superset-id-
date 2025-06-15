package Implementing_the_Proxy_Pattern;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
     
            realImage = new RealImage(filename);
        } else {
            System.out.println("Image already loaded. Using cached version.");
        }
        realImage.display();
    }
}
