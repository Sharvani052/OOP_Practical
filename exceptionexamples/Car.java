package exceptionexamples;

class OverSpeedException extends Exception {
    public OverSpeedException(String msg) {
        super(msg);
    }
}

public class Car {
    public static void main(String[] args) {
        int speed = 150;

        try {
            if (speed > 120) {
                throw new OverSpeedException("Speed exceeds 120 km/h!");
            }
            System.out.println("Speed is safe ✅");
        } catch (OverSpeedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
