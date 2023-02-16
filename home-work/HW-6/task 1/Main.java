package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new SalariedEmployee("Vasya", "1231111234", 3000.33),
                                new ContractEmployee("Kolya", "13423556854", 200, 134.12),
                                new SalariedEmployee("Petro", "3467876544", 3211.44),
                                new ContractEmployee("Sasha", "13423534637", 137, 392.22),};
        System.out.println("~~aw Employees");
        for (Employee employee:employees) {
            System.out.println(employee);

        }
        Arrays.sort(employees);
        System.out.println("~~Sorted Employees");
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }


}