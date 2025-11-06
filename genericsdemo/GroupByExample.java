package genericsdemo;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class StudentDept {
    String name;
    String dept;
    int marks;
    public StudentDept(String n, String d, int m) { name = n; dept = d; marks = m; }
}

public class GroupByExample {
    public static void main(String[] args) {
        List<StudentDept> list = Arrays.asList(
            new StudentDept("A", "CS", 80),
            new StudentDept("B", "IT", 90),
            new StudentDept("C", "CS", 70)
        );
        Map<String, Double> result = list.stream()
            .collect(groupingBy(s -> s.dept, averagingInt(s -> s.marks)));
        System.out.println(result);
    }
}
