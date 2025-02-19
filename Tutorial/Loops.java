import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
//        System.out.println("Enter the number of elements: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;

        //For loop
        //Recommended when the number of iterations is known
//        for (int i = 0; i <= num; i++){
//            sum = sum + i;
//        }
//        System.out.println("The sum of first " + num + " elements is " + sum);

        //While Loop
        //Recommended when the number of iterations is not known
//        int i = 0;
//        System.out.println("Printing the list of first 10 even numbers \n");
//        while(i<=10) {
//            System.out.println(i);
//            i = i + 2;
//        }

    //do-while loop
    //Loop is executed at least once. Checks the condition after executing the loop statement
    //Also known as exit-controlled loop
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        }while(i<=1);

}

}
