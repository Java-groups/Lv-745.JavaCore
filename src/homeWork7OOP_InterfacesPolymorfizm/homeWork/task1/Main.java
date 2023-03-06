package homeWork7OOP_InterfacesPolymorfizm.homeWork.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // creating an Employee array
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("1", "ROma",13000, 1));
        employees.add(new ContractEmployee("2", "Bodya",17000, 2));
        employees.add(new SalariedEmployee("3", "Stepan", "1", 150, 95));
        employees.add(new SalariedEmployee("4", "Pavlo", "2", 74, 80));

        /*If next code do not need that delete that code do not leave it there*/
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