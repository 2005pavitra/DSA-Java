package Assignment_02;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principle amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        int years  = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        calculateInterest(principal, years, rate);

        sc.close();
    }
    public static void calculateInterest(double a, int b, double c) {
        double interest = (a*b*c)/100;
        double totalAmount = a + interest;
        System.out.println("The interest is: " + interest);
        System.out.println("The total amount is: " + totalAmount);

    }
}
