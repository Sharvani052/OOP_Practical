package oopstutorial;

class pet{
	void eat() {
		System.out.println("The animal eats food");
	}
}
class dog extends pet{
	void bark() {
		System.out.println("The dog barks");
	}
}
class puppy extends dog{
	void weep() {
		System.out.println("The puppy weeps");
	}
}

public class New_3 {
	public static void main(String[] args) {
		puppy p=new puppy();
		p.eat();
		p.bark();
		p.weep();
	}
}
