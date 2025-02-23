/* Q14.Write a program to print the following pattern: 
 *
 ** 
 *** 
 ***** 
 ******* 
 *********

/*


public class StarPattern2 {
    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {  
            // Print leading spaces (one less than row number)
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
