import java.util.Scanner; // Import Scanner for user input

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Input a number: ");
        int num = sc.nextInt(); // Taking number input from user
        
        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even.");
        } else {
            System.out.println("The number " + num + " is Odd.");
        }
        
        sc.close(); // Close Scanner
    }
}

