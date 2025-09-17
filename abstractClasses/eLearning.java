package abstractclasses;

abstract class Course{
    String courseName;
    String instructor;
    Course(String courseName, String instructor){
        this.courseName=courseName;
        this.instructor=instructor;
    }
    abstract void startCourse();
    abstract void endCourse();
    void getCourseDetails(){
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " +instructor);
    }

    // Common method
    void giveCertificate(){
        System.out.println("Certificate granted for " +courseName);
    }
}
class ProgrammingCourse extends Course{
    ProgrammingCourse(String courseName,String instructor){
        super(courseName, instructor);
    }
    @Override
    void startCourse(){
        System.out.println("Programming course started.");
    }
    @Override
    void endCourse(){
        System.out.println("Programming course completed. Final project submitted.");
    }
}
class LanguageCourse extends Course{
    LanguageCourse(String courseName,String instructor){
        super(courseName, instructor);
    }
    @Override
    void startCourse(){
        System.out.println("Language course started.");
    }
    @Override
    void endCourse(){
        System.out.println("Language course completed. Oral exam conducted.");
    }
}
public class eLearning{
    public static void main(String[] args){
        Course c1 = new ProgrammingCourse("Java Programming","Dr. Rao");
        Course c2 = new LanguageCourse("German Language","Ms. Priya");
        c1.getCourseDetails();
        c1.startCourse();
        c1.endCourse();
        c1.giveCertificate();
        c2.getCourseDetails();
        c2.startCourse();
        c2.endCourse();
        c2.giveCertificate();
    }
}
