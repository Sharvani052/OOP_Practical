package reflectionAPI;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotEmpty{}
class Customer{
    @NotEmpty
    String name = ""; 
    int age = 22;
}
public class CustomValidation{
    public static void main(String[] args){
        Customer c = new Customer();
        for (Field f : Customer.class.getDeclaredFields()){
            if (f.isAnnotationPresent(NotEmpty.class)){
                f.setAccessible(true);
                Object value = getFieldValue(f, c);
                if (value == null || value.toString().isEmpty()){
                    System.out.println("Validation Warning: " + f.getName() + " should not be empty!");
                }
            }
        }
    }
    static Object getFieldValue(Field f, Object obj){
        try{
            return f.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
