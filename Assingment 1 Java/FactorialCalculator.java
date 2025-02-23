import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        
        int factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is " + factorial);
        
        sc.close();
    }
}
