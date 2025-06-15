package Ecommerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Fashion"),
            new Product(103, "Laptop", "Electronics"),
            new Product(102, "Book", "Education")
        };

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("Linear Search (ID 102):");
        Product found1 = SearchUtil.linearSearch(products, 102);
        System.out.println(found1);

        System.out.println("Binary Search (ID 103):");
        Product found2 = SearchUtil.binarySearch(products, 103);
        System.out.println(found2);
    }
}

