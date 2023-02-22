import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Task 1. Declare and initialize the employeeMap---------");
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Anna");
        employeeMap.put(2, "Vasya");
        employeeMap.put(3, "Kolya");
        employeeMap.put(4, "Pavel");
        employeeMap.put(5, "Andrii");
        employeeMap.put(6, "Roman");
        employeeMap.put(7, "Yurii");

        System.out.println("-------Task 2.  Display the employeeMap on the screen---------");
        System.out.println("Employee Map:");
        System.out.println(employeeMap);

        System.out.println("-------Task 3. Ask user to enter ID and find corresponding name---------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.println("Name: " + name);
        } else {
            System.out.println("Could not find an employee with ID " + id);
        }

        System.out.println("-------Task 3. Ask user to enter name and find corresponding ID---------");
        System.out.print("Enter a name: ");
        String name = scanner.next();
        if (employeeMap.containsValue(name)) {
            int matchingId = -1;
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    matchingId = entry.getKey();
                    break;
                }
            }
            System.out.println("ID: " + matchingId);
        } else {
            System.out.println("Could not find an employee with name " + name);
        }
    }
}
