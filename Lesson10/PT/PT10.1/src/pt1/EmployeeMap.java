package pt1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Tom");
        employeeMap.put(102, "Erika");
        employeeMap.put(103, "Met");
        employeeMap.put(104, "Dave");
        employeeMap.put(105, "Eva");
        employeeMap.put(106, "Tina");
        employeeMap.put(107, "Mark");

        System.out.println("Employee Map: " + employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an employee ID: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name: " + employeeMap.get(id));
        } else {
            System.out.println("Employee ID not found");
        }

        System.out.print("Enter an employee name: ");
        String name = scanner.next();
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("ID: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Employee name not found");
        }
    }
}
