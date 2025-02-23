/* Q20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1

/*


public class ReverseNumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 5; i >= 1; i--) {  
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                if (j > i) { // Add '*' only between numbers, not at the end
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
