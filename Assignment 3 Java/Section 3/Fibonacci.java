// Q5.Write a program to print the Fibonacci sequence up to the number 21.

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, next;
        System.out.print(a + " " + b + " ");
        while (b <= 21) {
            next = a + b;
            if (next > 21) break;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
