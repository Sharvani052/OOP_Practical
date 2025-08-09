package oopstutorial;

class Appliance {
 void turnOn() {
     System.out.println("Appliance is now ON.");
 }
 void turnOff() {
     System.out.println("Appliance is now OFF.");
 }
}
class Fan extends Appliance {
 void rotate() {
     System.out.println("Fan is rotating.");
 }
}
class CeilingFan extends Fan {
 void setSpeed(int level) {
     System.out.println("Ceiling fan speed set to level " + level);
 }
}

public class New_5 {
 public static void main(String[] args) {
     CeilingFan myFan = new CeilingFan();
     myFan.turnOn();
     myFan.rotate();
     myFan.setSpeed(5);
     myFan.turnOff();
 }
}

