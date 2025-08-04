package oopspractical;

import java.util.*;

class Subject{
    private String subjectId;
    private String subjectName;
    public Subject(String subjectId, String subjectName){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }
    public String getSubjectId(){
        return subjectId;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public String toString(){
        return subjectId + ": " + subjectName;
    }
}

class Mystudent{
    private String studentName;
    private Subject[] registeredSubjects;
    private int subjectCount;

    public Mystudent(String studentName){
        this.studentName=studentName;
        this.registeredSubjects=new Subject[5];
        this.subjectCount=0;
    }

    public void registerSubject(Subject subject){
        if (isAlreadyRegistered(subject)){
            System.out.println(studentName + " is already registered in " + subject.getSubjectName());
            return;
        }
        if(subjectCount < registeredSubjects.length){
            registeredSubjects[subjectCount++]=subject;
            System.out.println(studentName + " registered in " + subject.getSubjectName());
        }else{
            System.out.println("Cannot register, subject limit reached.");
        }
    }

    private boolean isAlreadyRegistered(Subject subject){
        for(int i=0;i<subjectCount;i++){
            if(registeredSubjects[i].getSubjectId().equals(subject.getSubjectId())){
                return true;
            }
        }
        return false;
    }

    public void showRegisteredSubjects(){
        System.out.println("Subjects registered by " + studentName + ":");
        if(subjectCount == 0){
            System.out.println(" - No subjects registered.");
            return;
        }
        for(int i=0;i<subjectCount;i++){
            System.out.println(" - " + registeredSubjects[i]);
        }
    }
}

public class Task_2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Subject s1=new Subject("SUB101", "Data Structures");
        Subject s2=new Subject("SUB102", "Computer Networks");
        Subject s3=new Subject("SUB103", "Software Engineering");
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Mystudent student = new Mystudent(studentName);
        while (true){
            System.out.println("\n--- Subject Registration Menu ---");
            System.out.println("1. Register for Data Structures");
            System.out.println("2. Register for Computer Networks");
            System.out.println("3. Register for Software Engineering");
            System.out.println("4. View Registered Subjects");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    student.registerSubject(s1);
                    break;
                case 2:
                    student.registerSubject(s2);
                    break;
                case 3:
                    student.registerSubject(s3);
                    break;
                case 4:
                    student.showRegisteredSubjects();
                    break;
                case 5:
                    System.out.println("Thank you for using the subject registration system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
