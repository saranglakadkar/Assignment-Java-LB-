import java.util.Scanner;  // Import Scanner class

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Takes name as input
        
        System.out.println("Hello"); // Prints "Hello"
        System.out.println(name); // Prints the entered name
        
        sc.close(); // Close Scanner
    }
}


