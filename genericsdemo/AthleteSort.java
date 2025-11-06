package genericsdemo;

import java.util.*;

class Athlete implements Comparable<Athlete> {
    String name;
    String country;
    double score;
    public Athlete(String n, String c, double s) { name = n; country = c; score = s; }
    public int compareTo(Athlete a) { return name.compareTo(a.name); }
    public String toString() { return name + " - " + score; }
}

public class AthleteSort {
    public static void main(String[] args) {
        List<Athlete> list = Arrays.asList(
            new Athlete("John", "USA", 9.8),
            new Athlete("Bob", "UK", 9.7),
            new Athlete("Alex", "CAN", 9.9)
        );
        Collections.sort(list);
        System.out.println(list);
        list.sort((a1, a2) -> Double.compare(a2.score, a1.score));
        System.out.println(list);
    }
}
