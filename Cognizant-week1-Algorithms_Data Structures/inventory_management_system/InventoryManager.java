package inventory_management_system;

import java.util.HashMap;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(int productId, String name, int qty, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.productName = name;
            p.quantity = qty;
            p.price = price;
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public void showAllProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}

