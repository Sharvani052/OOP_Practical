package exceptionexamples;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { super(msg); }
}

class BankAccount {
    private double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient Balance!");
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
