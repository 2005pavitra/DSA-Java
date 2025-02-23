package Methods;

public class Shadowing {
    static int x = 90;
    static int y = 200;

    public static void main(String[] args) {
        System.out.println("Static x: " + Shadowing.x);
        System.out.println("Static y: " + Shadowing.y);

        int x = 30; // Shadows the static 'x'
        int y = 50; // Shadows the static 'y'

        System.out.println("Local x: " + x);
        System.out.println("Accessing static x using class name: " + Shadowing.x);
        System.out.println("Local y: " + y);
        System.out.println("Accessing static y using class name: " + Shadowing.y);

        {
            x = 10; // Modifies the local 'x'
            System.out.println("Modified local x inside block: " + x);

            {
                 y = 200; // Shadows the local 'y'
                System.out.println("Inner block y: " + y);
            }
        }
    }
}
