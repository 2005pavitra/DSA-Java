package Assignment_02;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the number: ");
//        int a = sc.nextInt();

        while(true){
            System.out.println("Enter the number: ");

        if(sc.nextInt()%2==0){

            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        }
    }
}
