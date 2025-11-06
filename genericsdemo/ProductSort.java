package genericsdemo;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    public Product(String n, double p, double r) { name = n; price = p; rating = r; }
    public String toString() { return name + " - " + rating + " - " + price; }
}

public class ProductSort {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("A", 500, 4.5),
            new Product("B", 300, 4.5),
            new Product("C", 800, 4.8)
        );
        list.sort((p1, p2) -> {
            int r = Double.compare(p2.rating, p1.rating);
            return r != 0 ? r : Double.compare(p1.price, p2.price);
        });
        list.forEach(System.out::println);
    }
}
