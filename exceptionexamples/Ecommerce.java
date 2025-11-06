package exceptionexamples;

class EmptyCartException extends Exception {
    public EmptyCartException(String msg) {
        super(msg);
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        int cartItems = 0;

        try {
            if (cartItems == 0) {
                throw new EmptyCartException("Cannot place order with empty cart!");
            }
            System.out.println("Order placed ✅");
        } catch (EmptyCartException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
