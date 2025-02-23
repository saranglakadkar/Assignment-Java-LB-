/* Q24. Write a program to print the following pattern: 
1 
22 
333 
4444 
55555

*/

public class NumberTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop to print numbers in each row
                System.out.print(i); // Print the current row number
            }
            System.out.println(); // Move to the next line
        }
    }
}
