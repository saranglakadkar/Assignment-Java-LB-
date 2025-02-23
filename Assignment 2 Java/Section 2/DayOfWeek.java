import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se day number input lena
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = sc.nextInt();

        // Outer switch for days
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                sc.close();
                return;
        }

        // Nested switch for checking weekday or weekend
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("It's a Weekday.");
                break;
            case 6: case 7:
                System.out.println("It's a Weekend.");
                break;
        }

       
    }
}
