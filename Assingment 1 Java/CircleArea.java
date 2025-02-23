import java.util.Scanner; // Import Scanner for user input

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Input the radius: ");
        double radius = sc.nextDouble(); // Taking radius input from user
        
        // Calculate area using formula: Area = π * r²
        double area = Math.PI * Math.pow(radius, 2);
        
        // Print the area
        System.out.println("Area of the circle: " + area);
        
        sc.close(); // Close Scanner
    }
}
