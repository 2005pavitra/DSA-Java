import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
//        System.out.println("Enter two numbers:");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        //if-else
//
//        if(a>b){
//            System.out.println("a is greater than b");;
//        }else{
//            System.out.println("a is less than b");;
//        }

        //if-elseif-else
//        System.out.println("Enter your age: ");
//        Scanner age = new Scanner(System.in);
//        int ageInt = age.nextInt();
//        if(ageInt<10){
//            System.out.println("You are kid");
//        } else if (ageInt>=10 && ageInt<20) {
//            System.out.println("You are teenage");
//
//        }
//        else{
//            System.out.println("You are adult");
//        }

        //Switch Statements
        String name = "Pavitra";
        switch (name){
            case "PAVITRA":
                System.out.println("name is PAVITRA");
                break;
            case "pavitra":
                System.out.println("The name is pavitra");
                break;
            case "Pavitra":
                System.out.println("The name is Pavitra");
                break;
            default:
                System.out.println("invalid name");
        }
    }
}

