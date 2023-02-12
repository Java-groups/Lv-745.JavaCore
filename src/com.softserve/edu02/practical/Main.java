package com.softserve.edu02.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee[] array = new Employee[3];

        for (int step = 0; step < array.length; step++) {
            System.out.print("Enter info about " + (step + 1) + " Employee's, each from new line:\nname(String)\nrate(double)\nhours(double):\n");
            array[step] = new Employee(br.readLine(), Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
            Employee.setTotalSum(Employee.getTotalSum() + array[step].getSalary());
        }
        System.out.println("Total Sum: " + Employee.getTotalSum());
    }
}
