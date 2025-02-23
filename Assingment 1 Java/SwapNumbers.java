import java.util.Scanner; // Import Scanner for user input

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Input first number: ");
        int num1 = sc.nextInt(); // Taking first number as input
        
        System.out.print("Input second number: ");
        int num2 = sc.nextInt(); // Taking second number as input
        
        // Printing numbers before swapping
        System.out.println("\nBefore swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Swapping logic without using third variable
        num1 = num1 + num2; // num1 becomes sum of both numbers
        num2 = num1 - num2; // num2 gets original value of num1
        num1 = num1 - num2; // num1 gets original value of num2
        
        // Printing numbers after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        

    }
}
