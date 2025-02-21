package Assignment_02;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the first number: " );
        int a = sc.nextInt();

        System.out.println("Enter the second number: " );
        int b = sc.nextInt();


        System.out.println("Enter the operator: " );
        String c = sc.next();

        if(c.equals("+")){
            int sum = a+b;
            System.out.println("The sum is: " + sum);

        }else if(c.equals("-")){
            int difference = a-b;
            System.out.println("The difference is: " + difference);

        }else if(c.equals("*")){
            int product = a*b;
            System.out.println("The product is: " + product);

        }else if(c.equals("/")){
            int division = a/b;
            System.out.println("The division is: " + a/b);

        }

    }
}
