package homeWork8OOP_InterfacesPolymorfizm.homeWork.task1;


import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private final String employeeld;
    private final String name;

    // Constructor
    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    // toString override to use in subclasses
    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                ',';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    // Sorting byWage using Comparator
    public static class ByWage implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2){
            if (employee1 instanceof ContractEmployee && employee2 instanceof  ContractEmployee){
                return (int) (((ContractEmployee) employee1).calculatePay() - ((ContractEmployee) employee2).calculatePay());
            } else if ( employee1 instanceof ContractEmployee && employee2 instanceof SalariedEmployee){
                return (int) (((ContractEmployee) employee1).calculatePay() - ((SalariedEmployee) employee2).calculatePay());
            } else if (employee1 instanceof SalariedEmployee && employee2 instanceof  ContractEmployee){
                return (int) (((SalariedEmployee) employee1).calculatePay() - ((ContractEmployee) employee2).calculatePay());
            } else if (employee1 instanceof SalariedEmployee && employee2 instanceof SalariedEmployee){
                return (int) (((SalariedEmployee) employee1).calculatePay() - ((SalariedEmployee) employee2).calculatePay());
            } else {return 0;}
        }
    }

}

