// Q2.Write a program to compute the factorial of the number 10.

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
        }
        System.out.println("Factorial of 10: " + fact);
    }
}

