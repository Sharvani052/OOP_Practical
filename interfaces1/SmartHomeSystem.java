package interfaces1;

interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
}

class SmartLight implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Smart Light turned ON.");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Light turned OFF.");
    }
    public String getStatus() {
        return isOn ? "Light is ON" : "Light is OFF";
    }
}

class SmartFan implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Smart Fan turned ON.");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Fan turned OFF.");
    }
    public String getStatus() {
        return isOn ? "Fan is ON" : "Fan is OFF";
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartDevice[] devices = { new SmartLight(), new SmartFan() };

        for (SmartDevice device : devices) {
            device.turnOn();
            System.out.println(device.getStatus());
            device.turnOff();
            System.out.println(device.getStatus());
            System.out.println("-------------------");
        }
    }
}
