package oopstutorial;

class vehicle{
	void move() {
		System.out.println("Vehicle is moving");
	}
}
class car extends vehicle{
	void fuelType() {
		System.out.println("The fuelType is petrol");
	}
}

public class New_2 {
	public static void main(String[] args) {
		car mycar=new car();
		mycar.move();
		mycar.fuelType();
	}

}
