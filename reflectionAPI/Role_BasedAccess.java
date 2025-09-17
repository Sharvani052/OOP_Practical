package reflectionAPI;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed{
    String role();
}
class UserService{
    @RoleAllowed(role = "ADMIN")
    public void deleteUser(){
        System.out.println("User deleted!");
    }
    @RoleAllowed(role = "USER")
    public void viewProfile(){
        System.out.println("Profile viewed!");
    }
}
public class Role_BasedAccess{
    public static void main(String[] args){
        String currentRole = "USER";
        UserService service = new UserService();
        for (Method m : UserService.class.getDeclaredMethods()){
            if (m.isAnnotationPresent(RoleAllowed.class)){
                RoleAllowed r = m.getAnnotation(RoleAllowed.class);
                if (r.role().equals(currentRole)){
                    invokeMethod(m, service);
                }else{
                    System.out.println("Access denied for method: " + m.getName());
                }
            }
        }
    }
    static void invokeMethod(Method m, Object obj){
        try{
            m.invoke(obj);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

