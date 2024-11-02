import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
              if (name.equalsIgnoreCase("Louis")) {
            System.out.println("Are you French?");
        } else {
            System.out.println("You have a great name!");
        }
        scanner.close();
    }
}