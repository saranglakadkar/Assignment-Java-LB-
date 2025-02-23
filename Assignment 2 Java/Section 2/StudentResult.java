import java.util.Scanner;

public class StudentResultSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter marks for three subjects: ");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();

        int failCount = 0;

        // Check karna ki kaunse subjects mein fail hua hai
        if (subject1 <= 40) failCount++;
        if (subject2 <= 40) failCount++;
        if (subject3 <= 40) failCount++;

        // Nested switch ka use
        switch (failCount) {
            case 0:
                System.out.println("Pass");
                break;
            default:
                switch (failCount) {
                    case 1:
                        System.out.println("Fail in 1 subject.");
                        break;
                    case 2:
                        System.out.println("Fail in 2 subjects.");
                        break;
                    case 3:
                        System.out.println("Fail in 3 subjects.");
                        break;
                }
        }

       
    }
}

