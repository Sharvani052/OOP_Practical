package exceptionexamples;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        int stock = 5;
        int purchaseQty = 10;

        try {
            if (purchaseQty > stock) {
                throw new OutOfStockException("Not enough stock available!");
            }
            System.out.println("Purchase successful ✅");
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
