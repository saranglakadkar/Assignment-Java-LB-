import java.util.Scanner;  // Import Scanner class for user input

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();  // Taking first number as input
        
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();  // Taking second number as input
        
        int product = num1 * num2;  // Multiplication
        
        System.out.println(num1 + " x " + num2 + " = " + product);  // Display result
        
    }
}