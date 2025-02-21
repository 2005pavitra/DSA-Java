package Assignment_02;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the first number:");
            int a =sc.nextInt();

            if(sc.equals("x")){
                System.out.println("Exited! ");
                break;
            }else{
                System.out.println("Enter the second number:");
                int b = sc.nextInt();

                if(a>b){
                    System.out.println(a+ " is greater than " + b);
                }else if(a<b) {
                    System.out.println(b+ " is greater than " + a);
                }else{
                    System.out.println(a+ " is equal to " + b);
                }
            }
        }
    }
}
