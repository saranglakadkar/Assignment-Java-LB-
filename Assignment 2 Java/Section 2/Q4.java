import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for total purchase amount
        System.out.print("Enter total purchase amount (Rs.): ");
        int p = sc.nextInt();

        // Taking input for membership status
        System.out.print("Are you a member? (yes/no): ");
        String s = sc.next().toLowerCase();

        int discount = 0;

        // Checking membership status and applying discounts
        if (s.equals("yes")) {
            System.out.println("You are a member.");
            if (p >= 1000) {
                discount = 25;
            } else if (p >= 500) {
                discount = 15;
            } else {
                discount = 10;
            }
        } else {
            System.out.println("You are not a member.");
            if (p >= 1000) {
                discount = 20;
            } else if (p >= 500) {
                discount = 10;
            } else {
                discount = 5;
            }
        }

        // Calculating discount amount and final price
        double discountAmount = (p * discount) / 100.0;
        double finalPrice = p - discountAmount;

        // Displaying results
        System.out.println("Total Purchase Amount: Rs. " + p);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Price After Discount: Rs. " + finalPrice);

        sc.close();
    }
}
