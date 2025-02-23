import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number: ");
        String num = sc.next(); // Taking input as String
        
        // Reverse using StringBuilder
        String reversedNum = new StringBuilder(num).reverse().toString();
        
        System.out.println("The reverse of the number is " + reversedNum);
        
        sc.close();
    }
}
