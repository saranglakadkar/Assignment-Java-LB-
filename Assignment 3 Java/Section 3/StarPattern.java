/*Q12.Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****
*/

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= 5; j++) { // Inner loop for columns
                System.out.print("*"); 
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
