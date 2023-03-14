package com.softserve.edu09.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(
                """
                PRACTICAL TASK
                In the main() method declare map employeeMap of pairs <Integer, String>.
                Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
                Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
                Ask user to enter name, verify than you have name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()).""");

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "alex");
        employeeMap.put(2, "bob");
        employeeMap.put(3, "rob");
        employeeMap.put(4, "tor");
        employeeMap.put(5, "loki");
        employeeMap.put(6, "rex");
        employeeMap.put(7, "oleg");


        System.out.println("Employee Map:" + "\n" + employeeMap);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter ID to find out employee name: ");
        int ID = Integer.parseInt(br.readLine());
        if (employeeMap.containsKey(ID)) {
            System.out.println("employee's name with ID(" + ID + "): " + employeeMap.get(ID));
        } else {
            System.out.println("NO employee with ID(" + ID +")!") ;
        }


        System.out.print("\nEnter employee's name to find out ID: ");
        String name = br.readLine().toLowerCase();
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("employee ID: " +  entry.getKey() + " Name: " + entry.getValue());
                }
            }
        } else {
            System.out.println("NO employee called " + name);
        }

    }
}

