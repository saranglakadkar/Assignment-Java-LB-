/* Q25. Write a program to print the following pattern: 
1 
12 
123 
1234 
12345

*/

public class NumberPattern4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }
    }
}
