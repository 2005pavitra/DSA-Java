package Methods;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        do{
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            if(input.equals("X")){
                break;
            }else{
                int num = Integer.parseInt(input);
                findEvenOdd(num);
            }
        }while(true);
        sc.close();
    }



//defining methods
public static void findEvenOdd(int n){
    String result = (n%2 ==0)?"even":"odd";
    System.out.println(result);

}

    public static class Greeting {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the name: ");
            String name = sc.nextLine();

            String msg = greet(name);
            System.out.println(msg);
        }

        static String greet(String name) {
            String greeting = ("Hello "+name+" \uD83D\uDE0A!");
            return greeting;
        }
    }

    public static class Sum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number: ");

            char a = sc.next().charAt(0);
            System.out.println(a);

            while(a != 'x'){

            System.out.println("Enter the number");
            System.out.println("a: "+a);
            }

    //



        }

    //    public static int printSum(int a) {
    //        int sum = 0;
    //        sum = sum + a;
    //        return sum;
    //    }
    }
}