package interfaces1;

interface Payment {
    void process();
    void refund();
}

class CreditCardPayment implements Payment {
    public void process() {
        System.out.println("Processing credit card payment...");
    }
    public void refund() {
        System.out.println("Refunding credit card payment...");
    }
}

class UPIPayment implements Payment {
    public void process() {
        System.out.println("Processing UPI payment...");
    }
    public void refund() {
        System.out.println("Refunding UPI payment...");
    }
}

public class   ECommercePayments{
    public static void main(String[] args) {
        Payment[] payments = { new CreditCardPayment(), new UPIPayment() };

        for (Payment p : payments) {
            p.process();
            p.refund();
            System.out.println("-------------------");
        }
    }
}
