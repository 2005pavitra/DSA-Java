package Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            sum += cube;
            n/=10;

        }
        System.out.println(sum);
    }
}
