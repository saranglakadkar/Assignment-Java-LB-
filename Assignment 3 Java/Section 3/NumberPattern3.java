/* Q23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555

*/


public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {  // Loop for each row
            for (int j = 1; j <= rows; j++) {  // Loop for each column
                System.out.print(i); // Print the current row number
            }
            System.out.println(); // Move to the next line
        }
    }
}
