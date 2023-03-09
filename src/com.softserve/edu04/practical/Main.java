package com.softserve.edu04.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;
        do {
            System.out.print("""
                    ___________________________________________________________
                    Menu of tasks:
                    0.Exit
                    1.practical-task1
                    2.practical-task2
                    ___________________________________________________________
                    Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("""
                PRACTICAL TASK 1
                Create an array of ten integers. Display
                - the biggest of these numbers;
                - the sum of positive numbers in the array;
                - the amount of negative numbers in the array.
                What values there are more: negative or positive?
                """);
                    int[] numbers = new int[10];
                    int biggestNumber = Integer.MIN_VALUE;
                    int sumPositiveNumbers = 0;
                    int amountNegativeNumbers = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = ThreadLocalRandom.current().nextInt(-10, 20);
                        if (numbers[i] > biggestNumber) {
                            biggestNumber = numbers[i];
                        }
                        if (numbers[i] > 0) {
                            sumPositiveNumbers += numbers[i];
                        }
                        if (numbers[i] < 0) {
                            amountNegativeNumbers++;
                        }
                    }
                    System.out.println("array of 10 int numbers:");
                    for (int element : numbers) {
                        System.out.print(element + " ");
                    }
                    System.out.println("\nbiggest number: " + biggestNumber +
                            "\nsum of positive numbers: " + sumPositiveNumbers +
                            "\namount of negative numbers: " + amountNegativeNumbers);
                    System.out.print("amount of negative numbers ");
                    if (amountNegativeNumbers > (numbers.length/2)) {
                        System.out.print(">");
                    } else if (amountNegativeNumbers == (numbers.length/2)) {
                        System.out.print("=");
                    } else {
                        System.out.print("<");
                    }
                    System.out.print(" amount of positive numbers\n\n");
                }
                case 2 -> {
                    System.out.println("""
                 PRACTICAL TASK 2
                 Create a class Employee with fields name, department number, salary.
                 Create five objects of class Employee.
                 Display:
                 - all employees of a certain department (enter department number in the console);
                 - arrange workers by the field salary in descending order.
                 """);

                    Employee [] employees = new Employee[5];
                    employees[0] = new Employee("Rob", 1,450);
                    employees[1] = new Employee("Bob", 2,700);
                    employees[2] = new Employee("Rick", 2,650);
                    employees[3] = new Employee("John", 3,1300);
                    employees[4] = new Employee("Miguel", 3,1000);

                    System.out.println("Enter department number(1,2,3): ");
                    int departmentChoice = Integer.parseInt(br.readLine());
                    if(departmentChoice>0 && departmentChoice <4){
                        for (Employee employee : employees) {
                            if (employee.getDepartmentNumber() == departmentChoice) {
                                System.out.println(employee);
                            }
                        }
                    }else {
                        System.out.println("You entered wrong department number! Try again!");
                    }
                    System.out.println("\nWorkers by the field salary in descending order: ");
                    Employee tmp;
                    for (int i = 0; i < employees.length - 1; i++) {
                        for (int j = i + 1; j < employees.length; j++) {
                            if (employees[i].getSalary() < employees[j].getSalary()) {
                                tmp = employees[i];
                                employees[i] = employees[j];
                                employees[j]= tmp;
                            }
                        }
                    }
                    for (Object employee: employees ) {
                        System.out.println(employee);
                    }
                }
            }
        }while (choice!=0);
    }
}
