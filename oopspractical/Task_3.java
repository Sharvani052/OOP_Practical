package oopspractical;

import java.util.*;

public class Task_3{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str1="Hello";
        String str2="Hello";             
        String str3=new String("Hello");  
        System.out.println("Comparing Strings:");
        System.out.println("str1 == str2: " + (str1 == str2));             
        System.out.println("str1 == str3: " + (str1 == str3));             
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 
        String baseString="Java";
        String newString=baseString.concat(" Programming");
        System.out.println("\nString Immutability:");
        System.out.println("Base String: " + baseString);         
        System.out.println("New String: " + newString);
        System.out.print("\nEnter number of strings: ");
        int count=scanner.nextInt();
        scanner.nextLine(); 
        String[] inputStrings=new String[count];
        System.out.println("Enter " + count + " strings:");
        for(int i=0;i<count;i++){
            inputStrings[i]=scanner.nextLine();
        }
        System.out.println("\nOriginal array:");
        for(String str : inputStrings){
            System.out.print(str + " ");
        }
        Arrays.sort(inputStrings);
        System.out.println("\n\nSorted array:");
        for(String str : inputStrings){
            System.out.print(str + " ");
        }
        System.out.println("\n\nReversed array:");
        for(int i=inputStrings.length-1;i>=0;i--){
            System.out.print(inputStrings[i] + " ");
        }
        StringBuilder concatenated=new StringBuilder();
        for(String str:inputStrings){
            concatenated.append(str).append(" ");
        }
        System.out.println("\n\nConcatenated String: " + concatenated.toString().trim());
        scanner.close();
    }
}
