package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee arr[] = new Employee[5];
        arr[0] = new Employee("Anna", 2, 20);
        arr[1] = new Employee("Oleksandr", 1, 32);
        arr[2] = new Employee("Iryna", 2, 25);
        arr[3] = new Employee("Oleg", 2, 15);
        arr[4] = new Employee("Roman", 1, 54);

        System.out.println(arr[4].getName());

        System.out.println("Enter number of departament: ");
        int num = Integer.parseInt(br.readLine());

        Employee.searchInDepar(num, arr);
        Employee.arrangeWorkers(arr);
    }
}