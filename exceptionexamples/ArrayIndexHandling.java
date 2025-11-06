package exceptionexamples;
import java.util.Scanner;

public class ArrayIndexHandling {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter index (0-4): ");
            int idx = sc.nextInt();
            System.out.println("Element = " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        }
        sc.close();
    }
}
