// Q11.Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression.

public class PrePostOperators {
    public static void main(String[] args) {
        int x = 5, y = 10;
        int result = ++x - y-- + x++;
        System.out.println("Result: " + result);
    }
}
