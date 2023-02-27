import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Surnames and initials: " + surname + " " + name.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println("Name: " + name);
        System.out.println("Name, middle name and last name: " + name + " " + middleName + " " + surname);
    }
}