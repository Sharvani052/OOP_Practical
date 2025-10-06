package arrayLists;

import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks=new ArrayList<>();
        tasks.add("Finish homework");
        tasks.add("Buy groceries");
        tasks.add("Call mom");
        tasks.add("Read a book");
        System.out.println("To-Do List: "+tasks);
        System.out.println("Task at index 2: "+tasks.get(2));
        tasks.remove("Buy groceries");
        System.out.println("After completing 'Buy groceries': "+tasks);
        Collections.sort(tasks);
        System.out.println("Sorted To-Do List: "+tasks);
        System.out.println("Is the To-Do list empty? "+tasks.isEmpty());
    }
}

