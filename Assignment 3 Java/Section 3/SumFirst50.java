//Q1. Write a program to calculate the sum of the first 50 natural numbers.

public class SumFirst50 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum of first 50 natural numbers: " + sum);
    }
}
