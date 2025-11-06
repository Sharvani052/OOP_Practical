package inheritance;

class Person {
    String name;
    void displayInfo() {
        System.out.println("Person: " + name);
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
        System.out.println("Graduate student submits thesis.");
    }
}

public class AcademicSystem {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.name = "Satwika";
        gs.studentID = "CS101";
        
        gs.displayStudentInfo(); // Person + Student info
        gs.submitThesis();       // Graduate-specific
    }
}