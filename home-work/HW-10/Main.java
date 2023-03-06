import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Part 1: substring check");
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        str2 = scanner.nextLine();
        System.out.println(str2.contains(str1));

        System.out.println("\nPart 2: name formatting");
        String lastName, firstName, middleName;
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        middleName = scanner.nextLine();
        System.out.println(lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);

        System.out.println("\nPart 3: username validation");
        String[] usernames = {"hello123", "username", "my_username", "user_name_123", "a_b_c_d_e_f_g_h_i_j_k_l"};
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        Pattern regex = Pattern.compile(pattern);
        for (String username : usernames) {
            Matcher matcher = regex.matcher(username);
            System.out.println(username + ": " + matcher.matches());
        }

        scanner.close();
    }

}
