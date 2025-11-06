package genericsdemo;

import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    double price;
    double rating;
    public Book(String t, String a, double p, double r) { title = t; author = a; price = p; rating = r; }
}

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("A", "X", 300, 4.5),
            new Book("B", "Y", 200, 3.9),
            new Book("C", "Z", 250, 4.7)
        );
        List<String> titles = books.stream()
            .filter(b -> b.rating > 4)
            .sorted(Comparator.comparingDouble(b -> b.price))
            .map(b -> b.title)
            .collect(Collectors.toList());
        System.out.println(titles);
    }
}
