package Assignment_02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till where the fibonacci series is calculated: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        while (a < n) {

            int c = a+b;
            b = c;
            a = b;
            System.out.println(c);
        }
    }
}
