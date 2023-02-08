package homework.task1;

import homework.task1.Employee;
import homework.task1.Payment;

public class SalariedEmployee extends Employee implements Payment {

    private final int workedHours;
    private final double hourlyRate;

    @Override
    public double calculatePay() {
        return hourlyRate * workedHours;
    }

    @Override
    public String toString() {
        return super.toString() + " Wage -- " + calculatePay() + "}\n" ;
    }

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, int workedHours, double hourlyRate) {
        super(employeeld, name);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }
}
