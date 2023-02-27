import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]{3,15}$");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            Matcher matcher = pattern.matcher(username);
            boolean isValid = matcher.matches();

            if (isValid) {
                System.out.println("Username " + username + " is valid.");
            } else {
                System.out.println("Username " + username + " is not valid.");
            }
        }
    }
}