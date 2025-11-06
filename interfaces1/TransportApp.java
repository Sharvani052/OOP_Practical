package interfaces1;

interface Vehicle {
    void start();
    void stop();
    String getFuelType();
}

// Class 1: Car
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }
    public String getFuelType() {
        return "Petrol";
    }
}

// Class 2: ElectricBike
class ElectricBike implements Vehicle {
    public void start() {
        System.out.println("Electric Bike is starting...");
    }
    public void stop() {
        System.out.println("Electric Bike is stopping...");
    }
    public String getFuelType() {
        return "Electric";
    }
}

// Main Program
public class TransportApp {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new ElectricBike() };

        for (Vehicle v : vehicles) {
            v.start();
            System.out.println("Fuel Type: " + v.getFuelType());
            v.stop();
            System.out.println("--------------------");
        }
    }
}
