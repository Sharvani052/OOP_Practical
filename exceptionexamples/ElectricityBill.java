package exceptionexamples;

import java.time.*;

class LatePaymentException extends Exception {
    public LatePaymentException(String msg) {
        super(msg);
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        LocalDate dueDate = LocalDate.of(2025, 9, 10);
        LocalDate paymentDate = LocalDate.of(2025, 9, 15);

        try {
            if (paymentDate.isAfter(dueDate)) {
                throw new LatePaymentException("Bill paid after due date!");
            }
            System.out.println("Payment successful ✅");
        } catch (LatePaymentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
