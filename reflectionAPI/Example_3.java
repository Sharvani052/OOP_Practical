package reflectionAPI;

import java.lang.annotation.*;
import java.lang.reflect.*;
// Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface APIInfo{
    String endpoint();
    String method();
}
// API class
class UserAPI{
    @APIInfo(endpoint = "/users", method = "GET")
    public void getUsers(){}
    @APIInfo(endpoint = "/users", method = "POST")
    public void createUser(){}
}
public class Example_3{
    public static void main(String[] args){
        for (Method m : UserAPI.class.getDeclaredMethods()){
            if (m.isAnnotationPresent(APIInfo.class)){
                APIInfo api = m.getAnnotation(APIInfo.class);
                System.out.println("Endpoint: " + api.endpoint());
                System.out.println("Method: " + api.method());
            }
        }
    }
}

