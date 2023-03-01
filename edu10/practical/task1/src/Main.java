import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static sun.net.www.protocol.http.AuthenticatorKeys.getKey;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, String> employeeMap = new HashMap<>(7);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        createMap();
        showMap();
        getNameByID();
        getIDByName();
    }

    public static void createMap() {
        employeeMap.put(111, "Alisa");
        employeeMap.put(123, "Orlando");
        employeeMap.put(134, "Angelina");
        employeeMap.put(145, "Katty");
        employeeMap.put(156, "Selena");
        employeeMap.put(167, "Sam");
        employeeMap.put(178, "Mario");
    }

    public static void showMap() {
        System.out.println("Display the map on the screen: ");

        for (var pair : employeeMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static void getNameByID() {
        System.out.println("Enter ID  (example - 123): ");
        int enterKey = scanner.nextInt();
        if (employeeMap.containsKey(enterKey)) {
            System.out.println(employeeMap.get(enterKey));
        } else {
            System.out.println("ID not found.");
        }
    }
    public static void getIDByName() {
        System.out.println("Enter name  (example - Mario Casas): ");
        String enterName = scanner.next();
        if (employeeMap.containsValue(enterName)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(enterName)) {
                    int id2 = entry.getKey();
                    System.out.println("ID: " + id2);
                }
            }
        } else {
            System.out.println("Name not found.");
        }
    }
}