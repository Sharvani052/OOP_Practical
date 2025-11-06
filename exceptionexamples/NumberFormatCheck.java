package exceptionexamples;
import java.util.Scanner;

public class NumberFormatCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Converted Number = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
        sc.close();
    }
}
