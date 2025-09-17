package reflectionAPI;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Version{
    String number();
}
@Version(number = "1.2")
class ReportGenerator{
    public void generate(){
        System.out.println("Report generated.");
    }
}
public class Version_Tracking{
    public static void main(String[] args){
        if (ReportGenerator.class.isAnnotationPresent(Version.class)){
            Version v = ReportGenerator.class.getAnnotation(Version.class);
            System.out.println("ReportGenerator Version: " + v.number());
        }
    }
}

