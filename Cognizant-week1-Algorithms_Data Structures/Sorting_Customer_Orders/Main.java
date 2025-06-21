package Sorting_Customer_Orders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 499.99),
            new Order(2, "Bob", 899.50),
            new Order(3, "Charlie", 250.00)
        };

        System.out.println("Before Sorting:");
        for (Order o : orders) System.out.println(o);

        SortUtil.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort (by totalPrice):");
        for (Order o : orders) System.out.println(o);
     
        Order[] orders2 = {
            new Order(1, "Alice", 499.99),
            new Order(2, "Bob", 899.50),
            new Order(3, "Charlie", 250.00)
        };

        SortUtil.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("\nAfter Quick Sort (by totalPrice):");
        for (Order o : orders2) System.out.println(o);
    }
}

