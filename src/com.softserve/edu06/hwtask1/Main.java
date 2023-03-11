package com.softserve.edu06.hwtask1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

          System.out.println(
                  """
                  HW TASK 1
                  Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeID.
                  Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
                  Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
                  Describe the string variable socialSecurityNumber in the class SalariedEmployee .
                  Include a description of federalTaxIDmember in the class of ContractEmployee.
                  """);

        Employee[] employees = {
                new SalariedEmployee("Alex","1","SSN25325", 3500),
                new SalariedEmployee("Bob","2","SSN52336", 1200),
                new SalariedEmployee("Rob","3","SSN14336", 5000),
                new ContractEmployee("Dubbi","4","SSN44372", 10.5, 50),
                new ContractEmployee("Rick","5","SSN94836", 30.5, 20),
                new ContractEmployee("Joe","6","SSN54236", 20.5, 35)};

        System.out.println("Info about Employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println("\nOrdered info about Employees: ");
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }
}
