package arrayLists;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("Sha");
        students.add("Vani");
        students.add("Ruthvi");
        System.out.println("Student List: " +students);
        students.add(1,"Sharu");
        System.out.println("After inserting 'Sharu' at index 1: " + students);
        students.remove("Ruthvi");
        System.out.println("After removing 'Ruthvi': " +students);
        System.out.println("Is 'Sha' in the list? " +students.contains("Sha"));
        System.out.println("Is 'Sharvani' in the list? " +students.contains("Sharvani"));
        System.out.println("Total Students: " +students.size());
    }
}

