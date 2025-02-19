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
}