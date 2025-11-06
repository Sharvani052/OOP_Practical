package tasks;
import java.util.*;
class student {
	String name;
	long rollno;
	int marks;
void setter(String name,long rollno,int marks) {
	this.name=name;
	this.rollno=rollno;
	this.marks=marks;
	
}
void getter() {
	System.out.println(" name "+name);
	System.out.println(" rollno "+rollno);
	System.out.println(" marks "+marks);
}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);
student st = new student();
String name=sc.next();
long rollno = sc.nextLong();
int marks = sc.nextInt();
st.setter(name, rollno, marks);
st.getter();
sc.close();
	}


}
