package reflectionAPI;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Loggable{
    String message();
}
class AccountService{
    @Loggable(message = "Depositing money")
    public void deposit(){
        System.out.println("Deposit successful!");
    }
    @Loggable(message = "Withdrawing money")
    public void withdraw(){
        System.out.println("Withdraw successful!");
    }
}
public class Logging{
    public static void main(String[] args){
        AccountService acc = new AccountService();
        for (Method m : AccountService.class.getDeclaredMethods()){
            if (m.isAnnotationPresent(Loggable.class)){
                Loggable log = m.getAnnotation(Loggable.class);
                System.out.println("LOG: " + log.message());
                invokeMethod(m, acc);
            }
        }
    }
    static void invokeMethod(Method m, Object obj){
        try{
            m.invoke(obj);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

