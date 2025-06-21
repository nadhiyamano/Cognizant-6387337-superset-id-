package Library_Management_System;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Data Structures", "Mark Allen"),
            new Book(2, "Algorithms", "Cormen"),
            new Book(3, "Java Programming", "James Gosling"),
            new Book(4, "Operating Systems", "Silberschatz")
        };

        System.out.println("Linear Search for 'Java Programming':");
        Book result1 = Library.linearSearch(books, "Java Programming");
        System.out.println(result1 != null ? result1 : "Book not found");

        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        System.out.println("\nBinary Search for 'Operating Systems':");
        Book result2 = Library.binarySearch(books, "Operating Systems");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}

