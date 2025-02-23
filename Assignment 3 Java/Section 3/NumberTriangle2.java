
/* Q26. Write a program to print the following pattern: 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/




public class NumberTriangle2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int count = 1; // Number to be printed

        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print(count + " ");
                count++; // Increment the number
            }
            System.out.println(); // Move to next line
        }
    }
}
