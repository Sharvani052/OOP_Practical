package inheritance;

class Vehicle {
    void move() {
        System.out.println("The vehicle moves forward.");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("This car uses petrol or diesel.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.fuelType();
    }
}
