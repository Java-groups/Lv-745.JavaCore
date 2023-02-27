package practical_task;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        outputMap(createMap());
        findEmployeeName(createMap());
        findEmployeeID(createMap());
    }


    //  Display the map on the screen.
    private static Map<Integer, String> createMap() {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Simon");
        employeeMap.put(2, "Kirill");
        employeeMap.put(3, "Oleh");
        employeeMap.put(4, "NazzP");
        employeeMap.put(5, "Yurii");
        employeeMap.put(6, "Max");
        employeeMap.put(7, "Yurii");
        return employeeMap;
    }

    private static void outputMap(Map<Integer, String> employeeMap) {
        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    private static void findEmployeeName(Map<Integer, String> employeeMap) {

        System.out.print("Enter the persons ID: ");
        int enterID = sc.nextInt();

        if (employeeMap.containsKey(enterID)) {
            System.out.println("Found user: " + employeeMap.get(enterID));
        } else {
            System.out.println("If you can't find this ID - say about it to user");
        }
    }

    private static void findEmployeeID(Map<Integer, String> employeeMap) {

        System.out.print("Enter the persons name: ");
        String enterName = sc.next();

        if (employeeMap.containsValue(enterName)) {
            for (Map.Entry m : employeeMap.entrySet()) {
                if (m.getValue().equals(enterName)) {
                    System.out.println("Found persons ID: " + m.getKey());
                }
            }
        } else {
            System.out.println("If you can't find this name - say about it to user");
        }
    }
}
