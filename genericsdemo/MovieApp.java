package genericsdemo;

import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    int year;
    double rating;
    public Movie(String t, int y, double r) { title = t; year = y; rating = r; }
}

public class MovieApp {
    public static void main(String[] args) {
        List<Movie> list = Arrays.asList(
            new Movie("A", 2022, 4.5),
            new Movie("B", 2023, 4.2),
            new Movie("C", 2021, 3.8)
        );
        List<String> titles = list.stream()
            .filter(m -> m.rating > 4.0)
            .sorted((m1, m2) -> Integer.compare(m2.year, m1.year))
            .map(m -> m.title)
            .collect(Collectors.toList());
        System.out.println(titles);
    }
}
