import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
