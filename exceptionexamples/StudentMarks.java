package exceptionexamples;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) { super(msg); }
}

class Student {
    void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100)
            throw new InvalidMarksException("Marks must be between 0 and 100!");
        System.out.println("Marks set: " + marks);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.setMarks(120);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
