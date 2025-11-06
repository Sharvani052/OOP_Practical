package genericsdemo;

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) { this.id = id; this.name = name; this.salary = salary; }
    public int compareTo(Employee e) { return Double.compare(e.salary, this.salary); }
    public String toString() { return name + " - " + salary; }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(1, "A", 30000),
            new Employee(2, "B", 50000),
            new Employee(3, "C", 40000)
        );
        Collections.sort(list);
        System.out.println("Comparable: " + list);
        list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("Comparator: " + list);
    }
}
