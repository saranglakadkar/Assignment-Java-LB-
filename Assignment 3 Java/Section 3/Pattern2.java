/*Q18. Write a program to print the following pattern: 
 * 
 *** 
 ***** 
 ******* 
 ***** 
 *** 
 *
/*

public class Pattern2 {
    public static void main(String[] args) {
        int n = 7; // Adjust 'n' to control the size (must be odd)

        // Upper part of the pattern
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}