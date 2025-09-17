package reflectionAPI;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestCase {}
class CalculatorTest{
    @TestCase
    public void testAdd(){
        int sum = 2 + 3;
        System.out.println("testAdd passed: " + (sum == 5));
    }
    @TestCase
    public void testMultiply(){
        int product = 4 * 2;
        System.out.println("testMultiply passed: " + (product == 8));
    }
}
public class MiniTestFramework{
    public static void main(String[] args){
        CalculatorTest test = new CalculatorTest();
        for (Method m : CalculatorTest.class.getDeclaredMethods()){
            if (m.isAnnotationPresent(TestCase.class)){
                invokeMethod(m, test);
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

