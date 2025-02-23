import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0.0;
        boolean isValid = true;

        // Switch statement for operation selection
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Nested if-else to check division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    isValid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                isValid = false;
        }

        // Agar calculation valid hai, to result print hoga
        if (isValid) {
            System.out.println("Result: " + result);
        }

        
    }
}
