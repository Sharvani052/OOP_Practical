package inheritance;

class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on.");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan starts rotating.");
    }
}

class CeilingFan extends Fan {
    void setSpeed(int level) {
        System.out.println("Ceiling fan speed set to " + level);
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();
        cf.turnOn();     // from Appliance
        cf.rotate();     // from Fan
        cf.setSpeed(3);  // specific to CeilingFan
    }
}
