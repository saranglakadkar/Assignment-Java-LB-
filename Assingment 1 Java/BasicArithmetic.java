import java.util.Scanner;  

public class BasicArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();  // Taking first number as input
        
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();  // Taking second number as input
        
        // Performing arithmetic operations
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;  // Integer division
        int remainder = num1 % num2; // Modulus (remainder)

        // Printing results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " x " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);
        
       
    }
}