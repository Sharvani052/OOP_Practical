package genericsdemo;

class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

class GenericUtils {
    public static <T> boolean compareBoxes(Box<T> b1, Box<T> b2) {
        return b1.get().equals(b2.get());
    }
}

class Account<T> {
    private T balance;
    public Account(T balance) { this.balance = balance; }
    public void displayBalance() { System.out.println("Balance: " + balance); }
}

class PatientRecord<T> {
    private T id;
    private String name;
    public PatientRecord(T id, String name) { this.id = id; this.name = name; }
    public void display() { System.out.println("ID: " + id + ", Name: " + name); }
}

public class GenericMain {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        Box<Integer> b2 = new Box<>();
        b1.set(10); b2.set(10);
        System.out.println(GenericUtils.compareBoxes(b1, b2));

        Account<Double> acc = new Account<>(1500.75);
        acc.displayBalance();

        PatientRecord<String> p = new PatientRecord<>("P123", "John");
        p.display();
    }
}
