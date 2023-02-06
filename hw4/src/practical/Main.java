package practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------FIRST TASK----------");
        int [] numbers = new int[10];
        int maxNumber = Integer.MIN_VALUE;
        int sumPositive = 0, amountNegative = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer number "+i+":");
            numbers[i-1] = Integer.parseInt(br.readLine());
            if (numbers[i-1]>maxNumber) {maxNumber = numbers[i-1];}
            if (numbers[i-1]>0) {sumPositive += numbers[i-1];}
            if (numbers[i-1]<0) {amountNegative++;}
        }
        System.out.println("             Max number: " + maxNumber);
        System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("        Amount negative: " + amountNegative);
        if (amountNegative>5){
            System.out.println("Negative numbers > positive.");
        } else if (amountNegative == 5){
            System.out.println("Negative numbers = positive.");
        } else {
            System.out.println("Positive numbers > negative.");
        }
        System.out.println("\n\n");
        System.out.println("--------SECOND TASK----------");

        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Alex", 1,35000);
        employees[1] = new Employee("John", 1,45000);
        employees[2] = new Employee("Diana", 2,40000);
        employees[3] = new Employee("Rachel", 2,41000);
        employees[4] = new Employee("Michel", 3,39000);
        int selector = -1;
        while (selector !=0) {
            System.out.println("SELECT MENU ITEM");
            System.out.println("1 - 3 department numbers");
            System.out.println("0 - exit");
            selector = Integer.parseInt(br.readLine());
            if (selector>0 && selector <=3){
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i].getDepartmentNumber() == selector){
                        System.out.println(employees[i].print());
                    }
                }
            }
        }
        System.out.println("--------SORT ARRAY----------");
        Employee tempEmployee;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tempEmployee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tempEmployee;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].print());
        }
    }
}