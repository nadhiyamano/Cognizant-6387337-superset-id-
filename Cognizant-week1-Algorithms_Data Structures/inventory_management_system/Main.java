package inventory_management_system;

public class Main {
    public static void main(String[] args) {
        InventoryManager im = new InventoryManager();

        im.addProduct(new Product(101, "Mouse", 50, 299.99));
        im.addProduct(new Product(102, "Keyboard", 30, 499.99));

        System.out.println("All Products:");
        im.showAllProducts();

        System.out.println("\nUpdating Product ID 101...");
        im.updateProduct(101, "Wireless Mouse", 40, 349.99);

        System.out.println("\nAll Products After Update:");
        im.showAllProducts();

        System.out.println("\nDeleting Product ID 102...");
        im.deleteProduct(102);

        System.out.println("\nAll Products After Deletion:");
        im.showAllProducts();
    }
}

