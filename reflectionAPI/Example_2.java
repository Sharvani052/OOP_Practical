package reflectionAPI;

import java.lang.annotation.*;
import java.lang.reflect.*;
// Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface APIDescription{
    String description();
}

// Class with annotation
@APIDescription(description = "Product API class for e-commerce")
class ProductAPI{
    @APIDescription(description = "Fetch product details")
    public void getProduct(){}
}
// Reflection Reader
public class Example_2{
    public static void main(String[] args) {
        Class<ProductAPI> cls = ProductAPI.class;
        if (cls.isAnnotationPresent(APIDescription.class)) {
            APIDescription classAnno = cls.getAnnotation(APIDescription.class);
            System.out.println("Class Description: " + classAnno.description());
        }

        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(APIDescription.class)) {
                APIDescription methodAnno = m.getAnnotation(APIDescription.class);
                System.out.println("Method: " + m.getName() + " -> " + methodAnno.description());
            }
        }
    }
}

