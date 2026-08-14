import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean hasMinLength = password.length() >= 8;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        String specialChars = "!@#$%^&*()_+-=[]{}";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) hasDigit = true;
            if (specialChars.contains(String.valueOf(c))) hasSpecialChar = true;
        }

        if (!hasMinLength) {
            System.out.println("Weak - password must be at least 8 characters");
        } else if (!hasDigit || !hasSpecialChar) {
            System.out.println("Medium - add numbers and special characters");
        } else {
            System.out.println("Strong password!");
        }

        scanner.close();
    }
}