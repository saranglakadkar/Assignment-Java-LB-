/*Q22.Write a program to print the following pattern: 
********* 
 ******* 
 ***** 
 *** 
 * 
 *** 
 ***** 
 ******* 
*********

*/


public class HourglassPattern {
    public static void main(String[] args) {
        int rows = 5; // Defines the size of the upper half

        // Upper half (decreasing stars)
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half (increasing stars)
        for (int i = 2; i <= rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
