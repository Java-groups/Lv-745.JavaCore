package homework.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // creating an Employee array
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("1", "NazzP",15_000, 1));
        employees.add(new ContractEmployee("2", "Orest",12_000, 2));
        employees.add(new SalariedEmployee("3", "Alex", "1", 170, 100));
        employees.add(new SalariedEmployee("4", "Andriy", "2", 56, 120));

        // output origin array
/*        System.out.println("--Origin array--");
        for ( int i = 0; i < employees.size() ; i++) {
            CalcWage(employees.get(i)); // calc the wage    // Wanted to use calcWage but i can output info in ToString
        } */

        System.out.println(employees); // output started array

        // sort array ByWage
        Collections.sort(employees, new Employee.ByWage());

        // output sorted array
        System.out.println("--Sorted array by monthly wage--");
        System.out.println(employees);
    }

    //
/*       public static void CalcWage(Employee employee) { // CalcWage , but i can output info in ToString, so commented it
        System.out.println(employee.toString());
        if (employee instanceof ContractEmployee) {
            System.out.println("Wage -- " +((ContractEmployee) employee).calculatePay());
        } else if (employee instanceof SalariedEmployee) {
            System.out.println("Wage -- " +((SalariedEmployee) employee).calculatePay());
        }
    } */


}
