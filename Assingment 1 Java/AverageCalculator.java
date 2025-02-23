import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Input second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Input third number: ");
        double num3 = sc.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        
        System.out.println("The average is: " + average);
        
        sc.close();
    }
}
