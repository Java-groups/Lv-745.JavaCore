package practical_task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        System.out.println("The string 1 is substring of 2nd - " + isSubstring());

        System.out.print("Enter surname, name and patronymic ");
        String enteredFullName = sc.nextLine();
        outputInfo(enteredFullName);

        String[] username = {"bla3@", "BrewMas122", "332_Mag", "sMaster", "Op"};
        validateNames(username);
    }

    public static boolean isSubstring() {
        System.out.print("Enter 1st string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String s2 = sc.nextLine();
        return s2.contains(s1);
    }

    public static void outputInfo(String enteredFullName) {
        String[] fullName = enteredFullName.split(" ");

        System.out.println("Surname and initials: " + fullName[0] + " " + fullName[1].charAt(0) + " " + fullName[2].charAt(0));
        System.out.println("Name: " + fullName[1]);
        System.out.println("Name, middle name and last name : " + fullName[1] + " " + fullName[2] + " " + fullName[0]);

    }

    public static void validateNames(String[] username) {
        String pattern = "\\w{3,15}";
        Pattern p = Pattern.compile(pattern);
        for (String text : username) {
            Matcher m = p.matcher(text);
            if (m.matches()) {
                System.out.println("This username is valid: " + text);
            } else {
                System.out.println("invalid username: " + text);
            }
        }
    }
}
