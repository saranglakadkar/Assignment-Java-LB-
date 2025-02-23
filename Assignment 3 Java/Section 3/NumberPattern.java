/* Q13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2
/*


public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Maximum number in the pattern

        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n; i >= 2; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i - 1);
                if (j < i - 1) System.out.print("*");
            }
            System.out.println();
        }
    }
}
