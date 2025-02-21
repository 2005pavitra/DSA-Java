package Assignment_01;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        while(true) {

            System.out.println("Enter a number: ");

            if (sc.hasNextInt()) {
                sum += sc.nextInt(); // Add number to sum


//                sum = sum + a;
            } else {
                String str = sc.nextLine();
                if(str.equals("x")) {
                    break;
                }
            }
        }


        System.out.println("The sum is : "+sum);
        sc.close();
    }
}
