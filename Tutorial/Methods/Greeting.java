package Methods;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter the name: ");
        String name = sc.nextLine(); // Read user input

        String msg = greet(name); // Call greet function
        System.out.println(msg); // Print the greeting message

        sc.close(); // Close the scanner
    }

    static String greet(String name) {
        return "Hello " + name + " 😊!"; // Return the greeting message
    }
}
