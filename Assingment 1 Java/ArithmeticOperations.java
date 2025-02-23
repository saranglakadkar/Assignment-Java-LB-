public class ArithmeticOperations {
    public static void main(String[] args) {
        int result1 = -5 + 8 * 6;       // a. -5 + (8 * 6) = -5 + 48 = 43
        int result2 = (55 + 9) % 9;     // b. (55 + 9) % 9 = 64 % 9 = 1
        int result3 = 20 + -3 * 5 / 8;  // c. 20 + (-15 / 8) = 20 + 0 = 20
        int result4 = 5 + 15 / 3 * 2 - 8 % 3; // d. 5 + (5 * 2) - (8 % 3) = 5 + 10 - 2 = 13
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}