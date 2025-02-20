package Assignment_01;
import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int hcf = findHCF(a, b);
        int lcm = (a * b) / hcf; // LCM formula

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        sc.close();
    }

    // Function to calculate HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
