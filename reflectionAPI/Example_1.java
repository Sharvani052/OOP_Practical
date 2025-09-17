package reflectionAPI;

import java.lang.reflect.Method;

class Product{
    public void showDetails(){
        System.out.println("Product: Laptop, Price: 75000, Brand: Dell");
    }
}
public class Example_1 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("reflectionAPI.Product");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod("showDetails");
        method.invoke(obj);
    }
}

