import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        
        while (true) {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            
            String validationMessage = validatePassword(password);
            if (validationMessage.equals("Password is valid.")) {
                System.out.println(validationMessage);
                break;
            } else {
                System.out.println(validationMessage);
            }
        }
        scanner.close();
    }
    public static String validatePassword(String password) {
        // Check password length
        if (password.length() < 8) {
            return "Password is invalid. Needs to be at least 8 characters long.";
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasUpperCase) {
            return "Password is invalid. Needs to include at least one uppercase letter.";
        }
        if (!hasLowerCase) {
            return "Password is invalid. Needs to include at least one lowercase letter.";
        }
        if (!hasDigit) {
            return "Password is invalid. Needs to include at least one digit.";
        }

        return "Password is valid."; // If all criteria are met
    }
}
