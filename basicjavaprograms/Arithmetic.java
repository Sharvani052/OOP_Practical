package basicjavaprograms;
import java.util.*;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		int difference=num1-num2;
		int product=num1*num2;
		int quotient, remainder;
		//if (num2!=0){
		    quotient=num1/num2;
		    remainder=num1%num2;
		//}else{
	//	    System.out.println("Division and modulus by zero is not allowed.");
		//    quotient=0;
		  //  remainder=0;
		//}
		System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
	}
 
}
