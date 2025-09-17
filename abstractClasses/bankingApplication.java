package abstractclasses;

abstract class BankAccount{
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    abstract void calculateInterest();
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }
    void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    protected double getBalance(){
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    @Override
    void calculateInterest(){
        double interest = getBalance() * 0.04; 
        setBalance(getBalance() + interest);
        System.out.println("Interest added: " + interest);
        System.out.println("New Balance: " + getBalance());
    }
}
class CurrentAccount extends BankAccount{
    CurrentAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    @Override
    void calculateInterest(){
        System.out.println("Current accounts do not earn interest.");
    }
}
public class bankingApplication{
    public static void main(String[] args){
        BankAccount acc1 = new SavingsAccount("S123", 10000);
        BankAccount acc2 = new CurrentAccount("C456", 5000);
        acc1.deposit(2000);
        acc1.calculateInterest();
        acc1.withdraw(3000);
        acc2.deposit(1000);
        acc2.calculateInterest();
        acc2.withdraw(7000);
    }
}

