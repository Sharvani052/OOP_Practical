package tasks;

// Task-3: Demonstrate interning, immutability, equals vs ==, and manipulate arrays of strings.

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interning and == vs equals()
        String strA = "Hello";
        String strB = "Hello";              
        String strC = new String("Hello");   

        System.out.println("String Comparison:");
        System.out.println("strA == strB: " + (strA == strB));             
        System.out.println("strA == strC: " + (strA == strC));             
        System.out.println("strA.equals(strC): " + strA.equals(strC));     

       
        String baseText = "Java";
        String newText = baseText.concat(" Programming");

        System.out.println("\nString Immutability:");
        System.out.println("Base Text: " + baseText);     
        System.out.println("New Text: " + newText);       

       
        System.out.print("\nEnter number of strings: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        String[] inputStrings = new String[count];

        System.out.println("Enter " + count + " strings:");
        for (int i = 0; i < count; i++) {
            inputStrings[i] = scanner.nextLine();
        }

     
        System.out.println("\nOriginal Strings:");
        for (String word : inputStrings) {
            System.out.print(word + " ");
        }

    
        Arrays.sort(inputStrings);
        System.out.println("\n\nSorted Strings:");
        for (String word : inputStrings) {
            System.out.print(word + " ");
        }

      
        System.out.println("\n\nReversed Strings:");
        for (int i = inputStrings.length - 1; i >= 0; i--) {
            System.out.print(inputStrings[i] + " ");
        }

       
        StringBuilder combined = new StringBuilder();
        for (String word : inputStrings) {
            combined.append(word).append(" ");
        }

        System.out.println("\n\nConcatenated Result: " + combined.toString().trim());

        scanner.close();
    }
}
