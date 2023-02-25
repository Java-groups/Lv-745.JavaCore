import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------Task 1 -------------------------");
        System.out.print("Enter the first string: ");
        String str1 = reader.readLine();
        System.out.print("Enter the second string: ");
        String str2 = reader.readLine();
        boolean isSubstring = str1.contains(str2);
        System.out.println("The first string " + (isSubstring ? "" : "does not ") + "contain the second string.\n");

        System.out.println("----------------Task 2 -------------------------");
        boolean isInputValid = false;
        String enteredString = null;
        String[] fullName = null;
        while (!isInputValid) {
            System.out.print("Enter full name (surname, name, patronymic): ");
            enteredString = reader.readLine();
            fullName = enteredString.split(" ");
            if (fullName.length==3) {
                isInputValid=true;
            } else {
                System.out.println("Enter correct full name");
            }
        }
        String initials = fullName[0] + " " + fullName[1].charAt(0) + "." + " " + fullName[2].charAt(0) + ".";
        System.out.println("Surnames and initials: " + initials);
        System.out.println("Name: " + fullName[1]);
        System.out.println("Name, middle name, and last name: " + fullName[1] + " " + fullName[2] + " " + fullName[0]);

        System.out.println("----------------Task 3 -------------------------");
        String[] usernames = {"j_doe", "jane", "1user2", "user_1234567890", "user_with_underscores"};
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        for (String username : usernames) {
            boolean isValid = username.matches(regex);
            System.out.println("The username " + username + " is " + (isValid ? "valid" : "invalid") + ".");
        }
    }
}
