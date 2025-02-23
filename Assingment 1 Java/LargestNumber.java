import java.util.Scanner; // Import Scanner for user input

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        // Taking input from user
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Input third number: ");
        int num3 = sc.nextInt();
        
        int largest; // Variable to store the largest number
        
        // Checking which number is largest
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        // Printing the largest number
        System.out.println("The largest number is " + largest + ".");
        
        sc.close(); // Close Scanner
    }
}
