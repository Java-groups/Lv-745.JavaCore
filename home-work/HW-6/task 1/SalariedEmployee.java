package task1;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee implements Payment{
    //Fixed paid worker

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;


    public SalariedEmployee(String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.setSalary(calculatePay());
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String toString() {
        return "SalariedEmployee [ EmployeID = " + this.getEmployeeId() + " | Name = " + this.getName() + " | Salary = " + this.getSalary() + " ]";
    }

}
