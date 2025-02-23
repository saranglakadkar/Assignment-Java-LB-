/*Q21.Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9

*/



public class OddNumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int num = 1;  // Starting odd number

        for (int i = 1; i <= rows; i++) {  
            num = 1; // Reset num to 1 at the start of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) { // Add '*' only between numbers, not at the end
                    System.out.print("*");
                }
                num += 2; // Move to the next odd number
            }
            System.out.println(); // Move to the next line
        }
    }
}
