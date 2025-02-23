/*Q19.Write a program to print the following pattern: 

1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5

/*

public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {  
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) { // Add '*' only between numbers, not at the end
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
