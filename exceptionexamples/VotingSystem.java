package exceptionexamples;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

public class VotingSystem {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Not eligible to vote!");
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
