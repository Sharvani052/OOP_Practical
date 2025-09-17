package reflectionAPI;

import java.lang.reflect.*;

class Employee{
    private int id;
    private String name;
    public void work(){}
    public String getName(){ 
    	return name;
    }
}
public class Example_4{
    public static void main(String[] args){
        Class<?> cls = Employee.class;
        System.out.println("Fields:");
        for (Field f : cls.getDeclaredFields()){
            System.out.println(f.getName() + " : " + f.getType().getSimpleName());
        }
        System.out.println("Methods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName() + " : " + m.getReturnType().getSimpleName());
        }
    }
}

