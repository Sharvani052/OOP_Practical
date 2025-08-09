package oopspractical;

class University{
	void displayRole() {
		System.out.println("Iam a member in the university");
	}
}
class Admin extends University{
	@Override
	void displayRole() {
		System.out.println("I am an Admin who manages university");
	}
}
class Classmates extends University{
	@Override
	void displayRole() {
		System.out.println("I am a student who attends classes in university");
	}
}
class Faculty extends University{
	@Override
	void displayRole() {
		System.out.println("I am the faculty who teaches in the university");
	}
}

public class Task_4 {
	public static void main(String[] args) {
		University u1=new Admin();
		University u2 = new Classmates();
		University u3 = new Faculty();
		u1.displayRole();
		u2.displayRole();
		u3.displayRole();
	}

}
