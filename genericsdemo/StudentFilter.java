package genericsdemo;

import java.util.*;
import java.util.function.*;

class Student {
    String name;
    double marks;
    public Student(String n, double m) { name = n; marks = m; }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("A", 80),
            new Student("B", 70),
            new Student("C", 90)
        );
        Predicate<Student> high = s -> s.marks > 75;
        Consumer<Student> show = s -> System.out.println(s.name + " - " + s.marks);
        list.stream().filter(high).forEach(show);
    }
}
