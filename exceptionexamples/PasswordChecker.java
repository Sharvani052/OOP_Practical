package exceptionexamples;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String msg) {
        super(msg);
    }
}

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "pass"; // Example password

        try {
            if (password.length() < 8 || !password.matches(".*\\d.*")) {
                throw new WeakPasswordException("Password must be at least 8 chars and contain a number!");
            }
            System.out.println("Strong Password ✅");
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
