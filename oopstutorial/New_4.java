package oopstutorial;

class Person {
    String name;
    int age;
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    String studentID;
    void displayStudentInfo() {
        displayInfo(); 
        System.out.println("Student ID: " + studentID);
    }
}
class GraduateStudent extends Student {
    void submitThesis() {
        System.out.println(name + " has submitted the thesis.");
    }
}

public class New_4 {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.name = "Sharvani";
        gs.age = 17;
        gs.studentID = "90052";       
        gs.displayStudentInfo();  
        gs.submitThesis();       
    }
}
