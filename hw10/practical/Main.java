import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(
                """
                PRACTICAL TASKS
                1)Enter the two variables of type String. Determine whether the first variable substring second. For example, if you typed «IT» and «IT Academy» you must receive true.
                2)Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
                - surnames and initials
                - name
                - name, middle name and last name
                3)The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
                Using regular expressions implement checking the user name for validity.
                Input five names in the main method .
                Output a message to the console of the validation of each of the entered names.""");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //PRACTICAL TASK 1
        System.out.println("\nEnter two strings, like «IT» and «IT Academy», each one from new line: ");
        String firstStr = br.readLine();
        String secondStr = br.readLine();
        System.out.println("FirstStr " + (secondStr.contains(firstStr) ? "" : "NO ") + "substring secondStr.\n");


        //PRACTICAL TASK 2
        System.out.print("\nEnter {\"surname\" \"name\" \"patronymic\"} each divided by space: ");
        String inputStr = br.readLine();
        String[] names = inputStr.split(" ");
        String surnameInitials = names[0] + " " + names[1].charAt(0) + "." + names[2].charAt(0) + ".";
        System.out.println("surname and initials: " + surnameInitials + "\nname: " + names[1] + "\nname, patronymic, and surname: " + names[1] + " " + names[2] + " " + names[0]);


        //PRACTICAL TASK 3
        System.out.println("\nLet's check 5 usernames, each one should be 3 to 15 characters long, can include Latin alphabet, numbers, underscores: ");
        String[] usernames = new String[5];
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        for (String username: usernames) {
            username = br.readLine();
            System.out.println("\"" + username + "\" is " + (username.matches(regex) ? "valid" : "invalid"));
        }

    }
}

